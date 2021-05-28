import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Reservacion ArrRes []=new Reservacion[0];
        Hotel ArrHot[]=new Hotel[0];
        int cr=0;
        Scanner scanner=new Scanner(System.in);
        int c=0;
        int conh=0;
        while(c!=6){
            System.out.println("Bienvenido al sistema de hoteles\n" +
                    "Opciones\n" +
                    "1)Crear reservaciones\n" +
                    "2)Checar la capacidad porcentual del hotel\n" +
                    "3)Checar el total de habitaciones del hotel\n" +
                    "4)Checar pagos pendientes\n" +
                    "5)Imprimir Ticket\n" +
                    "6)Salir\n");
            c=scanner.nextInt();
            switch (c){
                case 1:{//Crear reservaciones
                    System.out.println("Cuantas reservaciones deseas crear????");
                    cr=scanner.nextInt();
                    ArrRes=new Reservacion[cr];
                    ArrHot=new Hotel[cr];
                    for (int con=0; con<cr; con++){
                        System.out.println("En cual hotel se va a hacer la reservación # "+(con+1));
                        String n=scanner.next();
                        System.out.println("Cuantas habitaciones tiene disponible el hotel "+n);
                        int d=scanner.nextInt();
                        System.out.println("Cuantas habitaciones tiene ocupadas el hotel "+n);
                        int o=scanner.nextInt();
                        System.out.println("Que dia fue hecha la reservación?");

                        String f=scanner.next();

                        System.out.println("Para cuantos dias fue hecha la reservación "+(con+1)+"??");

                        int dias=scanner.nextInt();

                        System.out.println("Cuanto anticipo fue dado para la reservación??");
                        double an=scanner.nextDouble();
                        ArrRes[con]=new Reservacion(f,dias,an,n,o,d);
                        ArrHot[con]=new Hotel(n,o,d);
                   }
               break; }
                case 2:{//Checar la capacidad porcentual del hotel
                    if(cr!=0){
                        System.out.println("De que hotel deseas chehcar la capacidad");
                        for (int con1=0; con1<cr; con1++){
                            System.out.println((con1+1)+")"+ArrRes[con1].nombre);
                        }
                         conh=scanner.nextInt();
                        ArrRes[(conh-1)].ImprimirCapacidad(ArrHot[(conh-1)].getNombre(),ArrHot[(conh-1)].getDisponibles(),ArrHot[(conh-1)].getOcupadas());
                    }else{
                        System.out.println("No se han creado hoteles todavia");
                    }
                break;}

                case 3:{//Checar el total de habitaciones del hotel
                    if(cr!=0){
                        System.out.println("De que hotel deseas chehcar la capacidad");
                        for (int con1=0; con1<cr; con1++){
                            System.out.println((con1+1)+")"+ArrRes[con1].nombre);
                        }
                         conh=scanner.nextInt();
                        ArrHot[(conh-1)].ImprimirCapacidad(ArrRes[(conh-1)].getNombre(),ArrRes[(conh-1)].getOcupadas(),ArrRes[(conh-1)].getDisponibles());
                    }else{
                        System.out.println("No se han creado hoteles todavia");
                    }
                    break;}

                case 4:{//Checar pagos porcentuales
                    if(cr!=0){
                        System.out.println("De que reservación deseas checar lo faltante del pago");
                        for (int con1=0; con1<cr; con1++){
                            System.out.println((con1+1)+")"+ArrRes[con1].nombre);
                        }
                        conh=scanner.nextInt();
                        ArrRes[(conh-1)].ImprimirPagoEnPC(ArrRes[(conh-1)].getAnticipo());
                    }else{
                        System.out.println("No se han creado hoteles todavia");
                    }
                break;}

                case 5:{//Imprimir Tickets
                    if(cr!=0){
                        System.out.println("De cual reservación deseas revisar el Ticket");
                        for (int con1=0; con1<cr; con1++){
                            System.out.println((con1+1)+")"+ArrRes[con1].nombre);
                        }
                        conh=scanner.nextInt();
                        ArrRes[(conh-1)].ImprimirTicket(ArrRes[(conh-1)].getNombre(),ArrRes[(conh-1)].getFecha(),ArrRes[(conh-1)].getDias(),ArrRes[(conh-1)].getAnticipo());
                    }else{
                        System.out.println("No se han creado hoteles todavia");
                    }
                     break;}

                case 6:{//Salir
                    System.out.println("BYEEEEEEEE");
                break;}
                default:{
                    System.out.println("No se ha seleccionado una opción valida");
                }
            }
        }
    }
}
