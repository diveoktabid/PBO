package week3;

public class Clock
{
    public static void main(String[] args)
    {

    ClockDisplay waktu = new ClockDisplay(23, 59);
    waktu.timeTick();
    System.out.println("Jam Sekarang " + waktu.getTime());
    
    }
}