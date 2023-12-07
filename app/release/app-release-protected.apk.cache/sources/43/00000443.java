package o;

import android.util.Log;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.C0166ft;
import o.fN;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fD {
    final fN MenuHostHelper$$ExternalSyntheticLambda0;
    private final Set<InterfaceC0160fn> MenuHostHelper$$ExternalSyntheticLambda1;
    private final fK setIconTintList;
    private final Random setOnLongClickListener = new Random();
    private final ScheduledExecutorService setUnboundedRipple;
    final InterfaceC0160fn setX;
    final HttpURLConnection setY;

    public fD(HttpURLConnection httpURLConnection, fN fNVar, fK fKVar, Set<InterfaceC0160fn> set, InterfaceC0160fn interfaceC0160fn, ScheduledExecutorService scheduledExecutorService) {
        this.setY = httpURLConnection;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = fNVar;
        this.setIconTintList = fKVar;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = set;
        this.setX = interfaceC0160fn;
        this.setUnboundedRipple = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(C0166ft c0166ft) {
        synchronized (this) {
            for (InterfaceC0160fn interfaceC0160fn : this.MenuHostHelper$$ExternalSyntheticLambda1) {
                interfaceC0160fn.MenuHostHelper$$ExternalSyntheticLambda0(c0166ft);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean setX() {
        boolean isEmpty;
        synchronized (this) {
            isEmpty = this.MenuHostHelper$$ExternalSyntheticLambda1.isEmpty();
        }
        return isEmpty;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(final int i, final long j) {
        if (i == 0) {
            setY(new fB("Unable to fetch the latest version of the template.", C0166ft.setIconTintList.CONFIG_UPDATE_NOT_FETCHED));
            return;
        }
        this.setUnboundedRipple.schedule(new Runnable() { // from class: o.fD.2
            @Override // java.lang.Runnable
            public final void run() {
                fD.this.setX(i, j);
            }
        }, this.setOnLongClickListener.nextInt(4), TimeUnit.SECONDS);
    }

    public final setAutoSizeTextTypeUniformWithConfiguration<Void> setX(int i, final long j) {
        setAutoSizeTextTypeUniformWithConfiguration y;
        synchronized (this) {
            final int i2 = i - 1;
            final fN fNVar = this.MenuHostHelper$$ExternalSyntheticLambda0;
            fN$MenuHostHelper$$ExternalSyntheticLambda0 fn_menuhosthelper__externalsyntheticlambda0 = fN$MenuHostHelper$$ExternalSyntheticLambda0.REALTIME;
            final HashMap hashMap = new HashMap(fNVar.MenuHostHelper$$ExternalSyntheticLambda0);
            StringBuilder sb = new StringBuilder();
            sb.append(fn_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1);
            sb.append("/");
            sb.append(3 - i2);
            hashMap.put("X-Firebase-RC-Fetch-Type", sb.toString());
            final setAutoSizeTextTypeUniformWithConfiguration y2 = fNVar.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1().setY(fNVar.setIconTintList, new setAllowedHandwritingDelegatePackage() { // from class: o.fR
                @Override // o.setAllowedHandwritingDelegatePackage
                public final Object setX(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
                    return fN.this.setX(setautosizetexttypeuniformwithconfiguration, 0L, hashMap);
                }
            });
            final setAutoSizeTextTypeUniformWithConfiguration<fP> MenuHostHelper$$ExternalSyntheticLambda1 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
            y = AppBarLayout$BaseBehavior$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1(y2, MenuHostHelper$$ExternalSyntheticLambda1).setY(this.setUnboundedRipple, new setAllowedHandwritingDelegatePackage() { // from class: o.fE
                @Override // o.setAllowedHandwritingDelegatePackage
                public final Object setX(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
                    return fD.this.setX(y2, MenuHostHelper$$ExternalSyntheticLambda1, j, i2);
                }
            });
        }
        return y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ setAutoSizeTextTypeUniformWithConfiguration setX(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration, setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration2, long j, int i) {
        Boolean valueOf;
        fP y;
        if (!setautosizetexttypeuniformwithconfiguration.MenuHostHelper$$ExternalSyntheticLambda0()) {
            C0168fv c0168fv = new C0168fv("Failed to auto-fetch config update.", setautosizetexttypeuniformwithconfiguration.setY());
            setTitleTextAppearance settitletextappearance = new setTitleTextAppearance();
            settitletextappearance.setIconTintList((Exception) c0168fv);
            return settitletextappearance;
        } else if (!setautosizetexttypeuniformwithconfiguration2.MenuHostHelper$$ExternalSyntheticLambda0()) {
            C0168fv c0168fv2 = new C0168fv("Failed to get activated config for auto-fetch", setautosizetexttypeuniformwithconfiguration2.setY());
            setTitleTextAppearance settitletextappearance2 = new setTitleTextAppearance();
            settitletextappearance2.setIconTintList((Exception) c0168fv2);
            return settitletextappearance2;
        } else {
            fN.setX setx = (fN.setX) setautosizetexttypeuniformwithconfiguration.MenuHostHelper$$ExternalSyntheticLambda1();
            fP fPVar = (fP) setautosizetexttypeuniformwithconfiguration2.MenuHostHelper$$ExternalSyntheticLambda1();
            if (setx.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                valueOf = Boolean.valueOf(setx.MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation >= j);
            } else {
                valueOf = Boolean.valueOf(setx.setX == 1);
            }
            if (!valueOf.booleanValue()) {
                Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                MenuHostHelper$$ExternalSyntheticLambda1(i, j);
                setTitleTextAppearance settitletextappearance3 = new setTitleTextAppearance();
                settitletextappearance3.setIconTintList((Object) null);
                return settitletextappearance3;
            } else if (setx.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                setTitleTextAppearance settitletextappearance4 = new setTitleTextAppearance();
                settitletextappearance4.setIconTintList((Object) null);
                return settitletextappearance4;
            } else {
                if (fPVar == null) {
                    fP$MenuHostHelper$$ExternalSyntheticLambda0 x = fP.setX();
                    fPVar = new fP(x.MenuHostHelper$$ExternalSyntheticLambda1, x.MenuHostHelper$$ExternalSyntheticLambda0, x.setIconTintList, x.setX, x.setY, (byte) 0);
                }
                fP fPVar2 = setx.MenuHostHelper$$ExternalSyntheticLambda1;
                y = fP.setY(new JSONObject(fPVar2.setIconTintList.toString()));
                JSONObject jSONObject = y.setY;
                HashSet hashSet = new HashSet();
                Iterator<String> keys = fPVar.setY.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!fPVar2.setY.has(next)) {
                        hashSet.add(next);
                    } else if (!fPVar.setY.get(next).equals(fPVar2.setY.get(next))) {
                        hashSet.add(next);
                    } else if ((fPVar.setX.has(next) && !fPVar2.setX.has(next)) || (!fPVar.setX.has(next) && fPVar2.setX.has(next))) {
                        hashSet.add(next);
                    } else if (fPVar.setX.has(next) && fPVar2.setX.has(next) && !fPVar.setX.getJSONObject(next).toString().equals(fPVar2.setX.getJSONObject(next).toString())) {
                        hashSet.add(next);
                    } else {
                        jSONObject.remove(next);
                    }
                }
                Iterator<String> keys2 = jSONObject.keys();
                while (keys2.hasNext()) {
                    hashSet.add(keys2.next());
                }
                if (hashSet.isEmpty()) {
                    Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                    setTitleTextAppearance settitletextappearance5 = new setTitleTextAppearance();
                    settitletextappearance5.setIconTintList((Object) null);
                    return settitletextappearance5;
                }
                new C0159fm(hashSet);
                synchronized (this) {
                    for (InterfaceC0160fn interfaceC0160fn : this.MenuHostHelper$$ExternalSyntheticLambda1) {
                    }
                }
                setTitleTextAppearance settitletextappearance6 = new setTitleTextAppearance();
                settitletextappearance6.setIconTintList((Object) null);
                return settitletextappearance6;
            }
        }
    }
}