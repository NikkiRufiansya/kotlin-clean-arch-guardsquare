package o;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

/* renamed from: o.uf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0509uf {
    public static final C0509uf setY = new C0509uf();

    private C0509uf() {
    }

    public final List<kotlinx.coroutines.internal.MainDispatcherFactory> MenuHostHelper$$ExternalSyntheticLambda0() {
        boolean z;
        kotlinx.coroutines.internal.MainDispatcherFactory mainDispatcherFactory;
        z = C0513uj.MenuHostHelper$$ExternalSyntheticLambda0;
        if (!z) {
            return setY(kotlinx.coroutines.internal.MainDispatcherFactory.class, kotlinx.coroutines.internal.MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            kotlinx.coroutines.internal.MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (kotlinx.coroutines.internal.MainDispatcherFactory) kotlinx.coroutines.internal.MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, kotlinx.coroutines.internal.MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (kotlinx.coroutines.internal.MainDispatcherFactory) kotlinx.coroutines.internal.MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, kotlinx.coroutines.internal.MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 != null) {
                arrayList.add(mainDispatcherFactory2);
            }
            return arrayList;
        } catch (Throwable unused3) {
            return setY(kotlinx.coroutines.internal.MainDispatcherFactory.class, kotlinx.coroutines.internal.MainDispatcherFactory.class.getClassLoader());
        }
    }

    private static List<String> MenuHostHelper$$ExternalSyntheticLambda1(URL url) {
        String obj = url.toString();
        if (qR.setX(obj, "jar", false)) {
            String iconTintList = qR.setIconTintList(obj, "jar:file:");
            pN.setY(iconTintList, "");
            pN.setY(iconTintList, "");
            int x = qR.setX((CharSequence) iconTintList, '!', 0, false);
            if (x != -1) {
                iconTintList = iconTintList.substring(0, x);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) iconTintList, "");
            }
            String iconTintList2 = qR.setIconTintList(obj, "!/");
            JarFile jarFile = new JarFile(iconTintList, false);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(iconTintList2)), "UTF-8"));
                List<String> MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(bufferedReader);
                C0371pe.setX(bufferedReader, null);
                jarFile.close();
                return MenuHostHelper$$ExternalSyntheticLambda0;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        jarFile.close();
                        throw th2;
                    } catch (Throwable th3) {
                        pN.setY((Object) th, "");
                        pN.setY((Object) th3, "");
                        if (th != th3) {
                            C0369pc.setX.setX(th, th3);
                        }
                        throw th;
                    }
                }
            }
        }
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(dG.setIconTintList(new eC(url), C0126eg.setIconTintList(), new eA())));
        try {
            List<String> MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0(bufferedReader2);
            C0371pe.setX(bufferedReader2, null);
            return MenuHostHelper$$ExternalSyntheticLambda02;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                C0371pe.setX(bufferedReader2, th4);
                throw th5;
            }
        }
    }

    private static List<String> MenuHostHelper$$ExternalSyntheticLambda0(BufferedReader bufferedReader) {
        boolean z;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                String obj = qR.MenuHostHelper$$ExternalSyntheticLambda0((CharSequence) qR.MenuHostHelper$$ExternalSyntheticLambda1(readLine, "#")).toString();
                String str = obj;
                int i = 0;
                while (true) {
                    if (i >= str.length()) {
                        z = true;
                        break;
                    }
                    char charAt = str.charAt(i);
                    if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                        z = false;
                        break;
                    }
                    i++;
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder("Illegal service provider class name: ");
                    sb.append(obj);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                if (str.length() > 0) {
                    linkedHashSet.add(obj);
                }
            } else {
                return C0348oi.setX((Iterable) linkedHashSet);
            }
        }
    }

    private static <S> List<S> setY(Class<S> cls, ClassLoader classLoader) {
        try {
            StringBuilder sb = new StringBuilder("META-INF/services/");
            sb.append(cls.getName());
            ArrayList<URL> list = Collections.list(classLoader.getResources(sb.toString()));
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) list, "");
            ArrayList arrayList = new ArrayList();
            for (URL url : list) {
                C0348oi.setY(arrayList, MenuHostHelper$$ExternalSyntheticLambda1(url));
            }
            Set unboundedRipple = C0348oi.setUnboundedRipple(arrayList);
            if (!(!unboundedRipple.isEmpty())) {
                throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
            }
            Set<String> set = unboundedRipple;
            pN.setY(set, "");
            ArrayList arrayList2 = new ArrayList(set instanceof Collection ? set.size() : 10);
            for (String str : set) {
                Class<?> cls2 = Class.forName(str, false, classLoader);
                if (cls.isAssignableFrom(cls2)) {
                    arrayList2.add(cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])));
                } else {
                    StringBuilder sb2 = new StringBuilder("Expected service of class ");
                    sb2.append(cls);
                    sb2.append(", but found ");
                    sb2.append(cls2);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
            return arrayList2;
        } catch (Throwable unused) {
            return C0348oi.setX(ServiceLoader.load(cls, classLoader));
        }
    }
}