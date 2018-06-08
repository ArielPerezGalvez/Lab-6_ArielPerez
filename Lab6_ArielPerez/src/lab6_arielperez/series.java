/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_arielperez;

import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class series {
    private String id;
    private String nombre;
    private int temporadas;
    private String categoria;
    ArrayList <String> idioma = new ArrayList();
    ArrayList <String> sub = new ArrayList();
    private double duracion;
    private int rating;
    ArrayList<String> comen = new ArrayList();
    private String productora;
    private String director;
    ArrayList <String> actores = new ArrayList();

    public series() {
    }

    public series(String id, String nombre, int temporadas, String categoria, double duracion, int rating, String productora, String director) {
        this.id = id;
        this.nombre = nombre;
        this.temporadas = temporadas;
        this.categoria = categoria;
        this.duracion = duracion;
        this.rating = rating;
        this.productora = productora;
        this.director = director;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<String> getIdioma() {
        return idioma;
    }

    public void setIdioma(ArrayList<String> idioma) {
        this.idioma = idioma;
    }

    public ArrayList<String> getSub() {
        return sub;
    }

    public void setSub(ArrayList<String> sub) {
        this.sub = sub;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ArrayList<String> getComen() {
        return comen;
    }

    public void setComen(ArrayList<String> comen) {
        this.comen = comen;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
}//fin de la clase
