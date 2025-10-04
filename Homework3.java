import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 개의 수를 입력할 예정인가요?");
        int count;
        int max;
        int min;
        count = sc.nextInt();
        int[] arr1 = new int[count];
        System.out.println("수를 입력하세요:");
        for (int i = 0; i < count; i++) {
            arr1[i] = sc.nextInt();
        }
        max = arr1[0];
        for (int i = 0; i < count - 1; i++) {
            if (max < arr1[i+1]){
                max = arr1[i+1];
            }
        }
        min = arr1[0];
        for (int i = 0; i < count - 1; i++) {
            if (min > arr1[i+1]){
                min = arr1[i+1];
            }
        }
        System.out.printf("최대값: %d\n", max);
        System.out.printf("최소값: %d", min);
    }
}
