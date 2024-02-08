package application;

import java.time.LocalDate;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Gustavo", "gustavo@gmail.com", LocalDate.parse("2004-09-01"), 3000.0, obj);
		
		System.out.println(seller);
	}

}
