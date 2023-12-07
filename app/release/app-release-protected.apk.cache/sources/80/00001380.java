package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* renamed from: o.yj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0626yj {
    private static final C0626yj MenuHostHelper$$ExternalSyntheticLambda1;
    @Nullable
    private final Constructor<MethodHandles.Lookup> setIconTintList;
    public final boolean setY;

    @Nullable
    public Executor MenuHostHelper$$ExternalSyntheticLambda1() {
        return null;
    }

    public static C0626yj setIconTintList() {
        return MenuHostHelper$$ExternalSyntheticLambda1;
    }

    C0626yj(boolean z) {
        this.setY = z;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z) {
            try {
                constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.setIconTintList = constructor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Object MenuHostHelper$$ExternalSyntheticLambda0(Method method, Class<?> cls, Object obj, Object... objArr) {
        MethodHandles.Lookup lookup;
        Constructor<MethodHandles.Lookup> constructor = this.setIconTintList;
        if (constructor != null) {
            lookup = constructor.newInstance(cls, -1);
        } else {
            lookup = MethodHandles.lookup();
        }
        return lookup.unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    /* renamed from: o.yj$setIconTintList */
    /* loaded from: classes.dex */
    static final class setIconTintList extends C0626yj {
        setIconTintList() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        @Override // o.C0626yj
        public final Executor MenuHostHelper$$ExternalSyntheticLambda1() {
            return new Executor() { // from class: o.yj$setIconTintList$MenuHostHelper$$ExternalSyntheticLambda1
                private final Handler setY = new Handler(Looper.getMainLooper());

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    this.setY.post(runnable);
                }
            };
        }

        @Override // o.C0626yj
        @Nullable
        final Object MenuHostHelper$$ExternalSyntheticLambda0(Method method, Class<?> cls, Object obj, Object... objArr) {
            if (Build.VERSION.SDK_INT < 26) {
                throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
            }
            return super.MenuHostHelper$$ExternalSyntheticLambda0(method, cls, obj, objArr);
        }
    }

    static {
        C0626yj c0626yj;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            c0626yj = new setIconTintList();
        } else {
            c0626yj = new C0626yj(true);
        }
        MenuHostHelper$$ExternalSyntheticLambda1 = c0626yj;
    }
}