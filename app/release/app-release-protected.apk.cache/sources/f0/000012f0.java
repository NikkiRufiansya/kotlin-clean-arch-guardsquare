package o;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class xH extends C0610xu {
    public final transient byte[][] setLayoutAnimation;
    public final transient int[] setNavigationOnClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xH(byte[][] bArr, int[] iArr) {
        super(C0610xu.setY.setIconTintList);
        pN.setY(bArr, "");
        pN.setY(iArr, "");
        this.setLayoutAnimation = bArr;
        this.setNavigationOnClickListener = iArr;
    }

    @Override // o.C0610xu
    public final C0610xu MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        pN.setY(str, "");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = this.setLayoutAnimation.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.setNavigationOnClickListener;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(this.setLayoutAnimation[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) digest, "");
        return new C0610xu(digest);
    }

    @Override // o.C0610xu
    public final byte[] setX() {
        return setOnLongClickListener();
    }

    @Override // o.C0610xu
    public final void MenuHostHelper$$ExternalSyntheticLambda0(C0602xo c0602xo, int i, int i2) {
        pN.setY(c0602xo, "");
        int iconTintList = xO.setIconTintList(this, 0);
        while (i < i2) {
            int i3 = iconTintList == 0 ? 0 : this.setNavigationOnClickListener[iconTintList - 1];
            int[] iArr = this.setNavigationOnClickListener;
            int i4 = iArr[iconTintList];
            int i5 = iArr[this.setLayoutAnimation.length + iconTintList];
            int min = Math.min(i2, (i4 - i3) + i3) - i;
            int i6 = i5 + (i - i3);
            xE xEVar = new xE(this.setLayoutAnimation[iconTintList], i6, i6 + min, true);
            if (c0602xo.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                xEVar.setUiOptions = xEVar;
                xEVar.setY = xEVar.setUiOptions;
                c0602xo.MenuHostHelper$$ExternalSyntheticLambda1 = xEVar.setY;
            } else {
                xE xEVar2 = c0602xo.MenuHostHelper$$ExternalSyntheticLambda1;
                pN.setX(xEVar2);
                xE xEVar3 = xEVar2.setUiOptions;
                pN.setX(xEVar3);
                xEVar3.setY(xEVar);
            }
            i += min;
            iconTintList++;
        }
        c0602xo.MenuHostHelper$$ExternalSyntheticLambda0 += MenuHostHelper$$ExternalSyntheticLambda0();
    }

    @Override // o.C0610xu
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C0610xu)) {
                return false;
            }
            C0610xu c0610xu = (C0610xu) obj;
            if (c0610xu.MenuHostHelper$$ExternalSyntheticLambda0() != MenuHostHelper$$ExternalSyntheticLambda0() || !setX(0, c0610xu, MenuHostHelper$$ExternalSyntheticLambda0())) {
                return false;
            }
        }
        return true;
    }

    @Override // o.C0610xu
    public final int hashCode() {
        int y = setY();
        if (y == 0) {
            int length = this.setLayoutAnimation.length;
            int i = 0;
            int i2 = 1;
            int i3 = 0;
            while (i < length) {
                int[] iArr = this.setNavigationOnClickListener;
                int i4 = iArr[length + i];
                int i5 = iArr[i];
                byte[] bArr = this.setLayoutAnimation[i];
                for (int i6 = i4; i6 < (i5 - i3) + i4; i6++) {
                    i2 = (i2 * 31) + bArr[i6];
                }
                i++;
                i3 = i5;
            }
            setIconTintList(i2);
            return i2;
        }
        return y;
    }

    private final Object writeReplace() {
        return new C0610xu(setOnLongClickListener());
    }

    @Override // o.C0610xu
    public final String MenuHostHelper$$ExternalSyntheticLambda1() {
        return new C0610xu(setOnLongClickListener()).MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // o.C0610xu
    public final int MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setNavigationOnClickListener[this.setLayoutAnimation.length - 1];
    }

    @Override // o.C0610xu
    public final String setIconTintList() {
        return new C0610xu(setOnLongClickListener()).setIconTintList();
    }

    @Override // o.C0610xu
    public final byte setY(int i) {
        C0601xn.setIconTintList(this.setNavigationOnClickListener[this.setLayoutAnimation.length - 1], i, 1L);
        int iconTintList = xO.setIconTintList(this, i);
        int i2 = iconTintList == 0 ? 0 : this.setNavigationOnClickListener[iconTintList - 1];
        int[] iArr = this.setNavigationOnClickListener;
        byte[][] bArr = this.setLayoutAnimation;
        return bArr[iconTintList][(i - i2) + iArr[bArr.length + iconTintList]];
    }

    @Override // o.C0610xu
    public final boolean setX(int i, C0610xu c0610xu, int i2) {
        pN.setY(c0610xu, "");
        if (MenuHostHelper$$ExternalSyntheticLambda0() - i2 < 0) {
            return false;
        }
        int iconTintList = xO.setIconTintList(this, 0);
        int i3 = 0;
        while (i < i2) {
            int i4 = iconTintList == 0 ? 0 : this.setNavigationOnClickListener[iconTintList - 1];
            int[] iArr = this.setNavigationOnClickListener;
            int i5 = iArr[iconTintList];
            int i6 = iArr[this.setLayoutAnimation.length + iconTintList];
            int min = Math.min(i2, (i5 - i4) + i4) - i;
            if (!c0610xu.MenuHostHelper$$ExternalSyntheticLambda1(i3, this.setLayoutAnimation[iconTintList], i6 + (i - i4), min)) {
                return false;
            }
            i3 += min;
            i += min;
            iconTintList++;
        }
        return true;
    }

    @Override // o.C0610xu
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(int i, byte[] bArr, int i2, int i3) {
        pN.setY(bArr, "");
        if (i < 0 || i > MenuHostHelper$$ExternalSyntheticLambda0() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iconTintList = xO.setIconTintList(this, i);
        while (i < i4) {
            int i5 = iconTintList == 0 ? 0 : this.setNavigationOnClickListener[iconTintList - 1];
            int[] iArr = this.setNavigationOnClickListener;
            int i6 = iArr[iconTintList];
            int i7 = iArr[this.setLayoutAnimation.length + iconTintList];
            int min = Math.min(i4, (i6 - i5) + i5) - i;
            if (!C0601xn.setIconTintList(this.setLayoutAnimation[iconTintList], i7 + (i - i5), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            iconTintList++;
        }
        return true;
    }

    @Override // o.C0610xu
    public final C0610xu setUiOptions() {
        return new C0610xu(setOnLongClickListener()).setUiOptions();
    }

    @Override // o.C0610xu
    public final byte[] setOnLongClickListener() {
        byte[] bArr = new byte[MenuHostHelper$$ExternalSyntheticLambda0()];
        int length = this.setLayoutAnimation.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.setNavigationOnClickListener;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            byte[] bArr2 = this.setLayoutAnimation[i];
            int i6 = i5 - i2;
            pN.setY(bArr2, "");
            pN.setY(bArr, "");
            System.arraycopy(bArr2, i4, bArr, i3, (i4 + i6) - i4);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // o.C0610xu
    public final String toString() {
        return new C0610xu(setOnLongClickListener()).toString();
    }
}