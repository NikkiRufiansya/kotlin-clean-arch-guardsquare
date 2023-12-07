package o;

/* renamed from: o.ub  reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0503ub extends AbstractC0508ue {
    public static final C0503ub setIconTintList = new C0503ub();
    private static final ub$MenuHostHelper$$ExternalSyntheticLambda1 setX = new ClassValue<InterfaceC0377pk<? super Throwable, ? extends Throwable>>() { // from class: o.ub$MenuHostHelper$$ExternalSyntheticLambda1
        public final /* synthetic */ Object computeValue(Class cls) {
            if (cls != null) {
                return C0505ud.MenuHostHelper$$ExternalSyntheticLambda1(cls);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
        }
    };

    private C0503ub() {
    }

    @Override // o.AbstractC0508ue
    public final InterfaceC0377pk<Throwable, Throwable> MenuHostHelper$$ExternalSyntheticLambda0(Class<? extends Throwable> cls) {
        return (InterfaceC0377pk) setX.get(cls);
    }
}