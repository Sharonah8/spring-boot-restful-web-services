package sharon.nyamongo.springbootrestfulwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sharon.nyamongo.springbootrestfulwebservices.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
