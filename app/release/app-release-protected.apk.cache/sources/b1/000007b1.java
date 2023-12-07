package o;

import java.io.Serializable;
import java.lang.reflect.Method;
import o.nR;
import o.oV;

/* loaded from: classes.dex */
public abstract class oR implements oK<Object>, oW, Serializable {
    private final oK<Object> MenuHostHelper$$ExternalSyntheticLambda0;

    protected void setIconTintList() {
    }

    protected abstract Object setY(Object obj);

    public oR(oK<Object> oKVar) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = oKVar;
    }

    public final oK<Object> MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [o.oK<java.lang.Object>, o.oK, java.lang.Object] */
    @Override // o.oK
    public final void MenuHostHelper$$ExternalSyntheticLambda0(Object obj) {
        Object y;
        oR oRVar = this;
        while (true) {
            pN.setY(oRVar, "");
            oR oRVar2 = oRVar;
            ?? r1 = oRVar2.MenuHostHelper$$ExternalSyntheticLambda0;
            pN.setX((Object) r1);
            try {
                y = oRVar2.setY(obj);
            } catch (Throwable th) {
                nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                pN.setY((Object) th, "");
                obj = nR.setX(new nR.setX(th));
            }
            if (y == oJ.COROUTINE_SUSPENDED) {
                return;
            }
            nR.setIconTintList seticontintlist2 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
            obj = nR.setX(y);
            oRVar2.setIconTintList();
            if (!(r1 instanceof oR)) {
                r1.MenuHostHelper$$ExternalSyntheticLambda0(obj);
                return;
            }
            oRVar = r1;
        }
    }

    public oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<?> oKVar) {
        pN.setY(oKVar, "");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Serializable MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1();
        if (MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            MenuHostHelper$$ExternalSyntheticLambda1 = getClass().getName();
        }
        sb.append(MenuHostHelper$$ExternalSyntheticLambda1);
        return sb.toString();
    }

    @Override // o.oW
    public oW setY() {
        oK<Object> oKVar = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (oKVar instanceof oW) {
            return (oW) oKVar;
        }
        return null;
    }

    @Override // o.oW
    public StackTraceElement MenuHostHelper$$ExternalSyntheticLambda1() {
        String obj;
        pN.setY(this, "");
        oU oUVar = (oU) getClass().getAnnotation(oU.class);
        String str = null;
        if (oUVar == null) {
            return null;
        }
        int MenuHostHelper$$ExternalSyntheticLambda0 = oUVar.MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 <= 1) {
            int MenuHostHelper$$ExternalSyntheticLambda1 = oT.MenuHostHelper$$ExternalSyntheticLambda1(this);
            int i = MenuHostHelper$$ExternalSyntheticLambda1 < 0 ? -1 : oUVar.setIconTintList()[MenuHostHelper$$ExternalSyntheticLambda1];
            oV oVVar = oV.MenuHostHelper$$ExternalSyntheticLambda0;
            pN.setY(this, "");
            oV.setIconTintList seticontintlist = oV.setIconTintList;
            if (seticontintlist == null) {
                seticontintlist = oV.setIconTintList(this);
            }
            if (seticontintlist != oV.setY) {
                Method method = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0;
                Object invoke = method != null ? method.invoke(getClass(), new Object[0]) : null;
                if (invoke != null) {
                    Method method2 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1;
                    Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
                    if (invoke2 != null) {
                        Method method3 = seticontintlist.setIconTintList;
                        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                        if (invoke3 instanceof String) {
                            str = (String) invoke3;
                        }
                    }
                }
            }
            if (str == null) {
                obj = oUVar.setY();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append('/');
                sb.append(oUVar.setY());
                obj = sb.toString();
            }
            return new StackTraceElement(obj, oUVar.MenuHostHelper$$ExternalSyntheticLambda1(), oUVar.setX(), i);
        }
        StringBuilder sb2 = new StringBuilder("Debug metadata version mismatch. Expected: ");
        sb2.append(1);
        sb2.append(", got ");
        sb2.append(MenuHostHelper$$ExternalSyntheticLambda0);
        sb2.append(". Please update the Kotlin standard library.");
        throw new IllegalStateException(sb2.toString().toString());
    }
}