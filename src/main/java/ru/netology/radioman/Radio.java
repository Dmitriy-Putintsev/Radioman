package ru.netology.radioman;

public class Radio {
    private int currentStation;
    private int volume;
    private int volumeMax = 100;
    private int volumeMin = 0;
    private int stationsQuantity = 10;


    //конструкторы по умолчанию и с количеством радиостанций
    public Radio() {
    }


    public Radio(int stationsQuantity) {
        this.stationsQuantity = stationsQuantity;
    }


    public void setCurrentStation(int currentStation) {
        if (currentStation > (stationsQuantity - 1)) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getStationsQuantity() {
        return stationsQuantity;
    }

    public void increaseStation() {

        if (currentStation == (stationsQuantity - 1)) {
            setCurrentStation(0);
            return;
        }
        setCurrentStation(++currentStation);

    }

    public void prevStation() {

        if (currentStation == 0) {
            setCurrentStation(stationsQuantity - 1);
            return;
        }
        setCurrentStation(--currentStation);

    }

    public int getCurrentVolume() {
        return volume;
    }

    public void setCurrentVolume(int volume) {
        if (volume > volumeMax) {
            return;
        }
        if (volume < volumeMin) {
            return;
        }
        this.volume = volume;
    }

    public void increaseVolume() {
        if (volume < volumeMax) {
            volume = volume + 1;
        }
    }

    public void prevVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
