package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
		Department depart = new Department(1, "teste");
		Seller seller = new Seller(1, "Pedro", "pedro@gmail.com", new Date(), 2020.00, depart);
		
		System.out.println(seller);
	}

}
