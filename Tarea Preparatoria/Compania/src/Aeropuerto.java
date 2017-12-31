
public class Aeropuerto {
    public SegmentoVuelo aterriza;

    public Aeropuerto(SegmentoVuelo aterriza) {
        this.aterriza = aterriza;
    }

    public void setAterriza(SegmentoVuelo aterriza) {
        this.aterriza = aterriza;
    }

    public SegmentoVuelo getAterriza() {
        return aterriza;
    }
    
}
