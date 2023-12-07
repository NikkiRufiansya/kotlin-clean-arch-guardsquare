package o;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.firebase.perf.metrics.AppStartTrace;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.Executor;
import o.gC;

/* loaded from: classes.dex */
public class cI {
    public cI(com.google.firebase.FirebaseApp firebaseApp, C0190gp c0190gp, V v, Executor executor) {
        boolean z;
        if (!firebaseApp.setUiOptions.get()) {
            Context context = firebaseApp.setIconTintList;
            final cW y = cW.setY();
            cW.setY.MenuHostHelper$$ExternalSyntheticLambda0 = eB.setX(context);
            y.setX.MenuHostHelper$$ExternalSyntheticLambda1(context);
            cS MenuHostHelper$$ExternalSyntheticLambda1 = cS.MenuHostHelper$$ExternalSyntheticLambda1();
            synchronized (MenuHostHelper$$ExternalSyntheticLambda1) {
                if (!MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext instanceof Application) {
                        ((Application) applicationContext).registerActivityLifecycleCallbacks(MenuHostHelper$$ExternalSyntheticLambda1);
                        MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                    }
                }
            }
            cQ cQVar = new cQ();
            synchronized (MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0) {
                MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0.add(cQVar);
            }
            if (v != null) {
                com.google.firebase.perf.metrics.AppStartTrace y2 = com.google.firebase.perf.metrics.AppStartTrace.setY();
                synchronized (y2) {
                    if (!y2.MenuHostHelper$$ExternalSyntheticLambda0) {
                        setIndicatorOptions.setX().MenuHostHelper$$ExternalSyntheticLambda1().setY(y2);
                        Context applicationContext2 = context.getApplicationContext();
                        if (applicationContext2 instanceof Application) {
                            ((Application) applicationContext2).registerActivityLifecycleCallbacks(y2);
                            if (!y2.setIconTintList && !com.google.firebase.perf.metrics.AppStartTrace.setY(applicationContext2)) {
                                z = false;
                                y2.setIconTintList = z;
                                y2.MenuHostHelper$$ExternalSyntheticLambda0 = true;
                                y2.setY = applicationContext2;
                            }
                            z = true;
                            y2.setIconTintList = z;
                            y2.MenuHostHelper$$ExternalSyntheticLambda0 = true;
                            y2.setY = applicationContext2;
                        }
                    }
                }
                executor.execute(new AppStartTrace.setY(y2));
            }
            gC gCVar = new gC() { // from class: o.cI.2
                @Override // o.gC
                public final boolean setIconTintList() {
                    if (y.setAnimationFromJson()) {
                        return cW.setY().setOnNavigationItemSelectedListener();
                    }
                    return false;
                }

                @Override // o.gC
                public final gC$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1() {
                    return gC$MenuHostHelper$$ExternalSyntheticLambda1.PERFORMANCE;
                }

                @Override // o.gC
                public final void MenuHostHelper$$ExternalSyntheticLambda0(gC.setX setx) {
                    dO iconTintList = dO.setIconTintList(setx.setY);
                    dQ iconTintList2 = dQ.setIconTintList();
                    if (iconTintList.setY != iconTintList2.setIconTintList.setY) {
                        iconTintList2.setIconTintList = iconTintList;
                        synchronized (iconTintList2.MenuHostHelper$$ExternalSyntheticLambda0) {
                            Iterator<WeakReference<dM>> it = iconTintList2.MenuHostHelper$$ExternalSyntheticLambda0.iterator();
                            while (it.hasNext()) {
                                dM dMVar = it.next().get();
                                if (dMVar != null) {
                                    dMVar.setIconTintList(iconTintList);
                                } else {
                                    it.remove();
                                }
                            }
                        }
                        eJ eJVar = iconTintList2.setY.setX;
                        if (iconTintList2.setIconTintList.setIconTintList) {
                            iconTintList2.setX.setX(iconTintList2.setIconTintList.setY, eJVar);
                        }
                        eJ eJVar2 = iconTintList2.setY.setX;
                        if (iconTintList2.setIconTintList.setIconTintList) {
                            iconTintList2.setX.setIconTintList(iconTintList2.setIconTintList, eJVar2);
                        } else {
                            iconTintList2.setX.setY();
                        }
                    }
                }
            };
            pN.setY(gCVar, "");
            gA gAVar = gA.setIconTintList;
            pN.setY(gCVar, "");
            gC$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda12 = gCVar.MenuHostHelper$$ExternalSyntheticLambda1();
            gA$MenuHostHelper$$ExternalSyntheticLambda0 iconTintList = gA.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda12);
            C0191gq c0191gq = null;
            if (iconTintList.setY != null) {
                StringBuilder sb = new StringBuilder("Subscriber ");
                sb.append(MenuHostHelper$$ExternalSyntheticLambda12);
                sb.append(" already registered.");
                Log.d("SessionsDependencies", sb.toString());
            } else {
                iconTintList.setY = gCVar;
                iconTintList.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(null);
            }
            StringBuilder sb2 = new StringBuilder("Registering Sessions SDK subscriber with name: ");
            sb2.append(gCVar.MenuHostHelper$$ExternalSyntheticLambda1());
            sb2.append(", data collection enabled: ");
            sb2.append(gCVar.setIconTintList());
            Log.d("FirebaseSessions", sb2.toString());
            if (c0190gp.MenuHostHelper$$ExternalSyntheticLambda0.setY != null) {
                C0191gq c0191gq2 = c0190gp.MenuHostHelper$$ExternalSyntheticLambda0.setY;
                if (c0191gq2 != null) {
                    c0191gq = c0191gq2;
                } else {
                    pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                }
                gCVar.MenuHostHelper$$ExternalSyntheticLambda0(new gC.setX(c0191gq.MenuHostHelper$$ExternalSyntheticLambda0));
            }
            dQ iconTintList2 = dQ.setIconTintList();
            eJ eJVar = eJ.FOREGROUND;
            if (iconTintList2.setIconTintList.setIconTintList) {
                iconTintList2.setX.setX(iconTintList2.setIconTintList.setY, eJVar);
            }
            eJ eJVar2 = eJ.FOREGROUND;
            if (iconTintList2.setIconTintList.setIconTintList) {
                iconTintList2.setX.setIconTintList(iconTintList2.setIconTintList, eJVar2);
                return;
            } else {
                iconTintList2.setX.setY();
                return;
            }
        }
        throw new IllegalStateException("FirebaseApp was deleted");
    }
}