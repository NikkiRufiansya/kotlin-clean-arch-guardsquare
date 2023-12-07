package o;

import java.util.Collections;

/* loaded from: classes.dex */
final class setColumnOrderPreserved$MenuHostHelper$$ExternalSyntheticLambda0 implements InterfaceC0057br<setOnItemReselectedListener> {
    static final setColumnOrderPreserved$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda0 = new setColumnOrderPreserved$MenuHostHelper$$ExternalSyntheticLambda0();
    private static final C0056bq setOnLongClickListener = new C0056bq("requestTimeMs", Collections.emptyMap());
    private static final C0056bq setUnboundedRipple = new C0056bq("requestUptimeMs", Collections.emptyMap());
    private static final C0056bq setY = new C0056bq("clientInfo", Collections.emptyMap());
    private static final C0056bq setX = new C0056bq("logSource", Collections.emptyMap());
    private static final C0056bq MenuHostHelper$$ExternalSyntheticLambda1 = new C0056bq("logSourceName", Collections.emptyMap());
    private static final C0056bq setIconTintList = new C0056bq("logEvent", Collections.emptyMap());
    private static final C0056bq setLayoutAnimation = new C0056bq("qosTier", Collections.emptyMap());

    private setColumnOrderPreserved$MenuHostHelper$$ExternalSyntheticLambda0() {
    }

    @Override // o.InterfaceC0058bs
    public final /* synthetic */ void setY(Object obj, InterfaceC0065bz interfaceC0065bz) {
        setOnItemReselectedListener setonitemreselectedlistener = (setOnItemReselectedListener) obj;
        InterfaceC0065bz interfaceC0065bz2 = interfaceC0065bz;
        interfaceC0065bz2.MenuHostHelper$$ExternalSyntheticLambda1(setOnLongClickListener, setonitemreselectedlistener.setOnLongClickListener());
        interfaceC0065bz2.MenuHostHelper$$ExternalSyntheticLambda1(setUnboundedRipple, setonitemreselectedlistener.setLayoutAnimation());
        interfaceC0065bz2.setIconTintList(setY, setonitemreselectedlistener.MenuHostHelper$$ExternalSyntheticLambda1());
        interfaceC0065bz2.setIconTintList(setX, setonitemreselectedlistener.setIconTintList());
        interfaceC0065bz2.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda1, setonitemreselectedlistener.setY());
        interfaceC0065bz2.setIconTintList(setIconTintList, setonitemreselectedlistener.MenuHostHelper$$ExternalSyntheticLambda0());
        interfaceC0065bz2.setIconTintList(setLayoutAnimation, setonitemreselectedlistener.setX());
    }
}