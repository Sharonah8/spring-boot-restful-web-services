package sharon.nyamongo.springbootrestfulwebservices.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sharon.nyamongo.springbootrestfulwebservices.entity.User;
import sharon.nyamongo.springbootrestfulwebservices.repository.UserRepository;
import sharon.nyamongo.springbootrestfulwebservices.service.UserService;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
