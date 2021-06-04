public class Client extends Person{
    private double credit;
    private double maxcredit;
    public Client(String name, String address, String phone,double credit, double maxcredit) {
        super(name, address, phone);
        this.credit=credit;
        this.maxcredit=maxcredit;
    }

    public void setCredit(double credit) { this.credit = credit; }
    public double getCredit() { return credit; }

    public void setMaxcredit(double maxcredit) { this.maxcredit = maxcredit; }
    public double getMaxcredit() { return maxcredit; }
}
