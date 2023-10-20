package org.example.seminar4;
//Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
//        Табельный номер
//        Номер телефона
//        Имя
//        Стаж
//        Добавить метод, который ищет сотрудника по стажу (может быть список)
//        Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
//        Добавить метод, который ищет сотрудника по табельному номеру
//        Добавить метод добавление нового сотрудника в справочник сотрудников

public class Main {
    public static void main(String[] args) {
        DBPersons dbPersons = new DBPersons();
        dbPersons.addPerson(new Person("+7(921)932-89-34",
                "Ivan Ivanov", 20));
        dbPersons.addPerson(new Person("+7(921)932-34-34",
                "Ivan Petrov", 21));
        dbPersons.addPerson(new Person("+7(921)932-89-11",
                "Petr Ivanov", 20));
        dbPersons.addPerson(new Person("+7(921)111-89-11",
                "Petr Ivanov", 20));
        dbPersons.addPerson(new Person("+7(921)934-89-34",
                "Ivan Petrov", 22));
        dbPersons.printDbPersons();
        System.out.println("Сотрудник с табельным номером '1001' :"
                + dbPersons.findPersonByTabNumber("1001"));
        System.out.println("Сотрудники со стажем 20 лет :");
        dbPersons.findPersonByExperience(20).forEach(System.out::println);
        System.out.println("Телефоны сотрудников 'Petr Ivanov' :");
        dbPersons.findPhoneByName("Petr Ivanov")
                .forEach(e -> System.out.println(e.getPhone()));

    }

    ;

}


