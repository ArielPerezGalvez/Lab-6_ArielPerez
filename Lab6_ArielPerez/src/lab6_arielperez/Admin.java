/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_arielperez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
        return "Admin{" + "Personas=" + Personas + '}';

    }

    public void setPersona(usuario p) {
        this.Personas.add(p);
    }

    void Archivos() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivoc, false);
            bw = new BufferedWriter(fw);
            for (usuario t : Personas) {
                bw.write(t.getCorreo() + ";");
                bw.write(t.getContra() + ";");
                bw.write(t.getFecha() + ";");
                bw.write(t.getTarjeta() + ";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        Personas = new ArrayList();
        if (archivoc.exists()) {
            try {
                sc = new Scanner(archivoc);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    int fecha, tarjeta;
                    String correo, contra;
                    correo = sc.next();
                    contra = sc.next();
                    fecha = sc.nextInt();
                    tarjeta = sc.nextInt();
                    Personas.add(new usuario(correo, contra, fecha, tarjeta));

                }
            } catch (Exception e) {
            }
            sc.close();
        }
    }

    void setUsuario(usuario p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
