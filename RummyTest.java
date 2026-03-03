public class RummyTest {
	public static void main(String args[]) {
		// create new deck, outputs String array
		String[] deck = Rummy.buildDeck();
		// shuffles deck with input String[] deck
		Rummy.shuffleDeck(deck);
		// deals hand of 10 cards, input String[] deck, outputs String[] hand
		String[] hand = Rummy.dealHand(deck);
		// deals card from deck input String deck, output String card
		String dealtCard = Rummy.dealCard(deck);
		// sorts hand
		System.out.println("Dealt Card: " + dealtCard);
		Rummy.sortHand(hand);
		//returns card index from hand or deck input
		int index = Rummy.index(hand, dealtCard);
		// redraws a card
		Rummy.redraw(hand, deck, index);
		// returns card suit input String card, output char suit
		char suit = Rummy.cardSuit(dealtCard);
		// Returns card numerical value int cardNum from input card
		int cardNum = Rummy.cardNum(dealtCard);
		boolean isSet = Rummy.isSet(hand);
		boolean isRun = Rummy.isRun(hand);
		String testStr = deck[0] + " = First deck card \n " + hand[0] + " = Player's first card from hand \n" + index + " = card index from dealt hand";
		System.out.print(testStr);
		//buildDeck, shuffleDeck, dealHand, dealCard, sortHand, redraw, cardSuit, cardNum, index, isSet and isRun		
	}
}