package o;

import o.nR;

/* loaded from: classes.dex */
public final class getKey implements setSecondaryProgressTintBlendMode<setCropToPadding> {
    private final setSecondaryProgressTintBlendMode<setCropToPadding> MenuHostHelper$$ExternalSyntheticLambda0;

    @Override // o.setSecondaryProgressTintBlendMode
    public final InterfaceC0492tr<setCropToPadding> MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    public getKey(setSecondaryProgressTintBlendMode<setCropToPadding> setsecondaryprogresstintblendmode) {
        pN.setY(setsecondaryprogresstintblendmode, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setsecondaryprogresstintblendmode;
    }

    @Override // o.setSecondaryProgressTintBlendMode
    public final Object MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0389pw<? super setCropToPadding, ? super oK<? super setCropToPadding>, ? extends Object> interfaceC0389pw, oK<? super setCropToPadding> oKVar) {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(new setY(interfaceC0389pw, null), oKVar);
    }

    /* loaded from: classes.dex */
    static final class setY extends AbstractC0368pb implements InterfaceC0389pw<setCropToPadding, oK<? super setCropToPadding>, Object> {
        private int MenuHostHelper$$ExternalSyntheticLambda0;
        final /* synthetic */ InterfaceC0389pw<setCropToPadding, oK<? super setCropToPadding>, Object> setX;
        private /* synthetic */ Object setY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        setY(InterfaceC0389pw<? super setCropToPadding, ? super oK<? super setCropToPadding>, ? extends Object> interfaceC0389pw, oK<? super setY> oKVar) {
            super(2, oKVar);
            this.setX = interfaceC0389pw;
        }

        @Override // o.oR
        public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<?> oKVar) {
            setY sety = new setY(this.setX, oKVar);
            sety.setY = obj;
            return sety;
        }

        @Override // o.InterfaceC0389pw
        public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(setCropToPadding setcroptopadding, oK<? super setCropToPadding> oKVar) {
            setY sety = new setY(this.setX, oKVar);
            sety.setY = setcroptopadding;
            return sety.setY(nX.setX);
        }

        @Override // o.oR
        public final Object setY(Object obj) {
            oJ oJVar = oJ.COROUTINE_SUSPENDED;
            int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (obj instanceof nR.setX) {
                    throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
                }
            } else if (!(obj instanceof nR.setX)) {
                InterfaceC0389pw<setCropToPadding, oK<? super setCropToPadding>, Object> interfaceC0389pw = this.setX;
                this.MenuHostHelper$$ExternalSyntheticLambda0 = 1;
                obj = interfaceC0389pw.MenuHostHelper$$ExternalSyntheticLambda0((setCropToPadding) this.setY, this);
                if (obj == oJVar) {
                    return oJVar;
                }
            } else {
                throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
            }
            setCropToPadding setcroptopadding = (setCropToPadding) obj;
            ((setRepeatMode) setcroptopadding).setIconTintList.set(true);
            return setcroptopadding;
        }
    }
}