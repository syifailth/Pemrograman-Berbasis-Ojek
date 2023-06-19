import java.util.UUID;

class AbsenMahasiswa <T> {
    // encapsulation
    final String nama;
    final String nim;
    private UUID token;

    void tokenCreation() {
        token = UUID.randomUUID();
    }  

    //getter
    public UUID gettoken(){
        return this.token;
    }

    public AbsenMahasiswa (String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        tokenCreation();
    }
    
    void TampilAbsenMahasiswa() {
        System.out.println("Nama\t: " + this.nama);
        System.out.println("Nim\t: " + this.nim);
    }

    void TampilToken(){
        showToken(token);
    }
    
    public void showToken(UUID token) {
        System.out.println("Token Absen: " + token);
    }

    /* public static void main(String[] args) {
        AbsenMahasiswa absen = new AbsenMahasiswa("Syifa Inas Luthfiya", "333721004");
        absen.TampilAbsen();
        absen.TampilToken();
    } */
}