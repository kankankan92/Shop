package ru.kourilenko;

public class Rail {
    private final static int TOTAL_CLOTHES = 50;
    ClothesItem [] clothesItems = new ClothesItem[TOTAL_CLOTHES];
    public Rail(){
        for (int i =0; i<clothesItems.length; i++){
            if (Math.random()<0.5) {
                clothesItems[i] = new ClothesItem();
            }
        }
    }
}
