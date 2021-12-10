package main.test;

import java.util.ArrayList;
import java.util.List;

import model.Fudbaler;
import model.FudbalskiKlub;
import model.Trener;

public class TestClass {

	public static void main(String[] args) {

		Fudbaler fudbaler1 = new Fudbaler("Milos", "Milosevic", "1367895248762",
				"Bulevar kralja Aleksandra 23", 550.50, 6, "Obuke i Kursevi", false, 25, "napadac");
		Fudbaler fudbaler2 = new Fudbaler("Pera", "Peric", "1439887635489",
				"Bulevar kralja Aleksandra 6", 1200, 4, "Maxi", false, 25, "vezni");
		Fudbaler fudbaler3 = new Fudbaler("Nemanja", "Vidic", "11398054687",
				"Vojvode Dobrnjca", 1500, 10, "Idea", false, 11, "odbrana");
		Fudbaler fudbaler4 = new Fudbaler("Filip", "Kostic", "0203984987452",
				"Ajntraht 3", 1100, 7, "Obuke i Kursevi", false, 20, "krilo");
		Fudbaler fudbaler5 = new Fudbaler("Aleksandar", "Mitrovic", "1367895248762",
				"Bulevar revolucije 34", 950, 5, "Maxi", false, 35, "napadac");
		Fudbaler fudbaler6 = new Fudbaler("Vladimir", "Stojkovic", "1805980456987",
				"Knez Mihailova 23", 850, 6, "Obuke i Kursevi", true, 0, "golman");
		Fudbaler fudbaler7 = new Fudbaler("Nemanja", "Matic", "0605984526984",
				"Ub 56", 1800, 12, "Maxi", false, 17, "zadnji vezni");
		Fudbaler fudbaler8 = new Fudbaler("Nemanja", "Gudelj", "190898056321",
				"Ruzveltova 68", 700, 8, "Obuke i Kursevi", true, 2, "vezni");
		
		Trener trener = new Trener("Aleksandar", "Stanojevic", "1708972693478", "Knez Mihailova 3", 25000, "Maxi", 15, 12);
		System.out.println(trener);
		
		
		
		List<Fudbaler> igraciPartizan = new ArrayList<>();
		igraciPartizan.add(fudbaler1);
		igraciPartizan.add(fudbaler2);
		igraciPartizan.add(fudbaler3);
		igraciPartizan.add(fudbaler4);
		igraciPartizan.add(fudbaler5);
		igraciPartizan.add(fudbaler6);
		igraciPartizan.add(fudbaler7);
		igraciPartizan.add(fudbaler8);
		
		FudbalskiKlub timPartizan = new FudbalskiKlub("Partizan", trener, igraciPartizan, 6);
		
		System.out.println(timPartizan);
		
		
		System.out.println("JMBG fudbalera je: " + fudbaler1.validacijaJmbg());
		System.out.println("JMBG fudbalera je: " + fudbaler2.validacijaJmbg());
		System.out.println("JMBG fudbalera " + fudbaler3.getIme() + " je: " + fudbaler3.validacijaJmbg());
		System.out.println("JMBG fudbalera je: " + fudbaler4.validacijaJmbg());
		System.out.println("JMBG fudbalera je: " + fudbaler5.validacijaJmbg());
		System.out.println("JMBG fudbalera je: " + fudbaler6.validacijaJmbg());
		System.out.println("JMBG fudbalera je: " + fudbaler7.validacijaJmbg());
		System.out.println("JMBG fudbalera je: " + fudbaler8.validacijaJmbg());
		
		System.out.println("Adresa fudbalera je: " +fudbaler3.validacijaAdrese());
		
		System.out.println("Najskuplji fudbaler u klubu je " + timPartizan.najskupljiFudbaler());
		System.out.println("Najneefikasniji fudbaler je: " + timPartizan.najNeEfikasnijiFudbaler());
		System.out.println("Broj fudbalera na poziciji vezni igrac je: " + timPartizan.brojFudbaleraNaPoziciji("vezni"));
		System.out.println("Najjeftiniji fudbaler rezerva je: " + timPartizan.najJeftinijiFudbalerRezerva() );
		
		
		
	}

}
