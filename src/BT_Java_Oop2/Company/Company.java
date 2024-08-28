package BT_Java_Oop2.Company;

import BT_Java_Oop2.Person.Person;

public class Company {

    public static void main(String[] args) {
        //Tạo đối tượng Person
        Person person = new Person();
        Person person2 = person.SetPerson("Lê Văn X", 20, "Đống Đa, Hà Nội", "Nam", "1234567890");
        person.BasicPersonInfor(person2);

    }
}
