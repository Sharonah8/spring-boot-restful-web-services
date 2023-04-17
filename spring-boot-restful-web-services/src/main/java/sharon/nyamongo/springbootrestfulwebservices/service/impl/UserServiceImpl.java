package sharon.nyamongo.springbootrestfulwebservices.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sharon.nyamongo.springbootrestfulwebservices.dto.UserDto;
import sharon.nyamongo.springbootrestfulwebservices.entity.User;
import sharon.nyamongo.springbootrestfulwebservices.mapper.UserMapper;
import sharon.nyamongo.springbootrestfulwebservices.repository.UserRepository;
import sharon.nyamongo.springbootrestfulwebservices.service.UserService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Override
    public UserDto createUser(UserDto userDto) {

        // convert UserDto into User JPA Entity
        User user = UserMapper.mapToUser(userDto);

        User savedUser = userRepository.save(user);

       // Convert User JPA Entity to UserDto
        UserDto savedUserDto = UserMapper.mapToUserDto(savedUser);
        return savedUserDto;
    }

    @Override
    public UserDto getUserById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        User user = optionalUser.get();
        return UserMapper.mapToUserDto(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        User existingUser = userRepository.findById(user.getId()).get();
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        User updatedUser = userRepository.save(existingUser);
        return updatedUser;
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
