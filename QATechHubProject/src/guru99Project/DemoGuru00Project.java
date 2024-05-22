package guru99Project;

public class DemoGuru00Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Guru99Project guru99project = new Guru99Project();

		guru99project.invokeBrowser();

		guru99project.login("mngr571021", "edugEja");

		guru99project.addCustomer();

		String customerId = guru99project.getCustomerId();

		System.out.println(customerId);

	}

}