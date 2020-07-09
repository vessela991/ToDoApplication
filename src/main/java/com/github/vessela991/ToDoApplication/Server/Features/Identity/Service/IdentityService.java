package com.github.vessela991.ToDoApplication.Server.Features.Identity.Service;

import com.github.vessela991.ToDoApplication.Server.Data.User;
import com.github.vessela991.ToDoApplication.Server.Features.Identity.Model.UserPrincipal;
import com.github.vessela991.ToDoApplication.Server.Features.User.Repository.UserRepository;
import com.github.vessela991.ToDoApplication.Server.Infrastructure.Utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class IdentityService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    public
    UserPrincipal loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        return new UserPrincipal(user);
    }

    private String login(String username, String password){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username,password));
        return jwtUtil.generateToken(loadUserByUsername(username));
    }
}
