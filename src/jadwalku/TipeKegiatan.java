package jadwalku;

public class TipeKegiatan {

    private String tipe;
    private MataKuliah matkul=new MataKuliah();
    
    void setTipeKegiatan(String tipe) {
        this.tipe = tipe;
    }
    MataKuliah getMatkul(){
        return matkul;
    }

    String getTipeKegiatan() {
        return tipe;
    }
}
