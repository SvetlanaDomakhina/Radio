package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        int expected = 5;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChannelAfter9() {
        Radio radio = new Radio();
        radio.setCurrentChannel(11);
        int expected = 0;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeNextChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.nextChannel();
        int expected = 1;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextChannelLastOneToTheFirstOne() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.nextChannel();
        int expected = 0;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangePrevChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(7);
        radio.prevChannel();
        int expected = 6;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevChannelFirstOneToTheLastOne() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.prevChannel();
        int expected = 9;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(70);
        radio.increaseVolume();
        int expected = 71;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeAfter100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(70);
        radio.decreaseVolume();
        int expected = 69;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeAfter0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
