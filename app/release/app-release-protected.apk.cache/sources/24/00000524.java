package o;

import java.util.Collections;

/* loaded from: classes.dex */
final class gh$MenuHostHelper$$ExternalSyntheticLambda0 implements InterfaceC0057br<C0198gx> {
    static final gh$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda0 = new gh$MenuHostHelper$$ExternalSyntheticLambda0();
    private static final C0056bq setUnboundedRipple = new C0056bq("sessionId", Collections.emptyMap());
    private static final C0056bq setX = new C0056bq("firstSessionId", Collections.emptyMap());
    private static final C0056bq setOnLongClickListener = new C0056bq("sessionIndex", Collections.emptyMap());
    private static final C0056bq MenuHostHelper$$ExternalSyntheticLambda1 = new C0056bq("eventTimestampUs", Collections.emptyMap());
    private static final C0056bq setY = new C0056bq("dataCollectionStatus", Collections.emptyMap());
    private static final C0056bq setIconTintList = new C0056bq("firebaseInstallationId", Collections.emptyMap());

    private gh$MenuHostHelper$$ExternalSyntheticLambda0() {
    }

    @Override // o.InterfaceC0058bs
    public final /* synthetic */ void setY(Object obj, InterfaceC0065bz interfaceC0065bz) {
        C0198gx c0198gx = (C0198gx) obj;
        InterfaceC0065bz interfaceC0065bz2 = interfaceC0065bz;
        interfaceC0065bz2.setIconTintList(setUnboundedRipple, c0198gx.setIconTintList);
        interfaceC0065bz2.setIconTintList(setX, c0198gx.MenuHostHelper$$ExternalSyntheticLambda1);
        interfaceC0065bz2.setY(setOnLongClickListener, c0198gx.setOnLongClickListener);
        interfaceC0065bz2.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda1, c0198gx.setX);
        interfaceC0065bz2.setIconTintList(setY, c0198gx.MenuHostHelper$$ExternalSyntheticLambda0);
        interfaceC0065bz2.setIconTintList(setIconTintList, c0198gx.setX());
    }
}