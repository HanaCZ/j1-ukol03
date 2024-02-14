package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        //System.out.println("Program spuštěn.");

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

        mujPocitac.setProcesor(mujProcesor);
        mujPocitac.setPamet(mojePamet);
        mujPocitac.setDisk(mujDisk);

        System.out.println(mujPocitac.toString());

        mujPocitac.zapniSe();
        mujPocitac.zapniSe();
        System.out.println(mujPocitac.toString());
        mujPocitac.vypniSe();

        mujPocitac.vypniSe();
    }

}
