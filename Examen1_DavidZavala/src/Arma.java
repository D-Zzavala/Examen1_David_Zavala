public class Arma {
    
    private String Nombre;
    private int Daño;

    public Arma() {
    }

    public Arma(String Nombre, int Daño) {
        this.Nombre = Nombre;
        this.Daño = Daño;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDaño() {
        return Daño;
    }

    public void setDaño(int Daño) {
        this.Daño = Daño;
    }

    @Override
    public String toString() {
        return Nombre + ", Da\u00f1o=" + Daño;
    }
    
    
    
}
