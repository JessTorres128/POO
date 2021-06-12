import java.util.Scanner;

public class Admin extends Usuario{


    public Admin(String Nombre, String Apellido, int Edad, String Usuario, String Password) {
        super(Nombre, Apellido, Edad, Usuario, Password);
    }

    @Override
    public void CambiarPass() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce la nueva contraseña");
        String nueva=scanner.next();
        super.setPassword(nueva);
        System.out.println("Contraseña cambiada correctamente");
    }

}
