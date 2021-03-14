import java.util.Scanner;

public class Principal {
    public static void main (String []args){
       Scanner Scanner = new Scanner (System.in);
       System.out.println("Introduce tu edad");
int edad= Scanner.nextInt();
if (edad <=12){
System.out.println("Eres un niño");
}else{
    if(edad<18){
  System.out.println("Eres un joven");
    }else{
        System.out.println("Eres un adulto");
    }
}
System.out.println("Has vivido "+ (edad*8760)+ " horas");


System.out.println("Introduce un número del 1 al 10:");
int número= Scanner.nextInt();
if(número>0){
    if(número<10){
        int Contador=0;
        while(Contador<11) {
            System.out.println(número+ "x"+Contador+"="+(número*Contador));
            Contador++;
    }

        }else {
        System.out.print("Error, número fuera del rango");
    }
        }
if(número<0){
    System.out.print("Error, número fuera del rango");
}




    }
}
