/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_arielperez;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class Admin {
    private ArrayList<usuario> Personas = new ArrayList();
    private File archivoc = null;

    public Admin() {
    }

    public ArrayList<usuario> getPersonas() {
        return Personas;
    }

    public void setPersonas(ArrayList<usuario> Personas) {
        this.Personas = Personas;
    }

    public File getArchivoc() {
        return archivoc;
    }

    public void setArchivoc(File archivoc) {
        this.archivoc = archivoc;
    }

    @Override
    public String toString() {
        return "Admin{" + "Personas=" + Personas + ", archivoc=" + archivoc + '}';
    }
    
    

}
