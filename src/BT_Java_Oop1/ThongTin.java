package BT_Java_Oop1;

public class ThongTin {
    public static void main(String[] args) {
        //Tạo đối tượng NhanVien
        NhanVien nv = new NhanVien();
        //Nhập thông tin cho nv1
        NhanVien nv1 = nv.nhapThongTin("Nguyễn Văn A", 30, "Hà Nội, Việt Nam", "Nam");
        //Xuất thông tin của nv1
        nv.xuatThongTin(nv1);
    }
}
