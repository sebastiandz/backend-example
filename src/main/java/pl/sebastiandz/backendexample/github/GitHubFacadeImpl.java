package pl.sebastiandz.backendexample.github;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.sebastiandz.backendexample.github.dto.GitHubUserDto;

@Service
@AllArgsConstructor
public class GitHubFacadeImpl implements GitHubFacade {

    private final GitHubProperties gitHubProperties;
    private final RestTemplate restTemplate;

    @Override
    public GitHubUserDto user(String login) {
        /*
        TODO Zastosowałem uproszczone rozwiązanie. Docelowo przy bardziej złożonym projekcie należałoby
        na podstawie deskryptora OpenApi https://github.com/github/rest-api-description/blob/main/descriptions/api.github.com/api.github.com.yaml
        i za pomocą pluginu org.openapitools wygenerować gotowe klasy do komunikcji z GitHub.

        Na stronie https://docs.github.com/en/rest/overview/libraries znajdują się linki do gotowych bibliotek
        do komunikacji (pierwszy Javovy już został zamknięty i zwraca 404). Nie szedłbym tą drogą.
        */

        String apiUserUrl = String.format("%s/users/%s", gitHubProperties.getApiUrl(), login);
        ResponseEntity<GitHubUserDto> response = restTemplate.getForEntity(apiUserUrl, GitHubUserDto.class);
        return response.getBody();
    }
}
