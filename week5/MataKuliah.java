package week5;

public class Matakuliah {

    public String namaMatkul;
    public String Kelompok;
    public int sks;

    public Matakuliah(String namaMatkul, String Kelompok, int sks){
        this.namaMatkul = namaMatkul;
        this.Kelompok = Kelompok;
        this.sks = sks;
    }
    public String getnamaMatkul(){
        return namaMatkul;
    }
    public String getKelompok(){
        return Kelompok;
    }
    public int getsks(){
        return sks;
    }

}