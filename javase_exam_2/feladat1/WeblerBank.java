package potvizsga.feladat1;

import potvizsga.feladat1.DB.CustomerDB;
import potvizsga.feladat1.DB.TransactionDB;
import potvizsga.feladat1.model.Customer;
import potvizsga.feladat1.model.Transaction;

public class WeblerBank {

    private static CustomerDB customerDB = new CustomerDB();
    private static TransactionDB transactionDB = new TransactionDB();

    public static void main(String[] args) {
        testDB();
    }

    private static void testDB() {
        // Add test customers to CustomerDB
        Customer c1 = new Customer("Darth Vader");
        Customer c2 = new Customer("Luigi");
        Customer c3 = new Customer("Boris Johnson");
        Customer c4 = new Customer("Jeremy Clarkson");
        Customer c5 = new Customer("Mario");

        customerDB.add(c1);
        customerDB.add(c2);
        customerDB.add(c3);
        customerDB.add(c4);
        customerDB.add(c5);

        // Check if the size of the DB is correct
        boolean test1 = customerDB.size() == 5;
        if (test1) System.out.println("Test 1 passed successfully");
        else System.out.printf("Test 1 failed. Expected value: %d Result: %d.%n", 5, customerDB.size());

        // Check if the customers were inserted and and are correctly returned
        try {
            boolean test2 = customerDB.getByAccountNo(c1.getAccountNo()).equals(c1) &&
                    customerDB.getByAccountNo(c2.getAccountNo()).equals(c2) &&
                    customerDB.getByAccountNo(c3.getAccountNo()).equals(c3) &&
                    customerDB.getByAccountNo(c4.getAccountNo()).equals(c4) &&
                    customerDB.getByAccountNo(c5.getAccountNo()).equals(c5);

            if (test2) System.out.println("Test 2 passed successfully");
        } catch (Exception e) {
            System.out.println("Test 2 failed. Error: " + e.getMessage());
        }

        // Check getByName
        try {
            boolean test3 = customerDB.getByName("Mario").equals(c5);
            if (test3) System.out.println("Test 3 passed successfully");
            else
                System.out.printf("Test 3 failed. Expected value: %s Result: %s.%n", 5, c5, customerDB.getByName("Mario"));
        } catch (Exception e) {
            System.out.println("Test 3 failed. Error: " + e.getMessage());
        }

        // Add test transactions to TransactionDB
        Transaction t1 = new Transaction(c1, c2);
        Transaction t2 = new Transaction(c3, c4);
        Transaction t3 = new Transaction(c5, c1);
        Transaction t4 = new Transaction(c1, c4);
        Transaction t5 = new Transaction(c4, c1);
        Transaction t6 = new Transaction(c3, c2);
        Transaction t7 = new Transaction(c2, c3);
        Transaction t8 = new Transaction(c4, c3);
        Transaction t9 = new Transaction(c4, c2);

        transactionDB.add(t1);
        transactionDB.add(t2);
        transactionDB.add(t3);
        transactionDB.add(t4);
        transactionDB.add(t5);
        transactionDB.add(t6);
        transactionDB.add(t7);
        transactionDB.add(t8);
        transactionDB.add(t9);

        // Check if the size of the DB is correct
        boolean test4 = transactionDB.size() == 9;
        if (test4) System.out.println("Test 4 passed successfully");
        else System.out.printf("Test 4 failed. Expected value: %d Result: %d.%n", 9, transactionDB.size());

        // Check if the transactions were inserted and and are correctly returned
        try {
            boolean test5 = transactionDB.getByTransactionId(t1.getTransactionNo()).equals(t1) &&
                    transactionDB.getByTransactionId(t2.getTransactionNo()).equals(t2) &&
                    transactionDB.getByTransactionId(t3.getTransactionNo()).equals(t3) &&
                    transactionDB.getByTransactionId(t4.getTransactionNo()).equals(t4) &&
                    transactionDB.getByTransactionId(t5.getTransactionNo()).equals(t5) &&
                    transactionDB.getByTransactionId(t6.getTransactionNo()).equals(t6) &&
                    transactionDB.getByTransactionId(t7.getTransactionNo()).equals(t7) &&
                    transactionDB.getByTransactionId(t8.getTransactionNo()).equals(t8) &&
                    transactionDB.getByTransactionId(t9.getTransactionNo()).equals(t9);
            if (test5) System.out.println("Test 5 passed successfully");
        } catch (Exception e) {
            System.out.println("Test 5 failed. Error: " + e.getMessage());
        }

        // Check getByName
        try {
            boolean test6 = transactionDB.getLatest().equals(t9);
            if (test6) System.out.println("Test 6 passed successfully");
            else
                System.out.printf("Test 6 failed. Expected value: %s Result: %s.%n", 5, t9, transactionDB.getLatest());
        } catch (Exception e) {
            System.out.println("Test 6 failed. Error: " + e.getMessage());
        }

    }


}
