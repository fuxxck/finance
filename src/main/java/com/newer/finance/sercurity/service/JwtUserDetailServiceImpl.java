package com.newer.finance.sercurity.service;

import com.newer.finance.domain.Admins;
import com.newer.finance.mapper.AdminsMapper;
import com.newer.finance.sercurity.domain.JwtUserFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private AdminsMapper adminsMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Admins admins = this.adminsMapper.findByUsername(username);
        if(admins==null){
            throw  new UsernameNotFoundException("No User found with UserName :"+username);
        }else{
          return JwtUserFactory.create(admins);
        }
    }
}
