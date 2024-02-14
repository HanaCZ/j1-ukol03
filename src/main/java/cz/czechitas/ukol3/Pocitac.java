package cz.czechitas.ukol3;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor procesor;
    private Pamet pamet;
    private Disk disk;

    public Pocitac(Procesor procesor, Pamet pamet, Disk disk) {
        this.procesor = procesor;
        this.pamet = pamet;
        this.disk = disk;
    }

    public Pocitac() {
    }

    public boolean jeZapnuty() {
        return jeZapnuty;
    }
    public void zapniSe() {
        if (procesor != null && pamet != null && disk != null) {
            if (!jeZapnuty) {
                System.out.println("Počítač se zapnul");
                jeZapnuty = true;
            } else {
                System.out.println("Počítač je již zapnutý");
            }
        } else {

            System.err.println("Chyba. Počítač nemá všechny povinné součásti. Nelze zapnout.");
        }
    }
    public void vypniSe() {
        if (jeZapnuty) {
            System.out.println("Počítač se vypnul");
            jeZapnuty = false;
        }
    }

      public void setProcesor(Procesor procesor) {
        this.procesor = procesor;
    }

    public void setPamet(Pamet pamet) {
        this.pamet = pamet;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "Pocitac{" +
                "jeZapnuty=" + jeZapnuty +
                '}';
    }
}
