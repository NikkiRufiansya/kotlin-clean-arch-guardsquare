package o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.util.AttributeSet;
import java.util.ArrayList;
import o.setAccessibilityLiveRegion;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda0 extends setAccessibilityLiveRegion.setIconTintList {
    final Matrix MenuHostHelper$$ExternalSyntheticLambda0;
    int MenuHostHelper$$ExternalSyntheticLambda1;
    private float ViewPager$SavedState$1;
    private float setIconSize;
    final Matrix setIconTintList;
    private float setLayoutAnimation;
    private String setNavigationOnClickListener;
    private float setOnLongClickListener;
    private int[] setTextAlignment;
    private float setUiOptions;
    private float setUnboundedRipple;
    final ArrayList<setAccessibilityLiveRegion.setIconTintList> setX;
    float setY;

    public setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda0(setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda0 setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0, setFabAnchorMode<String, Object> setfabanchormode) {
        super();
        setAccessibilityLiveRegion.setY setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda1;
        this.setIconTintList = new Matrix();
        this.setX = new ArrayList<>();
        this.setY = 0.0f;
        this.setUiOptions = 0.0f;
        this.setUnboundedRipple = 0.0f;
        this.setLayoutAnimation = 1.0f;
        this.setOnLongClickListener = 1.0f;
        this.ViewPager$SavedState$1 = 0.0f;
        this.setIconSize = 0.0f;
        Matrix matrix = new Matrix();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = matrix;
        this.setNavigationOnClickListener = null;
        this.setY = setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0.setY;
        this.setUiOptions = setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0.setUiOptions;
        this.setUnboundedRipple = setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0.setUnboundedRipple;
        this.setLayoutAnimation = setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0.setLayoutAnimation;
        this.setOnLongClickListener = setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0.setOnLongClickListener;
        this.ViewPager$SavedState$1 = setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0.ViewPager$SavedState$1;
        this.setIconSize = setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0.setIconSize;
        this.setTextAlignment = setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0.setTextAlignment;
        String str = setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0.setNavigationOnClickListener;
        this.setNavigationOnClickListener = str;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1;
        if (str != null) {
            setfabanchormode.put(str, this);
        }
        matrix.set(setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0);
        ArrayList<setAccessibilityLiveRegion.setIconTintList> arrayList = setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0.setX;
        for (int i = 0; i < arrayList.size(); i++) {
            setAccessibilityLiveRegion.setIconTintList seticontintlist = arrayList.get(i);
            if (seticontintlist instanceof setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda0) {
                this.setX.add(new setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda0((setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda0) seticontintlist, setfabanchormode));
            } else {
                if (seticontintlist instanceof setAccessibilityLiveRegion.setX) {
                    setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda1 = new setAccessibilityLiveRegion.setX((setAccessibilityLiveRegion.setX) seticontintlist);
                } else if (seticontintlist instanceof setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda1) {
                    setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda1 = new setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda1((setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda1) seticontintlist);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.setX.add(setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda1);
                if (setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda1.setIconSize != null) {
                    setfabanchormode.put(setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda1.setIconSize, setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda1);
                }
            }
        }
    }

    public setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda0() {
        super();
        this.setIconTintList = new Matrix();
        this.setX = new ArrayList<>();
        this.setY = 0.0f;
        this.setUiOptions = 0.0f;
        this.setUnboundedRipple = 0.0f;
        this.setLayoutAnimation = 1.0f;
        this.setOnLongClickListener = 1.0f;
        this.ViewPager$SavedState$1 = 0.0f;
        this.setIconSize = 0.0f;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new Matrix();
        this.setNavigationOnClickListener = null;
    }

    public String getGroupName() {
        return this.setNavigationOnClickListener;
    }

    public Matrix getLocalMatrix() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes;
        int[] iArr = setClipToPadding.setLayoutAnimation;
        if (theme == null) {
            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
        } else {
            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        setX(obtainStyledAttributes, xmlPullParser);
        obtainStyledAttributes.recycle();
    }

    private void setX(TypedArray typedArray, XmlPullParser xmlPullParser) {
        this.setTextAlignment = null;
        this.setY = setHandwritingBoundsOffsets.setIconTintList(typedArray, xmlPullParser, "rotation", 5, this.setY);
        this.setUiOptions = typedArray.getFloat(1, this.setUiOptions);
        this.setUnboundedRipple = typedArray.getFloat(2, this.setUnboundedRipple);
        this.setLayoutAnimation = setHandwritingBoundsOffsets.setIconTintList(typedArray, xmlPullParser, "scaleX", 3, this.setLayoutAnimation);
        this.setOnLongClickListener = setHandwritingBoundsOffsets.setIconTintList(typedArray, xmlPullParser, "scaleY", 4, this.setOnLongClickListener);
        this.ViewPager$SavedState$1 = setHandwritingBoundsOffsets.setIconTintList(typedArray, xmlPullParser, "translateX", 6, this.ViewPager$SavedState$1);
        this.setIconSize = setHandwritingBoundsOffsets.setIconTintList(typedArray, xmlPullParser, "translateY", 7, this.setIconSize);
        String string = typedArray.getString(0);
        if (string != null) {
            this.setNavigationOnClickListener = string;
        }
        MenuHostHelper$$ExternalSyntheticLambda1();
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1() {
        this.MenuHostHelper$$ExternalSyntheticLambda0.reset();
        this.MenuHostHelper$$ExternalSyntheticLambda0.postTranslate(-this.setUiOptions, -this.setUnboundedRipple);
        this.MenuHostHelper$$ExternalSyntheticLambda0.postScale(this.setLayoutAnimation, this.setOnLongClickListener);
        this.MenuHostHelper$$ExternalSyntheticLambda0.postRotate(this.setY, 0.0f, 0.0f);
        this.MenuHostHelper$$ExternalSyntheticLambda0.postTranslate(this.ViewPager$SavedState$1 + this.setUiOptions, this.setIconSize + this.setUnboundedRipple);
    }

    public float getRotation() {
        return this.setY;
    }

    public void setRotation(float f) {
        if (f != this.setY) {
            this.setY = f;
            MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    public float getPivotX() {
        return this.setUiOptions;
    }

    public void setPivotX(float f) {
        if (f != this.setUiOptions) {
            this.setUiOptions = f;
            MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    public float getPivotY() {
        return this.setUnboundedRipple;
    }

    public void setPivotY(float f) {
        if (f != this.setUnboundedRipple) {
            this.setUnboundedRipple = f;
            MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    public float getScaleX() {
        return this.setLayoutAnimation;
    }

    public void setScaleX(float f) {
        if (f != this.setLayoutAnimation) {
            this.setLayoutAnimation = f;
            MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    public float getScaleY() {
        return this.setOnLongClickListener;
    }

    public void setScaleY(float f) {
        if (f != this.setOnLongClickListener) {
            this.setOnLongClickListener = f;
            MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    public float getTranslateX() {
        return this.ViewPager$SavedState$1;
    }

    public void setTranslateX(float f) {
        if (f != this.ViewPager$SavedState$1) {
            this.ViewPager$SavedState$1 = f;
            MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    public float getTranslateY() {
        return this.setIconSize;
    }

    public void setTranslateY(float f) {
        if (f != this.setIconSize) {
            this.setIconSize = f;
            MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    @Override // o.setAccessibilityLiveRegion.setIconTintList
    public boolean setX() {
        for (int i = 0; i < this.setX.size(); i++) {
            if (this.setX.get(i).setX()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.setAccessibilityLiveRegion.setIconTintList
    public boolean setY(int[] iArr) {
        boolean z = false;
        for (int i = 0; i < this.setX.size(); i++) {
            z |= this.setX.get(i).setY(iArr);
        }
        return z;
    }
}