package service;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CustomerRepository;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    //@Autowired
    CustomerRepository customerRepository;// = new HibernateCustomerRepositoryImpl();

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("We are using constructor injection.");
        this.customerRepository = customerRepository;
    }

    //@Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
