package o;

import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* renamed from: o.fz */
/* loaded from: classes.dex */
public class C0172fz {
    private final String MenuHostHelper$$ExternalSyntheticLambda0;
    private final InterfaceC0083cq setChipCornerRadius;
    private final Map<String, C0163fq> setIconSize;
    private final InterfaceC0073cg<InterfaceC0020ah> setIconTintList;
    private final com.google.firebase.FirebaseApp setLayoutAnimation;
    private final ScheduledExecutorService setNavigationOnClickListener;
    private Map<String, String> setOnLongClickListener;
    private final Context setUiOptions;
    private final C0013aa setUnboundedRipple;
    private static final setSpinnersShown setY = FragmentContainerView.MenuHostHelper$$ExternalSyntheticLambda1;
    private static final Random setX = new Random();
    private static final Map<String, C0163fq> MenuHostHelper$$ExternalSyntheticLambda1 = new HashMap();

    public static /* synthetic */ InterfaceC0020ah setY() {
        return null;
    }

    public static /* synthetic */ void setX(boolean z) {
        synchronized (C0172fz.class) {
            for (C0163fq c0163fq : MenuHostHelper$$ExternalSyntheticLambda1.values()) {
                fW fWVar = c0163fq.MenuHostHelper$$ExternalSyntheticLambda1;
                synchronized (fWVar) {
                    fWVar.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 = z;
                    if (!z) {
                        synchronized (fWVar) {
                            if (!fWVar.setY.isEmpty()) {
                                fWVar.MenuHostHelper$$ExternalSyntheticLambda0.setX(0L);
                            }
                        }
                    }
                }
            }
        }
    }

    public C0172fz(Context context, ScheduledExecutorService scheduledExecutorService, com.google.firebase.FirebaseApp firebaseApp, InterfaceC0083cq interfaceC0083cq, C0013aa c0013aa, InterfaceC0073cg<InterfaceC0020ah> interfaceC0073cg) {
        this(context, scheduledExecutorService, firebaseApp, interfaceC0083cq, c0013aa, interfaceC0073cg, (byte) 0);
    }

