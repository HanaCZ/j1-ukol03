package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        //System.out.println("Program spuštěn.");

        Disk mujDisk = new Disk();
        mujDisk.setKapacita(994_662_584_320L);
        mujDisk.setVyuziteMisto(12_000_000_000L);

        Pamet mojePamet = new Pamet();
        mojePamet.setKapacita(24_000_000_000L);

        Procesor mujProcesor = new Procesor();
        mujProcesor.setRychlost(3_490_000_000L);
        mujProcesor.setVyrobce("HP");

        System.out.println(mujDisk.getKapacita());
        System.out.println(mujDisk.getVyuziteMisto());

        System.out.println(mojePamet.getKapacita());

        System.out.println(mujProcesor.getRychlost());
        System.out.println(mujProcesor.getVyrobce());
    }

}
