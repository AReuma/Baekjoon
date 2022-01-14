import java.util.Scanner;

public class Baekjoon_2480 {
    public static void main(String[] args) {
        int result;
        int cnt = 0, max =0, num = 0;

        Scanner scanner = new Scanner(System.in);
        int[] diceNum = new int[3];

        for(int i = 0; i <3; i++) {
            diceNum[i] = scanner.nextInt();
        }

        for(int i = 0; i <3; i++){
            for(int j = i+1; j <3; j++){
                if(i == j){
                    continue;
                }
                else if(diceNum[i] == diceNum[j]) {
                    cnt++;
                    num = diceNum[i];
                }
            }

            if(max < diceNum[i])
                max = diceNum[i];
        }

        //System.out.println(cnt);


        if(cnt == 3){
            result = 10000+num*1000;
        }else if(cnt == 1){
            result = 1000+num*100;
        }else {
            result = max * 100;
        }
        System.out.println(result);

    }
}
