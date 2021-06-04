public class Principal {
    public static void main(String[] args) {
        Admin admin1=new Admin("admin","Calle pino8","6361115555","admin","123");
        Casher casher1=new Casher("casher1","Calle tal","123456789","Cajero","123");
        casher1.MakePayment();
        User casher11=new Casher("casher1","Calle tal","123456789","Cajero","123");
        Client client1=new Client("Jose","Calle Uno","876545",500,700);
        Order orden1=new Order(client1,casher1);
        System.out.println(orden1.getTotal());
    }
}
