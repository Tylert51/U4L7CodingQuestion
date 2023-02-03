public class Solution {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        int[] num = {41, 77, 74, 22, 44};

        for (int i = 0; i < num.length; i++) {
            arr[0][i] = num[i];
        }

        System.out.println(solve(arr, "1 9"));


    }

    public static String solve (int[][] array , String q) {
        int x = Integer.parseInt(q.substring(0, q.indexOf(" ")))  -  1;
        int y = Integer.parseInt(q.substring(q.indexOf(" ") + 1)) - 1;

        if(y < array[0].length && x < array.length) {
            return array[x][y] + "";
        }

        return "ERROR!";
    }

}
