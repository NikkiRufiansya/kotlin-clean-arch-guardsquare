package o;

import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o.C0116dx;

/* loaded from: classes.dex */
public final class cT {
    static final C0106dm setY = C0106dm.setY();
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    final Map<setDropDownBackgroundResource, C0116dx.setIconTintList> MenuHostHelper$$ExternalSyntheticLambda1;
    final SavedStateHandleAttacher setIconTintList;
    final Activity setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setY() {
        try {
            Class.forName("o.SavedStateHandleAttacher");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public cT(Activity activity) {
        this(activity, new SavedStateHandleAttacher(), new HashMap());
    }

    private cT(Activity activity, SavedStateHandleAttacher savedStateHandleAttacher, Map<setDropDownBackgroundResource, C0116dx.setIconTintList> map) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        this.setX = activity;
        this.setIconTintList = savedStateHandleAttacher;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = map;
    }

    public final C0142ew<C0116dx.setIconTintList> setIconTintList() {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
            C0106dm c0106dm = setY;
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList("Cannot stop because no recording was started");
            }
            return new C0142ew<>();
        }
        if (!this.MenuHostHelper$$ExternalSyntheticLambda1.isEmpty()) {
            C0106dm c0106dm2 = setY;
            if (c0106dm2.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo2 = c0106dm2.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1.clear();
        }
        C0142ew<C0116dx.setIconTintList> x = setX();
        try {
            this.setIconTintList.setX.setIconTintList(this.setX);
        } catch (IllegalArgumentException | NullPointerException e) {
            if ((e instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                throw e;
            }
            C0106dm c0106dm3 = setY;
            Object[] objArr = {e.toString()};
            if (c0106dm3.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo3 = c0106dm3.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setX(String.format(Locale.ENGLISH, "View not hardware accelerated. Unable to collect FrameMetrics. %s", objArr));
            }
            x = new C0142ew<>();
        }
        this.setIconTintList.setX.setY();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        return x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C0142ew<C0116dx.setIconTintList> setX() {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
            C0106dm c0106dm = setY;
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList("No recording has been started.");
            }
            return new C0142ew<>();
        }
        SparseIntArray[] MenuHostHelper$$ExternalSyntheticLambda0 = this.setIconTintList.setX.MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            C0106dm c0106dm2 = setY;
            if (c0106dm2.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo2 = c0106dm2.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList("FrameMetricsAggregator.mMetrics is uninitialized.");
            }
            return new C0142ew<>();
        } else if (MenuHostHelper$$ExternalSyntheticLambda0[0] == null) {
            C0106dm c0106dm3 = setY;
            if (c0106dm3.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo3 = c0106dm3.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            }
            return new C0142ew<>();
        } else {
            return new C0142ew<>(C0116dx.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0));
        }
    }
}