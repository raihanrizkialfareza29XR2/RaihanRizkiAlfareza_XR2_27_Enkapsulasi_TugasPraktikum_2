package TugasPraktikum2;

public class Bola {
    private double jarijari; //Membuat variabel jarijari dengan tipe data double
    public Bola (double jarijari){ //Membuat parameter pada class Bola
        this.jarijari = jarijari;
    }
    public void setJarijari (double jarijari){ //Membuat parameter pada method void setJarijari
        this.jarijari = jarijari;
    }
    public void showDiameter(){ //Membuat method void showDiameter yang berisi rumus untuk menghitung diameter bola berdasarkan input jarijari yang ditetapkan
        System.out.println("");
        System.out.println("|Diameter Bola Adalah : " + 2*jarijari);
    }
    public void showLuasPermukaan(){ //Membuat method void showLuas yang berisi rumus untuk menghitung luas bola berdasarkan input jarijari yang ditetapkan
        System.out.println("|Luas Permukaan Bola Adalah : " + (4/3*Math.PI*Math.pow(jarijari,3))); //Math.PI artinya 3,14. Sedangkan Math.pow digunakan untuk operasi pemangkatan.
    }
    public void showVolume(){ //Membuat method void showVolume yang berisi rumus untuk menghitung volume bola berdasarkan input jarijari yang ditetapkan
        System.out.println("|Volume Bola Adalah : " + (4*Math.PI*Math.pow(jarijari,2))); //Math.PI artinya 3,14. Sedangkan Math.pow digunakan untuk operasi pemangkatan.
    }
}
