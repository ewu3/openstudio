package com.ewu3.openstudio.model;

/**
 * Created by ewu3 on 4/7/15.
 */
public class Artist {

    private int Id;
    private String Img;
    private String firstName;
    private String lastName;
    private String artistWebsite;
    private String artistDescription;
    private String Address;
    private int Floor;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String img) {
        Img = img;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getArtistWebsite() {
        return artistWebsite;
    }

    public void setArtistWebsite(String artistWebsite) {
        this.artistWebsite = artistWebsite;
    }

    public String getArtistDescription() {
        return artistDescription;
    }

    public void setArtistDescription(String artistDescription) {
        this.artistDescription = artistDescription;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getFloor() {
        return Floor;
    }

    public void setFloor(int floor) {
        Floor = floor;
    }


}
