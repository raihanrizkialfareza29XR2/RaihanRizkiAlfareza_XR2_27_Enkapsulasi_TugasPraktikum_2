package TugasPraktikum2;

public class TestBola {
    public static void main(String[] args) { //Membuat method main nya
        double JariJari = 16; //Membuat variabel jari - jari baru untuk memanipulasi
        Bola objek = new Bola(14); //Membuat objek baru sekaligus memasukkan parameternya
        objek.showDiameter(); //Memanggil method showDiameter
        objek.showLuasPermukaan(); //Memanggil method showLuasPermukaan
        objek.showVolume(); //Memanggil method showVolume
        System.out.println("\n"); //Sekedar memberi spasi
        objek.setJarijari(JariJari); //Manipulasi objek dengan variabel jari - jari baru yang dibuat
        objek.showDiameter(); //Memanggil method showDiameter
        objek.showLuasPermukaan(); //Memanggil method showLuasPermukaan
        objek.showVolume(); //Memanggil method showVolume

        //Kesimpulan : Output yang dihasilkan adalah nilai diameter, luas permukaan, dan volume bola berdasarkan jari jari yang telah
        //ditetapkan. Dengan menetapkan manipulasi objek yaitu membuat variabel baru yang berfungsi sebagai parameter dari
        //method void setJarijari. Sehingga program akan menampilkan 2 hasil yang berbeda dari nilai jari - jari yang berbeda pula.
    }
}
