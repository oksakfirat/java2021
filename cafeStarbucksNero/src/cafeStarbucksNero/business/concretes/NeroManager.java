package cafeStarbucksNero.business.concretes;

import cafeStarbucksNero.business.abstracts.BaseCustomerService;
import cafeStarbucksNero.dataAccess.abstracts.ISaveDao;
import cafeStarbucksNero.entities.concretes.Customer;

public class NeroManager extends BaseCustomerService {
 
	ISaveDao saveDao;
	public NeroManager(ISaveDao saveDao) {
		this.saveDao=saveDao;
	}
 	@Override
	public void save(Customer customer) {
		System.out.println("Nero");
		saveDao.save(customer);
		
	}

}
