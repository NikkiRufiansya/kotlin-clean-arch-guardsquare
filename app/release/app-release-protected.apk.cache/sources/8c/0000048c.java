package o;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g$MenuHostHelper$$ExternalSyntheticLambda1 {
    final int MenuHostHelper$$ExternalSyntheticLambda0;
    private final int MenuHostHelper$$ExternalSyntheticLambda1;
    private final C0174g setX;
    private final SparseArray<AbstractC0201h> setY = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public g$MenuHostHelper$$ExternalSyntheticLambda1(C0174g c0174g, setExpandedHintEnabled setexpandedhintenabled) {
        this.setX = c0174g;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setexpandedhintenabled.setNavigationOnClickListener(26, 0);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setexpandedhintenabled.setNavigationOnClickListener(47, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final AbstractC0201h MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        AbstractC0201h abstractC0201h = this.setY.get(i);
        if (abstractC0201h == null) {
            AbstractC0201h x = setX(i);
            this.setY.append(i, x);
            return x;
        }
        return abstractC0201h;
    }

    private AbstractC0201h setX(int i) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            return new onActivityPreCreated(this.setX);
                        }
                        StringBuilder sb = new StringBuilder("Invalid end icon mode: ");
                        sb.append(i);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    return new setTextAppearanceActive(this.setX);
                }
                return new C0260l(this.setX, this.MenuHostHelper$$ExternalSyntheticLambda1);
            }
            return new C0255j(this.setX);
        }
        return new setItemChecked(this.setX);
    }
}