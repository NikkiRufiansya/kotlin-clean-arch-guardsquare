package o;

/* renamed from: o.ph  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0374ph extends oY {

    /* renamed from: o.ph$setIconTintList */
    /* loaded from: classes.dex */
    static final class setIconTintList {
        public static final Integer setY;

        private setIconTintList() {
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
        static {
            /*
                o.ph$setIconTintList r0 = new o.ph$setIconTintList
                r0.<init>()
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1d
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1d
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1d
                if (r2 == 0) goto L1d
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1d
                goto L1e
            L1d:
                r1 = r0
            L1e:
                if (r1 == 0) goto L2f
                r2 = r1
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                if (r2 <= 0) goto L2b
                r2 = 1
                goto L2c
            L2b:
                r2 = 0
            L2c:
                if (r2 == 0) goto L2f
                r0 = r1
            L2f:
                o.C0374ph.setIconTintList.setY = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0374ph.setIconTintList.<clinit>():void");
        }
    }

    @Override // o.oY
    public final void setX(Throwable th, Throwable th2) {
        pN.setY((Object) th, "");
        pN.setY((Object) th2, "");
        if (setIconTintList.setY == null || setIconTintList.setY.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.setX(th, th2);
        }
    }
}