import java.util.Scanner;

public class Principal {
    public static void main (String[] args){



Scanner Scanner= new Scanner(System.in);
Bienvenido();
        System.out.println("Introduce la contraseña: (contra12345)");
        String contra=Scanner.next();
        System.out.println("Introduce la medida de un lado de un cuadrado");
        int num=Scanner.nextInt();
        System.out.println("Ahora la otra medida ");
int num2=Scanner.nextInt();
if (num==num2){
float sacararea=AArea(num, num2);
    System.out.println("El area del cuadrado es: "+sacararea);
}else{
    String nojalo=Error();
    System.out.println(nojalo);
}
        verificar(contra);

    }
    public static void verificar(String cont){ //recibe y no regresa
        if (cont==("contra12345")){
            System.out.println("contraseña correcta");
        }else{
            System.out.println("contraseña incorrecta :(");
        }

    }
    public static String Error(){ //no recibe y regresa
        String error= ("Error, los valores dados son de un rectangulo");
        return error;
    }
    public static float AArea(int lad1, int lad2){ //recibe y regresa
float Area=lad1*lad2;
return Area;
    }

    public static void Bienvenido (){ //no hace nada
        System.out.println("Bienvenido al programa");
    }
}
