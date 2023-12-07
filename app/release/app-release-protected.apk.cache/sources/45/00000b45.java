package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o.registerIn;
import o.setCompoundDrawablePadding;

/* loaded from: classes.dex */
public class setEndIconContentDescription extends MenuHostHelper$$ExternalSyntheticLambda0 {
    boolean setIconTintList;
    boolean setUiOptions;
    private static byte[] setUnboundedRipple = {56, -13, -61, 104, 7, 1, -7, -4, 13, -9, -3, 51, -23, -16, 13, 39, -42, 13, 1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -36, 8, 1, 17, -6};
    public static final int setNavigationOnClickListener = 9;
    final setBoxStrokeWidthFocused setY = new setBoxStrokeWidthFocused(new setEndIconContentDescription$MenuHostHelper$$ExternalSyntheticLambda1(this));
    final setAdjustViewBounds MenuHostHelper$$ExternalSyntheticLambda1 = new setAdjustViewBounds(this);
    boolean setLayoutAnimation = true;

    private static void a(byte b, byte b2, short s, Object[] objArr) {
        int i = s + 105;
        int i2 = 16 - (b2 * 4);
        int i3 = 19 - (b * 15);
        byte[] bArr = setUnboundedRipple;
        byte[] bArr2 = new byte[i2];
        int i4 = -1;
        int i5 = i2 - 1;
        if (bArr == null) {
            i = (i3 - i5) + 2;
            i3++;
            i5 = i5;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            if (i4 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i6 = i5;
            int i7 = i3;
            i = (i - bArr[i3]) + 2;
            i3 = i7 + 1;
            i5 = i6;
        }
    }

    @Override // o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        return super.getApplicationContext();
    }

    @Override // o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.content.ContextWrapper
    public Context getBaseContext() {
        return super.getBaseContext();
    }

