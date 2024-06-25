package week7;

import week1.Mahasiswa;

public class MahasiswaAktif extends Mahasiswa {

    public int usia;
    public int semester;

    public MahasiswaAktif(String nim, String nama, String tanggal_lahir, int semester)
    {
        super(nama,nim,tanggal_lahir);
        this.semester = semester;


    public int getUsia()
    {
        return usia;
    }

    public int getSemester()
    {
        return semester;
    }

    }
}