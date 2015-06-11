package ru.kourilenko;

public class Hall {
    public final static int TOTAL_RAILS = 50;
    Rail[] rails = new Rail[TOTAL_RAILS];

    public Hall() {
        for (int i = 0; i < rails.length; i++) {
            rails[i] = new Rail();
        }
    }

    public boolean isEmpty() {
        for (Rail rail : rails) {
            for (ClothesItem clothesItem : rail.clothesItems) {
                if (clothesItem != null) {
                    return false;
                }
            }
        }
        return true;
    }
}
