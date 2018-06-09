
package lab6_arielperez;

import java.util.ArrayList;
import java.util.Random;
public class Peliculas {
    Random ran = new Random();
    private String id;
    private String nombre;
    private String categoria;
    ArrayList<String> idiom = new ArrayList();
    ArrayList<String> sub = new ArrayList();
    private double duracion;
    private int rating;
    ArrayList<String> comentarios = new ArrayList();
    private String productora;
    private String director;
    ArrayList<String> actores = new ArrayList();

    public Peliculas() {
    }

    public Peliculas(String id, String nombre, String categoria, double duracion, int rating, String productora, String director) {
        this.id = id;
        this.nombre = nombre;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<String> getIdiom() {
        return idiom;
    }

    public void setIdiom(ArrayList<String> idiom) {
        this.idiom = idiom;
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
        rating = 1+ran.nextInt(5);
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
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
