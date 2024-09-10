package BT_Java_Oop2.Company;

import BT_Java_Oop2.Person.Person;

public class Company {

    public static void main(String[] args) {
        //Tạo đối tượng Person
        Person person = new Person("Lê Văn X", 20, "Đống Đa, Hà nội", "Nam", "1234567890");
        person.BasicPersonInfor(person);

    }
}
