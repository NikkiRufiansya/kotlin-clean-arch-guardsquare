package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import o.setTextStartPaddingResource;

/* loaded from: classes.dex */
public final class setTextStartPaddingResource {
    private static final ThreadLocal<TypedValue> MenuHostHelper$$ExternalSyntheticLambda0 = new ThreadLocal<>();
    private static final WeakHashMap<setTextStartPaddingResource$MenuHostHelper$$ExternalSyntheticLambda1, SparseArray<setTextStartPaddingResource$MenuHostHelper$$ExternalSyntheticLambda0>> MenuHostHelper$$ExternalSyntheticLambda1 = new WeakHashMap<>(0);
    private static final Object setIconTintList = new Object();

    public static Drawable setY(Resources resources, int i, Resources.Theme theme) {
        return resources.getDrawable(i, theme);
    }

    public static ColorStateList setIconTintList(Resources resources, int i, Resources.Theme theme) {
        setTextStartPaddingResource$MenuHostHelper$$ExternalSyntheticLambda1 settextstartpaddingresource_menuhosthelper__externalsyntheticlambda1 = new setTextStartPaddingResource$MenuHostHelper$$ExternalSyntheticLambda1(resources, theme);
        ColorStateList y = setY(settextstartpaddingresource_menuhosthelper__externalsyntheticlambda1, i);
        if (y != null) {
            return y;
        }
        ColorStateList MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(resources, i, theme);
        if (MenuHostHelper$$ExternalSyntheticLambda12 != null) {
            MenuHostHelper$$ExternalSyntheticLambda0(settextstartpaddingresource_menuhosthelper__externalsyntheticlambda1, i, MenuHostHelper$$ExternalSyntheticLambda12, theme);
            return MenuHostHelper$$ExternalSyntheticLambda12;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return setIconTintList.setY(resources, i, theme);
        } else {
            return resources.getColorStateList(i);
        }
    }

