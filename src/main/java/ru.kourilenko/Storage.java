package ru.kourilenko;

public class Storage {
    public final static int MAX_CLOTHES = Hall.TOTAL_RAILS * Rail.TOTAL_CLOTHES;
    ClothesItem[] storage;

    public Storage() {
        storage = new ClothesItem[MAX_CLOTHES];
    }
}
