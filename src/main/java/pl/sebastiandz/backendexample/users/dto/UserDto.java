package pl.sebastiandz.backendexample.users.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class UserDto {

    private Long id;
    private String login;
    private String name;
    private String type; //TODO if possible convert to enum
    private String avatarUrl;
    private LocalDateTime createdAt;
    private Double calculations;

}
