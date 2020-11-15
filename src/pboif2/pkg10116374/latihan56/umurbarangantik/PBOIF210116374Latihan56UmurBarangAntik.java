package pboif2.pkg10116374.latihan56.umurbarangantik;
/**
 * @author Acromyrmex
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk menghitung umur barang antik
 *
 */
public class PBOIF210116374Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio radio = new Radio(234);
        radio.setName("Radio FM");
        
        System.out.println("Nama barang Antik : " + radio.getName());
        radio.tampilUmur();
    }
    
}
