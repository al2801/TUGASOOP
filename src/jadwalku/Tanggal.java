package jadwalku;

public class Tanggal {

    private Tahun tahun;
    private int tanggal;

    public void SetTanggal(int tanggal, Bulan bulan) throws Exception {
        if (tanggal != 0) {
            if (bulan.getNamaBulan().equalsIgnoreCase("Januari")) {
                if (tanggal <= 31) {
                    this.tanggal = tanggal;
                } else {
                    throw new Exception("Tanggal Tidak Boleh Melebihi 31");
                }
            } else if (bulan.getNamaBulan().equalsIgnoreCase("Februari")) {
                if ((tahun.getTahun() % 4) == 0) {
                    if (tanggal <= 29) {
                        this.tanggal = tanggal;
                    } else {
                        throw new Exception("Tanggal Tidak Boleh Melebihi 29");
                    }
                } else {
                    if (tanggal <= 28) {
                        this.tanggal = tanggal;
                    } else {
                        throw new Exception("Tanggal Tidak Boleh Melebihi 28");
                    }
                }
            } else if (bulan.getNamaBulan().equalsIgnoreCase("Maret")) {
                if (tanggal <= 31) {
                    this.tanggal = tanggal;
                } else {
                    throw new Exception("Tanggal Tidak Boleh Melebihi 31");
                }
            } else if (bulan.getNamaBulan().equalsIgnoreCase("April")) {
                if (tanggal <= 30) {
                    this.tanggal = tanggal;
                } else {
                    throw new Exception("Tanggal Tidak Boleh Melebihi 30");
                }
            } else if (bulan.getNamaBulan().equalsIgnoreCase("Mei")) {
                if (tanggal <= 31) {
                    this.tanggal = tanggal;
                } else {
                    throw new Exception("Tanggal Tidak Boleh Melebihi 31");
                }
            } else if (bulan.getNamaBulan().equalsIgnoreCase("Juni")) {
                if (tanggal <= 30) {
                    this.tanggal = tanggal;
                } else {
                    throw new Exception("Tanggal Tidak Boleh Melebihi 30");
                }
            } else if (bulan.getNamaBulan().equalsIgnoreCase("Juli")) {
                if (tanggal <= 31) {
                    this.tanggal = tanggal;
                } else {
                    throw new Exception("Tanggal Tidak Boleh Melebihi 31");
                }
            } else if (bulan.getNamaBulan().equalsIgnoreCase("Agustus")) {
                if (tanggal <= 31) {
                    this.tanggal = tanggal;
                } else {
                    throw new Exception("Tanggal Tidak Boleh Melebihi 31");
                }
            } else if (bulan.getNamaBulan().equalsIgnoreCase("September")) {
                if (tanggal <= 30) {
                    this.tanggal = tanggal;
                } else {
                    throw new Exception("Tanggal Tidak Boleh Melebihi 30");
                }
            } else if (bulan.getNamaBulan().equalsIgnoreCase("Oktober")) {
                if (tanggal <= 31) {
                    this.tanggal = tanggal;
                } else {
                    throw new Exception("Tanggal Tidak Boleh Melebihi 31");
                }
            } else if (bulan.getNamaBulan().equalsIgnoreCase("November")) {
                if (tanggal <= 30) {
                    this.tanggal = tanggal;
                } else {
                    throw new Exception("Tanggal Tidak Boleh Melebihi 30");
                }
            } else if (bulan.getNamaBulan().equalsIgnoreCase("Desember")) {
                if (tanggal <= 31) {
                    this.tanggal = tanggal;
                } else {
                    throw new Exception("Tanggal Tidak Boleh Melebihi 31");
                }
            }

        } else {
            System.out.println("Tanggal tidak boleh 0");
            this.tanggal=-1;
        }

    }
    
    int getTanggal() {
        return tanggal;
    }
}
