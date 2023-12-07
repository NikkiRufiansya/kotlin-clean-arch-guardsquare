package o;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import o.ParcelImpl;
import o.finalize;
import o.setOnNavigationItemSelectedListener;

/* loaded from: classes.dex */
public abstract class ParcelImpl {
    private static byte[] RecyclerView$SavedState$1 = {59, -54, -26, -72, -7, -1, 7, 4, -13, 9, 3, -51, 23, 16, -13, -39, 42, -13, -1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 36, -8, -1, -17, 6};
    public static final int setHasDecor = 199;
    static boolean setX = true;
    private ArrayList<Object> ExtendableSavedState$1;
    private boolean FloatingActionButton$BaseBehavior;
    private ArrayList<Object> FragmentStateAdapter$2;
    getInsets MenuHostHelper$$ExternalSyntheticLambda1;
    public boolean SearchView$SavedState$1;
    setInlineLabel<?> setCenterIfNoTextEnabled;
    public boolean setCheckedIconEnabled;
    private boolean setConstraintSet;
    private setIconSize<Object> setFilterTouchesWhenObscured;
    private ArrayList<setBackgroundTintList> setFloatValues;
    public setDropDownBackgroundResource setGuidelinePercent;
    ArrayList<setBackgroundTintList> setIconTintList;
    private ArrayList<setDropDownBackgroundResource> setIconified;
    private ArrayList<Boolean> setImageTintMode;
    setPopupCallback setMaxEms;
    private setIconSize<String[]> setObjectValues;
    boolean setOnNavigationItemSelectedListener;
    private setIconSize<Intent> setSuffixText;
    setDropDownBackgroundResource setTextAppearanceResource;
    OnBackPressedDispatcher setTextScaleX;
    public boolean setUiOptions;
    private ArrayList<setDropDownBackgroundResource> setViewTranslationCallback;
    private final ArrayList<setY> FragmentStateAdapter$5 = new ArrayList<>();
    public final setTextCursorDrawable setNavigationOnClickListener = new setTextCursorDrawable();
    final onActivityCreated setChipCornerRadius = new onActivityCreated(this);
    final setOnLongClickListener setAnimationFromJson = new setOnLongClickListener() { // from class: o.ParcelImpl.1
        @Override // o.setOnLongClickListener
        public final void setX() {
            ParcelImpl parcelImpl = ParcelImpl.this;
            parcelImpl.MenuHostHelper$$ExternalSyntheticLambda0(true);
            if (!parcelImpl.setAnimationFromJson.MenuHostHelper$$ExternalSyntheticLambda1()) {
                parcelImpl.setTextScaleX.setIconTintList();
            } else {
                parcelImpl.setY();
            }
        }
    };
    final AtomicInteger MenuHostHelper$$ExternalSyntheticLambda0 = new AtomicInteger();
    public final Map<String, Bundle> setMinAndMaxProgress = Collections.synchronizedMap(new HashMap());
    private final Map<String, Object> setAdapter = Collections.synchronizedMap(new HashMap());
    Map<setDropDownBackgroundResource, HashSet<setRenderMode>> setOnLongClickListener = Collections.synchronizedMap(new HashMap());
    final getClass$MenuHostHelper$$ExternalSyntheticLambda1 ViewPager$SavedState$1 = new getClass$MenuHostHelper$$ExternalSyntheticLambda1() { // from class: o.ParcelImpl.2
    };
    public final setCornerRadiusResource setZ = new setCornerRadiusResource(this);
    private final CopyOnWriteArrayList<setHintAnimationEnabled> setContentScrimResource = new CopyOnWriteArrayList<>();
    int setY = -1;
    public setForegroundTintMode setUnboundedRipple = null;
    public setForegroundTintMode setTextAlignment = new setForegroundTintMode() { // from class: o.ParcelImpl.3
        @Override // o.setForegroundTintMode
        public final setDropDownBackgroundResource MenuHostHelper$$ExternalSyntheticLambda1(ClassLoader classLoader, String str) {
            setInlineLabel<?> setinlinelabel = ParcelImpl.this.setCenterIfNoTextEnabled;
            return setDropDownBackgroundResource.setX(ParcelImpl.this.setCenterIfNoTextEnabled.setY, str, (Bundle) null);
        }
    };
    EmojiCompatInitializer setLayoutDirection = null;
    EmojiCompatInitializer setLayoutAnimation = new EmojiCompatInitializer() { // from class: o.ParcelImpl.6
        @Override // o.EmojiCompatInitializer
        public final setEdgeEffectColor setIconTintList(ViewGroup viewGroup) {
            return new setMargin(viewGroup);
        }
    };
    ArrayDeque<setIconTintList> setIconSize = new ArrayDeque<>();
    private Runnable setChipIconTintResource = new Runnable() { // from class: o.ParcelImpl.8
        @Override // java.lang.Runnable
        public final void run() {
            ParcelImpl.this.MenuHostHelper$$ExternalSyntheticLambda0(true);
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface setY {
        boolean MenuHostHelper$$ExternalSyntheticLambda0(ArrayList<setBackgroundTintList> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0031). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = 106 - r7
            int r9 = r9 * 15
            int r9 = 19 - r9
            int r8 = r8 * 2
            int r8 = r8 + 16
            byte[] r0 = o.ParcelImpl.RecyclerView$SavedState$1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            goto L31
        L18:
            r3 = 0
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L31:
            int r7 = r7 + r8
            int r7 = r7 + 2
            int r8 = r10 + 1
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ParcelImpl.a(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setIconTintList(int i) {
        if (i != 4097) {
            if (i != 4099) {
                return i != 8194 ? 0 : 4097;
            }
            return 4099;
        }
        return 8194;
    }

    private void setChipIconTintResource() {
        synchronized (this.FragmentStateAdapter$5) {
            boolean z = true;
            if (!this.FragmentStateAdapter$5.isEmpty()) {
                this.setAnimationFromJson.setIconTintList(true);
                return;
            }
            setOnLongClickListener setonlongclicklistener = this.setAnimationFromJson;
            ArrayList<setBackgroundTintList> arrayList = this.setIconTintList;
            setonlongclicklistener.setIconTintList(((arrayList != null ? arrayList.size() : 0) <= 0 || !setCenterIfNoTextEnabled(this.setGuidelinePercent)) ? false : false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean setCenterIfNoTextEnabled(setDropDownBackgroundResource setdropdownbackgroundresource) {
        if (setdropdownbackgroundresource == null) {
            return true;
        }
        ParcelImpl parcelImpl = setdropdownbackgroundresource.ViewPager$SavedState$1;
        return setdropdownbackgroundresource.equals(parcelImpl.setTextAppearanceResource) && setCenterIfNoTextEnabled(parcelImpl.setGuidelinePercent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean setNavigationOnClickListener(setDropDownBackgroundResource setdropdownbackgroundresource) {
        if (setdropdownbackgroundresource == null) {
            return true;
        }
        return setdropdownbackgroundresource.setTooltipText();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean setY() {
        MenuHostHelper$$ExternalSyntheticLambda0(false);
        setX(true);
        setDropDownBackgroundResource setdropdownbackgroundresource = this.setTextAppearanceResource;
        if (setdropdownbackgroundresource == null || !setdropdownbackgroundresource.setMinAndMaxProgress().setY()) {
            boolean x = setX(this.setFloatValues, this.setImageTintMode, null, -1, 0);
            if (x) {
                this.setConstraintSet = true;
                try {
                    MenuHostHelper$$ExternalSyntheticLambda0(this.setFloatValues, this.setImageTintMode);
                } finally {
                    this.setConstraintSet = false;
                    this.setImageTintMode.clear();
                    this.setFloatValues.clear();
                }
            }
            setChipIconTintResource();
            if (this.FloatingActionButton$BaseBehavior) {
                this.FloatingActionButton$BaseBehavior = false;
                setLayoutDirection();
            }
            this.setNavigationOnClickListener.setX.values().removeAll(Collections.singleton(null));
            return x;
        }
        return true;
    }

    public static setDropDownBackgroundResource MenuHostHelper$$ExternalSyntheticLambda1(View view) {
        Object tag = view.getTag(R.id.res_0x7f0a00d6);
        if (tag instanceof setDropDownBackgroundResource) {
            return (setDropDownBackgroundResource) tag;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setTabRippleColorResource setUnboundedRipple(setDropDownBackgroundResource setdropdownbackgroundresource) {
        setPopupCallback setpopupcallback = this.setMaxEms;
        setTabRippleColorResource settabripplecolorresource = setpopupcallback.setNavigationOnClickListener.get(setdropdownbackgroundresource.setShrinkMotionSpec);
        if (settabripplecolorresource == null) {
            setTabRippleColorResource settabripplecolorresource2 = new setTabRippleColorResource();
            setpopupcallback.setNavigationOnClickListener.put(setdropdownbackgroundresource.setShrinkMotionSpec, settabripplecolorresource2);
            return settabripplecolorresource2;
        }
        return settabripplecolorresource;
    }

    private setPopupCallback setAnimationFromJson(setDropDownBackgroundResource setdropdownbackgroundresource) {
        setPopupCallback setpopupcallback = this.setMaxEms;
        setPopupCallback setpopupcallback2 = setpopupcallback.MenuHostHelper$$ExternalSyntheticLambda0.get(setdropdownbackgroundresource.setShrinkMotionSpec);
        if (setpopupcallback2 == null) {
            setPopupCallback setpopupcallback3 = new setPopupCallback(setpopupcallback.setX);
            setpopupcallback.MenuHostHelper$$ExternalSyntheticLambda0.put(setdropdownbackgroundresource.setShrinkMotionSpec, setpopupcallback3);
            return setpopupcallback3;
        }
        return setpopupcallback2;
    }

    public final boolean setZ() {
        return this.setUiOptions;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        try {
            Object[] objArr = {this};
            byte b = (byte) (RecyclerView$SavedState$1[5] + 1);
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            a(b, b2, b2, objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b3 = (byte) (-RecyclerView$SavedState$1[5]);
            Object[] objArr3 = new Object[1];
            a(b3, (byte) (b3 - 1), (byte) (-RecyclerView$SavedState$1[5]), objArr3);
            sb.append(Integer.toHexString(((Integer) cls.getMethod((String) objArr3[0], Object.class).invoke(null, objArr)).intValue()));
            sb.append(" in ");
            setDropDownBackgroundResource setdropdownbackgroundresource = this.setGuidelinePercent;
            if (setdropdownbackgroundresource != null) {
                sb.append(setdropdownbackgroundresource.getClass().getSimpleName());
                sb.append("{");
                try {
                    Object[] objArr4 = {this.setGuidelinePercent};
                    byte b4 = (byte) (RecyclerView$SavedState$1[5] + 1);
                    byte b5 = b4;
                    Object[] objArr5 = new Object[1];
                    a(b4, b5, b5, objArr5);
                    Class<?> cls2 = Class.forName((String) objArr5[0]);
                    byte b6 = (byte) (-RecyclerView$SavedState$1[5]);
                    Object[] objArr6 = new Object[1];
                    a(b6, (byte) (b6 - 1), (byte) (-RecyclerView$SavedState$1[5]), objArr6);
                    sb.append(Integer.toHexString(((Integer) cls2.getMethod((String) objArr6[0], Object.class).invoke(null, objArr4)).intValue()));
                    sb.append("}");
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                setInlineLabel<?> setinlinelabel = this.setCenterIfNoTextEnabled;
                if (setinlinelabel != null) {
                    sb.append(setinlinelabel.getClass().getSimpleName());
                    sb.append("{");
                    try {
                        Object[] objArr7 = {this.setCenterIfNoTextEnabled};
                        byte b7 = (byte) (RecyclerView$SavedState$1[5] + 1);
                        byte b8 = b7;
                        Object[] objArr8 = new Object[1];
                        a(b7, b8, b8, objArr8);
                        Class<?> cls3 = Class.forName((String) objArr8[0]);
                        byte b9 = (byte) (-RecyclerView$SavedState$1[5]);
                        Object[] objArr9 = new Object[1];
                        a(b9, (byte) (b9 - 1), (byte) (-RecyclerView$SavedState$1[5]), objArr9);
                        sb.append(Integer.toHexString(((Integer) cls3.getMethod((String) objArr9[0], Object.class).invoke(null, objArr7)).intValue()));
                        sb.append("}");
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                } else {
                    sb.append("null");
                }
            }
            sb.append("}}");
            return sb.toString();
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th3;
        }
    }

    public final void setIconTintList(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String obj = sb.toString();
        this.setNavigationOnClickListener.setIconTintList(str, fileDescriptor, printWriter, strArr);
        ArrayList<setDropDownBackgroundResource> arrayList = this.setIconified;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.setIconified.get(i).toString());
            }
        }
        ArrayList<setBackgroundTintList> arrayList2 = this.setIconTintList;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                setBackgroundTintList setbackgroundtintlist = this.setIconTintList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(setbackgroundtintlist.toString());
                setbackgroundtintlist.MenuHostHelper$$ExternalSyntheticLambda0(obj, printWriter, true);
            }
        }
        printWriter.print(str);
        StringBuilder sb2 = new StringBuilder("Back Stack Index: ");
        sb2.append(this.MenuHostHelper$$ExternalSyntheticLambda0.get());
        printWriter.println(sb2.toString());
        synchronized (this.FragmentStateAdapter$5) {
            int size3 = this.FragmentStateAdapter$5.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.FragmentStateAdapter$5.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.setCenterIfNoTextEnabled);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.MenuHostHelper$$ExternalSyntheticLambda1);
        if (this.setGuidelinePercent != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.setGuidelinePercent);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.setY);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.setCheckedIconEnabled);
        printWriter.print(" mStopped=");
        printWriter.print(this.SearchView$SavedState$1);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.setUiOptions);
        if (this.setOnNavigationItemSelectedListener) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.setOnNavigationItemSelectedListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean setY(int i) {
        return this.setY > 0;
    }

    final void setY(int i, boolean z) {
        setInlineLabel<?> setinlinelabel;
        if (this.setCenterIfNoTextEnabled == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.setY) {
            this.setY = i;
            this.setNavigationOnClickListener.setY();
            setLayoutDirection();
            if (this.setOnNavigationItemSelectedListener && (setinlinelabel = this.setCenterIfNoTextEnabled) != null && this.setY == 7) {
                setinlinelabel.setOnLongClickListener();
                this.setOnNavigationItemSelectedListener = false;
            }
        }
    }

    private void setLayoutDirection() {
        for (setOverscrollHeader setoverscrollheader : this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0()) {
            MenuHostHelper$$ExternalSyntheticLambda0(setoverscrollheader);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setOverscrollHeader setX(setDropDownBackgroundResource setdropdownbackgroundresource) {
        setTextCursorDrawable settextcursordrawable = this.setNavigationOnClickListener;
        setOverscrollHeader setoverscrollheader = settextcursordrawable.setX.get(setdropdownbackgroundresource.setShrinkMotionSpec);
        if (setoverscrollheader != null) {
            return setoverscrollheader;
        }
        setOverscrollHeader setoverscrollheader2 = new setOverscrollHeader(this.setZ, this.setNavigationOnClickListener, setdropdownbackgroundresource);
        setoverscrollheader2.MenuHostHelper$$ExternalSyntheticLambda0(this.setCenterIfNoTextEnabled.setY.getClassLoader());
        setoverscrollheader2.setX = this.setY;
        return setoverscrollheader2;
    }

    public setDropDownBackgroundResource findFragmentById(int i) {
        setTextCursorDrawable settextcursordrawable = this.setNavigationOnClickListener;
        for (int size = settextcursordrawable.MenuHostHelper$$ExternalSyntheticLambda1.size() - 1; size >= 0; size--) {
            setDropDownBackgroundResource setdropdownbackgroundresource = settextcursordrawable.MenuHostHelper$$ExternalSyntheticLambda1.get(size);
            if (setdropdownbackgroundresource != null && setdropdownbackgroundresource.setCenterIfNoTextEnabled == i) {
                return setdropdownbackgroundresource;
            }
        }
        for (setOverscrollHeader setoverscrollheader : settextcursordrawable.setX.values()) {
            if (setoverscrollheader != null) {
                setDropDownBackgroundResource setdropdownbackgroundresource2 = setoverscrollheader.setIconTintList;
                if (setdropdownbackgroundresource2.setCenterIfNoTextEnabled == i) {
                    return setdropdownbackgroundresource2;
                }
            }
        }
        return null;
    }

    public setDropDownBackgroundResource findFragmentByTag(String str) {
        setTextCursorDrawable settextcursordrawable = this.setNavigationOnClickListener;
        if (str != null) {
            for (int size = settextcursordrawable.MenuHostHelper$$ExternalSyntheticLambda1.size() - 1; size >= 0; size--) {
                setDropDownBackgroundResource setdropdownbackgroundresource = settextcursordrawable.MenuHostHelper$$ExternalSyntheticLambda1.get(size);
                if (setdropdownbackgroundresource != null && str.equals(setdropdownbackgroundresource.setObjectValues)) {
                    return setdropdownbackgroundresource;
                }
            }
        }
        if (str != null) {
            for (setOverscrollHeader setoverscrollheader : settextcursordrawable.setX.values()) {
                if (setoverscrollheader != null) {
                    setDropDownBackgroundResource setdropdownbackgroundresource2 = setoverscrollheader.setIconTintList;
                    if (str.equals(setdropdownbackgroundresource2.setObjectValues)) {
                        return setdropdownbackgroundresource2;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setDropDownBackgroundResource setY(String str) {
        return this.setNavigationOnClickListener.setIconTintList(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setDropDownBackgroundResource MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        setOverscrollHeader setoverscrollheader = this.setNavigationOnClickListener.setX.get(str);
        if (setoverscrollheader != null) {
            return setoverscrollheader.setIconTintList;
        }
        return null;
    }

    public final boolean setAnimationFromJson() {
        return this.setCheckedIconEnabled || this.SearchView$SavedState$1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(setY sety, boolean z) {
        if (!z) {
            if (this.setCenterIfNoTextEnabled == null) {
                if (this.setUiOptions) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            setMinAndMaxProgress();
        }
        synchronized (this.FragmentStateAdapter$5) {
            if (this.setCenterIfNoTextEnabled == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.FragmentStateAdapter$5.add(sety);
            setOnNavigationItemSelectedListener();
        }
    }

    final void setOnNavigationItemSelectedListener() {
        synchronized (this.FragmentStateAdapter$5) {
            if (this.FragmentStateAdapter$5.size() == 1) {
                this.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda0.removeCallbacks(this.setChipIconTintResource);
                this.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda0.post(this.setChipIconTintResource);
                setChipIconTintResource();
            }
        }
    }

    private void setX(boolean z) {
        if (this.setConstraintSet) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.setCenterIfNoTextEnabled == null) {
            if (this.setUiOptions) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda0.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else {
            if (!z) {
                setMinAndMaxProgress();
            }
            if (this.setFloatValues == null) {
                this.setFloatValues = new ArrayList<>();
                this.setImageTintMode = new ArrayList<>();
            }
            this.setConstraintSet = true;
            this.setConstraintSet = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList(setY sety, boolean z) {
        if (z && (this.setCenterIfNoTextEnabled == null || this.setUiOptions)) {
            return;
        }
        setX(z);
        if (sety.MenuHostHelper$$ExternalSyntheticLambda0(this.setFloatValues, this.setImageTintMode)) {
            this.setConstraintSet = true;
            try {
                MenuHostHelper$$ExternalSyntheticLambda0(this.setFloatValues, this.setImageTintMode);
            } finally {
                this.setConstraintSet = false;
                this.setImageTintMode.clear();
                this.setFloatValues.clear();
            }
        }
        setChipIconTintResource();
        if (this.FloatingActionButton$BaseBehavior) {
            this.FloatingActionButton$BaseBehavior = false;
            setLayoutDirection();
        }
        this.setNavigationOnClickListener.setX.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        setX(z);
        boolean z2 = false;
        while (setX(this.setFloatValues, this.setImageTintMode)) {
            this.setConstraintSet = true;
            try {
                MenuHostHelper$$ExternalSyntheticLambda0(this.setFloatValues, this.setImageTintMode);
                this.setConstraintSet = false;
                this.setImageTintMode.clear();
                this.setFloatValues.clear();
                z2 = true;
            } catch (Throwable th) {
                this.setConstraintSet = false;
                this.setImageTintMode.clear();
                this.setFloatValues.clear();
                throw th;
            }
        }
        setChipIconTintResource();
        if (this.FloatingActionButton$BaseBehavior) {
            this.FloatingActionButton$BaseBehavior = false;
            setLayoutDirection();
        }
        this.setNavigationOnClickListener.setX.values().removeAll(Collections.singleton(null));
        return z2;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(ArrayList<setBackgroundTintList> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!arrayList.get(i).setAnimationFromJson) {
                if (i2 != i) {
                    MenuHostHelper$$ExternalSyntheticLambda1(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (arrayList2.get(i).booleanValue()) {
                    while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).setAnimationFromJson) {
                        i2++;
                    }
                }
                MenuHostHelper$$ExternalSyntheticLambda1(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            MenuHostHelper$$ExternalSyntheticLambda1(arrayList, arrayList2, i2, size);
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(ArrayList<setBackgroundTintList> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        EmojiCompatInitializer emojiCompatInitializer;
        int i3;
        int i4;
        ArrayList<Boolean> arrayList3 = arrayList2;
        boolean z = arrayList.get(i).setAnimationFromJson;
        ArrayList<setDropDownBackgroundResource> arrayList4 = this.setViewTranslationCallback;
        if (arrayList4 == null) {
            this.setViewTranslationCallback = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        this.setViewTranslationCallback.addAll(this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1());
        setDropDownBackgroundResource setdropdownbackgroundresource = this.setTextAppearanceResource;
        int i5 = i;
        boolean z2 = false;
        while (true) {
            int i6 = 1;
            if (i5 < i2) {
                setBackgroundTintList setbackgroundtintlist = arrayList.get(i5);
                int i7 = 3;
                if (!arrayList3.get(i5).booleanValue()) {
                    ArrayList<setDropDownBackgroundResource> arrayList5 = this.setViewTranslationCallback;
                    int i8 = 0;
                    while (i8 < setbackgroundtintlist.setCenterIfNoTextEnabled.size()) {
                        finalize.setX setx = setbackgroundtintlist.setCenterIfNoTextEnabled.get(i8);
                        int i9 = setx.setY;
                        if (i9 != i6) {
                            if (i9 != 2) {
                                if (i9 == i7 || i9 == 6) {
                                    arrayList5.remove(setx.setX);
                                    if (setx.setX == setdropdownbackgroundresource) {
                                        setbackgroundtintlist.setCenterIfNoTextEnabled.add(i8, new finalize.setX(9, setx.setX));
                                        i8++;
                                        i3 = 1;
                                        setdropdownbackgroundresource = null;
                                        i8 += i3;
                                        i6 = 1;
                                        i7 = 3;
                                    }
                                } else if (i9 != 7) {
                                    if (i9 == 8) {
                                        setbackgroundtintlist.setCenterIfNoTextEnabled.add(i8, new finalize.setX(9, setdropdownbackgroundresource));
                                        i8++;
                                        setdropdownbackgroundresource = setx.setX;
                                    }
                                }
                                i3 = 1;
                                i8 += i3;
                                i6 = 1;
                                i7 = 3;
                            } else {
                                setDropDownBackgroundResource setdropdownbackgroundresource2 = setx.setX;
                                int i10 = setdropdownbackgroundresource2.setLayoutAnimation;
                                int size = arrayList5.size() - 1;
                                boolean z3 = false;
                                while (size >= 0) {
                                    setDropDownBackgroundResource setdropdownbackgroundresource3 = arrayList5.get(size);
                                    if (setdropdownbackgroundresource3.setLayoutAnimation != i10) {
                                        i4 = i10;
                                    } else if (setdropdownbackgroundresource3 == setdropdownbackgroundresource2) {
                                        i4 = i10;
                                        z3 = true;
                                    } else {
                                        if (setdropdownbackgroundresource3 == setdropdownbackgroundresource) {
                                            i4 = i10;
                                            setbackgroundtintlist.setCenterIfNoTextEnabled.add(i8, new finalize.setX(9, setdropdownbackgroundresource3));
                                            i8++;
                                            setdropdownbackgroundresource = null;
                                        } else {
                                            i4 = i10;
                                        }
                                        finalize.setX setx2 = new finalize.setX(3, setdropdownbackgroundresource3);
                                        setx2.setIconTintList = setx.setIconTintList;
                                        setx2.setOnLongClickListener = setx.setOnLongClickListener;
                                        setx2.MenuHostHelper$$ExternalSyntheticLambda0 = setx.MenuHostHelper$$ExternalSyntheticLambda0;
                                        setx2.setUiOptions = setx.setUiOptions;
                                        setbackgroundtintlist.setCenterIfNoTextEnabled.add(i8, setx2);
                                        arrayList5.remove(setdropdownbackgroundresource3);
                                        i8++;
                                    }
                                    size--;
                                    i10 = i4;
                                }
                                if (z3) {
                                    setbackgroundtintlist.setCenterIfNoTextEnabled.remove(i8);
                                    i8--;
                                    i3 = 1;
                                    i8 += i3;
                                    i6 = 1;
                                    i7 = 3;
                                } else {
                                    i3 = 1;
                                    setx.setY = 1;
                                    arrayList5.add(setdropdownbackgroundresource2);
                                    i8 += i3;
                                    i6 = 1;
                                    i7 = 3;
                                }
                            }
                        }
                        i3 = 1;
                        arrayList5.add(setx.setX);
                        i8 += i3;
                        i6 = 1;
                        i7 = 3;
                    }
                } else {
                    int i11 = 1;
                    ArrayList<setDropDownBackgroundResource> arrayList6 = this.setViewTranslationCallback;
                    int size2 = setbackgroundtintlist.setCenterIfNoTextEnabled.size() - 1;
                    while (size2 >= 0) {
                        finalize.setX setx3 = setbackgroundtintlist.setCenterIfNoTextEnabled.get(size2);
                        int i12 = setx3.setY;
                        if (i12 != i11) {
                            if (i12 != 3) {
                                switch (i12) {
                                    case 8:
                                        setdropdownbackgroundresource = null;
                                        break;
                                    case 9:
                                        setdropdownbackgroundresource = setx3.setX;
                                        break;
                                    case 10:
                                        setx3.MenuHostHelper$$ExternalSyntheticLambda1 = setx3.setLayoutAnimation;
                                        break;
                                }
                                size2--;
                                i11 = 1;
                            }
                            arrayList6.add(setx3.setX);
                            size2--;
                            i11 = 1;
                        }
                        arrayList6.remove(setx3.setX);
                        size2--;
                        i11 = 1;
                    }
                }
                z2 = z2 || setbackgroundtintlist.MenuHostHelper$$ExternalSyntheticLambda1;
                i5++;
                arrayList3 = arrayList2;
            } else {
                this.setViewTranslationCallback.clear();
                if (!z && this.setY > 0) {
                    for (int i13 = i; i13 < i2; i13++) {
                        Iterator<finalize.setX> it = arrayList.get(i13).setCenterIfNoTextEnabled.iterator();
                        while (it.hasNext()) {
                            setDropDownBackgroundResource setdropdownbackgroundresource4 = it.next().setX;
                            if (setdropdownbackgroundresource4 != null && setdropdownbackgroundresource4.ViewPager$SavedState$1 != null) {
                                this.setNavigationOnClickListener.setX(setX(setdropdownbackgroundresource4));
                            }
                        }
                    }
                }
                int i14 = i;
                while (i14 < i2) {
                    setBackgroundTintList setbackgroundtintlist2 = arrayList.get(i14);
                    if (arrayList2.get(i14).booleanValue()) {
                        setbackgroundtintlist2.setY(-1);
                        setbackgroundtintlist2.setX(i14 == i2 + (-1));
                    } else {
                        setbackgroundtintlist2.setY(1);
                        setbackgroundtintlist2.setY();
                    }
                    i14++;
                }
                boolean booleanValue = arrayList2.get(i2 - 1).booleanValue();
                for (int i15 = i; i15 < i2; i15++) {
                    setBackgroundTintList setbackgroundtintlist3 = arrayList.get(i15);
                    if (booleanValue) {
                        for (int size3 = setbackgroundtintlist3.setCenterIfNoTextEnabled.size() - 1; size3 >= 0; size3--) {
                            setDropDownBackgroundResource setdropdownbackgroundresource5 = setbackgroundtintlist3.setCenterIfNoTextEnabled.get(size3).setX;
                            if (setdropdownbackgroundresource5 != null) {
                                setX(setdropdownbackgroundresource5).setNavigationOnClickListener();
                            }
                        }
                    } else {
                        Iterator<finalize.setX> it2 = setbackgroundtintlist3.setCenterIfNoTextEnabled.iterator();
                        while (it2.hasNext()) {
                            setDropDownBackgroundResource setdropdownbackgroundresource6 = it2.next().setX;
                            if (setdropdownbackgroundresource6 != null) {
                                setX(setdropdownbackgroundresource6).setNavigationOnClickListener();
                            }
                        }
                    }
                }
                setY(this.setY, true);
                HashSet<setEdgeEffectColor> hashSet = new HashSet();
                for (int i16 = i; i16 < i2; i16++) {
                    Iterator<finalize.setX> it3 = arrayList.get(i16).setCenterIfNoTextEnabled.iterator();
                    while (it3.hasNext()) {
                        setDropDownBackgroundResource setdropdownbackgroundresource7 = it3.next().setX;
                        if (setdropdownbackgroundresource7 != null && (viewGroup = setdropdownbackgroundresource7.setUnboundedRipple) != null) {
                            setDropDownBackgroundResource setdropdownbackgroundresource8 = this.setGuidelinePercent;
                            if (setdropdownbackgroundresource8 != null) {
                                ParcelImpl parcelImpl = setdropdownbackgroundresource8.ViewPager$SavedState$1;
                                while (true) {
                                    EmojiCompatInitializer emojiCompatInitializer2 = parcelImpl.setLayoutDirection;
                                    setDropDownBackgroundResource setdropdownbackgroundresource9 = parcelImpl.setGuidelinePercent;
                                    if (setdropdownbackgroundresource9 != null) {
                                        parcelImpl = setdropdownbackgroundresource9.ViewPager$SavedState$1;
                                    } else {
                                        emojiCompatInitializer = parcelImpl.setLayoutAnimation;
                                    }
                                }
                            } else {
                                emojiCompatInitializer = this.setLayoutAnimation;
                            }
                            hashSet.add(setEdgeEffectColor.setY(viewGroup, emojiCompatInitializer));
                        }
                    }
                }
                for (setEdgeEffectColor setedgeeffectcolor : hashSet) {
                    setedgeeffectcolor.MenuHostHelper$$ExternalSyntheticLambda1 = booleanValue;
                    setedgeeffectcolor.setX();
                    setedgeeffectcolor.MenuHostHelper$$ExternalSyntheticLambda1();
                }
                for (int i17 = i; i17 < i2; i17++) {
                    setBackgroundTintList setbackgroundtintlist4 = arrayList.get(i17);
                    if (arrayList2.get(i17).booleanValue() && setbackgroundtintlist4.MenuHostHelper$$ExternalSyntheticLambda0 >= 0) {
                        setbackgroundtintlist4.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
                    }
                    ArrayList<Runnable> arrayList7 = setbackgroundtintlist4.setUiOptions;
                }
                return;
            }
        }
    }

    private void setMaxEms(setDropDownBackgroundResource setdropdownbackgroundresource) {
        ViewGroup MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(setdropdownbackgroundresource);
        if (MenuHostHelper$$ExternalSyntheticLambda1 == null || setdropdownbackgroundresource.setGuidelinePercent() + setdropdownbackgroundresource.setIconified() + setdropdownbackgroundresource.setFilterTouchesWhenObscured() + setdropdownbackgroundresource.setViewTranslationCallback() <= 0) {
            return;
        }
        if (MenuHostHelper$$ExternalSyntheticLambda1.getTag(R.id.res_0x7f0a021b) == null) {
            MenuHostHelper$$ExternalSyntheticLambda1.setTag(R.id.res_0x7f0a021b, setdropdownbackgroundresource);
        }
        ((setDropDownBackgroundResource) MenuHostHelper$$ExternalSyntheticLambda1.getTag(R.id.res_0x7f0a021b)).setUnboundedRipple(setdropdownbackgroundresource.FloatingActionButton$BaseBehavior());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ViewGroup MenuHostHelper$$ExternalSyntheticLambda1(setDropDownBackgroundResource setdropdownbackgroundresource) {
        if (setdropdownbackgroundresource.setUnboundedRipple != null) {
            return setdropdownbackgroundresource.setUnboundedRipple;
        }
        if (setdropdownbackgroundresource.setLayoutAnimation > 0 && this.MenuHostHelper$$ExternalSyntheticLambda1.setY()) {
            View y = this.MenuHostHelper$$ExternalSyntheticLambda1.setY(setdropdownbackgroundresource.setLayoutAnimation);
            if (y instanceof ViewGroup) {
                return (ViewGroup) y;
            }
        }
        return null;
    }

    private void setGuidelinePercent() {
        for (setEdgeEffectColor setedgeeffectcolor : setCheckedIconEnabled()) {
            if (setedgeeffectcolor.setIconTintList) {
                setedgeeffectcolor.setIconTintList = false;
                setedgeeffectcolor.MenuHostHelper$$ExternalSyntheticLambda1();
            }
        }
    }

    private void setTextAppearanceResource() {
        for (setEdgeEffectColor setedgeeffectcolor : setCheckedIconEnabled()) {
            setedgeeffectcolor.setY();
        }
    }

    private Set<setEdgeEffectColor> setCheckedIconEnabled() {
        EmojiCompatInitializer emojiCompatInitializer;
        HashSet hashSet = new HashSet();
        for (setOverscrollHeader setoverscrollheader : this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0()) {
            ViewGroup viewGroup = setoverscrollheader.setIconTintList.setUnboundedRipple;
            if (viewGroup != null) {
                setDropDownBackgroundResource setdropdownbackgroundresource = this.setGuidelinePercent;
                if (setdropdownbackgroundresource != null) {
                    ParcelImpl parcelImpl = setdropdownbackgroundresource.ViewPager$SavedState$1;
                    while (true) {
                        EmojiCompatInitializer emojiCompatInitializer2 = parcelImpl.setLayoutDirection;
                        setDropDownBackgroundResource setdropdownbackgroundresource2 = parcelImpl.setGuidelinePercent;
                        if (setdropdownbackgroundresource2 == null) {
                            break;
                        }
                        parcelImpl = setdropdownbackgroundresource2.ViewPager$SavedState$1;
                    }
                    emojiCompatInitializer = parcelImpl.setLayoutAnimation;
                } else {
                    emojiCompatInitializer = this.setLayoutAnimation;
                }
                hashSet.add(setEdgeEffectColor.setY(viewGroup, emojiCompatInitializer));
            }
        }
        return hashSet;
    }

    private boolean setX(ArrayList<setBackgroundTintList> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.FragmentStateAdapter$5) {
            if (this.FragmentStateAdapter$5.isEmpty()) {
                return false;
            }
            int size = this.FragmentStateAdapter$5.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.FragmentStateAdapter$5.get(i).MenuHostHelper$$ExternalSyntheticLambda0(arrayList, arrayList2);
            }
            this.FragmentStateAdapter$5.clear();
            this.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda0.removeCallbacks(this.setChipIconTintResource);
            return z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean setX(ArrayList<setBackgroundTintList> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<setBackgroundTintList> arrayList3 = this.setIconTintList;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.setIconTintList.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    setBackgroundTintList setbackgroundtintlist = this.setIconTintList.get(size2);
                    if ((str != null && str.equals(setbackgroundtintlist.setTextAlignment)) || (i >= 0 && i == setbackgroundtintlist.MenuHostHelper$$ExternalSyntheticLambda0)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        setBackgroundTintList setbackgroundtintlist2 = this.setIconTintList.get(size2);
                        if (str == null || !str.equals(setbackgroundtintlist2.setTextAlignment)) {
                            if (i < 0 || i != setbackgroundtintlist2.MenuHostHelper$$ExternalSyntheticLambda0) {
                                break;
                            }
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.setIconTintList.size() - 1) {
                return false;
            }
            for (int size3 = this.setIconTintList.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.setIconTintList.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Parcelable setTextScaleX() {
        int size;
        setGuidelinePercent();
        setTextAppearanceResource();
        MenuHostHelper$$ExternalSyntheticLambda0(true);
        this.setCheckedIconEnabled = true;
        this.setMaxEms.setY = true;
        ArrayList<setCollapsedTitleGravity> x = this.setNavigationOnClickListener.setX();
        setElevation[] setelevationArr = null;
        if (!x.isEmpty()) {
            ArrayList<String> navigationOnClickListener = this.setNavigationOnClickListener.setNavigationOnClickListener();
            ArrayList<setBackgroundTintList> arrayList = this.setIconTintList;
            if (arrayList != null && (size = arrayList.size()) > 0) {
                setelevationArr = new setElevation[size];
                for (int i = 0; i < size; i++) {
                    setelevationArr[i] = new setElevation(this.setIconTintList.get(i));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb = new StringBuilder("saveAllState: adding back stack #");
                        sb.append(i);
                        sb.append(": ");
                        sb.append(this.setIconTintList.get(i));
                        Log.v("FragmentManager", sb.toString());
                    }
                }
            }
            setFilters setfilters = new setFilters();
            setfilters.setIconTintList = x;
            setfilters.MenuHostHelper$$ExternalSyntheticLambda1 = navigationOnClickListener;
            setfilters.setY = setelevationArr;
            setfilters.setX = this.MenuHostHelper$$ExternalSyntheticLambda0.get();
            setDropDownBackgroundResource setdropdownbackgroundresource = this.setTextAppearanceResource;
            if (setdropdownbackgroundresource != null) {
                setfilters.setUnboundedRipple = setdropdownbackgroundresource.setShrinkMotionSpec;
            }
            setfilters.setOnLongClickListener.addAll(this.setMinAndMaxProgress.keySet());
            setfilters.setNavigationOnClickListener.addAll(this.setMinAndMaxProgress.values());
            setfilters.MenuHostHelper$$ExternalSyntheticLambda0 = new ArrayList<>(this.setIconSize);
            return setfilters;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList(Parcelable parcelable) {
        int i;
        setForegroundTintMode setforegroundtintmode;
        setOverscrollHeader setoverscrollheader;
        if (parcelable == null) {
            return;
        }
        setFilters setfilters = (setFilters) parcelable;
        if (setfilters.setIconTintList == null) {
            return;
        }
        this.setNavigationOnClickListener.setX.clear();
        Iterator<setCollapsedTitleGravity> it = setfilters.setIconTintList.iterator();
        while (it.hasNext()) {
            setCollapsedTitleGravity next = it.next();
            if (next != null) {
                setDropDownBackgroundResource setdropdownbackgroundresource = this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda1.get(next.setCenterIfNoTextEnabled);
                if (setdropdownbackgroundresource == null) {
                    setCornerRadiusResource setcornerradiusresource = this.setZ;
                    setTextCursorDrawable settextcursordrawable = this.setNavigationOnClickListener;
                    ClassLoader classLoader = this.setCenterIfNoTextEnabled.setY.getClassLoader();
                    setDropDownBackgroundResource setdropdownbackgroundresource2 = this.setGuidelinePercent;
                    if (setdropdownbackgroundresource2 != null) {
                        setforegroundtintmode = setdropdownbackgroundresource2.ViewPager$SavedState$1.setChipCornerRadius();
                    } else {
                        setforegroundtintmode = this.setTextAlignment;
                    }
                    setoverscrollheader = new setOverscrollHeader(setcornerradiusresource, settextcursordrawable, classLoader, setforegroundtintmode, next);
                } else {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb = new StringBuilder("restoreSaveState: re-attaching retained ");
                        sb.append(setdropdownbackgroundresource);
                        Log.v("FragmentManager", sb.toString());
                    }
                    setoverscrollheader = new setOverscrollHeader(this.setZ, this.setNavigationOnClickListener, setdropdownbackgroundresource, next);
                }
                setDropDownBackgroundResource setdropdownbackgroundresource3 = setoverscrollheader.setIconTintList;
                setdropdownbackgroundresource3.ViewPager$SavedState$1 = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder sb2 = new StringBuilder("restoreSaveState: active (");
                    sb2.append(setdropdownbackgroundresource3.setShrinkMotionSpec);
                    sb2.append("): ");
                    sb2.append(setdropdownbackgroundresource3);
                    Log.v("FragmentManager", sb2.toString());
                }
                setoverscrollheader.MenuHostHelper$$ExternalSyntheticLambda0(this.setCenterIfNoTextEnabled.setY.getClassLoader());
                this.setNavigationOnClickListener.setX(setoverscrollheader);
                setoverscrollheader.setX = this.setY;
            }
        }
        Iterator it2 = new ArrayList(this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda1.values()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            setDropDownBackgroundResource setdropdownbackgroundresource4 = (setDropDownBackgroundResource) it2.next();
            if ((this.setNavigationOnClickListener.setX.get(setdropdownbackgroundresource4.setShrinkMotionSpec) != null ? 1 : 0) == 0) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder sb3 = new StringBuilder("Discarding retained Fragment ");
                    sb3.append(setdropdownbackgroundresource4);
                    sb3.append(" that was not found in the set of active Fragments ");
                    sb3.append(setfilters.setIconTintList);
                    Log.v("FragmentManager", sb3.toString());
                }
                this.setMaxEms.setIconTintList(setdropdownbackgroundresource4);
                setdropdownbackgroundresource4.ViewPager$SavedState$1 = this;
                setOverscrollHeader setoverscrollheader2 = new setOverscrollHeader(this.setZ, this.setNavigationOnClickListener, setdropdownbackgroundresource4);
                setoverscrollheader2.setX = 1;
                setoverscrollheader2.setNavigationOnClickListener();
                setdropdownbackgroundresource4.ExtendableSavedState$1 = true;
                setoverscrollheader2.setNavigationOnClickListener();
            }
        }
        this.setNavigationOnClickListener.setX(setfilters.MenuHostHelper$$ExternalSyntheticLambda1);
        if (setfilters.setY != null) {
            this.setIconTintList = new ArrayList<>(setfilters.setY.length);
            for (int i2 = 0; i2 < setfilters.setY.length; i2++) {
                setBackgroundTintList iconTintList = setfilters.setY[i2].setIconTintList(this);
                if (Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder sb4 = new StringBuilder("restoreAllState: back stack #");
                    sb4.append(i2);
                    sb4.append(" (index ");
                    sb4.append(iconTintList.MenuHostHelper$$ExternalSyntheticLambda0);
                    sb4.append("): ");
                    sb4.append(iconTintList);
                    Log.v("FragmentManager", sb4.toString());
                    PrintWriter printWriter = new PrintWriter(new setPlaceholderTextAppearance("FragmentManager"));
                    iconTintList.MenuHostHelper$$ExternalSyntheticLambda0("  ", printWriter, false);
                    printWriter.close();
                }
                this.setIconTintList.add(iconTintList);
            }
        } else {
            this.setIconTintList = null;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0.set(setfilters.setX);
        if (setfilters.setUnboundedRipple != null) {
            setOverscrollHeader setoverscrollheader3 = this.setNavigationOnClickListener.setX.get(setfilters.setUnboundedRipple);
            setDropDownBackgroundResource setdropdownbackgroundresource5 = setoverscrollheader3 != null ? setoverscrollheader3.setIconTintList : null;
            this.setTextAppearanceResource = setdropdownbackgroundresource5;
            setChipCornerRadius(setdropdownbackgroundresource5);
        }
        ArrayList<String> arrayList = setfilters.setOnLongClickListener;
        if (arrayList != null) {
            while (i < arrayList.size()) {
                Bundle bundle = setfilters.setNavigationOnClickListener.get(i);
                bundle.setClassLoader(this.setCenterIfNoTextEnabled.setY.getClassLoader());
                this.setMinAndMaxProgress.put(arrayList.get(i), bundle);
                i++;
            }
        }
        this.setIconSize = new ArrayDeque<>(setfilters.MenuHostHelper$$ExternalSyntheticLambda0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(setInlineLabel<?> setinlinelabel, getInsets getinsets, final setDropDownBackgroundResource setdropdownbackgroundresource) {
        String str;
        if (this.setCenterIfNoTextEnabled != null) {
            throw new IllegalStateException("Already attached");
        }
        this.setCenterIfNoTextEnabled = setinlinelabel;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = getinsets;
        this.setGuidelinePercent = setdropdownbackgroundresource;
        if (setdropdownbackgroundresource == null) {
            if (setinlinelabel instanceof setHintAnimationEnabled) {
                this.setContentScrimResource.add((setHintAnimationEnabled) setinlinelabel);
            }
        } else {
            this.setContentScrimResource.add(new setHintAnimationEnabled() { // from class: o.ParcelImpl.10
                @Override // o.setHintAnimationEnabled
                public final void setX(setDropDownBackgroundResource setdropdownbackgroundresource2) {
                    setdropdownbackgroundresource.MenuHostHelper$$ExternalSyntheticLambda0(setdropdownbackgroundresource2);
                }
            });
        }
        if (this.setGuidelinePercent != null) {
            setChipIconTintResource();
        }
        if (setinlinelabel instanceof setNavigationOnClickListener) {
            setNavigationOnClickListener setnavigationonclicklistener = (setNavigationOnClickListener) setinlinelabel;
            OnBackPressedDispatcher x = setnavigationonclicklistener.setX();
            this.setTextScaleX = x;
            setTouchDelegate settouchdelegate = setnavigationonclicklistener;
            if (setdropdownbackgroundresource != null) {
                settouchdelegate = setdropdownbackgroundresource;
            }
            x.setX(settouchdelegate, this.setAnimationFromJson);
        }
        boolean z = false;
        if (setdropdownbackgroundresource != null) {
            this.setMaxEms = setdropdownbackgroundresource.ViewPager$SavedState$1.setAnimationFromJson(setdropdownbackgroundresource);
        } else if (setinlinelabel instanceof setPictureListener) {
            this.setMaxEms = setPopupCallback.setX(((setPictureListener) setinlinelabel).setUnboundedRipple());
        } else {
            this.setMaxEms = new setPopupCallback(false);
        }
        this.setMaxEms.setY = (this.setCheckedIconEnabled || this.SearchView$SavedState$1) ? true : true;
        this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0 = this.setMaxEms;
        setInlineLabel<?> setinlinelabel2 = this.setCenterIfNoTextEnabled;
        if (setinlinelabel2 instanceof setTextScaleX) {
            setCenterIfNoTextEnabled MenuHostHelper$$ExternalSyntheticLambda0 = ((setTextScaleX) setinlinelabel2).MenuHostHelper$$ExternalSyntheticLambda0();
            if (setdropdownbackgroundresource != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(setdropdownbackgroundresource.setShrinkMotionSpec);
                sb.append(":");
                str = sb.toString();
            } else {
                str = "";
            }
            StringBuilder sb2 = new StringBuilder("FragmentManager:");
            sb2.append(str);
            String obj = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append("StartActivityForResult");
            this.setSuffixText = MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(sb3.toString(), new setOnNavigationItemSelectedListener.setY(), new setChipCornerRadius<ViewPager$SavedState$1>() { // from class: o.ParcelImpl.7
                @Override // o.setChipCornerRadius
                public final /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(ViewPager$SavedState$1 viewPager$SavedState$1) {
                    ViewPager$SavedState$1 viewPager$SavedState$12 = viewPager$SavedState$1;
                    setIconTintList pollFirst = ParcelImpl.this.setIconSize.pollFirst();
                    if (pollFirst == null) {
                        StringBuilder sb4 = new StringBuilder("No Activities were started for result for ");
                        sb4.append(this);
                        Log.w("FragmentManager", sb4.toString());
                        return;
                    }
                    String str2 = pollFirst.MenuHostHelper$$ExternalSyntheticLambda1;
                    int i = pollFirst.setY;
                    setDropDownBackgroundResource iconTintList = ParcelImpl.this.setNavigationOnClickListener.setIconTintList(str2);
                    if (iconTintList == null) {
                        StringBuilder sb5 = new StringBuilder("Activity result delivered for unknown Fragment ");
                        sb5.append(str2);
                        Log.w("FragmentManager", sb5.toString());
                        return;
                    }
                    iconTintList.setIconTintList(i, viewPager$SavedState$12.MenuHostHelper$$ExternalSyntheticLambda1, viewPager$SavedState$12.MenuHostHelper$$ExternalSyntheticLambda0);
                }
            });
            StringBuilder sb4 = new StringBuilder();
            sb4.append(obj);
            sb4.append("StartIntentSenderForResult");
            this.setFilterTouchesWhenObscured = MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(sb4.toString(), new setX(), new setChipCornerRadius<ViewPager$SavedState$1>() { // from class: o.ParcelImpl.4
                @Override // o.setChipCornerRadius
                public final /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(ViewPager$SavedState$1 viewPager$SavedState$1) {
                    ViewPager$SavedState$1 viewPager$SavedState$12 = viewPager$SavedState$1;
                    setIconTintList pollFirst = ParcelImpl.this.setIconSize.pollFirst();
                    if (pollFirst == null) {
                        StringBuilder sb5 = new StringBuilder("No IntentSenders were started for ");
                        sb5.append(this);
                        Log.w("FragmentManager", sb5.toString());
                        return;
                    }
                    String str2 = pollFirst.MenuHostHelper$$ExternalSyntheticLambda1;
                    int i = pollFirst.setY;
                    setDropDownBackgroundResource iconTintList = ParcelImpl.this.setNavigationOnClickListener.setIconTintList(str2);
                    if (iconTintList == null) {
                        StringBuilder sb6 = new StringBuilder("Intent Sender result delivered for unknown Fragment ");
                        sb6.append(str2);
                        Log.w("FragmentManager", sb6.toString());
                        return;
                    }
                    iconTintList.setIconTintList(i, viewPager$SavedState$12.MenuHostHelper$$ExternalSyntheticLambda1, viewPager$SavedState$12.MenuHostHelper$$ExternalSyntheticLambda0);
                }
            });
            StringBuilder sb5 = new StringBuilder();
            sb5.append(obj);
            sb5.append("RequestPermissions");
            this.setObjectValues = MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(sb5.toString(), new setZ<String[], Map<String, Boolean>>() { // from class: o.setOnNavigationItemSelectedListener$MenuHostHelper$$ExternalSyntheticLambda0
                static {
                    new setIconTintList((byte) 0);
                }

                /* loaded from: classes.dex */
                public static final class setIconTintList {
                    public /* synthetic */ setIconTintList(byte b) {
                        this();
                    }

                    private setIconTintList() {
                    }
                }

                @Override // o.setZ
                public final /* synthetic */ Map<String, Boolean> MenuHostHelper$$ExternalSyntheticLambda1(int i, Intent intent) {
                    if (i == -1 && intent != null) {
                        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                        if (intArrayExtra != null && stringArrayExtra != null) {
                            ArrayList arrayList = new ArrayList(intArrayExtra.length);
                            for (int i2 : intArrayExtra) {
                                arrayList.add(Boolean.valueOf(i2 == 0));
                            }
                            pN.setY(stringArrayExtra, "");
                            return C0362ow.setIconTintList(C0348oi.MenuHostHelper$$ExternalSyntheticLambda0((List) C0342oc.setIconTintList(stringArrayExtra, new ArrayList()), arrayList));
                        }
                    }
                    C0361ov c0361ov = C0361ov.MenuHostHelper$$ExternalSyntheticLambda1;
                    pN.setX(c0361ov);
                    return c0361ov;
                }
            }, new setChipCornerRadius<Map<String, Boolean>>() { // from class: o.ParcelImpl.5
                @Override // o.setChipCornerRadius
                public final /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(Map<String, Boolean> map) {
                    Map<String, Boolean> map2 = map;
                    String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
                    ArrayList arrayList = new ArrayList(map2.values());
                    int[] iArr = new int[arrayList.size()];
                    for (int i = 0; i < arrayList.size(); i++) {
                        iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                    }
                    setIconTintList pollFirst = ParcelImpl.this.setIconSize.pollFirst();
                    if (pollFirst == null) {
                        StringBuilder sb6 = new StringBuilder("No permissions were requested for ");
                        sb6.append(this);
                        Log.w("FragmentManager", sb6.toString());
                        return;
                    }
                    String str2 = pollFirst.MenuHostHelper$$ExternalSyntheticLambda1;
                    int i2 = pollFirst.setY;
                    setDropDownBackgroundResource iconTintList = ParcelImpl.this.setNavigationOnClickListener.setIconTintList(str2);
                    if (iconTintList == null) {
                        StringBuilder sb7 = new StringBuilder("Permission request result delivered for unknown Fragment ");
                        sb7.append(str2);
                        Log.w("FragmentManager", sb7.toString());
                        return;
                    }
                    iconTintList.MenuHostHelper$$ExternalSyntheticLambda1(i2, strArr, iArr);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setMaxEms() {
        if (this.setCenterIfNoTextEnabled == null) {
            return;
        }
        this.setCheckedIconEnabled = false;
        this.SearchView$SavedState$1 = false;
        this.setMaxEms.setY = false;
        for (setDropDownBackgroundResource setdropdownbackgroundresource : this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1()) {
            if (setdropdownbackgroundresource != null) {
                setdropdownbackgroundresource.setHint();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList() {
        this.setCheckedIconEnabled = false;
        this.SearchView$SavedState$1 = false;
        this.setMaxEms.setY = false;
        setX(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX() {
        this.setCheckedIconEnabled = false;
        this.SearchView$SavedState$1 = false;
        this.setMaxEms.setY = false;
        setX(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setCenterIfNoTextEnabled() {
        setX(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        this.setCheckedIconEnabled = false;
        this.SearchView$SavedState$1 = false;
        this.setMaxEms.setY = false;
        setX(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconSize() {
        this.setCheckedIconEnabled = false;
        this.SearchView$SavedState$1 = false;
        this.setMaxEms.setY = false;
        setX(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setUnboundedRipple() {
        this.setCheckedIconEnabled = false;
        this.SearchView$SavedState$1 = false;
        this.setMaxEms.setY = false;
        setX(7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setLayoutAnimation() {
        setX(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setTextAlignment() {
        this.SearchView$SavedState$1 = true;
        this.setMaxEms.setY = true;
        setX(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setNavigationOnClickListener() {
        setX(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        this.setUiOptions = true;
        MenuHostHelper$$ExternalSyntheticLambda0(true);
        setTextAppearanceResource();
        setX(-1);
        this.setCenterIfNoTextEnabled = null;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        this.setGuidelinePercent = null;
        if (this.setTextScaleX != null) {
            this.setAnimationFromJson.MenuHostHelper$$ExternalSyntheticLambda0();
            this.setTextScaleX = null;
        }
        setIconSize<Intent> seticonsize = this.setSuffixText;
        if (seticonsize != null) {
            seticonsize.MenuHostHelper$$ExternalSyntheticLambda1();
            this.setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda1();
            this.setObjectValues.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(int i) {
        try {
            this.setConstraintSet = true;
            for (setOverscrollHeader setoverscrollheader : this.setNavigationOnClickListener.setX.values()) {
                if (setoverscrollheader != null) {
                    setoverscrollheader.setX = i;
                }
            }
            setY(i, false);
            for (setEdgeEffectColor setedgeeffectcolor : setCheckedIconEnabled()) {
                setedgeeffectcolor.setY();
            }
            this.setConstraintSet = false;
            MenuHostHelper$$ExternalSyntheticLambda0(true);
        } catch (Throwable th) {
            this.setConstraintSet = false;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        for (setDropDownBackgroundResource setdropdownbackgroundresource : this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1()) {
            if (setdropdownbackgroundresource != null) {
                setdropdownbackgroundresource.setLayoutAnimation(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList(boolean z) {
        for (setDropDownBackgroundResource setdropdownbackgroundresource : this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1()) {
            if (setdropdownbackgroundresource != null) {
                setdropdownbackgroundresource.setNavigationOnClickListener(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(Configuration configuration) {
        for (setDropDownBackgroundResource setdropdownbackgroundresource : this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1()) {
            if (setdropdownbackgroundresource != null) {
                setdropdownbackgroundresource.MenuHostHelper$$ExternalSyntheticLambda1(configuration);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setOnLongClickListener() {
        for (setDropDownBackgroundResource setdropdownbackgroundresource : this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1()) {
            if (setdropdownbackgroundresource != null) {
                setdropdownbackgroundresource.ActionMenuPresenter$SavedState$1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(Menu menu, MenuInflater menuInflater) {
        if (this.setY <= 0) {
            return false;
        }
        Iterator<setDropDownBackgroundResource> it = this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1().iterator();
        ArrayList<setDropDownBackgroundResource> arrayList = null;
        boolean z = false;
        while (it.hasNext()) {
            setDropDownBackgroundResource next = it.next();
            if (next != null) {
                if ((next == null ? true : next.setTooltipText()) && next.setIconTintList(menu, menuInflater)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(next);
                    z = true;
                }
            }
        }
        if (this.setIconified != null) {
            for (int i = 0; i < this.setIconified.size(); i++) {
                setDropDownBackgroundResource setdropdownbackgroundresource = this.setIconified.get(i);
                if (arrayList == null || !arrayList.contains(setdropdownbackgroundresource)) {
                    setdropdownbackgroundresource.createDispatcher();
                }
            }
        }
        this.setIconified = arrayList;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean setX(Menu menu) {
        boolean z = false;
        if (this.setY <= 0) {
            return false;
        }
        Iterator<setDropDownBackgroundResource> it = this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1().iterator();
        while (it.hasNext()) {
            setDropDownBackgroundResource next = it.next();
            if (next != null) {
                if ((next == null ? true : next.setTooltipText()) && next.MenuHostHelper$$ExternalSyntheticLambda1(menu)) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(MenuItem menuItem) {
        if (this.setY <= 0) {
            return false;
        }
        for (setDropDownBackgroundResource setdropdownbackgroundresource : this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1()) {
            if (setdropdownbackgroundresource != null && setdropdownbackgroundresource.MenuHostHelper$$ExternalSyntheticLambda0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean setY(MenuItem menuItem) {
        if (this.setY <= 0) {
            return false;
        }
        for (setDropDownBackgroundResource setdropdownbackgroundresource : this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1()) {
            if (setdropdownbackgroundresource != null && setdropdownbackgroundresource.setIconTintList(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(Menu menu) {
        if (this.setY <= 0) {
            return;
        }
        for (setDropDownBackgroundResource setdropdownbackgroundresource : this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1()) {
            if (setdropdownbackgroundresource != null) {
                setdropdownbackgroundresource.setX(menu);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ViewPager$SavedState$1(setDropDownBackgroundResource setdropdownbackgroundresource) {
        if (setdropdownbackgroundresource != null) {
            setOverscrollHeader setoverscrollheader = this.setNavigationOnClickListener.setX.get(setdropdownbackgroundresource.setShrinkMotionSpec);
            if (!setdropdownbackgroundresource.equals(setoverscrollheader != null ? setoverscrollheader.setIconTintList : null) || (setdropdownbackgroundresource.setOnNavigationItemSelectedListener != null && setdropdownbackgroundresource.ViewPager$SavedState$1 != this)) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(setdropdownbackgroundresource);
                sb.append(" is not an active fragment of FragmentManager ");
                sb.append(this);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        setDropDownBackgroundResource setdropdownbackgroundresource2 = this.setTextAppearanceResource;
        this.setTextAppearanceResource = setdropdownbackgroundresource;
        setChipCornerRadius(setdropdownbackgroundresource2);
        setChipCornerRadius(this.setTextAppearanceResource);
    }

    private void setChipCornerRadius(setDropDownBackgroundResource setdropdownbackgroundresource) {
        if (setdropdownbackgroundresource != null) {
            setOverscrollHeader setoverscrollheader = this.setNavigationOnClickListener.setX.get(setdropdownbackgroundresource.setShrinkMotionSpec);
            if (setdropdownbackgroundresource.equals(setoverscrollheader != null ? setoverscrollheader.setIconTintList : null)) {
                setdropdownbackgroundresource.setChipSpacingHorizontal();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setUiOptions() {
        setChipIconTintResource();
        setChipCornerRadius(this.setTextAppearanceResource);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(setDropDownBackgroundResource setdropdownbackgroundresource, registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda1) {
        setOverscrollHeader setoverscrollheader = this.setNavigationOnClickListener.setX.get(setdropdownbackgroundresource.setShrinkMotionSpec);
        if (!setdropdownbackgroundresource.equals(setoverscrollheader != null ? setoverscrollheader.setIconTintList : null) || (setdropdownbackgroundresource.setOnNavigationItemSelectedListener != null && setdropdownbackgroundresource.ViewPager$SavedState$1 != this)) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(setdropdownbackgroundresource);
            sb.append(" is not an active fragment of FragmentManager ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        }
        setdropdownbackgroundresource.setGuidelinePercent = registerin_menuhosthelper__externalsyntheticlambda1;
    }

    public final setForegroundTintMode setChipCornerRadius() {
        ParcelImpl parcelImpl = this;
        while (true) {
            setForegroundTintMode setforegroundtintmode = parcelImpl.setUnboundedRipple;
            setDropDownBackgroundResource setdropdownbackgroundresource = parcelImpl.setGuidelinePercent;
            if (setdropdownbackgroundresource != null) {
                parcelImpl = setdropdownbackgroundresource.ViewPager$SavedState$1;
            } else {
                return parcelImpl.setTextAlignment;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
        r0.setX.remove(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setY(o.ParcelImpl$MenuHostHelper$$ExternalSyntheticLambda0 r6) {
        /*
            r5 = this;
            o.setCornerRadiusResource r0 = r5.setZ
            java.util.concurrent.CopyOnWriteArrayList<o.setCornerRadiusResource$setY> r1 = r0.setX
            monitor-enter(r1)
            java.util.concurrent.CopyOnWriteArrayList<o.setCornerRadiusResource$setY> r2 = r0.setX     // Catch: java.lang.Throwable -> L25
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L25
            r3 = 0
        Lc:
            if (r3 >= r2) goto L23
            java.util.concurrent.CopyOnWriteArrayList<o.setCornerRadiusResource$setY> r4 = r0.setX     // Catch: java.lang.Throwable -> L25
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L25
            o.setCornerRadiusResource$setY r4 = (o.setCornerRadiusResource.setY) r4     // Catch: java.lang.Throwable -> L25
            o.ParcelImpl$MenuHostHelper$$ExternalSyntheticLambda0 r4 = r4.setX     // Catch: java.lang.Throwable -> L25
            if (r4 != r6) goto L20
            java.util.concurrent.CopyOnWriteArrayList<o.setCornerRadiusResource$setY> r6 = r0.setX     // Catch: java.lang.Throwable -> L25
            r6.remove(r3)     // Catch: java.lang.Throwable -> L25
            goto L23
        L20:
            int r3 = r3 + 1
            goto Lc
        L23:
            monitor-exit(r1)
            return
        L25:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ParcelImpl.setY(o.ParcelImpl$MenuHostHelper$$ExternalSyntheticLambda0):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setOnLongClickListener(setDropDownBackgroundResource setdropdownbackgroundresource) {
        Iterator<setHintAnimationEnabled> it = this.setContentScrimResource.iterator();
        while (it.hasNext()) {
            it.next().setX(setdropdownbackgroundresource);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setIconTintList(setDropDownBackgroundResource setdropdownbackgroundresource) {
        boolean z;
        if (setdropdownbackgroundresource.setTextAlignment && setdropdownbackgroundresource.setTextAppearanceResource) {
            return true;
        }
        Iterator<setDropDownBackgroundResource> it = setdropdownbackgroundresource.setNavigationOnClickListener.setNavigationOnClickListener.setIconTintList().iterator();
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            setDropDownBackgroundResource next = it.next();
            if (next != null) {
                z2 = setIconTintList(next);
                continue;
            }
            if (z2) {
                z = true;
                break;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final LayoutInflater.Factory2 ViewPager$SavedState$1() {
        return this.setChipCornerRadius;
    }

    /* loaded from: classes.dex */
    public static class setIconTintList implements Parcelable {
        public static final Parcelable.Creator<setIconTintList> CREATOR = new Parcelable.Creator<setIconTintList>() { // from class: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ParcelImpl.setIconTintList createFromParcel(Parcel parcel) {
                return new ParcelImpl.setIconTintList(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ ParcelImpl.setIconTintList[] newArray(int i) {
                return new ParcelImpl.setIconTintList[i];
            }
        };
        String MenuHostHelper$$ExternalSyntheticLambda1;
        int setY;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public setIconTintList(Parcel parcel) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = parcel.readString();
            this.setY = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.MenuHostHelper$$ExternalSyntheticLambda1);
            parcel.writeInt(this.setY);
        }
    }

    /* loaded from: classes.dex */
    static class setX extends setZ<Object, ViewPager$SavedState$1> {
        setX() {
        }

        @Override // o.setZ
        public final /* synthetic */ ViewPager$SavedState$1 MenuHostHelper$$ExternalSyntheticLambda1(int i, Intent intent) {
            return new ViewPager$SavedState$1(i, intent);
        }
    }

    private void setMinAndMaxProgress() {
        if (this.setCheckedIconEnabled || this.SearchView$SavedState$1) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setOverscrollHeader setY(setDropDownBackgroundResource setdropdownbackgroundresource) {
        if (Log.isLoggable("FragmentManager", 2)) {
            StringBuilder sb = new StringBuilder("add: ");
            sb.append(setdropdownbackgroundresource);
            Log.v("FragmentManager", sb.toString());
        }
        setOverscrollHeader x = setX(setdropdownbackgroundresource);
        setdropdownbackgroundresource.ViewPager$SavedState$1 = this;
        this.setNavigationOnClickListener.setX(x);
        if (!setdropdownbackgroundresource.setIconSize) {
            this.setNavigationOnClickListener.setX(setdropdownbackgroundresource);
            setdropdownbackgroundresource.ExtendableSavedState$1 = false;
            if (setdropdownbackgroundresource.setImageTintMode == null) {
                setdropdownbackgroundresource.setMaxEms = false;
            }
            if (setIconTintList(setdropdownbackgroundresource)) {
                this.setOnNavigationItemSelectedListener = true;
            }
        }
        return x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(setDropDownBackgroundResource setdropdownbackgroundresource) {
        if (Log.isLoggable("FragmentManager", 2)) {
            StringBuilder sb = new StringBuilder("attach: ");
            sb.append(setdropdownbackgroundresource);
            Log.v("FragmentManager", sb.toString());
        }
        if (setdropdownbackgroundresource.setIconSize) {
            setdropdownbackgroundresource.setIconSize = false;
            if (setdropdownbackgroundresource.setX) {
                return;
            }
            this.setNavigationOnClickListener.setX(setdropdownbackgroundresource);
            if (Log.isLoggable("FragmentManager", 2)) {
                StringBuilder sb2 = new StringBuilder("add from attach: ");
                sb2.append(setdropdownbackgroundresource);
                Log.v("FragmentManager", sb2.toString());
            }
            if (setIconTintList(setdropdownbackgroundresource)) {
                this.setOnNavigationItemSelectedListener = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setLayoutAnimation(setDropDownBackgroundResource setdropdownbackgroundresource) {
        if (Log.isLoggable("FragmentManager", 2)) {
            StringBuilder sb = new StringBuilder("detach: ");
            sb.append(setdropdownbackgroundresource);
            Log.v("FragmentManager", sb.toString());
        }
        if (setdropdownbackgroundresource.setIconSize) {
            return;
        }
        setdropdownbackgroundresource.setIconSize = true;
        if (setdropdownbackgroundresource.setX) {
            if (Log.isLoggable("FragmentManager", 2)) {
                StringBuilder sb2 = new StringBuilder("remove from detach: ");
                sb2.append(setdropdownbackgroundresource);
                Log.v("FragmentManager", sb2.toString());
            }
            setTextCursorDrawable settextcursordrawable = this.setNavigationOnClickListener;
            synchronized (settextcursordrawable.MenuHostHelper$$ExternalSyntheticLambda1) {
                settextcursordrawable.MenuHostHelper$$ExternalSyntheticLambda1.remove(setdropdownbackgroundresource);
            }
            setdropdownbackgroundresource.setX = false;
            if (setIconTintList(setdropdownbackgroundresource)) {
                this.setOnNavigationItemSelectedListener = true;
            }
            setMaxEms(setdropdownbackgroundresource);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setUiOptions(setDropDownBackgroundResource setdropdownbackgroundresource) {
        if (Log.isLoggable("FragmentManager", 2)) {
            StringBuilder sb = new StringBuilder("hide: ");
            sb.append(setdropdownbackgroundresource);
            Log.v("FragmentManager", sb.toString());
        }
        if (setdropdownbackgroundresource.setTextScaleX) {
            return;
        }
        setdropdownbackgroundresource.setTextScaleX = true;
        setdropdownbackgroundresource.setMaxEms = true ^ setdropdownbackgroundresource.setMaxEms;
        setMaxEms(setdropdownbackgroundresource);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(setOverscrollHeader setoverscrollheader) {
        setDropDownBackgroundResource setdropdownbackgroundresource = setoverscrollheader.setIconTintList;
        if (setdropdownbackgroundresource.setOnLongClickListener) {
            if (this.setConstraintSet) {
                this.FloatingActionButton$BaseBehavior = true;
                return;
            }
            setdropdownbackgroundresource.setOnLongClickListener = false;
            setoverscrollheader.setNavigationOnClickListener();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconSize(setDropDownBackgroundResource setdropdownbackgroundresource) {
        if (Log.isLoggable("FragmentManager", 2)) {
            StringBuilder sb = new StringBuilder("remove: ");
            sb.append(setdropdownbackgroundresource);
            sb.append(" nesting=");
            sb.append(setdropdownbackgroundresource.setY);
            Log.v("FragmentManager", sb.toString());
        }
        boolean filterRedundantCalls = setdropdownbackgroundresource.setFilterRedundantCalls();
        if (!setdropdownbackgroundresource.setIconSize || (!filterRedundantCalls)) {
            setTextCursorDrawable settextcursordrawable = this.setNavigationOnClickListener;
            synchronized (settextcursordrawable.MenuHostHelper$$ExternalSyntheticLambda1) {
                settextcursordrawable.MenuHostHelper$$ExternalSyntheticLambda1.remove(setdropdownbackgroundresource);
            }
            setdropdownbackgroundresource.setX = false;
            if (setIconTintList(setdropdownbackgroundresource)) {
                this.setOnNavigationItemSelectedListener = true;
            }
            setdropdownbackgroundresource.ExtendableSavedState$1 = true;
            setMaxEms(setdropdownbackgroundresource);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setTextAlignment(setDropDownBackgroundResource setdropdownbackgroundresource) {
        if (Log.isLoggable("FragmentManager", 2)) {
            StringBuilder sb = new StringBuilder("show: ");
            sb.append(setdropdownbackgroundresource);
            Log.v("FragmentManager", sb.toString());
        }
        if (setdropdownbackgroundresource.setTextScaleX) {
            setdropdownbackgroundresource.setTextScaleX = false;
            setdropdownbackgroundresource.setMaxEms = !setdropdownbackgroundresource.setMaxEms;
        }
    }
}