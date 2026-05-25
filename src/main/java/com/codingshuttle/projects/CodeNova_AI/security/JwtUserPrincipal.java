package com.codingshuttle.projects.CodeNova_AI.security;

import org.springframework.security.core.GrantedAuthority;
import java.util.Collection;

public record JwtUserPrincipal(
        Long userId,
        String username,
        Collection<? extends GrantedAuthority> authorities
) {
}