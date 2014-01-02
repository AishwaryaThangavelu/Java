package aish.vaishno.reflectiontrial.executer;

public class POJO {
	private String carString;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("POJO [carString=");
		builder.append(carString);
		builder.append("]");
		return builder.toString();
	}

	public String getCarString() {
		return carString;
	}

	public void setCarString(String carString) {
		this.carString = carString;
	}
	
}
