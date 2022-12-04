package ru.netology.radioman;

public class Radio {
    private int amountRadioStation = 10;
    private int firstRadioStation = 0;
    private int lastRadioStation = amountRadioStation - 1;
    private int minVolume = 0;
    private int maxVolume = 100;

    public int radioStationNumber;
    public int soundVolume;

    public Radio(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
        this.lastRadioStation = this.amountRadioStation - 1;
    }

    public Radio() {
    }

    public int getAmountRadioStation() {
        return amountRadioStation;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < firstRadioStation) {
            return;
        }

        if (newRadioStationNumber > lastRadioStation) {
            return;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public void next() {
        if (radioStationNumber < lastRadioStation) {
            radioStationNumber = radioStationNumber + 1;
        }

        if (radioStationNumber == lastRadioStation) {
            radioStationNumber = firstRadioStation;
        }
    }

    public void prev() {
        if (radioStationNumber > firstRadioStation) {
            radioStationNumber = radioStationNumber - 1;
        } else {
            radioStationNumber = lastRadioStation;
        }
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < minVolume) {
            return;
        }

        if (newSoundVolume > maxVolume) {
            return;
        }

        soundVolume = newSoundVolume;
    }

    public void increaseVolume() {

        if (soundVolume < maxVolume) {
            soundVolume = soundVolume + 1;
        }

        if (soundVolume >= maxVolume) {
            soundVolume = maxVolume;
        }
    }

    public void reduceVolume() {

        if (soundVolume > minVolume) {
            soundVolume = soundVolume - 1;
        } else {
            soundVolume = minVolume;
        }
    }

}
