package o;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import o.setDividerDrawable;

/* renamed from: o.fz$MenuHostHelper$$ExternalSyntheticLambda1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0173fz$MenuHostHelper$$ExternalSyntheticLambda1 implements setDividerDrawable.setX {
    private static final AtomicReference<C0173fz$MenuHostHelper$$ExternalSyntheticLambda1> setIconTintList = new AtomicReference<>();

    private C0173fz$MenuHostHelper$$ExternalSyntheticLambda1() {
    }

    @Override // o.setDividerDrawable.setX
    public final void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        C0172fz.setX(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void setIconTintList(Context context) {
        boolean z;
        Application application = (Application) context.getApplicationContext();
        AtomicReference<C0173fz$MenuHostHelper$$ExternalSyntheticLambda1> atomicReference = setIconTintList;
        if (atomicReference.get() == null) {
            C0173fz$MenuHostHelper$$ExternalSyntheticLambda1 c0173fz$MenuHostHelper$$ExternalSyntheticLambda1 = new C0173fz$MenuHostHelper$$ExternalSyntheticLambda1();
            while (true) {
                if (!atomicReference.compareAndSet(null, c0173fz$MenuHostHelper$$ExternalSyntheticLambda1)) {
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
                    setdividerdrawable.setY.add(c0173fz$MenuHostHelper$$ExternalSyntheticLambda1);
                }
            }
        }
    }
}