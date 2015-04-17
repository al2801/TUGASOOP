package jadwalku;

import java.util.*;

public class JadwalKu {

    static Scanner input = new Scanner(System.in);
    static Scanner input2 = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("JADWALKU TES");
        System.out.println("===============================================");

        Pengguna pengguna1 = new Pengguna();
        LinkedList<Kegiatan> daftarkegiatan = new LinkedList();
        String nama;
        do {
            System.out.print("Masukan Nama Anda : ");
            nama = input2.nextLine();
            try {
                pengguna1.setNama(nama);
            } catch (Exception ex) {
                System.out.println("Terjadi Kesalahan : " + ex.getMessage());
            }
        } while (pengguna1.getNama() == "-1");

        int pil, i;
        do {
            do {
                menuUtama();
                pil = input.nextInt();
                if (pil > 2) {
                    System.out.println("Pilihan yang anda masukkan salah, Silahkan coba lagi \n");
                }
            } while (pil > 2);

            for (i = 1; i < 2;) {
                switch (pil) {
                    case 1:
                        System.out.println("-----------------------------------------------");
                        System.out.println("Rincian Jadwal Kegiatan/Tugas");
                        System.out.println("-----------------------------------------------");
                        System.out.println("Silahkan Pilih Tipe Kegiatan/Tugas : ");
                        TipeKegiatan tipe1 = new TipeKegiatan();
                        tipe1.setTipeKegiatan("Kegiatan di dalam Kampus");
                        TipeKegiatan tipe2 = new TipeKegiatan();
                        tipe2.setTipeKegiatan("Kegiatan di luar Kampus");
                        TipeKegiatan tipe3 = new TipeKegiatan();
                        tipe3.setTipeKegiatan("Deadline Tugas Kampus");

                        System.out.println("1." + tipe1.getTipeKegiatan());
                        System.out.println("2." + tipe2.getTipeKegiatan());
                        System.out.println("3." + tipe3.getTipeKegiatan());

                        int pilTipe;
                        do {
                            System.out.print("Pilihan : ");
                            pilTipe = input.nextInt();
                            if (pilTipe > 3) {
                                System.out.println("Pilihan yang anda masukkan salah, Silahkan coba lagi");
                            }
                        } while (pilTipe > 3);

                        if (pilTipe == 1) {
                            daftarkegiatan.addLast(new Kegiatan());
                            daftarkegiatan.getLast().setTipeKegiatan(tipe1);
                            daftarkegiatan.getLast().setWaktu(new Waktu());
                            tipeK12(daftarkegiatan.getLast());

                        } else if (pilTipe == 2) {
                            daftarkegiatan.addLast(new Kegiatan());
                            daftarkegiatan.getLast().setTipeKegiatan(tipe2);
                            daftarkegiatan.getLast().setWaktu(new Waktu());
                            tipeK12(daftarkegiatan.getLast());

                        } else if (pilTipe == 3) {
                            daftarkegiatan.addLast(new Kegiatan());
                            daftarkegiatan.getLast().setTipeKegiatan(tipe3);
                            daftarkegiatan.getLast().setWaktu(new Waktu());
                            tipeK3(daftarkegiatan.getLast());

                        } else {
                            System.out.println("Input yang anda masukan salah, Silahkan coba lagi");
                        }
                        break;

                    case 2:
                        System.exit(0);
                        break;

                }
                System.out.println("Masih Ada kegiatan yang Ingin Ditambahkan ?");
                System.out.println("1.Ya \n" + "2.Tidak");

                do {
                    System.out.print("Pilihan : ");
                    i = input.nextInt();

                    if ((i != 1) && (i != 2)) {
                        System.out.println("Pilihan yang anda masukkan salah, Silahkan coba lagi");
                    }
                    if (i == 2) {
                        System.out.println("===============================================");
                        System.out.println("RINCIAN KEGIATAN");
                        System.out.println("===============================================");
                        System.out.println("PENGGUNA : " + pengguna1.getNama());
                        System.out.println("-----------------------------------------------");
                        for (int n = 0; (n < daftarkegiatan.size()); n++) {
                            System.out.println("Kegiatan ke-" + (n + 1));
                            outputT(daftarkegiatan.get(n));
                            System.out.println("-----------------------------------------------");

                        }
                        System.out.println("===============================================");
                    }

                } while ((i != 1) && (i != 2));
            }
        } while (i != 2);
    }

    public static void outputT(Kegiatan kegiatan) {
        System.out.print("Nama Kegiatan : ");
        System.out.println(kegiatan.getNama());
        System.out.print("Tipe Kegiatan : ");
        System.out.println(kegiatan.tipe.getTipeKegiatan());
        System.out.print("Waktu : ");
        System.out.println(kegiatan.waktu.getWaktu());
    }

    static void tipeK12(Kegiatan kegiatan) {
        System.out.print("Nama Kegiatan : ");
        String namaK = input2.nextLine();
        kegiatan.setNama(namaK);
        System.out.println("Waktu Kegiatan");
        String thn;
        do {
            System.out.print("Tahun : ");
            thn = input.next();
            try {
                kegiatan.waktu.tahun.setTahun(thn);
            } catch (Exception ex) {
                System.out.println("Terjadi Kesalahan : " + ex.getMessage());
            }
        } while (thn.length() != 4);

        String bln;
        do {
            System.out.print("Bulan : ");
            bln = input2.nextLine();
            try {
                kegiatan.waktu.bulan.setNamaBulan(bln);
            } catch (Exception ex) {
                System.out.println("Terjadi Kesalahan : " + ex.getMessage());
            }
        } while (bln != kegiatan.waktu.bulan.getNamaBulan());

        int tgl;
        do {
            System.out.print("Tanggal : ");
            tgl = input.nextInt();
            try {
                kegiatan.waktu.tanggal.SetTanggal(tgl, kegiatan.waktu.bulan);
            } catch (Exception ex) {
                System.out.println("Terjadi Kesalahan : " + ex.getMessage());
            }
        } while (tgl != kegiatan.waktu.tanggal.getTanggal());

        Calendar cal = Calendar.getInstance();
        cal.set(kegiatan.waktu.tahun.getTahun(), kegiatan.waktu.bulan.getIndeksBulan(), tgl);
        kegiatan.waktu.setWaktu(cal.getTime());
    }

    static void tipeK3(Kegiatan kegiatan) {
        System.out.println("Tugas untuk Mata Kuliah : ");
        for (int j = 0; j < kegiatan.tipe.matkul.matkul.length; j++) {
            System.out.println(j + 1 + "." + kegiatan.tipe.matkul.matkul[j]);
        }
        System.out.println("Pilihan : ");
        int pilMatkul = input.nextInt();
        kegiatan.setNama("Tugas Mata Kuliah " + kegiatan.tipe.matkul.matkul[pilMatkul - 1]);

        System.out.println("Deadline Tugas");
        String thn;
        do {
            System.out.print("Tahun : ");
            thn = input.next();
            try {
                kegiatan.waktu.tahun.setTahun(thn);
            } catch (Exception ex) {
                System.out.println("Terjadi Kesalahan : " + ex.getMessage());
            }
        } while (thn.length() != 4);

        String bln;
        do {
            System.out.print("Bulan : ");
            bln = input2.nextLine();
            try {
                kegiatan.waktu.bulan.setNamaBulan(bln);
            } catch (Exception ex) {
                System.out.println("Terjadi Kesalahan : " + ex.getMessage());
            }
        } while (bln != kegiatan.waktu.bulan.getNamaBulan());

        int tgl;
        do {
            System.out.print("Tanggal : ");
            tgl = input.nextInt();
            try {
                kegiatan.waktu.tanggal.SetTanggal(tgl, kegiatan.waktu.bulan);
            } catch (Exception ex) {
                System.out.println("Terjadi Kesalahan : " + ex.getMessage());
            }
        } while (tgl != kegiatan.waktu.tanggal.getTanggal());

        Calendar cal = Calendar.getInstance();
        cal.set(kegiatan.waktu.tahun.getTahun(), kegiatan.waktu.bulan.getIndeksBulan(), tgl);
        kegiatan.waktu.setWaktu(cal.getTime());

    }

    static void menuUtama() {
        System.out.println("1.Buat Jadwal Kegiatan \n" + "2.Selesai");
        System.out.print("Pilihan : ");
    }

}
