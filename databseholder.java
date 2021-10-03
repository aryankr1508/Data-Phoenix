package com.example.challengingtask;

import androidx.appcompat.app.AppCompatActivity;

public class databseholder  {

    String name,address,city,item;

    public databseholder(String name, String address, String city, String item) {

        this.name = name;
        this.address = address;
        this.city = city;
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
