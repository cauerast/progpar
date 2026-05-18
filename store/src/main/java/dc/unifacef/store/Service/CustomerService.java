package dc.unifacef.store.Service;

import dc.unifacef.store.Model.Customer;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerService {
    private Long id = 1L;
    List<Customer> customers = new ArrayList<>();

    // get
    public List<Customer> getCustomers(){
        if(!this.customers.isEmpty()){
            return this.customers;
        }
        else return null;
    }

    // post
    public Customer createCustomer(Customer customer){
        customer.setId(id);
        this.customers.add(customer);
        id++;
        return customer;
    }

    // delete
    public boolean deleteCustomer(Long id){
        return this.customers.removeIf(c -> c.getId().equals(id));
    }

    // patch
    public Customer patch(Long id, Customer c){
        c.setId(id);
        for(Customer customer : customers){
            if(customer.getId().equals(id)){
                this.customers.set(customers.indexOf(customer), c);
                return c;
            }
        }
        return null;
    }





}
