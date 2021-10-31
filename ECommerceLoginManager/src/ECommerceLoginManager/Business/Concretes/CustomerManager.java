package ECommerceLoginManager.Business.Concretes;

import java.util.regex.Pattern;

import ECommerceLoginManager.Business.Abstructs.CustomerCheckService;
import ECommerceLoginManager.Business.Abstructs.CustomerService;
import ECommerceLoginManager.Core.Logger;
import ECommerceLoginManager.Entities.Concretes.Customer;

public class CustomerManager implements CustomerService, CustomerCheckService {

	

	@Override
	public boolean check(Customer customer) {
		String emailPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(emailPattern, Pattern.CASE_INSENSITIVE);
		boolean matcher = pattern.matcher(customer.getEmail()).find();
		
		
		if (customer.getFirstName().length() > 2 && customer.getLastName().length() > 2
				&& customer.getPasword().length() >= 6 && matcher== true) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void add(Customer customer, Logger logger) {

		if (check(customer) == true) {
			logger.log(customer.getEmail());

		} else {
			System.out.println("kayýt baþarýsýz");
		}

	}

}
