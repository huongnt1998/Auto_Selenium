package BT_Java_Oop1;

public class ThongTin {
    public static void main(String[] args) {

        //Nhập thông tin cho nv1
        NhanVien nhanVien1 = new NhanVien("Nguyễn Văn A", 30, "Hà Nội-Việt Nam", "Nam");
        //Xuất thông tin của nv1
        nhanVien1.xuatThongTin(nhanVien1);
    }
}
