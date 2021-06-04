import java.util.Scanner;

public class Order implements newOrder{
    private double total;
    private Part[] partes;
    private Casher casher;
    private Client client;

    public Order(Client client, Casher casher){
        this.client=client;
        this.casher=casher;
        this.setPartes();

    }

    @Override
    public void setPartes() {
        System.out.println("Cuanto de partes ocupas??");
        Scanner scanner=new Scanner(System.in);
        int cuantas=scanner.nextInt();
        partes=new Part[cuantas];
        for (int x=0; x<cuantas;x++){
            partes[x]=new Part("parte"+x,200*x,"brand"+x);


        }
this.setTotal();
    }

    @Override
    public void setClient() {

    }

    @Override
    public void setTotal() {

        for(int x=0;x< partes.length;x++){
            total=total+partes[x].getPrice();
        }
    }

    public double getTotal() {
        return total;
    }
}
