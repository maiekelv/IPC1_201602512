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
public class Cuartel {
    public int codigo;
    public String nombre;
    public String ubicacion;
    public Soldado soldado;

    public Cuartel(int codigo, String nombre, String ubicacion, Soldado soldado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.soldado = soldado;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setSoldado(Soldado soldado) {
        this.soldado = soldado;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Soldado getSoldado() {
        return soldado;
    }
}
