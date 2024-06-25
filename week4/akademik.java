package week4;
import week1.Mahasiswa;
import java.util.*;

public class akademik {
    public static void main(String[]args){
        int n;
        System.out.print("Masukan Jumlah Data: ");

        //buat objek dari classsscanner untuk menginput data
        Scanner inp = new Scanner(System.in);

        n = inp.nextInt();
        //buat variable array dengan tipe mahasiswa
        Mahasiswa[] mhs = new Mahasiswa[n];

        String nim;
        String nama;
        int usia;
        Double ipk;

        for(int i = 0; i < n; i++){ //menggunakan perulangan for karenasudah tau berapa jumlah perulangannya
            System.out.println("Data ke-"+(i+1));
            System.out.println("Masukan Nim : ");
            nim = inp.next();
            System.out.println("Masukan Usia : ");
            usia = inp.nextInt();
            System.out.println("Masukan IPK : ");
            ipk = inp.nextDouble();
            System.out.println("Masukan Nama : ");
            nama = inp.next();

            mhs[i] = new Mahasiswa(nim,nama,usia,ipk);
        }

        for(int i = 0; i < mhs.length; i++){
            mhs[i].getIdentitas();
        }
    }
}