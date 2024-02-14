package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.


        Pocitac mujPocitac = new Pocitac();
        System.out.println(mujPocitac.toString());
        mujPocitac.zapniSe();

        Procesor mujProcesor = new Procesor();
        mujProcesor.setRychlost(3_490_000_000L);
        mujProcesor.setVyrobce("HP");

        Pamet mojePamet = new Pamet();
        mojePamet.setKapacita(24_000_000_000L);

        Disk mujDisk = new Disk();
        mujDisk.setKapacita(994_662_584_320L);
        mujDisk.setVyuziteMisto(994_000_000_000L);

        mujPocitac.setProcesor(mujProcesor);
        mujPocitac.setPamet(mojePamet);
        mujPocitac.setDisk(mujDisk);

        System.out.println(mujPocitac.toString());

        mujPocitac.zapniSe();
        mujPocitac.zapniSe();
        System.out.println(mujPocitac.toString());
        mujPocitac.vypniSe();

        mujPocitac.vypniSe();

        /*
        // Demonstrace 2. úkolu
        // Vytvoření souboru
        mujPocitac.vytvorSouborOVelikosti(662_584_500L); // Vypíše chybovou hlášku Nedostatek místa na disku!

        mujPocitac.vytvorSouborOVelikosti(662_584_300L); // Vypíše hlášku Soubor se vytvořil.

        mujPocitac.vypniSe();
        mujPocitac.vytvorSouborOVelikosti(662_584_300L); // Vypíše chybovou hlášku Nelze provést. Pocítač je vypnutý.

        // Odstranění souboru
        mujPocitac.vymazSouborOVelikosti(999_000_000_000L); // Vypíše chybovou hlášku Chyba. Využité místo nesmí klesnout pod 0

        mujPocitac.vymazSouborOVelikosti(662_584_300L); // Vypíše hlášku Soubor byl odstraněn.

        mujPocitac.vypniSe();
        mujPocitac.vymazSouborOVelikosti(662_584_300L); // Vypíše chybovou hlášku Nelze provést. Pocítač je vypnutý.
        */

    }

}
