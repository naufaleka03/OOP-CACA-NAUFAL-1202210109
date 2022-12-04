public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    @Override
    public void informasi() {
        if (webcam){
            System.out.println("\nPerangkat ini memiliki drive dengan tipe " + drive + " dengan RAM sebesar " + ram + " serta processor dengan kecepatan " + processor + " GHz. Selain itu, handphone ini memiliki fitur webcam.");
        } else{
            System.out.println("\nPerangkat ini memiliki drive dengan tipe " + drive + " dengan RAM sebesar" + ram + " serta processor dengtan an kecepa" + processor + " GHz. Selain itu, handphone ini tidak memiliki fitur webcam.");
        }
    }

    public void bukaGame(String nama_game) {
        System.out.println("Laptop berhasil membuka game " + nama_game);
    }

    public void kirimEmail(String email) {
        System.out.println("Laptop berhasil mengirimkan email ke " + email);
    }

    public void kirimEmail(String email1, String email2) {
        System.out.println("Laptop berhasil mengirimkan email ke " + email1 + " dan " + email2);
    }
}

