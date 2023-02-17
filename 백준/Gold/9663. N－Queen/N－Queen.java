import java.util.Scanner;

public class Main {

    public static int[] arr;
    public static int N;
    public static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        
        nQeen(0);
        System.out.println(count);
    }

    private static void nQeen(int num) {
        if(num == N){
            count++;
            return;
        }
        for(int i=0; i<N; i++){
            arr[num] = i;

            if(Possibility(num)){
                nQeen(num+1);

            }

        }
    }

    private static boolean Possibility(int num) {
        for (int i=0; i<num; i++){
            if(arr[num] == arr[i]){
                return false;
            } else if (Math.abs(num-i) == Math.abs(arr[num]-arr[i])){
                return false;
            }
        }
        return true;
    }
}