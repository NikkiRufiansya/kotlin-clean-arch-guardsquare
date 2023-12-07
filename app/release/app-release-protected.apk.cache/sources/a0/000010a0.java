package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.setAnimationFromJson;
import o.setBackgroundTintMode;
import o.setOnSeekBarChangeListener;

/* loaded from: classes.dex */
public class setTranscriptMode extends ViewGroup {
    private int ExtendableSavedState$1;
    private ColorStateList FloatingActionButton$BaseBehavior;
    private final Runnable FragmentStateAdapter$2;
    private CharSequence FragmentStateAdapter$5;
    int MenuHostHelper$$ExternalSyntheticLambda0;
    final ArrayList<View> MenuHostHelper$$ExternalSyntheticLambda1;
    private ColorStateList RecyclerView$SavedState$1;
    private Context SearchView$SavedState$1;
    public int ViewPager$SavedState$1;
    private final ArrayList<View> setAdapter;
    private boolean setAnimationFromJson;
    public int setCenterIfNoTextEnabled;
    private ImageView setCheckedIconEnabled;
    private CharSequence setChipCornerRadius;
    private AppBarLayout$ScrollingViewBehavior setChipIconEnabled;
    private setExpandedTitleTextColor setChipIconTintResource;
    private ArrayList<MenuItem> setConstraintSet;
    private int setContentScrimResource;
    private int setFilterTouchesWhenObscured;
    private setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0 setGuidelinePercent;
    private final setOnSeekBarChangeListener.setY setHasDecor;
    private Drawable setIconSize;
    View setIconTintList;
    private ImageButton setIconified;
    private TextView setImageTintMode;
    setX setLayoutAnimation;
    private boolean setLayoutDirection;
    private boolean setMaxEms;
    private int setMinAndMaxProgress;
    public int setNavigationOnClickListener;
    private TextView setObjectValues;
    setOnSeekBarChangeListener setOnLongClickListener;
    private int setOnNavigationItemSelectedListener;
    private CharSequence setSuffixText;
    private setBackgroundTintMode.setY setTextAlignment;
    private int setTextAppearanceResource;
    private setAlpha setTextScaleX;
    public int setUiOptions;
    final FullLifecycleObserverAdapter setUnboundedRipple;
    private final int[] setViewTranslationCallback;
    setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda1 setX;
    ImageButton setY;
    private int setZ;

    /* loaded from: classes.dex */
    public interface setX {
        boolean setX(MenuItem menuItem);
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return setY();
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return MenuHostHelper$$ExternalSyntheticLambda0(layoutParams);
    }

    public setTranscriptMode(Context context) {
        this(context, null);
    }

