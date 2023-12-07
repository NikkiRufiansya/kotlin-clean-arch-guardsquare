package com.google.firebase;

import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import o.setDividerDrawable;

/* loaded from: classes.dex */
class FirebaseApp$MenuHostHelper$$ExternalSyntheticLambda1 implements setDividerDrawable.setX {
    private static AtomicReference<FirebaseApp$MenuHostHelper$$ExternalSyntheticLambda1> setY = new AtomicReference<>();

    private FirebaseApp$MenuHostHelper$$ExternalSyntheticLambda1() {
    }

    @Override // o.setDividerDrawable.setX
    public final void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        synchronized (FirebaseApp.setIconTintList()) {
            Iterator it = new ArrayList(FirebaseApp.setX.values()).iterator();
            while (it.hasNext()) {
                FirebaseApp firebaseApp = (FirebaseApp) it.next();
                if (FirebaseApp.setIconTintList(firebaseApp).get()) {
                    FirebaseApp.MenuHostHelper$$ExternalSyntheticLambda0(firebaseApp, z);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void setX(Context context) {
        boolean z;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            if (setY.get() == null) {
                FirebaseApp$MenuHostHelper$$ExternalSyntheticLambda1 firebaseApp$MenuHostHelper$$ExternalSyntheticLambda1 = new FirebaseApp$MenuHostHelper$$ExternalSyntheticLambda1();
                AtomicReference<FirebaseApp$MenuHostHelper$$ExternalSyntheticLambda1> atomicReference = setY;
                while (true) {
                    if (!atomicReference.compareAndSet(null, firebaseApp$MenuHostHelper$$ExternalSyntheticLambda1)) {
                        if (atomicReference.get() != null) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    setDividerDrawable.setX(application);
                    setDividerDrawable setdividerdrawable = setDividerDrawable.setX;
                    synchronized (setDividerDrawable.setX) {
                        setdividerdrawable.setY.add(firebaseApp$MenuHostHelper$$ExternalSyntheticLambda1);
                    }
                }
            }
        }
    }
}