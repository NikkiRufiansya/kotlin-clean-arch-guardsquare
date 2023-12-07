package o;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: o.xw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0612xw extends AbstractC0340oa<C0610xu> implements RandomAccess {
    public static final setIconTintList MenuHostHelper$$ExternalSyntheticLambda1 = new setIconTintList((byte) 0);
    public final int[] MenuHostHelper$$ExternalSyntheticLambda0;
    final C0610xu[] setIconTintList;

    public static final C0612xw setY(C0610xu... c0610xuArr) {
        return MenuHostHelper$$ExternalSyntheticLambda1.setY(c0610xuArr);
    }

    public /* synthetic */ C0612xw(C0610xu[] c0610xuArr, int[] iArr, byte b) {
        this(c0610xuArr, iArr);
    }

    @Override // o.nW, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0610xu) {
            return super.contains((C0610xu) obj);
        }
        return false;
    }

    @Override // o.AbstractC0340oa, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0610xu) {
            return super.indexOf((C0610xu) obj);
        }
        return -1;
    }

    @Override // o.AbstractC0340oa, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0610xu) {
            return super.lastIndexOf((C0610xu) obj);
        }
        return -1;
    }

    private C0612xw(C0610xu[] c0610xuArr, int[] iArr) {
        this.setIconTintList = c0610xuArr;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = iArr;
    }

    @Override // o.nW
    public final int setY() {
        return this.setIconTintList.length;
    }

    /* renamed from: o.xw$setIconTintList */
    /* loaded from: classes.dex */
    public static final class setIconTintList {
        private setIconTintList() {
        }

        public /* synthetic */ setIconTintList(byte b) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:63:0x00f3, code lost:
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o.C0612xw setY(o.C0610xu... r14) {
            /*
                Method dump skipped, instructions count: 342
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0612xw.setIconTintList.setY(o.xu[]):o.xw");
        }

        private final void MenuHostHelper$$ExternalSyntheticLambda1(long j, C0602xo c0602xo, int i, List<? extends C0610xu> list, int i2, int i3, List<Integer> list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            C0602xo c0602xo2;
            int i8 = i;
            if (!(i2 < i3)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i9 = i2; i9 < i3; i9++) {
                if (!(list.get(i9).MenuHostHelper$$ExternalSyntheticLambda0() >= i8)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            C0610xu c0610xu = list.get(i2);
            C0610xu c0610xu2 = list.get(i3 - 1);
            if (i8 == c0610xu.MenuHostHelper$$ExternalSyntheticLambda0()) {
                int i10 = i2 + 1;
                i5 = i10;
                i4 = list2.get(i2).intValue();
                c0610xu = list.get(i10);
            } else {
                i4 = -1;
                i5 = i2;
            }
            if (c0610xu.setY(i8) == c0610xu2.setY(i8)) {
                int min = Math.min(c0610xu.MenuHostHelper$$ExternalSyntheticLambda0(), c0610xu2.MenuHostHelper$$ExternalSyntheticLambda0());
                int i11 = 0;
                for (int i12 = i8; i12 < min && c0610xu.setY(i12) == c0610xu2.setY(i12); i12++) {
                    i11++;
                }
                long j2 = j + (c0602xo.MenuHostHelper$$ExternalSyntheticLambda0 / 4) + 2 + i11 + 1;
                c0602xo.setIconTintList(-i11);
                c0602xo.setIconTintList(i4);
                int i13 = i8 + i11;
                while (i8 < i13) {
                    c0602xo.setIconTintList(c0610xu.setY(i8) & 255);
                    i8++;
                }
                if (i5 + 1 != i3) {
                    C0602xo c0602xo3 = new C0602xo();
                    c0602xo.setIconTintList(-((int) ((c0602xo3.MenuHostHelper$$ExternalSyntheticLambda0 / 4) + j2)));
                    MenuHostHelper$$ExternalSyntheticLambda1(j2, c0602xo3, i13, list, i5, i3, list2);
                    c0602xo.setY(c0602xo3);
                    return;
                }
                if (!(i13 == list.get(i5).MenuHostHelper$$ExternalSyntheticLambda0())) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                c0602xo.setIconTintList(list2.get(i5).intValue());
                return;
            }
            int i14 = 1;
            for (int i15 = i5 + 1; i15 < i3; i15++) {
                if (list.get(i15 - 1).setY(i8) != list.get(i15).setY(i8)) {
                    i14++;
                }
            }
            long j3 = j + (c0602xo.MenuHostHelper$$ExternalSyntheticLambda0 / 4) + 2 + (i14 << 1);
            c0602xo.setIconTintList(i14);
            c0602xo.setIconTintList(i4);
            for (int i16 = i5; i16 < i3; i16++) {
                byte y = list.get(i16).setY(i8);
                if (i16 == i5 || y != list.get(i16 - 1).setY(i8)) {
                    c0602xo.setIconTintList(y & 255);
                }
            }
            C0602xo c0602xo4 = new C0602xo();
            while (i5 < i3) {
                byte y2 = list.get(i5).setY(i8);
                int i17 = i5 + 1;
                int i18 = i17;
                while (true) {
                    if (i18 >= i3) {
                        i6 = i3;
                        break;
                    } else if (y2 != list.get(i18).setY(i8)) {
                        i6 = i18;
                        break;
                    } else {
                        i18++;
                    }
                }
                if (i17 == i6 && i8 + 1 == list.get(i5).MenuHostHelper$$ExternalSyntheticLambda0()) {
                    c0602xo.setIconTintList(list2.get(i5).intValue());
                    i7 = i6;
                    c0602xo2 = c0602xo4;
                } else {
                    c0602xo.setIconTintList(-((int) ((c0602xo4.MenuHostHelper$$ExternalSyntheticLambda0 / 4) + j3)));
                    i7 = i6;
                    c0602xo2 = c0602xo4;
                    MenuHostHelper$$ExternalSyntheticLambda1(j3, c0602xo4, i8 + 1, list, i5, i6, list2);
                }
                i5 = i7;
                c0602xo4 = c0602xo2;
            }
            c0602xo.setY(c0602xo4);
        }
    }

    @Override // o.AbstractC0340oa, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.setIconTintList[i];
    }
}