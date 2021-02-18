package ku.message.repository;

import ku.message.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    /* Jpa creates query for you */
    User findByUsername(String username);
}
