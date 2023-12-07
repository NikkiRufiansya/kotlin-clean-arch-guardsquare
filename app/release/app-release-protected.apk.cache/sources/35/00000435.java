package o;

import android.os.Bundle;
import java.util.Locale;

/* renamed from: o.ex  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0143ex {
    public static final C0106dm MenuHostHelper$$ExternalSyntheticLambda1 = C0106dm.setY();
    public final Bundle setY;

    public C0143ex() {
        this(new Bundle());
    }

    public C0143ex(Bundle bundle) {
        this.setY = (Bundle) bundle.clone();
    }

    public final C0142ew<Integer> setY(String str) {
        if (str != null && this.setY.containsKey(str)) {
            try {
                Integer num = (Integer) this.setY.get(str);
                if (num == null) {
                    return new C0142ew<>();
                }
                return new C0142ew<>(num);
            } catch (ClassCastException e) {
                C0106dm c0106dm = MenuHostHelper$$ExternalSyntheticLambda1;
                Object[] objArr = {str, e.getMessage()};
                if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                    Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                    Cdo.setIconTintList(String.format(Locale.ENGLISH, "Metadata key %s contains type other than int: %s", objArr));
                }
                return new C0142ew<>();
            }
        }
        return new C0142ew<>();
    }

    public final C0142ew<Boolean> MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        if (str != null && this.setY.containsKey(str)) {
            try {
                Boolean bool = (Boolean) this.setY.get(str);
                if (bool == null) {
                    return new C0142ew<>();
                }
                return new C0142ew<>(bool);
            } catch (ClassCastException e) {
                C0106dm c0106dm = MenuHostHelper$$ExternalSyntheticLambda1;
                Object[] objArr = {str, e.getMessage()};
                if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                    Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                    Cdo.setIconTintList(String.format(Locale.ENGLISH, "Metadata key %s contains type other than boolean: %s", objArr));
                }
                return new C0142ew<>();
            }
        }
        return new C0142ew<>();
    }
}