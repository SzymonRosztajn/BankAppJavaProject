package s25323.bankApp.Model;

public class Transaction {
    private final String transID;
    private StatusType status;
    private final Client client;


    public Transaction(String transID, StatusType status, Client client) {
        this.transID = transID;
        this.status = status;
        this.client = client;

    }

    public String getTransID() {
        return transID;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transID='" + transID + '\'' +
                ", status=" + status +
                ", client=" + client +
                '}';
    }
}

