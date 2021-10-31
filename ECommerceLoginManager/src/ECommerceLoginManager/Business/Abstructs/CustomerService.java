package ECommerceLoginManager.Business.Abstructs;

import ECommerceLoginManager.Core.Logger;
import ECommerceLoginManager.Entities.Concretes.Customer;

public interface CustomerService {
	void add(Customer customer, Logger logger);
	
	
}
