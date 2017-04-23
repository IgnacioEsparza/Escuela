/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generar;

import EscuelaPackage.Colegio;
import com.sun.xml.internal.ws.util.Pool;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Ignacio Esparza
 */
public class GuardarXML {

    public void guardar() throws JAXBException, IOException {
        /*GenerarCursos gc = new GenerarCursos();
        Curso[] CA = gc.CursosA();
        Curso[] CB = gc.CursosB();
        JAXBContext context = JAXBContext.newInstance(Curso.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(CA[0], new FileWriter("Curso.xml"));*/
        
        JAXBContext context = JAXBContext.newInstance(Colegio.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        GenerarCursos gc = new GenerarCursos();
        Colegio college = new Colegio(gc.CursosA(), gc.CursosB());
        mar.marshal(college, new FileWriter("Colegio.xml"));

    }
    
    public void cargar() throws JAXBException{
        JAXBContext context = JAXBContext.newInstance(Colegio.class);
        Unmarshaller unma = context.createUnmarshaller();
        Colegio college = (Colegio) unma.unmarshal(new File("Colegio.xml"));
    }
}
