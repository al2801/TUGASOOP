package jadwalku;

public class TipeKegiatan {

    String tipe;
    MataKuliah matkul=new MataKuliah();
    
    void setTipeKegiatan(String tipe) {
        this.tipe = tipe;
    }

    String getTipeKegiatan() {
        return tipe;
    }
}
