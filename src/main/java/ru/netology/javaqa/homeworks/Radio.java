package ru.netology.javaqa.homeworks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class Radio {
    private int numberOfStations;
    private int currentStation;
    private int currentVolume;

    public Radio(int numberOfStations) {
            this.numberOfStations = numberOfStations;
    }

    public Radio() {
        this.numberOfStations = 10;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        int maxStation = numberOfStations - 1;
        if (newCurrentStation < 0) {
            newCurrentStation = maxStation;
        }
        if (newCurrentStation > maxStation) {
            newCurrentStation = 0;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        int maxStation = numberOfStations - 1;
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }

    }

    public void prevStation() {
        int maxStation = numberOfStations - 1;
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

}
