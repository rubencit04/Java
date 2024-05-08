public class Main {
    public static void main(String[] args) {
        Arma espada = new Arma(10,"Espada");
        Arma arco = new Arma (8,"Arco");
        Arma hechizo = new Arma(12,"Hechizo");
        Arma rezo = new Arma(8,"Rezo");

        Guerrero guerrero = new Guerrero("Guerrero", espada, 100, 20);
        Mago mago = new Mago("Mago", hechizo, 80, 25);
        Curandero curandero = new Curandero("Curandero", rezo, 90, 30);

        while (guerrero.getVida() > 0 && mago.getVida() > 0) {
            guerrero.atacar(mago);
            if (mago.getVida() <= 0) {
                System.out.println("El guerrero ha ganado.");
                break;
            }

            mago.atacar(guerrero);
            if (guerrero.getVida() <= 0) {
                System.out.println("El mago ha ganado.");
                break;
            }
        }
    }
}