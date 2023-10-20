package org.example.seminar4;

import static java.lang.Integer.parseInt;

public class Person {
    //        Табельный номер
    private String tabNumber;
    static int counter = 999;

    //        Номер телефона
    String phone;
    //        Имя
    String fullName;
    //        Стаж
    Integer experience;

    public Person(String phone, String fullName, int experience) {
        this.phone = phone;
        this.fullName = fullName;
        this.experience = experience;
        setTabNumber();

    }

    public String getTabNumber() {
        return tabNumber;
    }

    public void setTabNumber() {
        this.tabNumber = Integer.toString(counter);
        counter++;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Сотрудник " +
                "Табельный номер:'" + tabNumber + '\'' +
                ", телефон:'" + phone + '\'' +
                ", Ф.И.О.: '" + fullName + '\'' +
                ", стаж: " + experience;
    }
}
