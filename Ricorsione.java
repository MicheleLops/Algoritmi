public class Ricorsione {

    private int index = 0 ;

    private void rec()
    {
        if (index < 10 ){
            index++;
            System.out.println("Index : " + index);
            rec();
        }
    }

    public Ricorsione(int a ) {
        rec();
    }

    public static void main(String[] args) {
         Ricorsione seq = new Ricorsione(10);
    }
}
