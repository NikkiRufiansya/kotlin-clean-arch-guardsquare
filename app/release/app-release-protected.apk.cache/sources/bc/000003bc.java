package o;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: o.da  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0094da {
    private static C0094da MenuHostHelper$$ExternalSyntheticLambda1;
    private static final C0106dm setX = C0106dm.setY();
    private final ExecutorService setIconTintList;
    volatile SharedPreferences setY;

    private C0094da(ExecutorService executorService) {
        this.setIconTintList = executorService;
    }

    public static C0094da MenuHostHelper$$ExternalSyntheticLambda0() {
        C0094da c0094da;
        synchronized (C0094da.class) {
            if (MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                MenuHostHelper$$ExternalSyntheticLambda1 = new C0094da(Executors.newSingleThreadExecutor());
            }
            c0094da = MenuHostHelper$$ExternalSyntheticLambda1;
        }
        return c0094da;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(final Context context) {
        synchronized (this) {
            if (this.setY == null && context != null) {
                this.setIconTintList.execute(new Runnable() { // from class: o.cX
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0094da c0094da = C0094da.this;
                        Context context2 = context;
                        if (c0094da.setY != null || context2 == null) {
                            return;
                        }
                        c0094da.setY = context2.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                    }
                });
            }
        }
    }

    public final C0142ew<Boolean> MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        if (str == null) {
            C0106dm c0106dm = setX;
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList("Key is null when getting boolean value on device cache.");
            }
            return new C0142ew<>();
        }
        if (this.setY == null) {
            MenuHostHelper$$ExternalSyntheticLambda1(setIconTintList());
            if (this.setY == null) {
                return new C0142ew<>();
            }
        }
        if (!this.setY.contains(str)) {
            return new C0142ew<>();
        }
        try {
            return new C0142ew<>(Boolean.valueOf(this.setY.getBoolean(str, false)));
        } catch (ClassCastException e) {
            C0106dm c0106dm2 = setX;
            Object[] objArr = {str, e.getMessage()};
            if (c0106dm2.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo2 = c0106dm2.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList(String.format(Locale.ENGLISH, "Key %s from sharedPreferences has type other than long: %s", objArr));
            }
            return new C0142ew<>();
        }
    }

    public final boolean setY(String str, boolean z) {
        if (this.setY == null) {
            MenuHostHelper$$ExternalSyntheticLambda1(setIconTintList());
            if (this.setY == null) {
                return false;
            }
        }
        this.setY.edit().putBoolean(str, z).apply();
        return true;
    }

    public final C0142ew<String> setY(String str) {
        if (str == null) {
            C0106dm c0106dm = setX;
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList("Key is null when getting String value on device cache.");
            }
            return new C0142ew<>();
        }
        if (this.setY == null) {
            MenuHostHelper$$ExternalSyntheticLambda1(setIconTintList());
            if (this.setY == null) {
                return new C0142ew<>();
            }
        }
        if (!this.setY.contains(str)) {
            return new C0142ew<>();
        }
        try {
            return new C0142ew<>(this.setY.getString(str, ""));
        } catch (ClassCastException e) {
            C0106dm c0106dm2 = setX;
            Object[] objArr = {str, e.getMessage()};
            if (c0106dm2.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo2 = c0106dm2.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList(String.format(Locale.ENGLISH, "Key %s from sharedPreferences has type other than String: %s", objArr));
            }
            return new C0142ew<>();
        }
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(String str, String str2) {
        if (this.setY == null) {
            MenuHostHelper$$ExternalSyntheticLambda1(setIconTintList());
            if (this.setY == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.setY.edit().remove(str).apply();
            return true;
        }
        this.setY.edit().putString(str, str2).apply();
        return true;
    }

    public final C0142ew<Double> setIconTintList(String str) {
        if (str == null) {
            C0106dm c0106dm = setX;
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList("Key is null when getting double value on device cache.");
            }
            return new C0142ew<>();
        }
        if (this.setY == null) {
            MenuHostHelper$$ExternalSyntheticLambda1(setIconTintList());
            if (this.setY == null) {
                return new C0142ew<>();
            }
        }
        if (!this.setY.contains(str)) {
            return new C0142ew<>();
        }
        try {
            try {
                return new C0142ew<>(Double.valueOf(Double.longBitsToDouble(this.setY.getLong(str, 0L))));
            } catch (ClassCastException unused) {
                return new C0142ew<>(Double.valueOf(Float.valueOf(this.setY.getFloat(str, 0.0f)).doubleValue()));
            }
        } catch (ClassCastException e) {
            C0106dm c0106dm2 = setX;
            Object[] objArr = {str, e.getMessage()};
            if (c0106dm2.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo2 = c0106dm2.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList(String.format(Locale.ENGLISH, "Key %s from sharedPreferences has type other than double: %s", objArr));
            }
            return new C0142ew<>();
        }
    }

    public final boolean setX(String str, double d) {
        if (this.setY == null) {
            MenuHostHelper$$ExternalSyntheticLambda1(setIconTintList());
            if (this.setY == null) {
                return false;
            }
        }
        this.setY.edit().putLong(str, Double.doubleToRawLongBits(d)).apply();
        return true;
    }

    public final C0142ew<Long> setX(String str) {
        if (str == null) {
            C0106dm c0106dm = setX;
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList("Key is null when getting long value on device cache.");
            }
            return new C0142ew<>();
        }
        if (this.setY == null) {
            MenuHostHelper$$ExternalSyntheticLambda1(setIconTintList());
            if (this.setY == null) {
                return new C0142ew<>();
            }
        }
        if (!this.setY.contains(str)) {
            return new C0142ew<>();
        }
        try {
            return new C0142ew<>(Long.valueOf(this.setY.getLong(str, 0L)));
        } catch (ClassCastException e) {
            C0106dm c0106dm2 = setX;
            Object[] objArr = {str, e.getMessage()};
            if (c0106dm2.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo2 = c0106dm2.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList(String.format(Locale.ENGLISH, "Key %s from sharedPreferences has type other than long: %s", objArr));
            }
            return new C0142ew<>();
        }
    }

    public final boolean setIconTintList(String str, long j) {
        if (this.setY == null) {
            MenuHostHelper$$ExternalSyntheticLambda1(setIconTintList());
            if (this.setY == null) {
                return false;
            }
        }
        this.setY.edit().putLong(str, j).apply();
        return true;
    }

    private static Context setIconTintList() {
        try {
            com.google.firebase.FirebaseApp.MenuHostHelper$$ExternalSyntheticLambda0();
            com.google.firebase.FirebaseApp MenuHostHelper$$ExternalSyntheticLambda0 = com.google.firebase.FirebaseApp.MenuHostHelper$$ExternalSyntheticLambda0();
            if (!MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions.get()) {
                return MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList;
            }
            throw new IllegalStateException("FirebaseApp was deleted");
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}