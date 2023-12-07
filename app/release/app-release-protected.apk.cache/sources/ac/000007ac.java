package o;

import o.nR;

/* loaded from: classes.dex */
public class oO {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> oK<T> setY(oK<? super T> oKVar) {
        oK<T> oKVar2;
        pN.setY(oKVar, "");
        oX oXVar = oKVar instanceof oX ? (oX) oKVar : null;
        return (oXVar == null || (oKVar2 = (oK<T>) oXVar.setUiOptions()) == null) ? oKVar : oKVar2;
    }

    /* loaded from: classes.dex */
    public static final class setX extends oX {
        private /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0;
        private int MenuHostHelper$$ExternalSyntheticLambda1;
        private /* synthetic */ InterfaceC0389pw setX;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setX(oK oKVar, oM oMVar, InterfaceC0389pw interfaceC0389pw, Object obj) {
            super(oKVar, oMVar);
            this.setX = interfaceC0389pw;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = obj;
            pN.setX(oKVar);
        }

        @Override // o.oR
        public final Object setY(Object obj) {
            int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (i != 0) {
                if (i == 1) {
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = 2;
                    if (obj instanceof nR.setX) {
                        throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
                    }
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1 = 1;
            if (!(obj instanceof nR.setX)) {
                pN.setX(this.setX);
                return ((InterfaceC0389pw) pZ.setIconTintList(this.setX, 2)).MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0, this);
            }
            throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
        }
    }

    public static final <R, T> oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(final InterfaceC0389pw<? super R, ? super oK<? super T>, ? extends Object> interfaceC0389pw, final R r, final oK<? super T> oKVar) {
        pN.setY(interfaceC0389pw, "");
        pN.setY(oKVar, "");
        pN.setY(oKVar, "");
        if (interfaceC0389pw instanceof oR) {
            return ((oR) interfaceC0389pw).MenuHostHelper$$ExternalSyntheticLambda0(r, oKVar);
        }
        oM x = oKVar.setX();
        if (x == oL.setX) {
            return new oZ(oKVar, interfaceC0389pw, r) { // from class: o.oO$MenuHostHelper$$ExternalSyntheticLambda0
                private int MenuHostHelper$$ExternalSyntheticLambda0;
                private /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda1;
                private /* synthetic */ InterfaceC0389pw setX;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(oKVar);
                    this.setX = interfaceC0389pw;
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = r;
                    pN.setX(oKVar);
                }

                @Override // o.oR
                public final Object setY(Object obj) {
                    int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (i != 0) {
                        if (i == 1) {
                            this.MenuHostHelper$$ExternalSyntheticLambda0 = 2;
                            if (obj instanceof nR.setX) {
                                throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
                            }
                            return obj;
                        }
                        throw new IllegalStateException("This coroutine had already completed".toString());
                    }
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = 1;
                    if (!(obj instanceof nR.setX)) {
                        pN.setX(this.setX);
                        return ((InterfaceC0389pw) pZ.setIconTintList(this.setX, 2)).MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1, this);
                    }
                    throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
                }
            };
        }
        return new setX(oKVar, x, interfaceC0389pw, r);
    }
}