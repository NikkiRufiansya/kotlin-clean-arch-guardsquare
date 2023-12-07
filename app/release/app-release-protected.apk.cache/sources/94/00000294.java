package o;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class WindowInsetsCompat$Impl {
    public View setX;
    public final Map<String, Object> setY = new HashMap();
    final ArrayList<setRendererPriorityPolicy> MenuHostHelper$$ExternalSyntheticLambda1 = new ArrayList<>();

    @Deprecated
    public WindowInsetsCompat$Impl() {
    }

    public WindowInsetsCompat$Impl(View view) {
        this.setX = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WindowInsetsCompat$Impl) {
            WindowInsetsCompat$Impl windowInsetsCompat$Impl = (WindowInsetsCompat$Impl) obj;
            return this.setX == windowInsetsCompat$Impl.setX && this.setY.equals(windowInsetsCompat$Impl.setY);
        }
        return false;
    }

    public final int hashCode() {
        return (this.setX.hashCode() * 31) + this.setY.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionValues@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(":\n");
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("    view = ");
        sb2.append(this.setX);
        sb2.append("\n");
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj2);
        sb3.append("    values:");
        String obj3 = sb3.toString();
        for (String str : this.setY.keySet()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(obj3);
            sb4.append("    ");
            sb4.append(str);
            sb4.append(": ");
            sb4.append(this.setY.get(str));
            sb4.append("\n");
            obj3 = sb4.toString();
        }
        return obj3;
    }
}