package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Contribuinte;
import entities.Individual;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List <Contribuinte> list = new ArrayList<>();
		
		System.out.print("Enter the numbers of tax payers:  ");
		int n = sc.nextInt();
		
		for (int a = 1; a <= n; a++) {
			
			System.out.println("Taxes payers #" + a + " data: ");
			System.out.print("Individual or company (i/c) ? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name:  ");
			String name = sc.nextLine();
			System.out.print("Anual Income:  ");
			Double income = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expenditures:  ");
				Double health = sc.nextDouble();
				list.add(new Individual(name, income, health));
			}
			
			else {
				
				System.out.print("Numbers of employees:  ");
				int employees = sc.nextInt();
				list.add(new Company(name, income, employees));
			}
		}
		System.out.println();
		System.out.println("Taxes Paid: ");
		for (Contribuinte c : list) {
			System.out.println(c.getName() + ":  $ " + String.format("%.2f", c.taxes()));
		}
		System.out.println();
		Double sum = 0.0;
		for (Contribuinte c : list) {
			sum += c.taxes();
		}
		System.out.println("Total Taxes: " + String.format("%.2f", sum));
		sc.close();
	}

}
