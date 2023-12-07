package o;

/* loaded from: classes.dex */
public final class iS implements iF {
    final int MenuHostHelper$$ExternalSyntheticLambda0;
    final String MenuHostHelper$$ExternalSyntheticLambda1;
    final iJ setIconTintList;
    final Object[] setY;

    public iS(iJ iJVar, String str, Object[] objArr) {
        this.setIconTintList = iJVar;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
        this.setY = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            char charAt2 = str.charAt(i2);
            if (charAt2 < 55296) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = i | (charAt2 << i3);
                return;
            }
            i |= (charAt2 & 8191) << i3;
            i3 += 13;
            i2++;
        }
    }

    @Override // o.iF
    public final iJ MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setIconTintList;
    }

    @Override // o.iF
    public final iQ MenuHostHelper$$ExternalSyntheticLambda0() {
        return (this.MenuHostHelper$$ExternalSyntheticLambda0 & 1) == 1 ? iQ.PROTO2 : iQ.PROTO3;
    }

    @Override // o.iF
    public final boolean setX() {
        return (this.MenuHostHelper$$ExternalSyntheticLambda0 & 2) == 2;
    }
}