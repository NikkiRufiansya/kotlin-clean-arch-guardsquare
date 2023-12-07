package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class tG$MenuHostHelper$$ExternalSyntheticLambda0 extends oX {
    Object MenuHostHelper$$ExternalSyntheticLambda0;
    Object MenuHostHelper$$ExternalSyntheticLambda1;
    Object setIconTintList;
    private /* synthetic */ tG<T> setNavigationOnClickListener;
    /* synthetic */ Object setOnLongClickListener;
    int setUnboundedRipple;
    Object setX;
    Object setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tG$MenuHostHelper$$ExternalSyntheticLambda0(tG<T> tGVar, oK<? super tG$MenuHostHelper$$ExternalSyntheticLambda0> oKVar) {
        super(oKVar);
        this.setNavigationOnClickListener = tGVar;
    }

    @Override // o.oR
    public final Object setY(Object obj) {
        this.setOnLongClickListener = obj;
        this.setUnboundedRipple |= Integer.MIN_VALUE;
        return this.setNavigationOnClickListener.setIconTintList(null, this);
    }
}