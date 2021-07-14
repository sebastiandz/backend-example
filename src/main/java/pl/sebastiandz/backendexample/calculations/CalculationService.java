package pl.sebastiandz.backendexample.calculations;

import org.springframework.stereotype.Service;

@Service
public class CalculationService {

    public double calculate(int followers, int publicRepos) {
        // założyłem, że interesuje nas precyzyjny wynik, a nie wyniki zaokrąglane do integera, dlatego dałem 6.0 (double), a nie 6 (int)
        return 6.0 / followers * (2 + publicRepos);
    }
}
