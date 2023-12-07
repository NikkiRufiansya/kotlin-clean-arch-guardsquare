package o;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import o.C0149fc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117dy {
    private final C0118dz setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0117dy(C0118dz c0118dz) {
        this.setX = c0118dz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C0149fc setY() {
        C0149fc.setX textAlignment;
        textAlignment = C0149fc.DEFAULT_INSTANCE.setTextAlignment();
        C0149fc.setX x = textAlignment.MenuHostHelper$$ExternalSyntheticLambda0(this.setX.MenuHostHelper$$ExternalSyntheticLambda1).MenuHostHelper$$ExternalSyntheticLambda1(this.setX.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0).setX(this.setX.setY.setX - this.setX.MenuHostHelper$$ExternalSyntheticLambda0.setX);
        for (C0110dr c0110dr : this.setX.setX.values()) {
            x.MenuHostHelper$$ExternalSyntheticLambda1(c0110dr.setX, c0110dr.MenuHostHelper$$ExternalSyntheticLambda0.get());
        }
        List<C0118dz> list = this.setX.setUnboundedRipple;
        if (!list.isEmpty()) {
            for (C0118dz c0118dz : list) {
                x.MenuHostHelper$$ExternalSyntheticLambda1(new C0117dy(c0118dz).setY());
            }
        }
        x.MenuHostHelper$$ExternalSyntheticLambda1(new HashMap(this.setX.setIconTintList));
        eX[] MenuHostHelper$$ExternalSyntheticLambda1 = dO.MenuHostHelper$$ExternalSyntheticLambda1(this.setX.MenuHostHelper$$ExternalSyntheticLambda1());
        if (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            x.MenuHostHelper$$ExternalSyntheticLambda0(Arrays.asList(MenuHostHelper$$ExternalSyntheticLambda1));
        }
        return x.ViewPager$SavedState$1();
    }
}