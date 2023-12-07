package o;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setPopupCallback extends setTitleMarginTop {
    final boolean setX;
    private static byte[] setLayoutAnimation = {36, -25, -14, -85, 7, 1, -7, -4, 13, -9, -3, 51, -23, -16, 13, 39, -42, 13, 1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -36, 8, 1, 17, -6};
    public static final int setUiOptions = 47;
    private static final setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda0 setOnLongClickListener = new setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda0() { // from class: o.setPopupCallback.1
        @Override // o.setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda0
        public final /* synthetic */ setTitleMarginTop setIconTintList(Class cls, setPlaceholderTextColor setplaceholdertextcolor) {
            return setSubtitleTextColor.MenuHostHelper$$ExternalSyntheticLambda1(this, cls, setplaceholdertextcolor);
        }

        @Override // o.setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda0
        public final <T extends setTitleMarginTop> T setIconTintList(Class<T> cls) {
            return new setPopupCallback(true);
        }
    };
    final HashMap<String, setDropDownBackgroundResource> MenuHostHelper$$ExternalSyntheticLambda1 = new HashMap<>();
    final HashMap<String, setPopupCallback> MenuHostHelper$$ExternalSyntheticLambda0 = new HashMap<>();
    final HashMap<String, setTabRippleColorResource> setNavigationOnClickListener = new HashMap<>();
    boolean setIconTintList = false;
    private boolean setUnboundedRipple = false;
    boolean setY = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.setPopupCallback.setLayoutAnimation
            int r6 = 106 - r6
            int r8 = r8 * 4
            int r8 = r8 + 16
            int r7 = r7 * 15
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r7
            r6 = r8
            r3 = 0
            goto L2c
        L17:
            r3 = 0
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r7 = r7 + 1
            int r8 = r8 - r4
            int r8 = r8 + 2
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPopupCallback.a(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setPopupCallback setX(setTabRippleColorResource settabripplecolorresource) {
        return (setPopupCallback) new setEndIconTintMode(settabripplecolorresource, setOnLongClickListener).setY(setPopupCallback.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setPopupCallback(boolean z) {
        this.setX = z;
    }

    @Override // o.setTitleMarginTop
    public final void setIconTintList() {
        boolean isLoggable;
        isLoggable = Log.isLoggable("FragmentManager", 3);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("onCleared called for ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        this.setIconTintList = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(setDropDownBackgroundResource setdropdownbackgroundresource) {
        boolean isLoggable;
        boolean isLoggable2;
        if (!this.setY) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1.containsKey(setdropdownbackgroundresource.setShrinkMotionSpec)) {
                return;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1.put(setdropdownbackgroundresource.setShrinkMotionSpec, setdropdownbackgroundresource);
            isLoggable = Log.isLoggable("FragmentManager", 2);
            if (isLoggable) {
                StringBuilder sb = new StringBuilder("Updating retained Fragments: Added ");
                sb.append(setdropdownbackgroundresource);
                Log.v("FragmentManager", sb.toString());
                return;
            }
            return;
        }
        isLoggable2 = Log.isLoggable("FragmentManager", 2);
        if (isLoggable2) {
            Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(setDropDownBackgroundResource setdropdownbackgroundresource) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.containsKey(setdropdownbackgroundresource.setShrinkMotionSpec) && this.setX) {
            return this.setIconTintList;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList(setDropDownBackgroundResource setdropdownbackgroundresource) {
        boolean isLoggable;
        boolean isLoggable2;
        if (this.setY) {
            isLoggable2 = Log.isLoggable("FragmentManager", 2);
            if (isLoggable2) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.remove(setdropdownbackgroundresource.setShrinkMotionSpec) != null) {
            isLoggable = Log.isLoggable("FragmentManager", 2);
            if (isLoggable) {
                StringBuilder sb = new StringBuilder("Updating retained Fragments: Removed ");
                sb.append(setdropdownbackgroundresource);
                Log.v("FragmentManager", sb.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(setDropDownBackgroundResource setdropdownbackgroundresource) {
        boolean isLoggable;
        isLoggable = Log.isLoggable("FragmentManager", 3);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("Clearing non-config state for ");
            sb.append(setdropdownbackgroundresource);
            Log.d("FragmentManager", sb.toString());
        }
        setPopupCallback setpopupcallback = this.MenuHostHelper$$ExternalSyntheticLambda0.get(setdropdownbackgroundresource.setShrinkMotionSpec);
        if (setpopupcallback != null) {
            setpopupcallback.setIconTintList();
            this.MenuHostHelper$$ExternalSyntheticLambda0.remove(setdropdownbackgroundresource.setShrinkMotionSpec);
        }
        setTabRippleColorResource settabripplecolorresource = this.setNavigationOnClickListener.get(setdropdownbackgroundresource.setShrinkMotionSpec);
        if (settabripplecolorresource != null) {
            settabripplecolorresource.setX();
            this.setNavigationOnClickListener.remove(setdropdownbackgroundresource.setShrinkMotionSpec);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setPopupCallback setpopupcallback = (setPopupCallback) obj;
        return this.MenuHostHelper$$ExternalSyntheticLambda1.equals(setpopupcallback.MenuHostHelper$$ExternalSyntheticLambda1) && this.MenuHostHelper$$ExternalSyntheticLambda0.equals(setpopupcallback.MenuHostHelper$$ExternalSyntheticLambda0) && this.setNavigationOnClickListener.equals(setpopupcallback.setNavigationOnClickListener);
    }

    public final int hashCode() {
        return (((this.MenuHostHelper$$ExternalSyntheticLambda1.hashCode() * 31) + this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode()) * 31) + this.setNavigationOnClickListener.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        try {
            Object[] objArr = {this};
            byte b = setLayoutAnimation[5];
            Object[] objArr2 = new Object[1];
            a((byte) (setLayoutAnimation[5] - 1), b, (byte) (b - 1), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b2 = setLayoutAnimation[5];
            byte b3 = (byte) (b2 - 1);
            Object[] objArr3 = new Object[1];
            a(b2, b3, b3, objArr3);
            sb.append(Integer.toHexString(((Integer) cls.getMethod((String) objArr3[0], Object.class).invoke(null, objArr)).intValue()));
            sb.append("} Fragments (");
            Iterator<setDropDownBackgroundResource> it = this.MenuHostHelper$$ExternalSyntheticLambda1.values().iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                if (it.hasNext()) {
                    sb.append(", ");
                }
            }
            sb.append(") Child Non Config (");
            Iterator<String> it2 = this.MenuHostHelper$$ExternalSyntheticLambda0.keySet().iterator();
            while (it2.hasNext()) {
                sb.append(it2.next());
                if (it2.hasNext()) {
                    sb.append(", ");
                }
            }
            sb.append(") ViewModelStores (");
            Iterator<String> it3 = this.setNavigationOnClickListener.keySet().iterator();
            while (it3.hasNext()) {
                sb.append(it3.next());
                if (it3.hasNext()) {
                    sb.append(", ");
                }
            }
            sb.append(')');
            return sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}