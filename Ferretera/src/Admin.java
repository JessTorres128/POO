public class Admin extends User{

    public Admin(String name, String address, String phone, String username, String password) {
        super(name, address, phone, username, password);
    }
    public void ChangePassword(String nuevo){
        super.setPassword(nuevo);
    }
}
