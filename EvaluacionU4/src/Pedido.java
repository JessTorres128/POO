import java.util.Scanner;

public class Pedido implements newPedido{
    private int ID;
    private Producto[] productos;
    private double totalCompra;

    public Pedido(int ID){
        this.ID=ID;
        this.setProductos();
    }
    @Override
    public void setProductos() {
        System.out.println("Cuantos productos deseas agregar??");
        Scanner scanner=new Scanner(System.in);
        int cuantas=scanner.nextInt();
        productos=new Producto[cuantas];
        for (int x=0; x< productos.length;x++){
            System.out.println("Que Producto deseas agregar??");
            String p=scanner.next();
            System.out.println("De que marca es?");
            String m= scanner.next();
            System.out.println("Que Precio tiene?");
            double pr=scanner.nextDouble();
            System.out.println("Cuantos productos son?");
            int e=scanner.nextInt();
            productos[x]=new Producto(p,m,pr,e);
        }
        this.settotalCompra();
    }

    @Override
    public void settotalCompra() {
        for(int x=0;x< productos.length;x++){
            totalCompra=totalCompra+(productos[x].getPrecio()*productos[x].getExistencias());
        }
    }
    public double getTotalCompra() { return totalCompra; }

    public void setID(int ID) { this.ID = ID; }
    public int getID() { return ID; }

    public void ImprimirPedido(){
        System.out.println("--------------------------------\n" +
                "ID del pedido #"+this.ID+"" + "");
        for (int x=0;x< productos.length;x++){
            System.out.println(productos[x].getExistencias()+" "+productos[x].getProducto()+"     $"+productos[x].getPrecio());
        }
        System.out.println("Total del pedido $"+totalCompra+"\n" +
                "--------------------------------");

    }

}
