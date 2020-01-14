package io.github.bum752.display.controller;

import io.github.bum752.display.service.VaultService;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VaultRestController {

	private final VaultService vaultService;

	public VaultRestController(VaultService vaultService) {
		this.vaultService = vaultService;
	}

	@GetMapping("/vault/variables")
	public Map<String, Object> getVariableMap() {
		return vaultService.getVariableMap();
	}

	@GetMapping("/vault/variables/test-key")
	public String getTestKeyValue() {
		return vaultService.getTestKeyValue();
	}
}
