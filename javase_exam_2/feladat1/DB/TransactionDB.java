package potvizsga.feladat1.DB;

import potvizsga.feladat1.model.Transaction;
import potvizsga.feladat1.model.TransactionLLNode;

public class TransactionDB {

    private TransactionLLNode head;

    public boolean add(Transaction transaction) {
        if(head != null) {
            return head.add(transaction);
        } else {
            this.head = new TransactionLLNode(transaction);
            return true;
        }
    }

    public Transaction getLatest() {
        if(head != null) {
            return head.getLatest();
        } else {
            return null;
        }
    }

    public Transaction getByTransactionId(int transactionId) {
        if(head != null) {
            return head.getByTransactionId(transactionId);
        } else {
            return null;
        }
    }

    public int size() {
        if(head != null) {
            return head.size();
        } else {
            return 0;
        }
    }

}
