package model;

import java.util.ArrayList;
import java.util.List;

import interfejs.IFudbalskiKlub;

public class FudbalskiKlub implements IFudbalskiKlub {
	
	private String naziv;
	private Trener trener;
	private List<Fudbaler> fudbaleri = new ArrayList<Fudbaler>(); 
	private int brojZaposlenih;
	private int brojTrofeja;
	private double godisnjiIzdaci;
	
	
	
	public FudbalskiKlub() {
		
	}
	
	public FudbalskiKlub(String naziv, Trener trener, List<Fudbaler> fudbaleri, int brojZaposlenih, int brojTrofeja,
			double godisnjiIzdaci) {
		super();
		this.naziv = naziv;
		this.trener = trener;
		this.fudbaleri = fudbaleri;
		this.brojZaposlenih = fudbaleri.size() + 1;
		this.brojTrofeja = brojTrofeja;
		
		double zaradaFudbalera = 0;
		
		for(Fudbaler fudbaler : fudbaleri) {
			zaradaFudbalera += fudbaler.getGodisnjaZarada();
		}
		this.godisnjiIzdaci = zaradaFudbalera + trener.getGodisnjaZarada();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Trener getTrener() {
		return trener;
	}

	public void setTrener(Trener trener) {
		this.trener = trener;
	}

	public List<Fudbaler> getFudbaleri() {
		return fudbaleri;
	}

	public void setFudbaleri(List<Fudbaler> fudbaleri) {
		this.fudbaleri = fudbaleri;
	}

	public int getBrojZaposlenih() {
		return brojZaposlenih;
	}

	public void setBrojZaposlenih(int brojZaposlenih) {
		this.brojZaposlenih = brojZaposlenih;
	}

	public int getBrojTrofeja() {
		return brojTrofeja;
	}

	public void setBrojTrofeja(int brojTrofeja) {
		this.brojTrofeja = brojTrofeja;
	}

	public double getGodisnjiIzdaci() {
		return godisnjiIzdaci;
	}

	public void setGodisnjiIzdaci(double godisnjiIzdaci) {
		this.godisnjiIzdaci = godisnjiIzdaci;
	}

	@Override
	public String toString() {
		return "FudbalskiKlub [naziv=" + naziv + ", trener=" + trener + ", fudbaleri=" + fudbaleri + ", brojZaposlenih="
				+ brojZaposlenih + ", brojTrofeja=" + brojTrofeja + ", godisnjiIzdaci=" + godisnjiIzdaci + "]";
	}

	@Override
	public double najskupljiFudbaler() {

		double maxPlata = 0;
		
		for (Fudbaler f : fudbaleri) {
			if(f.getGodisnjaZarada() > maxPlata) {
				maxPlata = f.getGodisnjaZarada();
			
			}
		}
		
		return maxPlata;
	}

	@Override
	public int najNeEfikasnijiFudbaler() {

		int brojGolovaIAsistencija = fudbaleri.get(0).getBrojGolovaIAsistencija();
		
		for(Fudbaler fudbaler : fudbaleri) {
			
			if(fudbaler.getBrojGolovaIAsistencija() < brojGolovaIAsistencija) {
				brojGolovaIAsistencija = fudbaler.getBrojGolovaIAsistencija();
			}
		}
		
		for(Fudbaler fudbaler : fudbaleri) {
			if(fudbaler.getBrojGolovaIAsistencija() == brojGolovaIAsistencija) {
				
				System.out.println("Najneefikasniji fudbaler je: " + fudbaler.getIme()
									+ " " + fudbaler.getPrezime() + ".");
			}
		}
		
		
		return brojGolovaIAsistencija;
	}

	@Override
	public int brojFudbaleraNaPoziciji(String pozicija) {

		int brojFudbalera = 0;
		
		for(Fudbaler f : fudbaleri) {
			if(f.getPozicija().equals(pozicija)) {
				brojFudbalera ++;
			}
		}
		System.out.println("Broj igraca na poziciji je: " + brojFudbalera);
		
		return brojFudbalera;
	}

	@Override
	public void najJeftinijiFudbalerRezerva() {

		double minimalnaZarada = fudbaleri.get(0).getGodisnjaZarada();
		
		for(Fudbaler f : fudbaleri) {
			if(f.getGodisnjaZarada() < minimalnaZarada) {
				minimalnaZarada = f.getGodisnjaZarada();
			}
		}
		
		for(Fudbaler f : fudbaleri) {
			if(f.isRezerva() && f.getGodisnjaZarada() == minimalnaZarada) {
				System.out.println("Rezerva sa najmanjom platom je: " + f.getIme()
								+ " " + f.getPrezime() + ".");
			}
		}
	}
	
	
	
	

}
