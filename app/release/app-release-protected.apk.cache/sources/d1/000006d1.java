package o;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import o.C0598xk;
import o.C0624yh;
import o.InterfaceC0541vk;
import o.vD;
import o.xU;

/* renamed from: o.lt  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280lt {
    private Context MenuHostHelper$$ExternalSyntheticLambda0;

    @nH
    public final String setIconTintList() {
        return "https://api.thenewsapi.com/v1/news/";
    }

    public C0280lt(Context context) {
        pN.setY(context, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = context;
    }

    @nH
    public final Context MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @nH
    public final C0598xk MenuHostHelper$$ExternalSyntheticLambda0() {
        C0598xk c0598xk = new C0598xk((byte) 0);
        C0598xk.setY sety = C0598xk.setY.NONE;
        pN.setY(sety, "");
        c0598xk.MenuHostHelper$$ExternalSyntheticLambda1 = sety;
        return c0598xk;
    }

    @nH
    public final vD MenuHostHelper$$ExternalSyntheticLambda0(C0598xk c0598xk) {
        pN.setY(c0598xk, "");
        vD.setIconTintList seticontintlist = new vD.setIconTintList();
        C0598xk c0598xk2 = c0598xk;
        pN.setY(c0598xk2, "");
        seticontintlist.ViewPager$SavedState$1.add(c0598xk2);
        return new vD(seticontintlist);
    }

    @nH
    public final C0624yh setX(String str, C0627yk c0627yk, vD vDVar) {
        pN.setY(str, "");
        pN.setY(c0627yk, "");
        pN.setY(vDVar, "");
        C0624yh.setY sety = new C0624yh.setY();
        Objects.requireNonNull(str, "baseUrl == null");
        C0555vx x = C0555vx.setX(str);
        Objects.requireNonNull(x, "baseUrl == null");
        List<String> list = x.setX;
        if (!"".equals(list.get(list.size() - 1))) {
            StringBuilder sb = new StringBuilder("baseUrl must end in /: ");
            sb.append(x);
            throw new IllegalArgumentException(sb.toString());
        }
        sety.setY = x;
        sety.MenuHostHelper$$ExternalSyntheticLambda0.add((xU.setX) Objects.requireNonNull(c0627yk, "factory == null"));
        sety.MenuHostHelper$$ExternalSyntheticLambda1 = (InterfaceC0541vk.setY) Objects.requireNonNull((InterfaceC0541vk.setY) Objects.requireNonNull(vDVar, "client == null"), "factory == null");
        if (sety.setY == null) {
            throw new IllegalStateException("Base URL required.");
        }
        InterfaceC0541vk.setY sety2 = sety.MenuHostHelper$$ExternalSyntheticLambda1;
        if (sety2 == null) {
            sety2 = new vD();
        }
        InterfaceC0541vk.setY sety3 = sety2;
        Executor executor = sety.setX;
        Executor MenuHostHelper$$ExternalSyntheticLambda1 = sety.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1();
        ArrayList arrayList = new ArrayList(sety.setIconTintList);
        C0626yj c0626yj = sety.setUnboundedRipple;
        xY xYVar = new xY(MenuHostHelper$$ExternalSyntheticLambda1);
        arrayList.addAll(c0626yj.setY ? Arrays.asList(xS.setX, xYVar) : Collections.singletonList(xYVar));
        ArrayList arrayList2 = new ArrayList(sety.MenuHostHelper$$ExternalSyntheticLambda0.size() + 1 + (sety.setUnboundedRipple.setY ? 1 : 0));
        arrayList2.add(new xP());
        arrayList2.addAll(sety.MenuHostHelper$$ExternalSyntheticLambda0);
        arrayList2.addAll(sety.setUnboundedRipple.setY ? Collections.singletonList(C0620yd.MenuHostHelper$$ExternalSyntheticLambda0) : Collections.emptyList());
        C0624yh c0624yh = new C0624yh(sety3, sety.setY, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), MenuHostHelper$$ExternalSyntheticLambda1, sety.setLayoutAnimation);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) c0624yh, "");
        return c0624yh;
    }

    @nH
    public final kS MenuHostHelper$$ExternalSyntheticLambda1(final C0624yh c0624yh) {
        Method[] declaredMethods;
        pN.setY(c0624yh, "");
        if (!kS.class.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(kS.class);
        while (!arrayDeque.isEmpty()) {
            Class cls = (Class) arrayDeque.removeFirst();
            if (cls.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls.getName());
                if (cls != kS.class) {
                    sb.append(" which is an interface of ");
                    sb.append(kS.class.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls.getInterfaces());
        }
        if (c0624yh.MenuHostHelper$$ExternalSyntheticLambda1) {
            C0626yj iconTintList = C0626yj.setIconTintList();
            for (Method method : kS.class.getDeclaredMethods()) {
                if (!(iconTintList.setY && method.isDefault()) && !Modifier.isStatic(method.getModifiers())) {
                    c0624yh.MenuHostHelper$$ExternalSyntheticLambda1(method);
                }
            }
        }
        Object newProxyInstance = Proxy.newProxyInstance(kS.class.getClassLoader(), new Class[]{kS.class}, new InvocationHandler() { // from class: o.yh.5
            private final C0626yj setY = C0626yj.setIconTintList();
            private final Object[] MenuHostHelper$$ExternalSyntheticLambda0 = new Object[0];

            @Override // java.lang.reflect.InvocationHandler
            @Nullable
            public final Object invoke(Object obj, Method method2, @Nullable Object[] objArr) {
                if (method2.getDeclaringClass() == Object.class) {
                    return method2.invoke(this, objArr);
                }
                if (objArr == null) {
                    objArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
                }
                if (this.setY.setY && method2.isDefault()) {
                    return this.setY.MenuHostHelper$$ExternalSyntheticLambda0(method2, r2, obj, objArr);
                }
                return C0624yh.this.MenuHostHelper$$ExternalSyntheticLambda1(method2).MenuHostHelper$$ExternalSyntheticLambda1(objArr);
            }
        });
        pN.MenuHostHelper$$ExternalSyntheticLambda0(newProxyInstance, "");
        return (kS) newProxyInstance;
    }

    @nH
    public final C0627yk setY() {
        C0627yk c0627yk = new C0627yk(new gS());
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) c0627yk, "");
        return c0627yk;
    }
}