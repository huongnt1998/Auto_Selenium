package BT_Java_Oop2.Person;

import BT_Java_Oop1.NhanVien;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;

    //Hàm xây dựng có tham số
    public Person(String name, int age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

//    public String getName() {
//
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getGender() {
//
//        return gender;
//    }
//
//    public String getAddress() {
//
//        return address;
//    }
//
//    public String getPhone() {
//
//        return phone;
//    }


    public Person SetPerson(String name, int age, String address, String gender, String phone) {
        Person person = new Person(name, age, address, gender, phone);
        return person;
    }

    public void getPerson(Person pe) {
        System.out.println("Tên = " + pe.name);
        System.out.println("Tuổi = " + pe.age);
        System.out.println("Địa chỉ = " + pe.address);
        System.out.println("Giới tính = " + pe.gender);
        System.out.println("Điện thoại = " + pe.phone);
    }

    public void BasicPersonInfor(Person pe1) {
        System.out.println("Tên = " + pe1.name);
        System.out.println("Tuổi = " + pe1.age);
        System.out.println("Địa chỉ = " + pe1.address);
    }
}
