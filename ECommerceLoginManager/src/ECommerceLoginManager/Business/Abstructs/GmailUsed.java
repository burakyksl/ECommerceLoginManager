package ECommerceLoginManager.Business.Abstructs;

import java.util.ArrayList;
import java.util.List;

import ECommerceLoginManager.Entities.Concretes.Customer;

public class GmailUsed {

	

	public GmailUsed(Customer customer) {
		
		List<String> gmailList = new ArrayList<String>();
		gmailList.add("burakyuksel@gmail.com");
		for (String gmailcheck : gmailList) {
			if (customer.getEmail() == gmailcheck) {
				System.out.println("gmail sistemde kayýtlý");
			

			} else {
				gmailList.add(customer.getEmail());
				System.out.println(gmailList);
			

			}

		}
	}


}
