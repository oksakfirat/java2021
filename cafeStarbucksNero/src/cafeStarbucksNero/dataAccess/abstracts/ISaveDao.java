package cafeStarbucksNero.dataAccess.abstracts;

import cafeStarbucksNero.entities.concretes.Customer;

public interface ISaveDao {

	public void save(Customer customer);
}
