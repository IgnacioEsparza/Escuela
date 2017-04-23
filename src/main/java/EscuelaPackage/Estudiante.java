/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaPackage;

import java.util.ArrayList;
import java.util.Random;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Ignacio Esparza
 */
@XmlRootElement(name="Estudiante")
@XmlType(propOrder = {"nombre","rut","anotaciones","apoderado","curso","asistencia","asignatura","notas"})

public class Estudiante {

    private String nombre;
    private String rut;
    private String anotaciones;
    private Apoderado apoderado;
    private Curso curso;
    private int asistencia;
    double[] notas;
    ArrayList<Asignatura> asignatura = new ArrayList();

    public Estudiante(String nombre, String rut, Apoderado apoderado) {
        this.nombre = nombre;
        this.rut = rut;
        this.apoderado = apoderado;

    }

    public Estudiante(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
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

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    
    /*public double[] setNotas(int n1, int n2, int n3, int n4, int n5) {
        this.notas = new double[5];
        notas[0] = n1;
        notas[1] = n2;
        notas[2] = n3;
        notas[3] = n4;
        notas[4] = n5;
        return notas;
    }*/
    
    @XmlElement(name="notas")
    public double[] getNotas() {
        return notas;
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
    public ArrayList<Asignatura> getAsignatura() {
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
