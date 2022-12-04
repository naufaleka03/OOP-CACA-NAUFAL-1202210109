public class MainApp {
    public static void main(String[] args) throws Exception {
        Handphone handphone_saya = new Handphone("Sandisk", 8, 2.05f, true);
        handphone_saya.informasi();
        handphone_saya.telepon(62706676);
        handphone_saya.kirimSMS(62706676);
        handphone_saya.kirimSMS(62706676, 628117810);

        Laptop laptop_saya = new Laptop("SSD", 8, 2.40f, true);
        laptop_saya.informasi();
        laptop_saya.bukaGame("ROBLOX");
        laptop_saya.kirimEmail("naufaleka03@gmail.com");
        laptop_saya.kirimEmail("naufaleka03@gmail.com", "seshafaadimitri@gmail.com");
    }
}
