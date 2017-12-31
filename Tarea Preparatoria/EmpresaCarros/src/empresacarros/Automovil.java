/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresacarros;

/**
 *
 * @author Maiekel Vela
 */
public class Automovil {
    
    public int placa;
    public String color;
    public int modelo;
    public String marca;

    public Automovil(int placa, String color, int modelo, String marca){
        this.placa = placa;
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPlaca() {
        return placa;
    }

    public String getColor() {
        return color;
    }

    public int getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }
}
