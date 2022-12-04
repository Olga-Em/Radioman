package ru.netology.radioman;

public class Radio {
    private int radioStationNumber;
    private int soundVolume;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

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
        if (radioStationNumber > 0) {
            radioStationNumber = radioStationNumber - 1;
        } else {
            radioStationNumber = 9;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
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
