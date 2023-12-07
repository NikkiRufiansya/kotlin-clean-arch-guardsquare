package o;

import o.cE;

/* loaded from: classes.dex */
final class cF$MenuHostHelper$$ExternalSyntheticLambda1 extends cE$MenuHostHelper$$ExternalSyntheticLambda1 {
    private String MenuHostHelper$$ExternalSyntheticLambda0;
    private cE.setY setIconTintList;
    Long setX;

    @Override // o.cE$MenuHostHelper$$ExternalSyntheticLambda1
    public final cE$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = str;
        return this;
    }

    @Override // o.cE$MenuHostHelper$$ExternalSyntheticLambda1
    public final cE$MenuHostHelper$$ExternalSyntheticLambda1 setY(long j) {
        this.setX = Long.valueOf(j);
        return this;
    }

    @Override // o.cE$MenuHostHelper$$ExternalSyntheticLambda1
    public final cE$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1(cE.setY sety) {
        this.setIconTintList = sety;
        return this;
    }

    @Override // o.cE$MenuHostHelper$$ExternalSyntheticLambda1
    public final cE setX() {
        String str = this.setX == null ? " tokenExpirationTimestamp" : "";
        if (!str.isEmpty()) {
            StringBuilder sb = new StringBuilder("Missing required properties:");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
        return new cF(this.MenuHostHelper$$ExternalSyntheticLambda0, this.setX.longValue(), this.setIconTintList, (byte) 0);
    }
}