    public setTranscriptMode(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f04046e);
    }

    public setTranscriptMode(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setTextAppearanceResource = 8388627;
        this.setAdapter = new ArrayList<>();
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new ArrayList<>();
        this.setViewTranslationCallback = new int[2];
        this.setUnboundedRipple = new FullLifecycleObserverAdapter(new Runnable() { // from class: o.setShadowPaddingEnabled
            @Override // java.lang.Runnable
            public final void run() {
                setTranscriptMode.this.setCenterIfNoTextEnabled();
            }
        });
        this.setConstraintSet = new ArrayList<>();
        this.setHasDecor = new setOnSeekBarChangeListener.setY() { // from class: o.setTranscriptMode.5
            @Override // o.setOnSeekBarChangeListener.setY
            public final boolean MenuHostHelper$$ExternalSyntheticLambda0(MenuItem menuItem) {
                if (setTranscriptMode.this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0()) {
                    return true;
                }
                if (setTranscriptMode.this.setLayoutAnimation != null) {
                    return setTranscriptMode.this.setLayoutAnimation.setX(menuItem);
                }
                return false;
            }
        };
        this.FragmentStateAdapter$2 = new Runnable() { // from class: o.setTranscriptMode.1
            @Override // java.lang.Runnable
            public final void run() {
                setTranscriptMode.this.setChipCornerRadius();
            }
        };
        setExpandedHintEnabled MenuHostHelper$$ExternalSyntheticLambda0 = setExpandedHintEnabled.MenuHostHelper$$ExternalSyntheticLambda0(getContext(), attributeSet, setAnimationFromJson.setY.setHintEnabled, i, 0);
        setBaselineAlignBottom.setY(this, context, setAnimationFromJson.setY.setHintEnabled, attributeSet, MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(), i, 0);
        this.setFilterTouchesWhenObscured = MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener(setAnimationFromJson.setY.setSupportButtonTintList, 0);
        this.setContentScrimResource = MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener(setAnimationFromJson.setY.setThumb, 0);
        this.setTextAppearanceResource = MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(setAnimationFromJson.setY.zzB, this.setTextAppearanceResource);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(setAnimationFromJson.setY.setColorFilter, 48);
        int MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setAnimationFromJson.setY.setItemTextAppearanceActive, 0);
        MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation(setAnimationFromJson.setY.setExtractedText) ? MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setAnimationFromJson.setY.setExtractedText, MenuHostHelper$$ExternalSyntheticLambda1) : MenuHostHelper$$ExternalSyntheticLambda1;
        this.setNavigationOnClickListener = MenuHostHelper$$ExternalSyntheticLambda1;
        this.setCenterIfNoTextEnabled = MenuHostHelper$$ExternalSyntheticLambda1;
        this.setUiOptions = MenuHostHelper$$ExternalSyntheticLambda1;
        this.ViewPager$SavedState$1 = MenuHostHelper$$ExternalSyntheticLambda1;
        int MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setAnimationFromJson.setY.setRootAlpha, -1);
        if (MenuHostHelper$$ExternalSyntheticLambda12 >= 0) {
            this.ViewPager$SavedState$1 = MenuHostHelper$$ExternalSyntheticLambda12;
        }
        int MenuHostHelper$$ExternalSyntheticLambda13 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setAnimationFromJson.setY.setIndeterminateTintBlendMode, -1);
        if (MenuHostHelper$$ExternalSyntheticLambda13 >= 0) {
            this.setUiOptions = MenuHostHelper$$ExternalSyntheticLambda13;
        }
        int MenuHostHelper$$ExternalSyntheticLambda14 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setAnimationFromJson.setY.loadReflectionField, -1);
        if (MenuHostHelper$$ExternalSyntheticLambda14 >= 0) {
            this.setCenterIfNoTextEnabled = MenuHostHelper$$ExternalSyntheticLambda14;
        }
        int MenuHostHelper$$ExternalSyntheticLambda15 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setAnimationFromJson.setY.setFreezesText, -1);
        if (MenuHostHelper$$ExternalSyntheticLambda15 >= 0) {
            this.setNavigationOnClickListener = MenuHostHelper$$ExternalSyntheticLambda15;
        }
        this.setMinAndMaxProgress = MenuHostHelper$$ExternalSyntheticLambda0.setY(setAnimationFromJson.setY.getPropertyName, -1);
        int i2 = setAnimationFromJson.setY.setCompoundDrawablesWithIntrinsicBounds;
        int MenuHostHelper$$ExternalSyntheticLambda16 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(9, Integer.MIN_VALUE);
        int i3 = setAnimationFromJson.setY.SwipeDismissBehavior;
        int MenuHostHelper$$ExternalSyntheticLambda17 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(5, Integer.MIN_VALUE);
        int i4 = setAnimationFromJson.setY.setFabAlignmentModeAndReplaceMenu;
        int y = MenuHostHelper$$ExternalSyntheticLambda0.setY(7, 0);
        int i5 = setAnimationFromJson.setY.setSoundEffectsEnabled;
        int y2 = MenuHostHelper$$ExternalSyntheticLambda0.setY(8, 0);
        ViewPager$SavedState$1();
        this.setTextScaleX.MenuHostHelper$$ExternalSyntheticLambda1(y, y2);
        if (MenuHostHelper$$ExternalSyntheticLambda16 != Integer.MIN_VALUE || MenuHostHelper$$ExternalSyntheticLambda17 != Integer.MIN_VALUE) {
            this.setTextScaleX.setX(MenuHostHelper$$ExternalSyntheticLambda16, MenuHostHelper$$ExternalSyntheticLambda17);
        }
        this.setZ = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setAnimationFromJson.setY.setFilterText, Integer.MIN_VALUE);
        this.setOnNavigationItemSelectedListener = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setAnimationFromJson.setY.setVisibility, Integer.MIN_VALUE);
        this.setIconSize = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setButtonTintBlendMode);
        this.setChipCornerRadius = MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple(setAnimationFromJson.setY.zzD);
        CharSequence unboundedRipple = MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple(setAnimationFromJson.setY.setActionBarHideOffset);
        if (!TextUtils.isEmpty(unboundedRipple)) {
            setTitle(unboundedRipple);
        }
        CharSequence unboundedRipple2 = MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple(setAnimationFromJson.setY.setLastBaselineToBottomHeight);
        if (!TextUtils.isEmpty(unboundedRipple2)) {
            setSubtitle(unboundedRipple2);
        }
        this.SearchView$SavedState$1 = getContext();
        setPopupTheme(MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener(setAnimationFromJson.setY.zzb, 0));
        Drawable MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setShowingForActionMode);
        if (MenuHostHelper$$ExternalSyntheticLambda02 != null) {
            setNavigationIcon(MenuHostHelper$$ExternalSyntheticLambda02);
        }
        CharSequence unboundedRipple3 = MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple(setAnimationFromJson.setY.setQueryHint);
        if (!TextUtils.isEmpty(unboundedRipple3)) {
            setNavigationContentDescription(unboundedRipple3);
        }
        Drawable MenuHostHelper$$ExternalSyntheticLambda03 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.write);
        if (MenuHostHelper$$ExternalSyntheticLambda03 != null) {
            setLogo(MenuHostHelper$$ExternalSyntheticLambda03);
        }
        CharSequence unboundedRipple4 = MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple(setAnimationFromJson.setY.setForceApplySystemWindowInsetTop);
        if (!TextUtils.isEmpty(unboundedRipple4)) {
            setLogoDescription(unboundedRipple4);
        }
        if (MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation(setAnimationFromJson.setY.setLinksClickable)) {
            setTitleTextColor(MenuHostHelper$$ExternalSyntheticLambda0.setY(setAnimationFromJson.setY.setLinksClickable));
        }
        if (MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation(setAnimationFromJson.setY.setIndicatorBoundsRelative)) {
            setSubtitleTextColor(MenuHostHelper$$ExternalSyntheticLambda0.setY(setAnimationFromJson.setY.setIndicatorBoundsRelative));
        }
        if (MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation(setAnimationFromJson.setY.zza)) {
            int navigationOnClickListener = MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener(setAnimationFromJson.setY.zza, 0);
            setShrinkMotionSpec setshrinkmotionspec = new setShrinkMotionSpec(getContext());
            setIconSize();
            setshrinkmotionspec.inflate(navigationOnClickListener, this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1());
        }
        MenuHostHelper$$ExternalSyntheticLambda0.setX();
    }

    public void setPopupTheme(int i) {
        if (this.ExtendableSavedState$1 != i) {
            this.ExtendableSavedState$1 = i;
            if (i == 0) {
                this.SearchView$SavedState$1 = getContext();
            } else {
                this.SearchView$SavedState$1 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.ViewPager$SavedState$1 = i;
        this.setCenterIfNoTextEnabled = i2;
        this.setUiOptions = i3;
        this.setNavigationOnClickListener = i4;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.ViewPager$SavedState$1 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.setCenterIfNoTextEnabled = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.setUiOptions = i;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.setNavigationOnClickListener = i;
        requestLayout();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        ViewPager$SavedState$1();
        this.setTextScaleX.MenuHostHelper$$ExternalSyntheticLambda1(i == 1);
    }

    public void setLogo(int i) {
        setLogo(setFilterTouchesWhenObscured.setIconTintList(getContext(), i));
    }

    public final boolean setTextAlignment() {
        setOnSeekBarChangeListener setonseekbarchangelistener = this.setOnLongClickListener;
        if (setonseekbarchangelistener != null) {
            setExpandedTitleTextColor setexpandedtitletextcolor = setonseekbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda0;
            if (setexpandedtitletextcolor != null && setexpandedtitletextcolor.setUnboundedRipple()) {
                return true;
            }
        }
        return false;
    }

    public final boolean setChipCornerRadius() {
        setOnSeekBarChangeListener setonseekbarchangelistener = this.setOnLongClickListener;
        if (setonseekbarchangelistener != null) {
            setExpandedTitleTextColor setexpandedtitletextcolor = setonseekbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda0;
            if (setexpandedtitletextcolor != null && setexpandedtitletextcolor.setNavigationOnClickListener()) {
                return true;
            }
        }
        return false;
    }

    public void setMenu(setNavigationIconTint setnavigationicontint, setExpandedTitleTextColor setexpandedtitletextcolor) {
        if (setnavigationicontint == null && this.setOnLongClickListener == null) {
            return;
        }
        setAnimationFromJson();
        setNavigationIconTint iconTintList = this.setOnLongClickListener.setIconTintList();
        if (iconTintList == setnavigationicontint) {
            return;
        }
        if (iconTintList != null) {
            iconTintList.setX(this.setChipIconTintResource);
            iconTintList.setX(this.setX);
        }
        if (this.setX == null) {
            this.setX = new setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda1(this);
        }
        setexpandedtitletextcolor.setIconTintList(true);
        if (setnavigationicontint != null) {
            setnavigationicontint.setIconTintList(setexpandedtitletextcolor, this.SearchView$SavedState$1);
            setnavigationicontint.setIconTintList(this.setX, this.SearchView$SavedState$1);
        } else {
            setexpandedtitletextcolor.setX(this.SearchView$SavedState$1, (setNavigationIconTint) null);
            this.setX.setX(this.SearchView$SavedState$1, null);
            setexpandedtitletextcolor.MenuHostHelper$$ExternalSyntheticLambda0(true);
            this.setX.MenuHostHelper$$ExternalSyntheticLambda0(true);
        }
        this.setOnLongClickListener.setPopupTheme(this.ExtendableSavedState$1);
        this.setOnLongClickListener.setPresenter(setexpandedtitletextcolor);
        this.setChipIconTintResource = setexpandedtitletextcolor;
    }

    public final void e_() {
        setOnSeekBarChangeListener setonseekbarchangelistener = this.setOnLongClickListener;
        if (setonseekbarchangelistener != null) {
            setonseekbarchangelistener.setX();
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.setCheckedIconEnabled == null) {
            this.setCheckedIconEnabled = new setOutlineAmbientShadowColor(getContext());
        }
        ImageView imageView = this.setCheckedIconEnabled;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public final boolean setLayoutAnimation() {
        setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda1 settranscriptmode_menuhosthelper__externalsyntheticlambda1 = this.setX;
        return (settranscriptmode_menuhosthelper__externalsyntheticlambda1 == null || settranscriptmode_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0 == null) ? false : true;
    }

    public final CharSequence setOnLongClickListener() {
        return this.setSuffixText;
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.setImageTintMode == null) {
                Context context = getContext();
                getStableInsets getstableinsets = new getStableInsets(context);
                this.setImageTintMode = getstableinsets;
                getstableinsets.setSingleLine();
                this.setImageTintMode.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.setFilterTouchesWhenObscured;
                if (i != 0) {
                    this.setImageTintMode.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.RecyclerView$SavedState$1;
                if (colorStateList != null) {
                    this.setImageTintMode.setTextColor(colorStateList);
                }
            }
            if (!setIconTintList(this.setImageTintMode)) {
                setX((View) this.setImageTintMode, true);
            }
        } else {
            TextView textView = this.setImageTintMode;
            if (textView != null && setIconTintList(textView)) {
                removeView(this.setImageTintMode);
                this.MenuHostHelper$$ExternalSyntheticLambda1.remove(this.setImageTintMode);
            }
        }
        TextView textView2 = this.setImageTintMode;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.setSuffixText = charSequence;
    }

    public final CharSequence setUnboundedRipple() {
        return this.FragmentStateAdapter$5;
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.setObjectValues == null) {
                Context context = getContext();
                getStableInsets getstableinsets = new getStableInsets(context);
                this.setObjectValues = getstableinsets;
                getstableinsets.setSingleLine();
                this.setObjectValues.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.setContentScrimResource;
                if (i != 0) {
                    this.setObjectValues.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.FloatingActionButton$BaseBehavior;
                if (colorStateList != null) {
                    this.setObjectValues.setTextColor(colorStateList);
                }
            }
            if (!setIconTintList(this.setObjectValues)) {
                setX((View) this.setObjectValues, true);
            }
        } else {
            TextView textView = this.setObjectValues;
            if (textView != null && setIconTintList(textView)) {
                removeView(this.setObjectValues);
                this.MenuHostHelper$$ExternalSyntheticLambda1.remove(this.setObjectValues);
            }
        }
        TextView textView2 = this.setObjectValues;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.FragmentStateAdapter$5 = charSequence;
    }

    public void setTitleTextAppearance(Context context, int i) {
        this.setFilterTouchesWhenObscured = i;
        TextView textView = this.setImageTintMode;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextAppearance(Context context, int i) {
        this.setContentScrimResource = i;
        TextView textView = this.setObjectValues;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.RecyclerView$SavedState$1 = colorStateList;
        TextView textView = this.setImageTintMode;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.FloatingActionButton$BaseBehavior = colorStateList;
        TextView textView = this.setObjectValues;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final CharSequence MenuHostHelper$$ExternalSyntheticLambda0() {
        ImageButton imageButton = this.setIconified;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            setOnNavigationItemSelectedListener();
        }
        ImageButton imageButton = this.setIconified;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            transact.setIconTintList(this.setIconified, charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(setFilterTouchesWhenObscured.setIconTintList(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            setOnNavigationItemSelectedListener();
            if (!setIconTintList(this.setIconified)) {
                setX((View) this.setIconified, true);
            }
        } else {
            ImageButton imageButton = this.setIconified;
            if (imageButton != null && setIconTintList(imageButton)) {
                removeView(this.setIconified);
                this.MenuHostHelper$$ExternalSyntheticLambda1.remove(this.setIconified);
            }
        }
        ImageButton imageButton2 = this.setIconified;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public final Drawable setUiOptions() {
        ImageButton imageButton = this.setIconified;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        setOnNavigationItemSelectedListener();
        this.setIconified.setOnClickListener(onClickListener);
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            MenuHostHelper$$ExternalSyntheticLambda1();
        }
        ImageButton imageButton = this.setY;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(setFilterTouchesWhenObscured.setIconTintList(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            MenuHostHelper$$ExternalSyntheticLambda1();
            this.setY.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.setY;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.setIconSize);
        }
    }

    public final Menu setIconTintList() {
        setIconSize();
        return this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    public void setOverflowIcon(Drawable drawable) {
        setIconSize();
        this.setOnLongClickListener.setOverflowIcon(drawable);
    }

    private void setIconSize() {
        setAnimationFromJson();
        if (this.setOnLongClickListener.setIconTintList() == null) {
            setNavigationIconTint setnavigationicontint = (setNavigationIconTint) this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1();
            if (this.setX == null) {
                this.setX = new setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda1(this);
            }
            this.setOnLongClickListener.setExpandedActionViewsExclusive(true);
            setnavigationicontint.setIconTintList(this.setX, this.SearchView$SavedState$1);
        }
    }

    private void setAnimationFromJson() {
        if (this.setOnLongClickListener == null) {
            setOnSeekBarChangeListener setonseekbarchangelistener = new setOnSeekBarChangeListener(getContext());
            this.setOnLongClickListener = setonseekbarchangelistener;
            setonseekbarchangelistener.setPopupTheme(this.ExtendableSavedState$1);
            this.setOnLongClickListener.setOnMenuItemClickListener(this.setHasDecor);
            this.setOnLongClickListener.setMenuCallbacks(this.setTextAlignment, this.setGuidelinePercent);
            setIconTintList y = setY();
            y.MenuHostHelper$$ExternalSyntheticLambda1 = (this.MenuHostHelper$$ExternalSyntheticLambda0 & 112) | 8388613;
            this.setOnLongClickListener.setLayoutParams(y);
            setX((View) this.setOnLongClickListener, false);
        }
    }

    public void setOnMenuItemClickListener(setX setx) {
        this.setLayoutAnimation = setx;
    }

    public void setContentInsetsRelative(int i, int i2) {
        ViewPager$SavedState$1();
        this.setTextScaleX.setX(i, i2);
    }

    private int setTextAppearanceResource() {
        setAlpha setalpha = this.setTextScaleX;
        if (setalpha != null) {
            return setalpha.setIconTintList();
        }
        return 0;
    }

    private int setZ() {
        setAlpha setalpha = this.setTextScaleX;
        if (setalpha != null) {
            return setalpha.MenuHostHelper$$ExternalSyntheticLambda0();
        }
        return 0;
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        ViewPager$SavedState$1();
        this.setTextScaleX.MenuHostHelper$$ExternalSyntheticLambda1(i, i2);
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.setZ) {
            this.setZ = i;
            if (setUiOptions() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.setOnNavigationItemSelectedListener) {
            this.setOnNavigationItemSelectedListener = i;
            if (setUiOptions() != null) {
                requestLayout();
            }
        }
    }

    private int setLayoutDirection() {
        if (setUiOptions() != null) {
            return Math.max(setTextAppearanceResource(), Math.max(this.setZ, 0));
        }
        return setTextAppearanceResource();
    }

    private int setGuidelinePercent() {
        setNavigationIconTint iconTintList;
        setOnSeekBarChangeListener setonseekbarchangelistener = this.setOnLongClickListener;
        if ((setonseekbarchangelistener == null || (iconTintList = setonseekbarchangelistener.setIconTintList()) == null || !iconTintList.hasVisibleItems()) ? false : true) {
            return Math.max(setZ(), Math.max(this.setOnNavigationItemSelectedListener, 0));
        }
        return setZ();
    }

    private int setMinAndMaxProgress() {
        if (setBaselineAlignBottom.ViewPager$SavedState$1(this) == 1) {
            return setGuidelinePercent();
        }
        return setLayoutDirection();
    }

    private int setCheckedIconEnabled() {
        if (setBaselineAlignBottom.ViewPager$SavedState$1(this) == 1) {
            return setLayoutDirection();
        }
        return setGuidelinePercent();
    }

    private void setOnNavigationItemSelectedListener() {
        if (this.setIconified == null) {
            this.setIconified = new setAccessibilityTraversalAfter(getContext(), null, R.attr.res_0x7f04046d);
            setIconTintList y = setY();
            y.MenuHostHelper$$ExternalSyntheticLambda1 = (this.MenuHostHelper$$ExternalSyntheticLambda0 & 112) | 8388611;
            this.setIconified.setLayoutParams(y);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.setY == null) {
            setAccessibilityTraversalAfter setaccessibilitytraversalafter = new setAccessibilityTraversalAfter(getContext(), null, R.attr.res_0x7f04046d);
            this.setY = setaccessibilitytraversalafter;
            setaccessibilitytraversalafter.setImageDrawable(this.setIconSize);
            this.setY.setContentDescription(this.setChipCornerRadius);
            setIconTintList y = setY();
            y.MenuHostHelper$$ExternalSyntheticLambda1 = (this.MenuHostHelper$$ExternalSyntheticLambda0 & 112) | 8388611;
            y.setIconTintList = 2;
            this.setY.setLayoutParams(y);
            this.setY.setOnClickListener(new View.OnClickListener() { // from class: o.setTranscriptMode.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda1 settranscriptmode_menuhosthelper__externalsyntheticlambda1 = setTranscriptMode.this.setX;
                    ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = settranscriptmode_menuhosthelper__externalsyntheticlambda1 == null ? null : settranscriptmode_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (actionMenuPresenter$SavedState$1 != null) {
                        actionMenuPresenter$SavedState$1.collapseActionView();
                    }
                }
            });
        }
    }

    private void setX(View view, boolean z) {
        setIconTintList seticontintlist;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            seticontintlist = setY();
        } else if (!checkLayoutParams(layoutParams)) {
            seticontintlist = MenuHostHelper$$ExternalSyntheticLambda0(layoutParams);
        } else {
            seticontintlist = (setIconTintList) layoutParams;
        }
        seticontintlist.setIconTintList = 1;
        if (z && this.setIconTintList != null) {
            view.setLayoutParams(seticontintlist);
            this.MenuHostHelper$$ExternalSyntheticLambda1.add(view);
            return;
        }
        addView(view, seticontintlist);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda0 settranscriptmode_menuhosthelper__externalsyntheticlambda0 = new setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda0(super.onSaveInstanceState());
        setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda1 settranscriptmode_menuhosthelper__externalsyntheticlambda1 = this.setX;
        if (settranscriptmode_menuhosthelper__externalsyntheticlambda1 != null && settranscriptmode_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            settranscriptmode_menuhosthelper__externalsyntheticlambda0.setX = this.setX.MenuHostHelper$$ExternalSyntheticLambda0.getItemId();
        }
        settranscriptmode_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0 = setTextAlignment();
        return settranscriptmode_menuhosthelper__externalsyntheticlambda0;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda0 settranscriptmode_menuhosthelper__externalsyntheticlambda0 = (setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda0) parcelable;
        super.onRestoreInstanceState(settranscriptmode_menuhosthelper__externalsyntheticlambda0.setUiOptions);
        setOnSeekBarChangeListener setonseekbarchangelistener = this.setOnLongClickListener;
        setNavigationIconTint iconTintList = setonseekbarchangelistener != null ? setonseekbarchangelistener.setIconTintList() : null;
        if (settranscriptmode_menuhosthelper__externalsyntheticlambda0.setX != 0 && this.setX != null && iconTintList != null && (findItem = iconTintList.findItem(settranscriptmode_menuhosthelper__externalsyntheticlambda0.setX)) != null) {
            findItem.expandActionView();
        }
        if (settranscriptmode_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0) {
            removeCallbacks(this.FragmentStateAdapter$2);
            post(this.FragmentStateAdapter$2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.FragmentStateAdapter$2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.setLayoutDirection = false;
        }
        if (!this.setLayoutDirection) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.setLayoutDirection = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.setLayoutDirection = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.setMaxEms = false;
        }
        if (!this.setMaxEms) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.setMaxEms = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.setMaxEms = false;
        }
        return true;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i5 = marginLayoutParams.leftMargin;
        int childMeasureSpec = getChildMeasureSpec(i, paddingLeft + paddingRight + i5 + marginLayoutParams.rightMargin + i2, ((ViewGroup.LayoutParams) marginLayoutParams).width);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i6 = marginLayoutParams.topMargin;
        int childMeasureSpec2 = getChildMeasureSpec(i3, paddingTop + paddingBottom + i6 + marginLayoutParams.bottomMargin, ((ViewGroup.LayoutParams) marginLayoutParams).height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private int setIconTintList(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, ((ViewGroup.LayoutParams) marginLayoutParams).width);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = marginLayoutParams.topMargin;
        view.measure(childMeasureSpec, getChildMeasureSpec(i3, paddingTop + paddingBottom + i7 + marginLayoutParams.bottomMargin + i4, ((ViewGroup.LayoutParams) marginLayoutParams).height));
        return view.getMeasuredWidth() + max;
    }

    private boolean setMaxEms() {
        if (this.setAnimationFromJson) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (MenuHostHelper$$ExternalSyntheticLambda1(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.setViewTranslationCallback;
        boolean MenuHostHelper$$ExternalSyntheticLambda0 = setTabMode.MenuHostHelper$$ExternalSyntheticLambda0(this);
        if (MenuHostHelper$$ExternalSyntheticLambda1(this.setIconified)) {
            MenuHostHelper$$ExternalSyntheticLambda1(this.setIconified, i, 0, i2, this.setMinAndMaxProgress);
            i3 = this.setIconified.getMeasuredWidth() + setX(this.setIconified);
            i4 = Math.max(0, this.setIconified.getMeasuredHeight() + setY(this.setIconified));
            i5 = View.combineMeasuredStates(0, this.setIconified.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (MenuHostHelper$$ExternalSyntheticLambda1(this.setY)) {
            MenuHostHelper$$ExternalSyntheticLambda1(this.setY, i, 0, i2, this.setMinAndMaxProgress);
            i3 = this.setY.getMeasuredWidth() + setX(this.setY);
            i4 = Math.max(i4, this.setY.getMeasuredHeight() + setY(this.setY));
            i5 = View.combineMeasuredStates(i5, this.setY.getMeasuredState());
        }
        int layoutDirection = setLayoutDirection();
        int max = Math.max(layoutDirection, i3) + 0;
        iArr[MenuHostHelper$$ExternalSyntheticLambda0 ? 1 : 0] = Math.max(0, layoutDirection - i3);
        if (MenuHostHelper$$ExternalSyntheticLambda1(this.setOnLongClickListener)) {
            MenuHostHelper$$ExternalSyntheticLambda1(this.setOnLongClickListener, i, max, i2, this.setMinAndMaxProgress);
            i6 = this.setOnLongClickListener.getMeasuredWidth() + setX(this.setOnLongClickListener);
            i4 = Math.max(i4, this.setOnLongClickListener.getMeasuredHeight() + setY(this.setOnLongClickListener));
            i5 = View.combineMeasuredStates(i5, this.setOnLongClickListener.getMeasuredState());
        } else {
            i6 = 0;
        }
        int guidelinePercent = setGuidelinePercent();
        int max2 = max + Math.max(guidelinePercent, i6);
        iArr[!MenuHostHelper$$ExternalSyntheticLambda0 ? 1 : 0] = Math.max(0, guidelinePercent - i6);
        if (MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList)) {
            max2 += setIconTintList(this.setIconTintList, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.setIconTintList.getMeasuredHeight() + setY(this.setIconTintList));
            i5 = View.combineMeasuredStates(i5, this.setIconTintList.getMeasuredState());
        }
        if (MenuHostHelper$$ExternalSyntheticLambda1(this.setCheckedIconEnabled)) {
            max2 += setIconTintList(this.setCheckedIconEnabled, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.setCheckedIconEnabled.getMeasuredHeight() + setY(this.setCheckedIconEnabled));
            i5 = View.combineMeasuredStates(i5, this.setCheckedIconEnabled.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (((setIconTintList) childAt.getLayoutParams()).setIconTintList == 0 && MenuHostHelper$$ExternalSyntheticLambda1(childAt)) {
                max2 += setIconTintList(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + setY(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i11 = this.setCenterIfNoTextEnabled + this.setNavigationOnClickListener;
        int i12 = this.ViewPager$SavedState$1 + this.setUiOptions;
        if (MenuHostHelper$$ExternalSyntheticLambda1(this.setImageTintMode)) {
            setIconTintList(this.setImageTintMode, i, max2 + i12, i2, i11, iArr);
            int measuredWidth = this.setImageTintMode.getMeasuredWidth();
            int x = setX(this.setImageTintMode);
            i9 = this.setImageTintMode.getMeasuredHeight() + setY(this.setImageTintMode);
            i7 = View.combineMeasuredStates(i5, this.setImageTintMode.getMeasuredState());
            i8 = measuredWidth + x;
        } else {
            i7 = i5;
            i8 = 0;
            i9 = 0;
        }
        if (MenuHostHelper$$ExternalSyntheticLambda1(this.setObjectValues)) {
            i8 = Math.max(i8, setIconTintList(this.setObjectValues, i, max2 + i12, i2, i9 + i11, iArr));
            i9 += this.setObjectValues.getMeasuredHeight() + setY(this.setObjectValues);
            i7 = View.combineMeasuredStates(i7, this.setObjectValues.getMeasuredState());
        }
        int max3 = Math.max(i4, i9);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i8 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & i7), setMaxEms() ? 0 : View.resolveSizeAndState(Math.max(max3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i7 << 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x029b A[LOOP:0: B:102:0x0299->B:103:0x029b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02bd A[LOOP:1: B:105:0x02bb->B:106:0x02bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02f5 A[LOOP:2: B:113:0x02f3->B:114:0x02f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0222  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTranscriptMode.onLayout(boolean, int, int, int, int):void");
    }

    private static int MenuHostHelper$$ExternalSyntheticLambda1(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            setIconTintList seticontintlist = (setIconTintList) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) seticontintlist).leftMargin - i;
            int i6 = ((ViewGroup.MarginLayoutParams) seticontintlist).rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    private int setIconTintList(View view, int i, int[] iArr, int i2) {
        setIconTintList seticontintlist = (setIconTintList) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) seticontintlist).leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int x = setX(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, x, max + measuredWidth, view.getMeasuredHeight() + x);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) seticontintlist).rightMargin;
    }

    private int setX(View view, int i, int[] iArr, int i2) {
        setIconTintList seticontintlist = (setIconTintList) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) seticontintlist).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int x = setX(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, x, max, view.getMeasuredHeight() + x);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) seticontintlist).leftMargin);
    }

    private int setX(View view, int i) {
        setIconTintList seticontintlist = (setIconTintList) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int y = setY(seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1);
        if (y != 48) {
            if (y == 80) {
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) seticontintlist).bottomMargin) - i2;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height = getHeight();
            int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
            if (i3 < ((ViewGroup.MarginLayoutParams) seticontintlist).topMargin) {
                i3 = ((ViewGroup.MarginLayoutParams) seticontintlist).topMargin;
            } else {
                int i4 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
                if (i4 < ((ViewGroup.MarginLayoutParams) seticontintlist).bottomMargin) {
                    i3 = Math.max(0, i3 - (((ViewGroup.MarginLayoutParams) seticontintlist).bottomMargin - i4));
                }
            }
            return paddingTop + i3;
        }
        return getPaddingTop() - i2;
    }

    private int setY(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.setTextAppearanceResource & 112;
    }

    private void setX(List<View> list, int i) {
        boolean z = setBaselineAlignBottom.ViewPager$SavedState$1(this) == 1;
        int childCount = getChildCount();
        int MenuHostHelper$$ExternalSyntheticLambda1 = setWeightSum.MenuHostHelper$$ExternalSyntheticLambda1(i, setBaselineAlignBottom.ViewPager$SavedState$1(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                setIconTintList seticontintlist = (setIconTintList) childAt.getLayoutParams();
                if (seticontintlist.setIconTintList == 0 && MenuHostHelper$$ExternalSyntheticLambda1(childAt) && MenuHostHelper$$ExternalSyntheticLambda1(seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1) == MenuHostHelper$$ExternalSyntheticLambda1) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            setIconTintList seticontintlist2 = (setIconTintList) childAt2.getLayoutParams();
            if (seticontintlist2.setIconTintList == 0 && MenuHostHelper$$ExternalSyntheticLambda1(childAt2) && MenuHostHelper$$ExternalSyntheticLambda1(seticontintlist2.MenuHostHelper$$ExternalSyntheticLambda1) == MenuHostHelper$$ExternalSyntheticLambda1) {
                list.add(childAt2);
            }
        }
    }

    private int MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        int ViewPager$SavedState$1 = setBaselineAlignBottom.ViewPager$SavedState$1(this);
        int MenuHostHelper$$ExternalSyntheticLambda1 = setWeightSum.MenuHostHelper$$ExternalSyntheticLambda1(i, ViewPager$SavedState$1) & 7;
        return (MenuHostHelper$$ExternalSyntheticLambda1 == 1 || MenuHostHelper$$ExternalSyntheticLambda1 == 3 || MenuHostHelper$$ExternalSyntheticLambda1 == 5) ? MenuHostHelper$$ExternalSyntheticLambda1 : ViewPager$SavedState$1 == 1 ? 5 : 3;
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda1(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private static int setX(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return setImeHintLocales.setIconTintList(marginLayoutParams) + setImeHintLocales.MenuHostHelper$$ExternalSyntheticLambda1(marginLayoutParams);
    }

    private static int setY(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private static setIconTintList MenuHostHelper$$ExternalSyntheticLambda0(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof setIconTintList) {
            return new setIconTintList((setIconTintList) layoutParams);
        }
        if (layoutParams instanceof setMaxEms$MenuHostHelper$$ExternalSyntheticLambda0) {
            return new setIconTintList((setMaxEms$MenuHostHelper$$ExternalSyntheticLambda0) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new setIconTintList((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new setIconTintList(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static setIconTintList setY() {
        return new setIconTintList();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof setIconTintList);
    }

    public final setTransformationMethod setNavigationOnClickListener() {
        if (this.setChipIconEnabled == null) {
            this.setChipIconEnabled = new AppBarLayout$ScrollingViewBehavior(this, true);
        }
        return this.setChipIconEnabled;
    }

    private boolean setIconTintList(View view) {
        return view.getParent() == this || this.MenuHostHelper$$ExternalSyntheticLambda1.contains(view);
    }

    public void setCollapsible(boolean z) {
        this.setAnimationFromJson = z;
        requestLayout();
    }

    public void setMenuCallbacks(setBackgroundTintMode.setY sety, setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0 setnavigationicontint_menuhosthelper__externalsyntheticlambda0) {
        this.setTextAlignment = sety;
        this.setGuidelinePercent = setnavigationicontint_menuhosthelper__externalsyntheticlambda0;
        setOnSeekBarChangeListener setonseekbarchangelistener = this.setOnLongClickListener;
        if (setonseekbarchangelistener != null) {
            setonseekbarchangelistener.setMenuCallbacks(sety, setnavigationicontint_menuhosthelper__externalsyntheticlambda0);
        }
    }

    private void ViewPager$SavedState$1() {
        if (this.setTextScaleX == null) {
            this.setTextScaleX = new setAlpha();
        }
    }

    private ArrayList<MenuItem> setTextScaleX() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        setIconSize();
        Menu MenuHostHelper$$ExternalSyntheticLambda1 = this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1();
        for (int i = 0; i < MenuHostHelper$$ExternalSyntheticLambda1.size(); i++) {
            arrayList.add(MenuHostHelper$$ExternalSyntheticLambda1.getItem(i));
        }
        return arrayList;
    }

    public final void setCenterIfNoTextEnabled() {
        Iterator<MenuItem> it = this.setConstraintSet.iterator();
        while (it.hasNext()) {
            setIconSize();
            this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1().removeItem(it.next().getItemId());
        }
        setIconSize();
        this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1();
        ArrayList<MenuItem> textScaleX = setTextScaleX();
        FullLifecycleObserverAdapter fullLifecycleObserverAdapter = this.setUnboundedRipple;
        new setShrinkMotionSpec(getContext());
        Iterator<setMenuAlignmentMode> it2 = fullLifecycleObserverAdapter.setY.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        ArrayList<MenuItem> textScaleX2 = setTextScaleX();
        textScaleX2.removeAll(textScaleX);
        this.setConstraintSet = textScaleX2;
        Iterator<setMenuAlignmentMode> it3 = this.setUnboundedRipple.setY.iterator();
        while (it3.hasNext()) {
            it3.next();
        }
    }

    /* loaded from: classes.dex */
    public static class setIconTintList extends setMaxEms$MenuHostHelper$$ExternalSyntheticLambda0 {
        int setIconTintList;

        public setIconTintList(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.setIconTintList = 0;
        }

        public setIconTintList() {
            super(-2, -2);
            this.setIconTintList = 0;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = 8388627;
        }

        public setIconTintList(setIconTintList seticontintlist) {
            super((setMaxEms$MenuHostHelper$$ExternalSyntheticLambda0) seticontintlist);
            this.setIconTintList = 0;
            this.setIconTintList = seticontintlist.setIconTintList;
        }

        public setIconTintList(setMaxEms$MenuHostHelper$$ExternalSyntheticLambda0 setmaxems_menuhosthelper__externalsyntheticlambda0) {
            super(setmaxems_menuhosthelper__externalsyntheticlambda0);
            this.setIconTintList = 0;
        }

        public setIconTintList(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.setIconTintList = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public setIconTintList(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.setIconTintList = 0;
        }
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new setIconTintList(getContext(), attributeSet);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        setShrinkMotionSpec setshrinkmotionspec = new setShrinkMotionSpec(getContext());
        setIconSize();
        setshrinkmotionspec.inflate(i, this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1());
    }

    public void setLogo(Drawable drawable) {
        if (drawable == null) {
            ImageView imageView = this.setCheckedIconEnabled;
            if (imageView != null && setIconTintList(imageView)) {
                removeView(this.setCheckedIconEnabled);
                this.MenuHostHelper$$ExternalSyntheticLambda1.remove(this.setCheckedIconEnabled);
            }
        } else {
            if (this.setCheckedIconEnabled == null) {
                this.setCheckedIconEnabled = new setOutlineAmbientShadowColor(getContext());
            }
            if (!setIconTintList(this.setCheckedIconEnabled)) {
                setX((View) this.setCheckedIconEnabled, true);
            }
        }
        ImageView imageView2 = this.setCheckedIconEnabled;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }
}