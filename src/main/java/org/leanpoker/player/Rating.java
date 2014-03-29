package org.leanpoker.player;

/**
 * Created by fulop on 2014.03.29..
 */
public class Rating {
    float fullToDeskRatio;
    float holeToDeskRatio;

    public Rating(float fullToDeskRatio, float holeToDeskRatio) {
        this.fullToDeskRatio = fullToDeskRatio;
        this.holeToDeskRatio = holeToDeskRatio;
    }

    public float getFullToDeskRatio() {
        return fullToDeskRatio;
    }


    public float getHoleToDeskRatio() {
        return holeToDeskRatio;
    }

}
