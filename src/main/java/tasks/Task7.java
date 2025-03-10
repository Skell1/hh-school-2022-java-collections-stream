package tasks;

import common.Company;
import common.Vacancy;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/*
Из коллекции компаний необходимо получить всевозможные различные названия вакансий
 */
public class Task7 {

  public static Set<String> vacancyNames(Collection<Company> companies) {
    return new HashSet<>(companies.stream()
            .map(Company::getVacancies)
            .flatMap(Collection::stream)
            .map(Vacancy::getTitle)
            .toList());
  }
}
