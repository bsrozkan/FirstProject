package busra.project.testbase;

import busra.project.pages.AddEmployeePageElements;
import busra.project.pages.DashboardPageElements;
import busra.project.pages.LoginPageElements;
import busra.project.pages.PersonalDetailsPageElements;

public class PageInitializer {
	
	public static LoginPageElements login;
	public static DashboardPageElements dashboard;
	public static AddEmployeePageElements addEmployee;
	public static PersonalDetailsPageElements personalDetails;
	public static EmployeeListPageElements employeeList;

	public static void initialize() {
		login = new LoginPageElements();
		dashboard = new DashboardPageElements();
		addEmployee = new AddEmployeePageElements();
		personalDetails = new PersonalDetailsPageElements();
		employeeList = new EmployeeListPageElements();
	}

}
