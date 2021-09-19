package _1109;

public class Test {
    public static void main(String[] args){
        int[][] arr= new int[][]{{1,2,10},{2,3,20},{2,5,25}};
        corpFlightBookings(arr, 5);
    }
    public static int[] corpFlightBookings(int[][] bookings, int n) {
        // int len = 0;
        // for(int[] arr : bookings ){
        //     len = Math.max(len,arr[1]);
        // }
        int[] rs = new int[++n];

        for(int[] arr : bookings ){
            for(int i = arr[0];i <= arr[1];i ++ ){
                rs[i] += arr[2];
            }
        }
        int[] rss = new int[--n];
        int idx = 0;
        while (idx < n){
            rss[idx++] = rs[idx];
        }
        return rss;
    }
}
