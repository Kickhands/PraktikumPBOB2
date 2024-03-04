    //NAME    : GIGIH HAIDAR FALAH
    //NIM     : 24060122140150
    //PRAKTIKUM 2

public class Kubus {
    private Square base;

    public Kubus(Square base) {
        this.base = base;
    }

    // Hitung Volume Kubus 
    public double calculateVolume() {
        return Math.pow(base.getSide(), 3);
    }

    // Cek kesamaan sisi Kubus
    public boolean nIsPerfectKubus() {
        return base.getSide() == Math.cbrt(calculateVolume());
    }
}
