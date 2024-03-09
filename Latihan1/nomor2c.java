package Latihan1;

public class nomor2c {
    public static void main(String[] args) {
        
        double diameter = 5;
        double tinggi = 10;
        double jariJari = diameter / 2;
        double luasAlas = Math.PI * Math.pow(jariJari, 2);
        double volume = luasAlas * tinggi;
        
        System.out.println("Nomer 2c : Menghitung Volume Tabung ");
        System.out.println("-----------------------------------------");
        System.out.println("\nVolume tabung dengan diameter " + diameter + " dan tinggi " + tinggi + " adalah = " + volume);
        System.out.println(" ");
    
    }
}
