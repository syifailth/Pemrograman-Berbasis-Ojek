import java.util.UUID;

public class AbsenDosen extends Dosen {
    private String nip;
    private UUID token;

    void tokenCreation() {
        token = UUID.randomUUID();
    } 

    public AbsenDosen (String nama, String nip) {
        super(nama);
        this.nip = nip;
        tokenCreation();
    }
    
    //getter
    public String getnip() {
        return nip;
    }

    public UUID gettoken(){
        return this.token;
    }

    public void AbsenDosen() {
        System.out.println("Nama\t: " + getNama());
        System.out.println("NIP\t: " + nip);
    }

    void TampilToken(){
        showToken(token);
    }

    public void showToken(UUID token) {
        System.out.println("Token Absen: " + token);
    }


    // public static void main(String[] args) {
    //     AbsenDosen ad = new AbsenDosen("Royan Habibie Sukarna", "199204222022031006");
    //     ad.AbsenDosen();
    //     ad.TampilToken();
    // }
}