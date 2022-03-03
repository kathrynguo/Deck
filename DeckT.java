public class DeckT {
  
  public static void main(String[] args) {
    //print welcome to the card game suite
    //prompt for a choice
    //if choice 1, for example call euchre

		String[] r = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack",     "Queen", "King"}; 
		String[] s = {"Hearts", "Spades", "Diamonds", "Clubs"}; 
		int[] pv = {14, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}; 
		
		Deck d1 = new Deck(r, s, pv);
		
		//alternation shuffle a random amount of times
		int t = (int)(Math.random()*150)+50; 
		
		for (int x = 0; x <= t; x++){
		d1.shuffleA(); 

    }
}

	/*
  public void euchre() {
    //copy run code for the euchre game into here, 
    //Make sure your code:
    //  contains the three arrays
    //  calls on the deck class constructor and passes the arrays to the Deck Class
    
  }

  public void twentyone() {
    //another possible game, might need a more complete deck
    
  }

  public void oldMaid() {
    //be creative with your other class - new suits and ranks
    
  }*/
  
}

