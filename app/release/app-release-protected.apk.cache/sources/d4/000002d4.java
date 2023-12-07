package o;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: o.aj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0022aj<T> {
    public final T MenuHostHelper$$ExternalSyntheticLambda1;
    public final aj$MenuHostHelper$$ExternalSyntheticLambda1<T> setY;

    public C0022aj(T t, aj$MenuHostHelper$$ExternalSyntheticLambda1<T> aj_menuhosthelper__externalsyntheticlambda1) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = t;
        this.setY = aj_menuhosthelper__externalsyntheticlambda1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.firebase.components.ComponentRegistrar MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (!com.google.firebase.components.ComponentRegistrar.class.isAssignableFrom(cls)) {
                throw new aG(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
            }
            return (com.google.firebase.components.ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e) {
            throw new aG(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new aG(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new aG(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new aG(String.format("Could not instantiate %s", str), e4);
        }
    }
}