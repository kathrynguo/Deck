public class DeckT {

	public static void main (String[] args) {
	
		String[] r = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; 
		String[] s = {"Hearts", "Spades", "Diamonds", "Clubs"}; 
		int[] pv = {14, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}; 
		
		Deck d1 = new Deck(r, s, pv);
		
		//alternation shuffle a random amount of times
		int t = (int)(Math.random()*10)+1; 
		
		for (int x = 0; x <= t; x++){
		d1.shuffleA(); 
		}
	}
}
