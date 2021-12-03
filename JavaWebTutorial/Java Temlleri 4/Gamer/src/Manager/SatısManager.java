package Manager;
import Interface.SatısServices;
import Soyut.Game;
import Soyut.User;

public class SatısManager implements SatısServices {

	@Override
	public void buy(User user, Game game) {

		if(user.getBakiye() > game.getFiyat()) {
			System.out.println("Alındı");
			user.setBakiye(user.getBakiye() - game.getFiyat());
			
			this.bakiyeShow(user);
			
		}else {
			System.out.println("başarısız");
		}
		
		
	}

	@Override
	public void sell(User user, Game game) {
	user.setBakiye(user.getBakiye() + game.getFiyat());
		
		System.out.println("satıldı");
		
		this.bakiyeShow(user);
		
	}

	@Override
	public void bakiyeShow(User user) {
		System.out.println("Yeni Bakiye" + user.getBakiye());
		
	}
	


	

}
