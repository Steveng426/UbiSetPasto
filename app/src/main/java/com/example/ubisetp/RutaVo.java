package com.example.ubisetp;

public class RutaVo {

    private String NombreRuta;
    private String Descripcion;
    private String Info;
    private int Image;

    public RutaVo (){

    }

    public RutaVo(String nombreRuta, String descripcion, String info, int image) {
        NombreRuta = nombreRuta;
        Descripcion = descripcion;
        Info = info;
        Image = image;
    }

    public String getNombreRuta() {
        return NombreRuta;
    }

    public void setNombreRuta(String nombreRuta) {
        NombreRuta = nombreRuta;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getInfo() {
        return Info;
    }

    public void setInfo(String info) {
        Info = info;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
