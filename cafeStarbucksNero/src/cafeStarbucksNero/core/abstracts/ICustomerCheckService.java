package cafeStarbucksNero.core.abstracts;

import cafeStarbucksNero.entities.concretes.Customer;

public interface ICustomerCheckService {
	public boolean checkIfRealCustomer(Customer customer);

}
