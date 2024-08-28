package BT_Java_Oop1;


public class NhanVien {
     private String name;
     private int age;
     private String address;
     private String gender;

     //Tạo 1 hàm xây dựng ko tham số
     public NhanVien(){

     }

     //Tạo 1 hàm xây dựng có tham số
    public NhanVien(String name, int age, String address, String gender) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    //tạo 1 hàm để nhập thông tin nhân viên
    public NhanVien nhapThongTin(String name, int age, String address, String gender){
        NhanVien nhanVien = new NhanVien(name, age, address, gender);
        return nhanVien;
    }

    //Tạo 1 hàm để xuất thông tin nhân viên
    public void xuatThongTin(NhanVien nv){
        System.out.println("name = " +nv.getName() + " age = " +nv.getAge() + " address = " +nv.getAddress() + "genger = " +nv.getGender());
    }

}

