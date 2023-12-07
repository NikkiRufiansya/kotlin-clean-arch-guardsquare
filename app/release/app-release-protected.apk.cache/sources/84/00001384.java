package o;

import java.lang.annotation.Annotation;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.yl  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0628yl implements InterfaceC0630yn {
    private static final InterfaceC0630yn setY = new C0628yl();

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    C0628yl() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Annotation[] setIconTintList(Annotation[] annotationArr) {
        if (C0629ym.setY(annotationArr, InterfaceC0630yn.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = setY;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return InterfaceC0630yn.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof InterfaceC0630yn;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        StringBuilder sb = new StringBuilder("@");
        sb.append(InterfaceC0630yn.class.getName());
        sb.append("()");
        return sb.toString();
    }
}