package o;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setTextStartPaddingResource$MenuHostHelper$$ExternalSyntheticLambda0 {
    final Configuration MenuHostHelper$$ExternalSyntheticLambda1;
    final ColorStateList setIconTintList;
    final int setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setTextStartPaddingResource$MenuHostHelper$$ExternalSyntheticLambda0(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.setIconTintList = colorStateList;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = configuration;
        this.setX = theme == null ? 0 : theme.hashCode();
    }
}