package ru.netology.radioman;

public class Radio {
    private String radioName;
    private int station;
    private int stationsQuantity = 9;
    private int volume;

    /* Конструкторы
     * --------------------------------------------------- */

    public Radio() {
        setStationsQuantity(10);
    }

//    public Radio(int volume) {
//        if (volume > 100) {
//            return;
//        } else if (volume < 0) {
//            return;
//        }
//        this.volume = volume;
//    }

//    public Radio(int stationsQuantity) {
//        setStationsQuantity(stationsQuantity);
//    }

    public Radio(String radioName, int station) {
        this.radioName = radioName;
        setStationsQuantity(station);
    }

    /* Установка параметров
     * --------------------------------------------------- */

    public void setStationsQuantity(int stationsQuantity) {
        if (stationsQuantity < 0) {
            return;
        }
        this.stationsQuantity = stationsQuantity;
    }
//------метод позволяющий выбрать любую станцию в произвольном порядке ---
    public void setStation(int station) {
        if (station > stationsQuantity) {
            return;
        }
        if (station < 0) {
            return;
        }
        this.station = station;
    }

    public void setVolume(int volume) {
        if (volume > 100) {
            return;
        } else if (volume < 0) {
            return;
        }
        this.volume = volume;
    }

    /* Оперирование станциями
     * --------------------------------------------------- */

    public void switchStationUp() {
        if (station == stationsQuantity) {
            station = 0;
            return;
        }
        station++;
    }

    public void switchStationDown() {
        if (station == 0) {
            station = stationsQuantity;
            return;
        }
        station--;
    }

    /* Регулировка громкости
     * --------------------------------------------------- */

    public void increaseVolume() {
        if (volume == 100) {
            return;
        }
        setVolume(++volume);
    }

    public void decreaseVolume() {
        if (volume == 0) {
            return;
        }
        setVolume(--volume);
    }

    /* Getters
     * --------------------------------------------------- */

    public int getVolume() {
        return volume;
    }

    public int getStation() {
        return station;
    }

    public int getStationsQuantity() {
        return stationsQuantity;
    }
}