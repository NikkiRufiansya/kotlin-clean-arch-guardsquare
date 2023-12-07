package o;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import o.getView;
import o.setAllowStacking;
import o.setAnimationFromJson;
import o.setBackgroundTintMode;
import o.setBaselineAlignBottom;
import o.setChipIconEnabled;
import o.setIconified;
import o.setRevealInfo;
import o.setTextStartPaddingResource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setIconified extends setGuidelinePercent implements setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0, LayoutInflater.Factory2 {
    private setNavigationOnClickListener ExtendableSavedState$1;
    private setTextAlignment FirebaseRemoteConfigKtxRegistrar;
    private boolean FloatingActionButton$BaseBehavior;
    private boolean FragmentStateAdapter$2;
    private boolean FragmentStateAdapter$5;
    setRowOrderPreserved MenuHostHelper$$ExternalSyntheticLambda0;
    PopupWindow MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean RecyclerView$SavedState$1;
    private setY SearchView$SavedState$1;
    boolean ViewPager$SavedState$1;
    private int getCallingPid;
    private Rect onActivityResumed;
    private boolean setAdapter;
    Window setAnimationFromJson;
    int setCenterIfNoTextEnabled;
    MenuInflater setChipCornerRadius;
    private int setChipIconEnabled;
    private boolean setChipIconTintResource;
    private setTextAlignment[] setChipSpacingVertical;
    private setUiOptions setConstraintSet;
    private setUiOptions setContentScrimResource;
    private boolean setError;
    private TextView setFilterRedundantCalls;
    private setStrokeColorResource setFilterTouchesWhenObscured;
    private final Runnable setFloatValues;
    private boolean setHasDecor;
    private CharSequence setHint;
    boolean setIconSize;
    final setLayoutDirection setIconTintList;
    private SearchView$SavedState$1 setIconified;
    private setContentScrimResource setImageTintMode;
    boolean setLayoutAnimation;
    ViewGroup setMaxEms;
    setHeaderDividersEnabled setNavigationOnClickListener;
    private boolean setObjectValues;
    boolean setOnLongClickListener;
    boolean setOnNavigationItemSelectedListener;
    private boolean setSelectedChildViewEnabled;
    private View setShrinkMotionSpec;
    private boolean setSuffixText;
    boolean setTextAlignment;
    Runnable setTextScaleX;
    private setIconified$ViewPager$SavedState$1 setTitleMarginEnd;
    private Rect setTooltipText;
    final Context setUiOptions;
    final Object setUnboundedRipple;
    private Configuration setViewTranslationCallback;
    setMaxEms setX;
    setChipIconEnabled setY;
    boolean setZ;
    private static final setDividerHeight<String, Integer> setGuidelinePercent = new setDividerHeight<>();
    private static final boolean setLayoutDirection = false;
    private static final int[] setTextAppearanceResource = {16842836};
    private static final boolean setMinAndMaxProgress = !"robolectric".equals(Build.FINGERPRINT);
    private static final boolean setCheckedIconEnabled = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface setIconTintList {
        boolean setIconTintList(int i);

        View setY(int i);
    }

    void MenuHostHelper$$ExternalSyntheticLambda1(ViewGroup viewGroup) {
    }

    @Override // o.setGuidelinePercent
    public void setY(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setIconified(Activity activity, setLayoutDirection setlayoutdirection) {
        this(activity, null, setlayoutdirection, activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setIconified(Dialog dialog, setLayoutDirection setlayoutdirection) {
        this(dialog.getContext(), dialog.getWindow(), setlayoutdirection, dialog);
    }

    private setIconified(Context context, Window window, setLayoutDirection setlayoutdirection, Object obj) {
        setDividerHeight<String, Integer> setdividerheight;
        Integer num;
        setMinAndMaxProgress SearchView$SavedState$1;
        this.setNavigationOnClickListener = null;
        this.RecyclerView$SavedState$1 = true;
        this.setChipIconEnabled = -100;
        this.setFloatValues = new Runnable() { // from class: o.setIconified.5
            @Override // java.lang.Runnable
            public void run() {
                if ((setIconified.this.setCenterIfNoTextEnabled & 1) != 0) {
                    setIconified.this.setLayoutAnimation(0);
                }
                if ((setIconified.this.setCenterIfNoTextEnabled & 4096) != 0) {
                    setIconified.this.setLayoutAnimation(108);
                }
                setIconified.this.ViewPager$SavedState$1 = false;
                setIconified.this.setCenterIfNoTextEnabled = 0;
            }
        };
        this.setUiOptions = context;
        this.setIconTintList = setlayoutdirection;
        this.setUnboundedRipple = obj;
        if (this.setChipIconEnabled == -100 && (obj instanceof Dialog) && (SearchView$SavedState$1 = SearchView$SavedState$1()) != null) {
            this.setChipIconEnabled = SearchView$SavedState$1.setChipCornerRadius().setIconTintList();
        }
        if (this.setChipIconEnabled == -100 && (num = (setdividerheight = setGuidelinePercent).get(obj.getClass().getName())) != null) {
            this.setChipIconEnabled = num.intValue();
            setdividerheight.remove(obj.getClass().getName());
        }
        if (window != null) {
            MenuHostHelper$$ExternalSyntheticLambda0(window);
        }
        setSelectionFromTop.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // o.setGuidelinePercent
    public Context MenuHostHelper$$ExternalSyntheticLambda0(Context context) {
        Context createConfigurationContext;
        this.FragmentStateAdapter$5 = true;
        int x = setX(context, setGuidelinePercent());
        boolean z = false;
        if (setCheckedIconEnabled && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(setIconTintList(context, x, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof setTitleMarginEnd) {
            try {
                ((setTitleMarginEnd) context).MenuHostHelper$$ExternalSyntheticLambda0(setIconTintList(context, x, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!setMinAndMaxProgress) {
            return super.MenuHostHelper$$ExternalSyntheticLambda0(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        createConfigurationContext = context.createConfigurationContext(configuration);
        Configuration configuration2 = createConfigurationContext.getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration iconTintList = setIconTintList(context, x, configuration2.equals(configuration3) ? null : MenuHostHelper$$ExternalSyntheticLambda1(configuration2, configuration3), true);
        setTitleMarginEnd settitlemarginend = new setTitleMarginEnd(context, (int) R.style._res_0x7f1501f5);
        settitlemarginend.MenuHostHelper$$ExternalSyntheticLambda0(iconTintList);
        try {
            z = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z) {
            setTextStartPaddingResource.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0(settitlemarginend.getTheme());
        }
        return super.MenuHostHelper$$ExternalSyntheticLambda0(settitlemarginend);
    }

    /* loaded from: classes.dex */
    static class setCenterIfNoTextEnabled {
    }

    @Override // o.setGuidelinePercent
    public void setIconTintList(Bundle bundle) {
        String str;
        this.FragmentStateAdapter$5 = true;
        setX(false);
        ExtendableSavedState$1();
        Object obj = this.setUnboundedRipple;
        if (obj instanceof Activity) {
            try {
                str = onOptionsItemSelected.setX((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                setMaxEms maxEms = setMaxEms();
                if (maxEms == null) {
                    this.setObjectValues = true;
                } else {
                    maxEms.setY(true);
                }
            }
            MenuHostHelper$$ExternalSyntheticLambda1(this);
        }
        this.setViewTranslationCallback = new Configuration(this.setUiOptions.getResources().getConfiguration());
        this.FloatingActionButton$BaseBehavior = true;
    }

    @Override // o.setGuidelinePercent
    public void MenuHostHelper$$ExternalSyntheticLambda1(Bundle bundle) {
        setMinAndMaxProgress();
    }

    @Override // o.setGuidelinePercent
    public setMaxEms setX() {
        setIconified();
        return this.setX;
    }

    final setMaxEms setMaxEms() {
        return this.setX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Window.Callback setAnimationFromJson() {
        return this.setAnimationFromJson.getCallback();
    }

    private void setIconified() {
        setMinAndMaxProgress();
        if (this.setOnLongClickListener && this.setX == null) {
            Object obj = this.setUnboundedRipple;
            if (obj instanceof Activity) {
                this.setX = new setAdapter((Activity) this.setUnboundedRipple, this.setTextAlignment);
            } else if (obj instanceof Dialog) {
                this.setX = new setAdapter((Dialog) this.setUnboundedRipple);
            }
            setMaxEms setmaxems = this.setX;
            if (setmaxems != null) {
                setmaxems.setY(this.setObjectValues);
            }
        }
    }

    @Override // o.setGuidelinePercent
    public void setIconTintList(setTranscriptMode settranscriptmode) {
        if (this.setUnboundedRipple instanceof Activity) {
            setMaxEms x = setX();
            if (x instanceof setAdapter) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.setChipCornerRadius = null;
            if (x != null) {
                x.setNavigationOnClickListener();
            }
            this.setX = null;
            if (settranscriptmode != null) {
                FragmentStateAdapter$2 fragmentStateAdapter$2 = new FragmentStateAdapter$2(settranscriptmode, setCenterIfNoTextEnabled(), this.ExtendableSavedState$1);
                this.setX = fragmentStateAdapter$2;
                this.ExtendableSavedState$1.MenuHostHelper$$ExternalSyntheticLambda1(fragmentStateAdapter$2.setY);
            } else {
                this.ExtendableSavedState$1.MenuHostHelper$$ExternalSyntheticLambda1(null);
            }
            setNavigationOnClickListener();
        }
    }

    final Context setTextAlignment() {
        setMaxEms x = setX();
        Context iconTintList = x != null ? x.setIconTintList() : null;
        return iconTintList == null ? this.setUiOptions : iconTintList;
    }

    @Override // o.setGuidelinePercent
    public MenuInflater setY() {
        if (this.setChipCornerRadius == null) {
            setIconified();
            setMaxEms setmaxems = this.setX;
            this.setChipCornerRadius = new setShrinkMotionSpec(setmaxems != null ? setmaxems.setIconTintList() : this.setUiOptions);
        }
        return this.setChipCornerRadius;
    }

    @Override // o.setGuidelinePercent
    public <T extends View> T setY(int i) {
        setMinAndMaxProgress();
        return (T) this.setAnimationFromJson.findViewById(i);
    }

    @Override // o.setGuidelinePercent
    public void MenuHostHelper$$ExternalSyntheticLambda0(Configuration configuration) {
        setMaxEms x;
        if (this.setOnLongClickListener && this.setError && (x = setX()) != null) {
            x.setY(configuration);
        }
        setSelectionFromTop.setIconTintList().setX(this.setUiOptions);
        this.setViewTranslationCallback = new Configuration(this.setUiOptions.getResources().getConfiguration());
        setX(false);
        configuration.updateFrom(this.setUiOptions.getResources().getConfiguration());
    }

    @Override // o.setGuidelinePercent
    public void setLayoutAnimation() {
        ViewPager$SavedState$1();
    }

    @Override // o.setGuidelinePercent
    public void setUiOptions() {
        setMaxEms x = setX();
        if (x != null) {
            x.MenuHostHelper$$ExternalSyntheticLambda1(false);
        }
    }

    @Override // o.setGuidelinePercent
    public void setOnLongClickListener() {
        setMaxEms x = setX();
        if (x != null) {
            x.MenuHostHelper$$ExternalSyntheticLambda1(true);
        }
    }

    @Override // o.setGuidelinePercent
    public void MenuHostHelper$$ExternalSyntheticLambda0(View view) {
        setMinAndMaxProgress();
        ViewGroup viewGroup = (ViewGroup) this.setMaxEms.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.ExtendableSavedState$1.setIconTintList(this.setAnimationFromJson.getCallback());
    }

    @Override // o.setGuidelinePercent
    public void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        setMinAndMaxProgress();
        ViewGroup viewGroup = (ViewGroup) this.setMaxEms.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.setUiOptions).inflate(i, viewGroup);
        this.ExtendableSavedState$1.setIconTintList(this.setAnimationFromJson.getCallback());
    }

    @Override // o.setGuidelinePercent
    public void setX(View view, ViewGroup.LayoutParams layoutParams) {
        setMinAndMaxProgress();
        ViewGroup viewGroup = (ViewGroup) this.setMaxEms.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.ExtendableSavedState$1.setIconTintList(this.setAnimationFromJson.getCallback());
    }

    @Override // o.setGuidelinePercent
    public void setIconTintList(View view, ViewGroup.LayoutParams layoutParams) {
        setMinAndMaxProgress();
        ((ViewGroup) this.setMaxEms.findViewById(16908290)).addView(view, layoutParams);
        this.ExtendableSavedState$1.setIconTintList(this.setAnimationFromJson.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // o.setGuidelinePercent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setUnboundedRipple() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.setUnboundedRipple
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            MenuHostHelper$$ExternalSyntheticLambda0(r3)
        L9:
            boolean r0 = r3.ViewPager$SavedState$1
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.setAnimationFromJson
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.setFloatValues
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.setLayoutAnimation = r0
            int r0 = r3.setChipIconEnabled
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.setUnboundedRipple
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            o.setDividerHeight<java.lang.String, java.lang.Integer> r0 = o.setIconified.setGuidelinePercent
            java.lang.Object r1 = r3.setUnboundedRipple
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.setChipIconEnabled
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            o.setDividerHeight<java.lang.String, java.lang.Integer> r0 = o.setIconified.setGuidelinePercent
            java.lang.Object r1 = r3.setUnboundedRipple
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            o.setMaxEms r0 = r3.setX
            if (r0 == 0) goto L5b
            r0.setNavigationOnClickListener()
        L5b:
            r3.setTextAppearanceResource()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setIconified.setUnboundedRipple():void");
    }

    private void setTextAppearanceResource() {
        setUiOptions setuioptions = this.setContentScrimResource;
        if (setuioptions != null) {
            setuioptions.setIconTintList();
        }
        setUiOptions setuioptions2 = this.setConstraintSet;
        if (setuioptions2 != null) {
            setuioptions2.setIconTintList();
        }
    }

    @Override // o.setGuidelinePercent
    public void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        this.getCallingPid = i;
    }

    private void ExtendableSavedState$1() {
        if (this.setAnimationFromJson == null) {
            Object obj = this.setUnboundedRipple;
            if (obj instanceof Activity) {
                MenuHostHelper$$ExternalSyntheticLambda0(((Activity) obj).getWindow());
            }
        }
        if (this.setAnimationFromJson == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(Window window) {
        if (this.setAnimationFromJson != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof setNavigationOnClickListener) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener(callback);
        this.ExtendableSavedState$1 = setnavigationonclicklistener;
        window.setCallback(setnavigationonclicklistener);
        setExpandedHintEnabled x = setExpandedHintEnabled.setX(this.setUiOptions, (AttributeSet) null, setTextAppearanceResource);
        Drawable x2 = x.setX(0);
        if (x2 != null) {
            window.setBackgroundDrawable(x2);
        }
        x.setX();
        this.setAnimationFromJson = window;
    }

    private void setMinAndMaxProgress() {
        if (this.setError) {
            return;
        }
        this.setMaxEms = setCheckedIconEnabled();
        CharSequence centerIfNoTextEnabled = setCenterIfNoTextEnabled();
        if (!TextUtils.isEmpty(centerIfNoTextEnabled)) {
            setStrokeColorResource setstrokecolorresource = this.setFilterTouchesWhenObscured;
            if (setstrokecolorresource != null) {
                setstrokecolorresource.setWindowTitle(centerIfNoTextEnabled);
            } else if (setMaxEms() != null) {
                setMaxEms().setIconTintList(centerIfNoTextEnabled);
            } else {
                TextView textView = this.setFilterRedundantCalls;
                if (textView != null) {
                    textView.setText(centerIfNoTextEnabled);
                }
            }
        }
        setLayoutDirection();
        MenuHostHelper$$ExternalSyntheticLambda1(this.setMaxEms);
        this.setError = true;
        setTextAlignment MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(0, false);
        if (this.setLayoutAnimation) {
            return;
        }
        if (MenuHostHelper$$ExternalSyntheticLambda1 == null || MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1 == null) {
            setOnLongClickListener(108);
        }
    }

    private ViewGroup setCheckedIconEnabled() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.setUiOptions.obtainStyledAttributes(setAnimationFromJson.setY.minusKey);
        if (!obtainStyledAttributes.hasValue(setAnimationFromJson.setY.setCheckedIconEnabledResource)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(setAnimationFromJson.setY.setScrollX, false)) {
            setIconTintList(1);
        } else if (obtainStyledAttributes.getBoolean(setAnimationFromJson.setY.setCheckedIconEnabledResource, false)) {
            setIconTintList(108);
        }
        if (obtainStyledAttributes.getBoolean(setAnimationFromJson.setY.setDelayedApplicationOfInitialState, false)) {
            setIconTintList(109);
        }
        if (obtainStyledAttributes.getBoolean(setAnimationFromJson.setY.setCalendarViewShown, false)) {
            setIconTintList(10);
        }
        this.setIconSize = obtainStyledAttributes.getBoolean(setAnimationFromJson.setY.setExpandedTitleTextColor, false);
        obtainStyledAttributes.recycle();
        ExtendableSavedState$1();
        this.setAnimationFromJson.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.setUiOptions);
        if (!this.setZ) {
            if (this.setIconSize) {
                viewGroup = (ViewGroup) from.inflate(R.layout.res_0x7f0d000c, (ViewGroup) null);
                this.setTextAlignment = false;
                this.setOnLongClickListener = false;
            } else if (this.setOnLongClickListener) {
                TypedValue typedValue = new TypedValue();
                this.setUiOptions.getTheme().resolveAttribute(R.attr.res_0x7f04000b, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new setTitleMarginEnd(this.setUiOptions, typedValue.resourceId);
                } else {
                    context = this.setUiOptions;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.res_0x7f0d0017, (ViewGroup) null);
                setStrokeColorResource setstrokecolorresource = (setStrokeColorResource) viewGroup.findViewById(R.id.res_0x7f0a009d);
                this.setFilterTouchesWhenObscured = setstrokecolorresource;
                setstrokecolorresource.setWindowCallback(setAnimationFromJson());
                if (this.setTextAlignment) {
                    this.setFilterTouchesWhenObscured.setX(109);
                }
                if (this.setAdapter) {
                    this.setFilterTouchesWhenObscured.setX(2);
                }
                if (this.setSuffixText) {
                    this.setFilterTouchesWhenObscured.setX(5);
                }
            } else {
                viewGroup = null;
            }
        } else {
            viewGroup = this.setOnNavigationItemSelectedListener ? (ViewGroup) from.inflate(R.layout.res_0x7f0d0016, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.res_0x7f0d0015, (ViewGroup) null);
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.setOnLongClickListener);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.setTextAlignment);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.setIconSize);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.setOnNavigationItemSelectedListener);
            sb.append(", windowNoTitle: ");
            sb.append(this.setZ);
            sb.append(" }");
            throw new IllegalArgumentException(sb.toString());
        }
        setBaselineAlignBottom.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1(viewGroup, new setCircularRevealScrimColor() { // from class: o.setIconified.1
            @Override // o.setCircularRevealScrimColor
            public WindowInsetsCompat setIconTintList(View view, WindowInsetsCompat windowInsetsCompat) {
                int uiOptions = windowInsetsCompat.setUiOptions();
                int y = setIconified.this.setY(windowInsetsCompat, (Rect) null);
                if (uiOptions != y) {
                    windowInsetsCompat = windowInsetsCompat.MenuHostHelper$$ExternalSyntheticLambda1(windowInsetsCompat.setNavigationOnClickListener(), y, windowInsetsCompat.setOnLongClickListener(), windowInsetsCompat.setUnboundedRipple());
                }
                return setBaselineAlignBottom.setIconTintList(view, windowInsetsCompat);
            }
        });
        if (this.setFilterTouchesWhenObscured == null) {
            this.setFilterRedundantCalls = (TextView) viewGroup.findViewById(R.id.res_0x7f0a01f9);
        }
        setTabMode.MenuHostHelper$$ExternalSyntheticLambda1(viewGroup);
        getView getview = (getView) viewGroup.findViewById(R.id.res_0x7f0a0034);
        ViewGroup viewGroup2 = (ViewGroup) this.setAnimationFromJson.findViewById(16908290);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                getview.addView(childAt);
            }
            viewGroup2.setId(-1);
            getview.setId(16908290);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.setAnimationFromJson.setContentView(viewGroup);
        getview.setAttachListener(new getView.setY() { // from class: o.setIconified.2
            @Override // o.getView.setY
            public void setIconTintList() {
            }

            @Override // o.getView.setY
            public void setX() {
                setIconified.this.setIconSize();
            }
        });
        return viewGroup;
    }

    private void setLayoutDirection() {
        getView getview = (getView) this.setMaxEms.findViewById(16908290);
        View decorView = this.setAnimationFromJson.getDecorView();
        getview.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.setUiOptions.obtainStyledAttributes(setAnimationFromJson.setY.minusKey);
        obtainStyledAttributes.getValue(setAnimationFromJson.setY.setCheckableResource, getview.MenuHostHelper$$ExternalSyntheticLambda0());
        obtainStyledAttributes.getValue(setAnimationFromJson.setY.wrap, getview.setUnboundedRipple());
        if (obtainStyledAttributes.hasValue(setAnimationFromJson.setY.GridLayoutManager)) {
            int i = setAnimationFromJson.setY.GridLayoutManager;
            obtainStyledAttributes.getValue(122, getview.setIconTintList());
        }
        if (obtainStyledAttributes.hasValue(setAnimationFromJson.setY.setChipTextResource)) {
            int i2 = setAnimationFromJson.setY.setChipTextResource;
            obtainStyledAttributes.getValue(123, getview.MenuHostHelper$$ExternalSyntheticLambda1());
        }
        if (obtainStyledAttributes.hasValue(setAnimationFromJson.setY.setOnSeekBarChangeListener)) {
            int i3 = setAnimationFromJson.setY.setOnSeekBarChangeListener;
            obtainStyledAttributes.getValue(120, getview.setX());
        }
        if (obtainStyledAttributes.hasValue(setAnimationFromJson.setY.m)) {
            int i4 = setAnimationFromJson.setY.m;
            obtainStyledAttributes.getValue(121, getview.setY());
        }
        obtainStyledAttributes.recycle();
        getview.requestLayout();
    }

    @Override // o.setGuidelinePercent
    public boolean setIconTintList(int i) {
        int uiOptions = setUiOptions(i);
        if (this.setZ && uiOptions == 108) {
            return false;
        }
        if (this.setOnLongClickListener && uiOptions == 1) {
            this.setOnLongClickListener = false;
        }
        if (uiOptions == 1) {
            setChipIconTintResource();
            this.setZ = true;
            return true;
        } else if (uiOptions == 2) {
            setChipIconTintResource();
            this.setAdapter = true;
            return true;
        } else if (uiOptions == 5) {
            setChipIconTintResource();
            this.setSuffixText = true;
            return true;
        } else if (uiOptions == 10) {
            setChipIconTintResource();
            this.setOnNavigationItemSelectedListener = true;
            return true;
        } else if (uiOptions == 108) {
            setChipIconTintResource();
            this.setOnLongClickListener = true;
            return true;
        } else if (uiOptions == 109) {
            setChipIconTintResource();
            this.setTextAlignment = true;
            return true;
        } else {
            return this.setAnimationFromJson.requestFeature(uiOptions);
        }
    }

    @Override // o.setGuidelinePercent
    public final void setY(CharSequence charSequence) {
        this.setHint = charSequence;
        setStrokeColorResource setstrokecolorresource = this.setFilterTouchesWhenObscured;
        if (setstrokecolorresource != null) {
            setstrokecolorresource.setWindowTitle(charSequence);
        } else if (setMaxEms() != null) {
            setMaxEms().setIconTintList(charSequence);
        } else {
            TextView textView = this.setFilterRedundantCalls;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    final CharSequence setCenterIfNoTextEnabled() {
        Object obj = this.setUnboundedRipple;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.setHint;
    }

    void setUnboundedRipple(int i) {
        if (i == 108) {
            setMaxEms x = setX();
            if (x != null) {
                x.setX(false);
            }
        } else if (i == 0) {
            setTextAlignment MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(i, true);
            if (MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation) {
                setIconTintList(MenuHostHelper$$ExternalSyntheticLambda1, false);
            }
        }
    }

    void setNavigationOnClickListener(int i) {
        setMaxEms x;
        if (i != 108 || (x = setX()) == null) {
            return;
        }
        x.setX(true);
    }

    @Override // o.setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0
    public boolean setY(setNavigationIconTint setnavigationicontint, MenuItem menuItem) {
        setTextAlignment MenuHostHelper$$ExternalSyntheticLambda0;
        Window.Callback animationFromJson = setAnimationFromJson();
        if (animationFromJson == null || this.setLayoutAnimation || (MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0((Menu) setnavigationicontint.MenuHostHelper$$ExternalSyntheticLambda1())) == null) {
            return false;
        }
        return animationFromJson.onMenuItemSelected(MenuHostHelper$$ExternalSyntheticLambda0.setY, menuItem);
    }

    @Override // o.setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0
    public void setY(setNavigationIconTint setnavigationicontint) {
        setIconTintList(true);
    }

    public setChipIconEnabled MenuHostHelper$$ExternalSyntheticLambda0(setChipIconEnabled.setY sety) {
        setLayoutDirection setlayoutdirection;
        if (sety == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        setChipIconEnabled setchipiconenabled = this.setY;
        if (setchipiconenabled != null) {
            setchipiconenabled.MenuHostHelper$$ExternalSyntheticLambda1();
        }
        setIconified$MenuHostHelper$$ExternalSyntheticLambda1 seticonified_menuhosthelper__externalsyntheticlambda1 = new setIconified$MenuHostHelper$$ExternalSyntheticLambda1(this, sety);
        setMaxEms x = setX();
        if (x != null) {
            setChipIconEnabled x2 = x.setX(seticonified_menuhosthelper__externalsyntheticlambda1);
            this.setY = x2;
            if (x2 != null && (setlayoutdirection = this.setIconTintList) != null) {
                setlayoutdirection.setX(x2);
            }
        }
        if (this.setY == null) {
            this.setY = MenuHostHelper$$ExternalSyntheticLambda1(seticonified_menuhosthelper__externalsyntheticlambda1);
        }
        return this.setY;
    }

    @Override // o.setGuidelinePercent
    public void setNavigationOnClickListener() {
        if (setMaxEms() == null || setX().setUnboundedRipple()) {
            return;
        }
        setOnLongClickListener(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    o.setChipIconEnabled MenuHostHelper$$ExternalSyntheticLambda1(o.setChipIconEnabled.setY r8) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setIconified.MenuHostHelper$$ExternalSyntheticLambda1(o.setChipIconEnabled$setY):o.setChipIconEnabled");
    }

    final boolean setZ() {
        ViewGroup viewGroup;
        return this.setError && (viewGroup = this.setMaxEms) != null && setBaselineAlignBottom.setConstraintSet(viewGroup);
    }

    public boolean setTextScaleX() {
        return this.RecyclerView$SavedState$1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setChipCornerRadius() {
        setHeaderDividersEnabled setheaderdividersenabled = this.setNavigationOnClickListener;
        if (setheaderdividersenabled != null) {
            setheaderdividersenabled.MenuHostHelper$$ExternalSyntheticLambda0();
        }
    }

    boolean setOnNavigationItemSelectedListener() {
        setChipIconEnabled setchipiconenabled = this.setY;
        if (setchipiconenabled != null) {
            setchipiconenabled.MenuHostHelper$$ExternalSyntheticLambda1();
            return true;
        }
        setMaxEms x = setX();
        return x != null && x.setX();
    }

    boolean setIconTintList(int i, KeyEvent keyEvent) {
        setMaxEms x = setX();
        if (x == null || !x.setY(i, keyEvent)) {
            setTextAlignment settextalignment = this.FirebaseRemoteConfigKtxRegistrar;
            if (settextalignment != null && setX(settextalignment, keyEvent.getKeyCode(), keyEvent, 1)) {
                setTextAlignment settextalignment2 = this.FirebaseRemoteConfigKtxRegistrar;
                if (settextalignment2 != null) {
                    settextalignment2.setNavigationOnClickListener = true;
                }
                return true;
            }
            if (this.FirebaseRemoteConfigKtxRegistrar == null) {
                setTextAlignment MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(0, true);
                MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda1, keyEvent);
                boolean x2 = setX(MenuHostHelper$$ExternalSyntheticLambda1, keyEvent.getKeyCode(), keyEvent, 1);
                MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener = false;
                if (x2) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    boolean setY(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.setUnboundedRipple;
        if (((obj instanceof LifecycleController$observer$1$MenuHostHelper$$ExternalSyntheticLambda1) || (obj instanceof setHasDecor)) && (decorView = this.setAnimationFromJson.getDecorView()) != null && setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda0(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.ExtendableSavedState$1.setX(this.setAnimationFromJson.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? MenuHostHelper$$ExternalSyntheticLambda0(keyCode, keyEvent) : setY(keyCode, keyEvent);
    }

    boolean setY(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.setSelectedChildViewEnabled;
            this.setSelectedChildViewEnabled = false;
            setTextAlignment MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(0, false);
            if (MenuHostHelper$$ExternalSyntheticLambda1 != null && MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation) {
                if (!z) {
                    setIconTintList(MenuHostHelper$$ExternalSyntheticLambda1, true);
                }
                return true;
            } else if (setOnNavigationItemSelectedListener()) {
                return true;
            }
        } else if (i == 82) {
            setX(0, keyEvent);
            return true;
        }
        return false;
    }

    boolean MenuHostHelper$$ExternalSyntheticLambda0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.setSelectedChildViewEnabled = (keyEvent.getFlags() & 128) != 0;
        } else if (i == 82) {
            MenuHostHelper$$ExternalSyntheticLambda1(0, keyEvent);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View setY(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r11 = this;
            o.SearchView$SavedState$1 r0 = r11.setIconified
            r1 = 0
            if (r0 != 0) goto L5a
            android.content.Context r0 = r11.setUiOptions
            int[] r2 = o.setAnimationFromJson.setY.minusKey
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            int r2 = o.setAnimationFromJson.setY.setRowOrderPreserved
            r2 = 116(0x74, float:1.63E-43)
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L1f
            o.SearchView$SavedState$1 r0 = new o.SearchView$SavedState$1
            r0.<init>()
            r11.setIconified = r0
            goto L5a
        L1f:
            android.content.Context r2 = r11.setUiOptions     // Catch: java.lang.Throwable -> L3a
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L3a
            java.lang.Class r2 = r2.loadClass(r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L3a
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L3a
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> L3a
            o.SearchView$SavedState$1 r2 = (o.SearchView$SavedState$1) r2     // Catch: java.lang.Throwable -> L3a
            r11.setIconified = r2     // Catch: java.lang.Throwable -> L3a
            goto L5a
        L3a:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to instantiate custom view inflater "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ". Falling back to default."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "AppCompatDelegate"
            android.util.Log.i(r3, r0, r2)
            o.SearchView$SavedState$1 r0 = new o.SearchView$SavedState$1
            r0.<init>()
            r11.setIconified = r0
        L5a:
            boolean r8 = o.setIconified.setLayoutDirection
            r0 = 1
            if (r8 == 0) goto Lc4
            o.setContentScrimResource r2 = r11.setImageTintMode
            if (r2 != 0) goto L6a
            o.setContentScrimResource r2 = new o.setContentScrimResource
            r2.<init>()
            r11.setImageTintMode = r2
        L6a:
            o.setContentScrimResource r2 = r11.setImageTintMode
            boolean r3 = r15 instanceof org.xmlpull.v1.XmlPullParser
            if (r3 == 0) goto Laa
            r4 = r15
            org.xmlpull.v1.XmlPullParser r4 = (org.xmlpull.v1.XmlPullParser) r4
            int r5 = r4.getDepth()
            if (r5 != r0) goto Laa
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r5 = r2.setY
        L7b:
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L97
            java.lang.Object r6 = r5.peek()
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6
            java.lang.Object r6 = r6.get()
            org.xmlpull.v1.XmlPullParser r6 = (org.xmlpull.v1.XmlPullParser) r6
            boolean r7 = o.setContentScrimResource.setIconTintList(r6)
            if (r7 == 0) goto L98
            r5.pop()
            goto L7b
        L97:
            r6 = 0
        L98:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r2 = r2.setY
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r4)
            r2.push(r5)
            boolean r2 = o.setContentScrimResource.setIconTintList(r4, r6)
            if (r2 == 0) goto Laa
            r2 = 1
            goto Lab
        Laa:
            r2 = 0
        Lab:
            if (r2 == 0) goto Laf
        Lad:
            r7 = 1
            goto Lc5
        Laf:
            if (r3 == 0) goto Lbb
            r2 = r15
            org.xmlpull.v1.XmlPullParser r2 = (org.xmlpull.v1.XmlPullParser) r2
            int r2 = r2.getDepth()
            if (r2 <= r0) goto Lc2
            goto Lad
        Lbb:
            r0 = r12
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            boolean r1 = r11.setIconTintList(r0)
        Lc2:
            r7 = r1
            goto Lc5
        Lc4:
            r7 = 0
        Lc5:
            o.SearchView$SavedState$1 r2 = r11.setIconified
            r9 = 1
            r10 = 0
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            android.view.View r12 = r2.setX(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setIconified.setY(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    private boolean setIconTintList(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.setAnimationFromJson.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || setBaselineAlignBottom.setChipIconTintResource((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    @Override // o.setGuidelinePercent
    public void MenuHostHelper$$ExternalSyntheticLambda0() {
        LayoutInflater from = LayoutInflater.from(this.setUiOptions);
        if (from.getFactory() == null) {
            setContentView.setIconTintList(from, this);
        } else if (from.getFactory2() instanceof setIconified) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return setY(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private setMinAndMaxProgress SearchView$SavedState$1() {
        for (Context context = this.setUiOptions; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof setMinAndMaxProgress) {
                return (setMinAndMaxProgress) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
        }
        return null;
    }

    private void setX(setTextAlignment settextalignment, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (settextalignment.setLayoutAnimation || this.setLayoutAnimation) {
            return;
        }
        if (settextalignment.setY == 0) {
            if ((this.setUiOptions.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback animationFromJson = setAnimationFromJson();
        if (animationFromJson != null && !animationFromJson.onMenuOpened(settextalignment.setY, settextalignment.ViewPager$SavedState$1)) {
            setIconTintList(settextalignment, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.setUiOptions.getSystemService("window");
        if (windowManager != null && MenuHostHelper$$ExternalSyntheticLambda1(settextalignment, keyEvent)) {
            if (settextalignment.setIconTintList == null || settextalignment.setTextAlignment) {
                if (settextalignment.setIconTintList == null) {
                    if (!MenuHostHelper$$ExternalSyntheticLambda0(settextalignment) || settextalignment.setIconTintList == null) {
                        return;
                    }
                } else if (settextalignment.setTextAlignment && settextalignment.setIconTintList.getChildCount() > 0) {
                    settextalignment.setIconTintList.removeAllViews();
                }
                if (!setIconTintList(settextalignment) || !settextalignment.setY()) {
                    settextalignment.setTextAlignment = true;
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = settextalignment.setAnimationFromJson.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                settextalignment.setIconTintList.setBackgroundResource(settextalignment.setX);
                ViewParent parent = settextalignment.setAnimationFromJson.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(settextalignment.setAnimationFromJson);
                }
                settextalignment.setIconTintList.addView(settextalignment.setAnimationFromJson, layoutParams2);
                if (!settextalignment.setAnimationFromJson.hasFocus()) {
                    settextalignment.setAnimationFromJson.requestFocus();
                }
            } else if (settextalignment.MenuHostHelper$$ExternalSyntheticLambda1 != null && (layoutParams = settextalignment.MenuHostHelper$$ExternalSyntheticLambda1.getLayoutParams()) != null && layoutParams.width == -1) {
                i = -1;
                settextalignment.setNavigationOnClickListener = false;
                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, settextalignment.setOnNavigationItemSelectedListener, settextalignment.setMaxEms, 1002, 8519680, -3);
                layoutParams3.gravity = settextalignment.setUiOptions;
                layoutParams3.windowAnimations = settextalignment.setZ;
                windowManager.addView(settextalignment.setIconTintList, layoutParams3);
                settextalignment.setLayoutAnimation = true;
            }
            i = -2;
            settextalignment.setNavigationOnClickListener = false;
            WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, settextalignment.setOnNavigationItemSelectedListener, settextalignment.setMaxEms, 1002, 8519680, -3);
            layoutParams32.gravity = settextalignment.setUiOptions;
            layoutParams32.windowAnimations = settextalignment.setZ;
            windowManager.addView(settextalignment.setIconTintList, layoutParams32);
            settextalignment.setLayoutAnimation = true;
        }
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda0(setTextAlignment settextalignment) {
        settextalignment.setIconTintList(setTextAlignment());
        settextalignment.setIconTintList = new setChipCornerRadius(settextalignment.setChipCornerRadius);
        settextalignment.setUiOptions = 81;
        return true;
    }

    private void setIconTintList(boolean z) {
        setStrokeColorResource setstrokecolorresource = this.setFilterTouchesWhenObscured;
        if (setstrokecolorresource != null && setstrokecolorresource.MenuHostHelper$$ExternalSyntheticLambda1() && (!ViewConfiguration.get(this.setUiOptions).hasPermanentMenuKey() || this.setFilterTouchesWhenObscured.setIconTintList())) {
            Window.Callback animationFromJson = setAnimationFromJson();
            if (!this.setFilterTouchesWhenObscured.setNavigationOnClickListener() || !z) {
                if (animationFromJson == null || this.setLayoutAnimation) {
                    return;
                }
                if (this.ViewPager$SavedState$1 && (this.setCenterIfNoTextEnabled & 1) != 0) {
                    this.setAnimationFromJson.getDecorView().removeCallbacks(this.setFloatValues);
                    this.setFloatValues.run();
                }
                setTextAlignment MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(0, true);
                if (MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1 == null || MenuHostHelper$$ExternalSyntheticLambda1.setCenterIfNoTextEnabled || !animationFromJson.onPreparePanel(0, MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1, MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1)) {
                    return;
                }
                animationFromJson.onMenuOpened(108, MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1);
                this.setFilterTouchesWhenObscured.setUnboundedRipple();
                return;
            }
            this.setFilterTouchesWhenObscured.setX();
            if (this.setLayoutAnimation) {
                return;
            }
            animationFromJson.onPanelClosed(108, MenuHostHelper$$ExternalSyntheticLambda1(0, true).ViewPager$SavedState$1);
            return;
        }
        setTextAlignment MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(0, true);
        MenuHostHelper$$ExternalSyntheticLambda12.setTextAlignment = true;
        setIconTintList(MenuHostHelper$$ExternalSyntheticLambda12, false);
        setX(MenuHostHelper$$ExternalSyntheticLambda12, (KeyEvent) null);
    }

    private boolean setX(setTextAlignment settextalignment) {
        Resources.Theme theme;
        Context context = this.setUiOptions;
        if ((settextalignment.setY == 0 || settextalignment.setY == 108) && this.setFilterTouchesWhenObscured != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(R.attr.res_0x7f04000b, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(R.attr.res_0x7f04000c, typedValue, true);
            } else {
                theme2.resolveAttribute(R.attr.res_0x7f04000c, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                setTitleMarginEnd settitlemarginend = new setTitleMarginEnd(context, 0);
                settitlemarginend.getTheme().setTo(theme);
                context = settitlemarginend;
            }
        }
        setNavigationIconTint setnavigationicontint = new setNavigationIconTint(context);
        setnavigationicontint.MenuHostHelper$$ExternalSyntheticLambda1(this);
        settextalignment.MenuHostHelper$$ExternalSyntheticLambda0(setnavigationicontint);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [o.setIconified$ViewPager$SavedState$1] */
    private boolean setIconTintList(setTextAlignment settextalignment) {
        if (settextalignment.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            settextalignment.setAnimationFromJson = settextalignment.MenuHostHelper$$ExternalSyntheticLambda1;
            return true;
        } else if (settextalignment.ViewPager$SavedState$1 == null) {
            return false;
        } else {
            if (this.setTitleMarginEnd == null) {
                this.setTitleMarginEnd = new setBackgroundTintMode.setY() { // from class: o.setIconified$ViewPager$SavedState$1
                    @Override // o.setBackgroundTintMode.setY
                    public final void MenuHostHelper$$ExternalSyntheticLambda0(setNavigationIconTint setnavigationicontint, boolean z) {
                        setNavigationIconTint MenuHostHelper$$ExternalSyntheticLambda1 = setnavigationicontint.MenuHostHelper$$ExternalSyntheticLambda1();
                        boolean z2 = MenuHostHelper$$ExternalSyntheticLambda1 != setnavigationicontint;
                        setIconified seticonified = setIconified.this;
                        if (z2) {
                            setnavigationicontint = MenuHostHelper$$ExternalSyntheticLambda1;
                        }
                        setIconified.setTextAlignment MenuHostHelper$$ExternalSyntheticLambda0 = seticonified.MenuHostHelper$$ExternalSyntheticLambda0((Menu) setnavigationicontint);
                        if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                            if (z2) {
                                setIconified.this.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0.setY, MenuHostHelper$$ExternalSyntheticLambda0, MenuHostHelper$$ExternalSyntheticLambda1);
                                setIconified.this.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0, true);
                                return;
                            }
                            setIconified.this.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0, z);
                        }
                    }

                    @Override // o.setBackgroundTintMode.setY
                    public final boolean setY(setNavigationIconTint setnavigationicontint) {
                        Window.Callback animationFromJson;
                        if (setnavigationicontint != setnavigationicontint.MenuHostHelper$$ExternalSyntheticLambda1() || !setIconified.this.setOnLongClickListener || (animationFromJson = setIconified.this.setAnimationFromJson()) == null || setIconified.this.setLayoutAnimation) {
                            return true;
                        }
                        animationFromJson.onMenuOpened(108, setnavigationicontint);
                        return true;
                    }
                };
            }
            settextalignment.setAnimationFromJson = (View) settextalignment.setY(this.setTitleMarginEnd);
            return settextalignment.setAnimationFromJson != null;
        }
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda1(setTextAlignment settextalignment, KeyEvent keyEvent) {
        setStrokeColorResource setstrokecolorresource;
        setStrokeColorResource setstrokecolorresource2;
        setStrokeColorResource setstrokecolorresource3;
        if (this.setLayoutAnimation) {
            return false;
        }
        if (settextalignment.setOnLongClickListener) {
            return true;
        }
        setTextAlignment settextalignment2 = this.FirebaseRemoteConfigKtxRegistrar;
        if (settextalignment2 != null && settextalignment2 != settextalignment) {
            setIconTintList(settextalignment2, false);
        }
        Window.Callback animationFromJson = setAnimationFromJson();
        if (animationFromJson != null) {
            settextalignment.MenuHostHelper$$ExternalSyntheticLambda1 = animationFromJson.onCreatePanelView(settextalignment.setY);
        }
        boolean z = settextalignment.setY == 0 || settextalignment.setY == 108;
        if (z && (setstrokecolorresource3 = this.setFilterTouchesWhenObscured) != null) {
            setstrokecolorresource3.setMenuPrepared();
        }
        if (settextalignment.MenuHostHelper$$ExternalSyntheticLambda1 == null && (!z || !(setMaxEms() instanceof FragmentStateAdapter$2))) {
            if (settextalignment.ViewPager$SavedState$1 == null || settextalignment.setCenterIfNoTextEnabled) {
                if (settextalignment.ViewPager$SavedState$1 == null && (!setX(settextalignment) || settextalignment.ViewPager$SavedState$1 == null)) {
                    return false;
                }
                if (z && this.setFilterTouchesWhenObscured != null) {
                    if (this.SearchView$SavedState$1 == null) {
                        this.SearchView$SavedState$1 = new setY();
                    }
                    this.setFilterTouchesWhenObscured.setMenu(settextalignment.ViewPager$SavedState$1, this.SearchView$SavedState$1);
                }
                settextalignment.ViewPager$SavedState$1.setIconSize();
                if (!animationFromJson.onCreatePanelMenu(settextalignment.setY, settextalignment.ViewPager$SavedState$1)) {
                    settextalignment.MenuHostHelper$$ExternalSyntheticLambda0(null);
                    if (z && (setstrokecolorresource = this.setFilterTouchesWhenObscured) != null) {
                        setstrokecolorresource.setMenu(null, this.SearchView$SavedState$1);
                    }
                    return false;
                }
                settextalignment.setCenterIfNoTextEnabled = false;
            }
            settextalignment.ViewPager$SavedState$1.setIconSize();
            if (settextalignment.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                settextalignment.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0(settextalignment.MenuHostHelper$$ExternalSyntheticLambda0);
                settextalignment.MenuHostHelper$$ExternalSyntheticLambda0 = null;
            }
            if (!animationFromJson.onPreparePanel(0, settextalignment.MenuHostHelper$$ExternalSyntheticLambda1, settextalignment.ViewPager$SavedState$1)) {
                if (z && (setstrokecolorresource2 = this.setFilterTouchesWhenObscured) != null) {
                    setstrokecolorresource2.setMenu(null, this.SearchView$SavedState$1);
                }
                settextalignment.ViewPager$SavedState$1.setUiOptions();
                return false;
            }
            settextalignment.setIconSize = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            settextalignment.ViewPager$SavedState$1.setQwertyMode(settextalignment.setIconSize);
            settextalignment.ViewPager$SavedState$1.setUiOptions();
        }
        settextalignment.setOnLongClickListener = true;
        settextalignment.setNavigationOnClickListener = false;
        this.FirebaseRemoteConfigKtxRegistrar = settextalignment;
        return true;
    }

    void MenuHostHelper$$ExternalSyntheticLambda0(setNavigationIconTint setnavigationicontint) {
        if (this.FragmentStateAdapter$2) {
            return;
        }
        this.FragmentStateAdapter$2 = true;
        this.setFilterTouchesWhenObscured.setY();
        Window.Callback animationFromJson = setAnimationFromJson();
        if (animationFromJson != null && !this.setLayoutAnimation) {
            animationFromJson.onPanelClosed(108, setnavigationicontint);
        }
        this.FragmentStateAdapter$2 = false;
    }

    void setX(int i) {
        setIconTintList(MenuHostHelper$$ExternalSyntheticLambda1(i, true), true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIconTintList(setTextAlignment settextalignment, boolean z) {
        setStrokeColorResource setstrokecolorresource;
        if (z && settextalignment.setY == 0 && (setstrokecolorresource = this.setFilterTouchesWhenObscured) != null && setstrokecolorresource.setNavigationOnClickListener()) {
            MenuHostHelper$$ExternalSyntheticLambda0(settextalignment.ViewPager$SavedState$1);
            return;
        }
        WindowManager windowManager = (WindowManager) this.setUiOptions.getSystemService("window");
        if (windowManager != null && settextalignment.setLayoutAnimation && settextalignment.setIconTintList != null) {
            windowManager.removeView(settextalignment.setIconTintList);
            if (z) {
                MenuHostHelper$$ExternalSyntheticLambda1(settextalignment.setY, settextalignment, null);
            }
        }
        settextalignment.setOnLongClickListener = false;
        settextalignment.setNavigationOnClickListener = false;
        settextalignment.setLayoutAnimation = false;
        settextalignment.setAnimationFromJson = null;
        settextalignment.setTextAlignment = true;
        if (this.FirebaseRemoteConfigKtxRegistrar == settextalignment) {
            this.FirebaseRemoteConfigKtxRegistrar = null;
        }
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda1(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            setTextAlignment MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(i, true);
            if (MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation) {
                return false;
            }
            return MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda1, keyEvent);
        }
        return false;
    }

    private boolean setX(int i, KeyEvent keyEvent) {
        boolean z;
        setStrokeColorResource setstrokecolorresource;
        if (this.setY != null) {
            return false;
        }
        boolean z2 = true;
        setTextAlignment MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(i, true);
        if (i == 0 && (setstrokecolorresource = this.setFilterTouchesWhenObscured) != null && setstrokecolorresource.MenuHostHelper$$ExternalSyntheticLambda1() && !ViewConfiguration.get(this.setUiOptions).hasPermanentMenuKey()) {
            if (!this.setFilterTouchesWhenObscured.setNavigationOnClickListener()) {
                if (!this.setLayoutAnimation && MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda1, keyEvent)) {
                    z2 = this.setFilterTouchesWhenObscured.setUnboundedRipple();
                }
                z2 = false;
            } else {
                z2 = this.setFilterTouchesWhenObscured.setX();
            }
        } else if (MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation || MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener) {
            boolean z3 = MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation;
            setIconTintList(MenuHostHelper$$ExternalSyntheticLambda1, true);
            z2 = z3;
        } else {
            if (MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener) {
                if (MenuHostHelper$$ExternalSyntheticLambda1.setCenterIfNoTextEnabled) {
                    MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener = false;
                    z = MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda1, keyEvent);
                } else {
                    z = true;
                }
                if (z) {
                    setX(MenuHostHelper$$ExternalSyntheticLambda1, keyEvent);
                }
            }
            z2 = false;
        }
        if (z2) {
            AudioManager audioManager = (AudioManager) this.setUiOptions.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda1(int i, setTextAlignment settextalignment, Menu menu) {
        if (menu == null) {
            if (settextalignment == null && i >= 0) {
                setTextAlignment[] settextalignmentArr = this.setChipSpacingVertical;
                if (i < settextalignmentArr.length) {
                    settextalignment = settextalignmentArr[i];
                }
            }
            if (settextalignment != null) {
                menu = settextalignment.ViewPager$SavedState$1;
            }
        }
        if ((settextalignment == null || settextalignment.setLayoutAnimation) && !this.setLayoutAnimation) {
            this.ExtendableSavedState$1.setY(this.setAnimationFromJson.getCallback(), i, menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setTextAlignment MenuHostHelper$$ExternalSyntheticLambda0(Menu menu) {
        setTextAlignment[] settextalignmentArr = this.setChipSpacingVertical;
        int length = settextalignmentArr != null ? settextalignmentArr.length : 0;
        for (int i = 0; i < length; i++) {
            setTextAlignment settextalignment = settextalignmentArr[i];
            if (settextalignment != null && settextalignment.ViewPager$SavedState$1 == menu) {
                return settextalignment;
            }
        }
        return null;
    }

    protected setTextAlignment MenuHostHelper$$ExternalSyntheticLambda1(int i, boolean z) {
        setTextAlignment[] settextalignmentArr = this.setChipSpacingVertical;
        if (settextalignmentArr == null || settextalignmentArr.length <= i) {
            setTextAlignment[] settextalignmentArr2 = new setTextAlignment[i + 1];
            if (settextalignmentArr != null) {
                System.arraycopy(settextalignmentArr, 0, settextalignmentArr2, 0, settextalignmentArr.length);
            }
            this.setChipSpacingVertical = settextalignmentArr2;
            settextalignmentArr = settextalignmentArr2;
        }
        setTextAlignment settextalignment = settextalignmentArr[i];
        if (settextalignment == null) {
            setTextAlignment settextalignment2 = new setTextAlignment(i);
            settextalignmentArr[i] = settextalignment2;
            return settextalignment2;
        }
        return settextalignment;
    }

    private boolean setX(setTextAlignment settextalignment, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((settextalignment.setOnLongClickListener || MenuHostHelper$$ExternalSyntheticLambda1(settextalignment, keyEvent)) && settextalignment.ViewPager$SavedState$1 != null) {
            z = settextalignment.ViewPager$SavedState$1.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.setFilterTouchesWhenObscured == null) {
            setIconTintList(settextalignment, true);
        }
        return z;
    }

    private void setOnLongClickListener(int i) {
        this.setCenterIfNoTextEnabled = (1 << i) | this.setCenterIfNoTextEnabled;
        if (this.ViewPager$SavedState$1) {
            return;
        }
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(this.setAnimationFromJson.getDecorView(), this.setFloatValues);
        this.ViewPager$SavedState$1 = true;
    }

    void setLayoutAnimation(int i) {
        setTextAlignment MenuHostHelper$$ExternalSyntheticLambda1;
        setTextAlignment MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(i, true);
        if (MenuHostHelper$$ExternalSyntheticLambda12.ViewPager$SavedState$1 != null) {
            Bundle bundle = new Bundle();
            MenuHostHelper$$ExternalSyntheticLambda12.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1(bundle);
            if (bundle.size() > 0) {
                MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda0 = bundle;
            }
            MenuHostHelper$$ExternalSyntheticLambda12.ViewPager$SavedState$1.setIconSize();
            MenuHostHelper$$ExternalSyntheticLambda12.ViewPager$SavedState$1.clear();
        }
        MenuHostHelper$$ExternalSyntheticLambda12.setCenterIfNoTextEnabled = true;
        MenuHostHelper$$ExternalSyntheticLambda12.setTextAlignment = true;
        if ((i != 108 && i != 0) || this.setFilterTouchesWhenObscured == null || (MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(0, false)) == null) {
            return;
        }
        MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener = false;
        MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda1, (KeyEvent) null);
    }

    final int setY(WindowInsetsCompat windowInsetsCompat, Rect rect) {
        int i;
        boolean z;
        boolean z2;
        if (windowInsetsCompat != null) {
            i = windowInsetsCompat.setUiOptions();
        } else {
            i = rect != null ? rect.top : 0;
        }
        setRowOrderPreserved setroworderpreserved = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setroworderpreserved == null || !(setroworderpreserved.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.MenuHostHelper$$ExternalSyntheticLambda0.getLayoutParams();
            if (this.MenuHostHelper$$ExternalSyntheticLambda0.isShown()) {
                if (this.setTooltipText == null) {
                    this.setTooltipText = new Rect();
                    this.onActivityResumed = new Rect();
                }
                Rect rect2 = this.setTooltipText;
                Rect rect3 = this.onActivityResumed;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.setNavigationOnClickListener(), windowInsetsCompat.setUiOptions(), windowInsetsCompat.setOnLongClickListener(), windowInsetsCompat.setUnboundedRipple());
                }
                setTabMode.setY(this.setMaxEms, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                WindowInsetsCompat z3 = setBaselineAlignBottom.setZ(this.setMaxEms);
                int navigationOnClickListener = z3 == null ? 0 : z3.setNavigationOnClickListener();
                int onLongClickListener = z3 == null ? 0 : z3.setOnLongClickListener();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 > 0 && this.setShrinkMotionSpec == null) {
                    View view = new View(this.setUiOptions);
                    this.setShrinkMotionSpec = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = navigationOnClickListener;
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = onLongClickListener;
                    this.setMaxEms.addView(this.setShrinkMotionSpec, -1, layoutParams);
                } else {
                    View view2 = this.setShrinkMotionSpec;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        if (((ViewGroup.LayoutParams) marginLayoutParams2).height != marginLayoutParams.topMargin || marginLayoutParams2.leftMargin != navigationOnClickListener || marginLayoutParams2.rightMargin != onLongClickListener) {
                            ((ViewGroup.LayoutParams) marginLayoutParams2).height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = navigationOnClickListener;
                            marginLayoutParams2.rightMargin = onLongClickListener;
                            this.setShrinkMotionSpec.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.setShrinkMotionSpec;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    setIconTintList(this.setShrinkMotionSpec);
                }
                if (!this.setOnNavigationItemSelectedListener && z) {
                    i = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = false;
            }
            if (z2) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.setShrinkMotionSpec;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return i;
    }

    private void setIconTintList(View view) {
        int y;
        if ((setBaselineAlignBottom.setMinAndMaxProgress(view) & 8192) != 0) {
            y = setLineHeight.setY(this.setUiOptions, R.color.res_0x7f060006);
        } else {
            y = setLineHeight.setY(this.setUiOptions, R.color.res_0x7f060005);
        }
        view.setBackgroundColor(y);
    }

    private void setChipIconTintResource() {
        if (this.setError) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private int setUiOptions(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        } else {
            return i;
        }
    }

    void setIconSize() {
        setStrokeColorResource setstrokecolorresource = this.setFilterTouchesWhenObscured;
        if (setstrokecolorresource != null) {
            setstrokecolorresource.setY();
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            this.setAnimationFromJson.getDecorView().removeCallbacks(this.setTextScaleX);
            if (this.MenuHostHelper$$ExternalSyntheticLambda1.isShowing()) {
                try {
                    this.MenuHostHelper$$ExternalSyntheticLambda1.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        }
        setChipCornerRadius();
        setTextAlignment MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(0, false);
        if (MenuHostHelper$$ExternalSyntheticLambda1 == null || MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1 == null) {
            return;
        }
        MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1.close();
    }

    public boolean ViewPager$SavedState$1() {
        return setX(true);
    }

    private boolean setX(boolean z) {
        if (this.setLayoutAnimation) {
            return false;
        }
        int guidelinePercent = setGuidelinePercent();
        boolean MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(setX(this.setUiOptions, guidelinePercent), z);
        if (guidelinePercent == 0) {
            setIconTintList(this.setUiOptions).MenuHostHelper$$ExternalSyntheticLambda0();
        } else {
            setUiOptions setuioptions = this.setContentScrimResource;
            if (setuioptions != null) {
                setuioptions.setIconTintList();
            }
        }
        if (guidelinePercent == 3) {
            setX(this.setUiOptions).MenuHostHelper$$ExternalSyntheticLambda0();
        } else {
            setUiOptions setuioptions2 = this.setConstraintSet;
            if (setuioptions2 != null) {
                setuioptions2.setIconTintList();
            }
        }
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.setGuidelinePercent
    public int setIconTintList() {
        return this.setChipIconEnabled;
    }

    int setX(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i == 0) {
                    if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                        return setIconTintList(context).MenuHostHelper$$ExternalSyntheticLambda1();
                    }
                    return -1;
                } else if (i != 1 && i != 2) {
                    if (i == 3) {
                        return setX(context).MenuHostHelper$$ExternalSyntheticLambda1();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            }
            return i;
        }
        return -1;
    }

    private int setGuidelinePercent() {
        int i;
        int i2 = this.setChipIconEnabled;
        if (i2 == -100) {
            i = setGuidelinePercent.MenuHostHelper$$ExternalSyntheticLambda0;
            return i;
        }
        return i2;
    }

    private Configuration setIconTintList(Context context, int i, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda0(int i, boolean z) {
        boolean z2 = false;
        Configuration iconTintList = setIconTintList(this.setUiOptions, i, null, false);
        boolean MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(this.setUiOptions);
        Configuration configuration = this.setViewTranslationCallback;
        if (configuration == null) {
            configuration = this.setUiOptions.getResources().getConfiguration();
        }
        int i2 = configuration.uiMode & 48;
        int i3 = iconTintList.uiMode & 48;
        boolean z3 = true;
        if (i2 != i3 && z && !MenuHostHelper$$ExternalSyntheticLambda1 && this.FragmentStateAdapter$5 && (setMinAndMaxProgress || this.FloatingActionButton$BaseBehavior)) {
            Object obj = this.setUnboundedRipple;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                setColumnCount.setX((Activity) this.setUnboundedRipple);
                z2 = true;
            }
        }
        if (z2 || i2 == i3) {
            z3 = z2;
        } else {
            MenuHostHelper$$ExternalSyntheticLambda0(i3, MenuHostHelper$$ExternalSyntheticLambda1, null);
        }
        if (z3) {
            Object obj2 = this.setUnboundedRipple;
            if (obj2 instanceof setMinAndMaxProgress) {
                ((setMinAndMaxProgress) obj2).setX(i);
            }
        }
        return z3;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(int i, boolean z, Configuration configuration) {
        Object obj;
        Resources resources = this.setUiOptions.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        Map map = null;
        r9 = null;
        r9 = null;
        Object obj2 = null;
        Object obj3 = null;
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26 && Build.VERSION.SDK_INT < 28) {
            if (Build.VERSION.SDK_INT < 24) {
                if (Build.VERSION.SDK_INT >= 23) {
                    if (!FragmentStateAdapter$5.MenuHostHelper$$ExternalSyntheticLambda1) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                            FragmentStateAdapter$5.setX = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
                        }
                        FragmentStateAdapter$5.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                    }
                    Field field = FragmentStateAdapter$5.setX;
                    if (field != null) {
                        try {
                            obj3 = field.get(resources);
                        } catch (IllegalAccessException e2) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
                        }
                    }
                    if (obj3 != null) {
                        FragmentStateAdapter$5.MenuHostHelper$$ExternalSyntheticLambda1(obj3);
                    }
                } else {
                    if (!FragmentStateAdapter$5.MenuHostHelper$$ExternalSyntheticLambda1) {
                        try {
                            Field declaredField2 = Resources.class.getDeclaredField("mDrawableCache");
                            FragmentStateAdapter$5.setX = declaredField2;
                            declaredField2.setAccessible(true);
                        } catch (NoSuchFieldException e3) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e3);
                        }
                        FragmentStateAdapter$5.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                    }
                    Field field2 = FragmentStateAdapter$5.setX;
                    if (field2 != null) {
                        try {
                            map = (Map) field2.get(resources);
                        } catch (IllegalAccessException e4) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e4);
                        }
                        if (map != null) {
                            map.clear();
                        }
                    }
                }
            } else {
                if (!FragmentStateAdapter$5.setY) {
                    try {
                        Field declaredField3 = Resources.class.getDeclaredField("mResourcesImpl");
                        FragmentStateAdapter$5.MenuHostHelper$$ExternalSyntheticLambda0 = declaredField3;
                        declaredField3.setAccessible(true);
                    } catch (NoSuchFieldException e5) {
                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e5);
                    }
                    FragmentStateAdapter$5.setY = true;
                }
                Field field3 = FragmentStateAdapter$5.MenuHostHelper$$ExternalSyntheticLambda0;
                if (field3 != null) {
                    try {
                        obj = field3.get(resources);
                    } catch (IllegalAccessException e6) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e6);
                        obj = null;
                    }
                    if (obj != null) {
                        if (!FragmentStateAdapter$5.MenuHostHelper$$ExternalSyntheticLambda1) {
                            try {
                                Field declaredField4 = obj.getClass().getDeclaredField("mDrawableCache");
                                FragmentStateAdapter$5.setX = declaredField4;
                                declaredField4.setAccessible(true);
                            } catch (NoSuchFieldException e7) {
                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e7);
                            }
                            FragmentStateAdapter$5.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                        }
                        Field field4 = FragmentStateAdapter$5.setX;
                        if (field4 != null) {
                            try {
                                obj2 = field4.get(obj);
                            } catch (IllegalAccessException e8) {
                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e8);
                            }
                        }
                        if (obj2 != null) {
                            FragmentStateAdapter$5.MenuHostHelper$$ExternalSyntheticLambda1(obj2);
                        }
                    }
                }
            }
        }
        int i2 = this.getCallingPid;
        if (i2 != 0) {
            this.setUiOptions.setTheme(i2);
            if (Build.VERSION.SDK_INT >= 23) {
                this.setUiOptions.getTheme().applyStyle(this.getCallingPid, true);
            }
        }
        if (z) {
            Object obj4 = this.setUnboundedRipple;
            if (obj4 instanceof Activity) {
                Activity activity = (Activity) obj4;
                if (!(activity instanceof setTouchDelegate)) {
                    if (!this.FloatingActionButton$BaseBehavior || this.setLayoutAnimation) {
                        return;
                    }
                    activity.onConfigurationChanged(configuration2);
                    return;
                }
                if (((setTouchDelegate) activity).MenuHostHelper$$ExternalSyntheticLambda1().MenuHostHelper$$ExternalSyntheticLambda0().compareTo(registerIn$MenuHostHelper$$ExternalSyntheticLambda1.CREATED) >= 0) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    private setUiOptions setIconTintList(Context context) {
        if (this.setContentScrimResource == null) {
            if (FloatingActionButton$BaseBehavior.setY == null) {
                Context applicationContext = context.getApplicationContext();
                FloatingActionButton$BaseBehavior.setY = new FloatingActionButton$BaseBehavior(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.setContentScrimResource = new setIconSize(FloatingActionButton$BaseBehavior.setY);
        }
        return this.setContentScrimResource;
    }

    private setUiOptions setX(Context context) {
        if (this.setConstraintSet == null) {
            this.setConstraintSet = new setUnboundedRipple(context);
        }
        return this.setConstraintSet;
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda1(Context context) {
        int i;
        if (!this.setChipIconTintResource && (this.setUnboundedRipple instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i = 269221888;
                } else {
                    i = Build.VERSION.SDK_INT >= 24 ? 786432 : 0;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.setUnboundedRipple.getClass()), i);
                this.setHasDecor = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.setHasDecor = false;
            }
        }
        this.setChipIconTintResource = true;
        return this.setHasDecor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class setY implements setBackgroundTintMode.setY {
        setY() {
        }

        @Override // o.setBackgroundTintMode.setY
        public final boolean setY(setNavigationIconTint setnavigationicontint) {
            Window.Callback animationFromJson = setIconified.this.setAnimationFromJson();
            if (animationFromJson != null) {
                animationFromJson.onMenuOpened(108, setnavigationicontint);
                return true;
            }
            return true;
        }

        @Override // o.setBackgroundTintMode.setY
        public final void MenuHostHelper$$ExternalSyntheticLambda0(setNavigationIconTint setnavigationicontint, boolean z) {
            setIconified.this.MenuHostHelper$$ExternalSyntheticLambda0(setnavigationicontint);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static final class setTextAlignment {
        Bundle MenuHostHelper$$ExternalSyntheticLambda0;
        View MenuHostHelper$$ExternalSyntheticLambda1;
        setNavigationIconTint ViewPager$SavedState$1;
        View setAnimationFromJson;
        boolean setCenterIfNoTextEnabled;
        Context setChipCornerRadius;
        public boolean setIconSize;
        ViewGroup setIconTintList;
        boolean setLayoutAnimation;
        int setMaxEms;
        boolean setNavigationOnClickListener;
        boolean setOnLongClickListener;
        int setOnNavigationItemSelectedListener;
        boolean setTextAlignment = false;
        int setUiOptions;
        setRevealInfo setUnboundedRipple;
        int setX;
        int setY;
        int setZ;

        setTextAlignment(int i) {
            this.setY = i;
        }

        public final boolean setY() {
            if (this.setAnimationFromJson == null) {
                return false;
            }
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                return true;
            }
            setRevealInfo setrevealinfo = this.setUnboundedRipple;
            if (setrevealinfo.setX == null) {
                setrevealinfo.setX = new setRevealInfo.setY();
            }
            return setrevealinfo.setX.getCount() > 0;
        }

        final void setIconTintList(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(R.attr.res_0x7f040004, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(R.attr.res_0x7f040338, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(R.style._res_0x7f1501e9, true);
            }
            setTitleMarginEnd settitlemarginend = new setTitleMarginEnd(context, 0);
            settitlemarginend.getTheme().setTo(newTheme);
            this.setChipCornerRadius = settitlemarginend;
            TypedArray obtainStyledAttributes = settitlemarginend.obtainStyledAttributes(setAnimationFromJson.setY.minusKey);
            this.setX = obtainStyledAttributes.getResourceId(setAnimationFromJson.setY.setOnScrollChangeListener, 0);
            this.setZ = obtainStyledAttributes.getResourceId(setAnimationFromJson.setY.setCallingWorkSourceUid, 0);
            obtainStyledAttributes.recycle();
        }

        final void MenuHostHelper$$ExternalSyntheticLambda0(setNavigationIconTint setnavigationicontint) {
            setRevealInfo setrevealinfo;
            setNavigationIconTint setnavigationicontint2 = this.ViewPager$SavedState$1;
            if (setnavigationicontint == setnavigationicontint2) {
                return;
            }
            if (setnavigationicontint2 != null) {
                setnavigationicontint2.setX(this.setUnboundedRipple);
            }
            this.ViewPager$SavedState$1 = setnavigationicontint;
            if (setnavigationicontint == null || (setrevealinfo = this.setUnboundedRipple) == null) {
                return;
            }
            setnavigationicontint.setIconTintList(setrevealinfo, setnavigationicontint.MenuHostHelper$$ExternalSyntheticLambda0);
        }

        final TextInputLayout$SavedState$1 setY(setBackgroundTintMode.setY sety) {
            if (this.ViewPager$SavedState$1 == null) {
                return null;
            }
            if (this.setUnboundedRipple == null) {
                setRevealInfo setrevealinfo = new setRevealInfo(this.setChipCornerRadius, R.layout.res_0x7f0d0010);
                this.setUnboundedRipple = setrevealinfo;
                setrevealinfo.setY = sety;
                setNavigationIconTint setnavigationicontint = this.ViewPager$SavedState$1;
                setnavigationicontint.setIconTintList(this.setUnboundedRipple, setnavigationicontint.MenuHostHelper$$ExternalSyntheticLambda0);
            }
            setRevealInfo setrevealinfo2 = this.setUnboundedRipple;
            ViewGroup viewGroup = this.setIconTintList;
            if (setrevealinfo2.setLayoutAnimation == null) {
                setrevealinfo2.setLayoutAnimation = (Fragment$5) setrevealinfo2.MenuHostHelper$$ExternalSyntheticLambda1.inflate(R.layout.res_0x7f0d000d, viewGroup, false);
                if (setrevealinfo2.setX == null) {
                    setrevealinfo2.setX = new setRevealInfo.setY();
                }
                setrevealinfo2.setLayoutAnimation.setAdapter((ListAdapter) setrevealinfo2.setX);
                setrevealinfo2.setLayoutAnimation.setOnItemClickListener(setrevealinfo2);
            }
            return setrevealinfo2.setLayoutAnimation;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setChipCornerRadius extends getView {
        public setChipCornerRadius(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return setIconified.this.setY(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && setY((int) motionEvent.getX(), (int) motionEvent.getY())) {
                setIconified.this.setX(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(setFilterTouchesWhenObscured.setIconTintList(getContext(), i));
        }

        private boolean setY(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setNavigationOnClickListener extends setFilterRedundantCalls {
        private boolean MenuHostHelper$$ExternalSyntheticLambda1;
        private boolean setOnLongClickListener;
        private boolean setX;
        private setIconTintList setY;

        setNavigationOnClickListener(Window.Callback callback) {
            super(callback);
        }

        void MenuHostHelper$$ExternalSyntheticLambda1(setIconTintList seticontintlist) {
            this.setY = seticontintlist;
        }

        @Override // o.setFilterRedundantCalls, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.setX) {
                return MenuHostHelper$$ExternalSyntheticLambda1().dispatchKeyEvent(keyEvent);
            }
            return setIconified.this.setY(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // o.setFilterRedundantCalls, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || setIconified.this.setIconTintList(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // o.setFilterRedundantCalls, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof setNavigationIconTint)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // o.setFilterRedundantCalls, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            View y;
            setIconTintList seticontintlist = this.setY;
            return (seticontintlist == null || (y = seticontintlist.setY(i)) == null) ? super.onCreatePanelView(i) : y;
        }

        @Override // o.setFilterRedundantCalls, android.view.Window.Callback
        public void onContentChanged() {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                MenuHostHelper$$ExternalSyntheticLambda1().onContentChanged();
            }
        }

        @Override // o.setFilterRedundantCalls, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            setNavigationIconTint setnavigationicontint = menu instanceof setNavigationIconTint ? (setNavigationIconTint) menu : null;
            if (i == 0 && setnavigationicontint == null) {
                return false;
            }
            boolean z = true;
            if (setnavigationicontint != null) {
                setnavigationicontint.setY(true);
            }
            setIconTintList seticontintlist = this.setY;
            z = (seticontintlist == null || !seticontintlist.setIconTintList(i)) ? false : false;
            if (!z) {
                z = super.onPreparePanel(i, view, menu);
            }
            if (setnavigationicontint != null) {
                setnavigationicontint.setY(false);
            }
            return z;
        }

        @Override // o.setFilterRedundantCalls, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            setIconified.this.setNavigationOnClickListener(i);
            return true;
        }

        @Override // o.setFilterRedundantCalls, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            if (this.setOnLongClickListener) {
                MenuHostHelper$$ExternalSyntheticLambda1().onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            setIconified.this.setUnboundedRipple(i);
        }

        @Override // o.setFilterRedundantCalls, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (setIconified.this.setTextScaleX()) {
                return setY(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [o.setError$MenuHostHelper$$ExternalSyntheticLambda0, o.setChipIconEnabled$setY] */
        final ActionMode setY(ActionMode.Callback callback) {
            ?? r0 = new setChipIconEnabled.setY(setIconified.this.setUiOptions, callback) { // from class: o.setError$MenuHostHelper$$ExternalSyntheticLambda0
                final ActionMode.Callback MenuHostHelper$$ExternalSyntheticLambda1;
                final Context setX;
                final ArrayList<setError> setIconTintList = new ArrayList<>();
                final setDividerHeight<Menu, Menu> setY = new setDividerHeight<>();

                {
                    this.setX = r1;
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = callback;
                }

                @Override // o.setChipIconEnabled.setY
                public final boolean setY(setChipIconEnabled setchipiconenabled, Menu menu) {
                    return this.MenuHostHelper$$ExternalSyntheticLambda1.onCreateActionMode(setY(setchipiconenabled), MenuHostHelper$$ExternalSyntheticLambda1(menu));
                }

                @Override // o.setChipIconEnabled.setY
                public final boolean MenuHostHelper$$ExternalSyntheticLambda1(setChipIconEnabled setchipiconenabled, Menu menu) {
                    return this.MenuHostHelper$$ExternalSyntheticLambda1.onPrepareActionMode(setY(setchipiconenabled), MenuHostHelper$$ExternalSyntheticLambda1(menu));
                }

                @Override // o.setChipIconEnabled.setY
                public final boolean setY(setChipIconEnabled setchipiconenabled, MenuItem menuItem) {
                    return this.MenuHostHelper$$ExternalSyntheticLambda1.onActionItemClicked(setY(setchipiconenabled), new setEmptyView(this.setX, (setCustomSelectionActionModeCallback) menuItem));
                }

                @Override // o.setChipIconEnabled.setY
                public final void MenuHostHelper$$ExternalSyntheticLambda0(setChipIconEnabled setchipiconenabled) {
                    this.MenuHostHelper$$ExternalSyntheticLambda1.onDestroyActionMode(setY(setchipiconenabled));
                }

                private Menu MenuHostHelper$$ExternalSyntheticLambda1(Menu menu) {
                    Menu menu2 = this.setY.get(menu);
                    if (menu2 == null) {
                        setChipSpacingHorizontal setchipspacinghorizontal = new setChipSpacingHorizontal(this.setX, (setVerticalFadingEdgeEnabled) menu);
                        this.setY.put(menu, setchipspacinghorizontal);
                        return setchipspacinghorizontal;
                    }
                    return menu2;
                }

                public final ActionMode setY(setChipIconEnabled setchipiconenabled) {
                    int size = this.setIconTintList.size();
                    for (int i = 0; i < size; i++) {
                        setError seterror = this.setIconTintList.get(i);
                        if (seterror != null && seterror.setY == setchipiconenabled) {
                            return seterror;
                        }
                    }
                    setError seterror2 = new setError(this.setX, setchipiconenabled);
                    this.setIconTintList.add(seterror2);
                    return seterror2;
                }
            };
            setChipIconEnabled MenuHostHelper$$ExternalSyntheticLambda0 = setIconified.this.MenuHostHelper$$ExternalSyntheticLambda0((setChipIconEnabled.setY) r0);
            if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                return r0.setY(MenuHostHelper$$ExternalSyntheticLambda0);
            }
            return null;
        }

        @Override // o.setFilterRedundantCalls, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (setIconified.this.setTextScaleX() && i == 0) {
                return setY(callback);
            }
            return super.onWindowStartingActionMode(callback, i);
        }

        @Override // o.setFilterRedundantCalls, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            setTextAlignment MenuHostHelper$$ExternalSyntheticLambda1 = setIconified.this.MenuHostHelper$$ExternalSyntheticLambda1(0, true);
            if (MenuHostHelper$$ExternalSyntheticLambda1 != null && MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1 != null) {
                super.onProvideKeyboardShortcuts(list, MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        public void setIconTintList(Window.Callback callback) {
            try {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                callback.onContentChanged();
            } finally {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
            }
        }

        public boolean setX(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.setX = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.setX = false;
            }
        }

        public void setY(Window.Callback callback, int i, Menu menu) {
            try {
                this.setOnLongClickListener = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.setOnLongClickListener = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public abstract class setUiOptions {
        private BroadcastReceiver setX;

        abstract int MenuHostHelper$$ExternalSyntheticLambda1();

        abstract IntentFilter setX();

        abstract void setY();

        setUiOptions() {
        }

        void MenuHostHelper$$ExternalSyntheticLambda0() {
            setIconTintList();
            IntentFilter x = setX();
            if (x == null || x.countActions() == 0) {
                return;
            }
            if (this.setX == null) {
                this.setX = new BroadcastReceiver() { // from class: o.setIconified.setUiOptions.5
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        setUiOptions.this.setY();
                    }
                };
            }
            setIconified.this.setUiOptions.registerReceiver(this.setX, x);
        }

        void setIconTintList() {
            if (this.setX != null) {
                try {
                    setIconified.this.setUiOptions.unregisterReceiver(this.setX);
                } catch (IllegalArgumentException unused) {
                }
                this.setX = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setIconSize extends setUiOptions {
        private final FloatingActionButton$BaseBehavior setIconTintList;

        setIconSize(FloatingActionButton$BaseBehavior floatingActionButton$BaseBehavior) {
            super();
            this.setIconTintList = floatingActionButton$BaseBehavior;
        }

        @Override // o.setIconified.setUiOptions
        public int MenuHostHelper$$ExternalSyntheticLambda1() {
            boolean z;
            long j;
            FloatingActionButton$BaseBehavior floatingActionButton$BaseBehavior = this.setIconTintList;
            FloatingActionButton$BaseBehavior$MenuHostHelper$$ExternalSyntheticLambda1 floatingActionButton$BaseBehavior$MenuHostHelper$$ExternalSyntheticLambda1 = floatingActionButton$BaseBehavior.MenuHostHelper$$ExternalSyntheticLambda1;
            if (floatingActionButton$BaseBehavior.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList > System.currentTimeMillis()) {
                z = floatingActionButton$BaseBehavior$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
            } else {
                Context context = floatingActionButton$BaseBehavior.MenuHostHelper$$ExternalSyntheticLambda0;
                Location x = setTransitionName.setIconTintList(context, "android.permission.ACCESS_COARSE_LOCATION", Process.myPid(), Process.myUid(), context.getPackageName()) == 0 ? floatingActionButton$BaseBehavior.setX("network") : null;
                Context context2 = floatingActionButton$BaseBehavior.MenuHostHelper$$ExternalSyntheticLambda0;
                Location x2 = setTransitionName.setIconTintList(context2, "android.permission.ACCESS_FINE_LOCATION", Process.myPid(), Process.myUid(), context2.getPackageName()) == 0 ? floatingActionButton$BaseBehavior.setX("gps") : null;
                if (x2 == null || x == null ? x2 != null : x2.getTime() > x.getTime()) {
                    x = x2;
                }
                if (x == null) {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i = Calendar.getInstance().get(11);
                    z = (i < 6 || i >= 22) ? true : true;
                } else {
                    FloatingActionButton$BaseBehavior$MenuHostHelper$$ExternalSyntheticLambda1 floatingActionButton$BaseBehavior$MenuHostHelper$$ExternalSyntheticLambda12 = floatingActionButton$BaseBehavior.MenuHostHelper$$ExternalSyntheticLambda1;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (setConstraintSet.setY == null) {
                        setConstraintSet.setY = new setConstraintSet();
                    }
                    setConstraintSet setconstraintset = setConstraintSet.setY;
                    setconstraintset.setY(currentTimeMillis - 86400000, x.getLatitude(), x.getLongitude());
                    long j2 = setconstraintset.setX;
                    setconstraintset.setY(currentTimeMillis, x.getLatitude(), x.getLongitude());
                    r7 = setconstraintset.MenuHostHelper$$ExternalSyntheticLambda0 == 1;
                    long j3 = setconstraintset.setIconTintList;
                    long j4 = setconstraintset.setX;
                    setconstraintset.setY(currentTimeMillis + 86400000, x.getLatitude(), x.getLongitude());
                    long j5 = setconstraintset.setIconTintList;
                    if (j3 == -1 || j4 == -1) {
                        j = 43200000;
                    } else {
                        currentTimeMillis = currentTimeMillis > j4 ? j5 : currentTimeMillis > j3 ? j4 : j3;
                        j = 60000;
                    }
                    floatingActionButton$BaseBehavior$MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda0 = r7;
                    floatingActionButton$BaseBehavior$MenuHostHelper$$ExternalSyntheticLambda12.setUiOptions = j2;
                    floatingActionButton$BaseBehavior$MenuHostHelper$$ExternalSyntheticLambda12.setX = j3;
                    floatingActionButton$BaseBehavior$MenuHostHelper$$ExternalSyntheticLambda12.setY = j4;
                    floatingActionButton$BaseBehavior$MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda1 = j5;
                    floatingActionButton$BaseBehavior$MenuHostHelper$$ExternalSyntheticLambda12.setIconTintList = currentTimeMillis + j;
                    z = floatingActionButton$BaseBehavior$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
                }
            }
            return z ? 2 : 1;
        }

        @Override // o.setIconified.setUiOptions
        public void setY() {
            setIconified.this.ViewPager$SavedState$1();
        }

        @Override // o.setIconified.setUiOptions
        IntentFilter setX() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setUnboundedRipple extends setUiOptions {
        private final PowerManager MenuHostHelper$$ExternalSyntheticLambda0;

        setUnboundedRipple(Context context) {
            super();
            this.MenuHostHelper$$ExternalSyntheticLambda0 = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // o.setIconified.setUiOptions
        public int MenuHostHelper$$ExternalSyntheticLambda1() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0.isPowerSaveMode() ? 2 : 1;
        }

        @Override // o.setIconified.setUiOptions
        public void setY() {
            setIconified.this.ViewPager$SavedState$1();
        }

        @Override // o.setIconified.setUiOptions
        IntentFilter setX() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }
    }

    private static Configuration MenuHostHelper$$ExternalSyntheticLambda1(Configuration configuration, Configuration configuration2) {
        boolean x;
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            if (configuration.fontScale != configuration2.fontScale) {
                configuration3.fontScale = configuration2.fontScale;
            }
            if (configuration.mcc != configuration2.mcc) {
                configuration3.mcc = configuration2.mcc;
            }
            if (configuration.mnc != configuration2.mnc) {
                configuration3.mnc = configuration2.mnc;
            }
            if (Build.VERSION.SDK_INT < 24) {
                x = setAllowStacking.setX.setX(configuration.locale, configuration2.locale);
                if (!x) {
                    configuration3.locale = configuration2.locale;
                }
            } else {
                setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda1(configuration, configuration2, configuration3);
            }
            if (configuration.touchscreen != configuration2.touchscreen) {
                configuration3.touchscreen = configuration2.touchscreen;
            }
            if (configuration.keyboard != configuration2.keyboard) {
                configuration3.keyboard = configuration2.keyboard;
            }
            if (configuration.keyboardHidden != configuration2.keyboardHidden) {
                configuration3.keyboardHidden = configuration2.keyboardHidden;
            }
            if (configuration.navigation != configuration2.navigation) {
                configuration3.navigation = configuration2.navigation;
            }
            if (configuration.navigationHidden != configuration2.navigationHidden) {
                configuration3.navigationHidden = configuration2.navigationHidden;
            }
            if (configuration.orientation != configuration2.orientation) {
                configuration3.orientation = configuration2.orientation;
            }
            if ((configuration.screenLayout & 15) != (configuration2.screenLayout & 15)) {
                configuration3.screenLayout |= configuration2.screenLayout & 15;
            }
            if ((configuration.screenLayout & 192) != (configuration2.screenLayout & 192)) {
                configuration3.screenLayout |= configuration2.screenLayout & 192;
            }
            if ((configuration.screenLayout & 48) != (configuration2.screenLayout & 48)) {
                configuration3.screenLayout |= configuration2.screenLayout & 48;
            }
            if ((configuration.screenLayout & 768) != (configuration2.screenLayout & 768)) {
                configuration3.screenLayout |= configuration2.screenLayout & 768;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0(configuration, configuration2, configuration3);
            }
            if ((configuration.uiMode & 15) != (configuration2.uiMode & 15)) {
                configuration3.uiMode |= configuration2.uiMode & 15;
            }
            if ((configuration.uiMode & 48) != (configuration2.uiMode & 48)) {
                configuration3.uiMode |= configuration2.uiMode & 48;
            }
            if (configuration.screenWidthDp != configuration2.screenWidthDp) {
                configuration3.screenWidthDp = configuration2.screenWidthDp;
            }
            if (configuration.screenHeightDp != configuration2.screenHeightDp) {
                configuration3.screenHeightDp = configuration2.screenHeightDp;
            }
            if (configuration.smallestScreenWidthDp != configuration2.smallestScreenWidthDp) {
                configuration3.smallestScreenWidthDp = configuration2.smallestScreenWidthDp;
            }
            setIconified$MenuHostHelper$$ExternalSyntheticLambda0.setX(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    /* loaded from: classes.dex */
    static class setX {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setLayoutAnimation {
        static void MenuHostHelper$$ExternalSyntheticLambda1(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales;
            LocaleList locales2;
            boolean equals;
            locales = configuration.getLocales();
            locales2 = configuration2.getLocales();
            equals = locales.equals(locales2);
            if (equals) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setOnLongClickListener {
        static void MenuHostHelper$$ExternalSyntheticLambda0(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            i = configuration.colorMode;
            int i9 = i & 3;
            i2 = configuration2.colorMode;
            if (i9 != (i2 & 3)) {
                i7 = configuration3.colorMode;
                i8 = configuration2.colorMode;
                configuration3.colorMode = i7 | (i8 & 3);
            }
            i3 = configuration.colorMode;
            int i10 = i3 & 12;
            i4 = configuration2.colorMode;
            if (i10 != (i4 & 12)) {
                i5 = configuration3.colorMode;
                i6 = configuration2.colorMode;
                configuration3.colorMode = i5 | (i6 & 12);
            }
        }
    }
}