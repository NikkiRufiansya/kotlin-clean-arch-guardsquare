package o;

import java.util.Arrays;
import o.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;

/* loaded from: classes.dex */
public class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1 {
    private int[] setUiOptions = new int[10];
    private int[] setIconSize = new int[10];
    private int setIconTintList = 0;
    private int[] setOnLongClickListener = new int[10];
    private float[] setNavigationOnClickListener = new float[10];
    private int MenuHostHelper$$ExternalSyntheticLambda1 = 0;
    private int[] setUnboundedRipple = new int[5];
    private String[] setTextAlignment = new String[5];
    private int setX = 0;
    private int[] setY = new int[4];
    private boolean[] setLayoutAnimation = new boolean[4];
    private int MenuHostHelper$$ExternalSyntheticLambda0 = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2) {
        int i3 = this.setIconTintList;
        int[] iArr = this.setUiOptions;
        if (i3 >= iArr.length) {
            this.setUiOptions = Arrays.copyOf(iArr, iArr.length << 1);
            int[] iArr2 = this.setIconSize;
            this.setIconSize = Arrays.copyOf(iArr2, iArr2.length << 1);
        }
        int[] iArr3 = this.setUiOptions;
        int i4 = this.setIconTintList;
        iArr3[i4] = i;
        int[] iArr4 = this.setIconSize;
        this.setIconTintList = i4 + 1;
        iArr4[i4] = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(int i, float f) {
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int[] iArr = this.setOnLongClickListener;
        if (i2 >= iArr.length) {
            this.setOnLongClickListener = Arrays.copyOf(iArr, iArr.length << 1);
            float[] fArr = this.setNavigationOnClickListener;
            this.setNavigationOnClickListener = Arrays.copyOf(fArr, fArr.length << 1);
        }
        int[] iArr2 = this.setOnLongClickListener;
        int i3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        iArr2[i3] = i;
        float[] fArr2 = this.setNavigationOnClickListener;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i3 + 1;
        fArr2[i3] = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(int i, String str) {
        int i2 = this.setX;
        int[] iArr = this.setUnboundedRipple;
        if (i2 >= iArr.length) {
            this.setUnboundedRipple = Arrays.copyOf(iArr, iArr.length << 1);
            String[] strArr = this.setTextAlignment;
            this.setTextAlignment = (String[]) Arrays.copyOf(strArr, strArr.length << 1);
        }
        int[] iArr2 = this.setUnboundedRipple;
        int i3 = this.setX;
        iArr2[i3] = i;
        String[] strArr2 = this.setTextAlignment;
        this.setX = i3 + 1;
        strArr2[i3] = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, boolean z) {
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int[] iArr = this.setY;
        if (i2 >= iArr.length) {
            this.setY = Arrays.copyOf(iArr, iArr.length << 1);
            boolean[] zArr = this.setLayoutAnimation;
            this.setLayoutAnimation = Arrays.copyOf(zArr, zArr.length << 1);
        }
        int[] iArr2 = this.setY;
        int i3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        iArr2[i3] = i;
        boolean[] zArr2 = this.setLayoutAnimation;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i3 + 1;
        zArr2[i3] = z;
    }

    public final void setIconTintList(WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX setx) {
        for (int i = 0; i < this.setIconTintList; i++) {
            WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setIconTintList(setx, this.setUiOptions[i], this.setIconSize[i]);
        }
        for (int i2 = 0; i2 < this.MenuHostHelper$$ExternalSyntheticLambda1; i2++) {
            WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setY(setx, this.setOnLongClickListener[i2], this.setNavigationOnClickListener[i2]);
        }
        for (int i3 = 0; i3 < this.setX; i3++) {
            WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX(setx, this.setUnboundedRipple[i3], this.setTextAlignment[i3]);
        }
        for (int i4 = 0; i4 < this.MenuHostHelper$$ExternalSyntheticLambda0; i4++) {
            WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(setx, this.setY[i4], this.setLayoutAnimation[i4]);
        }
    }
}