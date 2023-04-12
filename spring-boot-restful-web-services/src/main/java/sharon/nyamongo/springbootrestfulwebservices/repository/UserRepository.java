package sharon.nyamongo.springbootrestfulwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sharon.nyamongo.springbootrestfulwebservices.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
