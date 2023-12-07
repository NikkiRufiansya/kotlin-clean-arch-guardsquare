package o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import o.nR;

/* renamed from: o.gy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199gy {
    final gJ MenuHostHelper$$ExternalSyntheticLambda0;
    long MenuHostHelper$$ExternalSyntheticLambda1;
    final InterfaceC0200gz setIconTintList;
    private final oM setUiOptions;
    private final C0196gv setUnboundedRipple;
    final Application.ActivityLifecycleCallbacks setX;
    final gE setY;

    public C0199gy(gE gEVar, oM oMVar, InterfaceC0200gz interfaceC0200gz, gJ gJVar, C0196gv c0196gv) {
        pN.setY(gEVar, "");
        pN.setY(oMVar, "");
        pN.setY(interfaceC0200gz, "");
        pN.setY(gJVar, "");
        pN.setY(c0196gv, "");
        this.setY = gEVar;
        this.setUiOptions = oMVar;
        this.setIconTintList = interfaceC0200gz;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = gJVar;
        this.setUnboundedRipple = c0196gv;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = gEVar.MenuHostHelper$$ExternalSyntheticLambda1();
        MenuHostHelper$$ExternalSyntheticLambda0();
        this.setX = new setX();
    }

    final void MenuHostHelper$$ExternalSyntheticLambda0() {
        C0435ro.MenuHostHelper$$ExternalSyntheticLambda1(rS.setX(this.setUiOptions), null, null, new setY(this.setUnboundedRipple.setY(), null), 3);
    }

    /* renamed from: o.gy$setX */
    /* loaded from: classes.dex */
    public static final class setX implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            pN.setY(activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            pN.setY(activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            pN.setY(activity, "");
            pN.setY(bundle, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            pN.setY(activity, "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            pN.setY(activity, "");
        }

        setX() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (o.gJ.setX(r3) != false) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
            if (o.gJ.setX(r3) != false) goto L5;
         */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onActivityResumed(android.app.Activity r7) {
            /*
                r6 = this;
                java.lang.String r0 = ""
                o.pN.setY(r7, r0)
                o.gy r7 = o.C0199gy.this
                o.gE r0 = r7.setY
                long r0 = r0.MenuHostHelper$$ExternalSyntheticLambda1()
                long r2 = r7.MenuHostHelper$$ExternalSyntheticLambda1
                long r0 = o.C0429ri.MenuHostHelper$$ExternalSyntheticLambda1(r0, r2)
                o.gJ r2 = r7.MenuHostHelper$$ExternalSyntheticLambda0
                o.gL r3 = r2.setY
                o.ri r3 = r3.MenuHostHelper$$ExternalSyntheticLambda0()
                if (r3 == 0) goto L26
                long r3 = r3.setY
                boolean r5 = o.gJ.setX(r3)
                if (r5 == 0) goto L26
                goto L41
            L26:
                o.gL r2 = r2.setX
                o.ri r2 = r2.MenuHostHelper$$ExternalSyntheticLambda0()
                if (r2 == 0) goto L37
                long r3 = r2.setY
                boolean r2 = o.gJ.setX(r3)
                if (r2 == 0) goto L37
                goto L41
            L37:
                o.ri$MenuHostHelper$$ExternalSyntheticLambda1 r2 = o.C0429ri.setIconTintList
                r2 = 30
                o.re r3 = o.EnumC0425re.MINUTES
                long r3 = o.C0426rf.setX(r2, r3)
            L41:
                int r0 = o.C0429ri.setIconTintList(r0, r3)
                if (r0 <= 0) goto L4a
                r7.MenuHostHelper$$ExternalSyntheticLambda0()
            L4a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0199gy.setX.onActivityResumed(android.app.Activity):void");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            pN.setY(activity, "");
            C0199gy c0199gy = C0199gy.this;
            c0199gy.MenuHostHelper$$ExternalSyntheticLambda1 = c0199gy.setY.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.gy$setY */
    /* loaded from: classes.dex */
    public static final class setY extends AbstractC0368pb implements InterfaceC0389pw<rU, oK<? super nX>, Object> {
        private int setIconTintList;
        private /* synthetic */ C0191gq setY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setY(C0191gq c0191gq, oK<? super setY> oKVar) {
            super(2, oKVar);
            this.setY = c0191gq;
        }

        @Override // o.oR
        public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<?> oKVar) {
            return new setY(this.setY, oKVar);
        }

        @Override // o.InterfaceC0389pw
        public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(rU rUVar, oK<? super nX> oKVar) {
            return new setY(this.setY, oKVar).setY(nX.setX);
        }

        @Override // o.oR
        public final Object setY(Object obj) {
            oJ oJVar = oJ.COROUTINE_SUSPENDED;
            int i = this.setIconTintList;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (obj instanceof nR.setX) {
                    throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
                }
            } else if (!(obj instanceof nR.setX)) {
                this.setIconTintList = 1;
                if (C0199gy.this.setIconTintList.setY(this.setY, this) == oJVar) {
                    return oJVar;
                }
            } else {
                throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
            }
            return nX.setX;
        }
    }
}