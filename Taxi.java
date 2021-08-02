package java08_1week;

public class Taxi {
	String TaxiName; // 택시 이름
	int passengerCount; // 승객 수
	int money; // 택의 수입
		  
	public Taxi(String taxiName){ // 버스 번호를 매개변수로 받는 생성자
		this.TaxiName = taxiName;
	}
		    
	public void take(int money){ // 승객이 낸 돈을 받음 
		this.money += money; // 택시의 수입 증가
		passengerCount++; // 승객 수 증가
	}
		    
	public void showInfo() { // 택시 정보를 출력하는 함수
		System.out.println("택시 "+"\""+ TaxiName +"\""+ "의 승객은 " + passengerCount +"명이고, 수입은 "
				+ money + "입니다.");
		System.out.println("************************************");
	}
}
