package o;

import java.util.Locale;
import java.util.UUID;

/* renamed from: o.gv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196gv {
    final boolean MenuHostHelper$$ExternalSyntheticLambda0;
    private final gE MenuHostHelper$$ExternalSyntheticLambda1;
    private final String setIconTintList;
    private final InterfaceC0376pj<UUID> setUiOptions;
    private int setX;
    public C0191gq setY;

    private C0196gv(boolean z, gE gEVar, InterfaceC0376pj<UUID> interfaceC0376pj) {
        pN.setY(gEVar, "");
        pN.setY(interfaceC0376pj, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = z;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = gEVar;
        this.setUiOptions = interfaceC0376pj;
        this.setIconTintList = setX();
        this.setX = -1;
    }

    public /* synthetic */ C0196gv(boolean z, gE gEVar) {
        this(z, gEVar, AnonymousClass5.MenuHostHelper$$ExternalSyntheticLambda0);
    }

    public final C0191gq setY() {
        int i = this.setX + 1;
        this.setX = i;
        C0191gq c0191gq = new C0191gq(i == 0 ? this.setIconTintList : setX(), this.setIconTintList, this.setX, this.MenuHostHelper$$ExternalSyntheticLambda1.setX());
        this.setY = c0191gq;
        if (c0191gq != null) {
            return c0191gq;
        }
        pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        return null;
    }

    private final String setX() {
        String obj = this.setUiOptions.setIconTintList().toString();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) obj, "");
        String lowerCase = qR.MenuHostHelper$$ExternalSyntheticLambda0(obj, "-", "", false).toLowerCase(Locale.ROOT);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) lowerCase, "");
        return lowerCase;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.gv$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class AnonymousClass5 extends pM implements InterfaceC0376pj<UUID> {
        public static final AnonymousClass5 MenuHostHelper$$ExternalSyntheticLambda0 = new AnonymousClass5();

        AnonymousClass5() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;");
        }

        @Override // o.InterfaceC0376pj
        public final /* synthetic */ UUID setIconTintList() {
            return UUID.randomUUID();
        }
    }
}