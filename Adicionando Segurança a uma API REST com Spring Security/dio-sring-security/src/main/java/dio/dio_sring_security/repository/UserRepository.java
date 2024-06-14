package dio.dio_sring_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import dio.dio_sring_security.Model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    @Query("SELECT e FROM User e JOIN FETCH e.roles WHERE e.username= (:username)")
    public User findByUsername(@Param ("username") String username);

    public void save(org.apache.catalina.User user);
}
