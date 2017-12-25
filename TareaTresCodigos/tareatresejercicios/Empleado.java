
package tareatresejercicios;

/**
 *
 * @author Maiekel Vela
 */
public class Empleado extends Persona {
    
    public Empleado(double salario, String cargo) {
        super(salario, "Empleado");
    }
    
    @Override
    public double mostrarSalario() {
        return salario;
    }
    
}
    

