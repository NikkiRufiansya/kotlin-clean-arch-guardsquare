package o;

import java.util.Arrays;
import o.nR;
import o.tP;

/* loaded from: classes.dex */
public abstract class tJ<S extends tP<?>> {
    private tX MenuHostHelper$$ExternalSyntheticLambda1;
    private int setIconTintList;
    private int setX;
    private S[] setY;

    protected abstract S setIconTintList();

    protected abstract S[] setX();

    public static final /* synthetic */ tP[] setIconTintList(tJ tJVar) {
        return tJVar.setY;
    }

    public static final /* synthetic */ int setY(tJ tJVar) {
        return tJVar.setX;
    }

    public final S[] setNavigationOnClickListener() {
        return this.setY;
    }

    public final int setY() {
        return this.setX;
    }

    public final S MenuHostHelper$$ExternalSyntheticLambda1() {
        S s;
        synchronized (this) {
            S[] sArr = this.setY;
            if (sArr == null) {
                sArr = setX();
                this.setY = sArr;
            } else if (this.setX >= sArr.length) {
                Object[] copyOf = Arrays.copyOf(sArr, sArr.length << 1);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) copyOf, "");
                this.setY = (S[]) ((tP[]) copyOf);
                sArr = (S[]) ((tP[]) copyOf);
            }
            int i = this.setIconTintList;
            do {
                s = sArr[i];
                if (s == null) {
                    s = setIconTintList();
                    sArr[i] = s;
                }
                i++;
                if (i >= sArr.length) {
                    i = 0;
                }
            } while (!s.setIconTintList(this));
            this.setIconTintList = i;
            this.setX++;
        }
        return s;
    }

    public final void setY(S s) {
        int i;
        oK<nX>[] x;
        synchronized (this) {
            int i2 = this.setX - 1;
            this.setX = i2;
            if (i2 == 0) {
                this.setIconTintList = 0;
            }
            x = s.setX(this);
        }
        for (oK<nX> oKVar : x) {
            if (oKVar != null) {
                nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                oKVar.MenuHostHelper$$ExternalSyntheticLambda0(nR.setX(nX.setX));
            }
        }
    }
}