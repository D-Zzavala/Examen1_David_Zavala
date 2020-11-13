public class Campista extends Persona{
   
    private String Tipo;
    private String Estado;

    public Campista() {
    }

    public Campista(String Tipo, String Estado, String Nombre, int edad, String sexo, String arma) {
        super(Nombre, edad, sexo, arma);
        this.Tipo = Tipo;
        this.Estado = Estado;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Tipo: " + Tipo + ", Estado: " + Estado + '.';
    }
    
    
    
}
