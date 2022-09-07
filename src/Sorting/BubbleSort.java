package Sorting;
public class BubbleSort {
    public static void main(String[] args) {
        int i,j;
        String s_arr[] = {
            "Richard",
            "John",
            "Williams",
            "Peter",
            "Aron"
        };
        String tmp;
        System.out.println("Sorted Strings:");
        for ( i = 0 ; i < s_arr.length ; i++) {
            for ( j = 0 ; j < s_arr.length-i-1 ; j++) {

                if (s_arr[j+1].compareTo(s_arr[j]) > 0) {
                    tmp = s_arr[j];
                    s_arr[j] = s_arr[j+1];
                    s_arr[j+1] = tmp;
                }
            }
            System.out.println(s_arr[j]);
        }
    }
}
