package jadwalku;
public class Kegiatan {
    String nama;
    TipeKegiatan tipe;
    Waktu waktu=new Waktu();
    TipeKegiatan tipe1 = new TipeKegiatan();
    
    Kegiatan(){
        //empty constructor !
    }
    
    public void setWaktu(Waktu waktu){
        this.waktu=waktu;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setTipeKegiatan(TipeKegiatan tipe){
        this.tipe=tipe;
    }
    String getNama(){
        return nama;
    }
    
}


