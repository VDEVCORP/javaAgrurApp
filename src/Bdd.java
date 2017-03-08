public class Bdd {
   
    private Bdd() {
    }
    public static Bdd getInstance() {
        return BddHolder.INSTANCE;
    }
    private static class BddHolder {

        private static final Bdd INSTANCE = new Bdd();
    }
}
