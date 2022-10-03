package cafeStarbucksNero;

import cafeStarbucksNero.business.abstracts.BaseCustomerService;
import cafeStarbucksNero.business.concretes.CustomerCheckManager;
import cafeStarbucksNero.business.concretes.NeroManager;
import cafeStarbucksNero.business.concretes.StarbucksManager;
import cafeStarbucksNero.core.concretes.MernisServiceAdapter;
import cafeStarbucksNero.dataAccess.concretes.SaveDao;
import cafeStarbucksNero.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.setId(1);
		customer.setFirstName("Fırat");
		customer.setLastName("Okşak");
		customer.setNationaltyId("20863728682778");
		customer.setDateOfBirth(1995);
		BaseCustomerService customerService=new NeroManager(new SaveDao());
		customerService.save(customer);
		BaseCustomerService starbucks=new StarbucksManager(new SaveDao(), new MernisServiceAdapter());
		starbucks.save(customer);
		

	}

}
