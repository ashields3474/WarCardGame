
public class Card{

    enum Suit{
        diamond,
        club,
        heart,
        spade
    }

    enum Rank {
        ace,
        two,
        three,
        four,
        five,
        six,
        seven,
        eight,
        nine,
        ten,
        jack,
        queen,
        king
    }

    private Suit cardSuit;
    private Rank cardRank;


    public Card( Suit suit, Rank rank ) {
        cardSuit = suit;
        cardRank = rank;
    }

    public Rank getCardRank() {
        return cardRank;
    }

    public Suit getCardSuit() {
        return cardSuit;
    }

    public void setCardRank(Rank cardRank) {
        this.cardRank = cardRank;
    }

    public void setCardSuit(Suit cardSuit) {
        this.cardSuit = cardSuit;
    }
}
