package java08_1week;

public class TakeTrans {
	public static void main(String[] args) {
	// �� ���� �л��� ����
		Student studentChris = new Student("Chris", 5000); 
		Student studentEmily = new Student("Emily", 10000);
		Student studentJenna= new Student("Jenna", 20000);
		Student studentVicky= new Student("Vicky", 30000);
		Student studentSpencer= new Student("Spencer", 30000);
			  
		Bus bus100 = new Bus(100);
		studentChris.takeBus(bus100); // Chris�� 100�� ������ Ž
		studentChris.showInfo(); // Chris ���� ���
		bus100.showInfo(); // ���� ���� ���
			  
		Subway subwayGreen = new Subway("2ȣ��"); 
		studentEmily.takeSubway(subwayGreen); // Emily�� 2ȣ���� Ž
		studentEmily.showInfo(); // Emily ���� ���
		subwayGreen.showInfo(); // ����ö ���� ���
		
		Taxi KakaoTaxi = new Taxi("īī�� �ý�");
		studentJenna.takeTaxi(KakaoTaxi); //������ īī���ýø� Ž
		studentJenna.showInfo(); //���� ���
		KakaoTaxi.showInfo(); //�ý��������
		
		Cafe cafestar = new Cafe("���ٹ�", "ame");
		studentVicky.takeCafeAme(cafestar); // ��Ű�� ���ٹ濡 ��
		studentVicky.showInfo(); //��Ű ���
		cafestar.showInfo(); // ���ٹ� ���
		
		Cafe cafekong = new Cafe("��ٹ�", "latte");
		studentSpencer.takeCafeLatte(cafekong); // ���Ҽ� ��ٹ� ��
		studentSpencer.showInfo(); //���Ҽ� ���
		cafekong.showInfo(); //��ٹ��������
		
		
		}
}

