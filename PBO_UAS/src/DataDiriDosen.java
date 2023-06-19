public class DataDiriDosen extends AbsenDosen{
    String spesialisasi, jenisKelamin, jamMengajar;

    public DataDiriDosen (String nama, String nip, String spesialisasi, String jenisKelamin, String jamMengajar){
        super(nama, nip);
        this.spesialisasi = spesialisasi;
        this.jenisKelamin = jenisKelamin;
        this.jamMengajar = jamMengajar;
    }

    public void tampilDataDiri () {
        super.AbsenDosen();
        System.out.println("Spesialisasi : " + spesialisasi);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Jam Mengajar : " + jamMengajar);
    }

    /* public static void main(String[] args) {
        DataDiriDosen drdsn = new DataDiriDosen("Royan Habibie Sukarna", "199204222022031006", "Ilmu Kompouter", "Laki-laki", "12 jam perminggu");
        drdsn.tampilDataDiri();
    } */

}