package week10;

import java.util.Scanner;

public class main
{
    public static void Main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan Panjang = ");
        int panjang = scanner.nextInt();

        
        System.out.println("Masukan Lebar = ");
        int lebar = scanner.nextInt();

        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

        persegiPanjang.luas();

    }

}