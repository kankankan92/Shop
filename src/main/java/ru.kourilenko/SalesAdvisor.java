package ru.kourilenko;

public class SalesAdvisor {

    public void move(Hall hall, Storage storage) {
        for (int i = 0; i < hall.rails.length; i++) {
            Rail currentRail = hall.rails[i];
            for (int j = 0; j < currentRail.clothesItems.length; j++) {
                if (currentRail.clothesItems[j] != null) {
                    storage.put(currentRail.clothesItems[j]);
                    currentRail.clothesItems[j] = null;
                }
            }
        }
//Реализация метода с использованием цикла в стиле for each
        /*for (Rail rail : hall.rails) {
            for (int j = 0; j < rail.clothesItems.length; j++) {
                if (rail.clothesItems[j] != null) {
                    storage.put(rail.clothesItems[j]);
                    rail.clothesItems[j]=null;
                }
            }
        }*/
    }
}
