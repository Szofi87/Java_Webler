package potvizsga.feladat1.model;

import java.sql.Struct;

public class CustomerBTNode {

    private Customer customer;
    private CustomerBTNode left, right;

    public CustomerBTNode(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public CustomerBTNode getLeft() {
        return left;
    }

    public void setLeft(CustomerBTNode left) {
        this.left = left;
    }

    public CustomerBTNode getRight() {
        return right;
    }

    public void setRight(CustomerBTNode right) {
        this.right = right;
    }

    public boolean add(Customer customer) {
        if (customer.getAccountNo() < this.customer.getAccountNo()) {
            if (left != null) {
                return left.add(customer);
            } else {
                left = new CustomerBTNode(customer);
                return true;
            }
        } else if (customer.getAccountNo() > this.customer.getAccountNo()) {
            if (right != null) {
                return right.add(customer);
            } else {
                right = new CustomerBTNode(customer);
                return true;
            }
        }
        return false;
    }

    public int size() {
        int s = 1;
        if (this.left != null) s += this.left.size();
        if (this.right != null) s += this.right.size();
        return s;
    }

    public Customer getByAccountNo(int accountNo) {
        if (accountNo < this.customer.getAccountNo()) {
            if (left != null) {
                return this.left.getByAccountNo(accountNo);
            } else {
                return null;
            }
        } else if (accountNo > this.customer.getAccountNo()) {
            if (right != null) {
                return this.right.getByAccountNo(accountNo);
            } else {
                return null;
            }
        } else {
            return this.customer;
        }
    }

    public Customer getByName(String name) {
        Customer c = null;
        if (this.customer.getName().equals(name)) {
            return this.customer;
        }
        if (this.left != null) {
            c = this.left.getByName(name);
        }
        if (this.right != null && c == null) {
            c = this.right.getByName(name);
        }
        return c;
    }

    public Customer getLowestAccountNo() {
        if(this.left!=null){
            return this.left.getLowestAccountNo();
        } else {
            return this.customer;
        }
    }
}
