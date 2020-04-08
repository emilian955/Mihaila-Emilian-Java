package com.emi;

public class AlbumController {
    String name;
    public int artistId;
    public int releaseYear;
    public void setname(String name_) {
        this.name = name_;
    }
    public String getname() {
        return this.name;
    }
    public void setartistId(int artistId_) {
        this.artistId = artistId_;
    }
    public int getartistId() {
        return this.artistId;
    }
    public void setreleaseYear(int releaseYear_) {this.releaseYear = releaseYear_; }
    public int getreleaseYear() { return this.releaseYear; }
}
