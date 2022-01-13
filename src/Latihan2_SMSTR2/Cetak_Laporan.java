package Latihan2_SMSTR2;

/*
* @Author Furqon
 */

public interface Cetak_Laporan {
    void cetakA5();
    void cetakB4();
    void cetakF4();
}

class LaporanTahunan implements Cetak_Laporan {
    @Override
    public void cetakA5() {
        System.out.println("Cetak Laporan di Kertas A5");
    }

    @Override
    public void cetakB4() {
        System.out.println("Cetak Laporan di Kertas B4");
    }

    @Override
    public void cetakF4() {
        System.out.println("Cetak Laporan di Kertas F4");
    }

    public static void main(String[] args) {
        LaporanTahunan LT = new LaporanTahunan();
        LT.cetakA5();
        LT.cetakB4();
        LT.cetakF4();
    }
}
