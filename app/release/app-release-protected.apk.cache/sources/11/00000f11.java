package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setRotationY implements setFillColor {
    final setDrawingCacheQuality MenuHostHelper$$ExternalSyntheticLambda0;
    final Object[] MenuHostHelper$$ExternalSyntheticLambda1;
    final String setIconTintList;
    final int setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setRotationY(setDrawingCacheQuality setdrawingcachequality, String str, Object[] objArr) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setdrawingcachequality;
        this.setIconTintList = str;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.setY = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            char charAt2 = str.charAt(i2);
            if (charAt2 < 55296) {
                this.setY = i | (charAt2 << i3);
                return;
            }
            i |= (charAt2 & 8191) << i3;
            i3 += 13;
            i2++;
        }
    }

    @Override // o.setFillColor
    public final setDrawingCacheQuality MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.setFillColor
    public final setEms setX() {
        return (this.setY & 1) == 1 ? setEms.PROTO2 : setEms.PROTO3;
    }

    @Override // o.setFillColor
    public final boolean setY() {
        return (this.setY & 2) == 2;
    }
}