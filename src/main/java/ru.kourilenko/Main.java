package ru.kourilenko;

public class Main {
    public static void main(String[] args) {
        Hall hm = new Hall();
        Storage storage = new Storage();
        SalesAdvisor nastia = new SalesAdvisor();
        System.out.println("Начальное состояние зала и склада:");
        if ( hm.isEmpty()) {
            System.out.println("Зал пуст");
        } else {
            System.out.println("Зал не пуст");
        }

        System.out.println(  "Склад " +(storage.isEmpty()? "пуст" : "не пуст") );


        nastia.move(hm, storage);

        System.out.println("Новое состояние зала и склада:");
        if ( hm.isEmpty()) {
            System.out.println("Зал пуст");
        } else {
            System.out.println("Зал не пуст");
        }

        System.out.println(  "Склад " +(storage.isEmpty()? "пуст" : "не пуст") );

   }
}


