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
@XmlRootElement(name="Colegio")
@XmlType(propOrder={"cursosa","cursosb"})
public class Colegio {
    Curso [] cursosa;
    Curso [] cursosb;

    public Colegio() {
    }

    public Colegio(Curso[] cursosa, Curso[] cursosb) {
        this.cursosa = cursosa;
        this.cursosb = cursosb;
    }
    
    @XmlElement(name="cursosa")
    public Curso[] getCursosa() {
        return cursosa;
    }
    @XmlElement(name="cursosb")
    public Curso[] getCursosb() {
        return cursosb;
    }
    
    
    
}