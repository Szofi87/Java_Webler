package potvizsga.feladat1.model;

import java.util.Date;
import java.util.Random;

public class Transaction {

    private Customer sender, recipient;
    private Date date;
    private int transactionNo;

    public Transaction(Customer sender, Customer recipient) {
        this.sender = sender;
        this.recipient = recipient;
        this.date = new Date();
        this.transactionNo = new Random().nextInt(900000) + 100000;
    }

    public Customer getSender() {
        return sender;
    }

    public void setSender(Customer sender) {
        this.sender = sender;
    }

    public Customer getRecipient() {
        return recipient;
    }

    public void setRecipient(Customer recipient) {
        this.recipient = recipient;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(int transactionNo) {
        this.transactionNo = transactionNo;
    }
}
