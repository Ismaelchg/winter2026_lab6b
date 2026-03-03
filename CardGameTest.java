class CardGameTest {
	public static void main(String[] args) {
		Card[] deck = CardGame.buildDeck();
		CardGame.print(deck );
		CardGame.shuffleDeck(deck);
		CardGame.print(deck);
		Card dealtCard = CardGame.dealCard(deck);
		System.out.println("Dealt card: " + dealtCard);
		Card[] hand = CardGame.dealHand(deck);
		System.out.print("Dealt hand: ");
		CardGame.sortHand(hand);
		CardGame.print(hand);
	}
}
