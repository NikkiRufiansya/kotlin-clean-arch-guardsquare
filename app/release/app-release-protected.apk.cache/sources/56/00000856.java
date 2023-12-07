package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class qT implements qC<C0405ql> {
    final InterfaceC0389pw<CharSequence, Integer, nT<Integer, Integer>> MenuHostHelper$$ExternalSyntheticLambda0;
    final CharSequence MenuHostHelper$$ExternalSyntheticLambda1;
    final int setIconTintList;
    final int setY;

    /* JADX WARN: Multi-variable type inference failed */
    public qT(CharSequence charSequence, int i, int i2, InterfaceC0389pw<? super CharSequence, ? super Integer, nT<Integer, Integer>> interfaceC0389pw) {
        pN.setY(charSequence, "");
        pN.setY(interfaceC0389pw, "");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = charSequence;
        this.setIconTintList = 0;
        this.setY = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = interfaceC0389pw;
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList implements Iterator<C0405ql>, InterfaceC0395qb {
        private int MenuHostHelper$$ExternalSyntheticLambda0 = -1;
        private int MenuHostHelper$$ExternalSyntheticLambda1;
        private C0405ql setIconTintList;
        private int setX;
        private int setY;

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        setIconTintList() {
            int i = qT.this.setIconTintList;
            int length = qT.this.MenuHostHelper$$ExternalSyntheticLambda1.length();
            if (length >= 0) {
                if (i < 0) {
                    i = 0;
                } else if (i > length) {
                    i = length;
                }
                this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
                this.setX = i;
                return;
            }
            StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
            sb.append(length);
            sb.append(" is less than minimum ");
            sb.append(0);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
            if (r0 < r7.setUnboundedRipple.setY) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void setIconTintList() {
            /*
                r7 = this;
                int r0 = r7.setX
                r1 = 0
                if (r0 >= 0) goto Lb
                r7.MenuHostHelper$$ExternalSyntheticLambda0 = r1
                r0 = 0
                r7.setIconTintList = r0
                return
            Lb:
                o.qT r0 = o.qT.this
                int r0 = r0.setY
                r2 = -1
                java.lang.String r3 = ""
                r4 = 1
                if (r0 <= 0) goto L20
                int r0 = r7.setY
                int r0 = r0 + r4
                r7.setY = r0
                o.qT r5 = o.qT.this
                int r5 = r5.setY
                if (r0 >= r5) goto L2c
            L20:
                int r0 = r7.setX
                o.qT r5 = o.qT.this
                java.lang.CharSequence r5 = r5.MenuHostHelper$$ExternalSyntheticLambda1
                int r5 = r5.length()
                if (r0 <= r5) goto L44
            L2c:
                o.ql r0 = new o.ql
                int r1 = r7.MenuHostHelper$$ExternalSyntheticLambda1
                o.qT r5 = o.qT.this
                java.lang.CharSequence r5 = r5.MenuHostHelper$$ExternalSyntheticLambda1
                o.pN.setY(r5, r3)
                int r3 = r5.length()
                int r3 = r3 - r4
                r0.<init>(r1, r3)
                r7.setIconTintList = r0
                r7.setX = r2
                goto La2
            L44:
                o.qT r0 = o.qT.this
                o.pw<java.lang.CharSequence, java.lang.Integer, o.nT<java.lang.Integer, java.lang.Integer>> r0 = r0.MenuHostHelper$$ExternalSyntheticLambda0
                o.qT r5 = o.qT.this
                java.lang.CharSequence r5 = r5.MenuHostHelper$$ExternalSyntheticLambda1
                int r6 = r7.setX
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r0 = r0.MenuHostHelper$$ExternalSyntheticLambda0(r5, r6)
                o.nT r0 = (o.nT) r0
                if (r0 != 0) goto L72
                o.ql r0 = new o.ql
                int r1 = r7.MenuHostHelper$$ExternalSyntheticLambda1
                o.qT r5 = o.qT.this
                java.lang.CharSequence r5 = r5.MenuHostHelper$$ExternalSyntheticLambda1
                o.pN.setY(r5, r3)
                int r3 = r5.length()
                int r3 = r3 - r4
                r0.<init>(r1, r3)
                r7.setIconTintList = r0
                r7.setX = r2
                goto La2
            L72:
                A r2 = r0.MenuHostHelper$$ExternalSyntheticLambda0
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.setX
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.MenuHostHelper$$ExternalSyntheticLambda1
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 > r5) goto L8f
                o.ql$setY r3 = o.C0405ql.setLayoutAnimation
                o.ql r3 = o.C0405ql.MenuHostHelper$$ExternalSyntheticLambda1()
                goto L97
            L8f:
                o.ql r5 = new o.ql
                int r6 = r2 + (-1)
                r5.<init>(r3, r6)
                r3 = r5
            L97:
                r7.setIconTintList = r3
                int r2 = r2 + r0
                r7.MenuHostHelper$$ExternalSyntheticLambda1 = r2
                if (r0 != 0) goto L9f
                r1 = 1
            L9f:
                int r2 = r2 + r1
                r7.setX = r2
            La2:
                r7.MenuHostHelper$$ExternalSyntheticLambda0 = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.qT.setIconTintList.setIconTintList():void");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 == -1) {
                setIconTintList();
            }
            return this.MenuHostHelper$$ExternalSyntheticLambda0 == 1;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ C0405ql next() {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 == -1) {
                setIconTintList();
            }
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 == 0) {
                throw new NoSuchElementException();
            }
            C0405ql c0405ql = this.setIconTintList;
            pN.setX(c0405ql);
            this.setIconTintList = null;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
            return c0405ql;
        }
    }

    @Override // o.qC
    public final Iterator<C0405ql> MenuHostHelper$$ExternalSyntheticLambda0() {
        return new setIconTintList();
    }
}