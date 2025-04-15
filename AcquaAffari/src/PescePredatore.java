public class PescePredatore extends Animale {
    @Override
    public boolean puoConvivereCon(Animale altro) {
        return false; // I pesci predatori non possono convivere con altri pesci
    }
}