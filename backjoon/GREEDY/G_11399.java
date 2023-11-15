import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class G_11399 {

    static int N;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        
//      사람 수
        N = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        int sum = 0;
        int ans = 0;

//      1사람 당 돈을 인출하는 데 걸리는 시간
        for(int i=0; i < N; i++){
            list.add(sc.nextInt());
        }

//      배열(오름차순)
        Collections.sort(list);

//      합 구하기
        for(int j=0; j< N; j++){
            sum += list.get(j);
            ans += sum;
        }

//        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }
}