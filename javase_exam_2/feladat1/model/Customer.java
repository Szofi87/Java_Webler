package potvizsga.feladat1.model;

import java.util.Random;

public class Customer {
    private String name;
    private int accountNo;

    public Customer(String name) {
        this.name = name;
        this.accountNo = new Random().nextInt(900000) + 100000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
}
