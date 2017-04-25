/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generar;

import EscuelaPackage.Apoderado;
import EscuelaPackage.Asignatura;
import EscuelaPackage.Estudiante;
import EscuelaPackage.Planificacion;
import EscuelaPackage.Profesor;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Ignacio Esparza
 */
public class GenerarPersonas {

    GetNombresRut gnr = new GetNombresRut();
    Random ra = new Random();

    public GenerarPersonas() {
    }

    public double[] notasRandom() {
        double[] notas = new double[5];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = ra.nextInt(6) + 2;
        }
        return notas;
    }

    public int numRandom() {
        return ra.nextInt(23);
    }

    public Estudiante[] estudiantes30() {
        Estudiante[] estudiante = new Estudiante[30];
        ArrayList<Apoderado> ap = apoderado();
        for (int i = 0; i < estudiante.length; i++) {
            estudiante[i] = new Estudiante(gnr.nomAlumno(),
                    gnr.rutRandom(), ap.get(numRandom()),
                    asignatura());
        }
        return estudiante;
    }

    public ArrayList<Apoderado> apoderado() {
        ArrayList<Apoderado> ap = new ArrayList();
        for (int i = 0; i < 23; i++) {
            ap.add(new Apoderado(gnr.nomApoderado(), gnr.rutRandom()));
        }
        return ap;
    }

    public Profesor[] profesor(Asignatura asign) {
        Profesor[] pro = new Profesor[16];
        String[] nomProfesor = gnr.nomProfesor();
        int rut = 700;
        for (int i = 0; i < pro.length; i++) {
            rut = rut + i;
            pro[i] = new Profesor(nomProfesor[i], String.valueOf(rut),
                    asignProfes().get(i));
        }
        return pro;
    }

    public Asignatura[] asignatura() {
        String[] materias = {"Matemáticas", "Lenguaje", "Historia", "inglés", "Ciencias"};
        Asignatura[] a = new Asignatura[5];
        for (int i = 0; i < a.length; i++) {
            a[i]=new Asignatura(materias[i], notasRandom());
        }
        return a;
    }
    
    public Asignatura[] asignaturaC() {
        String[] materias = {"Matemáticas", "Lenguaje", "Historia", "inglés", "Ciencias"};
        Asignatura[] a = new Asignatura[5];
        for (int i = 0; i < a.length; i++) {
            a[i]=new Asignatura(materias[i], planes());
        }
        return a;
    }

    public Planificacion[] planes() {
        Planificacion[] planes = new Planificacion[10];
        String [] planesEscritos={"Unidad 1","Unidad 2","Prueba 1","Revision Cuaderno 1"
        ,"Unidad 3","Unidad 4 ","Prueba 2","Revision Cuaderno 2","Unidad 5","Prueba 3"};
        for (int i = 0; i < planes.length; i++) {
            planes[i]=new Planificacion(planesEscritos[i]);
        }
        return planes;
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

}
