/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_arielperez;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ariel
 */
public class usuario {
    private String correo;
    private String contra;
    private Date fecha;
    ArrayList <Peliculas> lista = new ArrayList();

    public usuario() {
    }

    public usuario(String correo, String contra, Date fecha) {
        this.correo = correo;
        this.contra = contra;
        this.fecha = fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Peliculas> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Peliculas> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "usuario{" + "correo=" + correo + ", contra=" + contra + ", fecha=" + fecha + ", lista=" + lista + '}';
    }
    
    



    
}//fin de la clase


