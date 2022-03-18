package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldSetQuantityStation() {
        Radio radio = new Radio(30);
        assertEquals(30, radio.getStationsQuantity());

    }

    @Test
    public void shouldSetQuantityStationDefault() {
        Radio radio = new Radio();
        assertEquals(10, radio.getStationsQuantity());

    }

    //Номер текущей радиостанции изменяется в пределах от 0 до количества радиостанций, указанных при создании (см. п.1)
//    Клиент должен иметь возможность выставлять номер радиостанции с цифрового пульта (вводя числа 0 - количество станций)
    @Test
    void shouldSetCurrentStationWithCustomQuantity() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(30);
        assertEquals(30, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationWithCustomQuantityOver() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(60);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationWithCustomQuantity2() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(48);
        assertEquals(48, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationWithCustomQuantityBelow() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetNextStationWithCustomQuantity() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(23);
        radio.increaseStation();

        assertEquals(24, radio.getCurrentStation());
    }

    @Test
    void shouldSetNextStationWithCustomQuantityOverMax() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(49);
        radio.increaseStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetPrevStationWithCustomQuantity() {
        Radio radio = new Radio(40);
        radio.setCurrentStation(24);
        radio.prevStation();

        assertEquals(23, radio.getCurrentStation());
    }

    @Test
    void shouldSetPrevStationWithCustomQuantityBelowMin() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(0);
        radio.prevStation();

        assertEquals(29, radio.getCurrentStation());
    }

    @Test
    void shouldSetPrevStationWithDefaultQuantity() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();

        assertEquals(9, radio.getCurrentStation());
    }


    @Test
    void shouldSetNextStationWithDefaultQuantity() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void volumeIncrease() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.increaseVolume();

        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void volumeIncreaseMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void volumeOverMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void volumeLower() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.prevVolume();

        assertEquals(98, radio.getCurrentVolume());
    }

    @Test
    public void volumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.prevVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void currentVolumeOverMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        radio.increaseVolume();

        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void currentVolumeOverMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        radio.increaseVolume();

        assertEquals(1, radio.getCurrentVolume());
    }

}