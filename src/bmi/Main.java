package bmi;

public class Main {

	public static void main(String[] args) {
		IData d = new Data();
		IFunktionalitet f = new Funktionalitet(d);
		TUI t = new TUI(f);
		t.calcBMI();
	}

}
