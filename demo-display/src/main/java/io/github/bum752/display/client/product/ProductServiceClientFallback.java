package io.github.bum752.display.client.product;

import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceClientFallback implements ProductServiceClient {

	@Override
	public List<String> getProducts() {
		return Collections.emptyList();
	}
}
