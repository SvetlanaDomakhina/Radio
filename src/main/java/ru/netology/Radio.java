package ru.netology;

public class Radio {
    private int currentChannel;
    private int currentVolume;

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel <= 9) {
            if (newCurrentChannel >= 0) {
                this.currentChannel = newCurrentChannel;
            }
        }
    }

    public void next() {
        if (currentChannel == 9) {
            currentChannel = 0;
        } else {
            currentChannel = currentChannel + 1;
        }

    }

    public void prev() {
        if (currentChannel == 0) {
            currentChannel = 9;
        } else {
            currentChannel = currentChannel - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume >= 0) {
            if (newCurrentVolume <= 100) {
                this.currentVolume = newCurrentVolume;
            }
        }

    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }


}
