package potvizsga.feladat1.DB;

import potvizsga.feladat1.model.Customer;
import potvizsga.feladat1.model.CustomerBTNode;

public class CustomerDB {

    private CustomerBTNode root;

    public boolean add(Customer customer) {
        if(root != null) {
            return root.add(customer);
        } else {
            root = new CustomerBTNode(customer);
            return true;
        }
    }

    public Customer getByName(String name) {
        if(root != null) {
            return root.getByName(name);
        } else {
            return null;
        }
    }

    public Customer getByAccountNo(int accountNo) {
        if(root != null) {
            return root.getByAccountNo(accountNo);
        } else {
            return null;
        }
    }

    public Customer getLowestAccountNo() {
        if(root != null) {
            return root.getLowestAccountNo();
        } else {
            return null;
        }
    }

    public int size() {
        if(root != null) {
            return root.size();
        } else {
            return 0;
        }
    }
}
