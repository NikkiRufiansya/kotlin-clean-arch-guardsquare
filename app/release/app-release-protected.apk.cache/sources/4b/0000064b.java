package o;

import java.util.Arrays;
import o.jj;

/* renamed from: o.jd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0258jd extends je<C0256jb, C0256jb> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.je
    public final /* synthetic */ int MenuHostHelper$$ExternalSyntheticLambda0(C0256jb c0256jb) {
        C0256jb c0256jb2 = c0256jb;
        int i = c0256jb2.setX;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < c0256jb2.setIconTintList; i3++) {
            i2 += hX.setY(c0256jb2.MenuHostHelper$$ExternalSyntheticLambda1[i3] >>> 3, (hY) c0256jb2.setY[i3]);
        }
        c0256jb2.setX = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.je
    public final /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(C0256jb c0256jb, jj jjVar) {
        c0256jb.setX(jjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.je
    public final /* bridge */ /* synthetic */ void setIconTintList(Object obj, C0256jb c0256jb) {
        ((AbstractC0239il) obj).unknownFields = c0256jb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.je
    public final /* synthetic */ C0256jb setX(C0256jb c0256jb, C0256jb c0256jb2) {
        C0256jb c0256jb3;
        C0256jb c0256jb4;
        C0256jb c0256jb5;
        C0256jb c0256jb6 = c0256jb;
        C0256jb c0256jb7 = c0256jb2;
        c0256jb3 = C0256jb.setUiOptions;
        if (c0256jb3.equals(c0256jb7)) {
            return c0256jb6;
        }
        c0256jb4 = C0256jb.setUiOptions;
        if (!c0256jb4.equals(c0256jb6)) {
            c0256jb5 = C0256jb.setUiOptions;
            if (c0256jb7.equals(c0256jb5)) {
                return c0256jb6;
            }
            if (c0256jb6.MenuHostHelper$$ExternalSyntheticLambda0) {
                int i = c0256jb6.setIconTintList + c0256jb7.setIconTintList;
                int[] iArr = c0256jb6.MenuHostHelper$$ExternalSyntheticLambda1;
                if (i > iArr.length) {
                    int i2 = c0256jb6.setIconTintList;
                    int i3 = i2 + (i2 / 2);
                    if (i3 < i) {
                        i3 = i;
                    }
                    if (i3 < 8) {
                        i3 = 8;
                    }
                    c0256jb6.MenuHostHelper$$ExternalSyntheticLambda1 = Arrays.copyOf(iArr, i3);
                    c0256jb6.setY = Arrays.copyOf(c0256jb6.setY, i3);
                }
                System.arraycopy(c0256jb7.MenuHostHelper$$ExternalSyntheticLambda1, 0, c0256jb6.MenuHostHelper$$ExternalSyntheticLambda1, c0256jb6.setIconTintList, c0256jb7.setIconTintList);
                System.arraycopy(c0256jb7.setY, 0, c0256jb6.setY, c0256jb6.setIconTintList, c0256jb7.setIconTintList);
                c0256jb6.setIconTintList = i;
                return c0256jb6;
            }
            throw new UnsupportedOperationException();
        }
        return C0256jb.MenuHostHelper$$ExternalSyntheticLambda0(c0256jb6, c0256jb7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.je
    public final /* synthetic */ int setY(C0256jb c0256jb) {
        return c0256jb.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.je
    public final /* synthetic */ void setY(C0256jb c0256jb, jj jjVar) {
        C0256jb c0256jb2 = c0256jb;
        if (jjVar.setY() == jj.setY.DESCENDING) {
            for (int i = c0256jb2.setIconTintList - 1; i >= 0; i--) {
                jjVar.setX(c0256jb2.MenuHostHelper$$ExternalSyntheticLambda1[i] >>> 3, c0256jb2.setY[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < c0256jb2.setIconTintList; i2++) {
            jjVar.setX(c0256jb2.MenuHostHelper$$ExternalSyntheticLambda1[i2] >>> 3, c0256jb2.setY[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.je
    public final /* bridge */ /* synthetic */ C0256jb setX(Object obj) {
        return ((AbstractC0239il) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.je
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        ((AbstractC0239il) obj).unknownFields.MenuHostHelper$$ExternalSyntheticLambda0 = false;
    }
}