package jadwalku;

public class Pengguna {

    private String nama;

    public void setNama(String nama) throws Exception {
        for (char x : nama.toCharArray()) {
            if (Character.isDigit(x)) {
                this.nama="-1";
                throw new Exception("Nama tidak boleh angka");
            }
        }
        this.nama = nama;
    }
    
    String getNama(){
        return nama;
    }
}
