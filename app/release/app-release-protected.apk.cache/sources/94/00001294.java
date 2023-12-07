package o;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class wO extends wR {
    public static final wO$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda0 = new wO$MenuHostHelper$$ExternalSyntheticLambda0((byte) 0);
    private final Method MenuHostHelper$$ExternalSyntheticLambda1;
    private final Class<?> setIconTintList;
    private final Class<?> setLayoutAnimation;
    private final Method setOnLongClickListener;
    private final Method setY;

    public wO(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        pN.setY(method, "");
        pN.setY(method2, "");
        pN.setY(method3, "");
        pN.setY(cls, "");
        pN.setY(cls2, "");
        this.setY = method;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = method2;
        this.setOnLongClickListener = method3;
        this.setIconTintList = cls;
        this.setLayoutAnimation = cls2;
    }

    @Override // o.wR
    public final void MenuHostHelper$$ExternalSyntheticLambda0(SSLSocket sSLSocket, String str, List<? extends vB> list) {
        pN.setY(sSLSocket, "");
        pN.setY(list, "");
        try {
            this.setY.invoke(null, sSLSocket, Proxy.newProxyInstance(wR.class.getClassLoader(), new Class[]{this.setIconTintList, this.setLayoutAnimation}, new setX(wR$MenuHostHelper$$ExternalSyntheticLambda1.setX(list))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // o.wR
    public final void setY(SSLSocket sSLSocket) {
        pN.setY(sSLSocket, "");
        try {
            this.setOnLongClickListener.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // o.wR
    public final String setX(SSLSocket sSLSocket) {
        pN.setY(sSLSocket, "");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.MenuHostHelper$$ExternalSyntheticLambda1.invoke(null, sSLSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            setX setx = (setX) invocationHandler;
            if (!setx.MenuHostHelper$$ExternalSyntheticLambda0 && setx.setX == null) {
                wR.setX("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
                return null;
            } else if (setx.MenuHostHelper$$ExternalSyntheticLambda0) {
                return null;
            } else {
                return setx.setX;
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }

    /* loaded from: classes.dex */
    static final class setX implements InvocationHandler {
        boolean MenuHostHelper$$ExternalSyntheticLambda0;
        private final List<String> setIconTintList;
        String setX;

        public setX(List<String> list) {
            pN.setY(list, "");
            this.setIconTintList = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            pN.setY(obj, "");
            pN.setY(method, "");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) name, (Object) "supports") && pN.MenuHostHelper$$ExternalSyntheticLambda0(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) name, (Object) "unsupported") && pN.MenuHostHelper$$ExternalSyntheticLambda0(Void.TYPE, returnType)) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
                return null;
            }
            if (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) name, (Object) "protocols")) {
                if (objArr.length == 0) {
                    return this.setIconTintList;
                }
            }
            if ((pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) name, (Object) "selectProtocol") || pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) name, (Object) "select")) && pN.MenuHostHelper$$ExternalSyntheticLambda0(String.class, returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    if (obj2 != null) {
                        List list = (List) obj2;
                        int size = list.size();
                        if (size >= 0) {
                            int i = 0;
                            while (true) {
                                Object obj3 = list.get(i);
                                if (obj3 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                                String str = (String) obj3;
                                if (!this.setIconTintList.contains(str)) {
                                    if (i == size) {
                                        break;
                                    }
                                    i++;
                                } else {
                                    this.setX = str;
                                    return str;
                                }
                            }
                        }
                        String str2 = this.setIconTintList.get(0);
                        this.setX = str2;
                        return str2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                }
            }
            if ((pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) name, (Object) "protocolSelected") || pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) name, (Object) "selected")) && objArr.length == 1) {
                Object obj4 = objArr[0];
                if (obj4 != null) {
                    this.setX = (String) obj4;
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
    }
}