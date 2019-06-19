package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;


@Controller
public class CustomerController {
	private final CustomerRepository customers;
	
    public CustomerController(CustomerRepository customers) {
		super();
		this.customers = customers;
	}

	@GetMapping("/customers")
    public String listAllCustomers(Model model) {
		List<Customer> lista = customers.findAll();
        model.addAttribute("cs", lista);
        return "customersList";
    }

}