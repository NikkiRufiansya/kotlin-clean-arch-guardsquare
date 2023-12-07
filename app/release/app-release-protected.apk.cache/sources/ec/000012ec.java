package o;

/* loaded from: classes.dex */
public final class xE {
    public final byte[] MenuHostHelper$$ExternalSyntheticLambda0;
    public int MenuHostHelper$$ExternalSyntheticLambda1;
    public int setIconTintList;
    public xE setUiOptions;
    public boolean setUnboundedRipple;
    public boolean setX;
    public xE setY;

    static {
        new setY((byte) 0);
    }

    public xE() {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new byte[8192];
        this.setX = true;
        this.setUnboundedRipple = false;
    }

    public xE(byte[] bArr, int i, int i2, boolean z) {
        pN.setY(bArr, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = bArr;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        this.setIconTintList = i2;
        this.setUnboundedRipple = z;
        this.setX = false;
    }

    public final xE MenuHostHelper$$ExternalSyntheticLambda0() {
        xE xEVar = this.setY;
        if (xEVar == this) {
            xEVar = null;
        }
        xE xEVar2 = this.setUiOptions;
        pN.setX(xEVar2);
        xEVar2.setY = this.setY;
        xE xEVar3 = this.setY;
        pN.setX(xEVar3);
        xEVar3.setUiOptions = this.setUiOptions;
        this.setY = null;
        this.setUiOptions = null;
        return xEVar;
    }

    public final xE setY(xE xEVar) {
        pN.setY(xEVar, "");
        xEVar.setUiOptions = this;
        xEVar.setY = this.setY;
        xE xEVar2 = this.setY;
        pN.setX(xEVar2);
        xEVar2.setUiOptions = xEVar;
        this.setY = xEVar;
        return xEVar;
    }

    public final xE setY(int i) {
        xE xEVar;
        if (!(i > 0 && i <= this.setIconTintList - this.MenuHostHelper$$ExternalSyntheticLambda1)) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i < 1024) {
            xE iconTintList = xC.setIconTintList();
            byte[] bArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            byte[] bArr2 = iconTintList.MenuHostHelper$$ExternalSyntheticLambda0;
            int i2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            pN.setY(bArr, "");
            pN.setY(bArr2, "");
            System.arraycopy(bArr, i2, bArr2, 0, (i2 + i) - i2);
            xEVar = iconTintList;
        } else {
            this.setUnboundedRipple = true;
            xEVar = new xE(this.MenuHostHelper$$ExternalSyntheticLambda0, this.MenuHostHelper$$ExternalSyntheticLambda1, this.setIconTintList, true);
        }
        xEVar.setIconTintList = xEVar.MenuHostHelper$$ExternalSyntheticLambda1 + i;
        this.MenuHostHelper$$ExternalSyntheticLambda1 += i;
        xE xEVar2 = this.setUiOptions;
        pN.setX(xEVar2);
        xEVar2.setY(xEVar);
        return xEVar;
    }

    public final void setY() {
        xE xEVar = this.setUiOptions;
        int i = 0;
        if (!(xEVar != this)) {
            throw new IllegalStateException("cannot compact".toString());
        }
        pN.setX(xEVar);
        if (xEVar.setX) {
            int i2 = this.setIconTintList - this.MenuHostHelper$$ExternalSyntheticLambda1;
            xE xEVar2 = this.setUiOptions;
            pN.setX(xEVar2);
            int i3 = xEVar2.setIconTintList;
            xE xEVar3 = this.setUiOptions;
            pN.setX(xEVar3);
            if (!xEVar3.setUnboundedRipple) {
                xE xEVar4 = this.setUiOptions;
                pN.setX(xEVar4);
                i = xEVar4.MenuHostHelper$$ExternalSyntheticLambda1;
            }
            if (i2 > (8192 - i3) + i) {
                return;
            }
            xE xEVar5 = this.setUiOptions;
            pN.setX(xEVar5);
            MenuHostHelper$$ExternalSyntheticLambda0(xEVar5, i2);
            MenuHostHelper$$ExternalSyntheticLambda0();
            xC.setIconTintList(this);
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(xE xEVar, int i) {
        pN.setY(xEVar, "");
        if (!xEVar.setX) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i2 = xEVar.setIconTintList;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (xEVar.setUnboundedRipple) {
                throw new IllegalArgumentException();
            }
            int i4 = xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = xEVar.MenuHostHelper$$ExternalSyntheticLambda0;
            pN.setY(bArr, "");
            pN.setY(bArr, "");
            System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
            xEVar.setIconTintList -= xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
            xEVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        }
        byte[] bArr2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        byte[] bArr3 = xEVar.MenuHostHelper$$ExternalSyntheticLambda0;
        int i5 = xEVar.setIconTintList;
        int i6 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        pN.setY(bArr2, "");
        pN.setY(bArr3, "");
        System.arraycopy(bArr2, i6, bArr3, i5, (i6 + i) - i6);
        xEVar.setIconTintList += i;
        this.MenuHostHelper$$ExternalSyntheticLambda1 += i;
    }

    /* loaded from: classes.dex */
    public static final class setY {
        private setY() {
        }

        public /* synthetic */ setY(byte b) {
            this();
        }
    }
}