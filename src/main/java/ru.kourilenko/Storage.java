package ru.kourilenko;

public class Storage {
    public final static int MAX_CLOTHES = Hall.TOTAL_RAILS * Rail.TOTAL_CLOTHES;
    private ClothesItem[] clothesItems;
    private int free = 0;

    public Storage() {
        clothesItems = new ClothesItem[MAX_CLOTHES];
    }

    public void put(ClothesItem clothesItem) {
        clothesItems[free] = clothesItem;
        free++;
    }

    public boolean isEmpty(){
        return free == 0;
    }
}
