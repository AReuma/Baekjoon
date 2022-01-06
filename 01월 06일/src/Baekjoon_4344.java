import java.util.Scanner;

public class Baekjoon_4344 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int num2;

        // num번 만큼 반복
        // num2만큼 평균 구하기 -> 과목이라고 생각.
        // 왜 실행은 되는데 백준에 가져가면 틀렸습니다...

        int[][] score;
        double avg[] = new double[num];
        double sum;
        double cnt;
        for(int i = 0; i < num; i++){
            num2 = scanner.nextInt();
            score = new int[num][num2];
            sum = 0;
            cnt = 0;
            for(int j = 0; j < num2; j++){
                score[i][j] = scanner.nextInt();
                sum += score[i][j];
                //System.out.println(score[j]);
            }
            avg[i] = sum/num2;
            //System.out.println("평균: "+avg[i]);

            for(int j = 0; j < num2; j++){
                if(score[i][j] > avg[i]){
                    //System.out.println("1111"+score[i][j]);
                    cnt++;
                }
            }
            System.out.printf("평균 %.3f%%\n",(cnt/num2)*100);
        }


    }
}
