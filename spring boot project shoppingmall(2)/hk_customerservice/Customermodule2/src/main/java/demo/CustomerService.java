package demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    // Create a new customer
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // Get all customers
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    // Get customer by ID
    public Customer getCustomerById(Long id) throws CustomerNotFoundException {
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isPresent()) {
            return customer.get();
        } else {
            throw new CustomerNotFoundException("Customer not found with id: " + id);
        }
    }

    // Update customer details
    public Customer updateCustomer(Long id, Customer updatedCustomer) throws CustomerNotFoundException {
        return customerRepository.findById(id).map(customer -> {
            customer.setName(updatedCustomer.getName());
            customer.setEmail(updatedCustomer.getEmail());
            customer.setPhoneNumber(updatedCustomer.getPhoneNumber());
            customer.setAddress(updatedCustomer.getAddress());  // Update address
            return customerRepository.save(customer);
        }).orElseThrow(() -> new CustomerNotFoundException("Customer not found with id: " + id));
    }

    // Delete customer by ID
    public void deleteCustomer(Long id) throws CustomerNotFoundException {
        if (customerRepository.existsById(id)) {
            customerRepository.deleteById(id);
        } else {
            throw new CustomerNotFoundException("Customer not found with id: " + id);
        }
    }
}
