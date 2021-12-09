package model;

public abstract class PremijerLigaKonf {
	
	public abstract FudbalskiKlub klubSaNajviseZaposlenih(); // vraca klub sa najvise zaposlenih
	public abstract double prosecnaIzdaciKluba(); // vraca se prosek izdataka klubova na zaposlene
	public abstract Fudbaler najskupljiFudbalerLige(); // vraca fudbalera koji ima najvecu platu i ispisuje i njegov klub
	public abstract int brojIgracaSponzoraLige(); // vraca broj koliko fudbalera ima istog sponzora kao i liga

}
