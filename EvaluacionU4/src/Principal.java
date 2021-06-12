import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int cuantosc=0;
        Admin admin1=new Admin("Jesse","Torres",18,"Admin","Admin123");
        int OP=0;
        int cuantosp=0;
        Cliente[] ArrCl=new Cliente[0];
        Pedido[] ArrPe=new Pedido[0];
        Recibo[] ArrRe=new Recibo[0];
        int cuantosre=0;
        while(OP!=5){
            System.out.println("Bienvenido al sistema de la tienda, que desea hacer...\n" +
                    "1)Crear un cliente\n" +
                    "2)Agregar un pedido de la tienda\n" +
                    "3)Añadir la Compra de un cliente\n" +
                    "4)Funciones especiales (Imprimir Recibos)\n" +
                    "5)Salir\n" +
                    "DISCLAIMER: Por alguna razón para usar las demás funciones necesita\n" +
                    "primero crearse un cliente, si no te tira error :/");
            Scanner scanner=new Scanner(System.in);
            OP=scanner.nextInt();
            switch (OP){
                case 1:{//Crear un cliente
                    System.out.println("Cuántos clientes deseas crear?");
                    cuantosc=scanner.nextInt();
                    ArrCl=new Cliente[cuantosc];
                    for (int x=0; x< ArrCl.length; x++){
                        System.out.println("Inserte nombre del cliente "+(x+1));
                        String n=scanner.next();
                        System.out.println("Cual es el apellido del cliente "+(x+1));
                        String a=scanner.next();
                        System.out.println("Cuál es la edad del cliente "+(x+1));

                        int ed=scanner.nextInt();

                        System.out.println("Cual es el usuario del cliente "+(x+1));

                        String u=scanner.next();

                        System.out.println("Cual es el Password del cliente "+(x+1));

                        String p=scanner.next();

                        System.out.println("Cuánto saldo tiene el cliente "+(x+1));

                        double s=scanner.nextDouble();

                        ArrCl[x]=new Cliente(n,a,ed,u,p,s);
                    }
                    System.out.println("Todos los clientes han sido creados con exitos");
                break;}
                case 2:{//Crear un pedido
                    System.out.println("Cuántos pedidos deseas crear?");
                    cuantosp=scanner.nextInt();
                    ArrPe=new Pedido[cuantosp];
                    for (int xp=0; xp< ArrPe.length; xp++){
                        int id=(xp+1);
                        ArrPe[xp]=new Pedido(id);
                    }
                break;}

                case 3:{//Agregar una compra de un cliente
                    System.out.println("Cuántas compras de clientes deseas agregar?");
                    cuantosre=scanner.nextInt();
                    ArrRe=new Recibo[cuantosre];
                    for (int xr=0; xr<cuantosre; xr++){
                        int id=(xr+1);
                        System.out.println("Cual cliente fue el que hizo la compra");
                        for (int xccl=0; xccl< ArrCl.length; xccl++){
                            System.out.println((xccl+1)+")"+ArrCl[xccl].getNombre());
                        }
                        int CCLI=scanner.nextInt();
                            ArrRe[xr]=new Recibo(id,ArrCl[(CCLI-1)]);
                    }
                break;}
                case 4:{
                    System.out.println("Que funcion deseas ejecutar?\n" +
                            "1)Imprimir un recibo de un cliente\n" +
                            "2)Imprimir un recibo de un pedido\n" +
                            "3)Cambiar contraseñas\n" +
                            "4)Mostrar los datos del administrador");
                    int OR=scanner.nextInt();
                    switch (OR){
                        case 1:{
                            System.out.println("Cual recibo de cliente deseas imprimir");
                            for (int x=0; x<cuantosp; x++){
                                System.out.println((x+1)+")Pedido con ID 00"+ArrRe[x].getID());
                            }
                            int cup=scanner.nextInt();
                            ArrPe[(cup-1)].ImprimirPedido();
                        break;}
                        case 2:{
                            System.out.println("De que pedido deseas imprimir el recibo");
                            for (int x=0; x<cuantosp; x++){
                                System.out.println((x+1)+")Pedido con ID 00"+ArrPe[x].getID());
                            }
                            int cup=scanner.nextInt();
                            ArrPe[(cup-1)].ImprimirPedido();
                        break;}
                        case 3:{
                            System.out.println("A quine le deseas cambiar la contraseña\n" +
                                    "1)Admin\n" +
                                    "2)Cliente");
                            int aqw= scanner.nextInt();
                            switch (aqw){
                                case 1:{
                                    admin1.CambiarPass();
                               break; }
                                case 2:{
                                    System.out.println("A cual cliente le deseas cambiar la contraseña");
                                    for (int xccl=0; xccl< ArrCl.length; xccl++){
                                        System.out.println((xccl+1)+")"+ArrCl[xccl].getNombre());
                                    }
                                    aqw= scanner.nextInt();
                                   boolean respuesta = ArrCl[(aqw-1)].VerificarPass(admin1.getPassword());
                                    if (respuesta==true){
                                        ArrCl[(aqw-1)].CambiarPass();
                                    }else {
                                        System.out.println("La contraseña introducida es incorrecta, intente de nuevo");
                                    }
                                break;}
                            }
                        break;}
                        case 4:{
                            System.out.println("Los datos del Administrador son\n" +
                                    "Usuario: "+admin1.getUsuario()+"\n"+
                                    "Password: "+admin1.getPassword()+"\n");
                        break;}
                        default:{ System.out.println("Mal ahi"); }
                    }


                break;}

                case 5:{//Salir
                    System.out.println("Gracias por usar el programa :DDDDD");
               break; }

                default:{
                    System.out.println("Opción fuera de la lista");
                }

            }
        }



    }
}
