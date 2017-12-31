/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrohotel;

/**
 *
 * @author Maiekel Vela
 */
public class Sucursal {
    public int codigo;
    public String direccion;
    public int telefono;
    public Registro registro;

    public Sucursal(int codigo, String direccion, int telefono, Registro registro) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.registro = registro;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public Registro getRegistro() {
        return registro;
    }
    
}
