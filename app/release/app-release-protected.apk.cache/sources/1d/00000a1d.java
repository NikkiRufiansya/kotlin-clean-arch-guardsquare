package o;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class setChipIconResource {
    public static boolean setY(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof setDropDownVerticalOffset) {
            return ((setDropDownVerticalOffset) viewParent).MenuHostHelper$$ExternalSyntheticLambda1(view, view2, i, i2);
        }
        if (i2 == 0) {
            try {
                return setX.setIconTintList(viewParent, view, view2, i);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onStartNestedScroll");
                Log.e("ViewParentCompat", sb.toString(), e);
                return false;
            }
        }
        return false;
    }

    public static void setIconTintList(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof setDropDownVerticalOffset) {
            ((setDropDownVerticalOffset) viewParent).MenuHostHelper$$ExternalSyntheticLambda0(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedScrollAccepted");
                Log.e("ViewParentCompat", sb.toString(), e);
            }
        }
    }

    public static void setIconTintList(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof setDropDownVerticalOffset) {
            ((setDropDownVerticalOffset) viewParent).setY(view, i);
        } else if (i == 0) {
            try {
                setX.setX(viewParent, view);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onStopNestedScroll");
                Log.e("ViewParentCompat", sb.toString(), e);
            }
        }
    }

    public static void setIconTintList(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof queryLocalInterface) {
            ((queryLocalInterface) viewParent).setY(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof setDropDownVerticalOffset) {
            ((setDropDownVerticalOffset) viewParent).MenuHostHelper$$ExternalSyntheticLambda0(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                setX.setY(viewParent, view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedScroll");
                Log.e("ViewParentCompat", sb.toString(), e);
            }
        }
    }

    public static void setY(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof setDropDownVerticalOffset) {
            ((setDropDownVerticalOffset) viewParent).MenuHostHelper$$ExternalSyntheticLambda0(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                setX.setX(viewParent, view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                StringBuilder sb = new StringBuilder("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedPreScroll");
                Log.e("ViewParentCompat", sb.toString(), e);
            }
        }
    }

    public static boolean setX(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            StringBuilder sb = new StringBuilder("ViewParent ");
            sb.append(viewParent);
            sb.append(" does not implement interface method onNestedFling");
            Log.e("ViewParentCompat", sb.toString(), e);
            return false;
        }
    }

    public static boolean setY(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            StringBuilder sb = new StringBuilder("ViewParent ");
            sb.append(viewParent);
            sb.append(" does not implement interface method onNestedPreFling");
            Log.e("ViewParentCompat", sb.toString(), e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX {
        static boolean setIconTintList(ViewParent viewParent, View view, View view2, int i) {
            return viewParent.onStartNestedScroll(view, view2, i);
        }

        static void setX(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }

        static void setY(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        }

        static void setX(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        }
    }
}