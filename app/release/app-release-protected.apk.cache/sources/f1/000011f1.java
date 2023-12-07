package o;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import o.AbstractC0549vs;
import o.C0557vz;
import o.C0610xu;
import o.C0612xw;
import o.vF;
import o.vH;

/* loaded from: classes.dex */
public final class vL {
    public static final boolean MenuHostHelper$$ExternalSyntheticLambda0;
    public static final byte[] MenuHostHelper$$ExternalSyntheticLambda1;
    public static final C0557vz setIconTintList = C0557vz.setX.MenuHostHelper$$ExternalSyntheticLambda1(new String[0]);
    private static final C0612xw setLayoutAnimation;
    public static final String setNavigationOnClickListener;
    private static final qP setOnLongClickListener;
    public static final TimeZone setX;
    public static final vH setY;

    public static final int MenuHostHelper$$ExternalSyntheticLambda0(char c) {
        if ('0' > c || '9' < c) {
            char c2 = 'A';
            if ('a' <= c && 'f' >= c) {
                c2 = 'a';
            } else if ('A' > c || 'F' < c) {
                return -1;
            }
            return (c - c2) + 10;
        }
        return c - '0';
    }

    public static final long MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        return i & 2147483647L;
    }

    public static final int MenuHostHelper$$ExternalSyntheticLambda1(byte b) {
        return b & 255;
    }

    public static final int MenuHostHelper$$ExternalSyntheticLambda1(short s) {
        return s & 65535;
    }

    static {
        boolean x;
        byte[] bArr = new byte[0];
        MenuHostHelper$$ExternalSyntheticLambda1 = bArr;
        setY = vH.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(vH.MenuHostHelper$$ExternalSyntheticLambda0, bArr);
        vF.setX setx = vF.setX;
        pN.setY(bArr, "");
        MenuHostHelper$$ExternalSyntheticLambda1(0L, 0L, 0L);
        new vF.setX.C0008setX(bArr, null, 0, 0);
        C0612xw.setIconTintList seticontintlist = C0612xw.MenuHostHelper$$ExternalSyntheticLambda1;
        C0610xu.setX setx2 = C0610xu.MenuHostHelper$$ExternalSyntheticLambda0;
        C0610xu.setX setx3 = C0610xu.MenuHostHelper$$ExternalSyntheticLambda0;
        C0610xu.setX setx4 = C0610xu.MenuHostHelper$$ExternalSyntheticLambda0;
        C0610xu.setX setx5 = C0610xu.MenuHostHelper$$ExternalSyntheticLambda0;
        C0610xu.setX setx6 = C0610xu.MenuHostHelper$$ExternalSyntheticLambda0;
        setLayoutAnimation = seticontintlist.setY(C0610xu.setX.setY("efbbbf"), C0610xu.setX.setY("feff"), C0610xu.setX.setY("fffe"), C0610xu.setX.setY("0000ffff"), C0610xu.setX.setY("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        pN.setX(timeZone);
        setX = timeZone;
        setOnLongClickListener = new qP("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        MenuHostHelper$$ExternalSyntheticLambda0 = false;
        String name = vD.class.getName();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) name, "");
        String x2 = qR.setX(name, "okhttp3.");
        pN.setY(x2, "");
        pN.setY(r3, "");
        String str = x2;
        pN.setY(str, "");
        pN.setY(r3, "");
        if (str instanceof String) {
            String str2 = str;
            String str3 = r3;
            pN.setY(str2, "");
            pN.setY(str3, "");
            x = str2.endsWith(str3);
        } else {
            x = qR.setX(str, str.length() - r3.length(), r3, 0, r3.length(), false);
        }
        if (x) {
            x2 = x2.substring(0, x2.length() - r3.length());
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) x2, "");
        }
        setNavigationOnClickListener = x2;
    }

    public static final void MenuHostHelper$$ExternalSyntheticLambda1(long j, long j2, long j3) {
        if ((j3 | 0) < 0 || 0 > j || j < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final ThreadFactory setIconTintList(final String str, final boolean z) {
        pN.setY(str, "");
        return new ThreadFactory() { // from class: o.vL$MenuHostHelper$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static final String[] setY(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        pN.setY(strArr, "");
        pN.setY(strArr2, "");
        pN.setY(comparator, "");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final boolean MenuHostHelper$$ExternalSyntheticLambda1(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        pN.setY(strArr, "");
        pN.setY(comparator, "");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final String[] setIconTintList(String[] strArr, String str) {
        pN.setY(strArr, "");
        pN.setY(str, "");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) copyOf, "");
        String[] strArr2 = (String[]) copyOf;
        pN.setY(strArr2, "");
        strArr2[strArr2.length - 1] = str;
        if (strArr2 != null) {
            return strArr2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda0(String str, int i, int i2) {
        pN.setY(str, "");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int setY(String str, int i, int i2) {
        pN.setY(str, "");
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final String setIconTintList(String str, int i, int i2) {
        pN.setY(str, "");
        int MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0(str, i, i2);
        String substring = str.substring(MenuHostHelper$$ExternalSyntheticLambda02, setY(str, MenuHostHelper$$ExternalSyntheticLambda02, i2));
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
        return substring;
    }

    public static final int setX(String str, String str2, int i, int i2) {
        pN.setY(str, "");
        pN.setY(str2, "");
        while (i < i2) {
            if (qR.setX(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int setX(String str, char c, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = str.length();
        }
        pN.setY(str, "");
        for (int i3 = 0; i3 < i; i3++) {
            if (str.charAt(i3) == c) {
                return i3;
            }
        }
        return i;
    }

    public static final int MenuHostHelper$$ExternalSyntheticLambda1(String str, char c, int i, int i2) {
        pN.setY(str, "");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        pN.setY(str, "");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (pN.MenuHostHelper$$ExternalSyntheticLambda0((int) charAt, 31) <= 0 || pN.MenuHostHelper$$ExternalSyntheticLambda0((int) charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final boolean setY(String str) {
        pN.setY(str, "");
        qP qPVar = setOnLongClickListener;
        String str2 = str;
        pN.setY(str2, "");
        return qPVar.setX.matcher(str2).matches();
    }

    public static final String MenuHostHelper$$ExternalSyntheticLambda1(String str, Object... objArr) {
        pN.setY(str, "");
        pN.setY(objArr, "");
        pW pWVar = pW.setY;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) format, "");
        return format;
    }

    public static final Charset MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0607xr interfaceC0607xr, Charset charset) {
        Charset forName;
        pN.setY(interfaceC0607xr, "");
        pN.setY(charset, "");
        int MenuHostHelper$$ExternalSyntheticLambda02 = interfaceC0607xr.MenuHostHelper$$ExternalSyntheticLambda0(setLayoutAnimation);
        if (MenuHostHelper$$ExternalSyntheticLambda02 != -1) {
            if (MenuHostHelper$$ExternalSyntheticLambda02 == 0) {
                Charset charset2 = StandardCharsets.UTF_8;
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) charset2, "");
                return charset2;
            } else if (MenuHostHelper$$ExternalSyntheticLambda02 == 1) {
                Charset charset3 = StandardCharsets.UTF_16BE;
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) charset3, "");
                return charset3;
            } else if (MenuHostHelper$$ExternalSyntheticLambda02 == 2) {
                Charset charset4 = StandardCharsets.UTF_16LE;
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) charset4, "");
                return charset4;
            } else {
                if (MenuHostHelper$$ExternalSyntheticLambda02 == 3) {
                    qQ qQVar = qQ.setX;
                    Charset charset5 = qQ.MenuHostHelper$$ExternalSyntheticLambda1;
                    if (charset5 != null) {
                        return charset5;
                    }
                    forName = Charset.forName("UTF-32BE");
                    pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) forName, "");
                    qQ.MenuHostHelper$$ExternalSyntheticLambda1 = forName;
                } else if (MenuHostHelper$$ExternalSyntheticLambda02 == 4) {
                    qQ qQVar2 = qQ.setX;
                    Charset charset6 = qQ.setY;
                    if (charset6 != null) {
                        return charset6;
                    }
                    forName = Charset.forName("UTF-32LE");
                    pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) forName, "");
                    qQ.setY = forName;
                } else {
                    throw new AssertionError();
                }
                return forName;
            }
        }
        return charset;
    }

    public static final C0557vz MenuHostHelper$$ExternalSyntheticLambda1(List<C0581wu> list) {
        pN.setY(list, "");
        C0558vz$MenuHostHelper$$ExternalSyntheticLambda0 c0558vz$MenuHostHelper$$ExternalSyntheticLambda0 = new C0558vz$MenuHostHelper$$ExternalSyntheticLambda0();
        for (C0581wu c0581wu : list) {
            C0610xu c0610xu = c0581wu.setUiOptions;
            C0610xu c0610xu2 = c0581wu.setLayoutAnimation;
            String str = c0610xu.setX;
            if (str == null) {
                byte[] x = c0610xu.setX();
                pN.setY(x, "");
                String str2 = new String(x, qQ.setIconTintList);
                c0610xu.setX = str2;
                str = str2;
            }
            String str3 = c0610xu2.setX;
            if (str3 == null) {
                byte[] x2 = c0610xu2.setX();
                pN.setY(x2, "");
                String str4 = new String(x2, qQ.setIconTintList);
                c0610xu2.setX = str4;
                str3 = str4;
            }
            c0558vz$MenuHostHelper$$ExternalSyntheticLambda0.setY(str, str3);
        }
        return c0558vz$MenuHostHelper$$ExternalSyntheticLambda0.setX();
    }

    /* loaded from: classes.dex */
    public static final class setY implements AbstractC0549vs.setX {
        private /* synthetic */ AbstractC0549vs setX;

        setY(AbstractC0549vs abstractC0549vs) {
            this.setX = abstractC0549vs;
        }

        @Override // o.AbstractC0549vs.setX
        public final AbstractC0549vs setX(InterfaceC0541vk interfaceC0541vk) {
            pN.setY(interfaceC0541vk, "");
            return this.setX;
        }
    }

    public static final AbstractC0549vs.setX setIconTintList(AbstractC0549vs abstractC0549vs) {
        pN.setY(abstractC0549vs, "");
        return new setY(abstractC0549vs);
    }

    public static final void setX(InterfaceC0606xq interfaceC0606xq, int i) {
        pN.setY(interfaceC0606xq, "");
        interfaceC0606xq.MenuHostHelper$$ExternalSyntheticLambda0((i >>> 16) & 255);
        interfaceC0606xq.MenuHostHelper$$ExternalSyntheticLambda0((i >>> 8) & 255);
        interfaceC0606xq.MenuHostHelper$$ExternalSyntheticLambda0(i & 255);
    }

    public static final int MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0607xr interfaceC0607xr) {
        pN.setY(interfaceC0607xr, "");
        return (interfaceC0607xr.setUnboundedRipple() & 255) | ((interfaceC0607xr.setUnboundedRipple() & 255) << 16) | ((interfaceC0607xr.setUnboundedRipple() & 255) << 8);
    }

    public static final boolean setY(xJ xJVar, int i, TimeUnit timeUnit) {
        pN.setY(xJVar, "");
        pN.setY(timeUnit, "");
        long nanoTime = System.nanoTime();
        long v_ = xJVar.setX().w_() ? xJVar.setX().v_() - nanoTime : Long.MAX_VALUE;
        xJVar.setX().setX(Math.min(v_, timeUnit.toNanos(i)) + nanoTime);
        try {
            C0602xo c0602xo = new C0602xo();
            while (xJVar.setY(c0602xo, 8192L) != -1) {
                c0602xo.setOnLongClickListener(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0);
            }
            if (v_ == Long.MAX_VALUE) {
                xJVar.setX().t_();
            } else {
                xJVar.setX().setX(nanoTime + v_);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (v_ == Long.MAX_VALUE) {
                xJVar.setX().t_();
            } else {
                xJVar.setX().setX(nanoTime + v_);
            }
            return false;
        } catch (Throwable th) {
            if (v_ == Long.MAX_VALUE) {
                xJVar.setX().t_();
            } else {
                xJVar.setX().setX(nanoTime + v_);
            }
            throw th;
        }
    }

    public static final boolean setX(xJ xJVar, TimeUnit timeUnit) {
        pN.setY(xJVar, "");
        pN.setY(timeUnit, "");
        try {
            return setY(xJVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final boolean MenuHostHelper$$ExternalSyntheticLambda0(Socket socket, InterfaceC0607xr interfaceC0607xr) {
        pN.setY(socket, "");
        pN.setY(interfaceC0607xr, "");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean MenuHostHelper$$ExternalSyntheticLambda12 = interfaceC0607xr.MenuHostHelper$$ExternalSyntheticLambda1();
                socket.setSoTimeout(soTimeout);
                return true ^ MenuHostHelper$$ExternalSyntheticLambda12;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final int MenuHostHelper$$ExternalSyntheticLambda0(String str, int i) {
        pN.setY(str, "");
        int length = str.length();
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\t') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static final long MenuHostHelper$$ExternalSyntheticLambda1(String str, long j) {
        pN.setY(str, "");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int setX(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 2147483647L) {
                    if (parseLong < 0) {
                        return 0;
                    }
                    return (int) parseLong;
                }
                return Integer.MAX_VALUE;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final <T> List<T> MenuHostHelper$$ExternalSyntheticLambda0(List<? extends T> list) {
        pN.setY(list, "");
        List<T> unmodifiableList = Collections.unmodifiableList(C0348oi.setX((Collection) list));
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) unmodifiableList, "");
        return unmodifiableList;
    }

    @SafeVarargs
    public static final <T> List<T> MenuHostHelper$$ExternalSyntheticLambda1(T... tArr) {
        pN.setY(tArr, "");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(C0348oi.setX(Arrays.copyOf(objArr, objArr.length)));
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) unmodifiableList, "");
        return unmodifiableList;
    }

    public static final <K, V> Map<K, V> setX(Map<K, ? extends V> map) {
        pN.setY(map, "");
        if (!map.isEmpty()) {
            Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) unmodifiableMap, "");
            return unmodifiableMap;
        }
        C0361ov c0361ov = C0361ov.MenuHostHelper$$ExternalSyntheticLambda1;
        pN.setX(c0361ov);
        return c0361ov;
    }

    public static final void MenuHostHelper$$ExternalSyntheticLambda1(Closeable closeable) {
        pN.setY(closeable, "");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void MenuHostHelper$$ExternalSyntheticLambda0(Socket socket) {
        pN.setY(socket, "");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) e2.getMessage(), (Object) "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean MenuHostHelper$$ExternalSyntheticLambda0(wM wMVar, File file) {
        pN.setY(wMVar, "");
        pN.setY(file, "");
        xK y = wMVar.setY(file);
        try {
            xK xKVar = y;
            try {
                wMVar.MenuHostHelper$$ExternalSyntheticLambda1(file);
                C0371pe.setX(y, null);
                return true;
            } catch (IOException unused) {
                nX nXVar = nX.setX;
                C0371pe.setX(y, null);
                wMVar.MenuHostHelper$$ExternalSyntheticLambda1(file);
                return false;
            }
        } finally {
        }
    }

    public static final <E> void MenuHostHelper$$ExternalSyntheticLambda0(List<E> list, E e) {
        pN.setY(list, "");
        if (list.contains(e)) {
            return;
        }
        list.add(e);
    }

    public static final Throwable setX(Exception exc, List<? extends Exception> list) {
        pN.setY((Object) exc, "");
        pN.setY(list, "");
        if (list.size() > 1) {
            System.out.println(list);
        }
        for (Exception exc2 : list) {
            Exception exc3 = exc;
            pN.setY((Object) exc3, "");
            pN.setY((Object) exc2, "");
            if (exc3 != exc2) {
                C0369pc.setX.setX(exc3, exc2);
            }
        }
        return exc;
    }

    public static final int setY(String[] strArr, String str, Comparator<String> comparator) {
        pN.setY(strArr, "");
        pN.setY(str, "");
        pN.setY(comparator, "");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final boolean MenuHostHelper$$ExternalSyntheticLambda0(C0555vx c0555vx, C0555vx c0555vx2) {
        pN.setY(c0555vx, "");
        pN.setY(c0555vx2, "");
        return pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) c0555vx.setY, (Object) c0555vx2.setY) && c0555vx.setIconTintList == c0555vx2.setIconTintList && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) c0555vx.setLayoutAnimation, (Object) c0555vx2.setLayoutAnimation);
    }

    public static final long MenuHostHelper$$ExternalSyntheticLambda0(vJ vJVar) {
        pN.setY(vJVar, "");
        C0557vz c0557vz = vJVar.setNavigationOnClickListener;
        pN.setY("Content-Length", "");
        C0557vz.setX setx = C0557vz.setX;
        String y = C0557vz.setX.setY(c0557vz.setIconTintList, "Content-Length");
        if (y != null) {
            return MenuHostHelper$$ExternalSyntheticLambda1(y, -1L);
        }
        return -1L;
    }

    public static final boolean setX(String str) {
        pN.setY(str, "");
        if (!(str == null ? false : str.equalsIgnoreCase("Authorization"))) {
            if (!(str == null ? false : str.equalsIgnoreCase("Cookie"))) {
                if (!(str == null ? false : str.equalsIgnoreCase("Proxy-Authorization"))) {
                    if (!(str == null ? false : str.equalsIgnoreCase("Set-Cookie"))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final int setX(C0602xo c0602xo) {
        pN.setY(c0602xo, "");
        int i = 0;
        while (true) {
            if ((c0602xo.MenuHostHelper$$ExternalSyntheticLambda0 == 0) || c0602xo.MenuHostHelper$$ExternalSyntheticLambda1(0L) != 61) {
                break;
            }
            i++;
            c0602xo.setUnboundedRipple();
        }
        return i;
    }

    public static final String setX(C0555vx c0555vx, boolean z) {
        String str;
        pN.setY(c0555vx, "");
        if (qR.setIconTintList((CharSequence) c0555vx.setY, (CharSequence) ":", false)) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(c0555vx.setY);
            sb.append(']');
            str = sb.toString();
        } else {
            str = c0555vx.setY;
        }
        if (!z) {
            int i = c0555vx.setIconTintList;
            vx$MenuHostHelper$$ExternalSyntheticLambda1 vx_menuhosthelper__externalsyntheticlambda1 = C0555vx.MenuHostHelper$$ExternalSyntheticLambda0;
            if (i == vx$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(c0555vx.setLayoutAnimation)) {
                return str;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(':');
        sb2.append(c0555vx.setIconTintList);
        return sb2.toString();
    }
}