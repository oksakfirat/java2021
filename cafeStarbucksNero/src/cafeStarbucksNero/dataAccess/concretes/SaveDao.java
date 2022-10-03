package cafeStarbucksNero.dataAccess.concretes;

import cafeStarbucksNero.dataAccess.abstracts.ISaveDao;
import cafeStarbucksNero.entities.concretes.Customer;

public class SaveDao implements ISaveDao{

	@Override
	public void save(Customer customer) {
		System.out.println("Kayıt yapıldı: "+customer.getFirstName() );
		
	}

}
