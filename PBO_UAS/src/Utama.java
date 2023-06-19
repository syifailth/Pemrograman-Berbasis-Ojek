public interface Utama { // Interface
    String getNamaUniv();
    String getAlamatUniv();
    String getEmailUniv();
}

class Univ implements Utama { // Pengimplementasian Interface
    private String NamaUniv;
    private String AlamatUniv;
    private String EmailUniv;

    public Univ(String name, String address, String email) {
        this.NamaUniv = name;
        this.AlamatUniv = address;
        this.EmailUniv = email;
    }

    //getter
    public String getNamaUniv() {
        return NamaUniv;
    }

    public String getAlamatUniv() {
        return AlamatUniv;
    }

    public String getEmailUniv() {
        return EmailUniv;
    }

    public void UnivInfo(){
        System.out.println("Nama Universitas   : " + this.getNamaUniv());
        System.out.println("Alamat Universitas  : " + this.getAlamatUniv());
        System.out.println("Email Universitas   : " + this.getEmailUniv());
    }
}

