package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    public void shouldInitFields() {
        Radio wave = new Radio();

        Assertions.assertEquals(10, wave.getAmountRadioStation());
        Assertions.assertEquals(0, wave.getMinVolume());
        Assertions.assertEquals(100, wave.getMaxVolume());
    }

    @Test
    public void settingNumberRadioStation() {
        Radio wave = new Radio(26);

        Assertions.assertEquals(26, wave.getAmountRadioStation());
    }

    @Test
    public void callRadioStationNumber15() {
        Radio wave = new Radio (20);

        wave.setRadioStationNumber(15);

        Assertions.assertEquals(15, wave.radioStationNumber);
    }

    @Test
    public void shouldSetRadioStationNumber() {
        Radio wave = new Radio();

        wave.setRadioStationNumber(7);

        int expected = 7;
        int actual = wave.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void whenEnteringNegativeMustTurnOnTheZeroRadioStationNumber() {
        Radio wave = new Radio();

        wave.setRadioStationNumber(-12);

        int expected = 0;
        int actual = wave.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void whenEnteringMoreTheRangeMustTurnOnTheZeroRadioStationNumber() {
        Radio wave = new Radio();

        wave.setRadioStationNumber(15);

        int expected = 0;
        int actual = wave.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeToTheNextRadioStation() {
        Radio wave = new Radio();

        wave.setRadioStationNumber(7);
        wave.next();

        int expected = 8;
        int actual = wave.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustReturnToZeroRadioStation() {
        Radio wave = new Radio();

        wave.setRadioStationNumber(9);
        wave.next();

        int expected = 0;
        int actual = wave.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeToThePreviousRadioStation() {
        Radio wave = new Radio();

        wave.setRadioStationNumber(1);
        wave.prev();

        int expected = 0;
        int actual = wave.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifEqualToMaxLimitShouldSwitchToPreviousRadioStation() {
        Radio wave = new Radio();

        wave.setRadioStationNumber(9);
        wave.prev();

        int expected = 8;
        int actual = wave.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifMoreMaxLimitShouldSwitchToPreviousRadioStation() {
        Radio wave = new Radio();

        wave.setRadioStationNumber(17);
        wave.prev();

        int expected = 9;
        int actual = wave.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustTurnOnTheLastRadioStation() {
        Radio wave = new Radio();

        wave.setRadioStationNumber(0);
        wave.prev();

        int expected = 9;
        int actual = wave.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustSetTheVolume() {
        Radio volume = new Radio();

        volume.setSoundVolume(0);

        int expected = 0;
        int actual = volume.soundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void whenNegativeVolumeMustSetTheZeroVolume() {
        Radio volume = new Radio();

        volume.setSoundVolume(-1);

        int expected = 0;
        int actual = volume.soundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void whenMoreThanARangeVolumeMustSetTheZeroVolume() {
        Radio volume = new Radio();

        volume.setSoundVolume(101);

        int expected = 0;
        int actual = volume.soundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gottaTurnApTheVolume() {
        Radio volume = new Radio();

        volume.setSoundVolume(0);
        volume.increaseVolume();

        int expected = 1;
        int actual = volume.soundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxVolume() {
        Radio volume = new Radio();

        volume.setSoundVolume(100);
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.soundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownTheVolume() {
        Radio volume = new Radio();

        volume.setSoundVolume(2);
        volume.reduceVolume();

        int expected = 1;
        int actual = volume.soundVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLeaveMinimalVolume() {
        Radio volume = new Radio();

        volume.setSoundVolume(0);
        volume.reduceVolume();

        int expected = 0;
        int actual = volume.soundVolume;

        Assertions.assertEquals(expected, actual);
    }
}