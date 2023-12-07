package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class gp$MenuHostHelper$$ExternalSyntheticLambda1 extends oX {
    Object MenuHostHelper$$ExternalSyntheticLambda0;
    Object MenuHostHelper$$ExternalSyntheticLambda1;
    int setIconTintList;
    private /* synthetic */ C0190gp setOnLongClickListener;
    Object setX;
    /* synthetic */ Object setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gp$MenuHostHelper$$ExternalSyntheticLambda1(C0190gp c0190gp, oK<? super gp$MenuHostHelper$$ExternalSyntheticLambda1> oKVar) {
        super(oKVar);
        this.setOnLongClickListener = c0190gp;
    }

    @Override // o.oR
    public final Object setY(Object obj) {
        this.setY = obj;
        this.setIconTintList |= Integer.MIN_VALUE;
        return this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1(null, this);
    }
}