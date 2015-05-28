package ru.kourilenko;

public class Hall {
    private final static int TOTAL_RAILS = 50;
    Rail[] rails = new Rail[TOTAL_RAILS];
    public Hall(){
        for (int i = 0; i<rails.length; i++){
            rails[i]=new Rail();

        }
    }

}
