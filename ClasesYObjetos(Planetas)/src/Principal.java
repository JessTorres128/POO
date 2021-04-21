public class Principal {
    public static void main (String[] args){
Planet x=new Planet("Tierra", 14234, "solid", 365, 45000);
Planet mercurio= new Planet("Mercurio",5770543,"gas", 88,150430);
Asteroid A_128=new Asteroid("A-128","solid",18000,1800);
        Asteroid P_363=new Asteroid("A-363","solid",63000,8300);
        Asteroid R_643=new Asteroid("R-643","solid",32000,3400);
        x.mass= 1500;
        System.out.println(mercurio.getName());
        System.out.println(x.getName());
        x.setName("Earth");

    }
}
