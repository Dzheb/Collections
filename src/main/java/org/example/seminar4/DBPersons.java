package org.example.seminar4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//  Task No 1 Добавить метод, который ищет сотрудника по стажу (может быть список)
//  Task No 2 Добавить метод, который выводит номер телефона сотрудника по имени
//  (может быть список)
//  Task No 3 Добавить метод, который ищет сотрудника по табельному номеру
//  Task No 4 Добавить метод добавление нового сотрудника в справочник сотрудников
//    .findFirst().orElse(null);
public class DBPersons {
    private ArrayList<Person> dbPersons;
    static int counter;

    public DBPersons() {
        this.dbPersons = new ArrayList<>();
    }

    public ArrayList<Person> getDbPersons() {
        return dbPersons;
    }

    //    Task No 1
    public ArrayList<Person> findPersonByExperience(Integer experience) {
        List<Person> result = dbPersons.stream()
                .filter(item -> item.getExperience().equals(experience))
                .collect(Collectors.toList());
        return new ArrayList<Person>(result);
    }

    //    Task No 2
    public ArrayList<Person> findPhoneByName(String fullName) {
        List<Person> result = dbPersons.stream()
                .filter(item -> item.getFullName().equals(fullName))
                .collect(Collectors.toList());
        return new ArrayList<Person>(result);
    }

    //    Task No 3

    public List<Person> findPersonByTabNumber(String tabNumber) {
        List<Person> result = dbPersons.stream()
                .filter(item -> item.getTabNumber().equals(tabNumber))
                .collect(Collectors.toList());
        return result;
    }

    //    Task No 4
    public void addPerson(Person person) {
        dbPersons.add(person);
    }

    public void printDbPersons() {
        dbPersons.forEach(System.out::println);
    }
}
