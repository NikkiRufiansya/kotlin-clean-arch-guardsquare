package o;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import o.MenuHostHelper$$ExternalSyntheticLambda0;
import o.registerIn;
import o.setCompoundDrawablePadding;
import o.setEndIconTintMode;
import o.setPlaceholderTextColor;
import o.setTouchDelegate;

/* loaded from: classes.dex */
public class MenuHostHelper$$ExternalSyntheticLambda0 extends setCollapseContentDescription implements setPictureListener, ComponentActivity$5, setFillViewport, setNavigationOnClickListener, setTextScaleX {
    private final CopyOnWriteArrayList<getGroupName<Integer>> ViewPager$SavedState$1;
    private final CopyOnWriteArrayList<getGroupName<RemoteActionCompat>> setCenterIfNoTextEnabled;
    private final CopyOnWriteArrayList<getGroupName<Intent>> setChipCornerRadius;
    private int setIconTintList;
    private final CopyOnWriteArrayList<getGroupName<setIndeterminateTintMode>> setLayoutAnimation;
    private final CopyOnWriteArrayList<getGroupName<Configuration>> setOnLongClickListener;
    private setTabRippleColorResource setTextAlignment;
    private final OnBackPressedDispatcher setUiOptions;
    private final AtomicInteger setUnboundedRipple;
    final setChildDivider setX;
    private final setCenterIfNoTextEnabled setY;
    public final setUiOptions MenuHostHelper$$ExternalSyntheticLambda0 = new setUiOptions();
    private final FullLifecycleObserverAdapter setNavigationOnClickListener = new FullLifecycleObserverAdapter(new Runnable() { // from class: o.setX
        @Override // java.lang.Runnable
        public final void run() {
            MenuHostHelper$$ExternalSyntheticLambda0.this.setLayoutAnimation();
        }
    });
    private final setAdjustViewBounds MenuHostHelper$$ExternalSyntheticLambda1 = new setAdjustViewBounds(this);

