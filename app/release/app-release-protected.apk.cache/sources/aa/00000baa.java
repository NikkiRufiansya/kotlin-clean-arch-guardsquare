package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import o.TextInputLayout$SavedState$1;
import o.setBackgroundTintMode;
import o.setExpandedTitleTextColor;
import o.setOnSeekBarChangeListener;
import o.setTooltipText;

/* loaded from: classes.dex */
public class setExpandedTitleTextColor extends onActivityResumed implements AppBarLayout$BaseBehavior$MenuHostHelper$$ExternalSyntheticLambda1 {
    final setUiOptions ViewPager$SavedState$1;
    private int setAnimationFromJson;
    boolean setCenterIfNoTextEnabled;
    private int setCheckedIconEnabled;
    boolean setChipCornerRadius;
    private int setGuidelinePercent;
    boolean setIconSize;
    setX setLayoutAnimation;
    private boolean setLayoutDirection;
    private boolean setMaxEms;
    private boolean setMinAndMaxProgress;
    Drawable setNavigationOnClickListener;
    setExpandedTitleTextColor$MenuHostHelper$$ExternalSyntheticLambda1 setOnLongClickListener;
    private boolean setOnNavigationItemSelectedListener;
    setIconTintList setTextAlignment;
    private setExpandedTitleTextColor$MenuHostHelper$$ExternalSyntheticLambda0 setTextAppearanceResource;
    private final SparseBooleanArray setTextScaleX;
    setY setUiOptions;
    int setUnboundedRipple;
    private int setZ;

    public setExpandedTitleTextColor(Context context) {
        super(context, R.layout.res_0x7f0d0003, R.layout.res_0x7f0d0002);
        this.setTextScaleX = new SparseBooleanArray();
        this.ViewPager$SavedState$1 = new setUiOptions();
    }

