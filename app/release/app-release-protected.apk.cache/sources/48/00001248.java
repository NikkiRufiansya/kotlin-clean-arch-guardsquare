package o;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class vu$MenuHostHelper$$ExternalSyntheticLambda0 {
    private vu$MenuHostHelper$$ExternalSyntheticLambda0() {
    }

    public /* synthetic */ vu$MenuHostHelper$$ExternalSyntheticLambda0(byte b) {
        this();
    }

    /* loaded from: classes.dex */
    static final class setX implements InterfaceC0551vu {
        @Override // o.InterfaceC0551vu
        public final List<InetAddress> setX(String str) {
            pN.setY(str, "");
            try {
                InetAddress[] allByName = InetAddress.getAllByName(str);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) allByName, "");
                pN.setY(allByName, "");
                int length = allByName.length;
                if (length != 0) {
                    if (length != 1) {
                        return C0342oc.setIconTintList(allByName);
                    }
                    List<InetAddress> singletonList = Collections.singletonList(allByName[0]);
                    pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) singletonList, "");
                    return singletonList;
                }
                return C0358os.setIconTintList;
            } catch (NullPointerException e) {
                StringBuilder sb = new StringBuilder("Broken system behaviour for dns lookup of ");
                sb.append(str);
                UnknownHostException unknownHostException = new UnknownHostException(sb.toString());
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        }
    }
}