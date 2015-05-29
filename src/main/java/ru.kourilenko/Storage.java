package ru.kourilenko;
public class Storage {
    public final static int MAX_CLOTHES = Hall.TOTAL_RAILS*Rail.TOTAL_CLOTHES;
    Storage[] storage;

    public Storage(){
        storage = new Storage[MAX_CLOTHES];
    }
}
