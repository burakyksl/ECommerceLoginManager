package ECommerceLoginManager;

import ECommerceLoginManager.Business.Abstructs.CustomerService;

import ECommerceLoginManager.Business.Concretes.CustomerManager;
import ECommerceLoginManager.Core.GmailLogger;
import ECommerceLoginManager.Core.Logger;
import ECommerceLoginManager.Entities.Concretes.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(1, "Burak", "Yüksel", "yukselburakyuksel@gmail.com", "252Burak.");
		CustomerService customerService = new CustomerManager();
		Logger logger = new GmailLogger();
		customerService.add(customer,logger);
		
	}

}
