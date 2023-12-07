package o;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class fK {
    private static final Map<String, fK> MenuHostHelper$$ExternalSyntheticLambda0 = new HashMap();
    private static final Executor MenuHostHelper$$ExternalSyntheticLambda1 = new Executor() { // from class: o.fJ
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };
    public setAutoSizeTextTypeUniformWithConfiguration<fP> setIconTintList = null;
    private final Executor setX;
    public final C0176gb setY;

    private fK(Executor executor, C0176gb c0176gb) {
        this.setX = executor;
        this.setY = c0176gb;
    }

    public final fP MenuHostHelper$$ExternalSyntheticLambda0() {
        synchronized (this) {
            setAutoSizeTextTypeUniformWithConfiguration<fP> setautosizetexttypeuniformwithconfiguration = this.setIconTintList;
            if (setautosizetexttypeuniformwithconfiguration != null && setautosizetexttypeuniformwithconfiguration.MenuHostHelper$$ExternalSyntheticLambda0()) {
                return this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
            }
            try {
                setAutoSizeTextTypeUniformWithConfiguration<fP> MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                fK$MenuHostHelper$$ExternalSyntheticLambda1 fk_menuhosthelper__externalsyntheticlambda1 = new fK$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);
                Executor executor = MenuHostHelper$$ExternalSyntheticLambda1;
                MenuHostHelper$$ExternalSyntheticLambda12.setX(executor, (CalendarConstraints$1<? super fP>) fk_menuhosthelper__externalsyntheticlambda1);
                MenuHostHelper$$ExternalSyntheticLambda12.setX(executor, (setAccessibilityDataSensitive) fk_menuhosthelper__externalsyntheticlambda1);
                MenuHostHelper$$ExternalSyntheticLambda12.setX(executor, (getTrimPathStart) fk_menuhosthelper__externalsyntheticlambda1);
                if (!fk_menuhosthelper__externalsyntheticlambda1.setY.await(5L, timeUnit)) {
                    throw new TimeoutException("Task await timed out.");
                }
                if (MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda0()) {
                    return MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda1();
                }
                throw new ExecutionException(MenuHostHelper$$ExternalSyntheticLambda12.setY());
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e);
                return null;
            }
        }
    }

    public final setAutoSizeTextTypeUniformWithConfiguration<fP> setX(final fP fPVar) {
        return AppBarLayout$BaseBehavior$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0(this.setX, new Callable() { // from class: o.fI
            @Override // java.util.concurrent.Callable
            public final Object call() {
                fK fKVar = fK.this;
                return fKVar.setY.setY(fPVar);
            }
        }).MenuHostHelper$$ExternalSyntheticLambda0(this.setX, new getCallingUid(true, fPVar) { // from class: o.fH
            private /* synthetic */ boolean setIconTintList = true;
            private /* synthetic */ fP setY;

            {
                this.setY = fPVar;
            }

            @Override // o.getCallingUid
            public final setAutoSizeTextTypeUniformWithConfiguration setIconTintList(Object obj) {
                Void r4 = (Void) obj;
                return fK.this.setX(this.setIconTintList, this.setY);
            }
        });
    }

    public final /* synthetic */ setAutoSizeTextTypeUniformWithConfiguration setX(boolean z, fP fPVar) {
        if (z) {
            synchronized (this) {
                setTitleTextAppearance settitletextappearance = new setTitleTextAppearance();
                settitletextappearance.setIconTintList(fPVar);
                this.setIconTintList = settitletextappearance;
            }
        }
        setTitleTextAppearance settitletextappearance2 = new setTitleTextAppearance();
        settitletextappearance2.setIconTintList(fPVar);
        return settitletextappearance2;
    }

    public final setAutoSizeTextTypeUniformWithConfiguration<fP> MenuHostHelper$$ExternalSyntheticLambda1() {
        setAutoSizeTextTypeUniformWithConfiguration<fP> setautosizetexttypeuniformwithconfiguration;
        synchronized (this) {
            setAutoSizeTextTypeUniformWithConfiguration<fP> setautosizetexttypeuniformwithconfiguration2 = this.setIconTintList;
            if (setautosizetexttypeuniformwithconfiguration2 == null || (setautosizetexttypeuniformwithconfiguration2.setX() && !this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0())) {
                Executor executor = this.setX;
                final C0176gb c0176gb = this.setY;
                Objects.requireNonNull(c0176gb);
                this.setIconTintList = AppBarLayout$BaseBehavior$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0(executor, new Callable() { // from class: o.fL
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C0176gb.this.MenuHostHelper$$ExternalSyntheticLambda1();
                    }
                });
            }
            setautosizetexttypeuniformwithconfiguration = this.setIconTintList;
        }
        return setautosizetexttypeuniformwithconfiguration;
    }

    public static fK MenuHostHelper$$ExternalSyntheticLambda1(Executor executor, C0176gb c0176gb) {
        fK fKVar;
        synchronized (fK.class) {
            String str = c0176gb.MenuHostHelper$$ExternalSyntheticLambda0;
            Map<String, fK> map = MenuHostHelper$$ExternalSyntheticLambda0;
            if (!map.containsKey(str)) {
                map.put(str, new fK(executor, c0176gb));
            }
            fKVar = map.get(str);
        }
        return fKVar;
    }
}