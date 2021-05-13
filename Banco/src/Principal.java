public class Principal {
    public static void main(String[]args){
        Usuario usuario1=new Usuario("Yo","Tal","admin","123");
        boolean respuesta= usuario1.IniciarSesion("admin","dsadsds");

       // System.out.println("Login: "+ respuesta);
        Cliente cliente1=new Cliente("Cliente", "tal", "c1","1111",100);
        cliente1.CargarSaldo(100);
        System.out.println("Saldo: "+cliente1.getSaldo());
        boolean respuesta2= cliente1.IniciarSesion("c1","1111");
        System.out.println(respuesta2);
        cliente1.decirHola();

    }


}
