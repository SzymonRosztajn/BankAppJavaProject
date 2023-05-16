package s25323.bankApp.Service;


import org.springframework.stereotype.Component;
import s25323.bankApp.Model.Client;
import s25323.bankApp.Model.StatusType;
import s25323.bankApp.Model.Transaction;
import s25323.bankApp.Storage.TransactionStorage;

import java.util.List;

@Component
public class TransactionService {
    public TransactionStorage transactionStorage;

    public TransactionService(TransactionStorage transactionStorage) {
        this.transactionStorage = transactionStorage;
    }

    public List<Transaction> getAllTransactions() {
        return transactionStorage.getTransactionList();
    }
    public Transaction createTransaction(String transID, StatusType status, Client client){
        transactionStorage.addNewTransaction(new Transaction(transID, status, client));
        return new Transaction(transID, status, client);
    }
    public void changeStatus(String transID, StatusType status) {
        Transaction transaction = transactionStorage.findTransactionByID(transID); {
            transaction.setStatus(status);
        }
    }
}
