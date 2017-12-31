/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Maiekel Vela
 */
public class Autor {
    public String nombre;
    public int fechaNaciemiento;
    public String nacionalidad;

    public Autor(String nombre, int fechaNaciemiento, String nacionalidad) {
        this.nombre = nombre;
        this.fechaNaciemiento = fechaNaciemiento;
        this.nacionalidad = nacionalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNaciemiento(int fechaNaciemiento) {
        this.fechaNaciemiento = fechaNaciemiento;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaNaciemiento() {
        return fechaNaciemiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
}
