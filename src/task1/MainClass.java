package task1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;



public class MainClass {

	public static void main(String[] args) throws Exception {

		Operations.showTables();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice from above tables");
		String tableName = sc.next();

		while (true) {

			System.out.println("what operation you need to perform \n 1.insert \n 2.Execute \n 3.Exit");

			int choice = sc.nextInt();

			switch (choice)

			{
			case 1:
				System.out.println("enter your choice in integer fromat again for verification \n 1.trainee \n 2.trainer");
				int tab = sc.nextInt();
				switch (tab) {
				case 1:
					System.out.println("enter the following details in the same order one by one!!!!! ");
					System.out.println(
							"\nTrainee_ID \n Trainee_Name\n Trainee_Ph_No \n Trainee_City \n no.technologies trained on ");
					int id = sc.nextInt();
					String name = sc.next();
					int Pno = sc.nextInt();
					String city = sc.next();
					int tech = sc.nextInt();
					Operations.insertTrainee(id, name, Pno, city, tech, tableName);
					break;
				case 2:	System.out.println("enter the following details in the same order one by one!!!!! ");
				        System.out.println(" Trainer_id\n Trainer_Name\n Trainer_Ph_No\n Trainer_Desgination \n Trainer_City\n Trainer_Projects");
				       int id1 = sc.nextInt();
				       String name1 = sc.next();
				       int Pno1 = sc.nextInt();
				       String Desg=sc.next();
				        String city1 = sc.next();
				        String project = sc.next();
				        int id2=sc.nextInt();
				        		
				        
				       Operations.insertTrainer(id1,name1, Pno1,Desg, city1, project,id2, tableName);
				        break;
				}
				break;

			case 2:
				Operations.execute(tableName);
				break;

			case 3:Operations.close();
			System.exit(0);
			break;

			default:
				System.out.println("invalid choice");
				System.exit(0);
				break;
			
			}

		}
	}
}