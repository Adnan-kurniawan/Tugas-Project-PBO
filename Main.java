package penjualan.barang;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class PenjualanBarang {

    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        System.out.println("======================================");
        System.out.println("Program penjualan Ikan Konsumsi");
        System.out.println("======================================");
        Scanner input = new Scanner(System.in);

        System.out.println("   Kode ikan      Nama Barang     Harga Satuan");
        System.out.println("    A01             Lele            Rp. 17.000");
        System.out.println("    B02             Nila            Rp. 10.000");
        System.out.println("    C03             Gumameh         Rp. 15.000");

        System.out.print("\nMasukkan Jumlah Pembeli   : ");
        int jpembeli = input.nextInt();
        String[] nama = new String[jpembeli];
        String[] kode = new String[jpembeli];
        int[] jbarang = new int[jpembeli];
        String[] nbarang = new String[jpembeli];
        int[] harga = new int[jpembeli];
        int[] bayar = new int[jpembeli];

        for (int i = 0; i < jpembeli; i++) {
            System.out.println("\nPembeli Ke-" + (i + 1));
            System.out.print("Nama Pembeli  : ");
            nama[i] = input.next();
            System.out.print("Kode ikan   : ");
            kode[i] = input.next();
            System.out.print("Jumlah        : ");
            jbarang[i] = input.nextInt();

            switch (kode[i]) {
                case "A01":
                    nbarang[i] = "lele";
                    harga[i] = 17000;
                    bayar[i] = harga[i] * jbarang[i];
                    break;
                case "B02":
                    nbarang[i] = "Nila";
                    harga[i] = 10000;
                    bayar[i] = harga[i] * jbarang[i];
                    break;
                case "C03":
                    nbarang[i] = "Gurameh";
                    harga[i] = 15000;
                    bayar[i] = harga[i] * jbarang[i];
                    break;
                default:
                    System.out.println("\n\tError");
                    break;
            }
        }

        System.out.println("\n==============================================================================================================================================");
        System.out.println("No \tNama Pembeli \tKode ikan \tNama ikan \tJumlah \t\tHarga \t\t\tBayar");
        for (int i = 0; i < jpembeli; i++) {
            System.out.println((i + 1) + " \t" + nama[i] + " \t\t" + kode[i] + " \t\t" + nbarang[i] + " \t" + jbarang[i] + " \t\t" + kursIndonesia.format(harga[i]) + " \t\t" + kursIndonesia.format(bayar[i]));
        }
        System.out.println("\n==============================================================================================================================================");
        System.out.println("\nNama      : Adnan Kurniawan");
    }

}