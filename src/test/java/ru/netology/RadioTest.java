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
        radio.setCurrentChannel(5);
        radio.setCurrentChannel(11);
        int expected = 5;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChannelBelow0() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        radio.setCurrentChannel(-11);
        int expected = 5;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldChangeNextChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        radio.next();
        int expected = 6;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextChannelFrom9To0() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangePrevChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(7);
        radio.prev();
        int expected = 6;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevChannelFrom0To9() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(70);
        int actual = radio.getCurrentVolume();
        int expected = 70;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(70);
        radio.setCurrentVolume(-70);
        int actual = radio.getCurrentVolume();
        int expected = 70;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeOver100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(70);
        radio.setCurrentVolume(110);
        int actual = radio.getCurrentVolume();
        int expected = 70;
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
    public void shouldNotIncreaseVolumeOver100() {
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
    public void shouldNotDecreaseVolumeBefore0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetChannelAmount() {
        Radio radio = new Radio(20);
        radio.setCurrentChannel(11);
        int expected = 11;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNext() {
        Radio radio = new Radio(20);
        radio.setCurrentChannel(19);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrev() {
        Radio radio = new Radio(20);
        radio.setCurrentChannel(0);
        radio.prev();

        int expected = 19;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

}



