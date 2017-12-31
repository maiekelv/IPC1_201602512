
package empresacarros;

/**
 *
 * @author Maiekel Vela
 */
public class Cliente {
    public int dpi;
    public String nombre;
    public String direccion;
    public int telefono;
    public int codigo;
    public Cliente clienteEmp;
    
    public Cliente(){}
    public Cliente(int dpi, String nombre, String direccion, int telefono, int codigo, Cliente clienteEmp){
        this.dpi = dpi;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.clienteEmp = clienteEmp;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setClienteEmp(Cliente clienteEmp) {
        this.clienteEmp = clienteEmp;
    }

    public int getDpi() {
        return dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getCodigo() {
        return codigo;
    }

    public Cliente getClienteEmp() {
        return clienteEmp;
    }
}