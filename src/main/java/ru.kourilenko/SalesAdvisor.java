package ru.kourilenko;

public class SalesAdvisor {

    public void move(Hall hall, Storage storage) {
        for (int i = 0; i < hall.rails.length; i++) {
            for (int j = 0; j < hall.rails[i].clothesItems.length; j++) {
                Rail currentRail = hall.rails[i];
                int free = 0;
                if (currentRail.clothesItems[j] != null) {
                   storage.storage[free] = currentRail.clothesItems[j];

                }
                free ++;
            }
        }
        for (Rail rail : hall.rails) {
        }


    }

}
