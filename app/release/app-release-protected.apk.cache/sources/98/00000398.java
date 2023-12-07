package o;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: o.cu  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087cu {
    private static C0087cu setY;
    public final cJ MenuHostHelper$$ExternalSyntheticLambda1;
    private static long setX = TimeUnit.HOURS.toSeconds(1);
    private static final Pattern setIconTintList = Pattern.compile("\\AA[\\w-]{38}\\z");

    private C0087cu(cJ cJVar) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = cJVar;
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(AbstractC0091cy abstractC0091cy) {
        return TextUtils.isEmpty(abstractC0091cy.setX()) || abstractC0091cy.setNavigationOnClickListener() + abstractC0091cy.MenuHostHelper$$ExternalSyntheticLambda0() < TimeUnit.MILLISECONDS.toSeconds(this.MenuHostHelper$$ExternalSyntheticLambda1.setX()) + setX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setIconTintList(String str) {
        return str.contains(":");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setX(String str) {
        return setIconTintList.matcher(str).matches();
    }

    public static long setX() {
        return (long) (Math.random() * 1000.0d);
    }

    public static C0087cu setIconTintList() {
        if (cK.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            cK.MenuHostHelper$$ExternalSyntheticLambda1 = new cK();
        }
        cK cKVar = cK.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setY == null) {
            setY = new C0087cu(cKVar);
        }
        return setY;
    }
}