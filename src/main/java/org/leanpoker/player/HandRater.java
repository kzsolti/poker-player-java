package org.leanpoker.player;

/**
 * Created by fulop on 2014.03.29..
 */
public abstract class HandRater {
     public abstract float rate(Hand hand);
    public static int HIGH_CARD = 100;
    public static int ONE_PAIR = 200;
    public static int TWO_PAIRS = 300;
    public static int THREE_OF_A_KIND = 400;
    public static int STRAIGHT = 500;
    public static int FLUSH = 600;
    public static int FULL_HOUSE = 700;
    public static int FOUR_OF_A_KIND = 800;
    public static int STRAIGHT_FLUSH = 900;
    public static int ROYAL_FLUSH = 1000;
}
