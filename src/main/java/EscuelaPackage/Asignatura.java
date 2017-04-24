/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaPackage;

import java.util.Arrays;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/**
 *
 * @author Ignacio Esparza
 */
//@XmlRootElement(name="Asignatura")
@XmlType(propOrder={"materia","notas","actividades"})
public class Asignatura {

    private String materia;
    private double [] notas;
    private Planificacion [] actividades;

    public Asignatura() {
    }

    public Asignatura(String materia) {
        this.materia = materia;
    }

    public Asignatura(String materia, double[] notas, Planificacion[] actividades) {
        this.materia = materia;
        this.notas = notas;
        this.actividades = actividades;
    }
    
    @XmlElement(name="notas")
    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
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
        return "Materia : " + materia + "\nActividades : " + Arrays.toString(actividades);
    }
    
    
    
    
}
