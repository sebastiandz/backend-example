package pl.sebastiandz.backendexample.users.api;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sebastiandz.backendexample.calculations.CalculationService;
import pl.sebastiandz.backendexample.github.GitHubFacade;
import pl.sebastiandz.backendexample.github.dto.GitHubUserDto;
import pl.sebastiandz.backendexample.users.dto.UserDto;

@RestController
@RequestMapping("users")
@AllArgsConstructor
public class UsersController {

    private final GitHubFacade gitHubFacade;
    private final CalculationService calculationService;

    @GetMapping(path = "{login}")
    UserDto userDetails(@PathVariable("login") String login) {

        GitHubUserDto gitHubUser = gitHubFacade.user(login);
        double calculations = calculationService.calculate(gitHubUser.getFollowers(), gitHubUser.getPublicRepos());

        return UserDto
                .builder()
                .id(gitHubUser.getId())
                .login(gitHubUser.getLogin())
                .name(gitHubUser.getName())
                .type(gitHubUser.getType())
                .avatarUrl(gitHubUser.getAvatarUrl())
                .createdAt(gitHubUser.getCreatedAt())
                .calculations(calculations)
                .build();
    }
}
