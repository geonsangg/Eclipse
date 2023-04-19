package javapro.Generic;

public class ScarAgency implements Rentable<SCar> {

	@Override
	public SCar rent() {
		return new SCar();
	}

}
