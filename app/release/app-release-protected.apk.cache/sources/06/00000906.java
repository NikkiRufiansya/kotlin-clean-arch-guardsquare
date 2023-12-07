package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import o.setEnsureMinTouchTargetSize;
import o.setIconifiedByDefault;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class setAccessibilityLiveRegion extends setPaintFlags {
    static final PorterDuff.Mode MenuHostHelper$$ExternalSyntheticLambda0 = PorterDuff.Mode.SRC_IN;
    private ColorFilter MenuHostHelper$$ExternalSyntheticLambda1;
    private setUiOptions setChipCornerRadius;
    private Drawable.ConstantState setIconTintList;
    private final Matrix setLayoutAnimation;
    private final Rect setNavigationOnClickListener;
    private final float[] setOnLongClickListener;
    private boolean setUiOptions;
    private PorterDuffColorFilter setUnboundedRipple;
    private boolean setY;

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    setAccessibilityLiveRegion() {
        this.setY = true;
        this.setOnLongClickListener = new float[9];
        this.setLayoutAnimation = new Matrix();
        this.setNavigationOnClickListener = new Rect();
        this.setChipCornerRadius = new setUiOptions();
    }

    setAccessibilityLiveRegion(setUiOptions setuioptions) {
        this.setY = true;
        this.setOnLongClickListener = new float[9];
        this.setLayoutAnimation = new Matrix();
        this.setNavigationOnClickListener = new Rect();
        this.setChipCornerRadius = setuioptions;
        this.setUnboundedRipple = setY(this.setUnboundedRipple, setuioptions.setUiOptions, setuioptions.ViewPager$SavedState$1);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (this.setX != null) {
            this.setX.mutate();
            return this;
        }
        if (!this.setUiOptions && super.mutate() == this) {
            this.setChipCornerRadius = new setUiOptions(this.setChipCornerRadius);
            this.setUiOptions = true;
        }
        return this;
    }

    public Object MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        return this.setChipCornerRadius.setIconSize.setLayoutAnimation.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.setX != null && Build.VERSION.SDK_INT >= 24) {
            return new setLayoutAnimation(this.setX.getConstantState());
        }
        this.setChipCornerRadius.setLayoutAnimation = getChangingConfigurations();
        return this.setChipCornerRadius;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.setX != null) {
            this.setX.draw(canvas);
            return;
        }
        copyBounds(this.setNavigationOnClickListener);
        if (this.setNavigationOnClickListener.width() <= 0 || this.setNavigationOnClickListener.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (colorFilter == null) {
            colorFilter = this.setUnboundedRipple;
        }
        canvas.getMatrix(this.setLayoutAnimation);
        this.setLayoutAnimation.getValues(this.setOnLongClickListener);
        float abs = Math.abs(this.setOnLongClickListener[0]);
        float abs2 = Math.abs(this.setOnLongClickListener[4]);
        float abs3 = Math.abs(this.setOnLongClickListener[1]);
        float abs4 = Math.abs(this.setOnLongClickListener[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.setNavigationOnClickListener.width() * abs));
        int min2 = Math.min(2048, (int) (this.setNavigationOnClickListener.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.setNavigationOnClickListener.left, this.setNavigationOnClickListener.top);
        if (setY()) {
            canvas.translate(this.setNavigationOnClickListener.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.setNavigationOnClickListener.offsetTo(0, 0);
        this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda0(min, min2);
        if (!this.setY) {
            this.setChipCornerRadius.setY(min, min2);
        } else if (!this.setChipCornerRadius.setX()) {
            this.setChipCornerRadius.setY(min, min2);
            this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1();
        }
        this.setChipCornerRadius.setX(canvas, colorFilter, this.setNavigationOnClickListener);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        if (this.setX != null) {
            return setEnsureMinTouchTargetSize.setX(this.setX);
        }
        return this.setChipCornerRadius.setIconSize.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.setX != null) {
            this.setX.setAlpha(i);
        } else if (this.setChipCornerRadius.setIconSize.getRootAlpha() != i) {
            this.setChipCornerRadius.setIconSize.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.setX != null) {
            this.setX.setColorFilter(colorFilter);
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        if (this.setX != null) {
            return setEnsureMinTouchTargetSize.setY(this.setX);
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    PorterDuffColorFilter setY(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        if (this.setX != null) {
            setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(this.setX, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.setX != null) {
            setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(this.setX, colorStateList);
            return;
        }
        setUiOptions setuioptions = this.setChipCornerRadius;
        if (setuioptions.setUiOptions != colorStateList) {
            setuioptions.setUiOptions = colorStateList;
            this.setUnboundedRipple = setY(this.setUnboundedRipple, colorStateList, setuioptions.ViewPager$SavedState$1);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.setX != null) {
            setEnsureMinTouchTargetSize.setX(this.setX, mode);
            return;
        }
        setUiOptions setuioptions = this.setChipCornerRadius;
        if (setuioptions.ViewPager$SavedState$1 != mode) {
            setuioptions.ViewPager$SavedState$1 = mode;
            this.setUnboundedRipple = setY(this.setUnboundedRipple, setuioptions.setUiOptions, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        setUiOptions setuioptions;
        if (this.setX != null) {
            return this.setX.isStateful();
        }
        return super.isStateful() || ((setuioptions = this.setChipCornerRadius) != null && (setuioptions.setY() || (this.setChipCornerRadius.setUiOptions != null && this.setChipCornerRadius.setUiOptions.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z;
        if (this.setX != null) {
            return this.setX.setState(iArr);
        }
        setUiOptions setuioptions = this.setChipCornerRadius;
        if (setuioptions.setUiOptions == null || setuioptions.ViewPager$SavedState$1 == null) {
            z = false;
        } else {
            this.setUnboundedRipple = setY(this.setUnboundedRipple, setuioptions.setUiOptions, setuioptions.ViewPager$SavedState$1);
            invalidateSelf();
            z = true;
        }
        if (setuioptions.setY() && setuioptions.setIconTintList(iArr)) {
            invalidateSelf();
            return true;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.setX != null) {
            return this.setX.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.setX != null) {
            return this.setX.getIntrinsicWidth();
        }
        return (int) this.setChipCornerRadius.setIconSize.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.setX != null) {
            return this.setX.getIntrinsicHeight();
        }
        return (int) this.setChipCornerRadius.setIconSize.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.setX != null) {
            setEnsureMinTouchTargetSize.setIconTintList.setX(this.setX);
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        if (this.setX != null) {
            return setEnsureMinTouchTargetSize.setUnboundedRipple(this.setX);
        }
        return this.setChipCornerRadius.setX;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.setX != null) {
            this.setX.setAutoMirrored(z);
        } else {
            this.setChipCornerRadius.setX = z;
        }
    }

    public static setAccessibilityLiveRegion setX(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            setAccessibilityLiveRegion setaccessibilityliveregion = new setAccessibilityLiveRegion();
            setaccessibilityliveregion.setX = setTextStartPaddingResource.setY(resources, i, theme);
            setaccessibilityliveregion.setIconTintList = new setLayoutAnimation(setaccessibilityliveregion.setX.getConstantState());
            return setaccessibilityliveregion;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return MenuHostHelper$$ExternalSyntheticLambda0(resources, xml, asAttributeSet, theme);
        } catch (IOException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    public static setAccessibilityLiveRegion MenuHostHelper$$ExternalSyntheticLambda0(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        setAccessibilityLiveRegion setaccessibilityliveregion = new setAccessibilityLiveRegion();
        setaccessibilityliveregion.inflate(resources, xmlPullParser, attributeSet, theme);
        return setaccessibilityliveregion;
    }

    static int MenuHostHelper$$ExternalSyntheticLambda1(int i, float f) {
        return (((int) (Color.alpha(i) * f)) << 24) | (16777215 & i);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.setX != null) {
            this.setX.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        if (this.setX != null) {
            setEnsureMinTouchTargetSize.setIconTintList.setX(this.setX, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        setUiOptions setuioptions = this.setChipCornerRadius;
        setuioptions.setIconSize = new setUnboundedRipple();
        int[] iArr = setClipToPadding.setIconSize;
        if (theme == null) {
            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
        } else {
            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        setIconTintList(obtainStyledAttributes, xmlPullParser, theme);
        obtainStyledAttributes.recycle();
        setuioptions.setLayoutAnimation = getChangingConfigurations();
        setuioptions.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        setX(resources, xmlPullParser, attributeSet, theme);
        this.setUnboundedRipple = setY(this.setUnboundedRipple, setuioptions.setUiOptions, setuioptions.ViewPager$SavedState$1);
    }

    private static PorterDuff.Mode setIconTintList(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i == 9) {
                    return PorterDuff.Mode.SRC_ATOP;
                }
                switch (i) {
                    case 14:
                        return PorterDuff.Mode.MULTIPLY;
                    case 15:
                        return PorterDuff.Mode.SCREEN;
                    case 16:
                        return PorterDuff.Mode.ADD;
                    default:
                        return mode;
                }
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    private void setIconTintList(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        ColorStateList colorStateList;
        setUiOptions setuioptions = this.setChipCornerRadius;
        setUnboundedRipple setunboundedripple = setuioptions.setIconSize;
        setuioptions.ViewPager$SavedState$1 = setIconTintList(setHandwritingBoundsOffsets.setX(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(1, typedValue);
            if (typedValue.type == 2) {
                StringBuilder sb = new StringBuilder("Failed to resolve attribute at index ");
                sb.append(1);
                sb.append(": ");
                sb.append(typedValue);
                throw new UnsupportedOperationException(sb.toString());
            } else if (typedValue.type < 28 || typedValue.type > 31) {
                colorStateList = setCustomView.setX(typedArray.getResources(), typedArray.getResourceId(1, 0), theme);
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            setuioptions.setUiOptions = colorStateList;
        }
        setuioptions.setX = setHandwritingBoundsOffsets.setY(typedArray, xmlPullParser, "autoMirrored", 5, setuioptions.setX);
        setunboundedripple.setIconSize = setHandwritingBoundsOffsets.setIconTintList(typedArray, xmlPullParser, "viewportWidth", 7, setunboundedripple.setIconSize);
        setunboundedripple.setOnLongClickListener = setHandwritingBoundsOffsets.setIconTintList(typedArray, xmlPullParser, "viewportHeight", 8, setunboundedripple.setOnLongClickListener);
        if (setunboundedripple.setIconSize <= 0.0f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(typedArray.getPositionDescription());
            sb2.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb2.toString());
        } else if (setunboundedripple.setOnLongClickListener <= 0.0f) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(typedArray.getPositionDescription());
            sb3.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb3.toString());
        } else {
            setunboundedripple.MenuHostHelper$$ExternalSyntheticLambda1 = typedArray.getDimension(3, setunboundedripple.MenuHostHelper$$ExternalSyntheticLambda1);
            setunboundedripple.MenuHostHelper$$ExternalSyntheticLambda0 = typedArray.getDimension(2, setunboundedripple.MenuHostHelper$$ExternalSyntheticLambda0);
            if (setunboundedripple.MenuHostHelper$$ExternalSyntheticLambda1 <= 0.0f) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(typedArray.getPositionDescription());
                sb4.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(sb4.toString());
            } else if (setunboundedripple.MenuHostHelper$$ExternalSyntheticLambda0 <= 0.0f) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(typedArray.getPositionDescription());
                sb5.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(sb5.toString());
            } else {
                setunboundedripple.setAlpha(setHandwritingBoundsOffsets.setIconTintList(typedArray, xmlPullParser, "alpha", 4, setunboundedripple.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    setunboundedripple.setUnboundedRipple = string;
                    setunboundedripple.setLayoutAnimation.put(string, setunboundedripple);
                }
            }
        }
    }

    private void setX(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        setUiOptions setuioptions = this.setChipCornerRadius;
        setUnboundedRipple setunboundedripple = setuioptions.setIconSize;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(setunboundedripple.setUiOptions);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth();
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth + 1 || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda0 setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0 = (setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda0) arrayDeque.peek();
                if ("path".equals(name)) {
                    setX setx = new setX();
                    setx.setX(resources, attributeSet, theme, xmlPullParser);
                    setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0.setX.add(setx);
                    if (setx.getPathName() != null) {
                        setunboundedripple.setLayoutAnimation.put(setx.getPathName(), setx);
                    }
                    setuioptions.setLayoutAnimation = setx.ViewPager$SavedState$1 | setuioptions.setLayoutAnimation;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda1 setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda1 = new setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda1();
                    setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda1.setX(resources, attributeSet, theme, xmlPullParser);
                    setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0.setX.add(setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda1);
                    if (setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda1.getPathName() != null) {
                        setunboundedripple.setLayoutAnimation.put(setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda1.getPathName(), setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda1);
                    }
                    setuioptions.setLayoutAnimation = setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda1.ViewPager$SavedState$1 | setuioptions.setLayoutAnimation;
                } else if ("group".equals(name)) {
                    setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda0 setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda02 = new setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda0();
                    setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda02.MenuHostHelper$$ExternalSyntheticLambda0(resources, attributeSet, theme, xmlPullParser);
                    setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0.setX.add(setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda02);
                    arrayDeque.push(setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda02);
                    if (setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda02.getGroupName() != null) {
                        setunboundedripple.setLayoutAnimation.put(setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda02.getGroupName(), setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda02);
                    }
                    setuioptions.setLayoutAnimation = setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda02.MenuHostHelper$$ExternalSyntheticLambda1 | setuioptions.setLayoutAnimation;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    public void setX(boolean z) {
        this.setY = z;
    }

    private boolean setY() {
        return isAutoMirrored() && setEnsureMinTouchTargetSize.setIconTintList(this) == 1;
    }

    @Override // o.setPaintFlags, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.setX != null) {
            this.setX.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        if (this.setX != null) {
            return this.setX.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.setChipCornerRadius.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.setX != null) {
            this.setX.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        if (this.setX != null) {
            this.setX.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.setX != null) {
            return this.setX.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        if (this.setX != null) {
            this.setX.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setLayoutAnimation extends Drawable.ConstantState {
        private final Drawable.ConstantState setY;

        public setLayoutAnimation(Drawable.ConstantState constantState) {
            this.setY = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            setAccessibilityLiveRegion setaccessibilityliveregion = new setAccessibilityLiveRegion();
            setaccessibilityliveregion.setX = (VectorDrawable) this.setY.newDrawable();
            return setaccessibilityliveregion;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            setAccessibilityLiveRegion setaccessibilityliveregion = new setAccessibilityLiveRegion();
            setaccessibilityliveregion.setX = (VectorDrawable) this.setY.newDrawable(resources);
            return setaccessibilityliveregion;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            setAccessibilityLiveRegion setaccessibilityliveregion = new setAccessibilityLiveRegion();
            setaccessibilityliveregion.setX = (VectorDrawable) this.setY.newDrawable(resources, theme);
            return setaccessibilityliveregion;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.setY.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.setY.getChangingConfigurations();
        }
    }

    /* loaded from: classes.dex */
    public static class setUiOptions extends Drawable.ConstantState {
        boolean MenuHostHelper$$ExternalSyntheticLambda0;
        Bitmap MenuHostHelper$$ExternalSyntheticLambda1;
        PorterDuff.Mode ViewPager$SavedState$1;
        setUnboundedRipple setIconSize;
        int setIconTintList;
        int setLayoutAnimation;
        PorterDuff.Mode setNavigationOnClickListener;
        ColorStateList setOnLongClickListener;
        ColorStateList setUiOptions;
        Paint setUnboundedRipple;
        boolean setX;
        boolean setY;

        public setUiOptions(setUiOptions setuioptions) {
            this.setUiOptions = null;
            this.ViewPager$SavedState$1 = setAccessibilityLiveRegion.MenuHostHelper$$ExternalSyntheticLambda0;
            if (setuioptions != null) {
                this.setLayoutAnimation = setuioptions.setLayoutAnimation;
                this.setIconSize = new setUnboundedRipple(setuioptions.setIconSize);
                if (setuioptions.setIconSize.setIconTintList != null) {
                    this.setIconSize.setIconTintList = new Paint(setuioptions.setIconSize.setIconTintList);
                }
                if (setuioptions.setIconSize.setNavigationOnClickListener != null) {
                    this.setIconSize.setNavigationOnClickListener = new Paint(setuioptions.setIconSize.setNavigationOnClickListener);
                }
                this.setUiOptions = setuioptions.setUiOptions;
                this.ViewPager$SavedState$1 = setuioptions.ViewPager$SavedState$1;
                this.setX = setuioptions.setX;
            }
        }

        public void setX(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.MenuHostHelper$$ExternalSyntheticLambda1, (Rect) null, rect, setX(colorFilter));
        }

        public boolean setIconTintList() {
            return this.setIconSize.getRootAlpha() < 255;
        }

        public Paint setX(ColorFilter colorFilter) {
            if (setIconTintList() || colorFilter != null) {
                if (this.setUnboundedRipple == null) {
                    Paint paint = new Paint();
                    this.setUnboundedRipple = paint;
                    paint.setFilterBitmap(true);
                }
                this.setUnboundedRipple.setAlpha(this.setIconSize.getRootAlpha());
                this.setUnboundedRipple.setColorFilter(colorFilter);
                return this.setUnboundedRipple;
            }
            return null;
        }

        public void setY(int i, int i2) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.eraseColor(0);
            this.setIconSize.setX(new Canvas(this.MenuHostHelper$$ExternalSyntheticLambda1), i, i2, null);
        }

        public void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null || !setIconTintList(i, i2)) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
            }
        }

        public boolean setIconTintList(int i, int i2) {
            return i == this.MenuHostHelper$$ExternalSyntheticLambda1.getWidth() && i2 == this.MenuHostHelper$$ExternalSyntheticLambda1.getHeight();
        }

        public boolean setX() {
            return !this.MenuHostHelper$$ExternalSyntheticLambda0 && this.setOnLongClickListener == this.setUiOptions && this.setNavigationOnClickListener == this.ViewPager$SavedState$1 && this.setY == this.setX && this.setIconTintList == this.setIconSize.getRootAlpha();
        }

        public void MenuHostHelper$$ExternalSyntheticLambda1() {
            this.setOnLongClickListener = this.setUiOptions;
            this.setNavigationOnClickListener = this.ViewPager$SavedState$1;
            this.setIconTintList = this.setIconSize.getRootAlpha();
            this.setY = this.setX;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        }

        public setUiOptions() {
            this.setUiOptions = null;
            this.ViewPager$SavedState$1 = setAccessibilityLiveRegion.MenuHostHelper$$ExternalSyntheticLambda0;
            this.setIconSize = new setUnboundedRipple();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new setAccessibilityLiveRegion(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new setAccessibilityLiveRegion(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.setLayoutAnimation;
        }

        public boolean setY() {
            return this.setIconSize.setY();
        }

        public boolean setIconTintList(int[] iArr) {
            boolean y = this.setIconSize.setY(iArr);
            this.MenuHostHelper$$ExternalSyntheticLambda0 |= y;
            return y;
        }
    }

    /* loaded from: classes.dex */
    public static class setUnboundedRipple {
        private static final Matrix setTextAlignment = new Matrix();
        float MenuHostHelper$$ExternalSyntheticLambda0;
        float MenuHostHelper$$ExternalSyntheticLambda1;
        private int ViewPager$SavedState$1;
        private final Path setAnimationFromJson;
        private final Path setCenterIfNoTextEnabled;
        private final Matrix setChipCornerRadius;
        float setIconSize;
        Paint setIconTintList;
        final setFabAnchorMode<String, Object> setLayoutAnimation;
        Paint setNavigationOnClickListener;
        float setOnLongClickListener;
        final setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda0 setUiOptions;
        String setUnboundedRipple;
        Boolean setX;
        int setY;
        private PathMeasure setZ;

        private static float setY(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public setUnboundedRipple() {
            this.setChipCornerRadius = new Matrix();
            this.MenuHostHelper$$ExternalSyntheticLambda1 = 0.0f;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = 0.0f;
            this.setIconSize = 0.0f;
            this.setOnLongClickListener = 0.0f;
            this.setY = 255;
            this.setUnboundedRipple = null;
            this.setX = null;
            this.setLayoutAnimation = new setFabAnchorMode<>();
            this.setUiOptions = new setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda0();
            this.setCenterIfNoTextEnabled = new Path();
            this.setAnimationFromJson = new Path();
        }

        public void setRootAlpha(int i) {
            this.setY = i;
        }

        public int getRootAlpha() {
            return this.setY;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public setUnboundedRipple(setUnboundedRipple setunboundedripple) {
            this.setChipCornerRadius = new Matrix();
            this.MenuHostHelper$$ExternalSyntheticLambda1 = 0.0f;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = 0.0f;
            this.setIconSize = 0.0f;
            this.setOnLongClickListener = 0.0f;
            this.setY = 255;
            this.setUnboundedRipple = null;
            this.setX = null;
            setFabAnchorMode<String, Object> setfabanchormode = new setFabAnchorMode<>();
            this.setLayoutAnimation = setfabanchormode;
            this.setUiOptions = new setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda0(setunboundedripple.setUiOptions, setfabanchormode);
            this.setCenterIfNoTextEnabled = new Path(setunboundedripple.setCenterIfNoTextEnabled);
            this.setAnimationFromJson = new Path(setunboundedripple.setAnimationFromJson);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = setunboundedripple.MenuHostHelper$$ExternalSyntheticLambda1;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setunboundedripple.MenuHostHelper$$ExternalSyntheticLambda0;
            this.setIconSize = setunboundedripple.setIconSize;
            this.setOnLongClickListener = setunboundedripple.setOnLongClickListener;
            this.ViewPager$SavedState$1 = setunboundedripple.ViewPager$SavedState$1;
            this.setY = setunboundedripple.setY;
            this.setUnboundedRipple = setunboundedripple.setUnboundedRipple;
            String str = setunboundedripple.setUnboundedRipple;
            if (str != null) {
                setfabanchormode.put(str, this);
            }
            this.setX = setunboundedripple.setX;
        }

        private void setX(setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda0 setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0.setIconTintList.set(matrix);
            setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0.setIconTintList.preConcat(setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0);
            canvas.save();
            for (int i3 = 0; i3 < setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0.setX.size(); i3++) {
                setIconTintList seticontintlist = setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0.setX.get(i3);
                if (seticontintlist instanceof setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda0) {
                    setX((setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda0) seticontintlist, setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0.setIconTintList, canvas, i, i2, colorFilter);
                } else if (seticontintlist instanceof setY) {
                    MenuHostHelper$$ExternalSyntheticLambda0(setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0, (setY) seticontintlist, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        public void setX(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            setX(this.setUiOptions, setTextAlignment, canvas, i, i2, colorFilter);
        }

        private void MenuHostHelper$$ExternalSyntheticLambda0(setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda0 setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0, setY sety, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f;
            float f2 = i / this.setIconSize;
            float f3 = i2 / this.setOnLongClickListener;
            float min = Math.min(f2, f3);
            Matrix matrix = setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda0.setIconTintList;
            this.setChipCornerRadius.set(matrix);
            this.setChipCornerRadius.postScale(f2, f3);
            float y = setY(matrix);
            if (y == 0.0f) {
                return;
            }
            sety.setY(this.setCenterIfNoTextEnabled);
            Path path = this.setCenterIfNoTextEnabled;
            this.setAnimationFromJson.reset();
            if (sety.setIconTintList()) {
                this.setAnimationFromJson.setFillType(sety.setCenterIfNoTextEnabled == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.setAnimationFromJson.addPath(path, this.setChipCornerRadius);
                canvas.clipPath(this.setAnimationFromJson);
                return;
            }
            setX setx = (setX) sety;
            if (setx.setTextAlignment != 0.0f || setx.setLayoutAnimation != 1.0f) {
                float f4 = setx.setTextAlignment;
                float f5 = setx.setUiOptions;
                float f6 = setx.setLayoutAnimation;
                float f7 = setx.setUiOptions;
                if (this.setZ == null) {
                    this.setZ = new PathMeasure();
                }
                this.setZ.setPath(this.setCenterIfNoTextEnabled, false);
                float length = this.setZ.getLength();
                float f8 = ((f4 + f5) % 1.0f) * length;
                float f9 = ((f6 + f7) % 1.0f) * length;
                path.reset();
                if (f8 > f9) {
                    this.setZ.getSegment(f8, length, path, true);
                    f = 0.0f;
                    this.setZ.getSegment(0.0f, f9, path, true);
                } else {
                    f = 0.0f;
                    this.setZ.getSegment(f8, f9, path, true);
                }
                path.rLineTo(f, f);
            }
            this.setAnimationFromJson.addPath(path, this.setChipCornerRadius);
            if (setx.setX.MenuHostHelper$$ExternalSyntheticLambda1()) {
                setImageMatrix setimagematrix = setx.setX;
                if (this.setIconTintList == null) {
                    Paint paint = new Paint(1);
                    this.setIconTintList = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.setIconTintList;
                if (setimagematrix.setY()) {
                    Shader MenuHostHelper$$ExternalSyntheticLambda0 = setimagematrix.MenuHostHelper$$ExternalSyntheticLambda0();
                    MenuHostHelper$$ExternalSyntheticLambda0.setLocalMatrix(this.setChipCornerRadius);
                    paint2.setShader(MenuHostHelper$$ExternalSyntheticLambda0);
                    paint2.setAlpha(Math.round(setx.setY * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(setAccessibilityLiveRegion.MenuHostHelper$$ExternalSyntheticLambda1(setimagematrix.setIconTintList(), setx.setY));
                }
                paint2.setColorFilter(colorFilter);
                this.setAnimationFromJson.setFillType(setx.setCenterIfNoTextEnabled == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.setAnimationFromJson, paint2);
            }
            if (setx.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1()) {
                setImageMatrix setimagematrix2 = setx.MenuHostHelper$$ExternalSyntheticLambda0;
                if (this.setNavigationOnClickListener == null) {
                    Paint paint3 = new Paint(1);
                    this.setNavigationOnClickListener = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.setNavigationOnClickListener;
                if (setx.setUnboundedRipple != null) {
                    paint4.setStrokeJoin(setx.setUnboundedRipple);
                }
                if (setx.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                    paint4.setStrokeCap(setx.MenuHostHelper$$ExternalSyntheticLambda1);
                }
                paint4.setStrokeMiter(setx.setNavigationOnClickListener);
                if (setimagematrix2.setY()) {
                    Shader MenuHostHelper$$ExternalSyntheticLambda02 = setimagematrix2.MenuHostHelper$$ExternalSyntheticLambda0();
                    MenuHostHelper$$ExternalSyntheticLambda02.setLocalMatrix(this.setChipCornerRadius);
                    paint4.setShader(MenuHostHelper$$ExternalSyntheticLambda02);
                    paint4.setAlpha(Math.round(setx.setIconTintList * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(setAccessibilityLiveRegion.MenuHostHelper$$ExternalSyntheticLambda1(setimagematrix2.setIconTintList(), setx.setIconTintList));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(setx.setOnLongClickListener * min * y);
                canvas.drawPath(this.setAnimationFromJson, paint4);
            }
        }

        private float setY(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float y = setY(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(y) / max;
            }
            return 0.0f;
        }

        public boolean setY() {
            if (this.setX == null) {
                this.setX = Boolean.valueOf(this.setUiOptions.setX());
            }
            return this.setX.booleanValue();
        }

        public boolean setY(int[] iArr) {
            return this.setUiOptions.setY(iArr);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class setIconTintList {
        public boolean setX() {
            return false;
        }

        public boolean setY(int[] iArr) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public setIconTintList() {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class setY extends setIconTintList {
        int ViewPager$SavedState$1;
        int setCenterIfNoTextEnabled;
        protected setIconifiedByDefault.setIconTintList[] setChipCornerRadius;
        String setIconSize;

        public boolean setIconTintList() {
            return false;
        }

        public setY() {
            super();
            this.setChipCornerRadius = null;
            this.setCenterIfNoTextEnabled = 0;
        }

        public setY(setY sety) {
            super();
            this.setChipCornerRadius = null;
            this.setCenterIfNoTextEnabled = 0;
            this.setIconSize = sety.setIconSize;
            this.ViewPager$SavedState$1 = sety.ViewPager$SavedState$1;
            this.setChipCornerRadius = setIconifiedByDefault.setIconTintList(sety.setChipCornerRadius);
        }

        public void setY(Path path) {
            path.reset();
            setIconifiedByDefault.setIconTintList[] seticontintlistArr = this.setChipCornerRadius;
            if (seticontintlistArr != null) {
                setIconifiedByDefault.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(seticontintlistArr, path);
            }
        }

        public String getPathName() {
            return this.setIconSize;
        }

        public setIconifiedByDefault.setIconTintList[] getPathData() {
            return this.setChipCornerRadius;
        }

        public void setPathData(setIconifiedByDefault.setIconTintList[] seticontintlistArr) {
            if (!setIconifiedByDefault.setIconTintList(this.setChipCornerRadius, seticontintlistArr)) {
                this.setChipCornerRadius = setIconifiedByDefault.setIconTintList(seticontintlistArr);
                return;
            }
            setIconifiedByDefault.setIconTintList[] seticontintlistArr2 = this.setChipCornerRadius;
            for (int i = 0; i < seticontintlistArr.length; i++) {
                seticontintlistArr2[i].setX = seticontintlistArr[i].setX;
                for (int i2 = 0; i2 < seticontintlistArr[i].MenuHostHelper$$ExternalSyntheticLambda1.length; i2++) {
                    seticontintlistArr2[i].MenuHostHelper$$ExternalSyntheticLambda1[i2] = seticontintlistArr[i].MenuHostHelper$$ExternalSyntheticLambda1[i2];
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class setX extends setY {
        setImageMatrix MenuHostHelper$$ExternalSyntheticLambda0;
        Paint.Cap MenuHostHelper$$ExternalSyntheticLambda1;
        float setIconTintList;
        float setLayoutAnimation;
        private int[] setMaxEms;
        float setNavigationOnClickListener;
        float setOnLongClickListener;
        float setTextAlignment;
        float setUiOptions;
        Paint.Join setUnboundedRipple;
        setImageMatrix setX;
        float setY;

        setX() {
            this.setOnLongClickListener = 0.0f;
            this.setIconTintList = 1.0f;
            this.setY = 1.0f;
            this.setTextAlignment = 0.0f;
            this.setLayoutAnimation = 1.0f;
            this.setUiOptions = 0.0f;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = Paint.Cap.BUTT;
            this.setUnboundedRipple = Paint.Join.MITER;
            this.setNavigationOnClickListener = 4.0f;
        }

        public setX(setX setx) {
            super(setx);
            this.setOnLongClickListener = 0.0f;
            this.setIconTintList = 1.0f;
            this.setY = 1.0f;
            this.setTextAlignment = 0.0f;
            this.setLayoutAnimation = 1.0f;
            this.setUiOptions = 0.0f;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = Paint.Cap.BUTT;
            this.setUnboundedRipple = Paint.Join.MITER;
            this.setNavigationOnClickListener = 4.0f;
            this.setMaxEms = setx.setMaxEms;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setx.MenuHostHelper$$ExternalSyntheticLambda0;
            this.setOnLongClickListener = setx.setOnLongClickListener;
            this.setIconTintList = setx.setIconTintList;
            this.setX = setx.setX;
            this.setCenterIfNoTextEnabled = setx.setCenterIfNoTextEnabled;
            this.setY = setx.setY;
            this.setTextAlignment = setx.setTextAlignment;
            this.setLayoutAnimation = setx.setLayoutAnimation;
            this.setUiOptions = setx.setUiOptions;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = setx.MenuHostHelper$$ExternalSyntheticLambda1;
            this.setUnboundedRipple = setx.setUnboundedRipple;
            this.setNavigationOnClickListener = setx.setNavigationOnClickListener;
        }

        private Paint.Cap setX(int i, Paint.Cap cap) {
            if (i != 0) {
                if (i != 1) {
                    return i != 2 ? cap : Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }

        private Paint.Join setX(int i, Paint.Join join) {
            if (i != 0) {
                if (i != 1) {
                    return i != 2 ? join : Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }

        public void setX(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes;
            int[] iArr = setClipToPadding.setNavigationOnClickListener;
            if (theme == null) {
                obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
            } else {
                obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            }
            setX(obtainStyledAttributes, xmlPullParser, theme);
            obtainStyledAttributes.recycle();
        }

        private void setX(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.setMaxEms = null;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.setIconSize = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.setChipCornerRadius = setIconifiedByDefault.setIconTintList(string2);
                }
                this.setX = setHandwritingBoundsOffsets.setY(typedArray, xmlPullParser, theme, "fillColor", 1);
                this.setY = setHandwritingBoundsOffsets.setIconTintList(typedArray, xmlPullParser, "fillAlpha", 12, this.setY);
                this.MenuHostHelper$$ExternalSyntheticLambda1 = setX(setHandwritingBoundsOffsets.setX(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.MenuHostHelper$$ExternalSyntheticLambda1);
                this.setUnboundedRipple = setX(setHandwritingBoundsOffsets.setX(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.setUnboundedRipple);
                this.setNavigationOnClickListener = setHandwritingBoundsOffsets.setIconTintList(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.setNavigationOnClickListener);
                this.MenuHostHelper$$ExternalSyntheticLambda0 = setHandwritingBoundsOffsets.setY(typedArray, xmlPullParser, theme, "strokeColor", 3);
                this.setIconTintList = setHandwritingBoundsOffsets.setIconTintList(typedArray, xmlPullParser, "strokeAlpha", 11, this.setIconTintList);
                this.setOnLongClickListener = setHandwritingBoundsOffsets.setIconTintList(typedArray, xmlPullParser, "strokeWidth", 4, this.setOnLongClickListener);
                this.setLayoutAnimation = setHandwritingBoundsOffsets.setIconTintList(typedArray, xmlPullParser, "trimPathEnd", 6, this.setLayoutAnimation);
                this.setUiOptions = setHandwritingBoundsOffsets.setIconTintList(typedArray, xmlPullParser, "trimPathOffset", 7, this.setUiOptions);
                this.setTextAlignment = setHandwritingBoundsOffsets.setIconTintList(typedArray, xmlPullParser, "trimPathStart", 5, this.setTextAlignment);
                this.setCenterIfNoTextEnabled = setHandwritingBoundsOffsets.setX(typedArray, xmlPullParser, "fillType", 13, this.setCenterIfNoTextEnabled);
            }
        }

        @Override // o.setAccessibilityLiveRegion.setIconTintList
        public boolean setX() {
            return this.setX.setX() || this.MenuHostHelper$$ExternalSyntheticLambda0.setX();
        }

        @Override // o.setAccessibilityLiveRegion.setIconTintList
        public boolean setY(int[] iArr) {
            return this.MenuHostHelper$$ExternalSyntheticLambda0.setY(iArr) | this.setX.setY(iArr);
        }

        int getStrokeColor() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList();
        }

        void setStrokeColor(int i) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(i);
        }

        float getStrokeWidth() {
            return this.setOnLongClickListener;
        }

        void setStrokeWidth(float f) {
            this.setOnLongClickListener = f;
        }

        float getStrokeAlpha() {
            return this.setIconTintList;
        }

        void setStrokeAlpha(float f) {
            this.setIconTintList = f;
        }

        int getFillColor() {
            return this.setX.setIconTintList();
        }

        void setFillColor(int i) {
            this.setX.setIconTintList(i);
        }

        float getFillAlpha() {
            return this.setY;
        }

        void setFillAlpha(float f) {
            this.setY = f;
        }

        float getTrimPathStart() {
            return this.setTextAlignment;
        }

        void setTrimPathStart(float f) {
            this.setTextAlignment = f;
        }

        float getTrimPathEnd() {
            return this.setLayoutAnimation;
        }

        void setTrimPathEnd(float f) {
            this.setLayoutAnimation = f;
        }

        float getTrimPathOffset() {
            return this.setUiOptions;
        }

        void setTrimPathOffset(float f) {
            this.setUiOptions = f;
        }
    }
}