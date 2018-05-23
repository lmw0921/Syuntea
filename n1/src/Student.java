import java.util.Scanner;
public class Student {
	
	public static void main(String[] args) {
	int K, M, S, S2, E;
	int Hab;
	int[] Stu = {1, 2, 3};
	int[] rank = {1, 1, 1};
	Scanner sc = new Scanner(System.in);
	
	for(int i = 0; i < 3; i++){
		rank[i] = 1;
	}
	
	for(int i = 0; i < Stu.length; i++){
	System.out.println("점수를 입력하시오 : [ 국어, 수학, 사회, 과학, 영어 ]");
	K = sc.nextInt();
	M = sc.nextInt();
	S = sc.nextInt();
	S2 = sc.nextInt();
	E = sc.nextInt();
	Hab = (K + M + S + S2 + E) / S;
	System.out.println(Stu[i] " 국어 : " +K+ " 수학 : " +M+ " 사회 : " +S+ " 과학 : " +S2+ " 영어 : " +E+" +Stu+ ");
	}
	for(int i =)
}