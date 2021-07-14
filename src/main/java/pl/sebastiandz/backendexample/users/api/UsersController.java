package pl.sebastiandz.backendexample.users.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sebastiandz.backendexample.users.dto.UserDto;

@RestController
@RequestMapping("users")
public class UsersController {

    @GetMapping(path = "{login}")
    UserDto userDetails(@PathVariable("login") String login) {

        //TODO temporary mocked response
        return UserDto.builder().login(login).build();
    }
}
