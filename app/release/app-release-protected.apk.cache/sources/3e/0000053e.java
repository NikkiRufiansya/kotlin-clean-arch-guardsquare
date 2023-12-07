package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import o.bB;

/* renamed from: o.gw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197gw {
    public static final C0197gw MenuHostHelper$$ExternalSyntheticLambda0 = new C0197gw();
    private static final InterfaceC0059bt setY;

    private C0197gw() {
    }

    public static InterfaceC0059bt setX() {
        return setY;
    }

    static {
        bB bBVar = new bB();
        C0182gh.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(bBVar);
        bBVar.setY = true;
        bB.AnonymousClass2 anonymousClass2 = new bB.AnonymousClass2();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) anonymousClass2, "");
        setY = anonymousClass2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static EnumC0185gk setX(gC gCVar) {
        if (gCVar == null) {
            return EnumC0185gk.COLLECTION_SDK_NOT_INSTALLED;
        }
        if (gCVar.setIconTintList()) {
            return EnumC0185gk.COLLECTION_ENABLED;
        }
        return EnumC0185gk.COLLECTION_DISABLED;
    }

    public static C0181gg setY(com.google.firebase.FirebaseApp firebaseApp) {
        String valueOf;
        pN.setY(firebaseApp, "");
        if (!firebaseApp.setUiOptions.get()) {
            Context context = firebaseApp.setIconTintList;
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) context, "");
            String packageName = context.getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            if (Build.VERSION.SDK_INT >= 28) {
                valueOf = String.valueOf(packageInfo.getLongVersionCode());
            } else {
                valueOf = String.valueOf(packageInfo.versionCode);
            }
            if (!(!firebaseApp.setUiOptions.get())) {
                throw new IllegalStateException("FirebaseApp was deleted");
            }
            String str = firebaseApp.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0;
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str, "");
            String str2 = Build.MODEL;
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str2, "");
            String str3 = Build.VERSION.RELEASE;
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str3, "");
            EnumC0195gu enumC0195gu = EnumC0195gu.LOG_ENVIRONMENT_PROD;
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) packageName, "");
            String str4 = packageInfo.versionName;
            if (str4 == null) {
                str4 = valueOf;
            }
            String str5 = Build.MANUFACTURER;
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str5, "");
            return new C0181gg(str, str2, "1.1.0", str3, enumC0195gu, new C0178gd(packageName, str4, valueOf, str5));
        }
        throw new IllegalStateException("FirebaseApp was deleted");
    }
}