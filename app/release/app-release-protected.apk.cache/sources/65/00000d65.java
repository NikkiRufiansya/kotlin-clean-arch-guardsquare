package o;

import java.io.IOException;

/* loaded from: classes.dex */
public final class setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0 {
    final C0612xw setIconTintList;
    final String[] setY;

    private setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0(String[] strArr, C0612xw c0612xw) {
        this.setY = strArr;
        this.setIconTintList = c0612xw;
    }

    public static setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda0(String... strArr) {
        try {
            C0610xu[] c0610xuArr = new C0610xu[strArr.length];
            C0602xo c0602xo = new C0602xo();
            for (int i = 0; i < strArr.length; i++) {
                setMeasureAllChildren.MenuHostHelper$$ExternalSyntheticLambda1(c0602xo, strArr[i]);
                c0602xo.setUnboundedRipple();
                c0610xuArr[i] = c0602xo.MenuHostHelper$$ExternalSyntheticLambda0(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0);
            }
            return new setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0((String[]) strArr.clone(), C0612xw.setY(c0610xuArr));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}