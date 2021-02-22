package com.example.mymusicapp.model;

public class MusikDuaModel {

    Integer musikDuaId;
    String musikDuaName;
    String musikDuaDurasi;
    Integer imageDuaUrl;

    public MusikDuaModel(Integer musikDuaId, String musikDuaName, String musikDuaDurasi, Integer imageDuaUrl) {
        this.musikDuaId = musikDuaId;
        this.musikDuaName = musikDuaName;
        this.musikDuaDurasi = musikDuaDurasi;
        this.imageDuaUrl = imageDuaUrl;
    }

    public Integer getMusikDuaId() {
        return musikDuaId;
    }

    public void setMusikDuaId(Integer musikDuaId) {
        this.musikDuaId = musikDuaId;
    }

    public String getMusikDuaName() {
        return musikDuaName;
    }

    public void setMusikDuaName(String musikDuaName) {
        this.musikDuaName = musikDuaName;
    }

    public String getMusikDuaDurasi() {
        return musikDuaDurasi;
    }

    public void setMusikDuaDurasi(String musikDuaDurasi) {
        this.musikDuaDurasi = musikDuaDurasi;
    }

    public Integer getImageDuaUrl() {
        return imageDuaUrl;
    }

    public void setImageDuaUrl(Integer imageDuaUrl) {
        this.imageDuaUrl = imageDuaUrl;
    }
}
