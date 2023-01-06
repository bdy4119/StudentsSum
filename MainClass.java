package _01_studentSum;

public class MainClass {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.name = "성춘향";
		s.ban = 1;
		s.num = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름" + s.name);
		System.out.println("총점:" + s.getTotal(s.kor, s.eng, s.math));
		System.out.println("평균:" + s.getAverage());
		
	}

}
