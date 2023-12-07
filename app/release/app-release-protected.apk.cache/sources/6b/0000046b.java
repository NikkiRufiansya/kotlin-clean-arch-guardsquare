package o;

import java.util.Iterator;
import java.util.Set;
import o.C0024al;

/* renamed from: o.fe */
/* loaded from: classes.dex */
public final class C0151fe implements InterfaceC0158fl {
    private final C0152ff MenuHostHelper$$ExternalSyntheticLambda0;
    private final String setY;

    private C0151fe(Set<AbstractC0153fg> set, C0152ff c0152ff) {
        this.setY = setY(set);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = c0152ff;
    }

    @Override // o.InterfaceC0158fl
    public final String setIconTintList() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0().isEmpty()) {
            return this.setY;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.setY);
        sb.append(' ');
        sb.append(setY(this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0()));
        return sb.toString();
    }

    private static String setY(Set<AbstractC0153fg> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<AbstractC0153fg> it = set.iterator();
        while (it.hasNext()) {
            AbstractC0153fg next = it.next();
            sb.append(next.MenuHostHelper$$ExternalSyntheticLambda0());
            sb.append('/');
            sb.append(next.setX());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public static C0024al<InterfaceC0158fl> MenuHostHelper$$ExternalSyntheticLambda1() {
        C0024al.setX y = new C0024al.setX(InterfaceC0158fl.class, new Class[0], (byte) 0).setY(new C0037ay(AbstractC0153fg.class, 2, 0));
        y.setIconTintList = new InterfaceC0027ao() { // from class: o.fh
            @Override // o.InterfaceC0027ao
            public final Object setX(InterfaceC0025am interfaceC0025am) {
                return C0151fe.setX(interfaceC0025am);
            }
        };
        return y.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    public static /* synthetic */ InterfaceC0158fl setX(InterfaceC0025am interfaceC0025am) {
        return new C0151fe(interfaceC0025am.setIconTintList(AbstractC0153fg.class), C0152ff.setY());
    }
}