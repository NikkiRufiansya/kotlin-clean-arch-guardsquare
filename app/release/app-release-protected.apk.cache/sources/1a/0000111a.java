package o;

import java.util.Arrays;
import o.AbstractC0462so;

/* loaded from: classes.dex */
public abstract class so$MenuHostHelper$$ExternalSyntheticLambda1 implements Runnable, Comparable<so$MenuHostHelper$$ExternalSyntheticLambda1>, InterfaceC0456si, uC {
    public long MenuHostHelper$$ExternalSyntheticLambda0;
    private volatile Object _heap;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [T extends o.uC & java.lang.Comparable<? super T>[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v2, types: [T extends o.uC & java.lang.Comparable<? super T>[], o.uC[]] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v7, types: [T extends o.uC & java.lang.Comparable<? super T>[], o.uC[]] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v1, types: [T extends o.uC & java.lang.Comparable<? super T>[]] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final int setIconTintList(long j, AbstractC0462so.setY sety, AbstractC0462so abstractC0462so) {
        boolean z;
        ?? r13;
        synchronized (this) {
            if (this._heap == C0460sm.MenuHostHelper$$ExternalSyntheticLambda0()) {
                return 2;
            }
            AbstractC0462so.setY sety2 = sety;
            synchronized (sety2) {
                ?? r1 = sety2.setX;
                so$MenuHostHelper$$ExternalSyntheticLambda1 so_menuhosthelper__externalsyntheticlambda1 = r1 != 0 ? r1[0] : null;
                z = abstractC0462so._isCompleted;
                if (z) {
                    return 1;
                }
                if (so_menuhosthelper__externalsyntheticlambda1 == null) {
                    sety.MenuHostHelper$$ExternalSyntheticLambda1 = j;
                } else {
                    long j2 = so_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - sety.MenuHostHelper$$ExternalSyntheticLambda1 > 0) {
                        sety.MenuHostHelper$$ExternalSyntheticLambda1 = j;
                    }
                }
                if (this.MenuHostHelper$$ExternalSyntheticLambda0 - sety.MenuHostHelper$$ExternalSyntheticLambda1 < 0) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = sety.MenuHostHelper$$ExternalSyntheticLambda1;
                }
                so$MenuHostHelper$$ExternalSyntheticLambda1 so_menuhosthelper__externalsyntheticlambda12 = this;
                rX.setIconTintList();
                ?? r132 = sety2.setX;
                if (r132 == 0) {
                    ?? r133 = new uC[4];
                    sety2.setX = r133;
                    r13 = r133;
                } else {
                    int i = sety2._size;
                    int length = r132.length;
                    r13 = r132;
                    if (i >= length) {
                        Object[] copyOf = Arrays.copyOf((Object[]) r132, sety2._size << 1);
                        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) copyOf, "");
                        ?? r134 = (uC[]) copyOf;
                        sety2.setX = r134;
                        r13 = r134;
                    }
                }
                int i2 = sety2._size;
                sety2._size = i2 + 1;
                r13[i2] = so_menuhosthelper__externalsyntheticlambda12;
                while (i2 > 0) {
                    Object[] objArr = sety2.setX;
                    pN.setX(objArr);
                    int i3 = (i2 - 1) / 2;
                    Object obj = objArr[i3];
                    pN.setX(obj);
                    Object obj2 = objArr[i2];
                    pN.setX(obj2);
                    if (((Comparable) obj).compareTo(obj2) <= 0) {
                        break;
                    }
                    sety2.setY(i2, i3);
                    i2 = i3;
                }
                return 0;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Delayed[nanos=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(']');
        return sb.toString();
    }
}