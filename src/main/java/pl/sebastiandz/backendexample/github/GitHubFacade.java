package pl.sebastiandz.backendexample.github;

import pl.sebastiandz.backendexample.github.dto.GitHubUserDto;

public interface GitHubFacade {

    GitHubUserDto user(String login);

}
