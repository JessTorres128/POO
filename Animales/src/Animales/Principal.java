package Animales;

import java.awt.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int[] miArray= new int[4];
                String str[];
        miArray[0]=100;
        miArray[3]=200;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Cuantos registros quieres???");
        int c= scanner.nextInt();
        str=new String[c];
        for (int x=0; x<c; x++){
            System.out.println("Inserte un nombre");
            String n= scanner.next();
            str[x]=n;
        }
     // imprimirArreglo(str);

        Ave[] arrayAves=new Ave[3];
        Animal[] arrayAnimal=new Animal[10];
Animal animalg= new Animal(Color.BLACK, 20);
Ave piolin= new Ave(Color.yellow, 10, "canario");
Perro perrito=new Perro(Color.GRAY,50,"Pitbull");
        arrayAves[0]=piolin;
        arrayAves[1]=new Ave(Color.BLACK, 50,"Gaviota");

        System.out.println(arrayAves[1].getTipo());

/*animalg.comer();
animalg.moverse();
piolin.comer();
piolin.volar();
piolin.moverse();
perrito.Ladrar();
perrito.comer();*/
    }
   /* public static void imprimirArreglo(String[] arr){
        for(int x=0;x< arr.length; x++){
            System.out.println(arr[x]);
        }*/
    }

