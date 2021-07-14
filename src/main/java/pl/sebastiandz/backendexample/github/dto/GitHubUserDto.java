package pl.sebastiandz.backendexample.github.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class GitHubUserDto {

    // dodałem tylko te pola, których potrzebuję

    private Long id;
    private String login;
    private String name;
    private String type;

    @JsonProperty("avatar_url")
    private String avatarUrl;

    @JsonProperty("created_at")
    private LocalDateTime createdAt;

    @JsonProperty("public_repos")
    private Integer publicRepos;

    private Integer followers;

}
