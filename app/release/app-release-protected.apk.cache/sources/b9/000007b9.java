package o;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class oY {

    /* loaded from: classes.dex */
    static final class setX {
        public static final Method setX;

        private setX() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
            if (o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r7.length == 1 ? r7[0] : null, java.lang.Throwable.class) != false) goto L11;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v5 */
        /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object[], java.lang.Object] */
        static {
            /*
                o.oY$setX r0 = new o.oY$setX
                r0.<init>()
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r0 = r0.getMethods()
                java.lang.String r1 = ""
                o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r0, r1)
                int r2 = r0.length
                r3 = 0
                r4 = 0
            L13:
                r5 = 0
                if (r4 >= r2) goto L46
                r6 = r0[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r7, r8)
                r8 = 1
                if (r7 == 0) goto L3f
                java.lang.Class[] r7 = r6.getParameterTypes()
                o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r7, r1)
                java.lang.Object[] r7 = (java.lang.Object[]) r7
                o.pN.setY(r7, r1)
                int r9 = r7.length
                if (r9 != r8) goto L36
                r5 = r7[r3]
            L36:
                java.lang.Class<java.lang.Throwable> r7 = java.lang.Throwable.class
                boolean r5 = o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r5, r7)
                if (r5 == 0) goto L3f
                goto L40
            L3f:
                r8 = 0
            L40:
                if (r8 != 0) goto L45
                int r4 = r4 + 1
                goto L13
            L45:
                r5 = r6
            L46:
                o.oY.setX.setX = r5
                int r1 = r0.length
            L49:
                if (r3 >= r1) goto L5c
                r2 = r0[r3]
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r2, r4)
                if (r2 != 0) goto L5c
                int r3 = r3 + 1
                goto L49
            L5c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.oY.setX.<clinit>():void");
        }
    }

    public void setX(Throwable th, Throwable th2) {
        pN.setY((Object) th, "");
        pN.setY((Object) th2, "");
        Method method = setX.setX;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public AbstractC0403qj setX() {
        return new C0400qg();
    }
}