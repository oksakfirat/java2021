package cafeStarbucksNero.business.concretes;

import cafeStarbucksNero.business.abstracts.BaseCustomerService;
import cafeStarbucksNero.core.abstracts.ICustomerCheckService;
import cafeStarbucksNero.dataAccess.abstracts.ISaveDao;
import cafeStarbucksNero.entities.concretes.Customer;

public class StarbucksManager extends BaseCustomerService {

	ICustomerCheckService customerCheckService;
	ISaveDao saveDao;
	public StarbucksManager(ISaveDao saveDao,ICustomerCheckService customerCheckService) {
	this.saveDao=saveDao;
	this.customerCheckService=customerCheckService;
	}
	@Override
	public void save(Customer customer) {
		if (customerCheckService.checkIfRealCustomer(customer)) {
			System.out.println("Starbucks");
			saveDao.save(customer);
		}
		else {
			System.out.println("Bilgiler Hatalı");
		}

	}
	

}
