package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import o.TextInputLayout$SavedState$1;
import o.setAnimationFromJson;

/* loaded from: classes.dex */
public class FabTransformationBehavior extends LinearLayout implements TextInputLayout$SavedState$1.setY, AbsListView.SelectionBoundsAdjuster {
    private Drawable MenuHostHelper$$ExternalSyntheticLambda0;
    private boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private Drawable ViewPager$SavedState$1;
    private ImageView setCenterIfNoTextEnabled;
    private int setChipCornerRadius;
    private RadioButton setIconSize;
    private CheckBox setIconTintList;
    private ImageView setLayoutAnimation;
    private ImageView setNavigationOnClickListener;
    private boolean setOnLongClickListener;
    private TextView setTextAlignment;
    private Context setTextScaleX;
    private LayoutInflater setUiOptions;
    private boolean setUnboundedRipple;
    private LinearLayout setX;
    public ActionMenuPresenter$SavedState$1 setY;
    private TextView setZ;

    @Override // o.TextInputLayout$SavedState$1.setY
    public final boolean setIconTintList() {
        return false;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f040288);
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setExpandedHintEnabled MenuHostHelper$$ExternalSyntheticLambda0 = setExpandedHintEnabled.MenuHostHelper$$ExternalSyntheticLambda0(getContext(), attributeSet, setAnimationFromJson.setY.setImageAssetDelegate, i, 0);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setChipMinHeightResource);
        this.setChipCornerRadius = MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener(setAnimationFromJson.setY.setStartIconVisible, -1);
        this.setOnLongClickListener = MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(setAnimationFromJson.setY.setMenuCallbacks, false);
        this.setTextScaleX = context;
        this.ViewPager$SavedState$1 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.notifyAll);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.res_0x7f040166, 0);
        this.setUnboundedRipple = obtainStyledAttributes.hasValue(0);
        MenuHostHelper$$ExternalSyntheticLambda0.setX();
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setY(this, this.MenuHostHelper$$ExternalSyntheticLambda0);
        TextView textView = (TextView) findViewById(R.id.res_0x7f0a01f9);
        this.setZ = textView;
        int i = this.setChipCornerRadius;
        if (i != -1) {
            textView.setTextAppearance(this.setTextScaleX, i);
        }
        this.setTextAlignment = (TextView) findViewById(R.id.res_0x7f0a01af);
        ImageView imageView = (ImageView) findViewById(R.id.res_0x7f0a01d4);
        this.setCenterIfNoTextEnabled = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.ViewPager$SavedState$1);
        }
        this.setNavigationOnClickListener = (ImageView) findViewById(R.id.res_0x7f0a00e1);
        this.setX = (LinearLayout) findViewById(R.id.res_0x7f0a008c);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    @Override // o.TextInputLayout$SavedState$1.setY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setIconTintList(o.ActionMenuPresenter$SavedState$1 r5) {
        /*
            r4 = this;
            r4.setY = r5
            boolean r0 = r5.isVisible()
            r1 = 8
            r2 = 0
            if (r0 == 0) goto Ld
            r0 = 0
            goto Lf
        Ld:
            r0 = 8
        Lf:
            r4.setVisibility(r0)
            boolean r0 = r4.setIconTintList()
            if (r0 == 0) goto L1d
            java.lang.CharSequence r0 = r5.getTitleCondensed()
            goto L21
        L1d:
            java.lang.CharSequence r0 = r5.getTitle()
        L21:
            r4.setTitle(r0)
            boolean r0 = r5.isCheckable()
            r4.setCheckable(r0)
            o.setNavigationIconTint r0 = r5.MenuHostHelper$$ExternalSyntheticLambda1
            boolean r0 = r0.setLayoutAnimation()
            if (r0 == 0) goto L44
            o.setNavigationIconTint r0 = r5.MenuHostHelper$$ExternalSyntheticLambda1
            boolean r0 = r0.setNavigationOnClickListener()
            if (r0 == 0) goto L3e
            char r0 = r5.setLayoutAnimation
            goto L40
        L3e:
            char r0 = r5.setUnboundedRipple
        L40:
            if (r0 == 0) goto L44
            r0 = 1
            goto L45
        L44:
            r0 = 0
        L45:
            o.setNavigationIconTint r3 = r5.MenuHostHelper$$ExternalSyntheticLambda1
            boolean r3 = r3.setNavigationOnClickListener()
            if (r3 == 0) goto L50
            char r3 = r5.setLayoutAnimation
            goto L52
        L50:
            char r3 = r5.setUnboundedRipple
        L52:
            r4.setShortcut(r0, r3)
            android.graphics.drawable.Drawable r0 = r5.getIcon()
            r4.setIcon(r0)
            boolean r0 = r5.isEnabled()
            r4.setEnabled(r0)
            boolean r0 = r5.hasSubMenu()
            android.widget.ImageView r3 = r4.setCenterIfNoTextEnabled
            if (r3 == 0) goto L71
            if (r0 == 0) goto L6e
            r1 = 0
        L6e:
            r3.setVisibility(r1)
        L71:
            java.lang.CharSequence r5 = r5.getContentDescription()
            r4.setContentDescription(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.FabTransformationBehavior.setIconTintList(o.ActionMenuPresenter$SavedState$1):void");
    }

    public void setForceShowIcon(boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = z;
        this.setOnLongClickListener = z;
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.setZ.setText(charSequence);
            if (this.setZ.getVisibility() != 0) {
                this.setZ.setVisibility(0);
            }
        } else if (this.setZ.getVisibility() != 8) {
            this.setZ.setVisibility(8);
        }
    }

    @Override // o.TextInputLayout$SavedState$1.setY
    public final ActionMenuPresenter$SavedState$1 setY() {
        return this.setY;
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.setIconSize == null && this.setIconTintList == null) {
            return;
        }
        if ((this.setY.MenuHostHelper$$ExternalSyntheticLambda0 & 4) != 0) {
            if (this.setIconSize == null) {
                MenuHostHelper$$ExternalSyntheticLambda0();
            }
            compoundButton = this.setIconSize;
            view = this.setIconTintList;
        } else {
            if (this.setIconTintList == null) {
                MenuHostHelper$$ExternalSyntheticLambda1();
            }
            compoundButton = this.setIconTintList;
            view = this.setIconSize;
        }
        if (z) {
            compoundButton.setChecked(this.setY.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.setIconTintList;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.setIconSize;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.setY.MenuHostHelper$$ExternalSyntheticLambda0 & 4) != 0) {
            if (this.setIconSize == null) {
                MenuHostHelper$$ExternalSyntheticLambda0();
            }
            compoundButton = this.setIconSize;
        } else {
            if (this.setIconTintList == null) {
                MenuHostHelper$$ExternalSyntheticLambda1();
            }
            compoundButton = this.setIconTintList;
        }
        compoundButton.setChecked(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
        if (r10 == false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setShortcut(boolean r10, char r11) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.FabTransformationBehavior.setShortcut(boolean, char):void");
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setIconSize;
        boolean z2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (z2 || this.setOnLongClickListener) {
            ImageView imageView = this.setLayoutAnimation;
            if (imageView == null && drawable == null && !this.setOnLongClickListener) {
                return;
            }
            if (imageView == null) {
                if (this.setUiOptions == null) {
                    this.setUiOptions = LayoutInflater.from(getContext());
                }
                ImageView imageView2 = (ImageView) this.setUiOptions.inflate(R.layout.res_0x7f0d000f, (ViewGroup) this, false);
                this.setLayoutAnimation = imageView2;
                LinearLayout linearLayout = this.setX;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable != null || this.setOnLongClickListener) {
                ImageView imageView3 = this.setLayoutAnimation;
                if (!z2) {
                    drawable = null;
                }
                imageView3.setImageDrawable(drawable);
                if (this.setLayoutAnimation.getVisibility() != 0) {
                    this.setLayoutAnimation.setVisibility(0);
                    return;
                }
                return;
            }
            this.setLayoutAnimation.setVisibility(8);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.setLayoutAnimation != null && this.setOnLongClickListener) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.setLayoutAnimation.getLayoutParams();
            if (layoutParams.height > 0 && ((ViewGroup.LayoutParams) layoutParams2).width <= 0) {
                ((ViewGroup.LayoutParams) layoutParams2).width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.setNavigationOnClickListener;
        if (imageView != null) {
            imageView.setVisibility((this.setUnboundedRipple || !z) ? 8 : 0);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.setNavigationOnClickListener;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.setNavigationOnClickListener.getLayoutParams();
        rect.top += this.setNavigationOnClickListener.getHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.setUiOptions == null) {
            this.setUiOptions = LayoutInflater.from(getContext());
        }
        CheckBox checkBox = (CheckBox) this.setUiOptions.inflate(R.layout.res_0x7f0d000e, (ViewGroup) this, false);
        this.setIconTintList = checkBox;
        LinearLayout linearLayout = this.setX;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.setUiOptions == null) {
            this.setUiOptions = LayoutInflater.from(getContext());
        }
        RadioButton radioButton = (RadioButton) this.setUiOptions.inflate(R.layout.res_0x7f0d0011, (ViewGroup) this, false);
        this.setIconSize = radioButton;
        LinearLayout linearLayout = this.setX;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }
}