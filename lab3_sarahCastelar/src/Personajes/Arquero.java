
package Personajes;


public class Arquero extends PersonajesAliados {
    
    public Arquero(int suerte, String colorPiel, String colorPelo, int hp, int ad, int eficacia, int probCritico, int velocidad, String gritoBatalla, int edad, String nombre, int estatura, int peso, String raza) {
        super(20, colorPiel, colorPelo, 150, 50, 85, 60, 15, "swingg", edad, nombre, estatura, peso, raza);
    }
    
    @Override
    public String toString() {
        return "Arquero: \n " + super.toString();
                
    }
    
}