    @Override // o.setCollapseContentDescription, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.setCollapseContentDescription, android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        return super.getApplicationContext();
    }

    @Override // o.setCollapseContentDescription, android.content.ContextWrapper
    public Context getBaseContext() {
        return super.getBaseContext();
    }

    @Override // o.setCollapseContentDescription, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return super.getResources();
    }

    @Override // o.setCollapseContentDescription, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.setCollapseContentDescription, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Deprecated
    public Object setUiOptions() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setY {
        Object MenuHostHelper$$ExternalSyntheticLambda1;
        setTabRippleColorResource setY;

        setY() {
        }
    }

    public MenuHostHelper$$ExternalSyntheticLambda0() {
        pN.setY(this, "");
        setChildDivider setchilddivider = new setChildDivider(this, (byte) 0);
        this.setX = setchilddivider;
        this.setUiOptions = new OnBackPressedDispatcher(new Runnable() { // from class: o.MenuHostHelper$$ExternalSyntheticLambda0.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    MenuHostHelper$$ExternalSyntheticLambda0.super.onBackPressed();
                } catch (IllegalStateException e) {
                    if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                }
            }
        });
        this.setUnboundedRipple = new AtomicInteger();
        this.setY = new setCenterIfNoTextEnabled() { // from class: o.MenuHostHelper$$ExternalSyntheticLambda0.4
        };
        this.setOnLongClickListener = new CopyOnWriteArrayList<>();
        this.ViewPager$SavedState$1 = new CopyOnWriteArrayList<>();
        this.setChipCornerRadius = new CopyOnWriteArrayList<>();
        this.setLayoutAnimation = new CopyOnWriteArrayList<>();
        this.setCenterIfNoTextEnabled = new CopyOnWriteArrayList<>();
        if (MenuHostHelper$$ExternalSyntheticLambda1() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        MenuHostHelper$$ExternalSyntheticLambda1().setY(new setCheckable() { // from class: androidx.activity.ComponentActivity$3
            @Override // o.setCheckable
            public final void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate, registerIn.setX setx) {
                if (setx == registerIn.setX.ON_STOP) {
                    Window window = MenuHostHelper$$ExternalSyntheticLambda0.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList.setIconTintList(peekDecorView);
                    }
                }
            }
        });
        MenuHostHelper$$ExternalSyntheticLambda1().setY(new setCheckable() { // from class: androidx.activity.ComponentActivity$4
            @Override // o.setCheckable
            public final void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate, registerIn.setX setx) {
                if (setx == registerIn.setX.ON_DESTROY) {
                    MenuHostHelper$$ExternalSyntheticLambda0.this.MenuHostHelper$$ExternalSyntheticLambda0.setY();
                    if (MenuHostHelper$$ExternalSyntheticLambda0.this.isChangingConfigurations()) {
                        return;
                    }
                    MenuHostHelper$$ExternalSyntheticLambda0.this.setUnboundedRipple().setX();
                }
            }
        });
        MenuHostHelper$$ExternalSyntheticLambda1().setY(new setCheckable() { // from class: androidx.activity.ComponentActivity$5
            @Override // o.setCheckable
            public final void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate, registerIn.setX setx) {
                MenuHostHelper$$ExternalSyntheticLambda0.this.setIconTintList();
                MenuHostHelper$$ExternalSyntheticLambda0.this.MenuHostHelper$$ExternalSyntheticLambda1().MenuHostHelper$$ExternalSyntheticLambda1(this);
            }
        });
        setchilddivider.setX();
        TimeModel$1.MenuHostHelper$$ExternalSyntheticLambda1(this);
        if (Build.VERSION.SDK_INT <= 23) {
            MenuHostHelper$$ExternalSyntheticLambda1().setY(new androidx.activity.ImmLeaksCleaner(this));
        }
        setNavigationOnClickListener().setIconTintList("android:support:activity-result", new setCompoundDrawablePadding.setX() { // from class: o.setY
            @Override // o.setCompoundDrawablePadding.setX
            public final Bundle MenuHostHelper$$ExternalSyntheticLambda1() {
                return MenuHostHelper$$ExternalSyntheticLambda0.this.setOnLongClickListener();
            }
        });
        MenuHostHelper$$ExternalSyntheticLambda0(new setTextAlignment() { // from class: o.setIconTintList
            @Override // o.setTextAlignment
            public final void MenuHostHelper$$ExternalSyntheticLambda0(Context context) {
                MenuHostHelper$$ExternalSyntheticLambda0.this.MenuHostHelper$$ExternalSyntheticLambda0(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ Bundle setOnLongClickListener() {
        Bundle bundle = new Bundle();
        setCenterIfNoTextEnabled setcenterifnotextenabled = this.setY;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(setcenterifnotextenabled.setIconTintList.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(setcenterifnotextenabled.setIconTintList.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(setcenterifnotextenabled.setX));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) setcenterifnotextenabled.setNavigationOnClickListener.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", setcenterifnotextenabled.setUnboundedRipple);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(Context context) {
        Bundle MenuHostHelper$$ExternalSyntheticLambda0 = setNavigationOnClickListener().MenuHostHelper$$ExternalSyntheticLambda0("android:support:activity-result");
        if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            setCenterIfNoTextEnabled setcenterifnotextenabled = this.setY;
            if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                ArrayList<Integer> integerArrayList = MenuHostHelper$$ExternalSyntheticLambda0.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                ArrayList<String> stringArrayList = MenuHostHelper$$ExternalSyntheticLambda0.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                if (stringArrayList == null || integerArrayList == null) {
                    return;
                }
                setcenterifnotextenabled.setX = MenuHostHelper$$ExternalSyntheticLambda0.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                setcenterifnotextenabled.setUnboundedRipple = (Random) MenuHostHelper$$ExternalSyntheticLambda0.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                setcenterifnotextenabled.setNavigationOnClickListener.putAll(MenuHostHelper$$ExternalSyntheticLambda0.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    if (setcenterifnotextenabled.setIconTintList.containsKey(str)) {
                        Integer remove = setcenterifnotextenabled.setIconTintList.remove(str);
                        if (!setcenterifnotextenabled.setNavigationOnClickListener.containsKey(str)) {
                            setcenterifnotextenabled.setUiOptions.remove(remove);
                        }
                    }
                    setcenterifnotextenabled.setX(integerArrayList.get(i).intValue(), stringArrayList.get(i));
                }
            }
        }
    }

    @Override // o.setCollapseContentDescription, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.setX.MenuHostHelper$$ExternalSyntheticLambda0(bundle);
        this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(this);
        super.onCreate(bundle);
        ComponentRegistrar.setY(this);
        int i = this.setIconTintList;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // o.setCollapseContentDescription, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        registerIn MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1();
        if (MenuHostHelper$$ExternalSyntheticLambda1 instanceof setAdjustViewBounds) {
            ((setAdjustViewBounds) MenuHostHelper$$ExternalSyntheticLambda1).MenuHostHelper$$ExternalSyntheticLambda0(registerIn$MenuHostHelper$$ExternalSyntheticLambda1.CREATED);
        }
        super.onSaveInstanceState(bundle);
        setChildDivider setchilddivider = this.setX;
        pN.setY(bundle, "");
        setchilddivider.setX.MenuHostHelper$$ExternalSyntheticLambda1(bundle);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        setY sety;
        Object uiOptions = setUiOptions();
        setTabRippleColorResource settabripplecolorresource = this.setTextAlignment;
        if (settabripplecolorresource == null && (sety = (setY) getLastNonConfigurationInstance()) != null) {
            settabripplecolorresource = sety.setY;
        }
        if (settabripplecolorresource == null && uiOptions == null) {
            return null;
        }
        setY sety2 = new setY();
        sety2.MenuHostHelper$$ExternalSyntheticLambda1 = uiOptions;
        sety2.setY = settabripplecolorresource;
        return sety2;
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        setChipCornerRadius();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        setChipCornerRadius();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        setChipCornerRadius();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        setChipCornerRadius();
        super.addContentView(view, layoutParams);
    }

    private void setChipCornerRadius() {
        setShadowLayer.setX(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.res_0x7f0a0219, this);
        View decorView = getWindow().getDecorView();
        pN.setY(decorView, "");
        decorView.setTag(R.id.res_0x7f0a0218, this);
        View decorView2 = getWindow().getDecorView();
        pN.setY(decorView2, "");
        pN.setY(this, "");
        decorView2.setTag(R.id.res_0x7f0a0217, this);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(setTextAlignment settextalignment) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(settextalignment);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            Iterator<setMenuAlignmentMode> it = this.setNavigationOnClickListener.setY.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            FullLifecycleObserverAdapter fullLifecycleObserverAdapter = this.setNavigationOnClickListener;
            getMenuInflater();
            Iterator<setMenuAlignmentMode> it = fullLifecycleObserverAdapter.setY.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0();
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator<setMenuAlignmentMode> it = this.setNavigationOnClickListener.setY.iterator();
        while (it.hasNext()) {
            it.next();
        }
        super.onPanelClosed(i, menu);
    }

    public void setLayoutAnimation() {
        invalidateOptionsMenu();
    }

    @Override // o.setCollapseContentDescription, o.setTouchDelegate
    public registerIn MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.setPictureListener
    public setTabRippleColorResource setUnboundedRipple() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        setIconTintList();
        return this.setTextAlignment;
    }

    public void setIconTintList() {
        if (this.setTextAlignment == null) {
            setY sety = (setY) getLastNonConfigurationInstance();
            if (sety != null) {
                this.setTextAlignment = sety.setY;
            }
            if (this.setTextAlignment == null) {
                this.setTextAlignment = new setTabRippleColorResource();
            }
        }
    }

    @Override // o.ComponentActivity$5
    public setPlaceholderTextColor setY() {
        setChipIconSize setchipiconsize = new setChipIconSize();
        if (getApplication() != null) {
            setPlaceholderTextColor.setY<Application> sety = setEndIconTintMode.setY.setIconTintList;
            Application application = getApplication();
            pN.setY(sety, "");
            setchipiconsize.setX.put(sety, application);
        }
        setPlaceholderTextColor.setY<setFillViewport> sety2 = TimeModel$1.MenuHostHelper$$ExternalSyntheticLambda0;
        pN.setY(sety2, "");
        setchipiconsize.setX.put(sety2, this);
        setPlaceholderTextColor.setY<setPictureListener> sety3 = TimeModel$1.setX;
        pN.setY(sety3, "");
        setchipiconsize.setX.put(sety3, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            setPlaceholderTextColor.setY<Bundle> sety4 = TimeModel$1.setY;
            Bundle extras = getIntent().getExtras();
            pN.setY(sety4, "");
            setchipiconsize.setX.put(sety4, extras);
        }
        return setchipiconsize;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.setUiOptions.setIconTintList();
    }

    @Override // o.setNavigationOnClickListener
    public final OnBackPressedDispatcher setX() {
        return this.setUiOptions;
    }

    @Override // o.setFillViewport
    public final setCompoundDrawablePadding setNavigationOnClickListener() {
        return this.setX.setX;
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.setY.setY(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.setY.setY(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // o.setTextScaleX
    public final setCenterIfNoTextEnabled MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setY;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<getGroupName<Configuration>> it = this.setOnLongClickListener.iterator();
        while (it.hasNext()) {
            it.next().setY(configuration);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<getGroupName<Integer>> it = this.ViewPager$SavedState$1.iterator();
        while (it.hasNext()) {
            it.next().setY(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<getGroupName<Intent>> it = this.setChipCornerRadius.iterator();
        while (it.hasNext()) {
            it.next().setY(intent);
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        Iterator<getGroupName<setIndeterminateTintMode>> it = this.setLayoutAnimation.iterator();
        while (it.hasNext()) {
            it.next().setY(new setIndeterminateTintMode(z));
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        Iterator<getGroupName<setIndeterminateTintMode>> it = this.setLayoutAnimation.iterator();
        while (it.hasNext()) {
            it.next().setY(new setIndeterminateTintMode(z, configuration));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        Iterator<getGroupName<RemoteActionCompat>> it = this.setCenterIfNoTextEnabled.iterator();
        while (it.hasNext()) {
            it.next().setY(new RemoteActionCompat(z));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        Iterator<getGroupName<RemoteActionCompat>> it = this.setCenterIfNoTextEnabled.iterator();
        while (it.hasNext()) {
            it.next().setY(new RemoteActionCompat(z, configuration));
        }
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (setStartIconCheckable.setIconTintList()) {
                setPropertyName.MenuHostHelper$$ExternalSyntheticLambda1("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
        } finally {
            setPropertyName.MenuHostHelper$$ExternalSyntheticLambda0();
        }
    }

    /* loaded from: classes.dex */
    public static class setIconTintList {
        public static void setIconTintList(View view) {
            view.cancelPendingInputEvents();
        }
    }
}