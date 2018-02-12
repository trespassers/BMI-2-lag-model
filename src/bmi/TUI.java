package bmi;

import java.util.Scanner;

public class TUI {
	private IFunktionalitet  f;
	private Scanner sc = new Scanner(System.in);
	
	public TUI(IFunktionalitet f) {
		this.f = f;
	}
	
	public void calcBMI() {
		try {
			System.out.print("Enter your CPR: ");
			String cpr = sc.next();
			sc.close();
			System.out.println(f.getBMI(cpr));
		} catch (DataException e) {
			System.out.println(e);
			
		}
	}	
}
