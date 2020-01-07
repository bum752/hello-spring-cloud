package io.github.bum752.product.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {

	@GetMapping("/products")
	public List<String> getProductList() {
		return Arrays.asList("Apple", "Banana", "Strawberry", "Melon");
	}
}
