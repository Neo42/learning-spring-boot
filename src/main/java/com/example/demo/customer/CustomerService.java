package com.example.demo.customer;

import com.example.demo.exception.NotFoundEexception;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class CustomerService {
  //  private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

  private final CustomerRepository customerRepository;

  //  @Autowired
  //  public CustomerService(CustomerRepository customerRepository) {
  //    this.customerRepository = customerRepository;
  //  }

  List<Customer> getCustomers() {
    log.info("getCustomers was called");
    return customerRepository.findAll();
  }

  Customer getCustomer(Long id) {
    return customerRepository
        .findById(id)
        .orElseThrow(
            () -> {
              NotFoundEexception notFoundEexception =
                  new NotFoundEexception("Customer with id " + id + " not" + " found");
              log.error("error when getting customer {}", id, notFoundEexception);
              return notFoundEexception;
            });
  }
}
