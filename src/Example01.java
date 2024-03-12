
public class Example01 {

	public static void main(String[] args) {
		
		//변수 선언하고 초기화하기
		int days;
		days = 10;
		System.out.println(days);
		
		int speed = 20;
		System.out.println(speed);
		
		//상수 선언하고 초기화하기
		final int time = 100;
		System.out.println("Final time is ");
		System.out.println(time);
		
		days = 30;
		speed = 200;
		//time = 10;
		
		System.out.println("New days, New speed, New time: ");
		System.out.println(days);
		System.out.println(speed);
		System.out.println(time);
		
	}

}
