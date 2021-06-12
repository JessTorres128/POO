import java.util.Scanner;

public class Cliente extends Usuario{
    private double Saldo;

    public Cliente(String Nombre, String Apellido, int Edad, String Usuario, String Password, double Saldo) {
        super(Nombre, Apellido, Edad, Usuario, Password);
        this.Saldo=Saldo;
    }
    @Override
    public void CambiarPass() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce la nueva contraseña");
        String nueva=scanner.next();
        super.setPassword(nueva);
        System.out.println("Contraseña cambiada correctamente");

    }
    public boolean VerificarPass(String Pass){
        System.out.println("Introduce la contraseña del admin para continuar");
        Scanner scanner=new Scanner(System.in);
        String Passsword=scanner.next();
        if (Pass.equals(Passsword)){
            return true;
        }else{
            return false;
        }
    }

    public void setSaldo(double saldo) { Saldo = saldo; }
    public double getSaldo() { return Saldo; }
}
