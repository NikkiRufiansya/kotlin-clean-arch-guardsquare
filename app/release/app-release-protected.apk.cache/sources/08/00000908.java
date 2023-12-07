package o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.setAccessibilityLiveRegion;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
class setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda1 extends setAccessibilityLiveRegion.setY {
    @Override // o.setAccessibilityLiveRegion.setY
    public boolean setIconTintList() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda1(setAccessibilityLiveRegion$MenuHostHelper$$ExternalSyntheticLambda1 setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda1) {
        super(setaccessibilityliveregion_menuhosthelper__externalsyntheticlambda1);
    }

    private void setX(TypedArray typedArray, XmlPullParser xmlPullParser) {
        String string = typedArray.getString(0);
        if (string != null) {
            this.setIconSize = string;
        }
        String string2 = typedArray.getString(1);
        if (string2 != null) {
            this.setChipCornerRadius = setIconifiedByDefault.setIconTintList(string2);
        }
        this.setCenterIfNoTextEnabled = setHandwritingBoundsOffsets.setX(typedArray, xmlPullParser, "fillType", 2, 0);
    }

    public void setX(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
            int[] iArr = setClipToPadding.setUnboundedRipple;
            if (theme == null) {
                obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
            } else {
                obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            }
            setX(obtainStyledAttributes, xmlPullParser);
            obtainStyledAttributes.recycle();
        }
    }
}