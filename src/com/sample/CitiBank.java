package com.sample;

public class CitiBank extends Employee{
	@Override
	public void savings(int a) {
		this.deposit();
		System.out.println("citibank is :4%");
		
	}

	@Override
	public void deposit() {
		System.out.println("citibank deposit is:3%");
	}
public static void main(String[] args) {
	Employee e =  new Employee();
	e.deposit();
			
		

}
}