    @Override // o.onActivityResumed, o.setBackgroundTintMode
    public final void setX(Context context, setNavigationIconTint setnavigationicontint) {
        super.setX(context, setnavigationicontint);
        Resources resources = context.getResources();
        setImageTintMode MenuHostHelper$$ExternalSyntheticLambda0 = setImageTintMode.MenuHostHelper$$ExternalSyntheticLambda0(context);
        if (!this.setIconSize) {
            this.setCenterIfNoTextEnabled = setImageTintMode.setLayoutAnimation();
        }
        this.setCheckedIconEnabled = MenuHostHelper$$ExternalSyntheticLambda0.setX();
        this.setZ = MenuHostHelper$$ExternalSyntheticLambda0.setY();
        int i = this.setCheckedIconEnabled;
        if (this.setCenterIfNoTextEnabled) {
            if (this.setUiOptions == null) {
                setY sety = new setY(this.setX);
                this.setUiOptions = sety;
                if (this.setChipCornerRadius) {
                    sety.setImageDrawable(this.setNavigationOnClickListener);
                    this.setNavigationOnClickListener = null;
                    this.setChipCornerRadius = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.setUiOptions.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.setUiOptions.getMeasuredWidth();
        } else {
            this.setUiOptions = null;
        }
        this.setAnimationFromJson = i;
        this.setGuidelinePercent = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public final void setLayoutAnimation() {
        this.setZ = setImageTintMode.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0).setY();
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(true);
        }
    }

    public final void setIconTintList(boolean z) {
        this.setMaxEms = z;
    }

    @Override // o.onActivityResumed
    public final TextInputLayout$SavedState$1 MenuHostHelper$$ExternalSyntheticLambda1(ViewGroup viewGroup) {
        TextInputLayout$SavedState$1 textInputLayout$SavedState$1 = this.setY;
        TextInputLayout$SavedState$1 MenuHostHelper$$ExternalSyntheticLambda1 = super.MenuHostHelper$$ExternalSyntheticLambda1(viewGroup);
        if (textInputLayout$SavedState$1 != MenuHostHelper$$ExternalSyntheticLambda1) {
            ((setOnSeekBarChangeListener) MenuHostHelper$$ExternalSyntheticLambda1).setPresenter(this);
        }
        return MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.onActivityResumed
    public final View MenuHostHelper$$ExternalSyntheticLambda1(ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1, View view, ViewGroup viewGroup) {
        View actionView = actionMenuPresenter$SavedState$1.getActionView();
        if (actionView == null || actionMenuPresenter$SavedState$1.setX()) {
            actionView = super.MenuHostHelper$$ExternalSyntheticLambda1(actionMenuPresenter$SavedState$1, view, viewGroup);
        }
        actionView.setVisibility(actionMenuPresenter$SavedState$1.isActionViewExpanded() ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((setOnSeekBarChangeListener) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(setOnSeekBarChangeListener.setIconTintList(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [o.setExpandedTitleTextColor$MenuHostHelper$$ExternalSyntheticLambda0] */
    @Override // o.onActivityResumed
    public final void setIconTintList(ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1, TextInputLayout$SavedState$1.setY sety) {
        sety.setIconTintList(actionMenuPresenter$SavedState$1);
        setTooltipText settooltiptext = (setTooltipText) sety;
        settooltiptext.setItemInvoker((setOnSeekBarChangeListener) this.setY);
        if (this.setTextAppearanceResource == null) {
            this.setTextAppearanceResource = new setTooltipText.setX() { // from class: o.setExpandedTitleTextColor$MenuHostHelper$$ExternalSyntheticLambda0
                @Override // o.setTooltipText.setX
                public final setEdgeEffectFactory setY() {
                    if (setExpandedTitleTextColor.this.setOnLongClickListener != null) {
                        setExpandedTitleTextColor$MenuHostHelper$$ExternalSyntheticLambda1 setexpandedtitletextcolor_menuhosthelper__externalsyntheticlambda1 = setExpandedTitleTextColor.this.setOnLongClickListener;
                        if (setexpandedtitletextcolor_menuhosthelper__externalsyntheticlambda1.setIconTintList == null) {
                            setexpandedtitletextcolor_menuhosthelper__externalsyntheticlambda1.setIconTintList = setexpandedtitletextcolor_menuhosthelper__externalsyntheticlambda1.setIconTintList();
                        }
                        return setexpandedtitletextcolor_menuhosthelper__externalsyntheticlambda1.setIconTintList;
                    }
                    return null;
                }
            };
        }
        settooltiptext.setPopupCallback(this.setTextAppearanceResource);
    }

    @Override // o.onActivityResumed, o.setBackgroundTintMode
    public final void MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        super.MenuHostHelper$$ExternalSyntheticLambda0(z);
        ((View) this.setY).requestLayout();
        boolean z2 = false;
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            ArrayList<ActionMenuPresenter$SavedState$1> iconTintList = this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList();
            int size = iconTintList.size();
            for (int i = 0; i < size; i++) {
                AppBarLayout$BaseBehavior appBarLayout$BaseBehavior = iconTintList.get(i).setY;
                if (appBarLayout$BaseBehavior != null) {
                    appBarLayout$BaseBehavior.MenuHostHelper$$ExternalSyntheticLambda1(this);
                }
            }
        }
        ArrayList<ActionMenuPresenter$SavedState$1> x = this.MenuHostHelper$$ExternalSyntheticLambda1 != null ? this.MenuHostHelper$$ExternalSyntheticLambda1.setX() : null;
        if (this.setCenterIfNoTextEnabled && x != null) {
            int size2 = x.size();
            if (size2 == 1) {
                z2 = !x.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.setUiOptions == null) {
                this.setUiOptions = new setY(this.setX);
            }
            ViewGroup viewGroup = (ViewGroup) this.setUiOptions.getParent();
            if (viewGroup != this.setY) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.setUiOptions);
                }
                ((setOnSeekBarChangeListener) this.setY).addView(this.setUiOptions, setOnSeekBarChangeListener.MenuHostHelper$$ExternalSyntheticLambda0());
            }
        } else {
            setY sety = this.setUiOptions;
            if (sety != null && sety.getParent() == this.setY) {
                ((ViewGroup) this.setY).removeView(this.setUiOptions);
            }
        }
        ((setOnSeekBarChangeListener) this.setY).setOverflowReserved(this.setCenterIfNoTextEnabled);
    }

    @Override // o.onActivityResumed
    public final boolean setX(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.setUiOptions) {
            return false;
        }
        return super.setX(viewGroup, i);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [o.setExpandedTitleTextColor$MenuHostHelper$$ExternalSyntheticLambda1, o.RemoteActionCompatParcelizer] */
    @Override // o.onActivityResumed, o.setBackgroundTintMode
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(final minusKey minuskey) {
        final View view;
        boolean z = false;
        if (minuskey.hasVisibleItems()) {
            minusKey minuskey2 = minuskey;
            while (minuskey2.setTextAlignment != this.MenuHostHelper$$ExternalSyntheticLambda1) {
                minuskey2 = (minusKey) minuskey2.setTextAlignment;
            }
            MenuItem item = minuskey2.getItem();
            ViewGroup viewGroup = (ViewGroup) this.setY;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    view = viewGroup.getChildAt(i);
                    if ((view instanceof TextInputLayout$SavedState$1.setY) && ((TextInputLayout$SavedState$1.setY) view).setY() == item) {
                        break;
                    }
                }
            }
            view = null;
            if (view == null) {
                return false;
            }
            this.setUnboundedRipple = minuskey.getItem().getItemId();
            int size = minuskey.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item2 = minuskey.getItem(i2);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i2++;
            }
            final Context context = this.MenuHostHelper$$ExternalSyntheticLambda0;
            ?? r0 = new RemoteActionCompatParcelizer(context, minuskey, view) { // from class: o.setExpandedTitleTextColor$MenuHostHelper$$ExternalSyntheticLambda1
                {
                    View view2;
                    TextInputLayout$SavedState$1 textInputLayout$SavedState$1;
                    if (!((((ActionMenuPresenter$SavedState$1) minuskey.getItem()).MenuHostHelper$$ExternalSyntheticLambda0 & 32) == 32)) {
                        if (setExpandedTitleTextColor.this.setUiOptions == null) {
                            textInputLayout$SavedState$1 = setExpandedTitleTextColor.this.setY;
                            view2 = (View) textInputLayout$SavedState$1;
                        } else {
                            view2 = setExpandedTitleTextColor.this.setUiOptions;
                        }
                        this.MenuHostHelper$$ExternalSyntheticLambda0 = view2;
                    }
                    setExpandedTitleTextColor.setUiOptions setuioptions = setExpandedTitleTextColor.this.ViewPager$SavedState$1;
                    this.setX = setuioptions;
                    setChipIconEnabledResource setchipiconenabledresource = this.setIconTintList;
                    if (setchipiconenabledresource != null) {
                        setchipiconenabledresource.MenuHostHelper$$ExternalSyntheticLambda1(setuioptions);
                    }
                }

                @Override // o.RemoteActionCompatParcelizer
                public final void MenuHostHelper$$ExternalSyntheticLambda1() {
                    setExpandedTitleTextColor.this.setOnLongClickListener = null;
                    setExpandedTitleTextColor.this.setUnboundedRipple = 0;
                    super.MenuHostHelper$$ExternalSyntheticLambda1();
                }
            };
            this.setOnLongClickListener = r0;
            r0.MenuHostHelper$$ExternalSyntheticLambda1 = z;
            setChipIconEnabledResource setchipiconenabledresource = r0.setIconTintList;
            if (setchipiconenabledresource != null) {
                setchipiconenabledresource.MenuHostHelper$$ExternalSyntheticLambda1(z);
            }
            if (MenuHostHelper$$ExternalSyntheticLambda0()) {
                super.MenuHostHelper$$ExternalSyntheticLambda1(minuskey);
                return true;
            }
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        return false;
    }

