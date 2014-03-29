package org.leanpoker.player;

/**
 * Created by fulop on 2014.03.29..
 */
public class Card {

    private String rank;


    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRankInt() {
        if (rank.equals("J")) {
            return 11;
        } else if (rank.equals("Q")) {
            return 12;
        } else if (rank.equals("K")) {
            return (13);
        } else if (rank.equals("A")) {
            return 14;
        } else {
            int ret = 0;
            try {
                ret =
                        Integer.parseInt(rank);
            } catch (Exception e) {
                return 0;
            } finally {
                return ret;
            }
        }

    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (rank != null ? !rank.equals(card.rank) : card.rank != null) return false;
        if (suit != null ? !suit.equals(card.suit) : card.suit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rank != null ? rank.hashCode() : 0;
        result = 31 * result + (suit != null ? suit.hashCode() : 0);
        return result;
    }
}
