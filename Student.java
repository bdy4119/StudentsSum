package _01_studentSum;

public class Student {

	//�������
	String name;
	int sum;
	double avg;
	int ban, num; //��, ��ȣ
	int kor, eng, math;
	
	
	
	
	//�����޼ҵ�
	public int getTotal(int kor2, int eng2, int math2) {
		sum = kor2 + eng2 + math2;
		return sum;
	}
	
	
	//��ո޼ҵ�
	public double getAverage() {
		getTotal(kor, eng, math);
		avg = (double)sum/3;
		return avg;
	}
	
	
	
	
}