    @Override // o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return super.getResources();
    }

    @Deprecated
    public void setX(setDropDownBackgroundResource setdropdownbackgroundresource) {
    }

    public setEndIconContentDescription() {
        ViewPager$SavedState$1();
    }

    private void ViewPager$SavedState$1() {
        setNavigationOnClickListener().setIconTintList("android:support:fragments", new setCompoundDrawablePadding.setX() { // from class: o.setEndIconContentDescription.1
            @Override // o.setCompoundDrawablePadding.setX
            public final Bundle MenuHostHelper$$ExternalSyntheticLambda1() {
                Bundle bundle = new Bundle();
                setEndIconContentDescription.this.setZ();
                setEndIconContentDescription.this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(registerIn.setX.ON_STOP);
                Parcelable textScaleX = setEndIconContentDescription.this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX.setTextScaleX();
                if (textScaleX != null) {
                    bundle.putParcelable("android:support:fragments", textScaleX);
                }
                return bundle;
            }
        });
        MenuHostHelper$$ExternalSyntheticLambda0(new setTextAlignment() { // from class: o.setEndIconContentDescription.5
            @Override // o.setTextAlignment
            public final void MenuHostHelper$$ExternalSyntheticLambda0(Context context) {
                setBoxStrokeWidthFocused setboxstrokewidthfocused = setEndIconContentDescription.this.setY;
                ParcelImpl parcelImpl = setboxstrokewidthfocused.MenuHostHelper$$ExternalSyntheticLambda1.setX;
                setInlineLabel<?> setinlinelabel = setboxstrokewidthfocused.MenuHostHelper$$ExternalSyntheticLambda1;
                parcelImpl.setY(setinlinelabel, setinlinelabel, null);
                Bundle MenuHostHelper$$ExternalSyntheticLambda0 = setEndIconContentDescription.this.setNavigationOnClickListener().MenuHostHelper$$ExternalSyntheticLambda0("android:support:fragments");
                if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                    Parcelable parcelable = MenuHostHelper$$ExternalSyntheticLambda0.getParcelable("android:support:fragments");
                    setInlineLabel<?> setinlinelabel2 = setEndIconContentDescription.this.setY.MenuHostHelper$$ExternalSyntheticLambda1;
                    if (!(setinlinelabel2 instanceof setPictureListener)) {
                        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
                    }
                    setinlinelabel2.setX.setIconTintList(parcelable);
                }
            }
        });
    }

    @Override // o.MenuHostHelper$$ExternalSyntheticLambda0, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX.setMaxEms();
        super.onActivityResult(i, i2, intent);
    }

    @Override // o.MenuHostHelper$$ExternalSyntheticLambda0, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX.MenuHostHelper$$ExternalSyntheticLambda1(z);
    }

    @Override // o.MenuHostHelper$$ExternalSyntheticLambda0, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX.setIconTintList(z);
    }

    @Override // o.MenuHostHelper$$ExternalSyntheticLambda0, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX.setMaxEms();
        super.onConfigurationChanged(configuration);
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX.setX(configuration);
    }

    @Override // o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(registerIn.setX.ON_CREATE);
        ParcelImpl parcelImpl = this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX;
        parcelImpl.setCheckedIconEnabled = false;
        parcelImpl.SearchView$SavedState$1 = false;
        parcelImpl.setMaxEms.setY = false;
        parcelImpl.setX(1);
    }

    @Override // o.MenuHostHelper$$ExternalSyntheticLambda0, android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            setBoxStrokeWidthFocused setboxstrokewidthfocused = this.setY;
            return onCreatePanelMenu | setboxstrokewidthfocused.MenuHostHelper$$ExternalSyntheticLambda1.setX.MenuHostHelper$$ExternalSyntheticLambda0(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(view, str, context, attributeSet);
        return MenuHostHelper$$ExternalSyntheticLambda0 == null ? super.onCreateView(view, str, context, attributeSet) : MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(null, str, context, attributeSet);
        return MenuHostHelper$$ExternalSyntheticLambda0 == null ? super.onCreateView(str, context, attributeSet) : MenuHostHelper$$ExternalSyntheticLambda0;
    }

    final View MenuHostHelper$$ExternalSyntheticLambda0(View view, String str, Context context, AttributeSet attributeSet) {
        return this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX.setChipCornerRadius.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX.MenuHostHelper$$ExternalSyntheticLambda1();
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(registerIn.setX.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX.setOnLongClickListener();
    }

    @Override // o.MenuHostHelper$$ExternalSyntheticLambda0, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            if (i != 6) {
                return false;
            }
            return this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX.setY(menuItem);
        }
        return this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX.MenuHostHelper$$ExternalSyntheticLambda1(menuItem);
    }

    @Override // o.MenuHostHelper$$ExternalSyntheticLambda0, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX.MenuHostHelper$$ExternalSyntheticLambda0(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.app.Activity
    public void onPause() {
        super.onPause();
        this.setUiOptions = false;
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX.setX(5);
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(registerIn.setX.ON_PAUSE);
    }

    @Override // o.MenuHostHelper$$ExternalSyntheticLambda0, android.app.Activity
    public void onNewIntent(Intent intent) {
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX.setMaxEms();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX.setMaxEms();
    }

    @Override // o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.app.Activity
    public void onResume() {
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX.setMaxEms();
        super.onResume();
        this.setUiOptions = true;
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX.MenuHostHelper$$ExternalSyntheticLambda0(true);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        setAnimationFromJson();
    }

    protected void setAnimationFromJson() {
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(registerIn.setX.ON_RESUME);
        ParcelImpl parcelImpl = this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX;
        parcelImpl.setCheckedIconEnabled = false;
        parcelImpl.SearchView$SavedState$1 = false;
        parcelImpl.setMaxEms.setY = false;
        parcelImpl.setX(7);
    }

    @Override // o.MenuHostHelper$$ExternalSyntheticLambda0, android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return super.onPreparePanel(i, view, menu);
        }
        return MenuHostHelper$$ExternalSyntheticLambda1(view, menu) | this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX.setX(menu);
    }

    @Deprecated
    protected boolean MenuHostHelper$$ExternalSyntheticLambda1(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX.setMaxEms();
        super.onStart();
        this.setLayoutAnimation = false;
        if (!this.setIconTintList) {
            this.setIconTintList = true;
            ParcelImpl parcelImpl = this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX;
            parcelImpl.setCheckedIconEnabled = false;
            parcelImpl.SearchView$SavedState$1 = false;
            parcelImpl.setMaxEms.setY = false;
            parcelImpl.setX(4);
        }
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX.MenuHostHelper$$ExternalSyntheticLambda0(true);
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(registerIn.setX.ON_START);
        ParcelImpl parcelImpl2 = this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX;
        parcelImpl2.setCheckedIconEnabled = false;
        parcelImpl2.SearchView$SavedState$1 = false;
        parcelImpl2.setMaxEms.setY = false;
        parcelImpl2.setX(5);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.setLayoutAnimation = true;
        setZ();
        ParcelImpl parcelImpl = this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX;
        parcelImpl.SearchView$SavedState$1 = true;
        parcelImpl.setMaxEms.setY = true;
        parcelImpl.setX(4);
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(registerIn.setX.ON_STOP);
    }

    @Deprecated
    public void setTextScaleX() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        try {
            Object[] objArr = {this};
            byte b = (byte) (setUnboundedRipple[5] - 1);
            Object[] objArr2 = new Object[1];
            a(b, b, setUnboundedRipple[5], objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b2 = setUnboundedRipple[5];
            byte b3 = (byte) (b2 - 1);
            Object[] objArr3 = new Object[1];
            a(b2, b3, b3, objArr3);
            printWriter.print(Integer.toHexString(((Integer) cls.getMethod((String) objArr3[0], Object.class).invoke(null, objArr)).intValue()));
            printWriter.println(" State:");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            String obj = sb.toString();
            printWriter.print(obj);
            printWriter.print("mCreated=");
            printWriter.print(this.setIconTintList);
            printWriter.print(" mResumed=");
            printWriter.print(this.setUiOptions);
            printWriter.print(" mStopped=");
            printWriter.print(this.setLayoutAnimation);
            if (getApplication() != null) {
                new setChildIndicator(this, setUnboundedRipple()).MenuHostHelper$$ExternalSyntheticLambda0(obj, fileDescriptor, printWriter, strArr);
            }
            this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX.setIconTintList(str, fileDescriptor, printWriter, strArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public ParcelImpl setOnNavigationItemSelectedListener() {
        return this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX;
    }

    @Override // o.MenuHostHelper$$ExternalSyntheticLambda0, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setX.setMaxEms();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    void setZ() {
        do {
        } while (setIconTintList(setOnNavigationItemSelectedListener(), registerIn$MenuHostHelper$$ExternalSyntheticLambda1.CREATED));
    }

    private static boolean setIconTintList(ParcelImpl parcelImpl, registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda1) {
        boolean z = false;
        for (setDropDownBackgroundResource setdropdownbackgroundresource : parcelImpl.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1()) {
            if (setdropdownbackgroundresource != null) {
                if (setdropdownbackgroundresource.SearchView$SavedState$1() != null) {
                    z |= setIconTintList(setdropdownbackgroundresource.setMinAndMaxProgress(), registerin_menuhosthelper__externalsyntheticlambda1);
                }
                if (setdropdownbackgroundresource.setSelectedChildViewEnabled != null) {
                    if (setdropdownbackgroundresource.setSelectedChildViewEnabled.MenuHostHelper$$ExternalSyntheticLambda1().MenuHostHelper$$ExternalSyntheticLambda0().compareTo(registerIn$MenuHostHelper$$ExternalSyntheticLambda1.STARTED) >= 0) {
                        setdropdownbackgroundresource.setSelectedChildViewEnabled.setX.MenuHostHelper$$ExternalSyntheticLambda0(registerin_menuhosthelper__externalsyntheticlambda1);
                        z = true;
                    }
                }
                if (setdropdownbackgroundresource.setLayoutDirection.MenuHostHelper$$ExternalSyntheticLambda0().compareTo(registerIn$MenuHostHelper$$ExternalSyntheticLambda1.STARTED) >= 0) {
                    setdropdownbackgroundresource.setLayoutDirection.MenuHostHelper$$ExternalSyntheticLambda0(registerin_menuhosthelper__externalsyntheticlambda1);
                    z = true;
                }
            }
        }
        return z;
    }
}