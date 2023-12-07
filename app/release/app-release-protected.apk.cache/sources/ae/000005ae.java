package o;

import java.util.Collections;
import java.util.List;

/* renamed from: o.hk  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212hk implements InterfaceC0209hh, Cloneable {
    public static final C0212hk setIconTintList = new C0212hk();
    public boolean setX;
    public double setLayoutAnimation = -1.0d;
    public int MenuHostHelper$$ExternalSyntheticLambda0 = vP.setLayoutAnimation;
    public boolean setUnboundedRipple = true;
    public List<gM> setY = Collections.emptyList();
    public List<gM> MenuHostHelper$$ExternalSyntheticLambda1 = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setX */
    public C0212hk clone() {
        try {
            return (C0212hk) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(java.lang.Class<?> r9) {
        /*
            r8 = this;
            double r0 = r8.setLayoutAnimation
            r2 = 0
            r3 = 1
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L42
            java.lang.Class<o.hj> r0 = o.InterfaceC0211hj.class
            java.lang.annotation.Annotation r0 = r9.getAnnotation(r0)
            o.hj r0 = (o.InterfaceC0211hj) r0
            java.lang.Class<o.hn> r1 = o.InterfaceC0215hn.class
            java.lang.annotation.Annotation r1 = r9.getAnnotation(r1)
            o.hn r1 = (o.InterfaceC0215hn) r1
            if (r0 == 0) goto L28
            double r4 = r0.setIconTintList()
            double r6 = r8.setLayoutAnimation
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L28
            r0 = 0
            goto L29
        L28:
            r0 = 1
        L29:
            if (r0 == 0) goto L3e
            if (r1 == 0) goto L39
            double r0 = r1.MenuHostHelper$$ExternalSyntheticLambda1()
            double r4 = r8.setLayoutAnimation
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 > 0) goto L39
            r0 = 0
            goto L3a
        L39:
            r0 = 1
        L3a:
            if (r0 == 0) goto L3e
            r0 = 1
            goto L3f
        L3e:
            r0 = 0
        L3f:
            if (r0 != 0) goto L42
            return r3
        L42:
            boolean r0 = r8.setUnboundedRipple
            if (r0 != 0) goto L5f
            boolean r0 = r9.isMemberClass()
            if (r0 == 0) goto L5b
            int r0 = r9.getModifiers()
            r0 = r0 & 8
            if (r0 == 0) goto L56
            r0 = 1
            goto L57
        L56:
            r0 = 0
        L57:
            if (r0 != 0) goto L5b
            r0 = 1
            goto L5c
        L5b:
            r0 = 0
        L5c:
            if (r0 == 0) goto L5f
            return r3
        L5f:
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r9)
            if (r0 != 0) goto L75
            boolean r0 = r9.isAnonymousClass()
            if (r0 != 0) goto L73
            boolean r9 = r9.isLocalClass()
            if (r9 == 0) goto L75
        L73:
            r9 = 1
            goto L76
        L75:
            r9 = 0
        L76:
            if (r9 == 0) goto L79
            return r3
        L79:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0212hk.MenuHostHelper$$ExternalSyntheticLambda0(java.lang.Class):boolean");
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        for (gM gMVar : z ? this.setY : this.MenuHostHelper$$ExternalSyntheticLambda1) {
            if (gMVar.MenuHostHelper$$ExternalSyntheticLambda0()) {
                return true;
            }
        }
        return false;
    }

    public static boolean setIconTintList(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public static boolean setX(Class<?> cls) {
        if (cls.isMemberClass()) {
            if (!((cls.getModifiers() & 8) != 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC0209hh
    public final <T> AbstractC0210hi<T> setIconTintList(final gS gSVar, final hQ<T> hQVar) {
        boolean MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(hQVar.setIconTintList);
        final boolean z = MenuHostHelper$$ExternalSyntheticLambda0 || MenuHostHelper$$ExternalSyntheticLambda1(true);
        final boolean z2 = MenuHostHelper$$ExternalSyntheticLambda0 || MenuHostHelper$$ExternalSyntheticLambda1(false);
        if (z || z2) {
            return new AbstractC0210hi<T>() { // from class: o.hk.2
                private AbstractC0210hi<T> MenuHostHelper$$ExternalSyntheticLambda0;

                @Override // o.AbstractC0210hi
                public final T setX(hP hPVar) {
                    if (z2) {
                        hPVar.setChipCornerRadius();
                        return null;
                    }
                    return setX().setX(hPVar);
                }

                @Override // o.AbstractC0210hi
                public final void setY(hR hRVar, T t) {
                    if (z) {
                        hRVar.setY();
                    } else {
                        setX().setY(hRVar, t);
                    }
                }

                private AbstractC0210hi<T> setX() {
                    AbstractC0210hi<T> abstractC0210hi = this.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (abstractC0210hi == null) {
                        AbstractC0210hi<T> y = gSVar.setY(C0212hk.this, hQVar);
                        this.MenuHostHelper$$ExternalSyntheticLambda0 = y;
                        return y;
                    }
                    return abstractC0210hi;
                }
            };
        }
        return null;
    }
}