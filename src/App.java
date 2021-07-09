class Barang{
    String nama;
    int hargaSatuan;
    int jumlah;
    int hargaTotal;
    int diskon;
    int totalBayar;

    Barang(String nama, int hargaSatuan, int jumlah){
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
        this.jumlah = jumlah;

        System.out.println("Nama Barang : " + this.nama);
    }
    int hitungHargaTotal(){
        this.hargaTotal = this.hargaSatuan * this.jumlah;
        return hargaTotal;
    }
    int hitungDiskon(int hargaTotal){
        if (hargaTotal > 100000) {
            diskon = hargaTotal * 10/100;
            System.out.println("Diskon :" + diskon);
        }else if(hargaTotal >= 50000 && hargaTotal <= 100000){
            diskon = hargaTotal * 5/100;
            System.out.println("Diskon :" + diskon);
        }else{
            System.out.println("Diskon : 0");
        }

        return diskon;
    }
    int hitungTotalBayar(int hargaTotal, int diskon){
        totalBayar = hargaTotal - diskon;
        System.out.println("Total Bayar :" + totalBayar);
        return totalBayar;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Barang belibarang = new Barang("Mousepad", 56000, 2);
        belibarang.hitungHargaTotal();
        belibarang.hitungDiskon(belibarang.hargaTotal);
        belibarang.hitungTotalBayar(belibarang.hargaTotal, belibarang.diskon);

        Barang belibarang1 = new Barang("Mouse", 150000, 2);
        belibarang1.hitungHargaTotal();
        belibarang1.hitungDiskon(belibarang1.hargaTotal);
        belibarang1.hitungTotalBayar(belibarang1.hargaTotal, belibarang1.diskon);

        Barang belibarang2 = new Barang("OTG", 40000, 1);
        belibarang2.hitungHargaTotal();
        belibarang2.hitungDiskon(belibarang2.hargaTotal);
        belibarang2.hitungTotalBayar(belibarang2.hargaTotal, belibarang2.diskon);
    }
}
