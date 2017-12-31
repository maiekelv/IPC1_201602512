
public class SegmentoVuelo {
    public Vuelo ruta;
    public Avion avion;
    public String destino;

    public SegmentoVuelo(Vuelo ruta, Avion avion, String destino) {
        this.ruta = ruta;
        this.avion = avion;
        this.destino = destino;
    }

    public Vuelo getRuta() {
        return ruta;
    }

    public Avion getAvion() {
        return avion;
    }

    public String getDestino() {
        return destino;
    }

    public void setRuta(Vuelo ruta) {
        this.ruta = ruta;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
