package pl.sebastiandz.backendexample.requests;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.sebastiandz.backendexample.requests.domain.RequestCounter;

import java.util.Optional;

@Service
@AllArgsConstructor
public class RequestCounterService {

    private final RequestCounterRepository requestCounterRepository;

    @Transactional
    public void createIfNotExistAndIncrementCounter(String login) {
        Optional<RequestCounter> item = requestCounterRepository.findById(login);
        RequestCounter requestCounter = item.orElseGet(() -> RequestCounter.builder().login(login).requestCount(0).build());
        requestCounter.setRequestCount(requestCounter.getRequestCount() + 1);
        requestCounterRepository.save(requestCounter);
    }
}
