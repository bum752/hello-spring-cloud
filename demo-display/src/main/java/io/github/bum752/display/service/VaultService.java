package io.github.bum752.display.service;

import java.util.Map;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.vault.core.VaultTemplate;

/*
	path: kv/test-path
	key: test-key
	value: test-value
 */
@Service
public class VaultService {

	private final VaultTemplate vaultTemplate;

	@Value("${vault.secret.path}")
	private String vaultPath;

	@Value("${test.key}")
	private String testKey;

	public VaultService(VaultTemplate vaultTemplate) {
		this.vaultTemplate = vaultTemplate;
	}

	public Map<String, Object> getVariableMap() {
		return Objects.requireNonNull(vaultTemplate.read(vaultPath)).getData();
	}

	public String getTestKeyValue() {
		return testKey;
	}
}
