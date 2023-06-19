public abstract class Dosen { //abstract class
    private String nama;

    //getter
    public String getNama() {
        return nama;
    }
    
    public Dosen(String nama) {
        this.nama = nama;
    }

    public abstract void AbsenDosen(); // Method abstrak untuk kehadiran

    /* public static void main(String[] args) {
        Dosen dsn = new Dosen();
        objek dsn tidak bisa digunakan karna Dosen merupakan kelas
        abstrak, dimana kelas abstrak tidak bisa diinstansiasi langsung
        jadi hanya bisa menggunakan atribut nama di child class Dosen
        
    } */
}