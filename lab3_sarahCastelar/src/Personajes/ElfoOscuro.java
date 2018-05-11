
package Personajes;

import java.util.Random;

public class ElfoOscuro extends PersonajesEnemigos {
    Random r = new Random();
    
    public ElfoOscuro(int hp, int ad, int eficacia, int probCritico, int velocidad, String gritoBatalla, int edad, String nombre, int estatura, int peso, String raza) {
        super(hp, ad, eficacia, probCritico, 20, "juju", edad, "Elfo Oscuro", estatura, peso, raza);
        this.hp = 60 + r.nextInt(120);
        this.ad = 30 + r.nextInt(50);
        this.eficacia = 50 + r.nextInt(70);
        this.probCritico =  r.nextInt(100);
    }
    
}
