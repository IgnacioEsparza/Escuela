/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generar;

import EscuelaPackage.Colegio;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

    public void generarCursos() throws JAXBException, IOException {

        JAXBContext context = JAXBContext.newInstance(Colegio.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        GenerarCursos gc = new GenerarCursos();
        Colegio college = new Colegio(gc.CursosA(), gc.CursosB());
        mar.marshal(college, new FileOutputStream(("Colegio.xml")));

    }

    public Colegio cargar() {
        try {
            JAXBContext context = JAXBContext.newInstance(Colegio.class);
            Unmarshaller unma = context.createUnmarshaller();
            Colegio college = (Colegio) unma.unmarshal(new File("Colegio.xml"));
            return college;
        } catch (Exception e) {
        }
        return null;
    }
    
    public void guardar(Colegio college) throws JAXBException, FileNotFoundException{
         JAXBContext context = JAXBContext.newInstance(Colegio.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(college, new FileOutputStream(("Colegio.xml")));
    }
}
