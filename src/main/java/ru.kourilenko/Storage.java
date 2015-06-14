package ru.kourilenko;

public class Storage {
    private int MAX_CLOTHES = Hall.TOTAL_RAILS * Rail.TOTAL_CLOTHES;
    private ClothesItem[] clothesItems;
    private int free = 0;

    public Storage() {
        clothesItems = new ClothesItem[MAX_CLOTHES];
    }

    public void put(ClothesItem clothesItem) {
        if (free==MAX_CLOTHES){
            MAX_CLOTHES = MAX_CLOTHES+10;
            ClothesItem[] newClothesItems = new ClothesItem[MAX_CLOTHES];
            System.arraycopy(clothesItems, 0, newClothesItems, 0, clothesItems.length);
            clothesItems = newClothesItems;
        }
        clothesItems[free] = clothesItem;
        free++;
    }

    public boolean isEmpty(){
        return free == 0;
    }
}
