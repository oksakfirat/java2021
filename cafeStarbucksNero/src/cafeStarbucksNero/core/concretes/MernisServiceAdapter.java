package cafeStarbucksNero.core.concretes;

import cafeStarbucksNero.core.abstracts.ICustomerCheckService;
import cafeStarbucksNero.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean checkIfRealCustomer(Customer customer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			result = client.TCKimlikNoDogrula(customer.getNationaltyId(), 
					customer.getFirstName().toUpperCase(), 
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth());
					//customer.getDateOfBirth().getYear()
		}catch (Exception e) {
			e.printStackTrace();
	}
	return result;
	}


}
