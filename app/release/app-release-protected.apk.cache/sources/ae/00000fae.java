package o;

import java.util.Arrays;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setSplitTrack$MenuHostHelper$$ExternalSyntheticLambda0 implements WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setX {
    int[] MenuHostHelper$$ExternalSyntheticLambda1;
    int setIconTintList;
    int setX;
    int setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, boolean z) {
        this.setX = 0;
        int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setGuidelinePercent;
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener == null || setuioptions == null || !setuioptions.setChipCornerRadius) {
            return;
        }
        if (!z) {
            if (!windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.MenuHostHelper$$ExternalSyntheticLambda1()) {
                setuioptions.setIconTintList(this.setY, this.setIconTintList, windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setViewTranslationCallback, this);
            }
        } else {
            if (!(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setOnLongClickListener.size() > 0)) {
                setuioptions.setY(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener.setY(), this);
            }
        }
        if (this.setX > setuioptions.setZ) {
            setuioptions.setZ = this.setX;
            setuioptions.setOnNavigationItemSelectedListener = z;
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setContentScrimResource.MenuHostHelper$$ExternalSyntheticLambda0();
        }
    }

    @Override // o.WindowInsetsCompat$Impl28$.ExternalSyntheticApiModelOutline0.setUiOptions.setX
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.setX << 1;
        int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.MenuHostHelper$$ExternalSyntheticLambda1 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i3 >= iArr.length) {
            int[] iArr3 = new int[i3 << 1];
            this.MenuHostHelper$$ExternalSyntheticLambda1 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        iArr4[i3] = i;
        iArr4[i3 + 1] = i2;
        this.setX++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean setIconTintList(int i) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            int i2 = this.setX;
            for (int i3 = 0; i3 < (i2 << 1); i3 += 2) {
                if (this.MenuHostHelper$$ExternalSyntheticLambda1[i3] == i) {
                    return true;
                }
            }
        }
        return false;
    }
}