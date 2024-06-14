package dio.dio_sring_security.init;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import dio.dio_sring_security.repository.UserRepository;

@Component
public class StartApplication implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Transactional
    @Override
    public void run(String... args) throws Exception {
        User user = (User) repository.findByUsername("admin");
        
        if(user==null){
            user = new User();
            user.setUsername("ADMIN");
            user.setUsername("admin");
            user.setPassword("master123");
            ((Object) user.getRoles()).add("MANAGERS");
            repository.save(user);
        }
        user = (User) repository.findByUsername("user");
        if(user ==null){
            user = new User();
            user.setUsername("USER");
            user.setUsername("user");
            user.setPassword("user123");
            user.getRoles().add("USERS");
            repository.save(user);
        }
    }
}
