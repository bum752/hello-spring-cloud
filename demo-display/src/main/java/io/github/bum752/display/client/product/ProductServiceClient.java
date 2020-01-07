package io.github.bum752.display.client.product;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(value = "product-service", fallback = ProductServiceClientFallback.class)
public interface ProductServiceClient {

	@GetMapping("/products")
	List<String> getProducts();
}
