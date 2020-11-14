package if1.pkg10119016.latihan47.nilaimahasiswa;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan program 
 * nilai mahasiswa menggunakan getter setter
 */
public class IF110119016Latihan47NilaiMahasiswa {

   
    public static void main(String[] args) {
       NilaiMahasiswa nilaimahasiswa = new NilaiMahasiswa();
        
        nilaimahasiswa.setNilaiQuiz(60.0);
        nilaimahasiswa.setNilaiUts(80.0);
        nilaimahasiswa.setNilaiUas(75.0);
        
        double quiz = nilaimahasiswa.getNilaiQuiz();
        double uts = nilaimahasiswa.getNilaiUts();
        double uas = nilaimahasiswa.getNilaiUas();
        double nilaiAkhir = nilaimahasiswa.nilaiAkhir(quiz, uts, uas);
        char index = nilaimahasiswa.index(nilaiAkhir);
        String str = String.valueOf(index);
        String keterangan = nilaimahasiswa.keterangan(str);
        
        System.out.println("Quiz\t\t = " + quiz);
        System.out.println("UTS\t\t = " + uts);
        System.out.println("UAS\t\t = " + uas);
        System.out.println();
        System.out.println("Nilai Akhir\t = " + nilaiAkhir);
        System.out.println();
        System.out.println("Index\t\t = " + index);
        System.out.println("Keterangan\t = " + keterangan);
    }
    
}
