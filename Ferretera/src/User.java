public class User extends Person{
    private String username;
    private String password;
    public User(String name, String address, String phone, String username, String password) {
        super(name, address, phone);
        this.username=username;
        this.password=password;
    }

    public void setUsername(String username) { this.username = username; }
    public String getUsername() { return username; }

    public void setPassword(String password) { this.password = password; }
    public String getPassword() { return password; }
}
