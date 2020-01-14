package io.github.bum752.display.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.vault.annotation.VaultPropertySource;

@Configuration
@VaultPropertySource("${vault.secret.path}")
public class VaultConfiguration {

}
