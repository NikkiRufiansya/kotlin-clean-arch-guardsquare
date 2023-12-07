package o;

import java.lang.reflect.Constructor;
import o.nR;

/* renamed from: o.ud$MenuHostHelper$$ExternalSyntheticLambda1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0507ud$MenuHostHelper$$ExternalSyntheticLambda1 extends pO implements InterfaceC0377pk<Throwable, Throwable> {
    private /* synthetic */ Constructor MenuHostHelper$$ExternalSyntheticLambda1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0507ud$MenuHostHelper$$ExternalSyntheticLambda1(Constructor constructor) {
        super(1);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = constructor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.InterfaceC0377pk
    /* renamed from: setIconTintList */
    public Throwable setX(Throwable th) {
        Object x;
        Object newInstance;
        try {
            nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
            newInstance = this.MenuHostHelper$$ExternalSyntheticLambda1.newInstance(th.getMessage());
        } catch (Throwable th2) {
            nR.setIconTintList seticontintlist2 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
            pN.setY((Object) th2, "");
            x = nR.setX(new nR.setX(th2));
        }
        if (newInstance != null) {
            Throwable th3 = (Throwable) newInstance;
            th3.initCause(th);
            x = nR.setX(th3);
            if (nR.MenuHostHelper$$ExternalSyntheticLambda1(x)) {
                x = null;
            }
            return (Throwable) x;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
    }
}