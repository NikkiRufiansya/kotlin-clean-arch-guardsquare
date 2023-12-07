package o;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class setFontFeatureSettings implements setImageURI {
    private final float MenuHostHelper$$ExternalSyntheticLambda1;
    private final setImageURI setIconTintList;

    public setFontFeatureSettings(float f, setImageURI setimageuri) {
        while (setimageuri instanceof setFontFeatureSettings) {
            setimageuri = ((setFontFeatureSettings) setimageuri).setIconTintList;
            f += ((setFontFeatureSettings) setimageuri).MenuHostHelper$$ExternalSyntheticLambda1;
        }
        this.setIconTintList = setimageuri;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = f;
    }

    @Override // o.setImageURI
    public final float setY(RectF rectF) {
        return Math.max(0.0f, this.setIconTintList.setY(rectF) + this.MenuHostHelper$$ExternalSyntheticLambda1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setFontFeatureSettings) {
            setFontFeatureSettings setfontfeaturesettings = (setFontFeatureSettings) obj;
            return this.setIconTintList.equals(setfontfeaturesettings.setIconTintList) && this.MenuHostHelper$$ExternalSyntheticLambda1 == setfontfeaturesettings.MenuHostHelper$$ExternalSyntheticLambda1;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.setIconTintList, Float.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda1)});
    }
}