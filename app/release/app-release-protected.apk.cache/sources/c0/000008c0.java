package o;

import o.nR;

/* renamed from: o.rj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0430rj<T> extends sK implements oK<T>, rU {
    private final oM setY;

    public AbstractC0430rj(oM oMVar, boolean z) {
        super(z);
        setIconTintList((sB) oMVar.get(sB.MenuHostHelper$$ExternalSyntheticLambda1));
        this.setY = oMVar.plus(this);
    }

    @Override // o.oK
    public final oM setX() {
        return this.setY;
    }

    @Override // o.rU
    public final oM setIconTintList() {
        return this.setY;
    }

    @Override // o.sK, o.sB
    public final boolean setNavigationOnClickListener() {
        return super.setNavigationOnClickListener();
    }

    @Override // o.sK
    protected final String MenuHostHelper$$ExternalSyntheticLambda0() {
        String simpleName;
        StringBuilder sb = new StringBuilder();
        simpleName = getClass().getSimpleName();
        sb.append(simpleName);
        sb.append(" was cancelled");
        return sb.toString();
    }

    @Override // o.sK
    protected final void setY(Object obj) {
        if (obj instanceof rD) {
            rD rDVar = (rD) obj;
            Throwable th = rDVar.MenuHostHelper$$ExternalSyntheticLambda1;
            int i = rDVar._handled;
        }
    }

    protected void MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        setIconTintList(obj);
    }

    @Override // o.sK
    public final void setX(Throwable th) {
        rP.setIconTintList(this.setY, th);
    }

    @Override // o.sK
    public final String setUiOptions() {
        rR rRVar;
        oM oMVar = this.setY;
        String str = null;
        if (rX.setX() && (rRVar = (rR) oMVar.get(rR.setY)) != null) {
            rV rVVar = (rV) oMVar.get(rV.setX);
            if (rVVar != null) {
                String str2 = rVVar.setY;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("coroutine");
            sb.append('#');
            sb.append(rRVar.MenuHostHelper$$ExternalSyntheticLambda1);
            str = sb.toString();
        }
        if (str == null) {
            return super.setUiOptions();
        }
        StringBuilder sb2 = new StringBuilder("\"");
        sb2.append(str);
        sb2.append("\":");
        sb2.append(super.setUiOptions());
        return sb2.toString();
    }

    public final <R> void setX(rW rWVar, R r, InterfaceC0389pw<? super R, ? super oK<? super T>, ? extends Object> interfaceC0389pw) {
        AbstractC0430rj<T> abstractC0430rj = this;
        int i = rW$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1[rWVar.ordinal()];
        if (i == 1) {
            uH.setX(interfaceC0389pw, r, abstractC0430rj, null);
        } else if (i == 2) {
            pN.setY(interfaceC0389pw, "");
            pN.setY(abstractC0430rj, "");
            oK y = oP.setY(oP.MenuHostHelper$$ExternalSyntheticLambda0(interfaceC0389pw, r, abstractC0430rj));
            nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
            y.MenuHostHelper$$ExternalSyntheticLambda0(nR.setX(nX.setX));
        } else if (i != 3) {
            if (i != 4) {
                throw new nU();
            }
        } else {
            pN.setY(abstractC0430rj, "");
            try {
                oM x = abstractC0430rj.setX();
                Object MenuHostHelper$$ExternalSyntheticLambda0 = uD.MenuHostHelper$$ExternalSyntheticLambda0(x, null);
                Object MenuHostHelper$$ExternalSyntheticLambda02 = ((InterfaceC0389pw) pZ.setIconTintList(interfaceC0389pw, 2)).MenuHostHelper$$ExternalSyntheticLambda0(r, abstractC0430rj);
                uD.setX(x, MenuHostHelper$$ExternalSyntheticLambda0);
                if (MenuHostHelper$$ExternalSyntheticLambda02 != oJ.COROUTINE_SUSPENDED) {
                    nR.setIconTintList seticontintlist2 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                    abstractC0430rj.MenuHostHelper$$ExternalSyntheticLambda0(nR.setX(MenuHostHelper$$ExternalSyntheticLambda02));
                }
            } catch (Throwable th) {
                nR.setIconTintList seticontintlist3 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                pN.setY((Object) th, "");
                abstractC0430rj.MenuHostHelper$$ExternalSyntheticLambda0(nR.setX(new nR.setX(th)));
            }
        }
    }

    @Override // o.oK
    public final void MenuHostHelper$$ExternalSyntheticLambda0(Object obj) {
        Object onLongClickListener = setOnLongClickListener(rJ.MenuHostHelper$$ExternalSyntheticLambda0(obj, (InterfaceC0377pk<? super Throwable, nX>) null));
        if (onLongClickListener == sG.setIconTintList) {
            return;
        }
        MenuHostHelper$$ExternalSyntheticLambda1(onLongClickListener);
    }
}