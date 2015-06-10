package ru.kourilenko;

public class Main {
    public static void main(String[] args) {
        Hall HM = new Hall();
        Storage storage = new Storage();
        SalesAdvisor Nastia = new SalesAdvisor();
        Nastia.move(HM, storage);
    }
}


