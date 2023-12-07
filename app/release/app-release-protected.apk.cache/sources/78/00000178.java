package o;

import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public final class CoroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1 {
    final int MenuHostHelper$$ExternalSyntheticLambda0;
    final Method MenuHostHelper$$ExternalSyntheticLambda1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CoroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1(int i, Method method) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CoroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1) {
            CoroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1 coroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1 = (CoroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1) obj;
            return this.MenuHostHelper$$ExternalSyntheticLambda0 == coroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 && this.MenuHostHelper$$ExternalSyntheticLambda1.getName().equals(coroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1.getName());
        }
        return false;
    }

    public final int hashCode() {
        return (this.MenuHostHelper$$ExternalSyntheticLambda0 * 31) + this.MenuHostHelper$$ExternalSyntheticLambda1.getName().hashCode();
    }
}