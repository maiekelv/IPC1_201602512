/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milicia;

/**
 *
 * @author Maiekel Vela
 */
public class Soldado {
    public int codigo;
    public String nombre;
    public String apellido;
    public String graduacion;
    public CuerpoEjercito cuerpo;
    public Compania compania;
    public Servicios servicios;

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGraduacion() {
        return graduacion;
    }

    public CuerpoEjercito getCuerpo() {
        return cuerpo;
    }

    public Compania getCompania() {
        return compania;
    }

    public Servicios getServicios() {
        return servicios;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setGraduacion(String graduacion) {
        this.graduacion = graduacion;
    }

    public void setCuerpo(CuerpoEjercito cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void setCompania(Compania compania) {
        this.compania = compania;
    }

    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }

    public Soldado(int codigo, String nombre, String apellido, String graduacion, CuerpoEjercito cuerpo, Compania compania, Servicios servicios) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.graduacion = graduacion;
        this.cuerpo = cuerpo;
        this.compania = compania;
        this.servicios = servicios;
    }
}
