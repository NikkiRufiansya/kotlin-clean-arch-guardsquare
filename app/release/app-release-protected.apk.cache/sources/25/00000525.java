package o;

import java.util.Collections;

/* loaded from: classes.dex */
final class gh$MenuHostHelper$$ExternalSyntheticLambda1 implements InterfaceC0057br<C0194gt> {
    static final gh$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1 = new gh$MenuHostHelper$$ExternalSyntheticLambda1();
    private static final C0056bq setIconTintList = new C0056bq("eventType", Collections.emptyMap());
    private static final C0056bq setY = new C0056bq("sessionData", Collections.emptyMap());
    private static final C0056bq setX = new C0056bq("applicationInfo", Collections.emptyMap());

    private gh$MenuHostHelper$$ExternalSyntheticLambda1() {
    }

    @Override // o.InterfaceC0058bs
    public final /* synthetic */ void setY(Object obj, InterfaceC0065bz interfaceC0065bz) {
        C0194gt c0194gt = (C0194gt) obj;
        InterfaceC0065bz interfaceC0065bz2 = interfaceC0065bz;
        interfaceC0065bz2.setIconTintList(setIconTintList, c0194gt.setX);
        interfaceC0065bz2.setIconTintList(setY, c0194gt.setY);
        interfaceC0065bz2.setIconTintList(setX, c0194gt.setIconTintList);
    }
}