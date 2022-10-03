package cafeStarbucksNero.business.concretes;

import java.security.PublicKey;

import cafeStarbucksNero.core.abstracts.ICustomerCheckService;
import cafeStarbucksNero.entities.concretes.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean checkIfRealCustomer(Customer customer) {
	
	return true;
	}

}
