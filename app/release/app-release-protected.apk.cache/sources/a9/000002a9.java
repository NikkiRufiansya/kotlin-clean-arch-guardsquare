package o;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Y {
    private final Context MenuHostHelper$$ExternalSyntheticLambda1;
    private final Map<String, C0013aa> setIconTintList = new HashMap();
    private final InterfaceC0073cg<InterfaceC0020ah> setY;

    public Y(Context context, InterfaceC0073cg<InterfaceC0020ah> interfaceC0073cg) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = context;
        this.setY = interfaceC0073cg;
    }

    public final C0013aa MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        C0013aa c0013aa;
        synchronized (this) {
            if (!this.setIconTintList.containsKey(str)) {
                this.setIconTintList.put(str, new C0013aa(this.setY, str));
            }
            c0013aa = this.setIconTintList.get(str);
        }
        return c0013aa;
    }
}