package java08_1week;

public class Taxi {
	String TaxiName; // �ý� �̸�
	int passengerCount; // �°� ��
	int money; // ���� ����
		  
	public Taxi(String taxiName){ // ���� ��ȣ�� �Ű������� �޴� ������
		this.TaxiName = taxiName;
	}
		    
	public void take(int money){ // �°��� �� ���� ���� 
		this.money += money; // �ý��� ���� ����
		passengerCount++; // �°� �� ����
	}
		    
	public void showInfo() { // �ý� ������ ����ϴ� �Լ�
		System.out.println("�ý� "+"\""+ TaxiName +"\""+ "�� �°��� " + passengerCount +"���̰�, ������ "
				+ money + "�Դϴ�.");
		System.out.println("************************************");
	}
}
