package o;

import java.util.Date;

/* loaded from: classes.dex */
public final class vS$MenuHostHelper$$ExternalSyntheticLambda1 {
    String MenuHostHelper$$ExternalSyntheticLambda0;
    final vJ MenuHostHelper$$ExternalSyntheticLambda1;
    String ViewPager$SavedState$1;
    Date setCenterIfNoTextEnabled;
    Date setIconTintList;
    final long setLayoutAnimation;
    long setNavigationOnClickListener;
    String setOnLongClickListener;
    final vE setUiOptions;
    long setUnboundedRipple;
    int setX;
    Date setY;

    public vS$MenuHostHelper$$ExternalSyntheticLambda1(long j, vE vEVar, vJ vJVar) {
        pN.setY(vEVar, "");
        this.setLayoutAnimation = j;
        this.setUiOptions = vEVar;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = vJVar;
        this.setX = -1;
        if (vJVar != null) {
            this.setNavigationOnClickListener = vJVar.setTextAlignment;
            this.setUnboundedRipple = vJVar.setIconSize;
            C0557vz c0557vz = vJVar.setNavigationOnClickListener;
            int length = c0557vz.setIconTintList.length / 2;
            for (int i = 0; i < length; i++) {
                int i2 = i << 1;
                String str = c0557vz.setIconTintList[i2];
                String str2 = c0557vz.setIconTintList[i2 + 1];
                if (str == null ? false : str.equalsIgnoreCase("Date")) {
                    this.setCenterIfNoTextEnabled = C0570wj.MenuHostHelper$$ExternalSyntheticLambda0(str2);
                    this.ViewPager$SavedState$1 = str2;
                } else if (str == null ? false : str.equalsIgnoreCase("Expires")) {
                    this.setY = C0570wj.MenuHostHelper$$ExternalSyntheticLambda0(str2);
                } else if (str == null ? false : str.equalsIgnoreCase("Last-Modified")) {
                    this.setIconTintList = C0570wj.MenuHostHelper$$ExternalSyntheticLambda0(str2);
                    this.setOnLongClickListener = str2;
                } else if (str == null ? false : str.equalsIgnoreCase("ETag")) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = str2;
                } else if (str == null ? false : str.equalsIgnoreCase("Age")) {
                    this.setX = vL.setX(str2, -1);
                }
            }
        }
    }
}