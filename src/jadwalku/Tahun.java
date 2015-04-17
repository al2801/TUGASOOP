package jadwalku;
public class Tahun {
    private String tahun;
    
    public void setTahun(String tahun) throws Exception{
        if (tahun.length()==4)
            this.tahun=tahun;
        else
            throw new Exception("Harus 4 digit");
    }
    int getTahun(){
        int tahunx=Integer.parseInt(tahun);
        return tahunx;
    }
}
