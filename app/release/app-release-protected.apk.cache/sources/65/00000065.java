package androidx.lifecycle;

import o.AbstractC0368pb;
import o.InterfaceC0389pw;
import o.nR;
import o.nX;
import o.oJ;
import o.oK;
import o.rU;

/* loaded from: classes.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$2$MenuHostHelper$$ExternalSyntheticLambda0 extends AbstractC0368pb implements InterfaceC0389pw<rU, oK<? super nX>, Object> {
    private /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0;
    private int MenuHostHelper$$ExternalSyntheticLambda1;
    final /* synthetic */ InterfaceC0389pw<rU, oK<? super nX>, Object> setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$2$MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0389pw<? super rU, ? super oK<? super nX>, ? extends Object> interfaceC0389pw, oK<? super RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$2$MenuHostHelper$$ExternalSyntheticLambda0> oKVar) {
        super(2, oKVar);
        this.setX = interfaceC0389pw;
    }

    @Override // o.oR
    public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<?> oKVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$2$MenuHostHelper$$ExternalSyntheticLambda0 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$2$MenuHostHelper$$ExternalSyntheticLambda0 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$2$MenuHostHelper$$ExternalSyntheticLambda0(this.setX, oKVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$2$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$2$MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.InterfaceC0389pw
    public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(rU rUVar, oK<? super nX> oKVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$2$MenuHostHelper$$ExternalSyntheticLambda0 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$2$MenuHostHelper$$ExternalSyntheticLambda0 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$2$MenuHostHelper$$ExternalSyntheticLambda0(this.setX, oKVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$2$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 = rUVar;
        return repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$2$MenuHostHelper$$ExternalSyntheticLambda0.setY(nX.setX);
    }

    @Override // o.oR
    public final Object setY(Object obj) {
        oJ oJVar = oJ.COROUTINE_SUSPENDED;
        int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (obj instanceof nR.setX) {
                throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
            }
        } else if (!(obj instanceof nR.setX)) {
            InterfaceC0389pw<rU, oK<? super nX>, Object> interfaceC0389pw = this.setX;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = 1;
            if (interfaceC0389pw.MenuHostHelper$$ExternalSyntheticLambda0((rU) this.MenuHostHelper$$ExternalSyntheticLambda0, this) == oJVar) {
                return oJVar;
            }
        } else {
            throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
        }
        return nX.setX;
    }
}