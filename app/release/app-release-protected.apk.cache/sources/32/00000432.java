package o;

import o.C0116dx;

/* renamed from: o.eu  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0140eu {
    private static final C0106dm setIconTintList = C0106dm.setY();

    public static C0118dz setIconTintList(C0118dz c0118dz, C0116dx.setIconTintList seticontintlist) {
        if (seticontintlist.setIconTintList > 0) {
            c0118dz.setY(es$MenuHostHelper$$ExternalSyntheticLambda1.FRAMES_TOTAL.toString(), seticontintlist.setIconTintList);
        }
        if (seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 > 0) {
            c0118dz.setY(es$MenuHostHelper$$ExternalSyntheticLambda1.FRAMES_SLOW.toString(), seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1);
        }
        if (seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0 > 0) {
            c0118dz.setY(es$MenuHostHelper$$ExternalSyntheticLambda1.FRAMES_FROZEN.toString(), seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        C0106dm c0106dm = setIconTintList;
        StringBuilder sb = new StringBuilder("Screen trace: ");
        sb.append(c0118dz.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(" _fr_tot:");
        sb.append(seticontintlist.setIconTintList);
        sb.append(" _fr_slo:");
        sb.append(seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(" _fr_fzn:");
        sb.append(seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0);
        String obj = sb.toString();
        if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
            Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
            Cdo.setIconTintList(obj);
        }
        return c0118dz;
    }
}