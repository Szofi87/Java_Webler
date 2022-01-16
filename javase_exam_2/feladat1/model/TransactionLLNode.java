package potvizsga.feladat1.model;

public class TransactionLLNode {

    private Transaction transaction;
    private TransactionLLNode next;


    public TransactionLLNode(Transaction transaction) {
        this.transaction = transaction;
        this.next = next;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public TransactionLLNode getNext() {
        return next;
    }

    public void setNext(TransactionLLNode next) {
        this.next = next;
    }

    public boolean add(Transaction transaction) {
        if(this.next != null) {
            return this.next.add(transaction);
        } else {
            this.next = new TransactionLLNode(transaction);
            return true;
        }
    }

    public int size() {
        int s = 1;
        if(this.next != null) {
            s += this.next.size();
        }
        return s;
    }

    public Transaction getByTransactionId(int transactionId) {
        if(this.transaction.getTransactionNo()== transactionId) {
            return this.transaction;
        } else {
            if(this.next != null) {
                return this.next.getByTransactionId(transactionId);
            } else {
                return null;
            }
        }
    }

    public Transaction getLatest() {
        if(this.next != null) {
            return this.next.getLatest();
        } else {
            return this.transaction;
        }
    }
}