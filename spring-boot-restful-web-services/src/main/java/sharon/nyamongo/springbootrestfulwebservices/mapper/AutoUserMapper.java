package sharon.nyamongo.springbootrestfulwebservices.mapper;

import org.mapstruct.Mapper;
import sharon.nyamongo.springbootrestfulwebservices.dto.UserDto;
import sharon.nyamongo.springbootrestfulwebservices.entity.User;

@Mapper
public interface AutoUserMapper {

    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);

}
