package o;

import java.util.Arrays;
import o.C0241in;
import o.jj;

/* renamed from: o.jb */
/* loaded from: classes.dex */
public final class C0256jb {
    private static final C0256jb setUiOptions = new C0256jb(0, new int[0], new Object[0], false);
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    int[] MenuHostHelper$$ExternalSyntheticLambda1;
    int setIconTintList;
    int setX;
    Object[] setY;

    public static C0256jb MenuHostHelper$$ExternalSyntheticLambda0(C0256jb c0256jb, C0256jb c0256jb2) {
        int i = c0256jb.setIconTintList + c0256jb2.setIconTintList;
        int[] copyOf = Arrays.copyOf(c0256jb.MenuHostHelper$$ExternalSyntheticLambda1, i);
        System.arraycopy(c0256jb2.MenuHostHelper$$ExternalSyntheticLambda1, 0, copyOf, c0256jb.setIconTintList, c0256jb2.setIconTintList);
        Object[] copyOf2 = Arrays.copyOf(c0256jb.setY, i);
        System.arraycopy(c0256jb2.setY, 0, copyOf2, c0256jb.setIconTintList, c0256jb2.setIconTintList);
        return new C0256jb(i, copyOf, copyOf2, true);
    }

    private C0256jb() {
        this(0, new int[8], new Object[8], true);
    }

    private C0256jb(int i, int[] iArr, Object[] objArr, boolean z) {
        this.setX = -1;
        this.setIconTintList = i;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = iArr;
        this.setY = objArr;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = z;
    }

    public final void setX(jj jjVar) {
        if (this.setIconTintList == 0) {
            return;
        }
        if (jjVar.setY() == jj.setY.ASCENDING) {
            for (int i = 0; i < this.setIconTintList; i++) {
                MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1[i], this.setY[i], jjVar);
            }
            return;
        }
        for (int i2 = this.setIconTintList - 1; i2 >= 0; i2--) {
            MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1[i2], this.setY[i2], jjVar);
        }
    }

    private static void MenuHostHelper$$ExternalSyntheticLambda1(int i, Object obj, jj jjVar) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            jjVar.MenuHostHelper$$ExternalSyntheticLambda0(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            jjVar.setIconTintList(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            jjVar.MenuHostHelper$$ExternalSyntheticLambda1(i2, (hY) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                jjVar.setIconTintList(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(new C0241in.setX("Protocol message tag had invalid wire type."));
        } else if (jjVar.setY() == jj.setY.ASCENDING) {
            jjVar.setY(i2);
            ((C0256jb) obj).setX(jjVar);
            jjVar.setX(i2);
        } else {
            jjVar.setX(i2);
            ((C0256jb) obj).setX(jjVar);
            jjVar.setY(i2);
        }
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda1() {
        int y;
        int i = this.setX;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.setIconTintList; i3++) {
            int i4 = this.MenuHostHelper$$ExternalSyntheticLambda1[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                y = hX.setY(i5, ((Long) this.setY[i3]).longValue());
            } else if (i6 == 1) {
                Long l = (Long) this.setY[i3];
                y = hX.setY(i5);
            } else if (i6 == 2) {
                y = hX.setIconTintList(i5, (hY) this.setY[i3]);
            } else if (i6 == 3) {
                y = (hX.setCenterIfNoTextEnabled(i5) << 1) + ((C0256jb) this.setY[i3]).MenuHostHelper$$ExternalSyntheticLambda1();
            } else if (i6 == 5) {
                Integer num = (Integer) this.setY[i3];
                y = hX.setIconTintList(i5);
            } else {
                throw new IllegalStateException(new C0241in.setX("Protocol message tag had invalid wire type."));
            }
            i2 += y;
        }
        this.setX = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0256jb)) {
            C0256jb c0256jb = (C0256jb) obj;
            int i = this.setIconTintList;
            if (i == c0256jb.setIconTintList) {
                int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
                int[] iArr2 = c0256jb.MenuHostHelper$$ExternalSyntheticLambda1;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        z = true;
                        break;
                    } else if (iArr[i2] != iArr2[i2]) {
                        z = false;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z) {
                    Object[] objArr = this.setY;
                    Object[] objArr2 = c0256jb.setY;
                    int i3 = this.setIconTintList;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            z2 = true;
                            break;
                        } else if (!objArr[i4].equals(objArr2[i4])) {
                            z2 = false;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.setIconTintList;
        int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int i2 = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (((i + 527) * 31) + i3) * 31;
        Object[] objArr = this.setY;
        int i6 = this.setIconTintList;
        for (int i7 = 0; i7 < i6; i7++) {
            i2 = (i2 * 31) + objArr[i7].hashCode();
        }
        return i5 + i2;
    }

    public final void setY(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.setIconTintList; i2++) {
            iI.setIconTintList(sb, i, String.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda1[i2] >>> 3), this.setY[i2]);
        }
    }
}