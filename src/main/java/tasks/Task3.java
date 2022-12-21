package tasks;

import common.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/*
Задача 3
Отсортировать коллекцию сначала по фамилии, по имени (при равной фамилии), и по дате создания (при равных фамилии и имени)
 */
public class Task3 {

  public static List<Person> sort(Collection<Person> persons) {
    return persons.stream()
            .sorted((o1, o2) -> {
              int value1 = o1.getSecondName().compareTo(o2.getSecondName());
              if (value1 == 0) {
                int value2 = o1.getFirstName().compareTo(o2.getFirstName());
                if (value2 == 0) {
                  return o1.getCreatedAt().compareTo(o2.getCreatedAt());
                } else {
                  return value2;
                }
              }
              return value1;
            }).toList();
  }
}
