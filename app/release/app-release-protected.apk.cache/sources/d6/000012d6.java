package o;

import o.C0610xu;

/* renamed from: o.wu  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0581wu {
    public static final C0610xu MenuHostHelper$$ExternalSyntheticLambda0;
    public static final C0610xu MenuHostHelper$$ExternalSyntheticLambda1;
    public static final C0610xu setIconTintList;
    public static final C0610xu setOnLongClickListener;
    public static final C0610xu setX;
    public static final C0610xu setY;
    public final C0610xu setLayoutAnimation;
    public final int setNavigationOnClickListener;
    public final C0610xu setUiOptions;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0581wu) {
                C0581wu c0581wu = (C0581wu) obj;
                return pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setUiOptions, c0581wu.setUiOptions) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setLayoutAnimation, c0581wu.setLayoutAnimation);
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C0610xu c0610xu = this.setUiOptions;
        int hashCode = c0610xu != null ? c0610xu.hashCode() : 0;
        C0610xu c0610xu2 = this.setLayoutAnimation;
        return (hashCode * 31) + (c0610xu2 != null ? c0610xu2.hashCode() : 0);
    }

    public C0581wu(C0610xu c0610xu, C0610xu c0610xu2) {
        pN.setY(c0610xu, "");
        pN.setY(c0610xu2, "");
        this.setUiOptions = c0610xu;
        this.setLayoutAnimation = c0610xu2;
        this.setNavigationOnClickListener = c0610xu.MenuHostHelper$$ExternalSyntheticLambda0() + 32 + c0610xu2.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0581wu(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            o.pN.setY(r4, r0)
            o.pN.setY(r5, r0)
            o.xu$setX r1 = o.C0610xu.MenuHostHelper$$ExternalSyntheticLambda0
            o.pN.setY(r4, r0)
            o.xu r1 = new o.xu
            o.pN.setY(r4, r0)
            java.nio.charset.Charset r2 = o.qQ.setIconTintList
            byte[] r2 = r4.getBytes(r2)
            o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r2, r0)
            r1.<init>(r2)
            r1.setX = r4
            o.xu$setX r4 = o.C0610xu.MenuHostHelper$$ExternalSyntheticLambda0
            o.pN.setY(r5, r0)
            o.xu r4 = new o.xu
            o.pN.setY(r5, r0)
            java.nio.charset.Charset r2 = o.qQ.setIconTintList
            byte[] r2 = r5.getBytes(r2)
            o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r2, r0)
            r4.<init>(r2)
            r4.setX = r5
            r3.<init>(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0581wu.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0581wu(o.C0610xu r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            o.pN.setY(r4, r0)
            o.pN.setY(r5, r0)
            o.xu$setX r1 = o.C0610xu.MenuHostHelper$$ExternalSyntheticLambda0
            o.pN.setY(r5, r0)
            o.xu r1 = new o.xu
            o.pN.setY(r5, r0)
            java.nio.charset.Charset r2 = o.qQ.setIconTintList
            byte[] r2 = r5.getBytes(r2)
            o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r2, r0)
            r1.<init>(r2)
            r1.setX = r5
            r3.<init>(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0581wu.<init>(o.xu, java.lang.String):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C0610xu c0610xu = this.setUiOptions;
        String str = c0610xu.setX;
        if (str == null) {
            byte[] x = c0610xu.setX();
            pN.setY(x, "");
            String str2 = new String(x, qQ.setIconTintList);
            c0610xu.setX = str2;
            str = str2;
        }
        sb.append(str);
        sb.append(": ");
        C0610xu c0610xu2 = this.setLayoutAnimation;
        String str3 = c0610xu2.setX;
        if (str3 == null) {
            byte[] x2 = c0610xu2.setX();
            pN.setY(x2, "");
            String str4 = new String(x2, qQ.setIconTintList);
            c0610xu2.setX = str4;
            str3 = str4;
        }
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: o.wu$setX */
    /* loaded from: classes.dex */
    public static final class setX {
        private setX() {
        }

        public /* synthetic */ setX(byte b) {
            this();
        }
    }

    static {
        new setX((byte) 0);
        C0610xu.setX setx = C0610xu.MenuHostHelper$$ExternalSyntheticLambda0;
        pN.setY(":", "");
        pN.setY(":", "");
        byte[] bytes = ":".getBytes(qQ.setIconTintList);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) bytes, "");
        C0610xu c0610xu = new C0610xu(bytes);
        c0610xu.setX = ":";
        MenuHostHelper$$ExternalSyntheticLambda0 = c0610xu;
        C0610xu.setX setx2 = C0610xu.MenuHostHelper$$ExternalSyntheticLambda0;
        pN.setY(":status", "");
        pN.setY(":status", "");
        byte[] bytes2 = ":status".getBytes(qQ.setIconTintList);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) bytes2, "");
        C0610xu c0610xu2 = new C0610xu(bytes2);
        c0610xu2.setX = ":status";
        setY = c0610xu2;
        C0610xu.setX setx3 = C0610xu.MenuHostHelper$$ExternalSyntheticLambda0;
        pN.setY(":method", "");
        pN.setY(":method", "");
        byte[] bytes3 = ":method".getBytes(qQ.setIconTintList);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) bytes3, "");
        C0610xu c0610xu3 = new C0610xu(bytes3);
        c0610xu3.setX = ":method";
        setX = c0610xu3;
        C0610xu.setX setx4 = C0610xu.MenuHostHelper$$ExternalSyntheticLambda0;
        pN.setY(":path", "");
        pN.setY(":path", "");
        byte[] bytes4 = ":path".getBytes(qQ.setIconTintList);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) bytes4, "");
        C0610xu c0610xu4 = new C0610xu(bytes4);
        c0610xu4.setX = ":path";
        MenuHostHelper$$ExternalSyntheticLambda1 = c0610xu4;
        C0610xu.setX setx5 = C0610xu.MenuHostHelper$$ExternalSyntheticLambda0;
        pN.setY(":scheme", "");
        pN.setY(":scheme", "");
        byte[] bytes5 = ":scheme".getBytes(qQ.setIconTintList);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) bytes5, "");
        C0610xu c0610xu5 = new C0610xu(bytes5);
        c0610xu5.setX = ":scheme";
        setOnLongClickListener = c0610xu5;
        C0610xu.setX setx6 = C0610xu.MenuHostHelper$$ExternalSyntheticLambda0;
        pN.setY(":authority", "");
        pN.setY(":authority", "");
        byte[] bytes6 = ":authority".getBytes(qQ.setIconTintList);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) bytes6, "");
        C0610xu c0610xu6 = new C0610xu(bytes6);
        c0610xu6.setX = ":authority";
        setIconTintList = c0610xu6;
    }
}