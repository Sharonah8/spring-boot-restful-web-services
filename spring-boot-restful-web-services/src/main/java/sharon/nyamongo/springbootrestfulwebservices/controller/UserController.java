package sharon.nyamongo.springbootrestfulwebservices.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import sharon.nyamongo.springbootrestfulwebservices.entity.User;
import sharon.nyamongo.springbootrestfulwebservices.service.UserService;

@RestController
@AllArgsConstructor
public class UserController {

    private UserService userService;

    // build create User REST API
    public ResponseEntity<User> createUser(User user){
       User savedUser = userService.createUser(user);
       return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
}
