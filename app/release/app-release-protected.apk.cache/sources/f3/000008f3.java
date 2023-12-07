package o;

/* loaded from: classes.dex */
public final class sT {
    public static final sT MenuHostHelper$$ExternalSyntheticLambda1 = new sT();
    private static final ThreadLocal<AbstractC0463sp> MenuHostHelper$$ExternalSyntheticLambda0 = new ThreadLocal<>();

    private sT() {
    }

    public static AbstractC0463sp setY() {
        ThreadLocal<AbstractC0463sp> threadLocal = MenuHostHelper$$ExternalSyntheticLambda0;
        AbstractC0463sp abstractC0463sp = threadLocal.get();
        if (abstractC0463sp == null) {
            AbstractC0463sp MenuHostHelper$$ExternalSyntheticLambda12 = C0461sn.MenuHostHelper$$ExternalSyntheticLambda1();
            threadLocal.set(MenuHostHelper$$ExternalSyntheticLambda12);
            return MenuHostHelper$$ExternalSyntheticLambda12;
        }
        return abstractC0463sp;
    }

    public static AbstractC0463sp setIconTintList() {
        return MenuHostHelper$$ExternalSyntheticLambda0.get();
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0() {
        MenuHostHelper$$ExternalSyntheticLambda0.set(null);
    }

    public static void setY(AbstractC0463sp abstractC0463sp) {
        MenuHostHelper$$ExternalSyntheticLambda0.set(abstractC0463sp);
    }
}