    private static ColorStateList MenuHostHelper$$ExternalSyntheticLambda1(Resources resources, int i, Resources.Theme theme) {
        if (MenuHostHelper$$ExternalSyntheticLambda0(resources, i)) {
            return null;
        }
        try {
            return setCustomView.setIconTintList(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    private static ColorStateList setY(setTextStartPaddingResource$MenuHostHelper$$ExternalSyntheticLambda1 settextstartpaddingresource_menuhosthelper__externalsyntheticlambda1, int i) {
        setTextStartPaddingResource$MenuHostHelper$$ExternalSyntheticLambda0 settextstartpaddingresource_menuhosthelper__externalsyntheticlambda0;
        synchronized (setIconTintList) {
            SparseArray<setTextStartPaddingResource$MenuHostHelper$$ExternalSyntheticLambda0> sparseArray = MenuHostHelper$$ExternalSyntheticLambda1.get(settextstartpaddingresource_menuhosthelper__externalsyntheticlambda1);
            if (sparseArray != null && sparseArray.size() > 0 && (settextstartpaddingresource_menuhosthelper__externalsyntheticlambda0 = sparseArray.get(i)) != null) {
                if (settextstartpaddingresource_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1.equals(settextstartpaddingresource_menuhosthelper__externalsyntheticlambda1.setIconTintList.getConfiguration()) && ((settextstartpaddingresource_menuhosthelper__externalsyntheticlambda1.setX == null && settextstartpaddingresource_menuhosthelper__externalsyntheticlambda0.setX == 0) || (settextstartpaddingresource_menuhosthelper__externalsyntheticlambda1.setX != null && settextstartpaddingresource_menuhosthelper__externalsyntheticlambda0.setX == settextstartpaddingresource_menuhosthelper__externalsyntheticlambda1.setX.hashCode()))) {
                    return settextstartpaddingresource_menuhosthelper__externalsyntheticlambda0.setIconTintList;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    private static void MenuHostHelper$$ExternalSyntheticLambda0(setTextStartPaddingResource$MenuHostHelper$$ExternalSyntheticLambda1 settextstartpaddingresource_menuhosthelper__externalsyntheticlambda1, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (setIconTintList) {
            WeakHashMap<setTextStartPaddingResource$MenuHostHelper$$ExternalSyntheticLambda1, SparseArray<setTextStartPaddingResource$MenuHostHelper$$ExternalSyntheticLambda0>> weakHashMap = MenuHostHelper$$ExternalSyntheticLambda1;
            SparseArray<setTextStartPaddingResource$MenuHostHelper$$ExternalSyntheticLambda0> sparseArray = weakHashMap.get(settextstartpaddingresource_menuhosthelper__externalsyntheticlambda1);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(settextstartpaddingresource_menuhosthelper__externalsyntheticlambda1, sparseArray);
            }
            sparseArray.append(i, new setTextStartPaddingResource$MenuHostHelper$$ExternalSyntheticLambda0(colorStateList, settextstartpaddingresource_menuhosthelper__externalsyntheticlambda1.setIconTintList.getConfiguration(), theme));
        }
    }

    private static boolean MenuHostHelper$$ExternalSyntheticLambda0(Resources resources, int i) {
        TypedValue y = setY();
        resources.getValue(i, y, true);
        return y.type >= 28 && y.type <= 31;
    }

    private static TypedValue setY() {
        ThreadLocal<TypedValue> threadLocal = MenuHostHelper$$ExternalSyntheticLambda0;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    public static Typeface MenuHostHelper$$ExternalSyntheticLambda0(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return MenuHostHelper$$ExternalSyntheticLambda1(context, i, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface setX(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return MenuHostHelper$$ExternalSyntheticLambda1(context, i, new TypedValue(), 0, null, null, false, true);
    }

    /* loaded from: classes.dex */
    public static abstract class setY {
        /* renamed from: setIconTintList */
        public abstract void setY(int i);

        /* renamed from: setIconTintList */
        public abstract void MenuHostHelper$$ExternalSyntheticLambda0(Typeface typeface);

        public final void MenuHostHelper$$ExternalSyntheticLambda1(final Typeface typeface, Handler handler) {
            setX(handler).post(new Runnable() { // from class: o.setSupportImageTintList
                @Override // java.lang.Runnable
                public final void run() {
                    setTextStartPaddingResource.setY.this.MenuHostHelper$$ExternalSyntheticLambda0(typeface);
                }
            });
        }

        public final void setIconTintList(final int i, Handler handler) {
            setX(handler).post(new Runnable() { // from class: o.setStatusBarForegroundColor
                @Override // java.lang.Runnable
                public final void run() {
                    setTextStartPaddingResource.setY.this.setY(i);
                }
            });
        }

        public static Handler setX(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }
    }

    public static void setY(Context context, int i, setY sety, Handler handler) {
        if (context.isRestricted()) {
            sety.setIconTintList(-4, handler);
        } else {
            MenuHostHelper$$ExternalSyntheticLambda1(context, i, new TypedValue(), 0, sety, handler, false, false);
        }
    }

    public static Typeface setX(Context context, int i, TypedValue typedValue, int i2, setY sety) {
        if (context.isRestricted()) {
            return null;
        }
        return MenuHostHelper$$ExternalSyntheticLambda1(context, i, typedValue, i2, sety, null, true, false);
    }

    private static Typeface MenuHostHelper$$ExternalSyntheticLambda1(Context context, int i, TypedValue typedValue, int i2, setY sety, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface iconTintList = setIconTintList(context, resources, typedValue, i, i2, sety, handler, z, z2);
        if (iconTintList == null && sety == null && !z2) {
            StringBuilder sb = new StringBuilder("Font resource ID #0x");
            sb.append(Integer.toHexString(i));
            sb.append(" could not be retrieved.");
            throw new Resources.NotFoundException(sb.toString());
        }
        return iconTintList;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface setIconTintList(android.content.Context r17, android.content.res.Resources r18, android.util.TypedValue r19, int r20, int r21, o.setTextStartPaddingResource.setY r22, android.os.Handler r23, boolean r24, boolean r25) {
        /*
            r0 = r18
            r1 = r19
            r4 = r20
            r11 = r22
            r12 = r23
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto Lb7
            java.lang.CharSequence r2 = r1.string
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = -3
            r16 = 0
            if (r2 != 0) goto L27
            if (r11 == 0) goto L26
            r11.setIconTintList(r15, r12)
        L26:
            return r16
        L27:
            int r2 = r1.assetCookie
            r7 = r21
            android.graphics.Typeface r2 = o.copyRootViewBounds.MenuHostHelper$$ExternalSyntheticLambda1(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L37
            if (r11 == 0) goto L36
            r11.MenuHostHelper$$ExternalSyntheticLambda1(r2, r12)
        L36:
            return r2
        L37:
            if (r25 == 0) goto L3a
            return r16
        L3a:
            java.lang.String r2 = r14.toLowerCase()     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> L9f
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> L9f
            if (r2 == 0) goto L71
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> L9f
            o.setTextMetricsParams$MenuHostHelper$$ExternalSyntheticLambda1 r2 = o.setTextMetricsParams.MenuHostHelper$$ExternalSyntheticLambda1(r2, r0)     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> L9f
            if (r2 != 0) goto L5b
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> L9f
            if (r11 == 0) goto L5a
            r11.setIconTintList(r15, r12)     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> L9f
        L5a:
            return r16
        L5b:
            int r6 = r1.assetCookie     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> L9f
            r1 = r17
            r3 = r18
            r4 = r20
            r5 = r14
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            android.graphics.Typeface r0 = o.copyRootViewBounds.MenuHostHelper$$ExternalSyntheticLambda0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> L9f
            return r0
        L71:
            int r5 = r1.assetCookie     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> L9f
            r1 = r17
            r2 = r18
            r3 = r20
            r4 = r14
            r6 = r21
            android.graphics.Typeface r0 = o.copyRootViewBounds.setY(r1, r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> L9f
            if (r11 == 0) goto L8b
            if (r0 == 0) goto L88
            r11.MenuHostHelper$$ExternalSyntheticLambda1(r0, r12)     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> L9f
            goto L8b
        L88:
            r11.setIconTintList(r15, r12)     // Catch: java.io.IOException -> L8c org.xmlpull.v1.XmlPullParserException -> L9f
        L8b:
            return r0
        L8c:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to read xml resource "
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            goto Lb1
        L9f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to parse xml resource "
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
        Lb1:
            if (r11 == 0) goto Lb6
            r11.setIconTintList(r15, r12)
        Lb6:
            return r16
        Lb7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Resource \""
            r2.<init>(r3)
            java.lang.String r0 = r0.getResourceName(r4)
            r2.append(r0)
            java.lang.String r0 = "\" ("
            r2.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r20)
            r2.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r2.append(r0)
            r2.append(r1)
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTextStartPaddingResource.setIconTintList(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, o.setTextStartPaddingResource$setY, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList {
        static ColorStateList setY(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* loaded from: classes.dex */
    static class setX {
    }

    /* loaded from: classes.dex */
    public static final class setOnLongClickListener {
        public static void MenuHostHelper$$ExternalSyntheticLambda0(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                setIconTintList.setY(theme);
            } else if (Build.VERSION.SDK_INT >= 23) {
                setX.MenuHostHelper$$ExternalSyntheticLambda1(theme);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class setIconTintList {
            static void setY(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class setX {
            private static Method setIconTintList;
            private static final Object setX = new Object();
            private static boolean setY;

            static void MenuHostHelper$$ExternalSyntheticLambda1(Resources.Theme theme) {
                synchronized (setX) {
                    if (!setY) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            setIconTintList = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        setY = true;
                    }
                    Method method = setIconTintList;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            setIconTintList = null;
                        }
                    }
                }
            }
        }
    }
}