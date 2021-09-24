import java.util.Scanner;

public class ten_integers_array {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i = 0;
		int idx = 0;
		int total = 0;
		int[] array = new int[10];
		
		while(idx < array.length) {
			System.out.print("정수를 입력하세요: ");
			int num = in.nextInt();
			total += num;
			
			if(num < 0 || num > 100) {
				System.out.println("범위를 벗어났습니다.\n");
				continue;
			}
			
			array[idx] = num;
			idx++;
		}
		System.out.println("총합 = " + total);
		System.out.println("평균 = " + (total * 1.0 / 10));
	}
}
