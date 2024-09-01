package Before;

class MetodePembayaran {

    public String prosesPembayaran(String jenis, double jumlah) {
        if (jenis.equals("KREDIT")) {
            return "Memproses pembayaran dengan Kartu Kredit sebesar Rp" + jumlah;
        } else if (jenis.equals("SHOPEEPAY")) {
            return "Memproses pembayaran dengan ShopeePay sebesar Rp" + jumlah;
        }
        else if (jenis.equals("GOPAY")) {
            return "Memproses pembayaran dengan GoPay sebesar Rp" + jumlah;
        }else {
            return "Jenis pembayaran tidak diterima";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MetodePembayaran metode = new MetodePembayaran();

        System.out.println(metode.prosesPembayaran("KREDIT", 1000000.00));
        System.out.println(metode.prosesPembayaran("SHOPEEPAY", 500000.00));
        System.out.println(metode.prosesPembayaran("GOPAY", 30000.00));
    }
}
