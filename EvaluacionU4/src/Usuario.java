public abstract class Usuario extends Persona{
    private String Usuario;
    private String Password;
    public Usuario(String Nombre, String Apellido, int Edad, String Usuario, String Password) {
        super(Nombre, Apellido, Edad);
        this.Usuario=Usuario;
        this.Password=Password;
    }

    public void setUsuario(String usuario) { Usuario = usuario; }
    public String getUsuario() { return Usuario; }

    public void setPassword(String password) { Password = password; }
    public String getPassword() { return Password; }

    public abstract void CambiarPass();
}
