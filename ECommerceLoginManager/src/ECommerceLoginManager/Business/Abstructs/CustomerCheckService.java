package ECommerceLoginManager.Business.Abstructs;

import ECommerceLoginManager.Entities.Concretes.Customer;

public interface CustomerCheckService {

	boolean check(Customer customer);
	
}
