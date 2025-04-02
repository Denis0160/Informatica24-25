public class Automobile {
    private boolean vip;
    private double potenzaCavalli;
    private boolean gpl;
    private double valoreMacchina;
    private double potenzaKw=convertiCavalliInKilowatt(potenzaCavalli);

    public Automobile(boolean vip, double potenzaCavalli, boolean gpl, double valoreMacchina) {
        this.gpl = gpl;
        this.vip = vip;
        this.potenzaCavalli = potenzaCavalli;
        this.valoreMacchina = valoreMacchina;
        this.potenzaKw = convertiCavalliInKilowatt(potenzaCavalli);
        this.vip = checkVipStatus();
    }

    public double convertiCavalliInKilowatt(double potenzaCavalli) {
        return potenzaCavalli * 0.7355;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public double getPotenzaCavalli() {
        return potenzaCavalli;
    }

    public void setPotenzaCavalli(double potenzaCavalli) {
        this.potenzaCavalli = potenzaCavalli;
    }

    public boolean isGpl() {
        return gpl;
    }

    public void setGpl(boolean gpl) {
        this.gpl = gpl;
        this.vip = checkVipStatus();
    }

    public double getValoreMacchina() {
        return valoreMacchina;
    }

    public void setValoreMacchina(double valoreMacchina) {
        this.valoreMacchina = valoreMacchina;
    }
    public boolean checkVipStatus() {
        if (this.gpl && this.vip) {
            this.vip = false;
        }
        return this.vip;
    }


    @Override
    public String toString() {
        return "Automobile{" +
                "vip=" + vip +
                ", potenzaCavalli=" + potenzaCavalli +
                ", gpl=" + gpl +
                ", valoreMacchina=" + valoreMacchina +
                ", potenzaKw=" + potenzaKw +
                '}';
    }

}
