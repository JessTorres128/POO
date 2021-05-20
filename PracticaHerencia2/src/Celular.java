import java.util.Scanner;

public class Celular extends Dispositivo{
protected double Saldo;
Scanner scannerSMS=new Scanner(System.in);
public Celular(double Saldo, String nombre, double memoriaram, String procesador){
    super(nombre, memoriaram, procesador);
this.Saldo=Saldo;
}

    public void setSaldo(double saldo) { Saldo = saldo; }
    public double getSaldo() { return Saldo; }

    public double enviarSMS( double Saldo){
        System.out.println("Que mensaje deseas mandar??");
        String Mensaje=scannerSMS.next();
        if (Saldo==0){
            System.out.println("El mensaje no se pudo enviar, no cuenta con saldo suficiente");
        }else{
            Saldo=Saldo-1;
            System.out.println("Mensaje enviado, su saldo quedó en "+Saldo);

        }
       this.Saldo=Saldo;
        return Saldo;
    }

    @Override
    public void EliminarCache() {
        super.EliminarCache();
        System.out.println("Se ha eliminado la cache del celular exitosamente");

}
}

