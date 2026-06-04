package com.Lvprasad.prod_ready_features_SpringBE.prod_ready_features_BE.auth;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
//        return Optional.of(System.getProperty("user.name"));
//        get Security context
//          get Authentication
//        get the principle
//        get username
        return Optional.of("L.v.prasad");
    }
}
