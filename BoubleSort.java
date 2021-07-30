import java.lang.reflect.Array;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class BoubleSort {

     private int[] a = IntStream.range(0, 10).map(i -> Math.abs(ThreadLocalRandom.current().nextInt(10))).toArray();

    //private int[] a = {42,32,28,53,57,41,96,81,95,19};



    public BoubleSort() {


        System.out.println("Array non ordinato : ");

        StringBuffer str = new StringBuffer("a : ");

        for (int i = 0; i < a.length; i++) {

            str.append(+a[i] + ",");

        }

        System.out.println(str.substring(0,str.length()-1));

        boolean scam = true;

        int j = a.length -1 ;

        while (scam &&  j > 0 )

        {
            scam = false;

            for (int i = 0; i < a.length-1; i++) {


                if (a[i] > a[i+1]) {

                    int temp = a[i];

                    a[i] = a[i+1];

                    a[i+1] = temp;

                    scam = true;

                }

            }

            j--;

        }



        System.out.println("Array ordinato : ");

        str = new StringBuffer("a : ");

        for (int i = 0; i < a.length; i++) {
            str.append(+a[i] + ",");
        }

        System.out.println(str.substring(0,str.length()-1));

    }


    public static void main(String[] args) {

        BoubleSort b1 = new BoubleSort();

    }
}
