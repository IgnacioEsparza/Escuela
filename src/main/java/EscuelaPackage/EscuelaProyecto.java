/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaPackage;

import Generar.GuardarXML;
import EscuelaVisual.SelectCursos;
import java.io.IOException;
import javax.xml.bind.JAXBException;

/**
 * @version 1.0.0
 * @author Ignacio Esparza
 */
public class EscuelaProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JAXBException, IOException {
       
        GuardarXML g = new GuardarXML();
        g.guardar();
        /*SelectProfesor s = new SelectProfesor();
        s.setVisible(true);*/
        
        //Principal principal = new Principal();
        //principal.setVisible(true);
        
    }
}
