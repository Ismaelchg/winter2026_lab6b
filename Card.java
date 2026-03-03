public class Card {
	private int rank;
	private char suit;

	public Card(int rank, char suit) {
		this.rank = rank;
		this.suit = suit;
	}
	public int getRank() {
		return this.rank;
	}
	public char getSuit() {
		return this.suit;
	}
	public String toString() {
		return this.rank + this.suit;
	}
}
