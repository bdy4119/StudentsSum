package _01_studentSum;

public class Student {

	//멤버변수
	String name;
	int sum;
	double avg;
	int ban, num; //반, 번호
	int kor, eng, math;
	
	
	
	
	//총점메소드
	public int getTotal(int kor2, int eng2, int math2) {
		sum = kor2 + eng2 + math2;
		return sum;
	}
	
	
	//평균메소드
	public double getAverage() {
		getTotal(kor, eng, math);
		avg = (double)sum/3;
		return avg;
	}
	
	
	
	
}
