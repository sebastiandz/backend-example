package pl.sebastiandz.backendexample.requests;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sebastiandz.backendexample.requests.domain.RequestCounter;

@Repository
public interface RequestCounterRepository extends JpaRepository<RequestCounter, String> {
}
