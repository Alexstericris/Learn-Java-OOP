public class test {

	public static void main(String[] args) {

		employee kannan = new employee("kannan sudhakaran", "Andheri", "mumbai", "Maharashtra", "5055");
		System.out.println(kannan);
		// add via aggregation
		insurance insuranceInfo = new insurance();
		insuranceInfo.setPolicyId("1001");
		insuranceInfo.setPolicyName("Life Insurance policy");
		kannan.setInsurance(insuranceInfo);
		System.out.println(kannan);
	}
}
