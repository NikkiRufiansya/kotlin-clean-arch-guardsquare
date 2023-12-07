package o;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;

@nH
/* loaded from: classes.dex */
public class cR {
    private static final C0106dm MenuHostHelper$$ExternalSyntheticLambda1 = C0106dm.setY();
    private final com.google.firebase.FirebaseApp MenuHostHelper$$ExternalSyntheticLambda0;
    private final InterfaceC0083cq setIconTintList;
    private Boolean setLayoutAnimation;
    private final InterfaceC0073cg<C0172fz> setOnLongClickListener;
    private final C0143ex setUiOptions;
    private final InterfaceC0073cg<setIconPadding> setUnboundedRipple;
    public final Map<String, String> setX = new ConcurrentHashMap();
    private final cW setY;

    public static cR setY() {
        return (cR) com.google.firebase.FirebaseApp.MenuHostHelper$$ExternalSyntheticLambda0().setY(cR.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @nE
    public cR(com.google.firebase.FirebaseApp firebaseApp, InterfaceC0073cg<C0172fz> interfaceC0073cg, InterfaceC0083cq interfaceC0083cq, InterfaceC0073cg<setIconPadding> interfaceC0073cg2, cY cYVar, cW cWVar, final dQ dQVar) {
        boolean iconTintList;
        this.setLayoutAnimation = null;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = firebaseApp;
        this.setOnLongClickListener = interfaceC0073cg;
        this.setIconTintList = interfaceC0083cq;
        this.setUnboundedRipple = interfaceC0073cg2;
        if (firebaseApp == null) {
            this.setLayoutAnimation = Boolean.FALSE;
            this.setY = cWVar;
            this.setUiOptions = new C0143ex(new Bundle());
            return;
        }
        final C0126eg iconTintList2 = C0126eg.setIconTintList();
        iconTintList2.setX = firebaseApp;
        if (!firebaseApp.setUiOptions.get()) {
            iconTintList2.setLayoutAnimation = firebaseApp.setNavigationOnClickListener.setX;
            iconTintList2.setIconTintList = interfaceC0083cq;
            iconTintList2.MenuHostHelper$$ExternalSyntheticLambda1 = interfaceC0073cg2;
            iconTintList2.MenuHostHelper$$ExternalSyntheticLambda0.execute(new Runnable() { // from class: o.em
                @Override // java.lang.Runnable
                public final void run() {
                    C0126eg.setX(C0126eg.this);
                }
            });
            if (!firebaseApp.setUiOptions.get()) {
                final Context context = firebaseApp.setIconTintList;
                C0143ex MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(context);
                this.setUiOptions = MenuHostHelper$$ExternalSyntheticLambda12;
                cYVar.setY = interfaceC0073cg;
                this.setY = cWVar;
                cWVar.MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda12;
                cW.setY.MenuHostHelper$$ExternalSyntheticLambda0 = eB.setX(context);
                cWVar.setX.MenuHostHelper$$ExternalSyntheticLambda1(context);
                final dO dOVar = dQVar.setIconTintList;
                dQVar.MenuHostHelper$$ExternalSyntheticLambda1 = Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: o.dS
                    @Override // java.lang.Runnable
                    public final void run() {
                        dQ dQVar2 = dQ.this;
                        Context context2 = context;
                        dO dOVar2 = dOVar;
                        dQVar2.setX.setIconTintList = new C0121eb(context2);
                        if (dOVar2.setIconTintList) {
                            dQVar2.setX.setX(dOVar2.setY, eJ.MenuHostHelper$$ExternalSyntheticLambda1);
                        }
                    }
                });
                this.setLayoutAnimation = cWVar.setX();
                C0106dm c0106dm = MenuHostHelper$$ExternalSyntheticLambda1;
                if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                    Boolean bool = this.setLayoutAnimation;
                    if (bool != null) {
                        iconTintList = bool.booleanValue();
                    } else {
                        com.google.firebase.FirebaseApp MenuHostHelper$$ExternalSyntheticLambda0 = com.google.firebase.FirebaseApp.MenuHostHelper$$ExternalSyntheticLambda0();
                        if (!MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions.get()) {
                            iconTintList = MenuHostHelper$$ExternalSyntheticLambda0.setY.MenuHostHelper$$ExternalSyntheticLambda0().setIconTintList();
                        } else {
                            throw new IllegalStateException("FirebaseApp was deleted");
                        }
                    }
                    if (iconTintList) {
                        Object[] objArr = new Object[1];
                        if (!(!firebaseApp.setUiOptions.get())) {
                            throw new IllegalStateException("FirebaseApp was deleted");
                        }
                        objArr[0] = String.format("%s/trends?utm_source=%s&utm_medium=%s", String.format("%s/project/%s/performance/app/android:%s", "https://console.firebase.google.com", firebaseApp.setNavigationOnClickListener.setX, context.getPackageName()), "perf-android-sdk", "android-ide");
                        String format = String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", objArr);
                        if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                            Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                            Log.i("FirebasePerformance", format);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("FirebaseApp was deleted");
        }
        throw new IllegalStateException("FirebaseApp was deleted");
    }

    private static C0143ex MenuHostHelper$$ExternalSyntheticLambda1(Context context) {
        Bundle bundle;
        try {
            bundle = ((PackageItemInfo) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128)).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            StringBuilder sb = new StringBuilder("No perf enable meta data found ");
            sb.append(e.getMessage());
            Log.d("isEnabled", sb.toString());
            bundle = null;
        }
        return bundle != null ? new C0143ex(bundle) : new C0143ex();
    }
}