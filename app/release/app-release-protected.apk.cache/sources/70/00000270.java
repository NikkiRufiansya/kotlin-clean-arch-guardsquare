package o;

import android.util.SparseArray;
import java.util.ArrayList;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;

/* loaded from: classes.dex */
public class WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$ViewPager$SavedState$1 {
    SparseArray<setY> setY = new SparseArray<>();
    int MenuHostHelper$$ExternalSyntheticLambda0 = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY {
        final ArrayList<WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled> setX = new ArrayList<>();
        int setY = 5;
        long MenuHostHelper$$ExternalSyntheticLambda0 = 0;
        long MenuHostHelper$$ExternalSyntheticLambda1 = 0;

        setY() {
        }
    }

    public final WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setIconTintList(int i) {
        setY sety = this.setY.get(0);
        if (sety == null || sety.setX.isEmpty()) {
            return null;
        }
        ArrayList<WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled> arrayList = sety.setX;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!arrayList.get(size).setX()) {
                return arrayList.remove(size);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long setIconTintList(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(int i, long j) {
        setY x = setX(0);
        long j2 = x.MenuHostHelper$$ExternalSyntheticLambda0;
        if (j2 != 0) {
            j = (j / 4) + ((j2 / 4) * 3);
        }
        x.MenuHostHelper$$ExternalSyntheticLambda0 = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(int i, long j, long j2) {
        long j3 = setX(0).MenuHostHelper$$ExternalSyntheticLambda0;
        return j3 == 0 || j + j3 < j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setY setX(int i) {
        setY sety = this.setY.get(i);
        if (sety == null) {
            setY sety2 = new setY();
            this.setY.put(i, sety2);
            return sety2;
        }
        return sety;
    }

    public final void setY(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled) {
        int i = setcheckediconenabled.setY;
        ArrayList<WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled> arrayList = setX(i).setX;
        if (this.setY.get(i).setY <= arrayList.size()) {
            return;
        }
        setcheckediconenabled.setY();
        arrayList.add(setcheckediconenabled);
    }
}