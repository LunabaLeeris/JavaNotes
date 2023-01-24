public class createAcc {
    private String password;
    private int balance = 0;

    createAcc(String password) {
        set_password(password);
    }

    public void get_password(String password) {
        if (password.equals(this.password)) {
            System.out.println("your current password "+this.password+"");
        } else {
            System.out.println("Incorrect Password");
        }
    }

    public void get_balance(String password){
        if (password.equals(this.password)){
            System.out.println("your balance: "+this.balance+"");
        }
        else{
            System.out.println("Incorrect Password");
        }
    }

    public void set_balance(String password, int balance){
        if (this.password.equals(password)){
            System.out.println("balance succsefully set to "+balance+"");
            this.balance = balance;
        }
        else{
            System.out.println("HACKER!!");
        }
    }

    public void set_password(String password) {
        if (this.password == null){
            this.password = password;
        }

    }

    public void set_password(String previous_password, String new_password) {
        if (previous_password.equals(this.password)) {
            this.password = new_password;
            System.out.println("password changed successfully");
        }
        else {
            System.out.println("Incorrect Password");
        }
    }
}
