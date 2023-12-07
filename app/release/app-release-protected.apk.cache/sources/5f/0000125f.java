package o;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class wA$MenuHostHelper$$ExternalSyntheticLambda0 {
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    public int MenuHostHelper$$ExternalSyntheticLambda1;
    C0581wu[] setIconTintList;
    final C0602xo setLayoutAnimation;
    int setNavigationOnClickListener;
    private int setOnLongClickListener;
    private final boolean setUiOptions;
    int setUnboundedRipple;
    public int setX;
    public int setY;

    private wA$MenuHostHelper$$ExternalSyntheticLambda0(int i, boolean z, C0602xo c0602xo) {
        pN.setY(c0602xo, "");
        this.setY = 4096;
        this.setUiOptions = true;
        this.setLayoutAnimation = c0602xo;
        this.setNavigationOnClickListener = Integer.MAX_VALUE;
        this.setX = 4096;
        this.setIconTintList = new C0581wu[8];
        this.setUnboundedRipple = 7;
    }

    public /* synthetic */ wA$MenuHostHelper$$ExternalSyntheticLambda0(C0602xo c0602xo) {
        this(4096, true, c0602xo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY() {
        C0581wu[] c0581wuArr = this.setIconTintList;
        int length = c0581wuArr.length;
        pN.setY(c0581wuArr, "");
        Arrays.fill(c0581wuArr, 0, length, (Object) null);
        this.setUnboundedRipple = this.setIconTintList.length - 1;
        this.setOnLongClickListener = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int setIconTintList(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.setIconTintList.length;
            while (true) {
                length--;
                i2 = this.setUnboundedRipple;
                if (length < i2 || i <= 0) {
                    break;
                }
                C0581wu c0581wu = this.setIconTintList[length];
                pN.setX(c0581wu);
                i -= c0581wu.setNavigationOnClickListener;
                int i4 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                C0581wu c0581wu2 = this.setIconTintList[length];
                pN.setX(c0581wu2);
                this.MenuHostHelper$$ExternalSyntheticLambda1 = i4 - c0581wu2.setNavigationOnClickListener;
                this.setOnLongClickListener--;
                i3++;
            }
            C0581wu[] c0581wuArr = this.setIconTintList;
            int i5 = i2 + 1;
            System.arraycopy(c0581wuArr, i5, c0581wuArr, i5 + i3, this.setOnLongClickListener);
            C0581wu[] c0581wuArr2 = this.setIconTintList;
            int i6 = this.setUnboundedRipple + 1;
            Arrays.fill(c0581wuArr2, i6, i6 + i3, (Object) null);
            this.setUnboundedRipple += i3;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(C0581wu c0581wu) {
        int i = c0581wu.setNavigationOnClickListener;
        int i2 = this.setX;
        if (i > i2) {
            setY();
            return;
        }
        setIconTintList((this.MenuHostHelper$$ExternalSyntheticLambda1 + i) - i2);
        int i3 = this.setOnLongClickListener;
        C0581wu[] c0581wuArr = this.setIconTintList;
        if (i3 + 1 > c0581wuArr.length) {
            C0581wu[] c0581wuArr2 = new C0581wu[c0581wuArr.length << 1];
            System.arraycopy(c0581wuArr, 0, c0581wuArr2, c0581wuArr.length, c0581wuArr.length);
            this.setUnboundedRipple = this.setIconTintList.length - 1;
            this.setIconTintList = c0581wuArr2;
        }
        int i4 = this.setUnboundedRipple;
        this.setUnboundedRipple = i4 - 1;
        this.setIconTintList[i4] = c0581wu;
        this.setOnLongClickListener++;
        this.MenuHostHelper$$ExternalSyntheticLambda1 += i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2, int i3) {
        if (i < i2) {
            this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0(i | i3);
            return;
        }
        this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0(128 | (i4 & 127));
            i4 >>>= 7;
        }
        this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIconTintList(C0610xu c0610xu) {
        pN.setY(c0610xu, "");
        if (this.setUiOptions) {
            wD wDVar = wD.MenuHostHelper$$ExternalSyntheticLambda1;
            if (wD.setX(c0610xu) < c0610xu.MenuHostHelper$$ExternalSyntheticLambda0()) {
                C0602xo c0602xo = new C0602xo();
                wD wDVar2 = wD.MenuHostHelper$$ExternalSyntheticLambda1;
                wD.MenuHostHelper$$ExternalSyntheticLambda1(c0610xu, c0602xo);
                C0610xu MenuHostHelper$$ExternalSyntheticLambda0 = c0602xo.MenuHostHelper$$ExternalSyntheticLambda0(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0);
                MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(), 127, 128);
                C0602xo c0602xo2 = this.setLayoutAnimation;
                pN.setY(MenuHostHelper$$ExternalSyntheticLambda0, "");
                MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(c0602xo2, 0, MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0());
                return;
            }
        }
        MenuHostHelper$$ExternalSyntheticLambda1(c0610xu.MenuHostHelper$$ExternalSyntheticLambda0(), 127, 0);
        C0602xo c0602xo3 = this.setLayoutAnimation;
        pN.setY(c0610xu, "");
        c0610xu.MenuHostHelper$$ExternalSyntheticLambda0(c0602xo3, 0, c0610xu.MenuHostHelper$$ExternalSyntheticLambda0());
    }
}