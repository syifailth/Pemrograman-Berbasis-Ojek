public class DataDiriMahasiswa <T> extends AbsenMahasiswa{
    String jurusan, jenisKelamin;
    private T gen;

    public DataDiriMahasiswa (String nama, String nim, String jurusan, String jenisKelamin, T gen){
        super(nama, nim);
        this.jurusan = jurusan;
        this.jenisKelamin = jenisKelamin;
        this.gen = gen;
    }

    public void tampilDataDiri () {
        super.TampilAbsenMahasiswa();
        System.out.println("Jurusan\t: " + jurusan);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Tahun Angkatan : " + gen + "[Generic]");
    }

    /* public static void main(String[] args) {
        DataDiriMahasiswa <int> DataMahasiswagen = new DataDiriMahasiswa("Syifa Inas Luthfiya", "3337210004", "Informatika", "Perempuan", 21);
        DataMahasiswagen.tampilDataDiri();
    } */
}