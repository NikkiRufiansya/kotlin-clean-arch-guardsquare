package o;

/* loaded from: classes.dex */
public abstract class vF {
    public static final setX setX = new setX((byte) 0);

    public long MenuHostHelper$$ExternalSyntheticLambda0() {
        return -1L;
    }

    public abstract vA MenuHostHelper$$ExternalSyntheticLambda1();

    public abstract void setX(InterfaceC0606xq interfaceC0606xq);

    /* loaded from: classes.dex */
    public static final class setX {
        private setX() {
        }

        public /* synthetic */ setX(byte b) {
            this();
        }

        /* loaded from: classes.dex */
        public static final class setIconTintList extends vF {
            private /* synthetic */ vA MenuHostHelper$$ExternalSyntheticLambda0;
            private /* synthetic */ C0610xu setY;

            setIconTintList(C0610xu c0610xu, vA vAVar) {
                this.setY = c0610xu;
                this.MenuHostHelper$$ExternalSyntheticLambda0 = vAVar;
            }

            @Override // o.vF
            public final vA MenuHostHelper$$ExternalSyntheticLambda1() {
                return this.MenuHostHelper$$ExternalSyntheticLambda0;
            }

            @Override // o.vF
            public final long MenuHostHelper$$ExternalSyntheticLambda0() {
                return this.setY.MenuHostHelper$$ExternalSyntheticLambda0();
            }

            @Override // o.vF
            public final void setX(InterfaceC0606xq interfaceC0606xq) {
                pN.setY(interfaceC0606xq, "");
                interfaceC0606xq.setY(this.setY);
            }
        }

        /* renamed from: o.vF$setX$setX  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0008setX extends vF {
            private /* synthetic */ byte[] MenuHostHelper$$ExternalSyntheticLambda0;
            private /* synthetic */ int setIconTintList;
            private /* synthetic */ vA MenuHostHelper$$ExternalSyntheticLambda1 = null;
            private /* synthetic */ int setY = 0;

            public C0008setX(byte[] bArr, vA vAVar, int i, int i2) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = bArr;
                this.setIconTintList = i;
            }

            @Override // o.vF
            public final vA MenuHostHelper$$ExternalSyntheticLambda1() {
                return this.MenuHostHelper$$ExternalSyntheticLambda1;
            }

            @Override // o.vF
            public final long MenuHostHelper$$ExternalSyntheticLambda0() {
                return this.setIconTintList;
            }

            @Override // o.vF
            public final void setX(InterfaceC0606xq interfaceC0606xq) {
                pN.setY(interfaceC0606xq, "");
                interfaceC0606xq.setY(this.MenuHostHelper$$ExternalSyntheticLambda0, this.setY, this.setIconTintList);
            }
        }
    }

    public static final vF setY(vA vAVar, C0610xu c0610xu) {
        setX setx = setX;
        pN.setY(c0610xu, "");
        pN.setY(c0610xu, "");
        return new setX.setIconTintList(c0610xu, vAVar);
    }

    public static final vF MenuHostHelper$$ExternalSyntheticLambda1(byte[] bArr) {
        setX setx = setX;
        int length = bArr.length;
        pN.setY(bArr, "");
        pN.setY(bArr, "");
        int length2 = bArr.length;
        vL.MenuHostHelper$$ExternalSyntheticLambda1(0L, 0L, 0L);
        return new setX.C0008setX(bArr, null, 0, 0);
    }
}