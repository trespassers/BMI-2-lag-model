package bmi;

public class Funktionalitet implements IFunktionalitet{
	private IData d;
	
	public Funktionalitet(IData d) {
		this.d = d;
	}
	
	@Override
	public double getBMI(String cpr) {
		double bmi = (d.getWeight(cpr))/(Math.pow(2, d.getHeight(cpr)));
		return bmi;
	}

	@Override
	public String getTextualBMI(String cpr) {
		if(getBMI(cpr) < 18.5) {
			return "Du vejer for lidt";
		} else if(getBMI(cpr) >= 18.5 || getBMI(cpr) < 25) {
			return "Din vægt er passende";
		} else if(getBMI(cpr) >= 25 || getBMI(cpr) < 30) {
			return  "Du er overvægtig";
		} else {
			return "Du er svært overvægtig";
		}
	}

	@Override
	public String getNavn(String cpr) {
		return d.getName(cpr);
	}

}
