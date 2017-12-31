
package biblioteca;

/**
 *
 * @author Maiekel Vela
 */
public class Libro {
    public String nombre;
    public int año;
    public Categoria categoria;
    public Editorial edit;
    public Identificador ident;

    

    public Libro(String nombre, int año, Categoria categoria, Editorial edit, Identificador ident) {
        this.nombre = nombre;
        this.año = año;
        this.categoria = categoria;
        this.edit = edit;
        this.ident = ident;
    }
public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setEdit(Editorial edit) {
        this.edit = edit;
    }

    public void setIdent(Identificador ident) {
        this.ident = ident;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAño() {
        return año;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Editorial getEdit() {
        return edit;
    }

    public Identificador getIdent() {
        return ident;
    }
}
