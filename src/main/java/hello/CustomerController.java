package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;


@Controller
public class CustomerController {

    @GetMapping("/customers")
    public String listAllCustomers(Model model) {
		List<Customer> lista = new ArrayList<Customer>();
		lista.add(new Customer("João", "Silva"));
        model.addAttribute("cs", lista);
        return "customersList";
    }

}