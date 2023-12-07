package o;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* renamed from: o.gp  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190gp {
    public final C0196gv MenuHostHelper$$ExternalSyntheticLambda0;
    private final C0192gr MenuHostHelper$$ExternalSyntheticLambda1;
    private final com.google.firebase.FirebaseApp setIconTintList;
    private final gJ setLayoutAnimation;
    private final gE setUnboundedRipple;
    private final C0181gg setX;
    private final C0183gi setY;

    static {
        new setIconTintList((byte) 0);
    }

    public C0190gp(com.google.firebase.FirebaseApp firebaseApp, InterfaceC0083cq interfaceC0083cq, rQ rQVar, rQ rQVar2, InterfaceC0073cg<setIconPadding> interfaceC0073cg) {
        pN.setY(firebaseApp, "");
        pN.setY(interfaceC0083cq, "");
        pN.setY(rQVar, "");
        pN.setY(rQVar2, "");
        pN.setY(interfaceC0073cg, "");
        this.setIconTintList = firebaseApp;
        C0197gw c0197gw = C0197gw.MenuHostHelper$$ExternalSyntheticLambda0;
        C0181gg y = C0197gw.setY(firebaseApp);
        this.setX = y;
        if (!firebaseApp.setUiOptions.get()) {
            Context context = firebaseApp.setIconTintList;
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) context, "");
            rQ rQVar3 = rQVar;
            gJ gJVar = new gJ(context, rQVar2, rQVar3, interfaceC0083cq, y);
            this.setLayoutAnimation = gJVar;
            gD gDVar = new gD();
            this.setUnboundedRipple = gDVar;
            C0183gi c0183gi = new C0183gi(interfaceC0073cg);
            this.setY = c0183gi;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new C0192gr(interfaceC0083cq, c0183gi);
            C0196gv c0196gv = new C0196gv(Math.random() <= this.setLayoutAnimation.setY(), gDVar);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = c0196gv;
            final C0199gy c0199gy = new C0199gy(gDVar, rQVar3, new setX(), gJVar, c0196gv);
            if (!firebaseApp.setUiOptions.get()) {
                final Context applicationContext = firebaseApp.setIconTintList.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(c0199gy.setX);
                    Object obj = new Object() { // from class: o.gn
                    };
                    if (!firebaseApp.setUiOptions.get()) {
                        firebaseApp.setUnboundedRipple.add(obj);
                        return;
                    }
                    throw new IllegalStateException("FirebaseApp was deleted");
                }
                StringBuilder sb = new StringBuilder("Failed to register lifecycle callbacks, unexpected context ");
                sb.append(applicationContext.getClass());
                sb.append('.');
                Log.e("FirebaseSessions", sb.toString());
                return;
            }
            throw new IllegalStateException("FirebaseApp was deleted");
        }
        throw new IllegalStateException("FirebaseApp was deleted");
    }

    /* renamed from: o.gp$setX */
    /* loaded from: classes.dex */
    public static final class setX implements InterfaceC0200gz {
        setX() {
        }

        @Override // o.InterfaceC0200gz
        public final Object setY(C0191gq c0191gq, oK<? super nX> oKVar) {
            Object MenuHostHelper$$ExternalSyntheticLambda1 = C0190gp.this.MenuHostHelper$$ExternalSyntheticLambda1(c0191gq, oKVar);
            return MenuHostHelper$$ExternalSyntheticLambda1 == oJ.COROUTINE_SUSPENDED ? MenuHostHelper$$ExternalSyntheticLambda1 : nX.setX;
        }
    }

    /* renamed from: o.gp$setIconTintList */
    /* loaded from: classes.dex */
    public static final class setIconTintList {
        public /* synthetic */ setIconTintList(byte b) {
            this();
        }

        private setIconTintList() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|7|(1:(1:(1:(2:12|(3:14|15|16)(2:18|19))(2:20|21))(5:22|(2:24|25)|26|(1:28)(2:45|(1:47))|(2:30|31)(2:32|(2:34|35)(7:36|37|38|39|(1:41)|15|16))))(2:48|(2:50|51)))(2:81|(2:83|(1:85)(1:86))(2:87|88))|52|(2:54|55)(7:56|(2:59|57)|60|61|(3:73|(3:76|(2:78|79)|74)|80)|65|(2:67|68)(2:69|(1:71)(4:72|26|(0)(0)|(0)(0))))))|91|6|7|(0)(0)|52|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
        r18 = "FirebaseSessions";
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object MenuHostHelper$$ExternalSyntheticLambda1(o.C0191gq r20, o.oK<? super o.nX> r21) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0190gp.MenuHostHelper$$ExternalSyntheticLambda1(o.gq, o.oK):java.lang.Object");
    }
}