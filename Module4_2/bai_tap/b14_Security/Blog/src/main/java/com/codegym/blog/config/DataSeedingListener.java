package com.codegym.blog.config;

import com.codegym.blog.model.Role;
import com.codegym.blog.model.User;
import com.codegym.blog.repository.RoleRepository;
import com.codegym.blog.repository.UserRepository;
import com.codegym.blog.ultil.EncrypPasswordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.HashSet;

/**
 * Seeding data test for table users and roles
 */
@Component
public class DataSeedingListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        if (roleRepository.findByName("ROLE_ADMIN")==null){
            roleRepository.save(new Role("ROLE_ADMIN"));
        }

        if (roleRepository.findByName("ROLE_MEMBER")==null){
            roleRepository.save(new Role("ROLE_MEMBER"));
        }
        if (roleRepository.findByName("ROLE_BLOCK")==null){
            roleRepository.save(new Role("ROLE_BLOCK"));
        }

        //them admin
        if (userRepository.findByEmail("admin@gmail.com") == null){
            User admin = new User();
            admin.setEmail("admin@gmail.com");
            admin.setNickName("admin");
            admin.setPassword(EncrypPasswordUtils.EncrypPasswordUtils("123456"));
            HashSet<Role> roles = new HashSet<>();
            roles.add(roleRepository.findByName("ROLE_ADMIN"));
            roles.add(roleRepository.findByName("ROLE_MEMBER"));
            admin.setRoles(roles);
            userRepository.save(admin);
        }

        //Them Member
        if (userRepository.findByEmail("member@gmail.com") == null){
            User user = new User();
            user.setEmail("member@gmail.com");
            user.setNickName("Zeri12");
            user.setPassword(EncrypPasswordUtils.EncrypPasswordUtils("123456"));
            HashSet<Role> roles = new HashSet<>();
            roles.add(roleRepository.findByName("ROLE_MEMBER"));
            user.setRoles(roles);
            userRepository.save(user);
        }
    }
}
