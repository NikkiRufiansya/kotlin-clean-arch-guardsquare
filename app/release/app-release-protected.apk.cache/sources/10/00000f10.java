package o;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import o.RemoteConfigRegistrar;
import o.setPromptId;
import o.setViewCacheExtension;

/* loaded from: classes.dex */
final class setRotationX {
    private static final Class<?> setX = MenuHostHelper$$ExternalSyntheticLambda0();
    private static final LegacySavedStateHandleController$1<?, ?> setY = setY(false);
    private static final LegacySavedStateHandleController$1<?, ?> MenuHostHelper$$ExternalSyntheticLambda1 = setY(true);
    private static final LegacySavedStateHandleController$1<?, ?> setIconTintList = new LegacySavedStateHandleController$1<setLayerPaint, setLayerPaint>() { // from class: o.WindowInsetsCompat$Impl21
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.LegacySavedStateHandleController$1
        public final /* synthetic */ setLayerPaint MenuHostHelper$$ExternalSyntheticLambda0(setLayerPaint setlayerpaint, setLayerPaint setlayerpaint2) {
            setLayerPaint setlayerpaint3 = setlayerpaint;
            setLayerPaint setlayerpaint4 = setlayerpaint2;
            return !setlayerpaint4.equals(setLayerPaint.setIconTintList()) ? setLayerPaint.MenuHostHelper$$ExternalSyntheticLambda0(setlayerpaint3, setlayerpaint4) : setlayerpaint3;
        }

        @Override // o.LegacySavedStateHandleController$1
        final /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(setLayerPaint setlayerpaint, int i, int i2) {
            setlayerpaint.setY(setCloseIconVisible.setY(i, 5), Integer.valueOf(i2));
        }

        @Override // o.LegacySavedStateHandleController$1
        final /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(setLayerPaint setlayerpaint, int i, long j) {
            setlayerpaint.setY(setCloseIconVisible.setY(i, 1), Long.valueOf(j));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.LegacySavedStateHandleController$1
        public final /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(setLayerPaint setlayerpaint, int i, setSpeed setspeed) {
            setlayerpaint.setY(setCloseIconVisible.setY(i, 2), setspeed);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.LegacySavedStateHandleController$1
        public final /* bridge */ /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, setLayerPaint setlayerpaint) {
            ((setStartIconContentDescription) obj).unknownFields = setlayerpaint;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.LegacySavedStateHandleController$1
        public final /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(setLayerPaint setlayerpaint, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29) {
            setLayerPaint setlayerpaint2 = setlayerpaint;
            if (windowInsetsCompat$Impl29.setIconTintList() == WindowInsetsCompat$Impl29$MenuHostHelper$$ExternalSyntheticLambda0.DESCENDING) {
                for (int i = setlayerpaint2.MenuHostHelper$$ExternalSyntheticLambda0 - 1; i >= 0; i--) {
                    windowInsetsCompat$Impl29.MenuHostHelper$$ExternalSyntheticLambda1(setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda0(setlayerpaint2.MenuHostHelper$$ExternalSyntheticLambda1[i]), setlayerpaint2.setIconTintList[i]);
                }
                return;
            }
            for (int i2 = 0; i2 < setlayerpaint2.MenuHostHelper$$ExternalSyntheticLambda0; i2++) {
                windowInsetsCompat$Impl29.MenuHostHelper$$ExternalSyntheticLambda1(setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda0(setlayerpaint2.MenuHostHelper$$ExternalSyntheticLambda1[i2]), setlayerpaint2.setIconTintList[i2]);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.LegacySavedStateHandleController$1
        public final /* synthetic */ int setIconTintList(setLayerPaint setlayerpaint) {
            return setlayerpaint.setX();
        }

        @Override // o.LegacySavedStateHandleController$1
        final /* synthetic */ void setIconTintList(setLayerPaint setlayerpaint, int i, setLayerPaint setlayerpaint2) {
            setlayerpaint.setY(setCloseIconVisible.setY(i, 3), setlayerpaint2);
        }

        @Override // o.LegacySavedStateHandleController$1
        final /* bridge */ /* synthetic */ setLayerPaint setUiOptions(setLayerPaint setlayerpaint) {
            setLayerPaint setlayerpaint2 = setlayerpaint;
            setlayerpaint2.setX = false;
            return setlayerpaint2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.LegacySavedStateHandleController$1
        public final /* synthetic */ int setX(setLayerPaint setlayerpaint) {
            setLayerPaint setlayerpaint2 = setlayerpaint;
            int i = setlayerpaint2.setY;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < setlayerpaint2.MenuHostHelper$$ExternalSyntheticLambda0; i3++) {
                i2 += setMenuPrepared.setIconTintList(setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda0(setlayerpaint2.MenuHostHelper$$ExternalSyntheticLambda1[i3]), (setSpeed) setlayerpaint2.setIconTintList[i3]);
            }
            setlayerpaint2.setY = i2;
            return i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.LegacySavedStateHandleController$1
        public final /* synthetic */ void setX(setLayerPaint setlayerpaint, int i, long j) {
            setlayerpaint.setY(setCloseIconVisible.setY(i, 0), Long.valueOf(j));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.LegacySavedStateHandleController$1
        public final /* bridge */ /* synthetic */ void setX(setLayerPaint setlayerpaint, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29) {
            setlayerpaint.setX(windowInsetsCompat$Impl29);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.LegacySavedStateHandleController$1
        public final /* bridge */ /* synthetic */ void setY(Object obj, setLayerPaint setlayerpaint) {
            ((setStartIconContentDescription) obj).unknownFields = setlayerpaint;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.LegacySavedStateHandleController$1
        public final /* synthetic */ setLayerPaint setY(Object obj) {
            setStartIconContentDescription setstarticoncontentdescription = (setStartIconContentDescription) obj;
            setLayerPaint setlayerpaint = setstarticoncontentdescription.unknownFields;
            if (setlayerpaint == setLayerPaint.setIconTintList()) {
                setLayerPaint y = setLayerPaint.setY();
                setstarticoncontentdescription.unknownFields = y;
                return y;
            }
            return setlayerpaint;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.LegacySavedStateHandleController$1
        public final /* bridge */ /* synthetic */ setLayerPaint MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
            return ((setStartIconContentDescription) obj).unknownFields;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.LegacySavedStateHandleController$1
        public final void MenuHostHelper$$ExternalSyntheticLambda0(Object obj) {
            ((setStartIconContentDescription) obj).unknownFields.setX = false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.LegacySavedStateHandleController$1
        public final /* synthetic */ setLayerPaint setIconTintList() {
            return setLayerPaint.setY();
        }
    };

    public static void setIconTintList(Class<?> cls) {
        Class<?> cls2;
        if (!setStartIconContentDescription.class.isAssignableFrom(cls) && (cls2 = setX) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void setY(int i, List<Double> list, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        windowInsetsCompat$Impl29.setY(i, list, z);
    }

    public static void setUiOptions(int i, List<Float> list, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        windowInsetsCompat$Impl29.setUnboundedRipple(i, list, z);
    }

    public static void setUnboundedRipple(int i, List<Long> list, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        windowInsetsCompat$Impl29.setNavigationOnClickListener(i, list, z);
    }

    public static void setIconSize(int i, List<Long> list, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        windowInsetsCompat$Impl29.setTextAlignment(i, list, z);
    }

    public static void setChipCornerRadius(int i, List<Long> list, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        windowInsetsCompat$Impl29.setIconSize(i, list, z);
    }

    public static void setX(int i, List<Long> list, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        windowInsetsCompat$Impl29.MenuHostHelper$$ExternalSyntheticLambda0(i, list, z);
    }

    public static void setNavigationOnClickListener(int i, List<Long> list, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        windowInsetsCompat$Impl29.setUiOptions(i, list, z);
    }

    public static void setOnLongClickListener(int i, List<Integer> list, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        windowInsetsCompat$Impl29.setOnLongClickListener(i, list, z);
    }

    public static void setTextAlignment(int i, List<Integer> list, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        windowInsetsCompat$Impl29.setCenterIfNoTextEnabled(i, list, z);
    }

    public static void setCenterIfNoTextEnabled(int i, List<Integer> list, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        windowInsetsCompat$Impl29.setChipCornerRadius(i, list, z);
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(int i, List<Integer> list, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        windowInsetsCompat$Impl29.setX(i, list, z);
    }

    public static void setLayoutAnimation(int i, List<Integer> list, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        windowInsetsCompat$Impl29.setLayoutAnimation(i, list, z);
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(int i, List<Integer> list, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        windowInsetsCompat$Impl29.setIconTintList(i, list, z);
    }

    public static void setIconTintList(int i, List<Boolean> list, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        windowInsetsCompat$Impl29.MenuHostHelper$$ExternalSyntheticLambda1(i, list, z);
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(int i, List<String> list, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29) {
        if (list == null || list.isEmpty()) {
            return;
        }
        windowInsetsCompat$Impl29.setIconTintList(i, list);
    }

    public static void setY(int i, List<setSpeed> list, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29) {
        if (list == null || list.isEmpty()) {
            return;
        }
        windowInsetsCompat$Impl29.setX(i, list);
    }

    public static void setIconTintList(int i, List<?> list, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29, setValues setvalues) {
        if (list == null || list.isEmpty()) {
            return;
        }
        windowInsetsCompat$Impl29.setX(i, list, setvalues);
    }

    public static void setY(int i, List<?> list, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29, setValues setvalues) {
        if (list == null || list.isEmpty()) {
            return;
        }
        windowInsetsCompat$Impl29.MenuHostHelper$$ExternalSyntheticLambda1(i, list, setvalues);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setLayoutAnimation(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof setChipEndPaddingResource) {
            setChipEndPaddingResource setchipendpaddingresource = (setChipEndPaddingResource) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(setchipendpaddingresource.MenuHostHelper$$ExternalSyntheticLambda1(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(list.get(i3).longValue());
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setUiOptions(int i, List<Long> list) {
        if (list.size() == 0) {
            return 0;
        }
        return setLayoutAnimation(list) + (list.size() * setMenuPrepared.ViewPager$SavedState$1(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setUnboundedRipple(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof setChipEndPaddingResource) {
            setChipEndPaddingResource setchipendpaddingresource = (setChipEndPaddingResource) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += setMenuPrepared.setX(setchipendpaddingresource.MenuHostHelper$$ExternalSyntheticLambda1(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += setMenuPrepared.setX(list.get(i3).longValue());
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setChipCornerRadius(int i, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return setUnboundedRipple(list) + (size * setMenuPrepared.ViewPager$SavedState$1(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setUiOptions(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof setChipEndPaddingResource) {
            setChipEndPaddingResource setchipendpaddingresource = (setChipEndPaddingResource) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda1(setchipendpaddingresource.MenuHostHelper$$ExternalSyntheticLambda1(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda1(list.get(i3).longValue());
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setOnLongClickListener(int i, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return setUiOptions(list) + (size * setMenuPrepared.ViewPager$SavedState$1(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setIconTintList(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof setLabelVisibilityMode) {
            setLabelVisibilityMode setlabelvisibilitymode = (setLabelVisibilityMode) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += setMenuPrepared.setX(setlabelvisibilitymode.setY(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += setMenuPrepared.setX(list.get(i3).intValue());
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setY(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return setIconTintList(list) + (size * setMenuPrepared.ViewPager$SavedState$1(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setX(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof setLabelVisibilityMode) {
            setLabelVisibilityMode setlabelvisibilitymode = (setLabelVisibilityMode) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += setMenuPrepared.setUnboundedRipple(setlabelvisibilitymode.setY(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += setMenuPrepared.setUnboundedRipple(list.get(i3).intValue());
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setNavigationOnClickListener(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return setX(list) + (size * setMenuPrepared.ViewPager$SavedState$1(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setOnLongClickListener(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof setLabelVisibilityMode) {
            setLabelVisibilityMode setlabelvisibilitymode = (setLabelVisibilityMode) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += setMenuPrepared.setCenterIfNoTextEnabled(setlabelvisibilitymode.setY(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += setMenuPrepared.setCenterIfNoTextEnabled(list.get(i3).intValue());
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setIconSize(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return setOnLongClickListener(list) + (size * setMenuPrepared.ViewPager$SavedState$1(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setNavigationOnClickListener(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof setLabelVisibilityMode) {
            setLabelVisibilityMode setlabelvisibilitymode = (setLabelVisibilityMode) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += setMenuPrepared.setChipCornerRadius(setlabelvisibilitymode.setY(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += setMenuPrepared.setChipCornerRadius(list.get(i3).intValue());
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setLayoutAnimation(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return setNavigationOnClickListener(list) + (size * setMenuPrepared.ViewPager$SavedState$1(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int MenuHostHelper$$ExternalSyntheticLambda1(List<?> list) {
        return list.size() << 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int MenuHostHelper$$ExternalSyntheticLambda1(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setY(List<?> list) {
        return list.size() << 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setX(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * setMenuPrepared.setIconTintList(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int MenuHostHelper$$ExternalSyntheticLambda0(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda1(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setUnboundedRipple(int i, List<?> list) {
        int MenuHostHelper$$ExternalSyntheticLambda0;
        int MenuHostHelper$$ExternalSyntheticLambda02;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int ViewPager$SavedState$1 = setMenuPrepared.ViewPager$SavedState$1(i) * size;
        if (list instanceof ExecutorsRegistrar) {
            ExecutorsRegistrar executorsRegistrar = (ExecutorsRegistrar) list;
            while (i2 < size) {
                Object iconTintList = executorsRegistrar.setIconTintList(i2);
                if (iconTintList instanceof setSpeed) {
                    MenuHostHelper$$ExternalSyntheticLambda02 = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda1((setSpeed) iconTintList);
                } else {
                    MenuHostHelper$$ExternalSyntheticLambda02 = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0((String) iconTintList);
                }
                ViewPager$SavedState$1 += MenuHostHelper$$ExternalSyntheticLambda02;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof setSpeed) {
                    MenuHostHelper$$ExternalSyntheticLambda0 = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda1((setSpeed) obj);
                } else {
                    MenuHostHelper$$ExternalSyntheticLambda0 = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0((String) obj);
                }
                ViewPager$SavedState$1 += MenuHostHelper$$ExternalSyntheticLambda0;
                i2++;
            }
        }
        return ViewPager$SavedState$1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setY(int i, Object obj, setValues setvalues) {
        if (obj instanceof setAddStatesFromChildren) {
            return setMenuPrepared.setY(i, (setAddStatesFromChildren) obj);
        }
        return setMenuPrepared.setX(i, (setDrawingCacheQuality) obj, setvalues);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setY(int i, List<?> list, setValues setvalues) {
        int y;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int ViewPager$SavedState$1 = setMenuPrepared.ViewPager$SavedState$1(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof setAddStatesFromChildren) {
                y = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0((setAddStatesFromChildren) obj);
            } else {
                y = setMenuPrepared.setY((setDrawingCacheQuality) obj, setvalues);
            }
            ViewPager$SavedState$1 += y;
        }
        return ViewPager$SavedState$1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setIconTintList(int i, List<setSpeed> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int ViewPager$SavedState$1 = size * setMenuPrepared.ViewPager$SavedState$1(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            ViewPager$SavedState$1 += setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda1(list.get(i2));
        }
        return ViewPager$SavedState$1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int MenuHostHelper$$ExternalSyntheticLambda0(int i, List<setDrawingCacheQuality> list, setValues setvalues) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(i, list.get(i3), setvalues);
        }
        return i2;
    }

    public static LegacySavedStateHandleController$1<?, ?> setY() {
        return setY;
    }

    public static LegacySavedStateHandleController$1<?, ?> setIconTintList() {
        return MenuHostHelper$$ExternalSyntheticLambda1;
    }

    private static LegacySavedStateHandleController$1<?, ?> setY(boolean z) {
        try {
            Class<?> x = setX();
            if (x == null) {
                return null;
            }
            return (LegacySavedStateHandleController$1) x.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> MenuHostHelper$$ExternalSyntheticLambda0() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> setX() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean MenuHostHelper$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends RemoteConfigRegistrar.setY<FT>> void setX(setHovered<FT> sethovered, T t, T t2) {
        Iterable<Map.Entry<FT, Object>> entrySet;
        RemoteConfigRegistrar<FT> MenuHostHelper$$ExternalSyntheticLambda12 = sethovered.MenuHostHelper$$ExternalSyntheticLambda1(t2);
        if (MenuHostHelper$$ExternalSyntheticLambda12.setX.isEmpty()) {
            return;
        }
        RemoteConfigRegistrar<FT> x = sethovered.setX(t);
        for (int i = 0; i < MenuHostHelper$$ExternalSyntheticLambda12.setX.setIconTintList.size(); i++) {
            x.setX(MenuHostHelper$$ExternalSyntheticLambda12.setX.setIconTintList.get(i));
        }
        setPromptId<FT, Object> setpromptid = MenuHostHelper$$ExternalSyntheticLambda12.setX;
        if (setpromptid.MenuHostHelper$$ExternalSyntheticLambda0.isEmpty()) {
            entrySet = setPromptId.setX.setY();
        } else {
            entrySet = setpromptid.MenuHostHelper$$ExternalSyntheticLambda0.entrySet();
        }
        for (Map.Entry<FT, Object> entry : entrySet) {
            x.setX(entry);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB MenuHostHelper$$ExternalSyntheticLambda0(int i, List<Integer> list, setViewCacheExtension.setIconTintList<?> seticontintlist, UB ub, LegacySavedStateHandleController$1<UT, UB> legacySavedStateHandleController$1) {
        if (seticontintlist == null) {
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int intValue = list.get(i3).intValue();
            if (seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0() != null) {
                if (i3 != i2) {
                    list.set(i2, Integer.valueOf(intValue));
                }
                i2++;
            } else {
                if (ub == null) {
                    ub = legacySavedStateHandleController$1.setIconTintList();
                }
                legacySavedStateHandleController$1.setX(ub, i, intValue);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB MenuHostHelper$$ExternalSyntheticLambda0(int i, List<Integer> list, setViewCacheExtension.setY sety, UB ub, LegacySavedStateHandleController$1<UT, UB> legacySavedStateHandleController$1) {
        if (sety == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (sety.setX()) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    if (ub == null) {
                        ub = legacySavedStateHandleController$1.setIconTintList();
                    }
                    legacySavedStateHandleController$1.setX(ub, i, intValue);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!sety.setX()) {
                    if (ub == null) {
                        ub = legacySavedStateHandleController$1.setIconTintList();
                    }
                    legacySavedStateHandleController$1.setX(ub, i, intValue2);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB setY(int i, int i2, UB ub, LegacySavedStateHandleController$1<UT, UB> legacySavedStateHandleController$1) {
        if (ub == null) {
            ub = legacySavedStateHandleController$1.setIconTintList();
        }
        legacySavedStateHandleController$1.setX(ub, i, i2);
        return ub;
    }
}