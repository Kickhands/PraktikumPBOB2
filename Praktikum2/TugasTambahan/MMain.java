    //NAME    : GIGIH HAIDAR FALAH
    //NIM     : 24060122140150
    //PRAKTIKUM 2

public class MMain {
    public static void main(String[] args) {

        Square square = new Square(4);
        Kubus kubus = new Kubus(square);

        // Cek Volume Kubus
        double volume = kubus.calculateVolume();

        // Cek apakh kubus Perfect ( Sisi nya sama semua jadi kek bener bener kotak )
        boolean isPerfectCube = kubus.isPerfectCube();

        System.out.println("\nGIGIH HAIDAR FALAH - 24060122140150\n");
        System.out.println("LuasPersegi: " + square.calculateArea());
        System.out.println("\nVolume Kubus: " + volume);
        System.out.println("\nIsPerfectCube? " + isPerfectCube);
    }
}
