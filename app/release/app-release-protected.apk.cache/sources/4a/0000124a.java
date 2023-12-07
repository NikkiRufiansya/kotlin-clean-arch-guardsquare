package o;

import java.util.List;
import o.vA;

/* renamed from: o.vv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0552vv extends vF {
    private static final vA MenuHostHelper$$ExternalSyntheticLambda0;
    private final List<String> MenuHostHelper$$ExternalSyntheticLambda1;
    private final List<String> setIconTintList;

    public C0552vv(List<String> list, List<String> list2) {
        pN.setY(list, "");
        pN.setY(list2, "");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = vL.MenuHostHelper$$ExternalSyntheticLambda0(list);
        this.setIconTintList = vL.MenuHostHelper$$ExternalSyntheticLambda0(list2);
    }

    @Override // o.vF
    public final vA MenuHostHelper$$ExternalSyntheticLambda1() {
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.vF
    public final long MenuHostHelper$$ExternalSyntheticLambda0() {
        return setY((InterfaceC0606xq) null, true);
    }

    @Override // o.vF
    public final void setX(InterfaceC0606xq interfaceC0606xq) {
        pN.setY(interfaceC0606xq, "");
        setY(interfaceC0606xq, false);
    }

    private final long setY(InterfaceC0606xq interfaceC0606xq, boolean z) {
        C0602xo navigationOnClickListener;
        if (z) {
            navigationOnClickListener = new C0602xo();
        } else {
            pN.setX(interfaceC0606xq);
            navigationOnClickListener = interfaceC0606xq.setNavigationOnClickListener();
        }
        int size = this.MenuHostHelper$$ExternalSyntheticLambda1.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                navigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0(38);
            }
            String str = this.MenuHostHelper$$ExternalSyntheticLambda1.get(i);
            pN.setY(str, "");
            navigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0(str, 0, str.length());
            navigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0(61);
            String str2 = this.setIconTintList.get(i);
            pN.setY(str2, "");
            navigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0(str2, 0, str2.length());
        }
        if (z) {
            long j = navigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0;
            navigationOnClickListener.setOnLongClickListener(navigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0);
            return j;
        }
        return 0L;
    }

    /* renamed from: o.vv$setX */
    /* loaded from: classes.dex */
    public static final class setX {
        private setX() {
        }

        public /* synthetic */ setX(byte b) {
            this();
        }
    }

    static {
        new setX((byte) 0);
        vA.setIconTintList seticontintlist = vA.setY;
        MenuHostHelper$$ExternalSyntheticLambda0 = vA.setIconTintList.setY("application/x-www-form-urlencoded");
    }
}