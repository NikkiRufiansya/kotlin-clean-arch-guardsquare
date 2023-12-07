package o;

import java.io.IOException;

/* renamed from: o.hi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0210hi<T> {
    public abstract T setX(hP hPVar);

    public abstract void setY(hR hRVar, T t);

    /* renamed from: o.hi$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 extends AbstractC0210hi<T> {
        public AnonymousClass2() {
        }

        @Override // o.AbstractC0210hi
        public final void setY(hR hRVar, T t) {
            if (t == null) {
                hRVar.setY();
            } else {
                AbstractC0210hi.this.setY(hRVar, t);
            }
        }

        @Override // o.AbstractC0210hi
        public final T setX(hP hPVar) {
            if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                hPVar.ViewPager$SavedState$1();
                return null;
            }
            return (T) AbstractC0210hi.this.setX(hPVar);
        }
    }

    public final gV setX(T t) {
        try {
            C0226hy c0226hy = new C0226hy();
            setY(c0226hy, t);
            if (!c0226hy.setIconTintList.isEmpty()) {
                StringBuilder sb = new StringBuilder("Expected one JSON element but was ");
                sb.append(c0226hy.setIconTintList);
                throw new IllegalStateException(sb.toString());
            }
            return c0226hy.MenuHostHelper$$ExternalSyntheticLambda1;
        } catch (IOException e) {
            throw new gY(e);
        }
    }
}