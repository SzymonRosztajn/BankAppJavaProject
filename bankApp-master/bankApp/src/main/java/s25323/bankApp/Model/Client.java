package s25323.bankApp.Model;

public class Client {
    public final String uuid;
    public final String name;
    public int balance;

    public Client(String uuid, String name, int balance) {
        this.uuid = uuid;
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Client{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
