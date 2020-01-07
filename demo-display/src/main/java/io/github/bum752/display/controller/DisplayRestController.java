package io.github.bum752.display.controller;

import io.github.bum752.display.client.product.ProductServiceClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayRestController {

	private final ProductServiceClient productServiceClient;

	DisplayRestController(ProductServiceClient productServiceClient) {
		this.productServiceClient = productServiceClient;
	}

	@GetMapping("/")
	public Object getProducts() {
		return productServiceClient.getProducts();
	}
}
