package o;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import o.setSelectedChildViewEnabled;
import o.setSuffixText;
import o.setViewTranslationCallback;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class setViewTranslationCallback extends setSelectedChildViewEnabled implements setButtonDrawable {
    private int MenuHostHelper$$ExternalSyntheticLambda0;
    private int MenuHostHelper$$ExternalSyntheticLambda1;
    private setY setIconTintList;
    private boolean setX;
    private setUiOptions setY;

    @Override // o.setSelectedChildViewEnabled, o.setSuffixText, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // o.setSelectedChildViewEnabled, o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTint(int i) {
        super.setTint(i);
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    public setViewTranslationCallback() {
        this(null, null);
    }

    setViewTranslationCallback(setY sety, Resources resources) {
        super(null);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
        MenuHostHelper$$ExternalSyntheticLambda0(new setY(sety, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static setViewTranslationCallback setIconTintList(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("animated-selector")) {
            StringBuilder sb = new StringBuilder();
            sb.append(xmlPullParser.getPositionDescription());
            sb.append(": invalid animated-selector tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        setViewTranslationCallback setviewtranslationcallback = new setViewTranslationCallback();
        setviewtranslationcallback.setY(context, resources, xmlPullParser, attributeSet, theme);
        return setviewtranslationcallback;
    }

    @Override // o.setSelectedChildViewEnabled
    public void setY(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        int[] iArr = setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1;
        if (theme == null) {
            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
        } else {
            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        setVisible(obtainStyledAttributes.getBoolean(setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.setUnboundedRipple, true), true);
        MenuHostHelper$$ExternalSyntheticLambda0(obtainStyledAttributes);
        MenuHostHelper$$ExternalSyntheticLambda1(resources);
        obtainStyledAttributes.recycle();
        MenuHostHelper$$ExternalSyntheticLambda0(context, resources, xmlPullParser, attributeSet, theme);
        MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        setUiOptions setuioptions = this.setY;
        if (setuioptions != null && (visible || z2)) {
            if (z) {
                setuioptions.setY();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        setUiOptions setuioptions = this.setY;
        if (setuioptions != null) {
            setuioptions.setIconTintList();
            this.setY = null;
            setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
        }
    }

    @Override // o.setSelectedChildViewEnabled, o.setSuffixText, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int MenuHostHelper$$ExternalSyntheticLambda1 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(iArr);
        boolean z = MenuHostHelper$$ExternalSyntheticLambda1 != setIconTintList() && (setX(MenuHostHelper$$ExternalSyntheticLambda1) || setIconTintList(MenuHostHelper$$ExternalSyntheticLambda1));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    private boolean setX(int i) {
        int iconTintList;
        int iconTintList2;
        setUiOptions setuioptions;
        setUiOptions setuioptions2 = this.setY;
        if (setuioptions2 != null) {
            if (i == this.MenuHostHelper$$ExternalSyntheticLambda0) {
                return true;
            }
            if (i == this.MenuHostHelper$$ExternalSyntheticLambda1 && setuioptions2.setX()) {
                setuioptions2.MenuHostHelper$$ExternalSyntheticLambda1();
                this.MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
                return true;
            }
            iconTintList = this.MenuHostHelper$$ExternalSyntheticLambda0;
            setuioptions2.setIconTintList();
        } else {
            iconTintList = setIconTintList();
        }
        this.setY = null;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
        setY sety = this.setIconTintList;
        int x = sety.setX(iconTintList);
        int x2 = sety.setX(i);
        if (x2 == 0 || x == 0 || (iconTintList2 = sety.setIconTintList(x, x2)) < 0) {
            return false;
        }
        boolean MenuHostHelper$$ExternalSyntheticLambda1 = sety.MenuHostHelper$$ExternalSyntheticLambda1(x, x2);
        setIconTintList(iconTintList2);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            setuioptions = new setUiOptions((AnimationDrawable) current, sety.setY(x, x2), MenuHostHelper$$ExternalSyntheticLambda1) { // from class: o.setViewTranslationCallback$MenuHostHelper$$ExternalSyntheticLambda0
                private final boolean MenuHostHelper$$ExternalSyntheticLambda1;
                private final ObjectAnimator setY;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super();
                    int numberOfFrames = r6.getNumberOfFrames();
                    int i2 = r7 ? numberOfFrames - 1 : 0;
                    int i3 = !r7 ? numberOfFrames - 1 : 0;
                    setViewTranslationCallback.setX setx = new setViewTranslationCallback.setX(r6, r7);
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(r6, "currentIndex", i2, i3);
                    RecyclerView$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(ofInt, true);
                    ofInt.setDuration(setx.MenuHostHelper$$ExternalSyntheticLambda0());
                    ofInt.setInterpolator(setx);
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1;
                    this.setY = ofInt;
                }

                @Override // o.setViewTranslationCallback.setUiOptions
                public boolean setX() {
                    return this.MenuHostHelper$$ExternalSyntheticLambda1;
                }

                @Override // o.setViewTranslationCallback.setUiOptions
                public void setY() {
                    this.setY.start();
                }

                @Override // o.setViewTranslationCallback.setUiOptions
                public void MenuHostHelper$$ExternalSyntheticLambda1() {
                    this.setY.reverse();
                }

                @Override // o.setViewTranslationCallback.setUiOptions
                public void setIconTintList() {
                    this.setY.cancel();
                }
            };
        } else if (current instanceof CoordinatorLayout) {
            setuioptions = new setIconTintList((CoordinatorLayout) current);
        } else {
            if (current instanceof Animatable) {
                setuioptions = new setUiOptions((Animatable) current) { // from class: o.setViewTranslationCallback$MenuHostHelper$$ExternalSyntheticLambda1
                    private final Animatable MenuHostHelper$$ExternalSyntheticLambda0;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super();
                        this.MenuHostHelper$$ExternalSyntheticLambda0 = r2;
                    }

                    @Override // o.setViewTranslationCallback.setUiOptions
                    public void setY() {
                        this.MenuHostHelper$$ExternalSyntheticLambda0.start();
                    }

                    @Override // o.setViewTranslationCallback.setUiOptions
                    public void setIconTintList() {
                        this.MenuHostHelper$$ExternalSyntheticLambda0.stop();
                    }
                };
            }
            return false;
        }
        setuioptions.setY();
        this.setY = setuioptions;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = iconTintList;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class setUiOptions {
        public void MenuHostHelper$$ExternalSyntheticLambda1() {
        }

        public abstract void setIconTintList();

        public boolean setX() {
            return false;
        }

        public abstract void setY();

        private setUiOptions() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList extends setUiOptions {
        private final CoordinatorLayout MenuHostHelper$$ExternalSyntheticLambda1;

        setIconTintList(CoordinatorLayout coordinatorLayout) {
            super();
            this.MenuHostHelper$$ExternalSyntheticLambda1 = coordinatorLayout;
        }

        @Override // o.setViewTranslationCallback.setUiOptions
        public void setY() {
            this.MenuHostHelper$$ExternalSyntheticLambda1.start();
        }

        @Override // o.setViewTranslationCallback.setUiOptions
        public void setIconTintList() {
            this.MenuHostHelper$$ExternalSyntheticLambda1.stop();
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(TypedArray typedArray) {
        int changingConfigurations;
        setY sety = this.setIconTintList;
        int i = sety.setY;
        changingConfigurations = typedArray.getChangingConfigurations();
        sety.setY = i | changingConfigurations;
        int i2 = setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions;
        sety.setX(typedArray.getBoolean(2, sety.setViewTranslationCallback));
        int i3 = setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.setX;
        sety.setIconTintList(typedArray.getBoolean(3, sety.setMaxEms));
        int i4 = setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.setY;
        sety.MenuHostHelper$$ExternalSyntheticLambda1(typedArray.getInt(4, sety.setCheckedIconEnabled));
        int i5 = setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
        sety.MenuHostHelper$$ExternalSyntheticLambda0(typedArray.getInt(5, sety.setGuidelinePercent));
        setDither(typedArray.getBoolean(setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList, sety.setTextScaleX));
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1() {
        onStateChange(getState());
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    MenuHostHelper$$ExternalSyntheticLambda1(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    setX(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private int setX(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        int next;
        int[] iArr = setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.setIconSize;
        if (theme == null) {
            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
        } else {
            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.setTextAlignment, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.setCenterIfNoTextEnabled, -1);
        int resourceId3 = obtainStyledAttributes.getResourceId(setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius, -1);
        Drawable MenuHostHelper$$ExternalSyntheticLambda1 = resourceId3 > 0 ? setScrollCaptureCallback.setX().MenuHostHelper$$ExternalSyntheticLambda1(context, resourceId3) : null;
        boolean z = obtainStyledAttributes.getBoolean(setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1, false);
        obtainStyledAttributes.recycle();
        if (MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(sb.toString());
            } else if (!xmlPullParser.getName().equals("animated-vector")) {
                MenuHostHelper$$ExternalSyntheticLambda1 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                MenuHostHelper$$ExternalSyntheticLambda1 = CoordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda0(context, resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(xmlPullParser.getPositionDescription());
            sb2.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            throw new XmlPullParserException(sb2.toString());
        } else if (resourceId == -1 || resourceId2 == -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(xmlPullParser.getPositionDescription());
            sb3.append(": <transition> tag requires 'fromId' & 'toId' attributes");
            throw new XmlPullParserException(sb3.toString());
        } else {
            return this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(resourceId, resourceId2, MenuHostHelper$$ExternalSyntheticLambda1, z);
        }
    }

    private int MenuHostHelper$$ExternalSyntheticLambda1(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        int next;
        int[] iArr = setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener;
        if (theme == null) {
            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
        } else {
            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation, 0);
        int i = setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener;
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        Drawable MenuHostHelper$$ExternalSyntheticLambda1 = resourceId2 > 0 ? setScrollCaptureCallback.setX().MenuHostHelper$$ExternalSyntheticLambda1(context, resourceId2) : null;
        obtainStyledAttributes.recycle();
        int[] x = setX(attributeSet);
        if (MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(sb.toString());
            } else if (!xmlPullParser.getName().equals("vector")) {
                MenuHostHelper$$ExternalSyntheticLambda1 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                MenuHostHelper$$ExternalSyntheticLambda1 = setAccessibilityLiveRegion.MenuHostHelper$$ExternalSyntheticLambda0(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(xmlPullParser.getPositionDescription());
            sb2.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            throw new XmlPullParserException(sb2.toString());
        }
        return this.setIconTintList.setY(x, MenuHostHelper$$ExternalSyntheticLambda1, resourceId);
    }

    @Override // o.setSelectedChildViewEnabled, o.setSuffixText, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.setX && super.mutate() == this) {
            this.setIconTintList.setIconTintList();
            this.setX = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setSelectedChildViewEnabled
    /* renamed from: setY */
    public setY setX() {
        return new setY(this.setIconTintList, this, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY extends setSelectedChildViewEnabled.setY {
        setPrefixTextAppearance<Long> setIconTintList;
        onAppEnteredBackground<Integer> setX;

        private static long setUnboundedRipple(int i, int i2) {
            return i2 | (i << 32);
        }

        setY(setY sety, setViewTranslationCallback setviewtranslationcallback, Resources resources) {
            super(sety, setviewtranslationcallback, resources);
            if (sety != null) {
                this.setIconTintList = sety.setIconTintList;
                this.setX = sety.setX;
                return;
            }
            this.setIconTintList = new setPrefixTextAppearance<>();
            this.setX = new onAppEnteredBackground<>();
        }

        @Override // o.setSelectedChildViewEnabled.setY, o.setSuffixText.setIconTintList
        void setIconTintList() {
            this.setIconTintList = this.setIconTintList.clone();
            this.setX = this.setX.clone();
        }

        int MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2, Drawable drawable, boolean z) {
            int iconTintList = super.setIconTintList(drawable);
            long unboundedRipple = setUnboundedRipple(i, i2);
            long j = z ? 8589934592L : 0L;
            long j2 = iconTintList;
            this.setIconTintList.setIconTintList(unboundedRipple, Long.valueOf(j2 | j));
            if (z) {
                this.setIconTintList.setIconTintList(setUnboundedRipple(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return iconTintList;
        }

        int setY(int[] iArr, Drawable drawable, int i) {
            int y = super.setY(iArr, drawable);
            this.setX.MenuHostHelper$$ExternalSyntheticLambda1(y, Integer.valueOf(i));
            return y;
        }

        int MenuHostHelper$$ExternalSyntheticLambda1(int[] iArr) {
            int iconTintList = super.setIconTintList(iArr);
            return iconTintList >= 0 ? iconTintList : super.setIconTintList(StateSet.WILD_CARD);
        }

        int setX(int i) {
            if (i < 0) {
                return 0;
            }
            return this.setX.MenuHostHelper$$ExternalSyntheticLambda0(i, 0).intValue();
        }

        int setIconTintList(int i, int i2) {
            return (int) this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(setUnboundedRipple(i, i2), -1L).longValue();
        }

        boolean setY(int i, int i2) {
            return (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(setUnboundedRipple(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        boolean MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2) {
            return (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(setUnboundedRipple(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // o.setSelectedChildViewEnabled.setY, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new setViewTranslationCallback(this, null);
        }

        @Override // o.setSelectedChildViewEnabled.setY, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new setViewTranslationCallback(this, resources);
        }
    }

    @Override // o.setSelectedChildViewEnabled, o.setSuffixText
    void MenuHostHelper$$ExternalSyntheticLambda0(setSuffixText.setIconTintList seticontintlist) {
        super.MenuHostHelper$$ExternalSyntheticLambda0(seticontintlist);
        if (seticontintlist instanceof setY) {
            this.setIconTintList = (setY) seticontintlist;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX implements TimeInterpolator {
        private int MenuHostHelper$$ExternalSyntheticLambda0;
        private int[] setIconTintList;
        private int setY;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setX(AnimationDrawable animationDrawable, boolean z) {
            MenuHostHelper$$ExternalSyntheticLambda1(animationDrawable, z);
        }

        int MenuHostHelper$$ExternalSyntheticLambda1(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.setY = numberOfFrames;
            int[] iArr = this.setIconTintList;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.setIconTintList = new int[numberOfFrames];
            }
            int[] iArr2 = this.setIconTintList;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
            return i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int MenuHostHelper$$ExternalSyntheticLambda0() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.MenuHostHelper$$ExternalSyntheticLambda0) + 0.5f);
            int i2 = this.setY;
            int[] iArr = this.setIconTintList;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.MenuHostHelper$$ExternalSyntheticLambda0 : 0.0f);
        }
    }
}