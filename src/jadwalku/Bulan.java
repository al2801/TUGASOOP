package jadwalku;

public class Bulan {

    private String namaBulan;
    public void setNamaBulan(String nama) throws Exception {
            if (nama.equalsIgnoreCase("Januari")||nama.equalsIgnoreCase("Februari")||nama.equalsIgnoreCase("Maret")||nama.equalsIgnoreCase("April")||nama.equalsIgnoreCase("Mei")||nama.equalsIgnoreCase("Juni")||nama.equalsIgnoreCase("Juli")||nama.equalsIgnoreCase("Agustus")||nama.equalsIgnoreCase("September")||nama.equalsIgnoreCase("November")||nama.equalsIgnoreCase("Desember")) {
                this.namaBulan = nama;
            } else {
                throw new Exception("Nama Bulan Salah, Silahkan Cek Lagi");

            }
        }
    String getNamaBulan() {
        return namaBulan;
    }

    int getIndeksBulan() {
        if (namaBulan.equalsIgnoreCase("Januari")) {
            return 0;
        } else if (namaBulan.equalsIgnoreCase("Februari")) {
            return 1;
        } else if (namaBulan.equalsIgnoreCase("Maret")) {
            return 2;
        } else if (namaBulan.equalsIgnoreCase("April")) {
            return 3;
        } else if (namaBulan.equalsIgnoreCase("Mei")) {
            return 4;
        } else if (namaBulan.equalsIgnoreCase("Juni")) {
            return 5;
        } else if (namaBulan.equalsIgnoreCase("Juli")) {
            return 6;
        } else if (namaBulan.equalsIgnoreCase("Agustus")) {
            return 7;
        } else if (namaBulan.equalsIgnoreCase("September")) {
            return 8;
        } else if (namaBulan.equalsIgnoreCase("Oktober")) {
            return 9;
        } else if (namaBulan.equalsIgnoreCase("November")) {
            return 10;
        } else {
            return 11;
        }

    }
}
