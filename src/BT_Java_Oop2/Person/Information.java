package BT_Java_Oop2.Person;

public class Information {

    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = person.SetPerson("Nguyễn Thị B", 25, "Hà Nội", "Nữ", "09876543123");
        person.getPerson(person1);
    }
}
