package jadwalku;
import java.util.*;
import java.text.SimpleDateFormat;
public class Waktu {
    private Tanggal tanggal=new Tanggal();
    private Bulan bulan=new Bulan();
    private Tahun tahun=new Tahun();
    private String waktu;
    
    public void setWaktu(Date date){
        SimpleDateFormat format1 = new SimpleDateFormat("EEEE, d MMMM yyyy");
        waktu = format1.format(date);
    }
    Tanggal getTanggal(){
        return tanggal;
    }
    Bulan getBulan(){
        return bulan;
    }
    Tahun getTahun(){
        return tahun;
    }
    String getWaktu(){
        return waktu;
    }
}
