public class Result {
    public static void main(String[] args) {
        //INTERFACE
        System.out.println("========= INTERFACE =========");
        System.out.println("[Informasi Universitas]");
        Univ infouniv = new Univ("Universitas Sultan Ageng Tirtayasa", "Jl. Sudirman Km 3, Kotabumi, Kec. Purwakarta, Kota Cilegon, Banten", "humas@untirta.ac.id");
        infouniv.UnivInfo();
        System.out.println();
        
        //ABSTRACT
        System.out.println("========= ABSTRACT =========");
        System.out.println("[Kode Absen Dosen]");
        AbsenDosen absendosen = new AbsenDosen("Royan Habibie Sukarna", "199204222022031006");
        absendosen.AbsenDosen();
        absendosen.TampilToken();
        System.out.println();

        //INHERITANCE
        System.out.println("========= INHERINTANCE =========");
        System.out.println("[Kode Absen Mahasiswa]");
        AbsenMahasiswa absen = new AbsenMahasiswa("syifa", "3337210004");
        absen.TampilAbsenMahasiswa();
        absen.TampilToken();
        System.out.println();

        System.out.println("[Data Diri Dosen]");
        DataDiriDosen drdsn = new DataDiriDosen("Royan Habibie Sukarna", "199204222022031006", "Ilmu Komputer", "Laki-laki", "12 jam perminggu");
        drdsn.tampilDataDiri();
        System.out.println();

        System.out.println("[Data Diri Mahasiswa]");
        DataDiriMahasiswa <Integer> DataDiriMahasiswagen = new DataDiriMahasiswa("Syifa Inas Luthfiya", "3337210004", "Informatika", "Perempuan", 21);
        DataDiriMahasiswagen.tampilDataDiri();
        System.out.println();

    }
}