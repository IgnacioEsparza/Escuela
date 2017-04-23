/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generar;

import EscuelaPackage.Apoderado;
import EscuelaPackage.Asignatura;
import EscuelaPackage.Estudiante;
import EscuelaPackage.Profesor;
import java.util.ArrayList;

/**
 *
 * @author Ignacio Esparza
 */
public class GenerarPersonas {
    GetNombresRut gnr = new GetNombresRut();

    public GenerarPersonas() {
    }
    
    public Estudiante[] estudiantes30(){
        Estudiante [] estudiante = new Estudiante[30];
        ArrayList<Apoderado> ap = apoderado();
        for (int i = 0; i < estudiante.length; i++) {
            estudiante[i]= new Estudiante(gnr.nomAlumno(),gnr.rutRandom(),
                    ap.get(gnr.numRandom()));
        }
        return estudiante;
    }
    
     public  ArrayList<Apoderado> apoderado(){
        ArrayList<Apoderado> ap = new ArrayList();
        for (int i = 0; i < 23; i++) {
           ap.add(new Apoderado(gnr.nomApoderado(), gnr.rutRandom()));
        }
        return ap;
    }
     
      public Profesor[] profesor(Asignatura asign){
        Profesor [] pro = new Profesor [16];
        String [] nomProfesor = gnr.nomProfesor();
        int rut =700;
        for (int i = 0; i < pro.length; i++) {
            rut = rut+i;
            pro[i]=new Profesor(nomProfesor[i], String.valueOf(rut), 
                    asign.asignProfes().get(i));
        }
        return pro;
    }
}
