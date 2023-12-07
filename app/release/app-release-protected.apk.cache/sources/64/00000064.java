package androidx.lifecycle;

import o.CoroutineExceptionHandler;
import o.registerIn;
import o.setCheckable;
import o.setTouchDelegate;

@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements setCheckable {
    private final CoroutineExceptionHandler.setY setIconTintList;
    private final Object setY;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.setY = obj;
        CoroutineExceptionHandler coroutineExceptionHandler = CoroutineExceptionHandler.setX;
        Class<?> cls = obj.getClass();
        CoroutineExceptionHandler.setY sety = coroutineExceptionHandler.MenuHostHelper$$ExternalSyntheticLambda0.get(cls);
        this.setIconTintList = sety == null ? coroutineExceptionHandler.setIconTintList(cls, null) : sety;
    }

    @Override // o.setCheckable
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate, registerIn.setX setx) {
        CoroutineExceptionHandler.setY sety = this.setIconTintList;
        Object obj = this.setY;
        CoroutineExceptionHandler.setY.setIconTintList(sety.MenuHostHelper$$ExternalSyntheticLambda1.get(setx), settouchdelegate, setx, obj);
        CoroutineExceptionHandler.setY.setIconTintList(sety.MenuHostHelper$$ExternalSyntheticLambda1.get(registerIn.setX.ON_ANY), settouchdelegate, setx, obj);
    }
}