package hello;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
    List<Customer> findAll();
    Optional<Customer> findById(Long id);
    //@Query("SELECT customer FROM Customer WHERE customer.id =:id")
    //@Transactional(readOnly = true)
    //Customer findById(@Param("id") Long id);    
}