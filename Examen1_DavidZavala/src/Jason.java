public class Jason extends Persona{
    
    private int Victimas; 

    public Jason() {
    }

    public Jason(int Victimas, String Nombre, int edad, String sexo, String arma) {
        super(Nombre, edad, sexo, arma);
        this.Victimas = Victimas;
    }

    public int getVictimas() {
        return Victimas;
    }

    public void setVictimas(int Victimas) {
        this.Victimas = Victimas;
    }

    @Override
    public String toString() {
        return "Jason{" + "Victimas=" + Victimas + '}';
    }
    
}