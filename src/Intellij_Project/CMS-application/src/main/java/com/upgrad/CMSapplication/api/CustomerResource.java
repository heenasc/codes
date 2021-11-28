package com.upgrad.CMSapplication.api;
import com.upgrad.CMSapplication.customerservice.CustomerService;
import com.upgrad.CMSapplication.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api")
//@RequestMapping(value= "/customers")
public class CustomerResource {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer)
    {
        return customerService.addCustomer(customer);
    }
    @GetMapping
    public List<Customer> getCustomers(){//to get customer
        return customerService.getCustomers();
    }
    @GetMapping(value ="/{customerId}")//to get a perticular customer
    public Customer getCustomer(@PathVariable("customer") int customerId){
        return customerService.getCustomer(customerId);
    }
    @PutMapping(value ="/{customerId}")
    public Customer updateCustomer (@PathVariable("customerId") int customerId,@RequestBody Customer customer){
        return customerService.updateCustomer(customerId,customer);
    }
    @DeleteMapping(value ="/{customerId}")
    public void deleteCustomer(@PathVariable("customerId") int customerId){
        customerService.deleteCustomer(customerId);
    }
}
