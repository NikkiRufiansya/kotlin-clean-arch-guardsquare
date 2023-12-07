package o;

import o.tT;

/* loaded from: classes.dex */
public final class tV<T> extends oX implements InterfaceC0498tx<T> {
    public final oM MenuHostHelper$$ExternalSyntheticLambda0;
    private oK<? super nX> MenuHostHelper$$ExternalSyntheticLambda1;
    private oM setIconTintList;
    private int setX;
    private InterfaceC0498tx<T> setY;

    @Override // o.oR, o.oW
    public final StackTraceElement MenuHostHelper$$ExternalSyntheticLambda1() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tV(InterfaceC0498tx<? super T> interfaceC0498tx, oM oMVar) {
        super(tO.setIconTintList, oL.setX);
        this.setY = interfaceC0498tx;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = oMVar;
        this.setX = ((Number) oMVar.fold(0, setIconTintList.setIconTintList)).intValue();
    }

    @Override // o.oR, o.oW
    public final oW setY() {
        oK<? super nX> oKVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (oKVar instanceof oW) {
            return (oW) oKVar;
        }
        return null;
    }

    /* loaded from: classes.dex */
    static final class setIconTintList extends pO implements InterfaceC0389pw<Integer, oM$MenuHostHelper$$ExternalSyntheticLambda1, Integer> {
        public static final setIconTintList setIconTintList = new setIconTintList();

        setIconTintList() {
            super(2);
        }

        @Override // o.InterfaceC0389pw
        public final /* synthetic */ Integer MenuHostHelper$$ExternalSyntheticLambda0(Integer num, oM$MenuHostHelper$$ExternalSyntheticLambda1 om_menuhosthelper__externalsyntheticlambda1) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    @Override // o.oX, o.oK
    public final oM setX() {
        oM oMVar = this.setIconTintList;
        return oMVar == null ? oL.setX : oMVar;
    }

    @Override // o.oR
    public final Object setY(Object obj) {
        Throwable iconTintList = nR.setIconTintList(obj);
        if (iconTintList != null) {
            oL oLVar = this.setIconTintList;
            if (oLVar == null) {
                oLVar = oL.setX;
            }
            this.setIconTintList = new tQ(iconTintList, oLVar);
        }
        oK<? super nX> oKVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (oKVar != null) {
            oKVar.MenuHostHelper$$ExternalSyntheticLambda0(obj);
        }
        return oJ.COROUTINE_SUSPENDED;
    }

    @Override // o.oX, o.oR
    public final void setIconTintList() {
        super.setIconTintList();
    }

    @Override // o.InterfaceC0498tx
    public final Object setIconTintList(T t, oK<? super nX> oKVar) {
        pB pBVar;
        try {
            oM x = oKVar.setX();
            sB sBVar = (sB) x.get(sB.MenuHostHelper$$ExternalSyntheticLambda1);
            if (sBVar != null && !sBVar.setNavigationOnClickListener()) {
                throw sBVar.setLayoutAnimation();
            }
            oM oMVar = this.setIconTintList;
            if (oMVar != x) {
                if (oMVar instanceof tQ) {
                    StringBuilder sb = new StringBuilder("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                    sb.append(((tQ) oMVar).setX);
                    sb.append(", but then emission attempt of value '");
                    sb.append(t);
                    sb.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                    throw new IllegalStateException(qR.MenuHostHelper$$ExternalSyntheticLambda0(sb.toString()).toString());
                } else if (((Number) x.fold(0, new tT.setIconTintList(this))).intValue() == this.setX) {
                    this.setIconTintList = x;
                } else {
                    StringBuilder sb2 = new StringBuilder("Flow invariant is violated:\n\t\tFlow was collected in ");
                    sb2.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
                    sb2.append(",\n\t\tbut emission happened in ");
                    sb2.append(x);
                    sb2.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                    throw new IllegalStateException(sb2.toString().toString());
                }
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1 = oKVar;
            pBVar = tW.setY;
            Object MenuHostHelper$$ExternalSyntheticLambda0 = pBVar.MenuHostHelper$$ExternalSyntheticLambda0(this.setY, t, this);
            if (!pN.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0, oJ.COROUTINE_SUSPENDED)) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
            }
            if (MenuHostHelper$$ExternalSyntheticLambda0 == oJ.COROUTINE_SUSPENDED) {
                pN.setY(oKVar, "");
            }
            return MenuHostHelper$$ExternalSyntheticLambda0 == oJ.COROUTINE_SUSPENDED ? MenuHostHelper$$ExternalSyntheticLambda0 : nX.setX;
        } catch (Throwable th) {
            this.setIconTintList = new tQ(th, oKVar.setX());
            throw th;
        }
    }
}