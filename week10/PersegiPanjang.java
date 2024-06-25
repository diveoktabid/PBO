package week10;

public class PersegiPanjang extends BangunDatar
{
    private int panjang;
    private int lebar;
    private int luas;

    public PersegiPanjang(int panjang, int lebar)
    {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang()
    {
        return panjang;
    }

    public int getLebar()
    {
        return lebar;
    }

    public int getLuas()
    {
        return Luas;
    }
    public int hitungLuas()
    {
        return panjang*lebar;
    }

    public void Luas()
    {
        System.out.println("Luas Persegi Panjang dengan panjang"+panjang+ "dan Lebar" +lebar+"adalah"+hitungLuas());
    }

    public void keliling()
    {
        System.out.println("Keliling Persegi Panjang dengan panjang"+panjang+ "dan Lebar" +lebar+"adalah"+hitungLuas());
    }
}