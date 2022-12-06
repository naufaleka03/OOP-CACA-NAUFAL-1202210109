public class MainClass {
    public static void main(String[] args) throws Exception {
        TransportasiAir objektransportasi = new TransportasiAir(4, 20000);
        objektransportasi.informasi();
        objektransportasi.berlayar();
        objektransportasi.berlabuh();
        System.out.println("");

        Sampan objeksampan = new Sampan(20, 50000, 2);
        objeksampan.informasi();
        objeksampan.berlayar();
        objeksampan.berlabuh();
        objeksampan.berlabuh(2);
        System.out.println("");

        Kapal objekkapal = new Kapal(50, 100000, "Diesel");
        objekkapal.informasi();
        objekkapal.berlayar();
        objekkapal.berlayar(20);
        objekkapal.berlabuh();
    }
}
