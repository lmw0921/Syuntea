import java.util.Scanner;
public class School {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int K, S, M;
		int H;
		boolean Circles;
		int Circlesing = 0;
		
		for(int i = 1; i <= 3; i++){
		System.out.println("동아리 가입 여부 > true < , > false <");
		Circles = s.nextBoolean();
		
		if(Circles = true){
			System.out.println("동아리 가입 여부 승인...!");
		} else if(Circles = false){
			System.out.println("동아리 가입 여부 거절...!");
		}
		System.out.println("국어,과학,수학 점수를 입력 하시오");
		K = s.nextInt();
		S = s.nextInt();
		M = s.nextInt();
		H = s.nextInt();
		
		System.out.print("동아리 가입 여부 : "+Circles);
		System.out.println(" 국어 : [" +K+ "] 과학 : [" +S+ "] 수학 : [" +M+ "] 합계 : [" +H+"]" );
		
		Circlesing++;
		}
		
		System.out.println(Circlesing = 1);
		int[][] AA = new int[2][3];
	}
}