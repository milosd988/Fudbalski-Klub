package interfejs;



public interface IFudbalskiKlub {
	
	public double najskupljiFudbaler(); // vraca fudbalera sa najvecom godisnjom zaradom
	public int najNeEfikasnijiFudbaler(); // vraca fudbalera sa najmanjom produktivnoscu odnosno sa najmanjim brojem golova i asistencija
	public int brojFudbaleraNaPoziciji(String pozicija); // vraca  broj fudbalera koje klub ima na zadatoj poziciji
	public double najJeftinijiFudbalerRezerva(); // vraca fudbalera koji ima najmanju platu a rezerva je
	

}
