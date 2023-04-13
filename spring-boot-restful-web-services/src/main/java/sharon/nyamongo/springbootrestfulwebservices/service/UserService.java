package sharon.nyamongo.springbootrestfulwebservices.service;

import sharon.nyamongo.springbootrestfulwebservices.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);
    List<User> getAllUsers();

    User updateUser(User user);
}
