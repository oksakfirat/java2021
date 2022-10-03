package game.core.concretes;

import game.core.abstracts.IMernisAdapter;
import game.entities.concretes.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements IMernisAdapter {

	@Override
	public boolean kimlikdogrulama(Gamer gamer) {
		KPSPublicSoap kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean dogruMu = false;
		try {
			dogruMu = kpsPublicSoapProxy.TCKimlikNoDogrula(gamer.getNationaltyId(), gamer.getFirstName().toUpperCase(),
					gamer.getLastName().toUpperCase(), gamer.getDateOfBirth());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return dogruMu;
	}

}
