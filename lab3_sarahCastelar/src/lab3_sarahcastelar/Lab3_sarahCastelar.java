
package lab3_sarahcastelar;

import javax.swing.JOptionPane;
import Personajes.*;
import java.util.ArrayList;
import java.util.Random;
import Objetos.*;

public class Lab3_sarahCastelar {

    
    
    public static void main(String[] args) {
        int option = -1;
        
        //crear personaje
        ArrayList lista = new ArrayList();
        
        //nivel dificultad
        int cantEnemigos = 5, pasosInicio = 0, pasosTotal = 50; //por default empieza en facil.
        int dado;
        Random r = new Random();
        ArrayList mochila = new ArrayList();
    
    
        
        while (option != 3){
            option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese opcion:  \n"
                    + "1. Iniciar \n"
                    + "2. Nivel de Dificultad\n "
                    + "3. Salir"));
            
            
            if (option == 1) {
                int option2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese opcion de personaje: \n"
                        + "1. Mago \n"
                        + "2. Berzerk \n"
                        + "3. Arquero \n"
                        + "4. Picaro \n"
                        + "5. Por defecto \n"));
                
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad personaje: "));
                String nombre = JOptionPane.showInputDialog("Ingrese nombre personaje: ");
                int estatura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese estatura del personaje: "));
                int peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese peso personaje: "));
                String colorPiel = JOptionPane.showInputDialog("Ingrese color piel del personaje: ");
                String colorPelo = JOptionPane.showInputDialog("Ingrese color pelo del personaje: [negro,cafe o rubio]");
                String raza = JOptionPane.showInputDialog("Ingrese raza del personaje: [hobbit,elfos,humanos,enanos]");
                
                if (option2 == 1) {
                    lista.add( new Mago(20, colorPiel, colorPelo, 120, 20, 70, 2, 10, "shwshhh", edad, nombre, estatura, peso,raza));
                }
                
                if (option2 == 2) {
                    lista.add( new Berzerk(15, colorPiel, colorPelo, 190, 80, 80, 30, 20, "BERZERKKKKK", edad, nombre, estatura, peso, raza));
                }
                
                if (option == 3) {
                    lista.add( new Arquero(20, colorPiel, colorPelo, 150, 50, 85, 60, 15, "swingg", edad, nombre, estatura, peso, raza));
                }
                
                if (option == 4) {
                    lista.add( new Picaro(50, colorPiel, colorPelo, 150, 55, 85, 60, 30, "jujuju", edad, nombre, estatura, peso, raza));
                }
                
                if (option == 5) {
                    lista.add( new Mago(20, "verde", "blanco", 120, 20, 70, 2, 10, "shwshhh", 20, "Mago F", 50, 50,"humano"));
                }
                
                //AVANCE JUEGOOOOOO
                
                
                
                while (pasosInicio <= pasosTotal){
                    
                    dado = r.nextInt(20);
                    int suerte = ((PersonajesAliados) lista.get(0)).getSuerte();
                    
                    if (dado < suerte) {
                        //encuentra objeto
                        int R = r.nextInt(4);
                        if (R == 1)
                            mochila.add(new ObjetosGeneral("Arma Blanca","Usual") );
                        if (R == 2)
                            mochila.add(new ObjetosGeneral("Arma Negra","Usual"));
                        if (R == 3)
                            mochila.add(new ObjetosGeneral("Espada","Usual"));
                        if (R == 4)
                            mochila.add(new ObjetosGeneral("Martillo","Usual"));
                        if (R == 5)
                            mochila.add(new ObjetosGeneral("Arma Negra","Usual"));
                        
                        
                    }else {
                        if (cantEnemigos > 0) {
                            //encuentra enemigos
                        }
                    }
                    
                    
                    
                }
                
                
                
                
                
                
            }
            
            if (option == 2) {
                int option3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese opcion de dificultad:  \n"
                    + "1. Nivel Principiante \n"
                    + "2. Intermedio \n "
                    + "3. Pro "));
                
                
                if (option3 ==  1) {
                    cantEnemigos = 5;
                    pasosTotal = 50;
                }
                
                if (option3 == 2) {
                    cantEnemigos = 10;
                    pasosTotal = 100;
                }
                
                if (option3 == 3) {
                    cantEnemigos = 15;
                    pasosTotal = 120;
                }
            }
            
        }
        
        
    }
    
}
