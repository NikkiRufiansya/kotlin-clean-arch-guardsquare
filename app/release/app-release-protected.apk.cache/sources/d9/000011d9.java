package o;

import java.util.List;
import o.vA;

/* loaded from: classes.dex */
public final class vC extends vF {
    public static final vA MenuHostHelper$$ExternalSyntheticLambda0;
    public static final vA MenuHostHelper$$ExternalSyntheticLambda1;
    private static final byte[] setIconTintList;
    private static final byte[] setUiOptions;
    private static final byte[] setY;
    private final vA ViewPager$SavedState$1;
    private long setLayoutAnimation;
    private final List<setY> setNavigationOnClickListener;
    private final vA setOnLongClickListener;
    private final C0610xu setUnboundedRipple;

    public vC(C0610xu c0610xu, vA vAVar, List<setY> list) {
        pN.setY(c0610xu, "");
        pN.setY(vAVar, "");
        pN.setY(list, "");
        this.setUnboundedRipple = c0610xu;
        this.ViewPager$SavedState$1 = vAVar;
        this.setNavigationOnClickListener = list;
        vA.setIconTintList seticontintlist = vA.setY;
        StringBuilder sb = new StringBuilder();
        sb.append(vAVar);
        sb.append("; boundary=");
        C0610xu c0610xu2 = this.setUnboundedRipple;
        String str = c0610xu2.setX;
        if (str == null) {
            byte[] x = c0610xu2.setX();
            pN.setY(x, "");
            String str2 = new String(x, qQ.setIconTintList);
            c0610xu2.setX = str2;
            str = str2;
        }
        sb.append(str);
        this.setOnLongClickListener = vA.setIconTintList.setY(sb.toString());
        this.setLayoutAnimation = -1L;
    }

    @Override // o.vF
    public final vA MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setOnLongClickListener;
    }

    @Override // o.vF
    public final long MenuHostHelper$$ExternalSyntheticLambda0() {
        long j = this.setLayoutAnimation;
        if (j == -1) {
            long x = setX(null, true);
            this.setLayoutAnimation = x;
            return x;
        }
        return j;
    }

    @Override // o.vF
    public final void setX(InterfaceC0606xq interfaceC0606xq) {
        pN.setY(interfaceC0606xq, "");
        setX(interfaceC0606xq, false);
    }

    private final long setX(InterfaceC0606xq interfaceC0606xq, boolean z) {
        C0602xo c0602xo;
        C0602xo c0602xo2;
        if (z) {
            c0602xo = new C0602xo();
            c0602xo2 = c0602xo;
        } else {
            c0602xo = null;
            c0602xo2 = interfaceC0606xq;
        }
        int size = this.setNavigationOnClickListener.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            setY sety = this.setNavigationOnClickListener.get(i);
            C0557vz c0557vz = sety.setX;
            vF vFVar = sety.MenuHostHelper$$ExternalSyntheticLambda0;
            pN.setX(c0602xo2);
            c0602xo2.MenuHostHelper$$ExternalSyntheticLambda0(setUiOptions);
            c0602xo2.setY(this.setUnboundedRipple);
            c0602xo2.MenuHostHelper$$ExternalSyntheticLambda0(setIconTintList);
            if (c0557vz != null) {
                int length = c0557vz.setIconTintList.length / 2;
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = i2 << 1;
                    c0602xo2.setIconTintList(c0557vz.setIconTintList[i3]).MenuHostHelper$$ExternalSyntheticLambda0(setY).setIconTintList(c0557vz.setIconTintList[i3 + 1]).MenuHostHelper$$ExternalSyntheticLambda0(setIconTintList);
                }
            }
            vA MenuHostHelper$$ExternalSyntheticLambda12 = vFVar.MenuHostHelper$$ExternalSyntheticLambda1();
            if (MenuHostHelper$$ExternalSyntheticLambda12 != null) {
                c0602xo2.setIconTintList("Content-Type: ").setIconTintList(MenuHostHelper$$ExternalSyntheticLambda12.toString()).MenuHostHelper$$ExternalSyntheticLambda0(setIconTintList);
            }
            long MenuHostHelper$$ExternalSyntheticLambda02 = vFVar.MenuHostHelper$$ExternalSyntheticLambda0();
            if (MenuHostHelper$$ExternalSyntheticLambda02 != -1) {
                c0602xo2.setIconTintList("Content-Length: ").setLayoutAnimation(MenuHostHelper$$ExternalSyntheticLambda02).MenuHostHelper$$ExternalSyntheticLambda0(setIconTintList);
            } else if (z) {
                pN.setX(c0602xo);
                c0602xo.setOnLongClickListener(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0);
                return -1L;
            }
            byte[] bArr = setIconTintList;
            c0602xo2.MenuHostHelper$$ExternalSyntheticLambda0(bArr);
            if (z) {
                j += MenuHostHelper$$ExternalSyntheticLambda02;
            } else {
                vFVar.setX(c0602xo2);
            }
            c0602xo2.MenuHostHelper$$ExternalSyntheticLambda0(bArr);
        }
        pN.setX(c0602xo2);
        byte[] bArr2 = setUiOptions;
        c0602xo2.MenuHostHelper$$ExternalSyntheticLambda0(bArr2);
        c0602xo2.setY(this.setUnboundedRipple);
        c0602xo2.MenuHostHelper$$ExternalSyntheticLambda0(bArr2);
        c0602xo2.MenuHostHelper$$ExternalSyntheticLambda0(setIconTintList);
        if (z) {
            pN.setX(c0602xo);
            long j2 = j + c0602xo.MenuHostHelper$$ExternalSyntheticLambda0;
            c0602xo.setOnLongClickListener(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0);
            return j2;
        }
        return j;
    }

    /* loaded from: classes.dex */
    public static final class setY {
        public static final C0007setY MenuHostHelper$$ExternalSyntheticLambda1 = new C0007setY((byte) 0);
        final vF MenuHostHelper$$ExternalSyntheticLambda0;
        final C0557vz setX;

        private setY(C0557vz c0557vz, vF vFVar) {
            this.setX = c0557vz;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = vFVar;
        }

        public /* synthetic */ setY(C0557vz c0557vz, vF vFVar, byte b) {
            this(c0557vz, vFVar);
        }

        /* renamed from: o.vC$setY$setY  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0007setY {
            private C0007setY() {
            }

            public /* synthetic */ C0007setY(byte b) {
                this();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList {
        private setIconTintList() {
        }

        public /* synthetic */ setIconTintList(byte b) {
            this();
        }
    }

    static {
        new setIconTintList((byte) 0);
        vA.setIconTintList seticontintlist = vA.setY;
        MenuHostHelper$$ExternalSyntheticLambda1 = vA.setIconTintList.setY("multipart/mixed");
        vA.setIconTintList seticontintlist2 = vA.setY;
        vA.setIconTintList.setY("multipart/alternative");
        vA.setIconTintList seticontintlist3 = vA.setY;
        vA.setIconTintList.setY("multipart/digest");
        vA.setIconTintList seticontintlist4 = vA.setY;
        vA.setIconTintList.setY("multipart/parallel");
        vA.setIconTintList seticontintlist5 = vA.setY;
        MenuHostHelper$$ExternalSyntheticLambda0 = vA.setIconTintList.setY("multipart/form-data");
        setY = new byte[]{58, 32};
        setIconTintList = new byte[]{13, 10};
        setUiOptions = new byte[]{45, 45};
    }
}