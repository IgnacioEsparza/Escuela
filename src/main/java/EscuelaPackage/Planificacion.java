/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscuelaPackage;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Ignacio Esparza
 */
//@XmlRootElement(name="Planificacion")
@XmlType(propOrder={"actividad"})
public class Planificacion {
    private String actividad;

    public Planificacion() {
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    
    public Planificacion(String actividad) {
        this.actividad = actividad;
    }
    
    @XmlElement(name="actividad")
    public String getActividad() {
        return actividad;
    }

    @Override
    public String toString() {
        return "Actividad : " + actividad;
    }
    
}
