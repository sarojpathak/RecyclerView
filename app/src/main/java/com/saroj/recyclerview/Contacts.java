package com.saroj.recyclerview;

public class Contacts {
    private String name;
    private String phoneNo;
    private int image;

    public Contacts(String name, String phoneNo, int image) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
