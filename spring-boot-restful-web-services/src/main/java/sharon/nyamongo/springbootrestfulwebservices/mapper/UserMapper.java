package sharon.nyamongo.springbootrestfulwebservices.mapper;

import sharon.nyamongo.springbootrestfulwebservices.dto.UserDto;
import sharon.nyamongo.springbootrestfulwebservices.entity.User;

public class UserMapper {

    // convert user JPA Entity into UserDto
    public static UserDto mapToUserDto(User user){
        UserDto userDto = new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );
        return userDto;
    }

    // convert UserDto into User JPA Entity
    public static User mapToUser(UserDto userDto){
        User user = new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail()
        );
        return user;
    }
}
