package o;

import java.io.Serializable;

/* renamed from: o.qj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0403qj {
    public static final setIconTintList MenuHostHelper$$ExternalSyntheticLambda0 = new setIconTintList((byte) 0);
    private static final AbstractC0403qj MenuHostHelper$$ExternalSyntheticLambda1 = C0369pc.setX.setX();

    public abstract int setX(int i);

    public int setX() {
        return setX(32);
    }

    /* renamed from: o.qj$setIconTintList */
    /* loaded from: classes.dex */
    public static final class setIconTintList extends AbstractC0403qj implements Serializable {
        public /* synthetic */ setIconTintList(byte b) {
            this();
        }

        private setIconTintList() {
        }

        private final Object writeReplace() {
            return new Serializable() { // from class: o.qj$setIconTintList$MenuHostHelper$$ExternalSyntheticLambda1
                private final Object readResolve() {
                    return AbstractC0403qj.MenuHostHelper$$ExternalSyntheticLambda0;
                }
            };
        }

        @Override // o.AbstractC0403qj
        public final int setX(int i) {
            return AbstractC0403qj.MenuHostHelper$$ExternalSyntheticLambda1.setX(i);
        }

        @Override // o.AbstractC0403qj
        public final int setX() {
            return AbstractC0403qj.MenuHostHelper$$ExternalSyntheticLambda1.setX();
        }
    }
}