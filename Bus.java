package java08_1week;

public class Bus {
	// TODO Auto-generated method stub
	int busNumber; // ���� ��ȣ
	int passengerCount; // �°� ��
	int money; // ������ ����
		  
	public Bus(int busNumebr){ // ���� ��ȣ�� �Ű������� �޴� ������
		this.busNumber = busNumebr;
	}
		    
	public void take(int money){ // �°��� �� ���� ���� 
		this.money += money; // ������ ���� ����
		passengerCount++; // �°� �� ����
	}
		    
	public void showInfo() { // ���� ������ ����ϴ� �Լ�
		System.out.println("���� " + busNumber + "���� �°��� " + passengerCount +"���̰�, ������ "
				+ money + "�Դϴ�.");
		System.out.println("************************************");
	}
}


