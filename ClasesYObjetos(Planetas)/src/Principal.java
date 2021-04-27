import java.awt.*;
import java.util.Scanner;

public class Principal {
    public static void main (String[] args){
        /*
Planet x=new Planet("Tierra", 14234, "solid", 365, 45000);
Planet mercurio= new Planet("Mercurio",5770543,"gas", 88,150430);
Asteroid A_128=new Asteroid("A-128","solid",18000,1800);
        Asteroid P_363=new Asteroid("A-363","solid",63000,8300);
        Asteroid R_643=new Asteroid("R-643","solid",32000,3400);
        x.mass= 1500;
        System.out.println(mercurio.getName());
        System.out.println(x.getName());
        x.setName("Earth");
*/
        int op=0;
        Scanner scanner = new Scanner(System.in);
  while(op!= 4){
      System.out.println("¿Qué desea hacer?\n 1)Crear estrella \n 2)Crear asteroide \n 3)Crear planeta \n 4)Salir  ");
  op=scanner.nextInt();
  switch (op){
      case 1:{  //Creación de la estrella
          System.out.println("Introduce el diametro de la estrella");
         double d=scanner.nextDouble();
          System.out.println("El tipo de la estrella es: \n 1)Enana roja  \n 2)Enana blanca ");
          int t=scanner.nextInt();
          String tipo=" ";
          if (t==1){ tipo="Enana roja"; }

          else if (t==2){ tipo="Enana blanca";
          } else{
              tipo="Estrella normal";
          }

          System.out.println("El color de la estrella es: " +
                  "\n 1)Roja " +
                  "\n 2)Azul" );

          int c=scanner.nextInt();
          Color color= Color.BLACK;
          if (c==1){ color=Color.red; }
          else if (c==2){ color=Color.BLUE; }
          Star estrella1=new Star(d,tipo,color);
          System.out.println("La estrella creada es: \n " +
                  "Diametro: "+estrella1.getDiameter()+
                  "\nTipo: "+ estrella1.getType()+
                  "\nColor: "+estrella1.getColor().toString());


          break;
      }
      case 2:{  //Creación del asteroide
          System.out.println("Introduce el nombre del asteroide: ");
          scanner.nextLine();
          String name=scanner.nextLine();
          System.out.println("Introduce la composición del asteroide: ");
         // scanner.nextLine();
          String comp=scanner.nextLine();
          System.out.println("Introduce su distancia de la tierra: ");
          double earth_dis=scanner.nextDouble();
          System.out.println("Introduce la velocidad del asteroide: ");
          double speed= scanner.nextDouble();
          Asteroid asteroide1= new Asteroid(name,comp,earth_dis,speed);
          System.out.println("Las propiedades del asteroide fueron: "+
                  "\nNombre: "+asteroide1.getName()+
                  "\nComposición: "+asteroide1.getComposition()+
                  "\nDistancia de la tierra: "+asteroide1.getEarth_distance()+
                  "\nVelocidad: "+asteroide1.getSpeed());
          break;
      }
      case 3:{          //Creación de un planeta
          System.out.println("Introduce el nombre del planeta: " );
          scanner.nextLine();
          String name=scanner.nextLine();
          System.out.println("Introduce la distancia del planeta con el sol: ");
          double sund=scanner.nextDouble();
          System.out.println("Introduce la composición: ");
          scanner.nextLine();
          String comp=scanner.nextLine();

          System.out.println("Introduce el ciclo orbital del planeta");
          int orbd=scanner.nextInt();
          System.out.println("Introduce la masa del planeta: ");
          double mass= scanner.nextDouble();

          Planet planeta1=new Planet(name, sund,comp,orbd,mass);
          System.out.println("Las propiedades del planeta son: \n" +

                 "Nombre: " +planeta1.getName()+
                  "\n Distancia del sol: "+planeta1.getSun_distance()+
                  "\n Composición: "+planeta1.getComposition()+
                  "\n Ciclo orbital: "+planeta1.getOrbit_days()+
                  "\n Masa: "+planeta1.getMass());
          break;
          }

      case 4:{ break;}
      default:{
          System.out.println("Opción no valida");
      }
  }//Llave switch
  }//Llave while
        System.out.println("Gracias por utilizar el sistema :D");
    }//Llave main
}//Llave Class
