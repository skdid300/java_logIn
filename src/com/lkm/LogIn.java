package com.lkm;

import java.util.Scanner;

public class LogIn {

	public LogIn() {
		
	}
	public static void logIn(){
		String id = "Administrator";
		String pw = "1234";
		int count = 0;
		Scanner scanner;
		
		do {
			scanner = new Scanner(System.in);
			System.out.print("���̵�:");
			String inputID = scanner.next();
			System.out.print("��и�ȣ:");
			String inputPW = scanner.next();
			
			
			if(inputID.equals(id)&& inputPW.equals(pw)){
				System.out.println("ȯ���մϴ�!");
				
				break;
			}else{
				System.out.println("���̵� �Ǵ� ��й�ȣ�� �߸� �Է��ϼ̽��ϴ�. 3ȸ ���н� ���ѵ�.");
				count++;
			}
			
			
		} while (count<3);
		scanner.close();
		
		
		
	}

}
