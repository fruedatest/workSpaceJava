public class Programmer extends Employee{
	
	private int bonus;
	private String departamento;
	
	public Programmer() {
		super();
	}

	public Programmer(int bonus, String departamento) {
		super();
		this.bonus = bonus;
		this.departamento = departamento;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Programmer [bonus=" + bonus + ", departamento=" + departamento + "]";
	}
	
	
	
	
	
	
}
