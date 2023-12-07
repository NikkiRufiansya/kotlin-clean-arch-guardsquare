package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.TypedValue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl {
    static final boolean MenuHostHelper$$ExternalSyntheticLambda1 = true;
    private static final boolean setLayoutDirection;
    ColorStateList MenuHostHelper$$ExternalSyntheticLambda0;
    ColorStateList ViewPager$SavedState$1;
    int setCenterIfNoTextEnabled;
    final FabTransformationSheetBehavior setChipCornerRadius;
    private LayerDrawable setGuidelinePercent;
    int setIconSize;
    boolean setIconTintList;
    int setLayoutAnimation;
    int setNavigationOnClickListener;
    int setOnLongClickListener;
    setScrollBarDefaultDelayBeforeFade setOnNavigationItemSelectedListener;
    Drawable setTextAlignment;
    ColorStateList setTextScaleX;
    int setUnboundedRipple;
    PorterDuff.Mode setX;
    int setZ;
    boolean setAnimationFromJson = false;
    boolean setY = false;
    boolean setUiOptions = false;
    boolean setMaxEms = true;

    static {
        setLayoutDirection = Build.VERSION.SDK_INT <= 22;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleCoroutineScopeImpl(FabTransformationSheetBehavior fabTransformationSheetBehavior, setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        this.setChipCornerRadius = fabTransformationSheetBehavior;
        this.setOnNavigationItemSelectedListener = setscrollbardefaultdelaybeforefade;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1(setX());
        setWebViewClient x = setX(false);
        if (x != null) {
            x.setIconSize(this.setLayoutAnimation);
            x.setState(this.setChipCornerRadius.getDrawableState());
        }
    }

    private Drawable setX() {
        int i;
        setWebViewClient setwebviewclient = new setWebViewClient(this.setOnNavigationItemSelectedListener);
        setwebviewclient.setX(this.setChipCornerRadius.getContext());
        setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda1(setwebviewclient, this.MenuHostHelper$$ExternalSyntheticLambda0);
        PorterDuff.Mode mode = this.setX;
        if (mode != null) {
            setEnsureMinTouchTargetSize.setX(setwebviewclient, mode);
        }
        ColorStateList colorStateList = this.setTextScaleX;
        setwebviewclient.setChipIconTintResource.setMaxEms = this.setZ;
        setwebviewclient.invalidateSelf();
        if (setwebviewclient.setChipIconTintResource.setOnNavigationItemSelectedListener != colorStateList) {
            setwebviewclient.setChipIconTintResource.setOnNavigationItemSelectedListener = colorStateList;
            setwebviewclient.onStateChange(setwebviewclient.getState());
        }
        setWebViewClient setwebviewclient2 = new setWebViewClient(this.setOnNavigationItemSelectedListener);
        setwebviewclient2.setTint(0);
        float f = this.setZ;
        if (this.setAnimationFromJson) {
            FabTransformationSheetBehavior fabTransformationSheetBehavior = this.setChipCornerRadius;
            Context context = fabTransformationSheetBehavior.getContext();
            TypedValue iconTintList = setShowDividerVertical.setIconTintList(fabTransformationSheetBehavior.getContext(), (int) R.attr.res_0x7f040101, fabTransformationSheetBehavior.getClass().getCanonicalName());
            if (iconTintList.resourceId != 0) {
                i = setLineHeight.setY(context, iconTintList.resourceId);
            } else {
                i = iconTintList.data;
            }
        } else {
            i = 0;
        }
        setwebviewclient2.setChipIconTintResource.setMaxEms = f;
        setwebviewclient2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (setwebviewclient2.setChipIconTintResource.setOnNavigationItemSelectedListener != valueOf) {
            setwebviewclient2.setChipIconTintResource.setOnNavigationItemSelectedListener = valueOf;
            setwebviewclient2.onStateChange(setwebviewclient2.getState());
        }
        if (MenuHostHelper$$ExternalSyntheticLambda1) {
            setWebViewClient setwebviewclient3 = new setWebViewClient(this.setOnNavigationItemSelectedListener);
            this.setTextAlignment = setwebviewclient3;
            setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda1(setwebviewclient3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(setChipText.setY(this.ViewPager$SavedState$1), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{setwebviewclient2, setwebviewclient}), this.setNavigationOnClickListener, this.setIconSize, this.setCenterIfNoTextEnabled, this.setOnLongClickListener), this.setTextAlignment);
            this.setGuidelinePercent = rippleDrawable;
            return rippleDrawable;
        }
        setOnQueryTextListener setonquerytextlistener = new setOnQueryTextListener(this.setOnNavigationItemSelectedListener);
        this.setTextAlignment = setonquerytextlistener;
        setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda1(setonquerytextlistener, setChipText.setY(this.ViewPager$SavedState$1));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{setwebviewclient2, setwebviewclient, this.setTextAlignment});
        this.setGuidelinePercent = layerDrawable;
        return new InsetDrawable((Drawable) layerDrawable, this.setNavigationOnClickListener, this.setIconSize, this.setCenterIfNoTextEnabled, this.setOnLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setWebViewClient setX(boolean z) {
        LayerDrawable layerDrawable = this.setGuidelinePercent;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (MenuHostHelper$$ExternalSyntheticLambda1) {
            return (setWebViewClient) ((LayerDrawable) ((InsetDrawable) this.setGuidelinePercent.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
        }
        return (setWebViewClient) this.setGuidelinePercent.getDrawable(!z ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        if (setLayoutDirection && !this.setY) {
            int animationFromJson = setBaselineAlignBottom.setAnimationFromJson(this.setChipCornerRadius);
            int paddingTop = this.setChipCornerRadius.getPaddingTop();
            int onNavigationItemSelectedListener = setBaselineAlignBottom.setOnNavigationItemSelectedListener(this.setChipCornerRadius);
            int paddingBottom = this.setChipCornerRadius.getPaddingBottom();
            MenuHostHelper$$ExternalSyntheticLambda1();
            setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda0(this.setChipCornerRadius, animationFromJson, paddingTop, onNavigationItemSelectedListener, paddingBottom);
            return;
        }
        if (setX(false) != null) {
            setX(false).setShapeAppearanceModel(setscrollbardefaultdelaybeforefade);
        }
        if (setX(true) != null) {
            setX(true).setShapeAppearanceModel(setscrollbardefaultdelaybeforefade);
        }
        if (setIconTintList() != null) {
            setIconTintList().setShapeAppearanceModel(setscrollbardefaultdelaybeforefade);
        }
    }

    private FragmentManager$LaunchedFragmentInfo$1 setIconTintList() {
        LayerDrawable layerDrawable = this.setGuidelinePercent;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.setGuidelinePercent.getNumberOfLayers() > 2) {
            return (FragmentManager$LaunchedFragmentInfo$1) this.setGuidelinePercent.getDrawable(2);
        }
        return (FragmentManager$LaunchedFragmentInfo$1) this.setGuidelinePercent.getDrawable(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList(int i, int i2) {
        int animationFromJson = setBaselineAlignBottom.setAnimationFromJson(this.setChipCornerRadius);
        int paddingTop = this.setChipCornerRadius.getPaddingTop();
        int onNavigationItemSelectedListener = setBaselineAlignBottom.setOnNavigationItemSelectedListener(this.setChipCornerRadius);
        int paddingBottom = this.setChipCornerRadius.getPaddingBottom();
        int i3 = this.setIconSize;
        int i4 = this.setOnLongClickListener;
        this.setOnLongClickListener = i2;
        this.setIconSize = i;
        if (!this.setY) {
            MenuHostHelper$$ExternalSyntheticLambda1();
        }
        setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda0(this.setChipCornerRadius, animationFromJson, (paddingTop + i) - i3, onNavigationItemSelectedListener, (paddingBottom + i2) - i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        int i = 0;
        setWebViewClient x = setX(false);
        setWebViewClient x2 = setX(true);
        if (x != null) {
            ColorStateList colorStateList = this.setTextScaleX;
            x.setChipIconTintResource.setMaxEms = this.setZ;
            x.invalidateSelf();
            if (x.setChipIconTintResource.setOnNavigationItemSelectedListener != colorStateList) {
                x.setChipIconTintResource.setOnNavigationItemSelectedListener = colorStateList;
                x.onStateChange(x.getState());
            }
            if (x2 != null) {
                float f = this.setZ;
                if (this.setAnimationFromJson) {
                    FabTransformationSheetBehavior fabTransformationSheetBehavior = this.setChipCornerRadius;
                    Context context = fabTransformationSheetBehavior.getContext();
                    TypedValue iconTintList = setShowDividerVertical.setIconTintList(fabTransformationSheetBehavior.getContext(), (int) R.attr.res_0x7f040101, fabTransformationSheetBehavior.getClass().getCanonicalName());
                    if (iconTintList.resourceId != 0) {
                        i = setLineHeight.setY(context, iconTintList.resourceId);
                    } else {
                        i = iconTintList.data;
                    }
                }
                x2.setChipIconTintResource.setMaxEms = f;
                x2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i);
                if (x2.setChipIconTintResource.setOnNavigationItemSelectedListener != valueOf) {
                    x2.setChipIconTintResource.setOnNavigationItemSelectedListener = valueOf;
                    x2.onStateChange(x2.getState());
                }
            }
        }
    }
}