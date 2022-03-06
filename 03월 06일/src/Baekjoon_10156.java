import java.util.Scanner;

public class Baekjoon_10156 {
    public static void main(String[] args) {
        // 과자가격
        // 과자 갯수
        // 현재 가진 돈
        // 필요한 돈은 부모님께 받는다.
        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();
        int count = scanner.nextInt();

        int money = scanner.nextInt();

        int nMoney;

        if(count * price > money){
            nMoney = (count*price) - money;
        }else
            nMoney = 0;

        System.out.println(nMoney);

    }
}
