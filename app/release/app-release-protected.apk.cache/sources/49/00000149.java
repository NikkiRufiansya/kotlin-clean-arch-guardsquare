package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import o.setAnimationFromJson;
import o.setBackgroundTintMode;

/* loaded from: classes.dex */
public final class AppBarLayout$ScrollingViewBehavior implements setTransformationMethod {
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    setTranscriptMode MenuHostHelper$$ExternalSyntheticLambda1;
    private Drawable ViewPager$SavedState$1;
    private CharSequence setCenterIfNoTextEnabled;
    private int setChipCornerRadius;
    private Drawable setIconSize;
    CharSequence setIconTintList;
    private Drawable setLayoutAnimation;
    private View setMaxEms;
    private CharSequence setNavigationOnClickListener;
    private int setOnLongClickListener;
    private boolean setOnNavigationItemSelectedListener;
    private Drawable setTextAlignment;
    private int setUiOptions;
    private View setUnboundedRipple;
    private setExpandedTitleTextColor setX;
    Window.Callback setY;

    public AppBarLayout$ScrollingViewBehavior(setTranscriptMode settranscriptmode, boolean z) {
        this(settranscriptmode, z, R.string.res_0x7f140001);
    }

    private AppBarLayout$ScrollingViewBehavior(setTranscriptMode settranscriptmode, boolean z, int i) {
        int i2;
        Drawable drawable;
        this.setChipCornerRadius = 0;
        this.setOnLongClickListener = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = settranscriptmode;
        this.setIconTintList = settranscriptmode.setOnLongClickListener();
        this.setCenterIfNoTextEnabled = settranscriptmode.setUnboundedRipple();
        this.setOnNavigationItemSelectedListener = this.setIconTintList != null;
        this.ViewPager$SavedState$1 = settranscriptmode.setUiOptions();
        setExpandedHintEnabled MenuHostHelper$$ExternalSyntheticLambda0 = setExpandedHintEnabled.MenuHostHelper$$ExternalSyntheticLambda0(settranscriptmode.getContext(), null, setAnimationFromJson.setY.setIconTintList, R.attr.res_0x7f040007, 0);
        this.setLayoutAnimation = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setTextAlignment);
        if (z) {
            CharSequence unboundedRipple = MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple(setAnimationFromJson.setY.setZ);
            if (!TextUtils.isEmpty(unboundedRipple)) {
                this.setOnNavigationItemSelectedListener = true;
                MenuHostHelper$$ExternalSyntheticLambda0(unboundedRipple);
            }
            CharSequence unboundedRipple2 = MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple(setAnimationFromJson.setY.setMaxEms);
            if (!TextUtils.isEmpty(unboundedRipple2)) {
                this.setCenterIfNoTextEnabled = unboundedRipple2;
                if ((this.setUiOptions & 8) != 0) {
                    this.MenuHostHelper$$ExternalSyntheticLambda1.setSubtitle(unboundedRipple2);
                }
            }
            Drawable MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setTextScaleX);
            if (MenuHostHelper$$ExternalSyntheticLambda02 != null) {
                this.setTextAlignment = MenuHostHelper$$ExternalSyntheticLambda02;
                setMaxEms();
            }
            Drawable MenuHostHelper$$ExternalSyntheticLambda03 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setIconSize);
            if (MenuHostHelper$$ExternalSyntheticLambda03 != null) {
                this.setIconSize = MenuHostHelper$$ExternalSyntheticLambda03;
                setMaxEms();
            }
            if (this.ViewPager$SavedState$1 == null && (drawable = this.setLayoutAnimation) != null) {
                MenuHostHelper$$ExternalSyntheticLambda0(drawable);
            }
            setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setOnLongClickListener, 0));
            int navigationOnClickListener = MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener(setAnimationFromJson.setY.setUiOptions, 0);
            if (navigationOnClickListener != 0) {
                View inflate = LayoutInflater.from(this.MenuHostHelper$$ExternalSyntheticLambda1.getContext()).inflate(navigationOnClickListener, (ViewGroup) this.MenuHostHelper$$ExternalSyntheticLambda1, false);
                View view = this.setUnboundedRipple;
                if (view != null && (this.setUiOptions & 16) != 0) {
                    this.MenuHostHelper$$ExternalSyntheticLambda1.removeView(view);
                }
                this.setUnboundedRipple = inflate;
                if (inflate != null && (this.setUiOptions & 16) != 0) {
                    this.MenuHostHelper$$ExternalSyntheticLambda1.addView(inflate);
                }
                setIconTintList(this.setUiOptions | 16);
            }
            int x = MenuHostHelper$$ExternalSyntheticLambda0.setX(setAnimationFromJson.setY.ViewPager$SavedState$1, 0);
            if (x > 0) {
                ViewGroup.LayoutParams layoutParams = this.MenuHostHelper$$ExternalSyntheticLambda1.getLayoutParams();
                layoutParams.height = x;
                this.MenuHostHelper$$ExternalSyntheticLambda1.setLayoutParams(layoutParams);
            }
            int MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setAnimationFromJson.setY.setUnboundedRipple, -1);
            int MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setAnimationFromJson.setY.setNavigationOnClickListener, -1);
            if (MenuHostHelper$$ExternalSyntheticLambda1 >= 0 || MenuHostHelper$$ExternalSyntheticLambda12 >= 0) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.setContentInsetsRelative(Math.max(MenuHostHelper$$ExternalSyntheticLambda1, 0), Math.max(MenuHostHelper$$ExternalSyntheticLambda12, 0));
            }
            int navigationOnClickListener2 = MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener(setAnimationFromJson.setY.setCheckedIconEnabled, 0);
            if (navigationOnClickListener2 != 0) {
                setTranscriptMode settranscriptmode2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                settranscriptmode2.setTitleTextAppearance(settranscriptmode2.getContext(), navigationOnClickListener2);
            }
            int navigationOnClickListener3 = MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener(setAnimationFromJson.setY.setOnNavigationItemSelectedListener, 0);
            if (navigationOnClickListener3 != 0) {
                setTranscriptMode settranscriptmode3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                settranscriptmode3.setSubtitleTextAppearance(settranscriptmode3.getContext(), navigationOnClickListener3);
            }
            int navigationOnClickListener4 = MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener(setAnimationFromJson.setY.setAnimationFromJson, 0);
            if (navigationOnClickListener4 != 0) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.setPopupTheme(navigationOnClickListener4);
            }
        } else {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions() != null) {
                this.setLayoutAnimation = this.MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions();
                i2 = 15;
            } else {
                i2 = 11;
            }
            this.setUiOptions = i2;
        }
        MenuHostHelper$$ExternalSyntheticLambda0.setX();
        setY(R.string.res_0x7f140001);
        this.setNavigationOnClickListener = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0();
        this.MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.AppBarLayout$ScrollingViewBehavior.2
            final setHint MenuHostHelper$$ExternalSyntheticLambda1;

            {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = new setHint(AppBarLayout$ScrollingViewBehavior.this.MenuHostHelper$$ExternalSyntheticLambda1.getContext(), AppBarLayout$ScrollingViewBehavior.this.setIconTintList);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (AppBarLayout$ScrollingViewBehavior.this.setY == null || !AppBarLayout$ScrollingViewBehavior.this.MenuHostHelper$$ExternalSyntheticLambda0) {
                    return;
                }
                AppBarLayout$ScrollingViewBehavior.this.setY.onMenuItemSelected(0, this.MenuHostHelper$$ExternalSyntheticLambda1);
            }
        });
    }

    private void setY(int i) {
        if (i == this.setOnLongClickListener) {
            return;
        }
        this.setOnLongClickListener = i;
        if (TextUtils.isEmpty(this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0())) {
            int i2 = this.setOnLongClickListener;
            this.setNavigationOnClickListener = i2 == 0 ? null : MenuHostHelper$$ExternalSyntheticLambda0().getString(i2);
            setZ();
        }
    }

    @Override // o.setTransformationMethod
    public final ViewGroup setOnLongClickListener() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.setTransformationMethod
    public final Context MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.getContext();
    }

    @Override // o.setTransformationMethod
    public final boolean setUiOptions() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation();
    }

    @Override // o.setTransformationMethod
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda1 settranscriptmode_menuhosthelper__externalsyntheticlambda1 = this.MenuHostHelper$$ExternalSyntheticLambda1.setX;
        ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = settranscriptmode_menuhosthelper__externalsyntheticlambda1 == null ? null : settranscriptmode_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0;
        if (actionMenuPresenter$SavedState$1 != null) {
            actionMenuPresenter$SavedState$1.collapseActionView();
        }
    }

    @Override // o.setTransformationMethod
    public final void MenuHostHelper$$ExternalSyntheticLambda0(Window.Callback callback) {
        this.setY = callback;
    }

    @Override // o.setTransformationMethod
    public final void MenuHostHelper$$ExternalSyntheticLambda1(CharSequence charSequence) {
        if (this.setOnNavigationItemSelectedListener) {
            return;
        }
        MenuHostHelper$$ExternalSyntheticLambda0(charSequence);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(CharSequence charSequence) {
        this.setIconTintList = charSequence;
        if ((this.setUiOptions & 8) != 0) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setTitle(charSequence);
            if (this.setOnNavigationItemSelectedListener) {
                setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1.getRootView(), charSequence);
            }
        }
    }

    @Override // o.setTransformationMethod
    public final void ViewPager$SavedState$1() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // o.setTransformationMethod
    public final void setCenterIfNoTextEnabled() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // o.setTransformationMethod
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        this.setIconSize = i != 0 ? setFilterTouchesWhenObscured.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0(), i) : null;
        setMaxEms();
    }

    @Override // o.setTransformationMethod
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Drawable drawable) {
        this.setIconSize = drawable;
        setMaxEms();
    }

    @Override // o.setTransformationMethod
    public final void setX(int i) {
        this.setTextAlignment = i != 0 ? setFilterTouchesWhenObscured.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0(), i) : null;
        setMaxEms();
    }

    private void setMaxEms() {
        Drawable drawable;
        int i = this.setUiOptions;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.setTextAlignment;
            if (drawable == null) {
                drawable = this.setIconSize;
            }
        } else {
            drawable = this.setIconSize;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.setLogo(drawable);
    }

    @Override // o.setTransformationMethod
    public final boolean setIconTintList() {
        setOnSeekBarChangeListener setonseekbarchangelistener;
        setTranscriptMode settranscriptmode = this.MenuHostHelper$$ExternalSyntheticLambda1;
        return settranscriptmode.getVisibility() == 0 && (setonseekbarchangelistener = settranscriptmode.setOnLongClickListener) != null && setonseekbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.setTransformationMethod
    public final boolean setChipCornerRadius() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.setTextAlignment();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // o.setTransformationMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean setIconSize() {
        /*
            r4 = this;
            o.setTranscriptMode r0 = r4.MenuHostHelper$$ExternalSyntheticLambda1
            o.setOnSeekBarChangeListener r0 = r0.setOnLongClickListener
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L21
            o.setExpandedTitleTextColor r0 = r0.MenuHostHelper$$ExternalSyntheticLambda0
            if (r0 == 0) goto L1d
            o.setExpandedTitleTextColor$setIconTintList r3 = r0.setTextAlignment
            if (r3 != 0) goto L18
            boolean r0 = r0.setUnboundedRipple()
            if (r0 != 0) goto L18
            r0 = 0
            goto L19
        L18:
            r0 = 1
        L19:
            if (r0 == 0) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            if (r0 == 0) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AppBarLayout$ScrollingViewBehavior.setIconSize():boolean");
    }

    @Override // o.setTransformationMethod
    public final boolean setOnNavigationItemSelectedListener() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius();
    }

    @Override // o.setTransformationMethod
    public final boolean setLayoutAnimation() {
        setOnSeekBarChangeListener setonseekbarchangelistener = this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener;
        if (setonseekbarchangelistener != null) {
            setExpandedTitleTextColor setexpandedtitletextcolor = setonseekbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda0;
            if (setexpandedtitletextcolor != null && setexpandedtitletextcolor.MenuHostHelper$$ExternalSyntheticLambda1()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.setTransformationMethod
    public final void setTextAlignment() {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
    }

    @Override // o.setTransformationMethod
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Menu menu, setBackgroundTintMode.setY sety) {
        if (this.setX == null) {
            setExpandedTitleTextColor setexpandedtitletextcolor = new setExpandedTitleTextColor(this.MenuHostHelper$$ExternalSyntheticLambda1.getContext());
            this.setX = setexpandedtitletextcolor;
            setexpandedtitletextcolor.setX(R.id.res_0x7f0a003f);
        }
        this.setX.MenuHostHelper$$ExternalSyntheticLambda1(sety);
        this.MenuHostHelper$$ExternalSyntheticLambda1.setMenu((setNavigationIconTint) menu, this.setX);
    }

    @Override // o.setTransformationMethod
    public final void setY() {
        this.MenuHostHelper$$ExternalSyntheticLambda1.e_();
    }

    @Override // o.setTransformationMethod
    public final int setX() {
        return this.setUiOptions;
    }

    @Override // o.setTransformationMethod
    public final void setIconTintList(int i) {
        View view;
        int i2 = this.setUiOptions ^ i;
        this.setUiOptions = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    setZ();
                }
                setAnimationFromJson();
            }
            if ((i2 & 3) != 0) {
                setMaxEms();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.MenuHostHelper$$ExternalSyntheticLambda1.setTitle(this.setIconTintList);
                    this.MenuHostHelper$$ExternalSyntheticLambda1.setSubtitle(this.setCenterIfNoTextEnabled);
                } else {
                    this.MenuHostHelper$$ExternalSyntheticLambda1.setTitle((CharSequence) null);
                    this.MenuHostHelper$$ExternalSyntheticLambda1.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.setUnboundedRipple) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.addView(view);
            } else {
                this.MenuHostHelper$$ExternalSyntheticLambda1.removeView(view);
            }
        }
    }

    @Override // o.setTransformationMethod
    public final void setX(getPathName getpathname) {
        View view = this.setMaxEms;
        if (view != null) {
            ViewParent parent = view.getParent();
            setTranscriptMode settranscriptmode = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (parent == settranscriptmode) {
                settranscriptmode.removeView(this.setMaxEms);
            }
        }
        this.setMaxEms = getpathname;
    }

    @Override // o.setTransformationMethod
    public final void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setCollapsible(z);
    }

    @Override // o.setTransformationMethod
    public final int setNavigationOnClickListener() {
        return this.setChipCornerRadius;
    }

    @Override // o.setTransformationMethod
    public final setHeaderDividersEnabled setIconTintList(final int i, long j) {
        return setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1).setX(i == 0 ? 1.0f : 0.0f).MenuHostHelper$$ExternalSyntheticLambda1(j).MenuHostHelper$$ExternalSyntheticLambda0(new setCloseIconStartPaddingResource() { // from class: o.AppBarLayout$ScrollingViewBehavior.1
            private boolean setY = false;

            @Override // o.setCloseIconStartPaddingResource, o.setSelectAllOnFocus
            public final void setX(View view) {
                AppBarLayout$ScrollingViewBehavior.this.MenuHostHelper$$ExternalSyntheticLambda1.setVisibility(0);
            }

            @Override // o.setCloseIconStartPaddingResource, o.setSelectAllOnFocus
            public final void MenuHostHelper$$ExternalSyntheticLambda0(View view) {
                if (this.setY) {
                    return;
                }
                AppBarLayout$ScrollingViewBehavior.this.MenuHostHelper$$ExternalSyntheticLambda1.setVisibility(i);
            }

            @Override // o.setCloseIconStartPaddingResource, o.setSelectAllOnFocus
            public final void MenuHostHelper$$ExternalSyntheticLambda1(View view) {
                this.setY = true;
            }
        });
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(Drawable drawable) {
        this.ViewPager$SavedState$1 = drawable;
        setAnimationFromJson();
    }

    private void setAnimationFromJson() {
        if ((this.setUiOptions & 4) != 0) {
            setTranscriptMode settranscriptmode = this.MenuHostHelper$$ExternalSyntheticLambda1;
            Drawable drawable = this.ViewPager$SavedState$1;
            if (drawable == null) {
                drawable = this.setLayoutAnimation;
            }
            settranscriptmode.setNavigationIcon(drawable);
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.setNavigationIcon((Drawable) null);
    }

    private void setZ() {
        if ((this.setUiOptions & 4) != 0) {
            if (TextUtils.isEmpty(this.setNavigationOnClickListener)) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.setNavigationContentDescription(this.setOnLongClickListener);
            } else {
                this.MenuHostHelper$$ExternalSyntheticLambda1.setNavigationContentDescription(this.setNavigationOnClickListener);
            }
        }
    }

    @Override // o.setTransformationMethod
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setVisibility(i);
    }

    @Override // o.setTransformationMethod
    public final void setX(setBackgroundTintMode.setY sety, setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0 setnavigationicontint_menuhosthelper__externalsyntheticlambda0) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setMenuCallbacks(sety, setnavigationicontint_menuhosthelper__externalsyntheticlambda0);
    }

    @Override // o.setTransformationMethod
    public final Menu setUnboundedRipple() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList();
    }
}