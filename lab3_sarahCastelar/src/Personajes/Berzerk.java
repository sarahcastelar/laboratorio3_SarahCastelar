
package Personajes;


public class Berzerk extends PersonajesAliados {

    public Berzerk(int suerte, String colorPiel, String colorPelo, int hp, int ad, int eficacia, int probCritico, int velocidad, String gritoBatalla, int edad, String nombre, int estatura, int peso, String raza) {
        super(15, colorPiel, colorPelo, 190, 80, 80, 30, 20, "BERZERKKKKK", edad, nombre, estatura, peso, raza);
    }

    @Override
    public String toString() {
        return "Berzerk: \n " + super.toString();
                
    }
    
}
