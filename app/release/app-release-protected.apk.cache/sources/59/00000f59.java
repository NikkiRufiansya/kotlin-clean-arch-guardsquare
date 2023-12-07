package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import o.setSuffixText;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setSelectedChildViewEnabled extends setSuffixText {
    private boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private setY setIconTintList;

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    setSelectedChildViewEnabled() {
        this(null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int iconTintList = this.setIconTintList.setIconTintList(iArr);
        if (iconTintList < 0) {
            iconTintList = this.setIconTintList.setIconTintList(StateSet.WILD_CARD);
        }
        return setIconTintList(iconTintList) || onStateChange;
    }

    public void setY(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        int[] iArr = setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.setTextScaleX;
        if (theme == null) {
            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
        } else {
            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        setVisible(obtainStyledAttributes.getBoolean(setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.setLayoutDirection, true), true);
        setY(obtainStyledAttributes);
        MenuHostHelper$$ExternalSyntheticLambda1(resources);
        obtainStyledAttributes.recycle();
        setX(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    private void setY(TypedArray typedArray) {
        int changingConfigurations;
        setY sety = this.setIconTintList;
        int i = sety.setY;
        changingConfigurations = typedArray.getChangingConfigurations();
        sety.setY = i | changingConfigurations;
        sety.setViewTranslationCallback = typedArray.getBoolean(setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.setGuidelinePercent, sety.setViewTranslationCallback);
        sety.setMaxEms = typedArray.getBoolean(setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.setZ, sety.setMaxEms);
        sety.setCheckedIconEnabled = typedArray.getInt(setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.setCheckedIconEnabled, sety.setCheckedIconEnabled);
        sety.setGuidelinePercent = typedArray.getInt(setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.setMinAndMaxProgress, sety.setGuidelinePercent);
        sety.setTextScaleX = typedArray.getBoolean(setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.setAnimationFromJson, sety.setTextScaleX);
    }

    private void setX(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        int next;
        setY sety = this.setIconTintList;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next2 == 3) {
                return;
            }
            if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                int[] iArr = setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.setMaxEms;
                if (theme == null) {
                    obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
                } else {
                    obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                }
                int resourceId = obtainStyledAttributes.getResourceId(setFloatValues$MenuHostHelper$$ExternalSyntheticLambda1.setOnNavigationItemSelectedListener, -1);
                Drawable MenuHostHelper$$ExternalSyntheticLambda1 = resourceId > 0 ? setScrollCaptureCallback.setX().MenuHostHelper$$ExternalSyntheticLambda1(context, resourceId) : null;
                obtainStyledAttributes.recycle();
                int[] x = setX(attributeSet);
                if (MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                    do {
                        next = xmlPullParser.next();
                    } while (next == 4);
                    if (next == 2) {
                        MenuHostHelper$$ExternalSyntheticLambda1 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(xmlPullParser.getPositionDescription());
                        sb.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        throw new XmlPullParserException(sb.toString());
                    }
                }
                sety.setY(x, MenuHostHelper$$ExternalSyntheticLambda1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] setX(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i++;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda1 && super.mutate() == this) {
            this.setIconTintList.setIconTintList();
            this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setSuffixText
    /* renamed from: setX */
    public setY MenuHostHelper$$ExternalSyntheticLambda0() {
        return new setY(this.setIconTintList, this, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY extends setSuffixText.setIconTintList {
        int[][] setFilterTouchesWhenObscured;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setY(setY sety, setSelectedChildViewEnabled setselectedchildviewenabled, Resources resources) {
            super(sety, setselectedchildviewenabled, resources);
            if (sety != null) {
                this.setFilterTouchesWhenObscured = sety.setFilterTouchesWhenObscured;
            } else {
                this.setFilterTouchesWhenObscured = new int[setX()];
            }
        }

        @Override // o.setSuffixText.setIconTintList
        void setIconTintList() {
            int[][] iArr = this.setFilterTouchesWhenObscured;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.setFilterTouchesWhenObscured[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.setFilterTouchesWhenObscured = iArr2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int setY(int[] iArr, Drawable drawable) {
            int iconTintList = setIconTintList(drawable);
            this.setFilterTouchesWhenObscured[iconTintList] = iArr;
            return iconTintList;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int setIconTintList(int[] iArr) {
            int[][] iArr2 = this.setFilterTouchesWhenObscured;
            int MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1();
            for (int i = 0; i < MenuHostHelper$$ExternalSyntheticLambda1; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new setSelectedChildViewEnabled(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new setSelectedChildViewEnabled(this, resources);
        }

        @Override // o.setSuffixText.setIconTintList
        public void setX(int i, int i2) {
            super.setX(i, i2);
            int[][] iArr = new int[i2];
            System.arraycopy(this.setFilterTouchesWhenObscured, 0, iArr, 0, i);
            this.setFilterTouchesWhenObscured = iArr;
        }
    }

    @Override // o.setSuffixText, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setSuffixText
    public void MenuHostHelper$$ExternalSyntheticLambda0(setSuffixText.setIconTintList seticontintlist) {
        super.MenuHostHelper$$ExternalSyntheticLambda0(seticontintlist);
        if (seticontintlist instanceof setY) {
            this.setIconTintList = (setY) seticontintlist;
        }
    }

    setSelectedChildViewEnabled(setY sety, Resources resources) {
        MenuHostHelper$$ExternalSyntheticLambda0(new setY(sety, this, resources));
        onStateChange(getState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setSelectedChildViewEnabled(setY sety) {
        if (sety != null) {
            MenuHostHelper$$ExternalSyntheticLambda0(sety);
        }
    }
}