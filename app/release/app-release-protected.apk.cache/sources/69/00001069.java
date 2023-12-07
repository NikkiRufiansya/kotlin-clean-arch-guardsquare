package o;

import android.content.res.Resources;
import o.setAllowStacking;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setTextStartPaddingResource$MenuHostHelper$$ExternalSyntheticLambda1 {
    final Resources setIconTintList;
    final Resources.Theme setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setTextStartPaddingResource$MenuHostHelper$$ExternalSyntheticLambda1(Resources resources, Resources.Theme theme) {
        this.setIconTintList = resources;
        this.setX = theme;
    }

    public final boolean equals(Object obj) {
        boolean x;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setTextStartPaddingResource$MenuHostHelper$$ExternalSyntheticLambda1 settextstartpaddingresource_menuhosthelper__externalsyntheticlambda1 = (setTextStartPaddingResource$MenuHostHelper$$ExternalSyntheticLambda1) obj;
        if (this.setIconTintList.equals(settextstartpaddingresource_menuhosthelper__externalsyntheticlambda1.setIconTintList)) {
            x = setAllowStacking.setX.setX(this.setX, settextstartpaddingresource_menuhosthelper__externalsyntheticlambda1.setX);
            if (x) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int x;
        x = setAllowStacking.setX.setX(this.setIconTintList, this.setX);
        return x;
    }
}