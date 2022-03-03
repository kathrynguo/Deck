import java.util.ArrayList; 

public class Deck {
	ArrayList deckUS = new ArrayList(); //unshuffled
	ArrayList deckS = new ArrayList();  //shuffled
	
	ArrayList<String> r = new ArrayList<String>(); 
	ArrayList<String> s = new ArrayList<String>(); 
	ArrayList<Integer> pv = new ArrayList<Integer>(); 
	
	private int size = deckS.size(); //size instance variable that shows the number of cards to be dealt
	
	//constructing deck 
	public Deck(String[] ranks, String[] suits, int[] pointValues) {
		
		//adding inputs into arraylists 
		//need to be mutable; don't know how many ranks/suits/pv you're using
		for (int i = 0; i < ranks.length; i++) {
			r.add(ranks[i]); 
		}
		
		for (int j = 0; j < suits.length; j++) {
			s.add(suits[j]); 
		}
		
		for (int k = 0; k < pointValues.length; k++) {
			pv.add(pointValues[k]); 
		}
		
		//making cards (for each combination of rank/suits/pv
		//need n^2 combinations (point value corresponds with rank), double nested for loop
		
		
		
		for (int x = 0; x < ranks.length; x++) { //for each rank (and corresponding pv) 
			
			for (int y = 0; y < suits.length; y++) { //then for each suit
				
				//arrayList for card
				//make this part in a new class 
				//ArrayList card = new ArrayList(); 
				
				Card card = new Card(r.get(x), pv.get(x), s.get(y)); 
				
				//making an individual card
				//card.add(r.get(x)); 
				//card.add(s.get(y)); 
				//card.add(pv.get(x)); 
				
				//adding the card to the deck 
				deckUS.add(card); 
				
				//empty the card ArrayList after adding it to the deck 
				//card.remove(0); 
				//card.remove(0); 
				//card.remove(0); //all 0 bc of framshift after remove
				
			} //close inner forloop
			
		} //close outer forloop 
		
		//print statement
		System.out.println(deckUS); 
		
		//couldn't figure out how to use .clone()
		//setting shuffled deck to unshuffled deck initially  
		for (int g = 0; g < deckUS.size(); g++) {
			deckS.add(deckUS.get(g).toString()); 
		}
	
		
	} //close constructor

	
	/*returns true if the size of the deck is 0; returns false otherwise*/
	public boolean isEmpty() { 
		
		if (deckUS.size() != 0) {
			return false; 
		}
		else {
			return true; 
		}
	} //closes isEmpty
  
	//method to shuffle by alternation
	 
	public void shuffleA() {
		
		ArrayList a = new ArrayList(deckS.subList(0, deckS.size()/2)); //sub AL for first half of deck
		ArrayList b = new ArrayList(deckS.subList(deckS.size()/2, deckS.size())); //sub AL for second half of deck; 
		//using shuffled deck bc you want the shuffling to compound 
		
		/*
		//random int for how many times you will shuffle 
		//int r = (int)Math.random()*10 + 1; 
		* 
		* wanted to shuffle multiple times
		* this loop will actually occur in the driver class
		
		for (int p = 0; p <= r; p++) {
			
		}
		* 
		* */
		
		//clear the shuffled deck so we can populate it again with an even more shuffled deck 
		deckS.clear(); 
		
		//add to the shuffled deck in alteration 
		int q = 0; 
    
		for (int f = 0; f < a.size(); f++) { 
			deckS.add(b.get(q)); 
			deckS.add(a.get(q)); 
			q++; 
		}
		
	
		
		System.out.println(deckS); 
	}
	
	
	//need to use deckS (shuffled deck) 
	//want to deal from shuffled deck 
	public String deal() {
		
		//string to return 
		String s; 
		
		//starting from top of deck 
		//minus one bc of indez
		s = deckS.get(size-1).toString();
		
		//decrement size instance variable
		size = size - 1;; 
		
		return s;
		
	}//closes deal 
	
	public int size(){
		return size; 
	}

}

