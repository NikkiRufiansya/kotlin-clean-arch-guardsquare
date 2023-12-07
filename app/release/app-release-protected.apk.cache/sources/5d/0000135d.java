package o;

import java.lang.reflect.Method;
import o.nR;

/* renamed from: o.yc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0619yc {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.yc$setLayoutAnimation */
    /* loaded from: classes.dex */
    public static final class setLayoutAnimation extends oX {
        Object MenuHostHelper$$ExternalSyntheticLambda0;
        /* synthetic */ Object setIconTintList;
        int setX;

        setLayoutAnimation(oK oKVar) {
            super(oKVar);
        }

        @Override // o.oR
        public final Object setY(Object obj) {
            this.setIconTintList = obj;
            this.setX |= Integer.MIN_VALUE;
            return C0619yc.setX(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.yc$setIconTintList */
    /* loaded from: classes.dex */
    public static final class setIconTintList<T> implements xR<T> {
        private /* synthetic */ InterfaceC0441ru MenuHostHelper$$ExternalSyntheticLambda1;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setIconTintList(InterfaceC0441ru interfaceC0441ru) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = interfaceC0441ru;
        }

        @Override // o.xR
        public final void MenuHostHelper$$ExternalSyntheticLambda1(xT<T> xTVar, Throwable th) {
            pN.setX(xTVar, "");
            pN.setX(th, "");
            nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
            pN.setY((Object) th, "");
            this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(nR.setX(new nR.setX(th)));
        }

        @Override // o.xR
        public final void setY(xT<T> xTVar, C0622yf<T> c0622yf) {
            pN.setX(xTVar, "");
            pN.setX(c0622yf, "");
            int i = c0622yf.setX.MenuHostHelper$$ExternalSyntheticLambda0;
            if (!(200 <= i && 299 >= i)) {
                xW xWVar = new xW(c0622yf);
                nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                pN.setY((Object) xWVar, "");
                this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(nR.setX(new nR.setX(xWVar)));
                return;
            }
            T t = c0622yf.setY;
            if (t == null) {
                vE x = xTVar.setX();
                pN.setY(C0617ya.class, "");
                Object cast = C0617ya.class.cast(x.MenuHostHelper$$ExternalSyntheticLambda1.get(C0617ya.class));
                if (cast == null) {
                    pN.setY();
                }
                pN.setIconTintList(cast, "");
                Method method = ((C0617ya) cast).setIconTintList;
                StringBuilder sb = new StringBuilder("Response from ");
                pN.setIconTintList(method, "");
                Class<?> declaringClass = method.getDeclaringClass();
                pN.setIconTintList(declaringClass, "");
                sb.append(declaringClass.getName());
                sb.append('.');
                sb.append(method.getName());
                sb.append(" was null but response body type was declared as non-null");
                nL nLVar = new nL(sb.toString());
                nR.setIconTintList seticontintlist2 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                nL nLVar2 = nLVar;
                pN.setY((Object) nLVar2, "");
                this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(nR.setX(new nR.setX(nLVar2)));
                return;
            }
            nR.setIconTintList seticontintlist3 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
            this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(nR.setX(t));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.yc$setX */
    /* loaded from: classes.dex */
    public static final class setX implements Runnable {
        private /* synthetic */ Exception MenuHostHelper$$ExternalSyntheticLambda1;
        private /* synthetic */ oK setIconTintList;

        setX(oK oKVar, Exception exc) {
            this.setIconTintList = oKVar;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            oK y = oP.setY(this.setIconTintList);
            Exception exc = this.MenuHostHelper$$ExternalSyntheticLambda1;
            nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
            pN.setY((Object) exc, "");
            y.MenuHostHelper$$ExternalSyntheticLambda0(nR.setX(new nR.setX(exc)));
        }
    }

    /* renamed from: o.yc$setY */
    /* loaded from: classes.dex */
    static final class setY extends pO implements InterfaceC0377pk<Throwable, nX> {
        private /* synthetic */ xT setY;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setY(xT xTVar) {
            super(1);
            this.setY = xTVar;
        }

        @Override // o.InterfaceC0377pk
        public final /* synthetic */ nX setX(Throwable th) {
            this.setY.setIconTintList();
            return nX.setX;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object setX(java.lang.Exception r4, o.oK<?> r5) {
        /*
            boolean r0 = r5 instanceof o.C0619yc.setLayoutAnimation
            if (r0 == 0) goto L14
            r0 = r5
            o.yc$setLayoutAnimation r0 = (o.C0619yc.setLayoutAnimation) r0
            int r1 = r0.setX
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.setX
            int r5 = r5 + r2
            r0.setX = r5
            goto L19
        L14:
            o.yc$setLayoutAnimation r0 = new o.yc$setLayoutAnimation
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.setIconTintList
            o.oJ r1 = o.oJ.COROUTINE_SUSPENDED
            int r2 = r0.setX
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.MenuHostHelper$$ExternalSyntheticLambda0
            java.lang.Exception r4 = (java.lang.Exception) r4
            boolean r4 = r5 instanceof o.nR.setX
            if (r4 != 0) goto L2d
            goto L64
        L2d:
            o.nR$setX r5 = (o.nR.setX) r5
            java.lang.Throwable r4 = r5.MenuHostHelper$$ExternalSyntheticLambda0
            throw r4
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            boolean r2 = r5 instanceof o.nR.setX
            if (r2 != 0) goto L67
            r0.MenuHostHelper$$ExternalSyntheticLambda0 = r4
            r0.setX = r3
            o.oK r0 = (o.oK) r0
            o.rQ r5 = o.C0457sj.setX()
            o.oM r2 = r0.setX()
            o.yc$setX r3 = new o.yc$setX
            r3.<init>(r0, r4)
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r5.setY(r2, r3)
            o.oJ r4 = o.oJ.COROUTINE_SUSPENDED
            o.oJ r5 = o.oJ.COROUTINE_SUSPENDED
            if (r4 != r5) goto L61
            java.lang.String r5 = ""
            o.pN.setY(r0, r5)
        L61:
            if (r4 != r1) goto L64
            return r1
        L64:
            o.nX r4 = o.nX.setX
            return r4
        L67:
            o.nR$setX r5 = (o.nR.setX) r5
            java.lang.Throwable r4 = r5.MenuHostHelper$$ExternalSyntheticLambda0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0619yc.setX(java.lang.Exception, o.oK):java.lang.Object");
    }
}