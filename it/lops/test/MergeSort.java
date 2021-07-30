package it.lops.test;

public class MergeSort {


    private int[] a = {2, 6, 8};

    private int[] b = {3, 5, 7, 9, 10};


    public MergeSort() {

        System.out.println("Array non ordinato : ");

        StringBuffer str = new StringBuffer("a : ");

        int[] ret = merge(a, b);

        for (int i = 0; i < ret.length; i++) {

            str.append(+ret[i] + ",");

        }

        System.out.println(str.substring(0, str.length() - 1));


    }

    private int[] merge(int[] v1, int[] v2) {
        int[] ret = new int[v1.length + v2.length];

        int i = 0;
        int j = 0;

        for (int k = 0; k <= ret.length - 1; k++) {

            if (i <= v1.length - 1 && j <= v2.length - 1) {
                if (v1[i] < v2[j]) {
                    ret[k] = v1[i];
                    i++;
                } else {
                    ret[k] = v2[j];
                    j++;
                }
            } else if (i > v1.length-1) {
                ret[k] = v2[j];
                j++;
            } else {
                ret[k] = v1[i];
                i++;
            }
        }

        return ret;
    }

    public static void main(String[] args) {

        MergeSort m1 = new MergeSort();

    }


}
