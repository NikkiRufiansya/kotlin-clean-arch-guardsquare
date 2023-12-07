package o;

import android.util.Log;

/* renamed from: o.gi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183gi implements InterfaceC0186gl {
    private final InterfaceC0073cg<setIconPadding> MenuHostHelper$$ExternalSyntheticLambda0;

    static {
        new setY((byte) 0);
    }

    public C0183gi(InterfaceC0073cg<setIconPadding> interfaceC0073cg) {
        pN.setY(interfaceC0073cg, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = interfaceC0073cg;
    }

    @Override // o.InterfaceC0186gl
    public final void setY(C0194gt c0194gt) {
        pN.setY(c0194gt, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0().setY("FIREBASE_APPQUALITY_SESSION", new attachInterface("json"), new setChecked() { // from class: o.gm
            @Override // o.setChecked
            public final Object setIconTintList(Object obj) {
                C0197gw c0197gw = C0197gw.MenuHostHelper$$ExternalSyntheticLambda0;
                String MenuHostHelper$$ExternalSyntheticLambda1 = C0197gw.setX().MenuHostHelper$$ExternalSyntheticLambda1((C0194gt) obj);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) MenuHostHelper$$ExternalSyntheticLambda1, "");
                StringBuilder sb = new StringBuilder("Session Event: ");
                sb.append(MenuHostHelper$$ExternalSyntheticLambda1);
                Log.d("EventGDTLogger", sb.toString());
                byte[] bytes = MenuHostHelper$$ExternalSyntheticLambda1.getBytes(qQ.setIconTintList);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) bytes, "");
                return bytes;
            }
        }).MenuHostHelper$$ExternalSyntheticLambda1(new setMinWidth(c0194gt, isBinderAlive.DEFAULT));
    }

    /* renamed from: o.gi$setY */
    /* loaded from: classes.dex */
    public static final class setY {
        public /* synthetic */ setY(byte b) {
            this();
        }

        private setY() {
        }
    }
}