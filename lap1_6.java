public class lap1_6 {
    private String id;
    private String name;
    private int balance = 0;
    public lap1_6(String id, String name){
        this.id = id;
        this.name = name;
    }
    public  lap1_6(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int credit(int amount){
        this.balance = amount;
        return this.balance;
    }
    public int debit(int amount){
        if (amount <= this.balance){
            this.balance -= amount;
        }else{
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }
    public int transferTo(lap1_6 another ,int amount){
        if(amount <= this.balance){
            this.balance -= amount;
            another.credit(amount);
        }else{
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account[" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ']';
    }
}