    public final boolean setNavigationOnClickListener() {
        if (!this.setCenterIfNoTextEnabled || setUnboundedRipple() || this.MenuHostHelper$$ExternalSyntheticLambda1 == null || this.setY == null || this.setTextAlignment != null || this.MenuHostHelper$$ExternalSyntheticLambda1.setX().isEmpty()) {
            return false;
        }
        this.setTextAlignment = new setIconTintList(new setX(this.MenuHostHelper$$ExternalSyntheticLambda0, this.MenuHostHelper$$ExternalSyntheticLambda1, this.setUiOptions));
        ((View) this.setY).post(this.setTextAlignment);
        return true;
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.setTextAlignment != null && this.setY != null) {
            ((View) this.setY).removeCallbacks(this.setTextAlignment);
            this.setTextAlignment = null;
            return true;
        }
        setX setx = this.setLayoutAnimation;
        if (setx != null) {
            setx.setY();
            return true;
        }
        return false;
    }

    public final boolean setIconTintList() {
        return MenuHostHelper$$ExternalSyntheticLambda1() | setY();
    }

    public final boolean setY() {
        setExpandedTitleTextColor$MenuHostHelper$$ExternalSyntheticLambda1 setexpandedtitletextcolor_menuhosthelper__externalsyntheticlambda1 = this.setOnLongClickListener;
        if (setexpandedtitletextcolor_menuhosthelper__externalsyntheticlambda1 != null) {
            setexpandedtitletextcolor_menuhosthelper__externalsyntheticlambda1.setY();
            return true;
        }
        return false;
    }

    public final boolean setUnboundedRipple() {
        setX setx = this.setLayoutAnimation;
        if (setx != null) {
            setChipIconEnabledResource setchipiconenabledresource = setx.setIconTintList;
            if (setchipiconenabledresource != null && setchipiconenabledresource.setUnboundedRipple()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.onActivityResumed, o.setBackgroundTintMode
    public final boolean setX() {
        ArrayList<ActionMenuPresenter$SavedState$1> arrayList;
        int i;
        int i2;
        boolean z;
        View view = null;
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            arrayList = this.MenuHostHelper$$ExternalSyntheticLambda1.setUnboundedRipple();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i3 = this.setZ;
        int i4 = this.setAnimationFromJson;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.setY;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = 1;
            if (i5 >= i) {
                break;
            }
            ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = arrayList.get(i5);
            if ((actionMenuPresenter$SavedState$1.setNavigationOnClickListener & 2) == 2) {
                i7++;
            } else if ((actionMenuPresenter$SavedState$1.setNavigationOnClickListener & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (this.setMaxEms && actionMenuPresenter$SavedState$1.isActionViewExpanded()) {
                i3 = 0;
            }
            i5++;
        }
        if (this.setCenterIfNoTextEnabled && (z2 || i6 + i7 > i3)) {
            i3--;
        }
        int i8 = i3 - i7;
        SparseBooleanArray sparseBooleanArray = this.setTextScaleX;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < i) {
            ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$12 = arrayList.get(i9);
            if ((actionMenuPresenter$SavedState$12.setNavigationOnClickListener & i2) == i2) {
                View MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(actionMenuPresenter$SavedState$12, view, viewGroup);
                MenuHostHelper$$ExternalSyntheticLambda1.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = MenuHostHelper$$ExternalSyntheticLambda1.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                int groupId = actionMenuPresenter$SavedState$12.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, z);
                }
                actionMenuPresenter$SavedState$12.MenuHostHelper$$ExternalSyntheticLambda0 |= 32;
            } else if ((actionMenuPresenter$SavedState$12.setNavigationOnClickListener & z) == z) {
                int groupId2 = actionMenuPresenter$SavedState$12.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i8 > 0 || z3) && i4 > 0;
                if (z4) {
                    View MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(actionMenuPresenter$SavedState$12, view, viewGroup);
                    MenuHostHelper$$ExternalSyntheticLambda12.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = MenuHostHelper$$ExternalSyntheticLambda12.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z4 &= i4 + i10 > 0;
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, z);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i11 = 0; i11 < i9; i11++) {
                        ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$13 = arrayList.get(i11);
                        if (actionMenuPresenter$SavedState$13.getGroupId() == groupId2) {
                            if ((actionMenuPresenter$SavedState$13.MenuHostHelper$$ExternalSyntheticLambda0 & 32) == 32) {
                                i8++;
                            }
                            actionMenuPresenter$SavedState$13.MenuHostHelper$$ExternalSyntheticLambda0 &= -33;
                        }
                    }
                }
                if (z4) {
                    i8--;
                }
                if (z4) {
                    actionMenuPresenter$SavedState$12.MenuHostHelper$$ExternalSyntheticLambda0 |= 32;
                } else {
                    actionMenuPresenter$SavedState$12.MenuHostHelper$$ExternalSyntheticLambda0 &= -33;
                }
            } else {
                actionMenuPresenter$SavedState$12.MenuHostHelper$$ExternalSyntheticLambda0 &= -33;
            }
            i9++;
            view = null;
            i2 = 2;
            z = 1;
        }
        return true;
    }

    @Override // o.onActivityResumed, o.setBackgroundTintMode
    public final void setIconTintList(setNavigationIconTint setnavigationicontint, boolean z) {
        setIconTintList();
        super.setIconTintList(setnavigationicontint, z);
    }

    @Override // o.setBackgroundTintMode
    public final Parcelable setOnLongClickListener() {
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener();
        setnavigationonclicklistener.setIconTintList = this.setUnboundedRipple;
        return setnavigationonclicklistener;
    }

    @Override // o.setBackgroundTintMode
    public final void setIconTintList(Parcelable parcelable) {
        MenuItem findItem;
        if (parcelable instanceof setNavigationOnClickListener) {
            setNavigationOnClickListener setnavigationonclicklistener = (setNavigationOnClickListener) parcelable;
            if (setnavigationonclicklistener.setIconTintList <= 0 || (findItem = this.MenuHostHelper$$ExternalSyntheticLambda1.findItem(setnavigationonclicklistener.setIconTintList)) == null) {
                return;
            }
            MenuHostHelper$$ExternalSyntheticLambda1((minusKey) findItem.getSubMenu());
        }
    }

    public final void setY(setOnSeekBarChangeListener setonseekbarchangelistener) {
        this.setY = setonseekbarchangelistener;
        setonseekbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1);
    }

    /* loaded from: classes.dex */
    public static class setNavigationOnClickListener implements Parcelable {
        public static final Parcelable.Creator<setNavigationOnClickListener> CREATOR = new Parcelable.Creator<setNavigationOnClickListener>() { // from class: androidx.appcompat.widget.ActionMenuPresenter$SavedState$1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ setExpandedTitleTextColor.setNavigationOnClickListener createFromParcel(Parcel parcel) {
                return new setExpandedTitleTextColor.setNavigationOnClickListener(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ setExpandedTitleTextColor.setNavigationOnClickListener[] newArray(int i) {
                return new setExpandedTitleTextColor.setNavigationOnClickListener[i];
            }
        };
        public int setIconTintList;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        setNavigationOnClickListener() {
        }

        public setNavigationOnClickListener(Parcel parcel) {
            this.setIconTintList = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.setIconTintList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setY extends setOutlineAmbientShadowColor implements setOnSeekBarChangeListener.setX {
        @Override // o.setOnSeekBarChangeListener.setX
        public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
            return false;
        }

        @Override // o.setOnSeekBarChangeListener.setX
        public final boolean setX() {
            return false;
        }

        public setY(Context context) {
            super(context, null, R.attr.res_0x7f040021);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            transact.setIconTintList(this, getContentDescription());
            setOnTouchListener(new onActivityPreStopped(this) { // from class: o.setExpandedTitleTextColor.setY.3
                @Override // o.onActivityPreStopped
                public final setEdgeEffectFactory MenuHostHelper$$ExternalSyntheticLambda0() {
                    if (setExpandedTitleTextColor.this.setLayoutAnimation == null) {
                        return null;
                    }
                    setX setx = setExpandedTitleTextColor.this.setLayoutAnimation;
                    if (setx.setIconTintList == null) {
                        setx.setIconTintList = setx.setIconTintList();
                    }
                    return setx.setIconTintList;
                }

                @Override // o.onActivityPreStopped
                public final boolean setIconTintList() {
                    setExpandedTitleTextColor.this.setNavigationOnClickListener();
                    return true;
                }

                @Override // o.onActivityPreStopped
                public final boolean setY() {
                    if (setExpandedTitleTextColor.this.setTextAlignment != null) {
                        return false;
                    }
                    setExpandedTitleTextColor.this.MenuHostHelper$$ExternalSyntheticLambda1();
                    return true;
                }
            });
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            setExpandedTitleTextColor.this.setNavigationOnClickListener();
            return true;
        }

        @Override // android.widget.ImageView
        protected final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setX extends RemoteActionCompatParcelizer {
        public setX(Context context, setNavigationIconTint setnavigationicontint, View view) {
            super(context, setnavigationicontint, view, true, R.attr.res_0x7f040022);
            setX();
            setUiOptions setuioptions = setExpandedTitleTextColor.this.ViewPager$SavedState$1;
            this.setX = setuioptions;
            setChipIconEnabledResource setchipiconenabledresource = this.setIconTintList;
            if (setchipiconenabledresource != null) {
                setchipiconenabledresource.MenuHostHelper$$ExternalSyntheticLambda1(setuioptions);
            }
        }

        @Override // o.RemoteActionCompatParcelizer
        public final void MenuHostHelper$$ExternalSyntheticLambda1() {
            if (setExpandedTitleTextColor.this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                setExpandedTitleTextColor.this.MenuHostHelper$$ExternalSyntheticLambda1.close();
            }
            setExpandedTitleTextColor.this.setLayoutAnimation = null;
            super.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    /* loaded from: classes.dex */
    class setUiOptions implements setBackgroundTintMode.setY {
        setUiOptions() {
        }

        @Override // o.setBackgroundTintMode.setY
        public final boolean setY(setNavigationIconTint setnavigationicontint) {
            if (setnavigationicontint == setExpandedTitleTextColor.this.MenuHostHelper$$ExternalSyntheticLambda1) {
                return false;
            }
            setExpandedTitleTextColor.this.setUnboundedRipple = ((minusKey) setnavigationicontint).getItem().getItemId();
            setBackgroundTintMode.setY sety = setExpandedTitleTextColor.this.setIconTintList;
            if (sety != null) {
                return sety.setY(setnavigationicontint);
            }
            return false;
        }

        @Override // o.setBackgroundTintMode.setY
        public final void MenuHostHelper$$ExternalSyntheticLambda0(setNavigationIconTint setnavigationicontint, boolean z) {
            if (setnavigationicontint instanceof minusKey) {
                setnavigationicontint.MenuHostHelper$$ExternalSyntheticLambda1().setX(false);
            }
            setBackgroundTintMode.setY sety = setExpandedTitleTextColor.this.setIconTintList;
            if (sety != null) {
                sety.MenuHostHelper$$ExternalSyntheticLambda0(setnavigationicontint, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setIconTintList implements Runnable {
        private setX setIconTintList;

        public setIconTintList(setX setx) {
            this.setIconTintList = setx;
        }

        @Override // java.lang.Runnable
        public final void run() {
            setNavigationIconTint setnavigationicontint;
            setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0 setnavigationicontint_menuhosthelper__externalsyntheticlambda0;
            if (setExpandedTitleTextColor.this.MenuHostHelper$$ExternalSyntheticLambda1 != null && (setnavigationicontint_menuhosthelper__externalsyntheticlambda0 = (setnavigationicontint = setExpandedTitleTextColor.this.MenuHostHelper$$ExternalSyntheticLambda1).MenuHostHelper$$ExternalSyntheticLambda1) != null) {
                setnavigationicontint_menuhosthelper__externalsyntheticlambda0.setY(setnavigationicontint);
            }
            View view = (View) setExpandedTitleTextColor.this.setY;
            if (view != null && view.getWindowToken() != null && this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0()) {
                setExpandedTitleTextColor.this.setLayoutAnimation = this.setIconTintList;
            }
            setExpandedTitleTextColor.this.setTextAlignment = null;
        }
    }

    @Override // o.onActivityResumed
    public final boolean setX(ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1) {
        return (actionMenuPresenter$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0 & 32) == 32;
    }
}