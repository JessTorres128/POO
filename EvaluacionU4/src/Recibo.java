import java.util.Scanner;

public class Recibo implements newRecibo {
    private int ID;
    private Cliente cliente1;
    private Producto[] productoss;
    private double totalCompra;
    public Recibo(int ID, Cliente cliente1){
        this.ID=ID;
        this.cliente1=cliente1;
        this.setProductos();
    }
    @Override
    public void setProductos() {
        System.out.println("Cuantos productos deseas agregar??");
        Scanner scanner=new Scanner(System.in);
        int cuantas=scanner.nextInt();
        productoss=new Producto[cuantas];
        for (int x=0; x< productoss.length;x++){
            System.out.println("Que Producto deseas agregar??");
            String p=scanner.next();
            System.out.println("De que marca es?");
            String m= scanner.next();
            System.out.println("Que Precio tiene?");
            double pr=scanner.nextDouble();
            System.out.println("Cuantos productos son?");
            int e=scanner.nextInt();
            productoss[x]=new Producto(p,m,pr,e);
        }
        this.settotalCompra();
    }

    @Override
    public void settotalCompra() {
        for(int x=0;x< productoss.length;x++){
            totalCompra=totalCompra+productoss[x].getPrecio();
        }
    }
    public void ImprimirReciboDC(){
        System.out.println("--------------------------------\n" +
                "ID del pedido #"+this.ID+"\n" +
                "Cliente " + cliente1.getNombre());
        for (int x=0;x< productoss.length;x++){
            System.out.println(productoss[x].getExistencias()+" "+productoss[x].getProducto()+"     $"+productoss[x].getPrecio());
        }
        System.out.println("Total del pedido $"+totalCompra+"\n" +
                "--------------------------------");
    }

    public void setID(int ID) { this.ID = ID; }
    public int getID() { return ID; }

}
