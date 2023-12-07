package o;

import java.util.List;
import o.C0497tw;
import o.lB;
import o.mA;
import o.nR;

/* loaded from: classes.dex */
final class ms$MenuHostHelper$$ExternalSyntheticLambda0 extends AbstractC0368pb implements InterfaceC0389pw<rU, oK<? super nX>, Object> {
    private int MenuHostHelper$$ExternalSyntheticLambda0;
    private /* synthetic */ String setIconTintList;
    private /* synthetic */ C0304ms setX;
    private /* synthetic */ String setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms$MenuHostHelper$$ExternalSyntheticLambda0(C0304ms c0304ms, String str, String str2, oK<? super ms$MenuHostHelper$$ExternalSyntheticLambda0> oKVar) {
        super(2, oKVar);
        this.setX = c0304ms;
        this.setIconTintList = str;
        this.setY = str2;
    }

    @Override // o.oR
    public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<?> oKVar) {
        return new ms$MenuHostHelper$$ExternalSyntheticLambda0(this.setX, this.setIconTintList, this.setY, oKVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.ms$MenuHostHelper$$ExternalSyntheticLambda0$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC0368pb implements pB<InterfaceC0498tx<? super C0622yf<kT>>, Throwable, oK<? super nX>, Object> {
        private /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0;
        private int setIconTintList;
        private /* synthetic */ C0304ms setY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C0304ms c0304ms, oK<? super AnonymousClass1> oKVar) {
            super(3, oKVar);
            this.setY = c0304ms;
        }

        @Override // o.pB
        public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0498tx<? super C0622yf<kT>> interfaceC0498tx, Throwable th, oK<? super nX> oKVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.setY, oKVar);
            anonymousClass1.MenuHostHelper$$ExternalSyntheticLambda0 = th;
            return anonymousClass1.setY(nX.setX);
        }

        @Override // o.oR
        public final Object setY(Object obj) {
            oJ oJVar = oJ.COROUTINE_SUSPENDED;
            if (obj instanceof nR.setX) {
                throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
            }
            tC<mA> tCVar = this.setY.setX;
            String message = ((Throwable) this.MenuHostHelper$$ExternalSyntheticLambda0).getMessage();
            if (message == null) {
                message = "";
            }
            tCVar.MenuHostHelper$$ExternalSyntheticLambda1(new mA$MenuHostHelper$$ExternalSyntheticLambda1(message));
            return nX.setX;
        }
    }

    @Override // o.InterfaceC0389pw
    public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(rU rUVar, oK<? super nX> oKVar) {
        return new ms$MenuHostHelper$$ExternalSyntheticLambda0(this.setX, this.setIconTintList, this.setY, oKVar).setY(nX.setX);
    }

    @Override // o.oR
    public final Object setY(Object obj) {
        oJ oJVar = oJ.COROUTINE_SUSPENDED;
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (obj instanceof nR.setX) {
                    throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
                }
                return nX.setX;
            } else if (obj instanceof nR.setX) {
                throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
            }
        } else if (obj instanceof nR.setX) {
            throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
        } else {
            lB lBVar = this.setX.MenuHostHelper$$ExternalSyntheticLambda0;
            String str = this.setIconTintList;
            String str2 = this.setY;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = 1;
            obj = new C0500tz(new lB.setIconTintList(str2, lBVar, str, null));
        }
        final C0304ms c0304ms = this.setX;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = 2;
        if (new C0497tw.setIconTintList((InterfaceC0492tr) obj, new AnonymousClass1(this.setX, null)).setIconTintList(new InterfaceC0498tx() { // from class: o.ms$MenuHostHelper$$ExternalSyntheticLambda0.2
            @Override // o.InterfaceC0498tx
            public final /* synthetic */ Object setIconTintList(Object obj2, oK oKVar) {
                C0622yf c0622yf = (C0622yf) obj2;
                int i2 = c0622yf.setX.MenuHostHelper$$ExternalSyntheticLambda0;
                if (200 <= i2 && 299 >= i2) {
                    tC<mA> tCVar = C0304ms.this.setX;
                    kT kTVar = (kT) c0622yf.setY;
                    List<kP> list = kTVar != null ? kTVar.data : null;
                    pN.setX(list);
                    tCVar.MenuHostHelper$$ExternalSyntheticLambda1(new mA.setY(list));
                } else {
                    tC<mA> tCVar2 = C0304ms.this.setX;
                    String str3 = c0622yf.setX.setUiOptions;
                    if (str3 == null) {
                        str3 = "";
                    }
                    tCVar2.MenuHostHelper$$ExternalSyntheticLambda1(new mA$MenuHostHelper$$ExternalSyntheticLambda1(str3));
                }
                return nX.setX;
            }
        }, this) == oJVar) {
            return oJVar;
        }
        return nX.setX;
    }
}