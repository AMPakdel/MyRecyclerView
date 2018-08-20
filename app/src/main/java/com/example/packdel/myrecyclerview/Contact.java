package com.example.packdel.myrecyclerview;

public class Contact {

    private String Name;

    private String Number;

    private int image;

    public Contact(String name, String number, int image){

        this.Name = name;
        this.Number = number;
        this.image = image;
    }


    // Getters

    public String getName() {
        return Name;
    }

    public String getNumber() {
        return Number;
    }

    public int getImage() {
        return image;
    }


    // Setters

    public void setName(String name) {
        Name = name;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
