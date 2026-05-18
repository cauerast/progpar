package dc.unifacef.store.Controller;

import dc.unifacef.store.Model.Customer;
import dc.unifacef.store.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    // dependence injection
    @Autowired
    CustomerService service;

    @GetMapping
    public ResponseEntity<List<Customer>> getCustomer(){
        return ResponseEntity.ok(service.getCustomers());
    }

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
        Customer c = service.createCustomer(customer);
        URI uri = URI.create("/customer/" + c.getId());
        return ResponseEntity.created(uri).body(c);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeCustomer(@PathVariable Long id){
        if(service.deleteCustomer(id)){
            return ResponseEntity.noContent().build(); // 204
        } else {
            return ResponseEntity.notFound().build(); // 404
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Customer> patch(@PathVariable Long id, @RequestBody Customer customer){
        Customer c = service.patch(id, customer);
        if(c != null){
            return ResponseEntity.ok(c); // 201
        } else {
            return ResponseEntity.notFound().build(); // 404
        }
    }


}
