package ru.netology.radioman;

public class Radio {

    public int radioStationNumber;
    public int soundVolume;

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 0) {
            return;
        }

        if (newRadioStationNumber > 9) {
            return;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public void next() {
        if (radioStationNumber < 9) {
            radioStationNumber = radioStationNumber + 1;
        }

        if (radioStationNumber == 9) {
            radioStationNumber = 0;
        }
    }

    public void prev() {
        if (radioStationNumber < 10) {
            radioStationNumber = radioStationNumber - 1;
        }

        if (radioStationNumber < 0) {
            radioStationNumber = 9;
        }
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }

        if (newSoundVolume > 10) {
            return;
        }

        soundVolume = newSoundVolume;
    }

    public void increaseVolume() {

        if (soundVolume < 10) {
            soundVolume = soundVolume + 1;
        }

        if (soundVolume >= 10) {
            soundVolume = 10;
        }
    }


    public void reduceVolume() {

        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        } else {
            soundVolume = 0;
        }
    }

}
