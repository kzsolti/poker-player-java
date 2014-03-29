package org.leanpoker.player;

/**
 * Created by fulop on 2014.03.29..
 */
public class Rating {
    float handToDeskRatio;
    float holeToDeskRatio;

    public Rating(float handToDeskRatio, float holeToDeskRatio) {
        this.handToDeskRatio = handToDeskRatio;
        this.holeToDeskRatio = holeToDeskRatio;
    }

    public float getHandToDeskRatio() {
        return handToDeskRatio;
    }


    public float getHoleToDeskRatio() {
        return holeToDeskRatio;
    }

}
