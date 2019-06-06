package com.newer.finance.sercurity.domain;


import com.newer.finance.domain.Admins;
import com.newer.finance.domain.Authority;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.stream.Collectors;

public final  class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(Admins user){
         return new JwtUser(
                 user.getAid(),
                 user.getState(),
                 user.getAname(),
                 user.getPwd(),
                 user.getEmail(),
                 mapToGrandAuthroties(user.getAuthorities()),
                 user.getAexist()==1?true:false,
                 user.getLastPasswordResetDate()
         );
    }

    private static List<GrantedAuthority> mapToGrandAuthroties(List<Authority> authorities) {
        return authorities.stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getName().name()))
                .collect(Collectors.toList());


    }

}
