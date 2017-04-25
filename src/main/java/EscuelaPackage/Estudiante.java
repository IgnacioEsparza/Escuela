/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaPackage;

import java.util.Random;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Ignacio Esparza
 */
//@XmlRootElement(name="Estudiante")
@XmlType(propOrder = {"nombre","rut","anotaciones","apoderado","curso","asistencia","asignatura"})

public class Estudiante {

    private String nombre;
    private String rut;
    private String anotaciones;
    private Apoderado apoderado;
    private Curso curso;
    private int asistencia;
    Asignatura [] asignatura;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setApoderado(Apoderado apoderado) {
        this.apoderado = apoderado;
    }

    public void setAsignatura(Asignatura[] asignatura) {
        this.asignatura = asignatura;
    }
    
    public Estudiante(String nombre, String rut, Apoderado apoderado, Asignatura[] asignatura) {
        this.nombre = nombre;
        this.rut = rut;
        this.apoderado = apoderado;
        this.asignatura = asignatura;
    }
    
    @XmlElement(name="asistencia")
    public int getAsistencia() {
        Random r = new Random();
        this.asistencia=r.nextInt(150) + 30;
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    @XmlElement(name="anotaciones")
    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Estudiante() {
    }
    @XmlElement(name="nombre")
    public String getNombre() {
        return nombre;
    }
    @XmlElement(name="rut")
    public String getRut() {
        return rut;
    }
    @XmlElement(name="apoderado")
    public Apoderado getApoderado() {
        return apoderado;
    }
    @XmlElement(name="asignatura")
    public Asignatura [] getAsignatura() {
        return asignatura;
    }
    @XmlElement(name="curso")
    public Curso getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "\nNombre :" + nombre + "\nRut : " + rut;
    }

}
