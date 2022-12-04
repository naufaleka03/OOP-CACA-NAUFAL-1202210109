public class Handphone extends Perangkat {
    protected boolean fingerprint;

    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }
    
    @Override
    public void informasi() {
        if (fingerprint){
            System.out.println("Perangkat ini memiliki drive dengan tipe " + drive + " dengan RAM sebesar " + ram + " serta processor dengan kecepatan " + processor + " GHz. Selain itu, handphone ini memiliki fitur fingerprint.");
        } else{
            System.out.println("Perangkat ini memiliki drive dengan tipe " + drive + " dengan RAM sebesar" + ram + " serta processor dengan kecepatan " + processor + " GHz. Selain itu, handphone ini tidak memiliki fitur fingerprint.");
        }
    }

    public void telepon(int no_hp) {
        System.out.println("Handphone berhasil menyambungkan telepon ke nomor " + no_hp);
    }

    public void kirimSMS(int no_hp) { 
        System.out.println("Handphone berhasil mengirimkan SMS ke nomor " + no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2) {
        System.out.println("Handphone berhasil mengirimkan SMS ke nomor " + no_hp1 + " dan nomor " + no_hp2);
    }
}
