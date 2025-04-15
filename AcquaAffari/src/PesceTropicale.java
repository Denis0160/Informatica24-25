public class PesceTropicale extends Animale {
    public boolean riprodursi() {
        return isConvivenza();
    }

    @Override
    public boolean puoConvivereCon(Animale altro) {
        return this.isDolce() == altro.isDolce();
    }
}