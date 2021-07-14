Kompilacja i uruchomienie
==========================
Linux:
./gradlew bootrun
Windows:
gradlew bootrun

Nie są wymagane żadne dodatkowe inicjalizacje, np. bazy danych.

Aplikacja słucha na porcie 8080, przykładowe zapytanie:
http://localhost:8080/users/octocat


Możliwe modyfikacje
===================
Jest to wersja uproszczona, stworzona w jeden wieczór.
Aplikację można rozbudować:
- dodać obsługę błędów, np. w sytuacji gdy dany użytkownik nie istnieje w bazie GitHub
- zmienić bazę danych H2 na np. Postgres uruchamiany na Dockerze
- generować automatycznie klasy API do GitHub-a używając definicji
  https://github.com/github/rest-api-description/blob/main/descriptions/api.github.com/api.github.com.yaml
- dodać Swaggera do prezentowania API
- dokładniej podzielić projekt na pakiety, zależnie też od przyjętej konwencji
- dodać testy jednostkowe i integracyjne
