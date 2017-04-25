/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaPackage;

import EscuelaVisual.IngresoDatos.IngPlanificaciones;
import EscuelaVisual.SelectProfesor;
import Generar.GuardarXML;
import java.io.IOException;
import java.util.Arrays;
import javax.xml.bind.JAXBException;

/**
 * @version 1.6.24
 * @author Ignacio Esparza
 */
public class EscuelaProyecto {

    /**
     * @param args the command line arguments
     * @throws javax.xml.bind.JAXBException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws JAXBException, IOException {
        
        /*GuardarXML g = new GuardarXML();
        //g.generarCursos();
        Colegio col = g.cargar();
        
        Planificacion [] plan = new Planificacion[10];
        for (int i = 0; i < 10; i++) {
            plan[i]= new Planificacion("Actividad :"+i);
        }
        col.cursosa[0].getProfesor().setNombre("Venedictino Zambrolatti");
        col.getCursosa()[0].getAsignaturaC()[0].setActividades(plan);
        
        g.guardar(col);*/
        
        SelectProfesor sp = new SelectProfesor();
        sp.setVisible(true);
        
        
    }
}
