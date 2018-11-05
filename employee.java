package dudaaa;

public class employee {

	private String name;
	private adresse Adress;
	private insurance Insurance;
	
	 public employee(String name, String street, String city, String state, String postalCode) {
		 this.name = name;
		 this.Adress = new adresse();
		 Adress.setCity(city);
		 Adress.setState(state);
		 Adress.setPostalCode(postalCode);
		 Adress.setStreet(street);
		 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public adresse getAdress() {
		return Adress;
	}

	public void setAdress(adresse adress) {
		Adress = adress;
	}

	public insurance getInsurance() {
		return Insurance;
	}

	public void setInsurance(insurance insurance) {
		Insurance = insurance;
	} 
	 @Override
	 public String toString() {
	 StringBuilder retValue = new StringBuilder();
	 retValue.append(name).append(" ")
	 .append(Adress.getStreet()).append(" ")
	 .append(Adress.getCity()).append(" ")
	 .append(Adress.getState()).append(" ");

	 if (Insurance != null) retValue.append(Insurance.getPolicyId()).append(" ")
	 .append(Insurance.getPolicyName());
	 return retValue.toString();
	 } 

}
