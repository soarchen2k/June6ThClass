package com.qizhou.june6thclass.entities;

public class Data {
    private String name;
    private String dec;
    private int image;

    public Data(String name, String dec, int image) {
        this.name = name;
        this.dec = dec;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
