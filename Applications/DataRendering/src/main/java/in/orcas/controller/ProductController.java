package in.orcas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.orcas.model.Product;

@Controller
public class ProductController {

    @GetMapping("/products")
    public String showProducts(Model model) {
        // Sample product list (Simulating data fetched from DB)
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 75000));
        products.add(new Product(2, "Phone", 15000));
        products.add(new Product(3, "Tablet", 25000));

        // Data Rendering: Pass the product list to view via Model
        model.addAttribute("products", products);

        return "productList";  // productList.jsp
    }
}
