public class Persona {

private String Nombre;
private int edad;
private String sexo;
private String arma;

    public Persona() {
    }

    public Persona(String Nombre, int edad, String sexo, String arma) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.arma = arma;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return Nombre + edad;
    }


    
}
