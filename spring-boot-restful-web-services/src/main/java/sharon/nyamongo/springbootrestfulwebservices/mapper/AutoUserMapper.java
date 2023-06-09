package sharon.nyamongo.springbootrestfulwebservices.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import sharon.nyamongo.springbootrestfulwebservices.dto.UserDto;
import sharon.nyamongo.springbootrestfulwebservices.entity.User;

@Mapper
public interface AutoUserMapper {

    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);

}
