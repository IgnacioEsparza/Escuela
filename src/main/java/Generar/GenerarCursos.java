/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generar;

import EscuelaPackage.Asignatura;
import EscuelaPackage.Curso;
import EscuelaPackage.Profesor;

/**
 *
 * @author Ignacio Esparza
 */
public class GenerarCursos {

    GenerarPersonas gp = new GenerarPersonas();
    //private Curso[] TCursos = new Curso[16];
    Curso[] cursoa = new Curso[8];
    Curso[] cursob = new Curso[8];

    //Curso curso1a = new Curso("A", 1, gp.estudiantes30(), Profe[0], asignatura.asignatura());
    public GenerarCursos() {
    }

    public Curso[] CursosA() {
        Asignatura asignatura = new Asignatura();
        Profesor[] Profe = gp.profesor(asignatura);
        for (int i = 0; i < cursoa.length; i++) {
            cursoa[i] = new Curso("A", i + 1, gp.estudiantes30(), Profe[i], gp.asignaturaC());
        }
        return cursoa;
    }

    public Curso[] CursosB() {

        Asignatura asignatura = new Asignatura();
        Profesor[] Profe = gp.profesor(asignatura);
        for (int i = 0; i < cursob.length; i++) {
            cursob[i] = new Curso("B", i + 1, gp.estudiantes30(), Profe[i + 8], gp.asignaturaC());
        }
        return cursob;
    }

    /*public Curso[] CursosAB() {
        System.arraycopy(CursosA(), 0, TCursos, 0, CursosA().length);
        System.arraycopy(CursosB(), 0, TCursos, CursosA().length, CursosB().length);
        return TCursos;
    }*/
}
