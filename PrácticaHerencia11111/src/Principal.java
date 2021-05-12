import java.util.Scanner;

public class Principal {
    public static void main(String[]args){
        ZonaGeografica[] ArrZG = new ZonaGeografica[0];
        Pais[] ArrPais= new Pais[0];
        Scanner scanner=new Scanner(System.in);
        int RDP=  0;
        int RDZ = 0;
        int o=0;
     while(o!=4){
         System.out.println("Bienvenido al sistema de provincias \n" +
                 "¿Qué desea hacer? \n" +
                 "1)Crear Zona Geográfica \n" +
                 "2)Crear un Pais \n" +
                 "3)Mostrar los datos \n" +
                 "4)Salir\n...");
         o=scanner.nextInt();
         switch (o){
             case 1:{//Crear ZonaGeografica
                 System.out.println("Elegiste crear una Zona Geográfica \n ¿Cuántas registros de Zonas deseas crear?");
                  RDZ=scanner.nextInt();
                 ArrZG= new ZonaGeografica[RDZ];
                 for (int xZ=0; xZ<RDZ; xZ++){
                     System.out.println("Inserte un nombre de la zona #"+(xZ+1));
                     String n= scanner.next();
                     System.out.println("Inserte la superficie de la zona #"+(xZ+1));
                     float sp= scanner.nextFloat();

                   ArrZG[xZ]=new ZonaGeografica(n,sp);

                 }                          break; }
             case 2:{//Crear Pais
                 System.out.println("Elegiste crear una Pais \n ¿Cuántas registros de Pais deseas crear?");
                  RDP=scanner.nextInt();
                 String strp[]=new String[RDP];
                 ArrPais=new Pais[RDP];
                     for (int xP=0; xP<RDP; xP++){
                         if(xP<RDZ){
                             System.out.println("Inserta el idioma del Pais #"+(xP+1));
                             String id= scanner.next();
                             System.out.println("Inserta la moneda del Pais #"+(xP+1));
                             String mon= scanner.next();
                             System.out.println("Inserta el presidente del Pais #"+(xP+1));
                             String pr= scanner.next();

                             ArrPais[xP]=new Pais(ArrZG[xP].getNombre(),ArrZG[xP].getSuperficie(),id,mon,pr);
                         }else{
                             System.out.println("Error, se superó la cantidad de Paises en las Zonas Geográficas, Intente crear más zonas");
                             break;
                         }
                     }
                 break; }
             case 3:{
                 System.out.println("Datos de Zonas Geográficas:");
                 if(RDZ!=0){
                     for (int xZC=0; xZC<RDZ; xZC++){
                         System.out.println("La Zona Geográfica #"+(xZC+1)+" se llama "+ArrZG[xZC].getNombre()
                                 +" con Superficie de "+ArrZG[xZC].getSuperficie()+ "\n");
                     }
                 }else{
                     System.out.println("Por el momento no se encuentran datos de Zonas Geográficas\n");
                 }

                 System.out.println("Datos de Paises:");
                 if(RDP!=0){
                     for(int xPC=0;xPC< ArrPais.length; xPC++){
                         System.out.println("En el Pais #"+(xPC+1)+/*+" se llama "+ArrPais[xPC].getNombre()
                                 +" midiendo "+ArrZG[xPC].getSuperficie()+" km,*/ " se habla el "+ArrPais[xPC].getIdioma() +
                                 ", su moneda es el "+ArrPais[xPC].getMoneda() +
                                 " y su presidente es "+ArrPais[xPC].getPresidente());
                     }
                 }else{
                     System.out.println("Por el momento no se encuentran datos de paises\n");
                 }
                 break; }
             case 4:{break; }
             default:{ System.out.println("Opción no valida"); }

         }
     }
        System.out.println("Gracias por utilizar el sistema :DDDD");

    }


}
