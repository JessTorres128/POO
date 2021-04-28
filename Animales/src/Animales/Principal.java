package Animales;

import java.awt.*;

public class Principal {
    public static void main(String[] args) {
Animal animalg= new Animal(Color.BLACK, 20);
Ave piolin= new Ave(Color.yellow, 10, "canario");
Perro perrito=new Perro(Color.GRAY,50,"Pitbull");
animalg.comer();
animalg.moverse();
piolin.comer();
piolin.volar();
piolin.moverse();
perrito.Ladrar();
perrito.comer();
    }
}
