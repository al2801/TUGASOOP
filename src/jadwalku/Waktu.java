package jadwalku;
import java.util.*;
import java.text.SimpleDateFormat;
public class Waktu {
    Tanggal tanggal=new Tanggal();
    Bulan bulan=new Bulan();
    Tahun tahun=new Tahun();
    private String waktu;
    
    public void setWaktu(Date date){
        SimpleDateFormat format1 = new SimpleDateFormat("EEEE, d MMMM yyyy");
        waktu = format1.format(date);
    }
    String getWaktu(){
        return waktu;
    }
    /*public void setTanggal(Tanggal tanggal){
        this.tanggal=tanggal;
    }
    public void setBulan(Bulan bulan){
        this.bulan=bulan;
    }
    public void setTahun(Tahun tahun){
        this.tahun=tahun;
    }*/
}
