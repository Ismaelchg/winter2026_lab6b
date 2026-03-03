import java.util.Random;

public class CardGame {
	public static void main(String[] args) {

	}
	// build a deck with 4 copies of each number 1 to 10 with respective suits
	public static Card[] buildDeck(){
		final int DECK_SIZE = 40; 
		Card[] deck = new Card[DECK_SIZE];
		String[] suits = {"C", "D", "H", "S"}; 
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		
		for(int i = 0; i < numbers.length; i++){
			for(int j = 0; j < suits.length; j++){
				deck[i * 4 + j] = new Card(numbers[i], suits[j]); 
			}
		}
		return deck; 
	}
	public static void print(Card[] arr){
		for(int i = 0; i < arr.length; i++){
			if(i == arr.length - 1){
				System.out.println(arr[i]); 
			}
			else{
				System.out.print(arr[i] + ", "); 
			}
		}
	}
		// shuffle the deck using Random
	public static void shuffleDeck(Card[] deck){
		Random rand = new Random(); 
		for(int i = 0; i < deck.length; i++){
			int swapIndex = rand.nextInt(deck.length); 
			Card temp = deck[i]; 
			deck[i] = deck[swapIndex]; 
			deck[swapIndex] = temp; 
		}
	}
		// Deal a single card from deck by replacing the slot with "0"
	public static Card dealCard(Card[] deck){
		for(int i = 0; i < deck.length; i++){
			if(deck[i] != null){
				Card card = deck[i]; 
				deck[i] = null;
				return card; 
			}
		}   
		return null;	 // if deck is empty and can't deal any more cards
	}
		// deal a hand of 10 cards
	public static Card[] dealHand(Card[] cardArray){
		final int HAND_SIZE = 10; 
		Card[] hand = new Card[HAND_SIZE]; 

		for(int i = 0; i < hand.length; i++){
			hand[i] = dealCard(cardArray); 
		}

		return hand; 
	}
		// sort hand according to the number on the card, then by suit in alphabetical order
	public static void sortHand(Card[] hand){
		for(int i = 0; i < hand.length - 1; i++){
			for(int j = 0; j < hand.length - 1; j++){
				boolean shouldSwap = false; 
				int num1 = hand[j].getRank(); 
				int num2 = hand[j+1].getRank();
				
				if(num1 > num2){
					shouldSwap = true; 
				}
				else if(num1 == num2){
					String suit1 = hand[j].getSuit(); 
					String suit2 = hand[j+1].getSuit(); 
					if(suit1 > suit2){
						shouldSwap = true; 
					}
				}

				if(shouldSwap){
					Card temp = hand[j]; 
					hand[j] = hand[j+1]; 
					hand[j+1] = temp; 
				}
			}
		}
	}

}
