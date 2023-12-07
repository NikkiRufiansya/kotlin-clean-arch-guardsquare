package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import o.setExpandedTitleMargin;
import o.setVelocityScale;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setLayerType {
    private static final float[][] FloatingActionButton$BaseBehavior = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final float[][] setChipIconTintResource = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    float ExtendableSavedState$1;
    private int FragmentStateAdapter$5;
    float MenuHostHelper$$ExternalSyntheticLambda0;
    float SearchView$SavedState$1;
    boolean ViewPager$SavedState$1;
    float setAnimationFromJson;
    int setCheckedIconEnabled;
    float setChipCornerRadius;
    private int setConstraintSet;
    private int setContentScrimResource;
    float setGuidelinePercent;
    float setHasDecor;
    final setSubtitle setIconSize;
    int setIconified;
    float setLayoutAnimation;
    float setLayoutDirection;
    int setMaxEms;
    float setNavigationOnClickListener;
    float setOnLongClickListener;
    int setOnNavigationItemSelectedListener;
    int setTextAlignment;
    float setTextAppearanceResource;
    boolean setUiOptions;
    int setUnboundedRipple;
    int setX;
    float setY;
    float setZ;
    float setCenterIfNoTextEnabled = 0.5f;
    float setTextScaleX = 0.5f;
    boolean setIconTintList = false;
    float[] MenuHostHelper$$ExternalSyntheticLambda1 = new float[2];
    int[] setMinAndMaxProgress = new int[2];

    /* JADX INFO: Access modifiers changed from: package-private */
    public setLayerType(Context context, setSubtitle setsubtitle, XmlPullParser xmlPullParser) {
        this.setConstraintSet = 0;
        this.FragmentStateAdapter$5 = 0;
        this.setTextAlignment = 0;
        this.setCheckedIconEnabled = -1;
        this.setIconified = -1;
        this.setContentScrimResource = -1;
        this.ExtendableSavedState$1 = 0.5f;
        this.setTextAppearanceResource = 0.5f;
        this.setOnNavigationItemSelectedListener = -1;
        this.setUiOptions = false;
        this.setHasDecor = 0.0f;
        this.SearchView$SavedState$1 = 1.0f;
        this.setChipCornerRadius = 4.0f;
        this.setNavigationOnClickListener = 1.2f;
        this.ViewPager$SavedState$1 = true;
        this.setY = 1.0f;
        this.setUnboundedRipple = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = 10.0f;
        this.setAnimationFromJson = 10.0f;
        this.setZ = 1.0f;
        this.setLayoutDirection = Float.NaN;
        this.setGuidelinePercent = Float.NaN;
        this.setMaxEms = 0;
        this.setX = 0;
        this.setIconSize = setsubtitle;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), setExpandedTitleMargin.setY.setNextFocusRightId);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == setExpandedTitleMargin.setY.setProgressDrawableTiled) {
                this.setCheckedIconEnabled = obtainStyledAttributes.getResourceId(index, this.setCheckedIconEnabled);
            } else if (index == setExpandedTitleMargin.setY.setHelperTextTextAppearance) {
                int i2 = obtainStyledAttributes.getInt(index, this.setConstraintSet);
                this.setConstraintSet = i2;
                float[] fArr = FloatingActionButton$BaseBehavior[i2];
                this.setTextAppearanceResource = fArr[0];
                this.ExtendableSavedState$1 = fArr[1];
            } else if (index == setExpandedTitleMargin.setY.setHintTextColor) {
                int i3 = obtainStyledAttributes.getInt(index, this.FragmentStateAdapter$5);
                this.FragmentStateAdapter$5 = i3;
                float[][] fArr2 = setChipIconTintResource;
                if (i3 < fArr2.length) {
                    float[] fArr3 = fArr2[i3];
                    this.setHasDecor = fArr3[0];
                    this.SearchView$SavedState$1 = fArr3[1];
                } else {
                    this.SearchView$SavedState$1 = Float.NaN;
                    this.setHasDecor = Float.NaN;
                    this.setUiOptions = true;
                }
            } else if (index == setExpandedTitleMargin.setY.setSelectionAfterHeaderView) {
                this.setChipCornerRadius = obtainStyledAttributes.getFloat(index, this.setChipCornerRadius);
            } else if (index == setExpandedTitleMargin.setY.setHovered) {
                this.setNavigationOnClickListener = obtainStyledAttributes.getFloat(index, this.setNavigationOnClickListener);
            } else if (index == setExpandedTitleMargin.setY.setStaticLayoutBuilderConfigurer) {
                this.ViewPager$SavedState$1 = obtainStyledAttributes.getBoolean(index, this.ViewPager$SavedState$1);
            } else if (index == setExpandedTitleMargin.setY.setChipSpacingResource) {
                this.setY = obtainStyledAttributes.getFloat(index, this.setY);
            } else if (index == setExpandedTitleMargin.setY.setSaveFromParentEnabled) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = obtainStyledAttributes.getFloat(index, this.MenuHostHelper$$ExternalSyntheticLambda0);
            } else if (index == setExpandedTitleMargin.setY.setSelectedGroup) {
                this.setIconified = obtainStyledAttributes.getResourceId(index, this.setIconified);
            } else if (index == setExpandedTitleMargin.setY.setHorizontalSpacing) {
                this.setTextAlignment = obtainStyledAttributes.getInt(index, this.setTextAlignment);
            } else if (index == setExpandedTitleMargin.setY.setClipChildren) {
                this.setUnboundedRipple = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == setExpandedTitleMargin.setY.setStateDescription) {
                this.setContentScrimResource = obtainStyledAttributes.getResourceId(index, 0);
            } else if (index == setExpandedTitleMargin.setY.RemoteConfigRegistrar) {
                this.setOnNavigationItemSelectedListener = obtainStyledAttributes.getResourceId(index, this.setOnNavigationItemSelectedListener);
            } else if (index == setExpandedTitleMargin.setY.setLabelVisibilityMode) {
                this.setAnimationFromJson = obtainStyledAttributes.getFloat(index, this.setAnimationFromJson);
            } else if (index == setExpandedTitleMargin.setY.setViewCacheExtension) {
                this.setZ = obtainStyledAttributes.getFloat(index, this.setZ);
            } else if (index == setExpandedTitleMargin.setY.setStartIconContentDescription) {
                this.setLayoutDirection = obtainStyledAttributes.getFloat(index, this.setLayoutDirection);
            } else if (index == setExpandedTitleMargin.setY.setAccessibilityHeading) {
                this.setGuidelinePercent = obtainStyledAttributes.getFloat(index, this.setGuidelinePercent);
            } else if (index == setExpandedTitleMargin.setY.setProgressTintList) {
                this.setMaxEms = obtainStyledAttributes.getInt(index, this.setMaxEms);
            } else if (index == setExpandedTitleMargin.setY.setMenuPrepared) {
                this.setX = obtainStyledAttributes.getInt(index, this.setX);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        if (z) {
            float[][] fArr = setChipIconTintResource;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = FloatingActionButton$BaseBehavior;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = setChipIconTintResource;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = FloatingActionButton$BaseBehavior;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = FloatingActionButton$BaseBehavior[this.setConstraintSet];
        this.setTextAppearanceResource = fArr5[0];
        this.ExtendableSavedState$1 = fArr5[1];
        int i = this.FragmentStateAdapter$5;
        float[][] fArr6 = setChipIconTintResource;
        if (i >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i];
        this.setHasDecor = fArr7[0];
        this.SearchView$SavedState$1 = fArr7[1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        View view;
        int i = this.setCheckedIconEnabled;
        if (i != -1) {
            view = this.setIconSize.findViewById(i);
            if (view == null) {
                StringBuilder sb = new StringBuilder("cannot find TouchAnchorId @id/");
                sb.append(setExtendMotionSpec.MenuHostHelper$$ExternalSyntheticLambda1(this.setIconSize.getContext(), this.setCheckedIconEnabled));
                Log.e("TouchResponse", sb.toString());
            }
        } else {
            view = null;
        }
        if (view instanceof setVelocityScale) {
            setVelocityScale setvelocityscale = (setVelocityScale) view;
            setvelocityscale.setOnTouchListener(new View.OnTouchListener() { // from class: o.setLayerType.3
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return false;
                }
            });
            setvelocityscale.setOnScrollChangeListener(new setVelocityScale.setY() { // from class: o.setLayerType.2
                @Override // o.setVelocityScale.setY
                public final void setIconTintList(setVelocityScale setvelocityscale2) {
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final RectF MenuHostHelper$$ExternalSyntheticLambda0(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.setIconified;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final RectF setIconTintList(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.setContentScrimResource;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public final String toString() {
        if (Float.isNaN(this.setHasDecor)) {
            return "rotation";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.setHasDecor);
        sb.append(" , ");
        sb.append(this.SearchView$SavedState$1);
        return sb.toString();
    }
}