package o;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class iZ {
    private static final Class<?> setIconTintList = setX();
    private static final je<?, ?> setY = MenuHostHelper$$ExternalSyntheticLambda1(false);
    private static final je<?, ?> MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(true);
    private static final je<?, ?> setX = new C0258jd();

    public static void setY(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC0239il.class.isAssignableFrom(cls) && (cls2 = setIconTintList) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(int i, List<Double> list, jj jjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jjVar.setIconTintList(i, list, z);
    }

    public static void setNavigationOnClickListener(int i, List<Float> list, jj jjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jjVar.setOnLongClickListener(i, list, z);
    }

    public static void setLayoutAnimation(int i, List<Long> list, jj jjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jjVar.setLayoutAnimation(i, list, z);
    }

    public static void ViewPager$SavedState$1(int i, List<Long> list, jj jjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jjVar.setTextAlignment(i, list, z);
    }

    public static void setIconSize(int i, List<Long> list, jj jjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jjVar.setCenterIfNoTextEnabled(i, list, z);
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(int i, List<Long> list, jj jjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jjVar.MenuHostHelper$$ExternalSyntheticLambda1(i, list, z);
    }

    public static void setUnboundedRipple(int i, List<Long> list, jj jjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jjVar.setUnboundedRipple(i, list, z);
    }

    public static void setUiOptions(int i, List<Integer> list, jj jjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jjVar.setNavigationOnClickListener(i, list, z);
    }

    public static void setCenterIfNoTextEnabled(int i, List<Integer> list, jj jjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jjVar.setChipCornerRadius(i, list, z);
    }

    public static void setTextAlignment(int i, List<Integer> list, jj jjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jjVar.ViewPager$SavedState$1(i, list, z);
    }

    public static void setX(int i, List<Integer> list, jj jjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jjVar.setY(i, list, z);
    }

    public static void setOnLongClickListener(int i, List<Integer> list, jj jjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jjVar.setUiOptions(i, list, z);
    }

    public static void setIconTintList(int i, List<Integer> list, jj jjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jjVar.setX(i, list, z);
    }

    public static void setY(int i, List<Boolean> list, jj jjVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jjVar.MenuHostHelper$$ExternalSyntheticLambda0(i, list, z);
    }

    public static void setY(int i, List<String> list, jj jjVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jjVar.MenuHostHelper$$ExternalSyntheticLambda0(i, list);
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(int i, List<hY> list, jj jjVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jjVar.MenuHostHelper$$ExternalSyntheticLambda1(i, list);
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(int i, List<?> list, jj jjVar, iY iYVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jjVar.setX(i, list, iYVar);
    }

    public static void setX(int i, List<?> list, jj jjVar, iY iYVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jjVar.setIconTintList(i, list, iYVar);
    }

    public static int setLayoutAnimation(List<Long> list) {
        int x;
        int x2;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0253iy) {
            C0253iy c0253iy = (C0253iy) list;
            for (int i2 = 0; i2 < size; i2++) {
                x2 = hX.setX(c0253iy.MenuHostHelper$$ExternalSyntheticLambda1(i2));
                i += x2;
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                x = hX.setX(list.get(i3).longValue());
                i += x;
            }
        }
        return i;
    }

    public static int setOnLongClickListener(int i, List<Long> list) {
        if (list.size() == 0) {
            return 0;
        }
        return setLayoutAnimation(list) + (list.size() * hX.setCenterIfNoTextEnabled(i));
    }

    public static int setUiOptions(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0253iy) {
            C0253iy c0253iy = (C0253iy) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += hX.setX(c0253iy.MenuHostHelper$$ExternalSyntheticLambda1(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += hX.setX(list.get(i3).longValue());
            }
        }
        return i;
    }

    public static int ViewPager$SavedState$1(int i, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return setUiOptions(list) + (size * hX.setCenterIfNoTextEnabled(i));
    }

    public static int setNavigationOnClickListener(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0253iy) {
            C0253iy c0253iy = (C0253iy) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += hX.setY(c0253iy.MenuHostHelper$$ExternalSyntheticLambda1(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += hX.setY(list.get(i3).longValue());
            }
        }
        return i;
    }

    public static int setNavigationOnClickListener(int i, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return setNavigationOnClickListener(list) + (size * hX.setCenterIfNoTextEnabled(i));
    }

    public static int setY(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0244iq) {
            C0244iq c0244iq = (C0244iq) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += hX.MenuHostHelper$$ExternalSyntheticLambda1(c0244iq.MenuHostHelper$$ExternalSyntheticLambda0(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += hX.MenuHostHelper$$ExternalSyntheticLambda1(list.get(i3).intValue());
            }
        }
        return i;
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda0(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return setY(list) + (size * hX.setCenterIfNoTextEnabled(i));
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda1(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0244iq) {
            C0244iq c0244iq = (C0244iq) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += hX.setLayoutAnimation(c0244iq.MenuHostHelper$$ExternalSyntheticLambda0(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += hX.setLayoutAnimation(list.get(i3).intValue());
            }
        }
        return i;
    }

    public static int setUiOptions(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return MenuHostHelper$$ExternalSyntheticLambda1(list) + (size * hX.setCenterIfNoTextEnabled(i));
    }

    public static int setOnLongClickListener(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0244iq) {
            C0244iq c0244iq = (C0244iq) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += hX.setChipCornerRadius(c0244iq.MenuHostHelper$$ExternalSyntheticLambda0(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += hX.setChipCornerRadius(list.get(i3).intValue());
            }
        }
        return i;
    }

    public static int setCenterIfNoTextEnabled(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return setOnLongClickListener(list) + (size * hX.setCenterIfNoTextEnabled(i));
    }

    public static int setUnboundedRipple(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0244iq) {
            C0244iq c0244iq = (C0244iq) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += hX.setIconSize(c0244iq.MenuHostHelper$$ExternalSyntheticLambda0(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += hX.setIconSize(list.get(i3).intValue());
            }
        }
        return i;
    }

    public static int setUnboundedRipple(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return setUnboundedRipple(list) + (size * hX.setCenterIfNoTextEnabled(i));
    }

    public static int setIconTintList(List<?> list) {
        return list.size() << 2;
    }

    public static int setX(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * hX.setIconTintList(i);
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda0(List<?> list) {
        return list.size() << 3;
    }

    public static int setIconTintList(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * hX.setY(i);
    }

    public static int setX(List<?> list) {
        return list.size();
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda1(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * hX.MenuHostHelper$$ExternalSyntheticLambda0(i);
    }

    public static int setLayoutAnimation(int i, List<?> list) {
        int MenuHostHelper$$ExternalSyntheticLambda0;
        int MenuHostHelper$$ExternalSyntheticLambda02;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int centerIfNoTextEnabled = hX.setCenterIfNoTextEnabled(i) * size;
        if (list instanceof InterfaceC0249iv) {
            InterfaceC0249iv interfaceC0249iv = (InterfaceC0249iv) list;
            while (i2 < size) {
                Object iconTintList = interfaceC0249iv.setIconTintList(i2);
                if (iconTintList instanceof hY) {
                    MenuHostHelper$$ExternalSyntheticLambda02 = hX.setIconTintList((hY) iconTintList);
                } else {
                    MenuHostHelper$$ExternalSyntheticLambda02 = hX.MenuHostHelper$$ExternalSyntheticLambda0((String) iconTintList);
                }
                centerIfNoTextEnabled += MenuHostHelper$$ExternalSyntheticLambda02;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof hY) {
                    MenuHostHelper$$ExternalSyntheticLambda0 = hX.setIconTintList((hY) obj);
                } else {
                    MenuHostHelper$$ExternalSyntheticLambda0 = hX.MenuHostHelper$$ExternalSyntheticLambda0((String) obj);
                }
                centerIfNoTextEnabled += MenuHostHelper$$ExternalSyntheticLambda0;
                i2++;
            }
        }
        return centerIfNoTextEnabled;
    }

    public static int setX(int i, Object obj, iY iYVar) {
        if (obj instanceof C0247it) {
            return hX.setY(i, (C0247it) obj);
        }
        return hX.MenuHostHelper$$ExternalSyntheticLambda0(i, (iJ) obj, iYVar);
    }

    public static int setIconTintList(int i, List<?> list, iY iYVar) {
        int x;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int centerIfNoTextEnabled = hX.setCenterIfNoTextEnabled(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C0247it) {
                x = hX.setY((C0247it) obj);
            } else {
                x = hX.setX((iJ) obj, iYVar);
            }
            centerIfNoTextEnabled += x;
        }
        return centerIfNoTextEnabled;
    }

    public static int setY(int i, List<hY> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int centerIfNoTextEnabled = size * hX.setCenterIfNoTextEnabled(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            centerIfNoTextEnabled += hX.setIconTintList(list.get(i2));
        }
        return centerIfNoTextEnabled;
    }

    public static int setY(int i, List<iJ> list, iY iYVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += hX.setX(i, list.get(i3), iYVar);
        }
        return i2;
    }

    public static je<?, ?> setY() {
        return setX;
    }

    private static je<?, ?> MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        try {
            Class<?> iconTintList = setIconTintList();
            if (iconTintList == null) {
                return null;
            }
            return (je) iconTintList.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> setX() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> setIconTintList() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean setIconTintList(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> void setX(iE iEVar, T t, T t2, long j) {
        ji.setX(t, j, iEVar.MenuHostHelper$$ExternalSyntheticLambda1(ji.setNavigationOnClickListener(t, j), ji.setNavigationOnClickListener(t2, j)));
    }

    public static <T, FT extends ij$MenuHostHelper$$ExternalSyntheticLambda0<FT>> void setY(AbstractC0231ic<FT> abstractC0231ic, T t, T t2) {
        Iterable<Map.Entry<FT, Object>> entrySet;
        C0237ij<FT> MenuHostHelper$$ExternalSyntheticLambda12 = abstractC0231ic.MenuHostHelper$$ExternalSyntheticLambda1(t2);
        if (MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda1.isEmpty()) {
            return;
        }
        C0237ij<FT> y = abstractC0231ic.setY(t);
        for (int i = 0; i < MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1.size(); i++) {
            y.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1.get(i));
        }
        iW<FT, Object> iWVar = MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda1;
        if (iWVar.setIconTintList.isEmpty()) {
            entrySet = iW$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0();
        } else {
            entrySet = iWVar.setIconTintList.entrySet();
        }
        for (Map.Entry<FT, Object> entry : entrySet) {
            y.MenuHostHelper$$ExternalSyntheticLambda0(entry);
        }
    }

    public static <T, UT, UB> void setY(je<UT, UB> jeVar, T t, T t2) {
        jeVar.setIconTintList(t, jeVar.setX(jeVar.setX(t), jeVar.setX(t2)));
    }
}