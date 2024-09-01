package entity;

public abstract class Hinhhoc {
    public static int count;
    public Hinhhoc(){
        if (count >= Configs.SO_LUONG_HINH_TOI_DA){
            String message = "Số lượng hình tối đa là: " +
                    Configs.SO_LUONG_HINH_TOI_DA;
            throw new HinhHocException(message);
        }
        count++;
    }
    public abstract double tinhChuVi();
    public abstract double tinhDienTich();

}
