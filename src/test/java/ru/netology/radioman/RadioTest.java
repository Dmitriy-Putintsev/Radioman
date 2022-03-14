package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    /* Установка количества радиостанций */

    @Test
    void shouldSpecifyStationQuantityPositive() {
        Radio radio = new Radio();
        radio.setStationsQuantity(1);
        assertEquals(1, radio.getStationsQuantity());
    }

    @Test
    void shouldSpecifyStationQuantityNegative() {
        Radio radio = new Radio();
        radio.setStationsQuantity(10);
        assertEquals(10, radio.getStationsQuantity());
    }

    @Test
    void shouldSpecifyStationQuantityNegative2() {
        Radio radio = new Radio();
        radio.setStationsQuantity(-1);
        assertEquals(10, radio.getStationsQuantity());
    }

    /* Установка номера радиостанции при количестве радиостанций по умолчанию */

    @Test
    void shouldSpecifyStationWithDefaultQuantityPositive() {
        Radio radio = new Radio();
        int expected = 10;
        int actual = radio.getStationsQuantity();
        assertEquals(expected,actual);
    }

    @Test
    void shouldSpecifyStationWithDefaultQuantityNegative() {
        radio.setStation(11);
        assertEquals(0, radio.getStation());
    }

    @Test
    void shouldSpecifyStationWithDefaultQuantityNegative2() {
        radio.setStation(-1);
        assertEquals(0, radio.getStation());
    }

    /* Установка номера радиостанции при собственном количестве радиостанций */

    @Test
    void shouldSpecifyStationWithCustomQuantityPositive() {
        Radio radio = new Radio("radio",120);
        radio.setStationsQuantity(60);
        radio.setStation(30);
        assertEquals(30, radio.getStation());
    }

    @Test
    void shouldSpecifyStationWithCustomQuantityNegative() {
        Radio radio = new Radio("radio",120);
        radio.setStationsQuantity(60);
        radio.setStation(61);
        assertEquals(0, radio.getStation());
    }

    @Test
    void shouldSpecifyStationWithCustomQuantityNegative2() {
        Radio radio = new Radio("radio",120);
        radio.setStationsQuantity(60);
        radio.setStation(-1);
        assertEquals(0, radio.getStation());
    }

    /* Переключение радиостанций */

    @Test
    void shouldSwitchStationUpToRoundDefault() {
        Radio radio = new Radio("ThroughMax", 9);
        radio.switchStationUp(); // 9~0
        radio.switchStationUp(); // 0~1
        assertEquals(2, radio.getStation());
    }

    @Test
    void shouldSwitchStationDownToRoundDefault() {
        Radio radio = new Radio("ThroughMin", 1);
        radio.switchStationDown(); // 1~0
        radio.switchStationDown(); // 0~9
        assertEquals(0, radio.getStation());
    }

    /* Регулировка громкости */

    @Test
    void shouldIncreaseVolumeToThreshold() {
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.increaseVolume(); // 99~100
        radio.increaseVolume(); // 100~100
        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolumeToThreshold() {
        Radio radio = new Radio();
        radio.decreaseVolume(); // 1~0
        radio.decreaseVolume(); // 0~0
        assertEquals(0, radio.getVolume());
    }

    /* Тесты для полного покрытия */

    @Test
    void shouldSetVolumeNegative() {
        Radio radio = new Radio();
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldSetVolumeNegative2() {
        Radio radio = new Radio();
        assertEquals(0, radio.getVolume());
    }

}