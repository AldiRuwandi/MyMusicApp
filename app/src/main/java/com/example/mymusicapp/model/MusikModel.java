package com.example.mymusicapp.model;

public class MusikModel {

    Integer musikId;
    String musikName;
    String musikDurasi;
    Integer imageUrl;

    public MusikModel(Integer musikId, String musikName, String musikDurasi, Integer imageUrl) {
        this.musikId = musikId;
        this.musikName = musikName;
        this.musikDurasi = musikDurasi;
        this.imageUrl = imageUrl;
    }

    public Integer getMusikId() {
        return musikId;
    }

    public void setMusikId(Integer musikId) {
        this.musikId = musikId;
    }

    public String getMusikName() {
        return musikName;
    }

    public void setMusikName(String musikName) {
        this.musikName = musikName;
    }

    public String getMusikDurasi() {
        return musikDurasi;
    }

    public void setMusikDurasi(String musikDurasi) {
        this.musikDurasi = musikDurasi;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}
