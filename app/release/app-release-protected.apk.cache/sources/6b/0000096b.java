package o;

import android.util.Log;
import android.view.ViewGroup;
import java.io.PrintWriter;
import java.util.ArrayList;
import o.ParcelImpl;
import o.finalize;

/* loaded from: classes.dex */
public final class setBackgroundTintList extends finalize implements ParcelImpl.setY {
    private static byte[] setTextAppearanceResource = {62, -79, -77, -78, 7, 1, -7, -4, 13, -9, -3, 51, -23, -16, 13, 39, -42, 13, 1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -36, 8, 1, 17, -6};
    public static final int setY = 92;
    int MenuHostHelper$$ExternalSyntheticLambda0;
    final ParcelImpl setIconTintList;
    private boolean setLayoutDirection;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0038). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = o.setBackgroundTintList.setTextAppearanceResource
            int r7 = 106 - r7
            int r6 = r6 * 3
            int r6 = r6 + 16
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L18
            r7 = r6
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L38
        L18:
            r3 = 0
            r5 = r8
            r8 = r7
        L1b:
            r7 = r5
            byte r4 = (byte) r8
            int r7 = r7 + 1
            r1[r3] = r4
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L38:
            int r9 = r9 - r6
            int r6 = r9 + 2
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setBackgroundTintList.a(short, short, int, java.lang.Object[]):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        try {
            Object[] objArr = {this};
            byte b = (byte) (setTextAppearanceResource[5] - 1);
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            a(b, b2, (byte) (b2 | 14), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b3 = setTextAppearanceResource[5];
            Object[] objArr3 = new Object[1];
            a((byte) (setTextAppearanceResource[5] - 1), b3, (byte) (-b3), objArr3);
            sb.append(Integer.toHexString(((Integer) cls.getMethod((String) objArr3[0], Object.class).invoke(null, objArr)).intValue()));
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 >= 0) {
                sb.append(" #");
                sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
            }
            if (this.setTextAlignment != null) {
                sb.append(" ");
                sb.append(this.setTextAlignment);
            }
            sb.append("}");
            return sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.setTextAlignment);
            printWriter.print(" mIndex=");
            printWriter.print(this.MenuHostHelper$$ExternalSyntheticLambda0);
            printWriter.print(" mCommitted=");
            printWriter.println(this.setLayoutDirection);
            if (this.setMaxEms != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.setMaxEms));
            }
            if (this.setChipCornerRadius != 0 || this.ViewPager$SavedState$1 != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.setChipCornerRadius));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.ViewPager$SavedState$1));
            }
            if (this.setIconSize != 0 || this.setZ != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.setIconSize));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.setZ));
            }
            if (this.setLayoutAnimation != 0 || this.setOnLongClickListener != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.setLayoutAnimation));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.setOnLongClickListener);
            }
            if (this.setNavigationOnClickListener != 0 || this.setUnboundedRipple != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.setNavigationOnClickListener));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.setUnboundedRipple);
            }
        }
        if (this.setCenterIfNoTextEnabled.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.setCenterIfNoTextEnabled.size();
        for (int i = 0; i < size; i++) {
            finalize.setX setx = this.setCenterIfNoTextEnabled.get(i);
            switch (setx.setY) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    StringBuilder sb = new StringBuilder("cmd=");
                    sb.append(setx.setY);
                    str2 = sb.toString();
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(setx.setX);
            if (z) {
                if (setx.setIconTintList != 0 || setx.MenuHostHelper$$ExternalSyntheticLambda0 != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(setx.setIconTintList));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(setx.MenuHostHelper$$ExternalSyntheticLambda0));
                }
                if (setx.setOnLongClickListener != 0 || setx.setUiOptions != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(setx.setOnLongClickListener));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(setx.setUiOptions));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.finalize
    public final void setIconTintList(int i, setDropDownBackgroundResource setdropdownbackgroundresource, String str, int i2) {
        super.setIconTintList(i, setdropdownbackgroundresource, str, i2);
        setdropdownbackgroundresource.ViewPager$SavedState$1 = this.setIconTintList;
    }

    @Override // o.finalize
    public final finalize MenuHostHelper$$ExternalSyntheticLambda1(setDropDownBackgroundResource setdropdownbackgroundresource) {
        if (setdropdownbackgroundresource.ViewPager$SavedState$1 != null && setdropdownbackgroundresource.ViewPager$SavedState$1 != this.setIconTintList) {
            StringBuilder sb = new StringBuilder("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            sb.append(setdropdownbackgroundresource.toString());
            sb.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(sb.toString());
        }
        return super.MenuHostHelper$$ExternalSyntheticLambda1(setdropdownbackgroundresource);
    }

    @Override // o.finalize
    public final finalize setX(setDropDownBackgroundResource setdropdownbackgroundresource, registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda1) {
        if (setdropdownbackgroundresource.ViewPager$SavedState$1 != this.setIconTintList) {
            StringBuilder sb = new StringBuilder("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            sb.append(this.setIconTintList);
            throw new IllegalArgumentException(sb.toString());
        } else if (registerin_menuhosthelper__externalsyntheticlambda1 == registerIn$MenuHostHelper$$ExternalSyntheticLambda1.INITIALIZED && setdropdownbackgroundresource.setAdapter >= 0) {
            StringBuilder sb2 = new StringBuilder("Cannot set maximum Lifecycle to ");
            sb2.append(registerin_menuhosthelper__externalsyntheticlambda1);
            sb2.append(" after the Fragment has been created");
            throw new IllegalArgumentException(sb2.toString());
        } else if (registerin_menuhosthelper__externalsyntheticlambda1 == registerIn$MenuHostHelper$$ExternalSyntheticLambda1.DESTROYED) {
            StringBuilder sb3 = new StringBuilder("Cannot set maximum Lifecycle to ");
            sb3.append(registerin_menuhosthelper__externalsyntheticlambda1);
            sb3.append(". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            throw new IllegalArgumentException(sb3.toString());
        } else {
            return super.setX(setdropdownbackgroundresource, registerin_menuhosthelper__externalsyntheticlambda1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(int i) {
        boolean isLoggable;
        boolean isLoggable2;
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            isLoggable = Log.isLoggable("FragmentManager", 2);
            if (isLoggable) {
                StringBuilder sb = new StringBuilder("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
                Log.v("FragmentManager", sb.toString());
            }
            int size = this.setCenterIfNoTextEnabled.size();
            for (int i2 = 0; i2 < size; i2++) {
                finalize.setX setx = this.setCenterIfNoTextEnabled.get(i2);
                if (setx.setX != null) {
                    setx.setX.setY += i;
                    isLoggable2 = Log.isLoggable("FragmentManager", 2);
                    if (isLoggable2) {
                        StringBuilder sb2 = new StringBuilder("Bump nesting of ");
                        sb2.append(setx.setX);
                        sb2.append(" to ");
                        sb2.append(setx.setX.setY);
                        Log.v("FragmentManager", sb2.toString());
                    }
                }
            }
        }
    }

    @Override // o.finalize
    public final int setX() {
        return MenuHostHelper$$ExternalSyntheticLambda0(false);
    }

    @Override // o.finalize
    public final int setIconTintList() {
        return MenuHostHelper$$ExternalSyntheticLambda0(true);
    }

    private int MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        boolean isLoggable;
        if (!this.setLayoutDirection) {
            isLoggable = Log.isLoggable("FragmentManager", 2);
            if (isLoggable) {
                StringBuilder sb = new StringBuilder("Commit: ");
                sb.append(this);
                Log.v("FragmentManager", sb.toString());
                PrintWriter printWriter = new PrintWriter(new setPlaceholderTextAppearance("FragmentManager"));
                MenuHostHelper$$ExternalSyntheticLambda0("  ", printWriter, true);
                printWriter.close();
            }
            this.setLayoutDirection = true;
            if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0.getAndIncrement();
            } else {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
            }
            this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(this, z);
            return this.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        throw new IllegalStateException("commit already called");
    }

    @Override // o.ParcelImpl.setY
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(ArrayList<setBackgroundTintList> arrayList, ArrayList<Boolean> arrayList2) {
        boolean isLoggable;
        isLoggable = Log.isLoggable("FragmentManager", 2);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("Run: ");
            sb.append(this);
            Log.v("FragmentManager", sb.toString());
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            ParcelImpl parcelImpl = this.setIconTintList;
            if (parcelImpl.setIconTintList == null) {
                parcelImpl.setIconTintList = new ArrayList<>();
            }
            parcelImpl.setIconTintList.add(this);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY() {
        int size = this.setCenterIfNoTextEnabled.size();
        for (int i = 0; i < size; i++) {
            finalize.setX setx = this.setCenterIfNoTextEnabled.get(i);
            setDropDownBackgroundResource setdropdownbackgroundresource = setx.setX;
            if (setdropdownbackgroundresource != null) {
                setdropdownbackgroundresource.setUnboundedRipple(false);
                setdropdownbackgroundresource.MenuHostHelper$$ExternalSyntheticLambda0(this.setMaxEms);
                setdropdownbackgroundresource.setIconTintList(this.setOnNavigationItemSelectedListener, this.setTextScaleX);
            }
            switch (setx.setY) {
                case 1:
                    setdropdownbackgroundresource.MenuHostHelper$$ExternalSyntheticLambda0(setx.setIconTintList, setx.MenuHostHelper$$ExternalSyntheticLambda0, setx.setOnLongClickListener, setx.setUiOptions);
                    ViewGroup MenuHostHelper$$ExternalSyntheticLambda1 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(setdropdownbackgroundresource);
                    if (MenuHostHelper$$ExternalSyntheticLambda1 != null && (MenuHostHelper$$ExternalSyntheticLambda1 instanceof androidx.fragment.app.FragmentContainerView)) {
                        ((androidx.fragment.app.FragmentContainerView) MenuHostHelper$$ExternalSyntheticLambda1).setX = true;
                    }
                    this.setIconTintList.setY(setdropdownbackgroundresource);
                    break;
                case 2:
                default:
                    StringBuilder sb = new StringBuilder("Unknown cmd: ");
                    sb.append(setx.setY);
                    throw new IllegalArgumentException(sb.toString());
                case 3:
                    setdropdownbackgroundresource.MenuHostHelper$$ExternalSyntheticLambda0(setx.setIconTintList, setx.MenuHostHelper$$ExternalSyntheticLambda0, setx.setOnLongClickListener, setx.setUiOptions);
                    this.setIconTintList.setIconSize(setdropdownbackgroundresource);
                    break;
                case 4:
                    setdropdownbackgroundresource.MenuHostHelper$$ExternalSyntheticLambda0(setx.setIconTintList, setx.MenuHostHelper$$ExternalSyntheticLambda0, setx.setOnLongClickListener, setx.setUiOptions);
                    this.setIconTintList.setUiOptions(setdropdownbackgroundresource);
                    break;
                case 5:
                    setdropdownbackgroundresource.MenuHostHelper$$ExternalSyntheticLambda0(setx.setIconTintList, setx.MenuHostHelper$$ExternalSyntheticLambda0, setx.setOnLongClickListener, setx.setUiOptions);
                    ViewGroup MenuHostHelper$$ExternalSyntheticLambda12 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(setdropdownbackgroundresource);
                    if (MenuHostHelper$$ExternalSyntheticLambda12 != null && (MenuHostHelper$$ExternalSyntheticLambda12 instanceof androidx.fragment.app.FragmentContainerView)) {
                        ((androidx.fragment.app.FragmentContainerView) MenuHostHelper$$ExternalSyntheticLambda12).setX = true;
                    }
                    ParcelImpl.setTextAlignment(setdropdownbackgroundresource);
                    break;
                case 6:
                    setdropdownbackgroundresource.MenuHostHelper$$ExternalSyntheticLambda0(setx.setIconTintList, setx.MenuHostHelper$$ExternalSyntheticLambda0, setx.setOnLongClickListener, setx.setUiOptions);
                    this.setIconTintList.setLayoutAnimation(setdropdownbackgroundresource);
                    break;
                case 7:
                    setdropdownbackgroundresource.MenuHostHelper$$ExternalSyntheticLambda0(setx.setIconTintList, setx.MenuHostHelper$$ExternalSyntheticLambda0, setx.setOnLongClickListener, setx.setUiOptions);
                    ViewGroup MenuHostHelper$$ExternalSyntheticLambda13 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(setdropdownbackgroundresource);
                    if (MenuHostHelper$$ExternalSyntheticLambda13 != null && (MenuHostHelper$$ExternalSyntheticLambda13 instanceof androidx.fragment.app.FragmentContainerView)) {
                        ((androidx.fragment.app.FragmentContainerView) MenuHostHelper$$ExternalSyntheticLambda13).setX = true;
                    }
                    this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(setdropdownbackgroundresource);
                    break;
                case 8:
                    this.setIconTintList.ViewPager$SavedState$1(setdropdownbackgroundresource);
                    break;
                case 9:
                    this.setIconTintList.ViewPager$SavedState$1(null);
                    break;
                case 10:
                    this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(setdropdownbackgroundresource, setx.MenuHostHelper$$ExternalSyntheticLambda1);
                    break;
            }
            if (!this.setAnimationFromJson && setx.setY != 1 && setdropdownbackgroundresource != null) {
                boolean z = ParcelImpl.setX;
            }
        }
        if (this.setAnimationFromJson) {
            return;
        }
        boolean z2 = ParcelImpl.setX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(boolean z) {
        for (int size = this.setCenterIfNoTextEnabled.size() - 1; size >= 0; size--) {
            finalize.setX setx = this.setCenterIfNoTextEnabled.get(size);
            setDropDownBackgroundResource setdropdownbackgroundresource = setx.setX;
            if (setdropdownbackgroundresource != null) {
                setdropdownbackgroundresource.setUnboundedRipple(true);
                setdropdownbackgroundresource.MenuHostHelper$$ExternalSyntheticLambda0(ParcelImpl.setIconTintList(this.setMaxEms));
                setdropdownbackgroundresource.setIconTintList(this.setTextScaleX, this.setOnNavigationItemSelectedListener);
            }
            switch (setx.setY) {
                case 1:
                    setdropdownbackgroundresource.MenuHostHelper$$ExternalSyntheticLambda0(setx.setIconTintList, setx.MenuHostHelper$$ExternalSyntheticLambda0, setx.setOnLongClickListener, setx.setUiOptions);
                    ViewGroup MenuHostHelper$$ExternalSyntheticLambda1 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(setdropdownbackgroundresource);
                    if (MenuHostHelper$$ExternalSyntheticLambda1 != null && (MenuHostHelper$$ExternalSyntheticLambda1 instanceof androidx.fragment.app.FragmentContainerView)) {
                        ((androidx.fragment.app.FragmentContainerView) MenuHostHelper$$ExternalSyntheticLambda1).setX = false;
                    }
                    this.setIconTintList.setIconSize(setdropdownbackgroundresource);
                    break;
                case 2:
                default:
                    StringBuilder sb = new StringBuilder("Unknown cmd: ");
                    sb.append(setx.setY);
                    throw new IllegalArgumentException(sb.toString());
                case 3:
                    setdropdownbackgroundresource.MenuHostHelper$$ExternalSyntheticLambda0(setx.setIconTintList, setx.MenuHostHelper$$ExternalSyntheticLambda0, setx.setOnLongClickListener, setx.setUiOptions);
                    this.setIconTintList.setY(setdropdownbackgroundresource);
                    break;
                case 4:
                    setdropdownbackgroundresource.MenuHostHelper$$ExternalSyntheticLambda0(setx.setIconTintList, setx.MenuHostHelper$$ExternalSyntheticLambda0, setx.setOnLongClickListener, setx.setUiOptions);
                    ParcelImpl.setTextAlignment(setdropdownbackgroundresource);
                    break;
                case 5:
                    setdropdownbackgroundresource.MenuHostHelper$$ExternalSyntheticLambda0(setx.setIconTintList, setx.MenuHostHelper$$ExternalSyntheticLambda0, setx.setOnLongClickListener, setx.setUiOptions);
                    ViewGroup MenuHostHelper$$ExternalSyntheticLambda12 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(setdropdownbackgroundresource);
                    if (MenuHostHelper$$ExternalSyntheticLambda12 != null && (MenuHostHelper$$ExternalSyntheticLambda12 instanceof androidx.fragment.app.FragmentContainerView)) {
                        ((androidx.fragment.app.FragmentContainerView) MenuHostHelper$$ExternalSyntheticLambda12).setX = false;
                    }
                    this.setIconTintList.setUiOptions(setdropdownbackgroundresource);
                    break;
                case 6:
                    setdropdownbackgroundresource.MenuHostHelper$$ExternalSyntheticLambda0(setx.setIconTintList, setx.MenuHostHelper$$ExternalSyntheticLambda0, setx.setOnLongClickListener, setx.setUiOptions);
                    this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(setdropdownbackgroundresource);
                    break;
                case 7:
                    setdropdownbackgroundresource.MenuHostHelper$$ExternalSyntheticLambda0(setx.setIconTintList, setx.MenuHostHelper$$ExternalSyntheticLambda0, setx.setOnLongClickListener, setx.setUiOptions);
                    ViewGroup MenuHostHelper$$ExternalSyntheticLambda13 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(setdropdownbackgroundresource);
                    if (MenuHostHelper$$ExternalSyntheticLambda13 != null && (MenuHostHelper$$ExternalSyntheticLambda13 instanceof androidx.fragment.app.FragmentContainerView)) {
                        ((androidx.fragment.app.FragmentContainerView) MenuHostHelper$$ExternalSyntheticLambda13).setX = false;
                    }
                    this.setIconTintList.setLayoutAnimation(setdropdownbackgroundresource);
                    break;
                case 8:
                    this.setIconTintList.ViewPager$SavedState$1(null);
                    break;
                case 9:
                    this.setIconTintList.ViewPager$SavedState$1(setdropdownbackgroundresource);
                    break;
                case 10:
                    this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(setdropdownbackgroundresource, setx.setLayoutAnimation);
                    break;
            }
            if (!this.setAnimationFromJson && setx.setY != 3 && setdropdownbackgroundresource != null) {
                boolean z2 = ParcelImpl.setX;
            }
        }
        if (this.setAnimationFromJson || !z) {
            return;
        }
        boolean z3 = ParcelImpl.setX;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public setBackgroundTintList(o.ParcelImpl r3) {
        /*
            r2 = this;
            o.setForegroundTintMode r0 = r3.setUnboundedRipple
            o.setDropDownBackgroundResource r0 = r3.setGuidelinePercent
            if (r0 == 0) goto Ld
            o.ParcelImpl r0 = r0.ViewPager$SavedState$1
            o.setForegroundTintMode r0 = r0.setChipCornerRadius()
            goto Lf
        Ld:
            o.setForegroundTintMode r0 = r3.setTextAlignment
        Lf:
            o.setInlineLabel<?> r1 = r3.setCenterIfNoTextEnabled
            if (r1 == 0) goto L1c
            o.setInlineLabel<?> r1 = r3.setCenterIfNoTextEnabled
            android.content.Context r1 = r1.setY
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L1d
        L1c:
            r1 = 0
        L1d:
            r2.<init>(r0, r1)
            r0 = -1
            r2.MenuHostHelper$$ExternalSyntheticLambda0 = r0
            r2.setIconTintList = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setBackgroundTintList.<init>(o.ParcelImpl):void");
    }

    @Override // o.finalize
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.setX = false;
        this.setIconTintList.setIconTintList(this, false);
    }

    @Override // o.finalize
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.setX = false;
        this.setIconTintList.setIconTintList(this, true);
    }
}