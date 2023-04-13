package sharon.nyamongo.springbootrestfulwebservices.service;

import sharon.nyamongo.springbootrestfulwebservices.entity.User;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);
}
