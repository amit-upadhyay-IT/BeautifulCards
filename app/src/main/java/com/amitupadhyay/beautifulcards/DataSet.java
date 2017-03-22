package com.amitupadhyay.beautifulcards;

/**
 * Created by aupadhyay on 3/22/17.
 */

public class DataSet {

    private String titleMessage, hintMessage;
    private int bgColor;

    public DataSet(String titleMessage, String hintMessage, int bgColor) {
        this.titleMessage = titleMessage;
        this.hintMessage = hintMessage;
        this.bgColor = bgColor;
    }

    public DataSet() {
    }

    public int getBgColor()
    {
        return bgColor;
    }

    public void setBgColor(int bgColor)
    {
        this.bgColor = bgColor;
    }

    public String getTitleMessage() {
        return titleMessage;
    }

    public void setTitleMessage(String titleMessage) {
        this.titleMessage = titleMessage;
    }

    public String getHintMessage() {
        return hintMessage;
    }

    public void setHintMessage(String hintMessage) {
        this.hintMessage = hintMessage;
    }
}
