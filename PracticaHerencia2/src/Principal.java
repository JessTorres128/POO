import java.util.Scanner;

public class Principal {
    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);
        Celular[] ArrCel= new Celular[0];
        int cuantosc=0;
        Servidor[] ArrS=new Servidor[0];
        int cuantoss=0;
        Pc[] ArrPc=new Pc[0];
        int cuantospc=0;
        int o = 0;

while(o!=5){
    System.out.println("Bienvenido al sistema de provincias \n" +
            "¿Qué desea hacer? \n" +
            "1)Crear Celular \n" +
            "2)Crear una PC \n" +
            "3)Crear Servidor \n" +
            "4)Funciones Especiales\n"+
            "5)Salir\n...");

    o=scanner.nextInt();
    switch (o){
        case 1:{//Crear Celular
            System.out.println("Cuántos celulares deseas crear?");
             cuantosc=scanner.nextInt();
            ArrCel=new Celular[cuantosc];
            for (int xC=0; xC<cuantosc; xC++){
                System.out.println("Inserte nombre del celular "+(xC+1));
                String n=scanner.next();
                System.out.println("Cuánta memoria RAM posee el celular "+(xC+1));
                double r=scanner.nextDouble();
                System.out.println("Cuál es el procesador del celular "+(xC+1));
              //  System.out.println("\n");
                String p=scanner.next();
                // p=scanner.nextLine();
                System.out.println("Cuánto saldo tiene el celular "+(xC+1));
                double s=scanner.nextDouble();
                ArrCel[xC]=new Celular(s,n,r,p);
            }
break; }

        case 2:{//Crear PC
            System.out.println("Cuántas PCs deseas crear?");
             cuantospc=scanner.nextInt();
             ArrPc=new Pc[cuantospc];
            for (int xPC=0; xPC<cuantospc; xPC++){
                System.out.println("Inserte nombre del PC "+(xPC+1));
                String n=scanner.next();
                System.out.println("Cuanta memoria RAM posee el PC "+(xPC+1));
                double r=scanner.nextDouble();
                System.out.println("Cual es el procesador del PC "+(xPC+1));

                String p=scanner.next();
                System.out.println("Que marca de teclado tiene el PC "+(xPC+1));

                String mt=scanner.next();

                ArrPc[xPC]=new Pc(mt,n,r,p);
             }
            break; }

        case 3:{//Crear Servidor
            System.out.println("Cuántos Servidores deseas crear?");

             cuantoss=scanner.nextInt();

             ArrS=new Servidor[cuantoss];
            for (int xS=0; xS<cuantoss; xS++){


                System.out.println("Inserte nombre del Servidor "+(xS+1));
                String n=scanner.next();
                System.out.println("Cuanta memoria RAM posee el Servidor "+(xS+1));
                double r=scanner.nextDouble();
                System.out.println("Cual es el procesador del Servidor(? "+(xS+1));

                String p=scanner.next();
                System.out.println("Que marca de teclado tiene el PC del Servidor "+(xS+1));

                String mt=scanner.next();
                System.out.println("Que Zona Horaria maneja el Servidor "+(xS+1));

                String z=scanner.next();

                ArrS[xS]=new Servidor(z,mt,n,r,p);
       }
            break; }

        case 4:{
            int op=0;
            while(op!=5){
                System.out.println("Que función especial desea ejecutar:\n" +
                        "1)Enviar SMS\n" +
                        "2)Encender Webcam\n" +
                        "3)Aumentar Ram\n" +
                        "4)Elimianar la Cache\n" +
                        "5)Salir");
                op= scanner.nextInt();
                switch (op){
                    case 1:{//Enviar SMS
                        if (cuantosc==0){
                            System.out.println("Error, no se ha creado ningun celular");
                        break;}else{
                            System.out.println("Desde cuál celular deseas enviar el SMS");
                            for (int x=0; x<cuantosc; x++){
                                System.out.println((x+1)+")Celular "+ArrCel[x].getNombre());
                            }
                            int opcionc= scanner.nextInt();
                        ArrCel[(opcionc-1)].enviarSMS(ArrCel[(opcionc-1)].getSaldo());
                        }


                    break;}

                    case 2:{//Encender WebCam
                        if (cuantospc==0){
                            System.out.println("Error, no se ha creado ningun Pc");
                            break;}else{
                            System.out.println("Desde cuál Pc deseas encender la cámara");
                            for (int x=0; x<cuantospc; x++){
                                System.out.println((x+1)+")Pc "+ArrPc[x].getNombre());
                            }
                            int opcionpc= scanner.nextInt();
                            ArrPc[(opcionpc-1)].EncenderWebCam();
                        }
                    break;}
                    case 3:{//Aumentar RAM
                        if (cuantoss==0){
                            System.out.println("Error, no se ha creado ningun Servidor");
                            break;}else{
                            System.out.println("A cual Servidor le quieres aumentar RAM");
                            for (int x=0; x<cuantoss; x++){
                                System.out.println((x+1)+")Servidor "+ArrS[x].getNombre());
                            }
                            int opcionc= scanner.nextInt();
                            ArrS[(opcionc-1)].AumentarRAM(ArrS[(opcionc-1)].getMemoriaram());
                        }

                    break;}
                    case 4:{
                        int opCS=0;
                        while (opCS!=4){
                            System.out.println("A que dispositivo deseas eliminar la Cache:\n" +
                                    "1)Celular\n" +
                                    "2)Pc\n" +
                                    "3)Servidor\n" +
                                    "4)A ninguno perdón no loe queria dar a esta opción\n");
                            opCS= scanner.nextInt();
                            switch (opCS){
                                case 1:{
                                    if (cuantosc==0){
                                        System.out.println("Error, no se ha creado ningun celular");
                                        break;}else{
                                        System.out.println("A cual celular le quieres eliminar la cache");
                                        for (int x=0; x<cuantosc; x++){
                                            System.out.println((x+1)+")Celular "+ArrCel[x].getNombre());
                                        }
                                        int opcionc= scanner.nextInt();
                                        ArrCel[(opcionc-1)].EliminarCache();
                                    }
                               break; }
                                case 2:{
                                    if (cuantospc==0){
                                        System.out.println("Error, no se ha creado ningun Pc");
                                        break;}else{
                                        System.out.println("Desde cuál Pc deseas encender la cámara");
                                        for (int x=0; x<cuantospc; x++){
                                            System.out.println((x+1)+")Pc "+ArrPc[x].getNombre());
                                        }
                                        int opcionpc= scanner.nextInt();
                                        ArrPc[(opcionpc-1)].EliminarCache();
                                    }

                                break;}

                                case 3:{
                                    if (cuantoss==0){
                                        System.out.println("Error, no se ha creado ningun Servidor");
                                        break;}else{
                                        System.out.println("A cual Servidor le quieres limpiar la Cache");
                                        for (int x=0; x<cuantoss; x++){
                                            System.out.println((x+1)+")Servidor "+ArrS[x].getNombre());
                                        }
                                        int opcionc= scanner.nextInt();
                                        ArrS[(opcionc-1)].EliminarCache();
                                    }
                                break;}
                                case 4:{
                                    System.out.println("Ni modo :9");
                                break;}
                                default:{
                                    System.out.println("Opción no valida");
                                }
                            }
                        }
                    }
                }
            }
        break;}
        case 5:{ System.out.println("BYEEEEEEEEE");
            break;}
        default:{ System.out.println("Opción no valida"); }
    }

        }
    }
}

