
package Personajes;

public class PersonajesEnemigos extends PersonajesGeneral {

    public PersonajesEnemigos(int hp, int ad, int eficacia, int probCritico, int velocidad, String gritoBatalla, int edad, String nombre, int estatura, int peso, String raza) {
        super(hp, ad, eficacia, probCritico, velocidad, gritoBatalla, edad, nombre, estatura, peso, raza);
    }

    @Override
    public String toString() {
        return super.toString();
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    
    
    
}
