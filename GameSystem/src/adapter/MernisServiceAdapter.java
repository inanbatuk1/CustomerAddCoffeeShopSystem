package adapter;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{
	public boolean confirm=false;
	KPSPublicSoapProxy kpsProxy = new KPSPublicSoapProxy();
	@Override
	public boolean CheckIfRealPerson(Gamer gamer) throws RemoteException {
		
		boolean result =  kpsProxy.TCKimlikNoDogrula(gamer.getNationalityId(),gamer.getGamerFirstName(), gamer.getGamerLastName(),
				gamer.getDateOfBirth());
		if(result) {
			System.out.println("Oyuncu do�rulamas� Ba�ar�l�.");
			confirm=true;
			result=true;
			
		}else
		{
			System.out.println("Oyuncu do�rulamas� ba�ar�s�z.");
			result =false;
			confirm =false;
		}
		return result;
	}

}
