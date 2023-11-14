package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import jakarta.transaction.Transactional;

import com.example.demo.repositories.UserRepository;

@Controller
@Transactional
public class IniciarDatos implements ApplicationRunner{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(ApplicationArguments args) throws Exception {

                //usuarios
                userRepository.save(new UserEntity("Juan", passwordEncoder.encode("123"), "a@a.com", "Administrador"));
                userRepository.save(new UserEntity("Pedro",passwordEncoder.encode("123") , "b@b.com", "Usuario"));
                userRepository.save(new UserEntity("Maria",passwordEncoder.encode("123") , "c@c.com", "Usuario"));
                userRepository.save(new UserEntity("Luis",passwordEncoder.encode("123") , "d@d.com", "Usuario"));
                userRepository.save(new UserEntity("Carlos",passwordEncoder.encode("123") , "e@e.com", "Usuario"));
                userRepository.save(new UserEntity("Ana",passwordEncoder.encode("123") , "f@f.com", "Usuario"));
                userRepository.save(new UserEntity("Jose",passwordEncoder.encode("123") , "g@g.com", "Usuario"));
    }
    
}
