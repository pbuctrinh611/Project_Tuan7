package com.example.project_tonghop;

public class ListViewBean {
    int image;
    String langName;
    String noidung;
    int imagecamera;

    public ListViewBean() {
    }
    public ListViewBean(int image,String langName, String noidung, int imagecamera) {
        super();
        this.image = image;
        this.langName=langName;
        this.noidung=noidung;
        this.imagecamera=imagecamera;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String staidum) {
        this.noidung=noidung;
    }

    public int getImagecamera() {
        return imagecamera;
    }

    public void setImagecamera(int imagecamera) {
        this.imagecamera = imagecamera;
    }
}