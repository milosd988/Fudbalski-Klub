package model;

import java.util.ArrayList;
import java.util.List;

public class PremijerLiga extends PremijerLigaKonf {
	
	private String sponzor;
	private List<FudbalskiKlub> klubovi = new ArrayList<FudbalskiKlub>();
	private int brojKlubova;
	private int brojIgraca;
	private int brojTrenera;
	
	public PremijerLiga() {
		
	}

	public PremijerLiga(String sponzor, List<FudbalskiKlub> klubovi, int brojKlubova, int brojIgraca, int brojTrenera) {
		super();
		this.sponzor = sponzor;
		this.klubovi = klubovi;
		this.brojKlubova = klubovi.size();
		for(FudbalskiKlub klub : klubovi) {
			this.brojIgraca += klub.getFudbaleri().size();
			this.brojTrenera ++;
			
		}
	}

	public String getSponzor() {
		return sponzor;
	}

	public void setSponzor(String sponzor) {
		this.sponzor = sponzor;
	}

	public List<FudbalskiKlub> getKlubovi() {
		return klubovi;
	}

	public void setKlubovi(List<FudbalskiKlub> klubovi) {
		this.klubovi = klubovi;
	}

	public int getBrojKlubova() {
		return brojKlubova;
	}

	public void setBrojKlubova(int brojKlubova) {
		this.brojKlubova = brojKlubova;
	}

	public int getBrojIgraca() {
		return brojIgraca;
	}

	public void setBrojIgraca(int brojIgraca) {
		this.brojIgraca = brojIgraca;
	}

	public int getBrojTrenera() {
		return brojTrenera;
	}

	public void setBrojTrenera(int brojTrenera) {
		this.brojTrenera = brojTrenera;
	}

	@Override
	public String toString() {
		return "PremijerLiga [sponzor=" + sponzor + ", klubovi=" + klubovi + ", brojKlubova=" + brojKlubova
				+ ", brojIgraca=" + brojIgraca + ", brojTrenera=" + brojTrenera + "]";
	}

	//vraca klub sa najvise zaposlenih
	@Override
	public FudbalskiKlub klubSaNajviseZaposlenih() {
		
		FudbalskiKlub klub = null;
		int maxBrojZaposlenih = 0;
		
		for(FudbalskiKlub fudbalskiKlub : klubovi) {
			if(fudbalskiKlub.getBrojZaposlenih() > maxBrojZaposlenih) {
				maxBrojZaposlenih = fudbalskiKlub.getBrojZaposlenih();
				klub = fudbalskiKlub;
			}
			
		}
		
		return klub;
	}

	//vraca se prosek izdataka klubova na zaposlene
	@Override
	public double prosecnaIzdaciKluba() {
		
		double godisnjiIzdaci = 0;
		double prosecniIzdaci = 0;
		
		for(FudbalskiKlub klub : klubovi) {
			godisnjiIzdaci += klub.getGodisnjiIzdaci();
			prosecniIzdaci = godisnjiIzdaci / klubovi.size();
		}
		
		
		return prosecniIzdaci;
	}

	//vraca fudbalera koji ima najvecu platu i ispisuje i njegov klub
	@Override
	public Fudbaler najskupljiFudbalerLige() {

		String klub = null;
		Fudbaler fudbaler = null;
		double maxPlata = 0;
		
		for(Fudbaler f : FudbalskiKlub.getFudbaleri()) {
			if(f.getGodisnjaZarada() > maxPlata) {
				maxPlata = f.getGodisnjaZarada();
				fudbaler = f;
				
			}
		}
		
		klub = FudbalskiKlub.getNaziv();
		
		
		return fudbaler;
	}

	//vraca broj koliko fudbalera ima istog sponzora kao i liga
	@Override
	public int brojIgracaSponzoraLige() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
