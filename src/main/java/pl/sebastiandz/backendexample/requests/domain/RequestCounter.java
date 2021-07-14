package pl.sebastiandz.backendexample.requests.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REQUEST_COUNTER")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestCounter {

    @Id
    @Column(name = "LOGIN")
    private String login;

    @Column(name = "REQUEST_COUNT")
    private long requestCount;

}
