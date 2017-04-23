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
 *
 * @author Ignacio Esparza
 */
@XmlRootElement(name="Asignatura")
@XmlType(propOrder={"materia","actividades"})
public class Asignatura {

    private String materia;
    private Planificacion [] actividades;

    public Asignatura() {
    }

    public Asignatura(String materia) {
        this.materia = materia;
    }

    public Asignatura(String materia, Planificacion[] actividades) {
        this.materia = materia;
        this.actividades = actividades;
    }
    
    public ArrayList<Asignatura> asignProfes() {
        ArrayList<Asignatura> asigna = new ArrayList();
        asigna.add(new Asignatura("Matemáticas"));
        asigna.add(new Asignatura("Matemáticas"));
        asigna.add(new Asignatura("Matemáticas"));
        asigna.add(new Asignatura("Matemáticas"));
        asigna.add(new Asignatura("Matemáticas"));
        asigna.add(new Asignatura("Lenguaje"));
        asigna.add(new Asignatura("Lenguaje"));
        asigna.add(new Asignatura("Lenguaje"));
        asigna.add(new Asignatura("Lenguaje"));
        asigna.add(new Asignatura("Lenguaje"));
        asigna.add(new Asignatura("Historia"));
        asigna.add(new Asignatura("Historia"));
        asigna.add(new Asignatura("Inglés"));
        asigna.add(new Asignatura("Inglés"));
        asigna.add(new Asignatura("Ciencias"));
        asigna.add(new Asignatura("Ciencias"));

        return asigna;
    }
    
    public ArrayList<Asignatura> asignatura() {
        ArrayList<Asignatura> asigna = new ArrayList();
        asigna.add(new Asignatura("Matemáticas"));
        asigna.add(new Asignatura("Lenguaje"));
        asigna.add(new Asignatura("Historia"));
        asigna.add(new Asignatura("Inglés"));
        asigna.add(new Asignatura("Ciencias"));

        return asigna;
    }
    
    @XmlElement(name="materia")
    public String getMateria() {
        return materia;
    }
    
    @XmlElement(name="actividades")
    public Planificacion[] getActividades() {
        return actividades;
    }
    
    @Override
    public String toString() {
        return materia;
    }
    
    
}