    private C0172fz(Context context, ScheduledExecutorService scheduledExecutorService, com.google.firebase.FirebaseApp firebaseApp, InterfaceC0083cq interfaceC0083cq, C0013aa c0013aa, InterfaceC0073cg<InterfaceC0020ah> interfaceC0073cg, byte b) {
        this.setIconSize = new HashMap();
        this.setOnLongClickListener = new HashMap();
        this.setUiOptions = context;
        this.setNavigationOnClickListener = scheduledExecutorService;
        this.setLayoutAnimation = firebaseApp;
        this.setChipCornerRadius = interfaceC0083cq;
        this.setUnboundedRipple = c0013aa;
        this.setIconTintList = interfaceC0073cg;
        if (!firebaseApp.setUiOptions.get()) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = firebaseApp.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0;
            C0173fz$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(context);
            AppBarLayout$BaseBehavior$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0(scheduledExecutorService, new Callable() { // from class: o.fG
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C0172fz.this.MenuHostHelper$$ExternalSyntheticLambda0("firebase");
                }
            });
            return;
        }
        throw new IllegalStateException("FirebaseApp was deleted");
    }

    public final C0163fq MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        C0163fq iconTintList;
        synchronized (this) {
            fK MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(str, "fetch");
            fK MenuHostHelper$$ExternalSyntheticLambda13 = MenuHostHelper$$ExternalSyntheticLambda1(str, "activate");
            fK MenuHostHelper$$ExternalSyntheticLambda14 = MenuHostHelper$$ExternalSyntheticLambda1(str, "defaults");
            fZ fZVar = new fZ(this.setUiOptions.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", this.MenuHostHelper$$ExternalSyntheticLambda0, str, "settings"), 0));
            fT fTVar = new fT(this.setNavigationOnClickListener, MenuHostHelper$$ExternalSyntheticLambda13, MenuHostHelper$$ExternalSyntheticLambda14);
            com.google.firebase.FirebaseApp firebaseApp = this.setLayoutAnimation;
            InterfaceC0073cg<InterfaceC0020ah> interfaceC0073cg = this.setIconTintList;
            if (!firebaseApp.setUiOptions.get()) {
                final C0179ge c0179ge = (firebaseApp.setOnLongClickListener.equals("[DEFAULT]") && str.equals("firebase")) ? new C0179ge(interfaceC0073cg) : null;
                if (c0179ge != null) {
                    Objects.requireNonNull(c0179ge);
                    setSearchResultHighlights<String, fP> setsearchresulthighlights = new setSearchResultHighlights() { // from class: o.fF
                        @Override // o.setSearchResultHighlights
                        public final void setIconTintList(Object obj, Object obj2) {
                            JSONObject optJSONObject;
                            C0179ge c0179ge2 = C0179ge.this;
                            String str2 = (String) obj;
                            fP fPVar = (fP) obj2;
                            if (c0179ge2.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0() != null) {
                                JSONObject jSONObject = fPVar.setX;
                                if (jSONObject.length() <= 0) {
                                    return;
                                }
                                JSONObject jSONObject2 = fPVar.setY;
                                if (jSONObject2.length() > 0 && (optJSONObject = jSONObject.optJSONObject(str2)) != null) {
                                    String optString = optJSONObject.optString("choiceId");
                                    if (optString.isEmpty()) {
                                        return;
                                    }
                                    synchronized (c0179ge2.setIconTintList) {
                                        if (optString.equals(c0179ge2.setIconTintList.get(str2))) {
                                            return;
                                        }
                                        c0179ge2.setIconTintList.put(str2, optString);
                                        Bundle bundle = new Bundle();
                                        bundle.putString("arm_key", str2);
                                        bundle.putString("arm_value", jSONObject2.optString(str2));
                                        bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                        bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                        bundle.putString("group", optJSONObject.optString("group"));
                                        new Bundle().putString("_fpid", optString);
                                    }
                                }
                            }
                        }
                    };
                    synchronized (fTVar.MenuHostHelper$$ExternalSyntheticLambda0) {
                        fTVar.MenuHostHelper$$ExternalSyntheticLambda0.add(setsearchresulthighlights);
                    }
                }
                iconTintList = setIconTintList(this.setLayoutAnimation, str, this.setChipCornerRadius, this.setUnboundedRipple, this.setNavigationOnClickListener, MenuHostHelper$$ExternalSyntheticLambda12, MenuHostHelper$$ExternalSyntheticLambda13, MenuHostHelper$$ExternalSyntheticLambda14, setX(str, MenuHostHelper$$ExternalSyntheticLambda12, fZVar), fTVar, fZVar);
            } else {
                throw new IllegalStateException("FirebaseApp was deleted");
            }
        }
        return iconTintList;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private o.C0163fq setIconTintList(com.google.firebase.FirebaseApp r24, java.lang.String r25, o.InterfaceC0083cq r26, o.C0013aa r27, java.util.concurrent.Executor r28, o.fK r29, o.fK r30, o.fK r31, o.fN r32, o.fT r33, o.fZ r34) {
        /*
            r23 = this;
            r9 = r23
            r0 = r24
            r15 = r25
            monitor-enter(r23)
            java.util.Map<java.lang.String, o.fq> r1 = r9.setIconSize     // Catch: java.lang.Throwable -> L94
            boolean r1 = r1.containsKey(r15)     // Catch: java.lang.Throwable -> L94
            if (r1 != 0) goto L89
            o.fq r14 = new o.fq     // Catch: java.lang.Throwable -> L94
            android.content.Context r11 = r9.setUiOptions     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = "firebase"
            boolean r1 = r15.equals(r1)     // Catch: java.lang.Throwable -> L94
            r2 = 1
            if (r1 == 0) goto L38
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.setUiOptions     // Catch: java.lang.Throwable -> L94
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L94
            r1 = r1 ^ r2
            java.lang.String r3 = "FirebaseApp was deleted"
            if (r1 == 0) goto L32
            java.lang.String r1 = r0.setOnLongClickListener     // Catch: java.lang.Throwable -> L94
            java.lang.String r3 = "[DEFAULT]"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L94
            if (r1 == 0) goto L38
            goto L39
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L94
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L94
            throw r0     // Catch: java.lang.Throwable -> L94
        L38:
            r2 = 0
        L39:
            if (r2 == 0) goto L3e
            r16 = r27
            goto L41
        L3e:
            r1 = 0
            r16 = r1
        L41:
            android.content.Context r6 = r9.setUiOptions     // Catch: java.lang.Throwable -> L94
            r1 = r23
            r2 = r24
            r3 = r26
            r4 = r32
            r5 = r30
            r7 = r25
            r8 = r34
            o.fW r22 = r1.MenuHostHelper$$ExternalSyntheticLambda1(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L94
            r10 = r14
            r12 = r24
            r13 = r26
            r0 = r14
            r14 = r16
            r1 = r15
            r15 = r28
            r16 = r29
            r17 = r30
            r18 = r31
            r19 = r32
            r20 = r33
            r21 = r34
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L94
            o.fK r2 = r0.setY     // Catch: java.lang.Throwable -> L94
            r2.MenuHostHelper$$ExternalSyntheticLambda1()     // Catch: java.lang.Throwable -> L94
            o.fK r2 = r0.MenuHostHelper$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L94
            r2.MenuHostHelper$$ExternalSyntheticLambda1()     // Catch: java.lang.Throwable -> L94
            o.fK r2 = r0.setOnLongClickListener     // Catch: java.lang.Throwable -> L94
            r2.MenuHostHelper$$ExternalSyntheticLambda1()     // Catch: java.lang.Throwable -> L94
            java.util.Map<java.lang.String, o.fq> r2 = r9.setIconSize     // Catch: java.lang.Throwable -> L94
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L94
            java.util.Map<java.lang.String, o.fq> r2 = o.C0172fz.MenuHostHelper$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L94
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L94
            goto L8a
        L89:
            r1 = r15
        L8a:
            java.util.Map<java.lang.String, o.fq> r0 = r9.setIconSize     // Catch: java.lang.Throwable -> L94
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L94
            o.fq r0 = (o.C0163fq) r0     // Catch: java.lang.Throwable -> L94
            monitor-exit(r23)
            return r0
        L94:
            r0 = move-exception
            monitor-exit(r23)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0172fz.setIconTintList(com.google.firebase.FirebaseApp, java.lang.String, o.cq, o.aa, java.util.concurrent.Executor, o.fK, o.fK, o.fK, o.fN, o.fT, o.fZ):o.fq");
    }

    private fK MenuHostHelper$$ExternalSyntheticLambda1(String str, String str2) {
        return fK.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener, C0176gb.setIconTintList(this.setUiOptions, String.format("%s_%s_%s_%s.json", "frc", this.MenuHostHelper$$ExternalSyntheticLambda0, str, str2)));
    }

    private fN setX(String str, fK fKVar, fZ fZVar) {
        fN fNVar;
        synchronized (this) {
            InterfaceC0083cq interfaceC0083cq = this.setChipCornerRadius;
            com.google.firebase.FirebaseApp firebaseApp = this.setLayoutAnimation;
            if (!firebaseApp.setUiOptions.get()) {
                InterfaceC0073cg<InterfaceC0020ah> interfaceC0073cg = firebaseApp.setOnLongClickListener.equals("[DEFAULT]") ? this.setIconTintList : new InterfaceC0073cg() { // from class: o.fx
                    @Override // o.InterfaceC0073cg
                    public final Object MenuHostHelper$$ExternalSyntheticLambda0() {
                        return C0172fz.setY();
                    }
                };
                ScheduledExecutorService scheduledExecutorService = this.setNavigationOnClickListener;
                setSpinnersShown setspinnersshown = setY;
                Random random = setX;
                com.google.firebase.FirebaseApp firebaseApp2 = this.setLayoutAnimation;
                if (!(!firebaseApp2.setUiOptions.get())) {
                    throw new IllegalStateException("FirebaseApp was deleted");
                }
                String str2 = firebaseApp2.setNavigationOnClickListener.setY;
                com.google.firebase.FirebaseApp firebaseApp3 = this.setLayoutAnimation;
                if (!firebaseApp3.setUiOptions.get()) {
                    fNVar = new fN(interfaceC0083cq, interfaceC0073cg, scheduledExecutorService, setspinnersshown, random, fKVar, new fS(this.setUiOptions, firebaseApp3.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0, str2, str, fZVar.setX.getLong("fetch_timeout_in_seconds", 60L), fZVar.setX.getLong("fetch_timeout_in_seconds", 60L)), fZVar, this.setOnLongClickListener);
                } else {
                    throw new IllegalStateException("FirebaseApp was deleted");
                }
            } else {
                throw new IllegalStateException("FirebaseApp was deleted");
            }
        }
        return fNVar;
    }

    private fW MenuHostHelper$$ExternalSyntheticLambda1(com.google.firebase.FirebaseApp firebaseApp, InterfaceC0083cq interfaceC0083cq, fN fNVar, fK fKVar, Context context, String str, fZ fZVar) {
        fW fWVar;
        synchronized (this) {
            fWVar = new fW(firebaseApp, interfaceC0083cq, fNVar, fKVar, context, str, fZVar, this.setNavigationOnClickListener);
        }
        return fWVar;
    }
}