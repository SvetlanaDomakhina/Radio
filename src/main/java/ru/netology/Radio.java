package ru.netology;

public class Radio {
    private int currentChannel;
    private int currentVolume;
    private int channelAmount;

    public Radio() {

        channelAmount = 10;
    }

    public Radio(int channelAmount) {
        this.channelAmount = channelAmount;

    }

    public int getCurrentChannel() {

        return currentChannel;
    }

    public void setCurrentChannel(int newChannel) {
        if (newChannel < channelAmount) {
            if (newChannel >= 0) {
                currentChannel = newChannel;
            }
        }
    }

    public void next() {
        if (currentChannel == channelAmount - 1) {
            currentChannel = 0;
        } else {
            currentChannel++;
        }

    }

    public void prev() {
        if (currentChannel == 0) {
            currentChannel = channelAmount - 1;
        } else {
            currentChannel--;
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
