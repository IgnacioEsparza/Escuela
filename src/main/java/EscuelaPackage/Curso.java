
package EscuelaPackage;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Ignacio Esparza
 */
//@XmlRootElement(name="Curso")
@XmlType(propOrder={"nivel","letra","estudiante","profesor","asignaturaC"})
public class Curso {

    private String letra;
    private int nivel;
    Estudiante estudiante[];
    Profesor profesor;
    Asignatura [] asignaturaC;

    public Curso(String letra, int nivel, Estudiante[] estudiante,
            Profesor profesor, Asignatura [] asignaturaC) {
        this.letra = letra;
        this.nivel = nivel;
        this.estudiante = estudiante;
        this.profesor = profesor;
        this.asignaturaC = asignaturaC;
    }
    
    public Curso() {
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setEstudiante(Estudiante[] estudiante) {
        this.estudiante = estudiante;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void setAsignaturaC(Asignatura [] asignaturaC) {
        this.asignaturaC = asignaturaC;
    }
    
    @XmlElement(name="letra")
    public String getLetra() {
        return letra;
    }
    @XmlElement(name="nivel")
    public int getNivel() {
        return nivel;
    }
    @XmlElement(name="estudiante")
    public Estudiante[] getEstudiante() {
        return estudiante;
    }
    @XmlElement(name="profesor")
    public Profesor getProfesor() {
        return profesor;
    }
    @XmlElement(name="asignatura")
    public Asignatura [] getAsignaturaC() {
        return asignaturaC;
    }

    public String getTodos() {
        String alumnos = "";
        for (int i = 0; i < estudiante.length; i++) {
            alumnos = estudiante[i] + alumnos;
        }
        return alumnos;
    }

    @Override
    public String toString() {
        return "\nCurso : " + nivel + " " + letra
                + "\n__________________________________________________________"
                + "\nEstudiantes : " + getTodos()
                + "\n__________________________________________________________"
                + "\nProfesor : " + profesor
                + "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^";
    }

}
