package o;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class setChipStrokeWidth implements setThumbTintList {
    private static final Set<String> MenuHostHelper$$ExternalSyntheticLambda1 = new HashSet();

    @Override // o.setThumbTintList
    public final void setIconTintList(String str, Throwable th) {
        Set<String> set = MenuHostHelper$$ExternalSyntheticLambda1;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        set.add(str);
    }

    @Override // o.setThumbTintList
    public final void MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        Set<String> set = MenuHostHelper$$ExternalSyntheticLambda1;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        set.add(str);
    }
}