/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaPackage;

import Generar.GuardarXML;
import EscuelaVisual.SelectProfesor;
import EscuelaVisual.TablaRegistro;
import java.io.IOException;
import javax.xml.bind.JAXBException;

/**
 * @version 1.4.0
 * @author Ignacio Esparza
 */
public class EscuelaProyecto {

    /**
     * @param args the command line arguments
     * @throws javax.xml.bind.JAXBException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws JAXBException, IOException {
       
        GuardarXML g = new GuardarXML();
        g.guardar();
        
        /*TablaRegistro t = new TablaRegistro();
        t.setVisible(true);*/
        //g.cargar();
       SelectProfesor s = new SelectProfesor();
        s.setVisible(true);
        
        
        
        //Principal principal = new Principal();
        //principal.setVisible(true);
        
    }
}
