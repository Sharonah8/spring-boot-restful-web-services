package sharon.nyamongo.springbootrestfulwebservices.service;

import sharon.nyamongo.springbootrestfulwebservices.dto.UserDto;
import sharon.nyamongo.springbootrestfulwebservices.entity.User;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);

    UserDto getUserById(Long userId);
    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
}
