package After;

interface pembayaran {
    String prosesPembayaran(double jumlah);
}
class PembayaranKartuKredit implements pembayaran {
    @Override
    public String prosesPembayaran(double jumlah) {
        return "Memproses pembayaran dengan Kartu Kredit sebesar Rp" + jumlah;
    }
}

class PembayaranShopeePay implements pembayaran {
    @Override
    public String prosesPembayaran(double jumlah) {
        return "Memproses pembayaran dengan ShopeePay sebesar Rp" + jumlah;
    }
}

class PembayaranGoPay implements pembayaran {
    @Override
    public String prosesPembayaran(double jumlah) {
        return "Memproses pembayaran dengan GoPay sebesar Rp" + jumlah;
    }
}

public class Main {
    public static void main(String[] args) {
        pembayaran kartuKredit = new PembayaranKartuKredit();
        pembayaran shopeePay = new PembayaranShopeePay();
        pembayaran goPay = new PembayaranGoPay();

        System.out.println(kartuKredit.prosesPembayaran(1000000.00));
        System.out.println(shopeePay.prosesPembayaran(500000.00));
        System.out.println(goPay.prosesPembayaran(10000.00));
    }
}
