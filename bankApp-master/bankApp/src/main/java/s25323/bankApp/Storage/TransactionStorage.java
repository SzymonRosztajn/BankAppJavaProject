package s25323.bankApp.Storage;

import org.springframework.stereotype.Component;
import s25323.bankApp.Model.Client;
import s25323.bankApp.Model.StatusType;
import s25323.bankApp.Model.Transaction;

import java.util.ArrayList;
import java.util.List;

@Component
public class TransactionStorage {
    public final List<Transaction> transactionList = new ArrayList<>();

    public TransactionStorage() {
        this.transactionList.add(new Transaction("1", StatusType.ACCEPTED, new Client("1", "Zbyszek", 500)));
        this.transactionList.add(new Transaction("2", StatusType.DECLINED, new Client("2", "Jurek", 1500)));
        this.transactionList.add(new Transaction("3", StatusType.ACCEPTED, new Client("3", "Mariusz", 300)));
    }

    public Transaction findTransactionByID(String transID) {
        for (Transaction transaction : transactionList) {
            if (transaction.getTransID().equals(transID)) {
                return transaction;
            }
        }
        return null;
    }

    public void addNewTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }
}

