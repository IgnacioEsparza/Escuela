/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaPackage;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Clase crea un objeto Apoderado
 * @author Ignacio Esparza
 */
//@XmlRootElement(name="Apoderado")
@XmlType(propOrder={"nombre","rut","pupilo"})
public class Apoderado {
    private String nombre;
    private String rut;
    private ArrayList<Estudiante> pupilo = new ArrayList();

    public Apoderado() {
    }
    
    public Apoderado(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }
    
    public void ApoderadoDe(Estudiante e){
        pupilo.add(e);
    }
    public String impPupilos(){
        String pupilos="";
        for (int i = 0; i <pupilo.size(); i++) {
            //System.out.println("|"+pupilo.get(i)+"|");
            pupilos = "\n|"+pupilo.get(i)+"|"+pupilos;
        }
        return pupilos;
    }
    @XmlElement(name="pupilo")
    public ArrayList<Estudiante> getPupilo() {
        return pupilo;
    }
    
    @XmlElement(name="nombre")
    public String getNombre() {
        return nombre;
    }
    @XmlElement(name="rut")
    public String getRut() {
        return rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setPupilo(ArrayList<Estudiante> pupilo) {
        this.pupilo = pupilo;
    }
    
    @Override
    public String toString() {
        return "Nombre :" + nombre + "\nRut :" + rut+"\nPupilo : "+pupilo;
    }
    
    
}
