public class Cliente extends Usuario {
    private double Saldo;


    public Cliente(String nombre, String ap, String usuario, String password, double Saldo) {
        super(nombre, ap, usuario, password);
        this.Saldo=Saldo;
    }

    public void setSaldo(double saldo) { Saldo = saldo; }

    public double getSaldo() { return Saldo; }

    public void CargarSaldo(double saldo){
        this.Saldo=this.Saldo + saldo;
    }
    @Override
    public boolean IniciarSesion(String usuario, String password) {
        System.out.println("Acceso denegado"+ super.getNombre());
        return false;
    }

    @Override
    public void decirHola() {
        System.out.println("HOLAAAAAAAAAAAA (Desde Cliente)");
        super.decirHola();
    }

}
