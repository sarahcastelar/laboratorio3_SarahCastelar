
package Personajes;

import java.util.Random;


public class Orco extends PersonajesEnemigos {
    
    Random r = new Random();
    
    public Orco(int hp, int ad, int eficacia, int probCritico, int velocidad, String gritoBatalla, int edad, String nombre, int estatura, int peso, String raza) {
        super(hp, ad, eficacia, 60, 20, "AHHHHHHHH", edad, "Orco", estatura, peso, raza);
        this.hp = 70 + r.nextInt(90);
        this.ad = 30 + r.nextInt(45);
        this.eficacia = 20 + r.nextInt(50);
    }
    
}
