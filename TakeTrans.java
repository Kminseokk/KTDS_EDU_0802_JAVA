package java08_1week;

public class TakeTrans {
	public static void main(String[] args) {
	// 두 명의 학생을 생성
		Student studentChris = new Student("Chris", 5000); 
		Student studentEmily = new Student("Emily", 10000);
		Student studentJenna= new Student("Jenna", 20000);
		Student studentVicky= new Student("Vicky", 30000);
		Student studentSpencer= new Student("Spencer", 30000);
			  
		Bus bus100 = new Bus(100);
		studentChris.takeBus(bus100); // Chris가 100번 버스를 탐
		studentChris.showInfo(); // Chris 정보 출력
		bus100.showInfo(); // 버스 정보 출력
			  
		Subway subwayGreen = new Subway("2호선"); 
		studentEmily.takeSubway(subwayGreen); // Emily가 2호선을 탐
		studentEmily.showInfo(); // Emily 정보 출력
		subwayGreen.showInfo(); // 지하철 정보 출력
		
		Taxi KakaoTaxi = new Taxi("카카오 택시");
		studentJenna.takeTaxi(KakaoTaxi); //제나가 카카오택시를 탐
		studentJenna.showInfo(); //제나 출력
		KakaoTaxi.showInfo(); //택시정보출력
		
		Cafe cafestar = new Cafe("별다방", "ame");
		studentVicky.takeCafeAme(cafestar); // 비키가 별다방에 감
		studentVicky.showInfo(); //비키 출력
		cafestar.showInfo(); // 별다방 출력
		
		Cafe cafekong = new Cafe("콩다방", "latte");
		studentSpencer.takeCafeLatte(cafekong); // 스팬서 콩다방 감
		studentSpencer.showInfo(); //스팬서 출력
		cafekong.showInfo(); //콩다방정보출력
		
		
		}
}

