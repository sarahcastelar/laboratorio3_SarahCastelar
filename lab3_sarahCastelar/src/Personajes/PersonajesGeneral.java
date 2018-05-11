
package Personajes;

public class PersonajesGeneral {

    
    protected int hp;
    protected int ad;
    protected int eficacia;
    protected int probCritico;
    protected int velocidad; 
    protected String gritoBatalla;
    protected int edad;
    protected String nombre;
    protected int estatura;
    protected int peso;
    protected String raza;

    public PersonajesGeneral() {
    }

    public PersonajesGeneral(int hp, int ad, int eficacia, int probCritico, int velocidad, String gritoBatalla, int edad, String nombre, int estatura, int peso, String raza) {
        this.hp = hp;
        this.ad = ad;
        this.eficacia = eficacia;
        this.probCritico = probCritico;
        this.velocidad = velocidad;
        this.gritoBatalla = gritoBatalla;
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.raza = raza;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public int getEficacia() {
        return eficacia;
    }

    public void setEficacia(int eficacia) {
        if (eficacia < 100 && eficacia > 1)
            this.eficacia = eficacia;
    }

    public int getProbCritico() {
        return probCritico;
    }

    public void setProbCritico(int probCritico) {
        this.probCritico = probCritico;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getGritoBatalla() {
        return gritoBatalla;
    }

    public void setGritoBatalla(String gritoBatalla) {
        this.gritoBatalla = gritoBatalla;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return   "HP:" + hp + "\n AD: " + ad + "\n Eficacia: " + eficacia + "\n Probabilidad Critico: " + probCritico + "\n Velocidad: " + velocidad +  "\n Grito Batalla:" + gritoBatalla + "\n Edad: " + edad + "\n Nombre: " + nombre + "\n Estatura: " + estatura + "\n Peso: " + peso + "\n Raza: " + raza + '}';
    }
    
    
    
    
    

    
}
