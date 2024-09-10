package BT_Java_Oop1;


public class NhanVien {
     private String name;
     private int age;
     private String address;
     private String gender;


     //Tạo 1 hàm xây dựng có tham số
    public NhanVien(String name, int age, String address, String gender) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }


    //Tạo 1 hàm để xuất thông tin nhân viên
    public void xuatThongTin(NhanVien nv){
        System.out.println("name = " +nv.name + " age = " +nv.age + " address = " +nv.address + " genger = " +nv.gender);
    }

}

