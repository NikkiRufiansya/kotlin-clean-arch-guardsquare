package o;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.RemoteConfigRegistrar;
import o.setCloseIconVisible;
import o.setExpandedTitleMargin;
import o.setPromptId;
import o.setRightStripDrawable;
import o.setSpeed;
import o.setViewCacheExtension;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class setHasTransientState<T> implements setValues<T> {
    private static final int[] MenuHostHelper$$ExternalSyntheticLambda1 = new int[0];
    private static final Unsafe setY = WindowInsetsCompat$Impl20.MenuHostHelper$$ExternalSyntheticLambda0();
    private final int[] MenuHostHelper$$ExternalSyntheticLambda0;
    private final Object[] ViewPager$SavedState$1;
    private final LegacySavedStateHandleController$1<?, ?> setAnimationFromJson;
    private final int setCenterIfNoTextEnabled;
    private final int setChipCornerRadius;
    private final setSafeMode setIconSize;
    private final int setIconTintList;
    private final boolean setLayoutAnimation;
    private final boolean setMaxEms;
    private final boolean setNavigationOnClickListener;
    private final setHovered<?> setOnLongClickListener;
    private final getInsetsForType setTextAlignment;
    private final int setTextScaleX;
    private final setStatusBarScrim setUiOptions;
    private final int[] setUnboundedRipple;
    private final setDrawingCacheQuality setX;
    private final boolean setZ;

    private static long MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        return i & 1048575;
    }

    private setHasTransientState(int[] iArr, Object[] objArr, int i, int i2, setDrawingCacheQuality setdrawingcachequality, boolean z, boolean z2, int[] iArr2, int i3, int i4, getInsetsForType getinsetsfortype, setStatusBarScrim setstatusbarscrim, LegacySavedStateHandleController$1<?, ?> legacySavedStateHandleController$1, setHovered<?> sethovered, setSafeMode setsafemode) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = iArr;
        this.ViewPager$SavedState$1 = objArr;
        this.setChipCornerRadius = i;
        this.setCenterIfNoTextEnabled = i2;
        this.setNavigationOnClickListener = setdrawingcachequality instanceof setStartIconContentDescription;
        this.setMaxEms = z;
        this.setLayoutAnimation = sethovered != null && sethovered.setX(setdrawingcachequality);
        this.setZ = z2;
        this.setUnboundedRipple = iArr2;
        this.setIconTintList = i3;
        this.setTextScaleX = i4;
        this.setTextAlignment = getinsetsfortype;
        this.setUiOptions = setstatusbarscrim;
        this.setAnimationFromJson = legacySavedStateHandleController$1;
        this.setOnLongClickListener = sethovered;
        this.setX = setdrawingcachequality;
        this.setIconSize = setsafemode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0297, code lost:
        if ((r10 & 1) == 1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0341, code lost:
        if ((r10 & 1) == 1) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> o.setHasTransientState<T> MenuHostHelper$$ExternalSyntheticLambda1(o.setFillColor r42, o.getInsetsForType r43, o.setStatusBarScrim r44, o.LegacySavedStateHandleController$1<?, ?> r45, o.setHovered<?> r46, o.setSafeMode r47) {
        /*
            Method dump skipped, instructions count: 1589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setHasTransientState.MenuHostHelper$$ExternalSyntheticLambda1(o.setFillColor, o.getInsetsForType, o.setStatusBarScrim, o.LegacySavedStateHandleController$1, o.setHovered, o.setSafeMode):o.setHasTransientState");
    }

    private static Field setX(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sb = new StringBuilder("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(cls.getName());
            sb.append(" not found. Known fields are ");
            sb.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sb.toString());
        }
    }

    @Override // o.setValues
    public final T setIconTintList() {
        return (T) this.setTextAlignment.MenuHostHelper$$ExternalSyntheticLambda0(this.setX);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x019b, code lost:
        if (o.WindowInsetsCompat$Impl20.setIconTintList(r11, r7) == o.WindowInsetsCompat$Impl20.setIconTintList(r12, r7)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b6, code lost:
        if (o.WindowInsetsCompat$Impl20.setOnLongClickListener(r11, r7) == o.WindowInsetsCompat$Impl20.setOnLongClickListener(r12, r7)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01d3, code lost:
        if (o.WindowInsetsCompat$Impl20.setNavigationOnClickListener(r11, r7) == o.WindowInsetsCompat$Impl20.setNavigationOnClickListener(r12, r7)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01ee, code lost:
        if (o.WindowInsetsCompat$Impl20.setOnLongClickListener(r11, r7) == o.WindowInsetsCompat$Impl20.setOnLongClickListener(r12, r7)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x020b, code lost:
        if (o.WindowInsetsCompat$Impl20.setNavigationOnClickListener(r11, r7) == o.WindowInsetsCompat$Impl20.setNavigationOnClickListener(r12, r7)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0227, code lost:
        if (o.WindowInsetsCompat$Impl20.setNavigationOnClickListener(r11, r7) == o.WindowInsetsCompat$Impl20.setNavigationOnClickListener(r12, r7)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (o.setRotationX.MenuHostHelper$$ExternalSyntheticLambda0(o.WindowInsetsCompat$Impl20.setUnboundedRipple(r11, r7), o.WindowInsetsCompat$Impl20.setUnboundedRipple(r12, r7)) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0249, code lost:
        if (java.lang.Float.floatToIntBits(o.WindowInsetsCompat$Impl20.setUiOptions(r11, r7)) == java.lang.Float.floatToIntBits(o.WindowInsetsCompat$Impl20.setUiOptions(r12, r7))) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x026d, code lost:
        if (java.lang.Double.doubleToLongBits(o.WindowInsetsCompat$Impl20.setLayoutAnimation(r11, r7)) == java.lang.Double.doubleToLongBits(o.WindowInsetsCompat$Impl20.setLayoutAnimation(r12, r7))) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
        if (o.setRotationX.MenuHostHelper$$ExternalSyntheticLambda0(o.WindowInsetsCompat$Impl20.setUnboundedRipple(r11, r7), o.WindowInsetsCompat$Impl20.setUnboundedRipple(r12, r7)) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
        if (o.WindowInsetsCompat$Impl20.setNavigationOnClickListener(r11, r7) == o.WindowInsetsCompat$Impl20.setNavigationOnClickListener(r12, r7)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
        if (o.WindowInsetsCompat$Impl20.setOnLongClickListener(r11, r7) == o.WindowInsetsCompat$Impl20.setOnLongClickListener(r12, r7)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d2, code lost:
        if (o.WindowInsetsCompat$Impl20.setNavigationOnClickListener(r11, r7) == o.WindowInsetsCompat$Impl20.setNavigationOnClickListener(r12, r7)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ed, code lost:
        if (o.WindowInsetsCompat$Impl20.setOnLongClickListener(r11, r7) == o.WindowInsetsCompat$Impl20.setOnLongClickListener(r12, r7)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0108, code lost:
        if (o.WindowInsetsCompat$Impl20.setOnLongClickListener(r11, r7) == o.WindowInsetsCompat$Impl20.setOnLongClickListener(r12, r7)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0123, code lost:
        if (o.WindowInsetsCompat$Impl20.setOnLongClickListener(r11, r7) == o.WindowInsetsCompat$Impl20.setOnLongClickListener(r12, r7)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0142, code lost:
        if (o.setRotationX.MenuHostHelper$$ExternalSyntheticLambda0(o.WindowInsetsCompat$Impl20.setUnboundedRipple(r11, r7), o.WindowInsetsCompat$Impl20.setUnboundedRipple(r12, r7)) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0161, code lost:
        if (o.setRotationX.MenuHostHelper$$ExternalSyntheticLambda0(o.WindowInsetsCompat$Impl20.setUnboundedRipple(r11, r7), o.WindowInsetsCompat$Impl20.setUnboundedRipple(r12, r7)) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0180, code lost:
        if (o.setRotationX.MenuHostHelper$$ExternalSyntheticLambda0(o.WindowInsetsCompat$Impl20.setUnboundedRipple(r11, r7), o.WindowInsetsCompat$Impl20.setUnboundedRipple(r12, r7)) != false) goto L142;
     */
    @Override // o.setValues
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(T r11, T r12) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setHasTransientState.MenuHostHelper$$ExternalSyntheticLambda0(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // o.setValues
    public final int MenuHostHelper$$ExternalSyntheticLambda1(T t) {
        int i;
        int MenuHostHelper$$ExternalSyntheticLambda0;
        int length = this.MenuHostHelper$$ExternalSyntheticLambda0.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            int i4 = iArr[i3 + 1];
            int i5 = iArr[i3];
            long j = 1048575 & i4;
            int i6 = 37;
            switch ((i4 & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    MenuHostHelper$$ExternalSyntheticLambda0 = setViewCacheExtension.MenuHostHelper$$ExternalSyntheticLambda0(Double.doubleToLongBits(WindowInsetsCompat$Impl20.setLayoutAnimation(t, j)));
                    i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                    break;
                case 1:
                    i = i2 * 53;
                    MenuHostHelper$$ExternalSyntheticLambda0 = Float.floatToIntBits(WindowInsetsCompat$Impl20.setUiOptions(t, j));
                    i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                    break;
                case 2:
                    i = i2 * 53;
                    MenuHostHelper$$ExternalSyntheticLambda0 = setViewCacheExtension.MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl20.setNavigationOnClickListener(t, j));
                    i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                    break;
                case 3:
                    i = i2 * 53;
                    MenuHostHelper$$ExternalSyntheticLambda0 = setViewCacheExtension.MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl20.setNavigationOnClickListener(t, j));
                    i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                    break;
                case 4:
                    i = i2 * 53;
                    MenuHostHelper$$ExternalSyntheticLambda0 = WindowInsetsCompat$Impl20.setOnLongClickListener(t, j);
                    i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                    break;
                case 5:
                    i = i2 * 53;
                    MenuHostHelper$$ExternalSyntheticLambda0 = setViewCacheExtension.MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl20.setNavigationOnClickListener(t, j));
                    i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                    break;
                case 6:
                    i = i2 * 53;
                    MenuHostHelper$$ExternalSyntheticLambda0 = WindowInsetsCompat$Impl20.setOnLongClickListener(t, j);
                    i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                    break;
                case 7:
                    i = i2 * 53;
                    MenuHostHelper$$ExternalSyntheticLambda0 = setViewCacheExtension.setIconTintList(WindowInsetsCompat$Impl20.setIconTintList(t, j));
                    i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                    break;
                case 8:
                    i = i2 * 53;
                    MenuHostHelper$$ExternalSyntheticLambda0 = ((String) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j)).hashCode();
                    i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                    break;
                case 9:
                    Object unboundedRipple = WindowInsetsCompat$Impl20.setUnboundedRipple(t, j);
                    if (unboundedRipple != null) {
                        i6 = unboundedRipple.hashCode();
                    }
                    i2 = (i2 * 53) + i6;
                    break;
                case 10:
                    i = i2 * 53;
                    MenuHostHelper$$ExternalSyntheticLambda0 = WindowInsetsCompat$Impl20.setUnboundedRipple(t, j).hashCode();
                    i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                    break;
                case 11:
                    i = i2 * 53;
                    MenuHostHelper$$ExternalSyntheticLambda0 = WindowInsetsCompat$Impl20.setOnLongClickListener(t, j);
                    i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                    break;
                case 12:
                    i = i2 * 53;
                    MenuHostHelper$$ExternalSyntheticLambda0 = WindowInsetsCompat$Impl20.setOnLongClickListener(t, j);
                    i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                    break;
                case 13:
                    i = i2 * 53;
                    MenuHostHelper$$ExternalSyntheticLambda0 = WindowInsetsCompat$Impl20.setOnLongClickListener(t, j);
                    i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                    break;
                case 14:
                    i = i2 * 53;
                    MenuHostHelper$$ExternalSyntheticLambda0 = setViewCacheExtension.MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl20.setNavigationOnClickListener(t, j));
                    i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                    break;
                case 15:
                    i = i2 * 53;
                    MenuHostHelper$$ExternalSyntheticLambda0 = WindowInsetsCompat$Impl20.setOnLongClickListener(t, j);
                    i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                    break;
                case 16:
                    i = i2 * 53;
                    MenuHostHelper$$ExternalSyntheticLambda0 = setViewCacheExtension.MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl20.setNavigationOnClickListener(t, j));
                    i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                    break;
                case 17:
                    Object unboundedRipple2 = WindowInsetsCompat$Impl20.setUnboundedRipple(t, j);
                    if (unboundedRipple2 != null) {
                        i6 = unboundedRipple2.hashCode();
                    }
                    i2 = (i2 * 53) + i6;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case setExpandedTitleMargin.setY.setChipCornerRadius /* 36 */:
                case 37:
                case setExpandedTitleMargin.setY.setSupportCheckMarkTintList /* 38 */:
                case setExpandedTitleMargin.setY.setVelocityScale /* 39 */:
                case setExpandedTitleMargin.setY.setRightEdgeEffectColor /* 40 */:
                case setExpandedTitleMargin.setY.setHorizontalScrollbarTrackDrawable /* 41 */:
                case setExpandedTitleMargin.setY.setOnKeyListener /* 42 */:
                case setExpandedTitleMargin.setY.setForegroundTintList /* 43 */:
                case setExpandedTitleMargin.setY.setRecyclerListener /* 44 */:
                case setExpandedTitleMargin.setY.setPreferKeepClearRects /* 45 */:
                case setExpandedTitleMargin.setY.setInterpolator /* 46 */:
                case setExpandedTitleMargin.setY.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 /* 47 */:
                case setExpandedTitleMargin.setY.ParcelableSparseArray$1 /* 48 */:
                case setExpandedTitleMargin.setY.setAutoLinkMask /* 49 */:
                    i = i2 * 53;
                    MenuHostHelper$$ExternalSyntheticLambda0 = WindowInsetsCompat$Impl20.setUnboundedRipple(t, j).hashCode();
                    i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                    break;
                case setExpandedTitleMargin.setY.setOrientation /* 50 */:
                    i = i2 * 53;
                    MenuHostHelper$$ExternalSyntheticLambda0 = WindowInsetsCompat$Impl20.setUnboundedRipple(t, j).hashCode();
                    i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                    break;
                case 51:
                    if (setX((setHasTransientState<T>) t, i5, i3)) {
                        i = i2 * 53;
                        MenuHostHelper$$ExternalSyntheticLambda0 = setViewCacheExtension.MenuHostHelper$$ExternalSyntheticLambda0(Double.doubleToLongBits(((Double) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j)).doubleValue()));
                        i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                        break;
                    } else {
                        break;
                    }
                case setExpandedTitleMargin.setY.setSupportCompoundDrawablesTintList /* 52 */:
                    if (setX((setHasTransientState<T>) t, i5, i3)) {
                        i = i2 * 53;
                        MenuHostHelper$$ExternalSyntheticLambda0 = Float.floatToIntBits(((Float) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j)).floatValue());
                        i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                        break;
                    } else {
                        break;
                    }
                case setExpandedTitleMargin.setY.setScrollingCacheEnabled /* 53 */:
                    if (setX((setHasTransientState<T>) t, i5, i3)) {
                        i = i2 * 53;
                        MenuHostHelper$$ExternalSyntheticLambda0 = setViewCacheExtension.MenuHostHelper$$ExternalSyntheticLambda0(((Long) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j)).longValue());
                        i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (setX((setHasTransientState<T>) t, i5, i3)) {
                        i = i2 * 53;
                        MenuHostHelper$$ExternalSyntheticLambda0 = setViewCacheExtension.MenuHostHelper$$ExternalSyntheticLambda0(((Long) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j)).longValue());
                        i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (setX((setHasTransientState<T>) t, i5, i3)) {
                        i = i2 * 53;
                        MenuHostHelper$$ExternalSyntheticLambda0 = ((Integer) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j)).intValue();
                        i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (setX((setHasTransientState<T>) t, i5, i3)) {
                        i = i2 * 53;
                        MenuHostHelper$$ExternalSyntheticLambda0 = setViewCacheExtension.MenuHostHelper$$ExternalSyntheticLambda0(((Long) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j)).longValue());
                        i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (setX((setHasTransientState<T>) t, i5, i3)) {
                        i = i2 * 53;
                        MenuHostHelper$$ExternalSyntheticLambda0 = ((Integer) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j)).intValue();
                        i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (setX((setHasTransientState<T>) t, i5, i3)) {
                        i = i2 * 53;
                        MenuHostHelper$$ExternalSyntheticLambda0 = setViewCacheExtension.setIconTintList(((Boolean) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j)).booleanValue());
                        i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (setX((setHasTransientState<T>) t, i5, i3)) {
                        i = i2 * 53;
                        MenuHostHelper$$ExternalSyntheticLambda0 = ((String) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j)).hashCode();
                        i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (setX((setHasTransientState<T>) t, i5, i3)) {
                        i = i2 * 53;
                        MenuHostHelper$$ExternalSyntheticLambda0 = WindowInsetsCompat$Impl20.setUnboundedRipple(t, j).hashCode();
                        i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (setX((setHasTransientState<T>) t, i5, i3)) {
                        i = i2 * 53;
                        MenuHostHelper$$ExternalSyntheticLambda0 = WindowInsetsCompat$Impl20.setUnboundedRipple(t, j).hashCode();
                        i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (setX((setHasTransientState<T>) t, i5, i3)) {
                        i = i2 * 53;
                        MenuHostHelper$$ExternalSyntheticLambda0 = ((Integer) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j)).intValue();
                        i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (setX((setHasTransientState<T>) t, i5, i3)) {
                        i = i2 * 53;
                        MenuHostHelper$$ExternalSyntheticLambda0 = ((Integer) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j)).intValue();
                        i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (setX((setHasTransientState<T>) t, i5, i3)) {
                        i = i2 * 53;
                        MenuHostHelper$$ExternalSyntheticLambda0 = ((Integer) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j)).intValue();
                        i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (setX((setHasTransientState<T>) t, i5, i3)) {
                        i = i2 * 53;
                        MenuHostHelper$$ExternalSyntheticLambda0 = setViewCacheExtension.MenuHostHelper$$ExternalSyntheticLambda0(((Long) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j)).longValue());
                        i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (setX((setHasTransientState<T>) t, i5, i3)) {
                        i = i2 * 53;
                        MenuHostHelper$$ExternalSyntheticLambda0 = ((Integer) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j)).intValue();
                        i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (setX((setHasTransientState<T>) t, i5, i3)) {
                        i = i2 * 53;
                        MenuHostHelper$$ExternalSyntheticLambda0 = setViewCacheExtension.MenuHostHelper$$ExternalSyntheticLambda0(((Long) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j)).longValue());
                        i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (setX((setHasTransientState<T>) t, i5, i3)) {
                        i = i2 * 53;
                        MenuHostHelper$$ExternalSyntheticLambda0 = WindowInsetsCompat$Impl20.setUnboundedRipple(t, j).hashCode();
                        i2 = i + MenuHostHelper$$ExternalSyntheticLambda0;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.setAnimationFromJson.MenuHostHelper$$ExternalSyntheticLambda1(t).hashCode();
        return this.setLayoutAnimation ? (hashCode * 53) + this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1(t).hashCode() : hashCode;
    }

    @Override // o.setValues
    public final void setY(T t, T t2) {
        int i = 0;
        while (true) {
            int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (i >= iArr.length) {
                if (this.setMaxEms) {
                    return;
                }
                r0.MenuHostHelper$$ExternalSyntheticLambda1(t, r0.MenuHostHelper$$ExternalSyntheticLambda0(r0.MenuHostHelper$$ExternalSyntheticLambda1(t), this.setAnimationFromJson.MenuHostHelper$$ExternalSyntheticLambda1(t2)));
                if (this.setLayoutAnimation) {
                    setRotationX.setX(this.setOnLongClickListener, t, t2);
                    return;
                }
                return;
            }
            int i2 = iArr[i + 1];
            long j = i2 & 1048575;
            int i3 = iArr[i];
            switch ((i2 & 267386880) >>> 20) {
                case 0:
                    if (!setX((setHasTransientState<T>) t2, i)) {
                        break;
                    } else {
                        WindowInsetsCompat$Impl20.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(t, j, WindowInsetsCompat$Impl20.setLayoutAnimation(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((setHasTransientState<T>) t, i);
                        break;
                    }
                case 1:
                    if (!setX((setHasTransientState<T>) t2, i)) {
                        break;
                    } else {
                        WindowInsetsCompat$Impl20.setY(t, j, WindowInsetsCompat$Impl20.setUiOptions(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((setHasTransientState<T>) t, i);
                        break;
                    }
                case 2:
                    if (!setX((setHasTransientState<T>) t2, i)) {
                        break;
                    } else {
                        WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putLong(t, j, WindowInsetsCompat$Impl20.setNavigationOnClickListener(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((setHasTransientState<T>) t, i);
                        break;
                    }
                case 3:
                    if (!setX((setHasTransientState<T>) t2, i)) {
                        break;
                    } else {
                        WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putLong(t, j, WindowInsetsCompat$Impl20.setNavigationOnClickListener(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((setHasTransientState<T>) t, i);
                        break;
                    }
                case 4:
                    if (!setX((setHasTransientState<T>) t2, i)) {
                        break;
                    } else {
                        WindowInsetsCompat$Impl20.setIconTintList(t, j, WindowInsetsCompat$Impl20.setOnLongClickListener(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((setHasTransientState<T>) t, i);
                        break;
                    }
                case 5:
                    if (!setX((setHasTransientState<T>) t2, i)) {
                        break;
                    } else {
                        WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putLong(t, j, WindowInsetsCompat$Impl20.setNavigationOnClickListener(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((setHasTransientState<T>) t, i);
                        break;
                    }
                case 6:
                    if (!setX((setHasTransientState<T>) t2, i)) {
                        break;
                    } else {
                        WindowInsetsCompat$Impl20.setIconTintList(t, j, WindowInsetsCompat$Impl20.setOnLongClickListener(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((setHasTransientState<T>) t, i);
                        break;
                    }
                case 7:
                    if (!setX((setHasTransientState<T>) t2, i)) {
                        break;
                    } else {
                        WindowInsetsCompat$Impl20.setY(t, j, WindowInsetsCompat$Impl20.setIconTintList(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((setHasTransientState<T>) t, i);
                        break;
                    }
                case 8:
                    if (!setX((setHasTransientState<T>) t2, i)) {
                        break;
                    } else {
                        WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putObject(t, j, WindowInsetsCompat$Impl20.setUnboundedRipple(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((setHasTransientState<T>) t, i);
                        break;
                    }
                case 9:
                    setX(t, t2, i);
                    break;
                case 10:
                    if (!setX((setHasTransientState<T>) t2, i)) {
                        break;
                    } else {
                        WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putObject(t, j, WindowInsetsCompat$Impl20.setUnboundedRipple(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((setHasTransientState<T>) t, i);
                        break;
                    }
                case 11:
                    if (!setX((setHasTransientState<T>) t2, i)) {
                        break;
                    } else {
                        WindowInsetsCompat$Impl20.setIconTintList(t, j, WindowInsetsCompat$Impl20.setOnLongClickListener(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((setHasTransientState<T>) t, i);
                        break;
                    }
                case 12:
                    if (!setX((setHasTransientState<T>) t2, i)) {
                        break;
                    } else {
                        WindowInsetsCompat$Impl20.setIconTintList(t, j, WindowInsetsCompat$Impl20.setOnLongClickListener(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((setHasTransientState<T>) t, i);
                        break;
                    }
                case 13:
                    if (!setX((setHasTransientState<T>) t2, i)) {
                        break;
                    } else {
                        WindowInsetsCompat$Impl20.setIconTintList(t, j, WindowInsetsCompat$Impl20.setOnLongClickListener(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((setHasTransientState<T>) t, i);
                        break;
                    }
                case 14:
                    if (!setX((setHasTransientState<T>) t2, i)) {
                        break;
                    } else {
                        WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putLong(t, j, WindowInsetsCompat$Impl20.setNavigationOnClickListener(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((setHasTransientState<T>) t, i);
                        break;
                    }
                case 15:
                    if (!setX((setHasTransientState<T>) t2, i)) {
                        break;
                    } else {
                        WindowInsetsCompat$Impl20.setIconTintList(t, j, WindowInsetsCompat$Impl20.setOnLongClickListener(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((setHasTransientState<T>) t, i);
                        break;
                    }
                case 16:
                    if (!setX((setHasTransientState<T>) t2, i)) {
                        break;
                    } else {
                        WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putLong(t, j, WindowInsetsCompat$Impl20.setNavigationOnClickListener(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((setHasTransientState<T>) t, i);
                        break;
                    }
                case 17:
                    setX(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case setExpandedTitleMargin.setY.setChipCornerRadius /* 36 */:
                case 37:
                case setExpandedTitleMargin.setY.setSupportCheckMarkTintList /* 38 */:
                case setExpandedTitleMargin.setY.setVelocityScale /* 39 */:
                case setExpandedTitleMargin.setY.setRightEdgeEffectColor /* 40 */:
                case setExpandedTitleMargin.setY.setHorizontalScrollbarTrackDrawable /* 41 */:
                case setExpandedTitleMargin.setY.setOnKeyListener /* 42 */:
                case setExpandedTitleMargin.setY.setForegroundTintList /* 43 */:
                case setExpandedTitleMargin.setY.setRecyclerListener /* 44 */:
                case setExpandedTitleMargin.setY.setPreferKeepClearRects /* 45 */:
                case setExpandedTitleMargin.setY.setInterpolator /* 46 */:
                case setExpandedTitleMargin.setY.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 /* 47 */:
                case setExpandedTitleMargin.setY.ParcelableSparseArray$1 /* 48 */:
                case setExpandedTitleMargin.setY.setAutoLinkMask /* 49 */:
                    this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0(t, t2, j);
                    break;
                case setExpandedTitleMargin.setY.setOrientation /* 50 */:
                    WindowInsetsCompat$Impl20.MenuHostHelper$$ExternalSyntheticLambda0(t, j, this.setIconSize.MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl20.setUnboundedRipple(t, j), WindowInsetsCompat$Impl20.setUnboundedRipple(t2, j)));
                    break;
                case 51:
                case setExpandedTitleMargin.setY.setSupportCompoundDrawablesTintList /* 52 */:
                case setExpandedTitleMargin.setY.setScrollingCacheEnabled /* 53 */:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!setX((setHasTransientState<T>) t2, i3, i)) {
                        break;
                    } else {
                        WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putObject(t, j, WindowInsetsCompat$Impl20.setUnboundedRipple(t2, j));
                        WindowInsetsCompat$Impl20.setIconTintList(t, this.MenuHostHelper$$ExternalSyntheticLambda0[i + 2] & 1048575, i3);
                        break;
                    }
                case 60:
                    setIconTintList(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!setX((setHasTransientState<T>) t2, i3, i)) {
                        break;
                    } else {
                        WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putObject(t, j, WindowInsetsCompat$Impl20.setUnboundedRipple(t2, j));
                        WindowInsetsCompat$Impl20.setIconTintList(t, this.MenuHostHelper$$ExternalSyntheticLambda0[i + 2] & 1048575, i3);
                        break;
                    }
                case 68:
                    setIconTintList(t, t2, i);
                    break;
            }
            i += 3;
        }
    }

    @Override // o.setValues
    public final int setY(T t) {
        Iterable<Map.Entry> entrySet;
        int i;
        int i2;
        int y;
        int y2;
        int centerIfNoTextEnabled;
        int centerIfNoTextEnabled2;
        int y3;
        int y4;
        int centerIfNoTextEnabled3;
        int centerIfNoTextEnabled4;
        int i3 = 267386880;
        int i4 = 1048575;
        if (this.setMaxEms) {
            Unsafe unsafe = setY;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (i5 >= iArr.length) {
                    LegacySavedStateHandleController$1<?, ?> legacySavedStateHandleController$1 = this.setAnimationFromJson;
                    return i6 + legacySavedStateHandleController$1.setIconTintList(legacySavedStateHandleController$1.MenuHostHelper$$ExternalSyntheticLambda1(t));
                }
                int i7 = iArr[i5 + 1];
                int i8 = (i7 & 267386880) >>> 20;
                int i9 = iArr[i5];
                long j = i7 & 1048575;
                int i10 = (i8 < setSelectionAfterHeaderView.DOUBLE_LIST_PACKED.setNavigationOnClickListener || i8 > setSelectionAfterHeaderView.SINT64_LIST_PACKED.setNavigationOnClickListener) ? 0 : this.MenuHostHelper$$ExternalSyntheticLambda0[i5 + 2] & 1048575;
                switch (i8) {
                    case 0:
                        if (setX((setHasTransientState<T>) t, i5)) {
                            y3 = setMenuPrepared.setY(i9);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 1:
                        if (setX((setHasTransientState<T>) t, i5)) {
                            y3 = setMenuPrepared.setLayoutAnimation(i9);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 2:
                        if (setX((setHasTransientState<T>) t, i5)) {
                            y3 = setMenuPrepared.setIconTintList(i9, WindowInsetsCompat$Impl20.setNavigationOnClickListener(t, j));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 3:
                        if (setX((setHasTransientState<T>) t, i5)) {
                            y3 = setMenuPrepared.setY(i9, WindowInsetsCompat$Impl20.setNavigationOnClickListener(t, j));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 4:
                        if (setX((setHasTransientState<T>) t, i5)) {
                            y3 = setMenuPrepared.setX(i9, WindowInsetsCompat$Impl20.setOnLongClickListener(t, j));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 5:
                        if (setX((setHasTransientState<T>) t, i5)) {
                            y3 = setMenuPrepared.setIconTintList(i9);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 6:
                        if (setX((setHasTransientState<T>) t, i5)) {
                            y3 = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(i9);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 7:
                        if (setX((setHasTransientState<T>) t, i5)) {
                            y3 = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda1(i9);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 8:
                        if (setX((setHasTransientState<T>) t, i5)) {
                            Object unboundedRipple = WindowInsetsCompat$Impl20.setUnboundedRipple(t, j);
                            if (unboundedRipple instanceof setSpeed) {
                                y3 = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(i9, (setSpeed) unboundedRipple);
                                break;
                            } else {
                                y3 = setMenuPrepared.setIconTintList(i9, (String) unboundedRipple);
                                break;
                            }
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 9:
                        if (setX((setHasTransientState<T>) t, i5)) {
                            y3 = setRotationX.setY(i9, WindowInsetsCompat$Impl20.setUnboundedRipple(t, j), MenuHostHelper$$ExternalSyntheticLambda0(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 10:
                        if (setX((setHasTransientState<T>) t, i5)) {
                            y3 = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(i9, (setSpeed) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 11:
                        if (setX((setHasTransientState<T>) t, i5)) {
                            y3 = setMenuPrepared.setY(i9, WindowInsetsCompat$Impl20.setOnLongClickListener(t, j));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 12:
                        if (setX((setHasTransientState<T>) t, i5)) {
                            y3 = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda1(i9, WindowInsetsCompat$Impl20.setOnLongClickListener(t, j));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 13:
                        if (setX((setHasTransientState<T>) t, i5)) {
                            y3 = setMenuPrepared.setTextAlignment(i9);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 14:
                        if (setX((setHasTransientState<T>) t, i5)) {
                            y3 = setMenuPrepared.setIconSize(i9);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 15:
                        if (setX((setHasTransientState<T>) t, i5)) {
                            y3 = setMenuPrepared.setIconTintList(i9, WindowInsetsCompat$Impl20.setOnLongClickListener(t, j));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 16:
                        if (setX((setHasTransientState<T>) t, i5)) {
                            y3 = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(i9, WindowInsetsCompat$Impl20.setNavigationOnClickListener(t, j));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 17:
                        if (setX((setHasTransientState<T>) t, i5)) {
                            y3 = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(i9, (setDrawingCacheQuality) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j), MenuHostHelper$$ExternalSyntheticLambda0(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 18:
                        y3 = setRotationX.setX(i9, (List) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j));
                        break;
                    case 19:
                        y3 = setRotationX.MenuHostHelper$$ExternalSyntheticLambda1(i9, (List) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j));
                        break;
                    case 20:
                        y3 = setRotationX.setUiOptions(i9, (List) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j));
                        break;
                    case 21:
                        y3 = setRotationX.setChipCornerRadius(i9, (List) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j));
                        break;
                    case 22:
                        y3 = setRotationX.setNavigationOnClickListener(i9, (List) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j));
                        break;
                    case 23:
                        y3 = setRotationX.setX(i9, (List) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j));
                        break;
                    case 24:
                        y3 = setRotationX.MenuHostHelper$$ExternalSyntheticLambda1(i9, (List) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j));
                        break;
                    case 25:
                        y3 = setRotationX.MenuHostHelper$$ExternalSyntheticLambda0(i9, (List) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j));
                        break;
                    case 26:
                        y3 = setRotationX.setUnboundedRipple(i9, (List) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j));
                        break;
                    case 27:
                        y3 = setRotationX.setY(i9, (List<?>) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j), MenuHostHelper$$ExternalSyntheticLambda0(i5));
                        break;
                    case 28:
                        y3 = setRotationX.setIconTintList(i9, (List) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j));
                        break;
                    case 29:
                        y3 = setRotationX.setIconSize(i9, (List) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j));
                        break;
                    case 30:
                        y3 = setRotationX.setY(i9, (List) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j));
                        break;
                    case 31:
                        y3 = setRotationX.MenuHostHelper$$ExternalSyntheticLambda1(i9, (List) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j));
                        break;
                    case 32:
                        y3 = setRotationX.setX(i9, (List) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j));
                        break;
                    case 33:
                        y3 = setRotationX.setLayoutAnimation(i9, (List) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j));
                        break;
                    case 34:
                        y3 = setRotationX.setOnLongClickListener(i9, (List) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j));
                        break;
                    case 35:
                        y4 = setRotationX.setY((List) unsafe.getObject(t, j));
                        if (y4 > 0) {
                            if (this.setZ) {
                                unsafe.putInt(t, i10, y4);
                            }
                            centerIfNoTextEnabled3 = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i9, 0));
                            centerIfNoTextEnabled4 = setMenuPrepared.setCenterIfNoTextEnabled(y4);
                            y3 = centerIfNoTextEnabled3 + centerIfNoTextEnabled4 + y4;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case setExpandedTitleMargin.setY.setChipCornerRadius /* 36 */:
                        y4 = setRotationX.MenuHostHelper$$ExternalSyntheticLambda1((List) unsafe.getObject(t, j));
                        if (y4 > 0) {
                            if (this.setZ) {
                                unsafe.putInt(t, i10, y4);
                            }
                            centerIfNoTextEnabled3 = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i9, 0));
                            centerIfNoTextEnabled4 = setMenuPrepared.setCenterIfNoTextEnabled(y4);
                            y3 = centerIfNoTextEnabled3 + centerIfNoTextEnabled4 + y4;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 37:
                        y4 = setRotationX.setLayoutAnimation((List) unsafe.getObject(t, j));
                        if (y4 > 0) {
                            if (this.setZ) {
                                unsafe.putInt(t, i10, y4);
                            }
                            centerIfNoTextEnabled3 = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i9, 0));
                            centerIfNoTextEnabled4 = setMenuPrepared.setCenterIfNoTextEnabled(y4);
                            y3 = centerIfNoTextEnabled3 + centerIfNoTextEnabled4 + y4;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case setExpandedTitleMargin.setY.setSupportCheckMarkTintList /* 38 */:
                        y4 = setRotationX.setUnboundedRipple((List) unsafe.getObject(t, j));
                        if (y4 > 0) {
                            if (this.setZ) {
                                unsafe.putInt(t, i10, y4);
                            }
                            centerIfNoTextEnabled3 = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i9, 0));
                            centerIfNoTextEnabled4 = setMenuPrepared.setCenterIfNoTextEnabled(y4);
                            y3 = centerIfNoTextEnabled3 + centerIfNoTextEnabled4 + y4;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case setExpandedTitleMargin.setY.setVelocityScale /* 39 */:
                        y4 = setRotationX.setX((List) unsafe.getObject(t, j));
                        if (y4 > 0) {
                            if (this.setZ) {
                                unsafe.putInt(t, i10, y4);
                            }
                            centerIfNoTextEnabled3 = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i9, 0));
                            centerIfNoTextEnabled4 = setMenuPrepared.setCenterIfNoTextEnabled(y4);
                            y3 = centerIfNoTextEnabled3 + centerIfNoTextEnabled4 + y4;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case setExpandedTitleMargin.setY.setRightEdgeEffectColor /* 40 */:
                        y4 = setRotationX.setY((List) unsafe.getObject(t, j));
                        if (y4 > 0) {
                            if (this.setZ) {
                                unsafe.putInt(t, i10, y4);
                            }
                            centerIfNoTextEnabled3 = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i9, 0));
                            centerIfNoTextEnabled4 = setMenuPrepared.setCenterIfNoTextEnabled(y4);
                            y3 = centerIfNoTextEnabled3 + centerIfNoTextEnabled4 + y4;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case setExpandedTitleMargin.setY.setHorizontalScrollbarTrackDrawable /* 41 */:
                        y4 = setRotationX.MenuHostHelper$$ExternalSyntheticLambda1((List) unsafe.getObject(t, j));
                        if (y4 > 0) {
                            if (this.setZ) {
                                unsafe.putInt(t, i10, y4);
                            }
                            centerIfNoTextEnabled3 = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i9, 0));
                            centerIfNoTextEnabled4 = setMenuPrepared.setCenterIfNoTextEnabled(y4);
                            y3 = centerIfNoTextEnabled3 + centerIfNoTextEnabled4 + y4;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case setExpandedTitleMargin.setY.setOnKeyListener /* 42 */:
                        y4 = ((List) unsafe.getObject(t, j)).size();
                        if (y4 > 0) {
                            if (this.setZ) {
                                unsafe.putInt(t, i10, y4);
                            }
                            centerIfNoTextEnabled3 = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i9, 0));
                            centerIfNoTextEnabled4 = setMenuPrepared.setCenterIfNoTextEnabled(y4);
                            y3 = centerIfNoTextEnabled3 + centerIfNoTextEnabled4 + y4;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case setExpandedTitleMargin.setY.setForegroundTintList /* 43 */:
                        y4 = setRotationX.setOnLongClickListener((List) unsafe.getObject(t, j));
                        if (y4 > 0) {
                            if (this.setZ) {
                                unsafe.putInt(t, i10, y4);
                            }
                            centerIfNoTextEnabled3 = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i9, 0));
                            centerIfNoTextEnabled4 = setMenuPrepared.setCenterIfNoTextEnabled(y4);
                            y3 = centerIfNoTextEnabled3 + centerIfNoTextEnabled4 + y4;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case setExpandedTitleMargin.setY.setRecyclerListener /* 44 */:
                        y4 = setRotationX.setIconTintList((List) unsafe.getObject(t, j));
                        if (y4 > 0) {
                            if (this.setZ) {
                                unsafe.putInt(t, i10, y4);
                            }
                            centerIfNoTextEnabled3 = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i9, 0));
                            centerIfNoTextEnabled4 = setMenuPrepared.setCenterIfNoTextEnabled(y4);
                            y3 = centerIfNoTextEnabled3 + centerIfNoTextEnabled4 + y4;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case setExpandedTitleMargin.setY.setPreferKeepClearRects /* 45 */:
                        y4 = setRotationX.MenuHostHelper$$ExternalSyntheticLambda1((List) unsafe.getObject(t, j));
                        if (y4 > 0) {
                            if (this.setZ) {
                                unsafe.putInt(t, i10, y4);
                            }
                            centerIfNoTextEnabled3 = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i9, 0));
                            centerIfNoTextEnabled4 = setMenuPrepared.setCenterIfNoTextEnabled(y4);
                            y3 = centerIfNoTextEnabled3 + centerIfNoTextEnabled4 + y4;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case setExpandedTitleMargin.setY.setInterpolator /* 46 */:
                        y4 = setRotationX.setY((List) unsafe.getObject(t, j));
                        if (y4 > 0) {
                            if (this.setZ) {
                                unsafe.putInt(t, i10, y4);
                            }
                            centerIfNoTextEnabled3 = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i9, 0));
                            centerIfNoTextEnabled4 = setMenuPrepared.setCenterIfNoTextEnabled(y4);
                            y3 = centerIfNoTextEnabled3 + centerIfNoTextEnabled4 + y4;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case setExpandedTitleMargin.setY.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 /* 47 */:
                        y4 = setRotationX.setNavigationOnClickListener((List) unsafe.getObject(t, j));
                        if (y4 > 0) {
                            if (this.setZ) {
                                unsafe.putInt(t, i10, y4);
                            }
                            centerIfNoTextEnabled3 = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i9, 0));
                            centerIfNoTextEnabled4 = setMenuPrepared.setCenterIfNoTextEnabled(y4);
                            y3 = centerIfNoTextEnabled3 + centerIfNoTextEnabled4 + y4;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case setExpandedTitleMargin.setY.ParcelableSparseArray$1 /* 48 */:
                        y4 = setRotationX.setUiOptions((List) unsafe.getObject(t, j));
                        if (y4 > 0) {
                            if (this.setZ) {
                                unsafe.putInt(t, i10, y4);
                            }
                            centerIfNoTextEnabled3 = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i9, 0));
                            centerIfNoTextEnabled4 = setMenuPrepared.setCenterIfNoTextEnabled(y4);
                            y3 = centerIfNoTextEnabled3 + centerIfNoTextEnabled4 + y4;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case setExpandedTitleMargin.setY.setAutoLinkMask /* 49 */:
                        y3 = setRotationX.MenuHostHelper$$ExternalSyntheticLambda0(i9, (List) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j), MenuHostHelper$$ExternalSyntheticLambda0(i5));
                        break;
                    case setExpandedTitleMargin.setY.setOrientation /* 50 */:
                        y3 = this.setIconSize.MenuHostHelper$$ExternalSyntheticLambda0(i9, WindowInsetsCompat$Impl20.setUnboundedRipple(t, j), this.ViewPager$SavedState$1[(i5 / 3) << 1]);
                        break;
                    case 51:
                        if (setX((setHasTransientState<T>) t, i9, i5)) {
                            y3 = setMenuPrepared.setY(i9);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case setExpandedTitleMargin.setY.setSupportCompoundDrawablesTintList /* 52 */:
                        if (setX((setHasTransientState<T>) t, i9, i5)) {
                            y3 = setMenuPrepared.setLayoutAnimation(i9);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case setExpandedTitleMargin.setY.setScrollingCacheEnabled /* 53 */:
                        if (setX((setHasTransientState<T>) t, i9, i5)) {
                            y3 = setMenuPrepared.setIconTintList(i9, ((Long) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j)).longValue());
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 54:
                        if (setX((setHasTransientState<T>) t, i9, i5)) {
                            y3 = setMenuPrepared.setY(i9, ((Long) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j)).longValue());
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 55:
                        if (setX((setHasTransientState<T>) t, i9, i5)) {
                            y3 = setMenuPrepared.setX(i9, ((Integer) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j)).intValue());
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 56:
                        if (setX((setHasTransientState<T>) t, i9, i5)) {
                            y3 = setMenuPrepared.setIconTintList(i9);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 57:
                        if (setX((setHasTransientState<T>) t, i9, i5)) {
                            y3 = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(i9);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 58:
                        if (setX((setHasTransientState<T>) t, i9, i5)) {
                            y3 = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda1(i9);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 59:
                        if (setX((setHasTransientState<T>) t, i9, i5)) {
                            Object unboundedRipple2 = WindowInsetsCompat$Impl20.setUnboundedRipple(t, j);
                            if (unboundedRipple2 instanceof setSpeed) {
                                y3 = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(i9, (setSpeed) unboundedRipple2);
                                break;
                            } else {
                                y3 = setMenuPrepared.setIconTintList(i9, (String) unboundedRipple2);
                                break;
                            }
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 60:
                        if (setX((setHasTransientState<T>) t, i9, i5)) {
                            y3 = setRotationX.setY(i9, WindowInsetsCompat$Impl20.setUnboundedRipple(t, j), MenuHostHelper$$ExternalSyntheticLambda0(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 61:
                        if (setX((setHasTransientState<T>) t, i9, i5)) {
                            y3 = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(i9, (setSpeed) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 62:
                        if (setX((setHasTransientState<T>) t, i9, i5)) {
                            y3 = setMenuPrepared.setY(i9, ((Integer) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j)).intValue());
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 63:
                        if (setX((setHasTransientState<T>) t, i9, i5)) {
                            y3 = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda1(i9, ((Integer) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j)).intValue());
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 64:
                        if (setX((setHasTransientState<T>) t, i9, i5)) {
                            y3 = setMenuPrepared.setTextAlignment(i9);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 65:
                        if (setX((setHasTransientState<T>) t, i9, i5)) {
                            y3 = setMenuPrepared.setIconSize(i9);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 66:
                        if (setX((setHasTransientState<T>) t, i9, i5)) {
                            y3 = setMenuPrepared.setIconTintList(i9, ((Integer) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j)).intValue());
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 67:
                        if (setX((setHasTransientState<T>) t, i9, i5)) {
                            y3 = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(i9, ((Long) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j)).longValue());
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    case 68:
                        if (setX((setHasTransientState<T>) t, i9, i5)) {
                            y3 = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(i9, (setDrawingCacheQuality) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j), MenuHostHelper$$ExternalSyntheticLambda0(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                        }
                    default:
                        i5 += 3;
                }
                i6 += y3;
                i5 += 3;
            }
        } else {
            Unsafe unsafe2 = setY;
            int i11 = -1;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (i12 >= iArr2.length) {
                    LegacySavedStateHandleController$1<?, ?> legacySavedStateHandleController$12 = this.setAnimationFromJson;
                    int iconTintList = i13 + legacySavedStateHandleController$12.setIconTintList(legacySavedStateHandleController$12.MenuHostHelper$$ExternalSyntheticLambda1(t));
                    if (this.setLayoutAnimation) {
                        RemoteConfigRegistrar<?> MenuHostHelper$$ExternalSyntheticLambda12 = this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1(t);
                        int i15 = 0;
                        for (int i16 = 0; i16 < MenuHostHelper$$ExternalSyntheticLambda12.setX.setIconTintList.size(); i16++) {
                            setPromptId<K, Object>.setY sety = MenuHostHelper$$ExternalSyntheticLambda12.setX.setIconTintList.get(i16);
                            i15 += RemoteConfigRegistrar.setY((RemoteConfigRegistrar.setY) sety.getKey(), sety.getValue());
                        }
                        setPromptId<?, Object> setpromptid = MenuHostHelper$$ExternalSyntheticLambda12.setX;
                        if (setpromptid.MenuHostHelper$$ExternalSyntheticLambda0.isEmpty()) {
                            entrySet = setPromptId.setX.setY();
                        } else {
                            entrySet = setpromptid.MenuHostHelper$$ExternalSyntheticLambda0.entrySet();
                        }
                        for (Map.Entry entry : entrySet) {
                            i15 += RemoteConfigRegistrar.setY((RemoteConfigRegistrar.setY) entry.getKey(), entry.getValue());
                        }
                        iconTintList += i15;
                    }
                    return iconTintList;
                }
                int i17 = iArr2[i12 + 1];
                int i18 = iArr2[i12];
                int i19 = (i17 & i3) >>> 20;
                if (i19 <= 17) {
                    i = iArr2[i12 + 2];
                    int i20 = i & i4;
                    if (i20 != i11) {
                        i14 = unsafe2.getInt(t, i20);
                        i11 = i20;
                    }
                    i2 = 1 << (i >>> 20);
                } else {
                    i = (!this.setZ || i19 < setSelectionAfterHeaderView.DOUBLE_LIST_PACKED.setNavigationOnClickListener || i19 > setSelectionAfterHeaderView.SINT64_LIST_PACKED.setNavigationOnClickListener) ? 0 : this.MenuHostHelper$$ExternalSyntheticLambda0[i12 + 2] & i4;
                    i2 = 0;
                }
                long j2 = i17 & i4;
                switch (i19) {
                    case 0:
                        if ((i14 & i2) != 0) {
                            y = setMenuPrepared.setY(i18);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 1:
                        if ((i14 & i2) != 0) {
                            y = setMenuPrepared.setLayoutAnimation(i18);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 2:
                        if ((i2 & i14) != 0) {
                            y = setMenuPrepared.setIconTintList(i18, unsafe2.getLong(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 3:
                        if ((i2 & i14) != 0) {
                            y = setMenuPrepared.setY(i18, unsafe2.getLong(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 4:
                        if ((i2 & i14) != 0) {
                            y = setMenuPrepared.setX(i18, unsafe2.getInt(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 5:
                        if ((i14 & i2) != 0) {
                            y = setMenuPrepared.setIconTintList(i18);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 6:
                        if ((i14 & i2) != 0) {
                            y = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(i18);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 7:
                        if ((i14 & i2) != 0) {
                            y = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda1(i18);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 8:
                        if ((i2 & i14) != 0) {
                            Object object = unsafe2.getObject(t, j2);
                            if (object instanceof setSpeed) {
                                y = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(i18, (setSpeed) object);
                                break;
                            } else {
                                y = setMenuPrepared.setIconTintList(i18, (String) object);
                                break;
                            }
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 9:
                        if ((i2 & i14) != 0) {
                            y = setRotationX.setY(i18, unsafe2.getObject(t, j2), MenuHostHelper$$ExternalSyntheticLambda0(i12));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 10:
                        if ((i2 & i14) != 0) {
                            y = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(i18, (setSpeed) unsafe2.getObject(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 11:
                        if ((i2 & i14) != 0) {
                            y = setMenuPrepared.setY(i18, unsafe2.getInt(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 12:
                        if ((i2 & i14) != 0) {
                            y = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda1(i18, unsafe2.getInt(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 13:
                        if ((i14 & i2) != 0) {
                            y = setMenuPrepared.setTextAlignment(i18);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 14:
                        if ((i14 & i2) != 0) {
                            y = setMenuPrepared.setIconSize(i18);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 15:
                        if ((i2 & i14) != 0) {
                            y = setMenuPrepared.setIconTintList(i18, unsafe2.getInt(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 16:
                        if ((i2 & i14) != 0) {
                            y = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(i18, unsafe2.getLong(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 17:
                        if ((i2 & i14) != 0) {
                            y = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(i18, (setDrawingCacheQuality) unsafe2.getObject(t, j2), MenuHostHelper$$ExternalSyntheticLambda0(i12));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 18:
                        y = setRotationX.setX(i18, (List) unsafe2.getObject(t, j2));
                        break;
                    case 19:
                        y = setRotationX.MenuHostHelper$$ExternalSyntheticLambda1(i18, (List) unsafe2.getObject(t, j2));
                        break;
                    case 20:
                        y = setRotationX.setUiOptions(i18, (List) unsafe2.getObject(t, j2));
                        break;
                    case 21:
                        y = setRotationX.setChipCornerRadius(i18, (List) unsafe2.getObject(t, j2));
                        break;
                    case 22:
                        y = setRotationX.setNavigationOnClickListener(i18, (List) unsafe2.getObject(t, j2));
                        break;
                    case 23:
                        y = setRotationX.setX(i18, (List) unsafe2.getObject(t, j2));
                        break;
                    case 24:
                        y = setRotationX.MenuHostHelper$$ExternalSyntheticLambda1(i18, (List) unsafe2.getObject(t, j2));
                        break;
                    case 25:
                        y = setRotationX.MenuHostHelper$$ExternalSyntheticLambda0(i18, (List) unsafe2.getObject(t, j2));
                        break;
                    case 26:
                        y = setRotationX.setUnboundedRipple(i18, (List) unsafe2.getObject(t, j2));
                        break;
                    case 27:
                        y = setRotationX.setY(i18, (List<?>) unsafe2.getObject(t, j2), MenuHostHelper$$ExternalSyntheticLambda0(i12));
                        break;
                    case 28:
                        y = setRotationX.setIconTintList(i18, (List) unsafe2.getObject(t, j2));
                        break;
                    case 29:
                        y = setRotationX.setIconSize(i18, (List) unsafe2.getObject(t, j2));
                        break;
                    case 30:
                        y = setRotationX.setY(i18, (List) unsafe2.getObject(t, j2));
                        break;
                    case 31:
                        y = setRotationX.MenuHostHelper$$ExternalSyntheticLambda1(i18, (List) unsafe2.getObject(t, j2));
                        break;
                    case 32:
                        y = setRotationX.setX(i18, (List) unsafe2.getObject(t, j2));
                        break;
                    case 33:
                        y = setRotationX.setLayoutAnimation(i18, (List) unsafe2.getObject(t, j2));
                        break;
                    case 34:
                        y = setRotationX.setOnLongClickListener(i18, (List) unsafe2.getObject(t, j2));
                        break;
                    case 35:
                        y2 = setRotationX.setY((List) unsafe2.getObject(t, j2));
                        if (y2 > 0) {
                            if (this.setZ) {
                                unsafe2.putInt(t, i, y2);
                            }
                            centerIfNoTextEnabled = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i18, 0));
                            centerIfNoTextEnabled2 = setMenuPrepared.setCenterIfNoTextEnabled(y2);
                            y = y2 + centerIfNoTextEnabled + centerIfNoTextEnabled2;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setChipCornerRadius /* 36 */:
                        y2 = setRotationX.MenuHostHelper$$ExternalSyntheticLambda1((List) unsafe2.getObject(t, j2));
                        if (y2 > 0) {
                            if (this.setZ) {
                                unsafe2.putInt(t, i, y2);
                            }
                            centerIfNoTextEnabled = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i18, 0));
                            centerIfNoTextEnabled2 = setMenuPrepared.setCenterIfNoTextEnabled(y2);
                            y = y2 + centerIfNoTextEnabled + centerIfNoTextEnabled2;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 37:
                        y2 = setRotationX.setLayoutAnimation((List) unsafe2.getObject(t, j2));
                        if (y2 > 0) {
                            if (this.setZ) {
                                unsafe2.putInt(t, i, y2);
                            }
                            centerIfNoTextEnabled = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i18, 0));
                            centerIfNoTextEnabled2 = setMenuPrepared.setCenterIfNoTextEnabled(y2);
                            y = y2 + centerIfNoTextEnabled + centerIfNoTextEnabled2;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setSupportCheckMarkTintList /* 38 */:
                        y2 = setRotationX.setUnboundedRipple((List) unsafe2.getObject(t, j2));
                        if (y2 > 0) {
                            if (this.setZ) {
                                unsafe2.putInt(t, i, y2);
                            }
                            centerIfNoTextEnabled = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i18, 0));
                            centerIfNoTextEnabled2 = setMenuPrepared.setCenterIfNoTextEnabled(y2);
                            y = y2 + centerIfNoTextEnabled + centerIfNoTextEnabled2;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setVelocityScale /* 39 */:
                        y2 = setRotationX.setX((List) unsafe2.getObject(t, j2));
                        if (y2 > 0) {
                            if (this.setZ) {
                                unsafe2.putInt(t, i, y2);
                            }
                            centerIfNoTextEnabled = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i18, 0));
                            centerIfNoTextEnabled2 = setMenuPrepared.setCenterIfNoTextEnabled(y2);
                            y = y2 + centerIfNoTextEnabled + centerIfNoTextEnabled2;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setRightEdgeEffectColor /* 40 */:
                        y2 = setRotationX.setY((List) unsafe2.getObject(t, j2));
                        if (y2 > 0) {
                            if (this.setZ) {
                                unsafe2.putInt(t, i, y2);
                            }
                            centerIfNoTextEnabled = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i18, 0));
                            centerIfNoTextEnabled2 = setMenuPrepared.setCenterIfNoTextEnabled(y2);
                            y = y2 + centerIfNoTextEnabled + centerIfNoTextEnabled2;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setHorizontalScrollbarTrackDrawable /* 41 */:
                        y2 = setRotationX.MenuHostHelper$$ExternalSyntheticLambda1((List) unsafe2.getObject(t, j2));
                        if (y2 > 0) {
                            if (this.setZ) {
                                unsafe2.putInt(t, i, y2);
                            }
                            centerIfNoTextEnabled = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i18, 0));
                            centerIfNoTextEnabled2 = setMenuPrepared.setCenterIfNoTextEnabled(y2);
                            y = y2 + centerIfNoTextEnabled + centerIfNoTextEnabled2;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setOnKeyListener /* 42 */:
                        y2 = ((List) unsafe2.getObject(t, j2)).size();
                        if (y2 > 0) {
                            if (this.setZ) {
                                unsafe2.putInt(t, i, y2);
                            }
                            centerIfNoTextEnabled = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i18, 0));
                            centerIfNoTextEnabled2 = setMenuPrepared.setCenterIfNoTextEnabled(y2);
                            y = y2 + centerIfNoTextEnabled + centerIfNoTextEnabled2;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setForegroundTintList /* 43 */:
                        y2 = setRotationX.setOnLongClickListener((List) unsafe2.getObject(t, j2));
                        if (y2 > 0) {
                            if (this.setZ) {
                                unsafe2.putInt(t, i, y2);
                            }
                            centerIfNoTextEnabled = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i18, 0));
                            centerIfNoTextEnabled2 = setMenuPrepared.setCenterIfNoTextEnabled(y2);
                            y = y2 + centerIfNoTextEnabled + centerIfNoTextEnabled2;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setRecyclerListener /* 44 */:
                        y2 = setRotationX.setIconTintList((List) unsafe2.getObject(t, j2));
                        if (y2 > 0) {
                            if (this.setZ) {
                                unsafe2.putInt(t, i, y2);
                            }
                            centerIfNoTextEnabled = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i18, 0));
                            centerIfNoTextEnabled2 = setMenuPrepared.setCenterIfNoTextEnabled(y2);
                            y = y2 + centerIfNoTextEnabled + centerIfNoTextEnabled2;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setPreferKeepClearRects /* 45 */:
                        y2 = setRotationX.MenuHostHelper$$ExternalSyntheticLambda1((List) unsafe2.getObject(t, j2));
                        if (y2 > 0) {
                            if (this.setZ) {
                                unsafe2.putInt(t, i, y2);
                            }
                            centerIfNoTextEnabled = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i18, 0));
                            centerIfNoTextEnabled2 = setMenuPrepared.setCenterIfNoTextEnabled(y2);
                            y = y2 + centerIfNoTextEnabled + centerIfNoTextEnabled2;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setInterpolator /* 46 */:
                        y2 = setRotationX.setY((List) unsafe2.getObject(t, j2));
                        if (y2 > 0) {
                            if (this.setZ) {
                                unsafe2.putInt(t, i, y2);
                            }
                            centerIfNoTextEnabled = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i18, 0));
                            centerIfNoTextEnabled2 = setMenuPrepared.setCenterIfNoTextEnabled(y2);
                            y = y2 + centerIfNoTextEnabled + centerIfNoTextEnabled2;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 /* 47 */:
                        y2 = setRotationX.setNavigationOnClickListener((List) unsafe2.getObject(t, j2));
                        if (y2 > 0) {
                            if (this.setZ) {
                                unsafe2.putInt(t, i, y2);
                            }
                            centerIfNoTextEnabled = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i18, 0));
                            centerIfNoTextEnabled2 = setMenuPrepared.setCenterIfNoTextEnabled(y2);
                            y = y2 + centerIfNoTextEnabled + centerIfNoTextEnabled2;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.ParcelableSparseArray$1 /* 48 */:
                        y2 = setRotationX.setUiOptions((List) unsafe2.getObject(t, j2));
                        if (y2 > 0) {
                            if (this.setZ) {
                                unsafe2.putInt(t, i, y2);
                            }
                            centerIfNoTextEnabled = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i18, 0));
                            centerIfNoTextEnabled2 = setMenuPrepared.setCenterIfNoTextEnabled(y2);
                            y = y2 + centerIfNoTextEnabled + centerIfNoTextEnabled2;
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setAutoLinkMask /* 49 */:
                        y = setRotationX.MenuHostHelper$$ExternalSyntheticLambda0(i18, (List) unsafe2.getObject(t, j2), MenuHostHelper$$ExternalSyntheticLambda0(i12));
                        break;
                    case setExpandedTitleMargin.setY.setOrientation /* 50 */:
                        y = this.setIconSize.MenuHostHelper$$ExternalSyntheticLambda0(i18, unsafe2.getObject(t, j2), this.ViewPager$SavedState$1[(i12 / 3) << 1]);
                        break;
                    case 51:
                        if (setX((setHasTransientState<T>) t, i18, i12)) {
                            y = setMenuPrepared.setY(i18);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setSupportCompoundDrawablesTintList /* 52 */:
                        if (setX((setHasTransientState<T>) t, i18, i12)) {
                            y = setMenuPrepared.setLayoutAnimation(i18);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setScrollingCacheEnabled /* 53 */:
                        if (setX((setHasTransientState<T>) t, i18, i12)) {
                            y = setMenuPrepared.setIconTintList(i18, ((Long) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j2)).longValue());
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 54:
                        if (setX((setHasTransientState<T>) t, i18, i12)) {
                            y = setMenuPrepared.setY(i18, ((Long) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j2)).longValue());
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 55:
                        if (setX((setHasTransientState<T>) t, i18, i12)) {
                            y = setMenuPrepared.setX(i18, ((Integer) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j2)).intValue());
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 56:
                        if (setX((setHasTransientState<T>) t, i18, i12)) {
                            y = setMenuPrepared.setIconTintList(i18);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 57:
                        if (setX((setHasTransientState<T>) t, i18, i12)) {
                            y = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(i18);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 58:
                        if (setX((setHasTransientState<T>) t, i18, i12)) {
                            y = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda1(i18);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 59:
                        if (setX((setHasTransientState<T>) t, i18, i12)) {
                            Object object2 = unsafe2.getObject(t, j2);
                            if (object2 instanceof setSpeed) {
                                y = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(i18, (setSpeed) object2);
                                break;
                            } else {
                                y = setMenuPrepared.setIconTintList(i18, (String) object2);
                                break;
                            }
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 60:
                        if (setX((setHasTransientState<T>) t, i18, i12)) {
                            y = setRotationX.setY(i18, unsafe2.getObject(t, j2), MenuHostHelper$$ExternalSyntheticLambda0(i12));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 61:
                        if (setX((setHasTransientState<T>) t, i18, i12)) {
                            y = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(i18, (setSpeed) unsafe2.getObject(t, j2));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 62:
                        if (setX((setHasTransientState<T>) t, i18, i12)) {
                            y = setMenuPrepared.setY(i18, ((Integer) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j2)).intValue());
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 63:
                        if (setX((setHasTransientState<T>) t, i18, i12)) {
                            y = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda1(i18, ((Integer) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j2)).intValue());
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 64:
                        if (setX((setHasTransientState<T>) t, i18, i12)) {
                            y = setMenuPrepared.setTextAlignment(i18);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 65:
                        if (setX((setHasTransientState<T>) t, i18, i12)) {
                            y = setMenuPrepared.setIconSize(i18);
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 66:
                        if (setX((setHasTransientState<T>) t, i18, i12)) {
                            y = setMenuPrepared.setIconTintList(i18, ((Integer) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j2)).intValue());
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 67:
                        if (setX((setHasTransientState<T>) t, i18, i12)) {
                            y = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(i18, ((Long) WindowInsetsCompat$Impl20.setUnboundedRipple(t, j2)).longValue());
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    case 68:
                        if (setX((setHasTransientState<T>) t, i18, i12)) {
                            y = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(i18, (setDrawingCacheQuality) unsafe2.getObject(t, j2), MenuHostHelper$$ExternalSyntheticLambda0(i12));
                            break;
                        } else {
                            continue;
                            i12 += 3;
                            i3 = 267386880;
                            i4 = 1048575;
                        }
                    default:
                        i12 += 3;
                        i3 = 267386880;
                        i4 = 1048575;
                }
                i13 += y;
                i12 += 3;
                i3 = 267386880;
                i4 = 1048575;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0b5d  */
    @Override // o.setValues
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setY(T r13, o.WindowInsetsCompat$Impl29 r14) {
        /*
            Method dump skipped, instructions count: 3228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setHasTransientState.setY(java.lang.Object, o.WindowInsetsCompat$Impl29):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x050a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void MenuHostHelper$$ExternalSyntheticLambda0(T r19, o.WindowInsetsCompat$Impl29 r20) {
        /*
            Method dump skipped, instructions count: 1464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setHasTransientState.MenuHostHelper$$ExternalSyntheticLambda0(java.lang.Object, o.WindowInsetsCompat$Impl29):void");
    }

    private <K, V> void setIconTintList(WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29, int i, Object obj, int i2) {
        if (obj != null) {
            windowInsetsCompat$Impl29.setY(i, this.setIconSize.setY(this.ViewPager$SavedState$1[(i2 / 3) << 1]), this.setIconSize.MenuHostHelper$$ExternalSyntheticLambda0(obj));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x068f A[Catch: all -> 0x06b1, TRY_ENTER, TryCatch #2 {all -> 0x06b1, blocks: (B:3:0x000e, B:5:0x0018, B:7:0x001c, B:9:0x0025, B:25:0x0059, B:31:0x006a, B:32:0x006e, B:34:0x007f, B:35:0x0083, B:28:0x005f, B:45:0x00a1, B:169:0x066c, B:168:0x0668, B:52:0x00b9, B:181:0x068f, B:182:0x0694, B:53:0x00d1, B:54:0x00eb, B:55:0x0105, B:56:0x011f, B:57:0x0139, B:59:0x014b, B:62:0x0152, B:63:0x0158, B:64:0x016e, B:65:0x0188, B:66:0x019e, B:68:0x01a4, B:70:0x01ca, B:69:0x01ba, B:71:0x01d7, B:72:0x01e7, B:73:0x0201, B:74:0x021b, B:75:0x0235, B:76:0x024f, B:77:0x0269, B:78:0x0283, B:79:0x029d, B:80:0x02b7, B:82:0x02cb, B:86:0x02ec, B:83:0x02d5, B:85:0x02dd, B:87:0x02fd, B:88:0x030f, B:89:0x031c, B:90:0x0329, B:91:0x0336, B:92:0x0343, B:96:0x035c, B:100:0x036b, B:101:0x0378, B:102:0x0385, B:103:0x0392, B:104:0x039e, B:105:0x03aa, B:106:0x03b6, B:107:0x03c2, B:108:0x03ce, B:109:0x03da, B:110:0x03e6, B:111:0x03f2, B:112:0x03fe, B:115:0x040f, B:116:0x042c, B:117:0x0438, B:119:0x0447, B:121:0x0455, B:123:0x045e, B:128:0x046b, B:129:0x0478, B:130:0x0485, B:131:0x0493, B:132:0x04a1, B:133:0x04af, B:134:0x04bd, B:135:0x04cb, B:136:0x04d9, B:137:0x04e7, B:138:0x04f5, B:140:0x04fc, B:141:0x0514, B:142:0x0527, B:143:0x0537, B:144:0x0547, B:145:0x0557, B:146:0x0567, B:148:0x057a, B:151:0x0581, B:152:0x0587, B:153:0x0592, B:154:0x05a2, B:155:0x05b2, B:157:0x05b9, B:158:0x05d1, B:159:0x05e4, B:160:0x05ed, B:161:0x05fd, B:162:0x060d, B:163:0x061d, B:164:0x062c, B:165:0x063b, B:166:0x064a, B:167:0x0659), top: B:204:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x069a A[SYNTHETIC] */
    @Override // o.setValues
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(T r19, o.setTranslateX r20, o.setStateDescription r21) {
        /*
            Method dump skipped, instructions count: 1880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setHasTransientState.MenuHostHelper$$ExternalSyntheticLambda1(java.lang.Object, o.setTranslateX, o.setStateDescription):void");
    }

    private setValues MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        int i2 = (i / 3) << 1;
        setValues setvalues = (setValues) this.ViewPager$SavedState$1[i2];
        if (setvalues != null) {
            return setvalues;
        }
        setValues<T> MenuHostHelper$$ExternalSyntheticLambda0 = writeReplace.setY().MenuHostHelper$$ExternalSyntheticLambda0((Class) this.ViewPager$SavedState$1[i2 + 1]);
        this.ViewPager$SavedState$1[i2] = MenuHostHelper$$ExternalSyntheticLambda0;
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.setValues
    public final void setX(T t) {
        int i;
        int i2 = this.setIconTintList;
        while (true) {
            i = this.setTextScaleX;
            if (i2 >= i) {
                break;
            }
            long j = this.MenuHostHelper$$ExternalSyntheticLambda0[this.setUnboundedRipple[i2] + 1] & 1048575;
            Object unboundedRipple = WindowInsetsCompat$Impl20.setUnboundedRipple(t, j);
            if (unboundedRipple != null) {
                WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putObject(t, j, this.setIconSize.MenuHostHelper$$ExternalSyntheticLambda1(unboundedRipple));
            }
            i2++;
        }
        int length = this.setUnboundedRipple.length;
        while (i < length) {
            this.setUiOptions.setIconTintList(t, this.setUnboundedRipple[i]);
            i++;
        }
        this.setAnimationFromJson.MenuHostHelper$$ExternalSyntheticLambda0(t);
        if (this.setLayoutAnimation) {
            this.setOnLongClickListener.setY(t);
        }
    }

    private final <K, V, UT, UB> UB setY(int i, int i2, Map<K, V> map, setViewCacheExtension.setY sety, UB ub, LegacySavedStateHandleController$1<UT, UB> legacySavedStateHandleController$1) {
        setRightStripDrawable.setY<?, ?> y = this.setIconSize.setY(this.ViewPager$SavedState$1[(i / 3) << 1]);
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Integer num = (Integer) next.getValue();
            if (!sety.setX()) {
                if (ub == null) {
                    ub = legacySavedStateHandleController$1.setIconTintList();
                }
                setSpeed.setLayoutAnimation MenuHostHelper$$ExternalSyntheticLambda0 = setSpeed.MenuHostHelper$$ExternalSyntheticLambda0(RemoteConfigRegistrar.setY(y.setIconTintList, 1, next.getKey()) + RemoteConfigRegistrar.setY(y.setX, 2, next.getValue()));
                setMenuPrepared setmenuprepared = MenuHostHelper$$ExternalSyntheticLambda0.setX;
                try {
                    K key = next.getKey();
                    V value = next.getValue();
                    RemoteConfigRegistrar.setIconTintList(setmenuprepared, y.setIconTintList, 1, key);
                    RemoteConfigRegistrar.setIconTintList(setmenuprepared, y.setX, 2, value);
                    if (MenuHostHelper$$ExternalSyntheticLambda0.setX.setUiOptions() == 0) {
                        legacySavedStateHandleController$1.MenuHostHelper$$ExternalSyntheticLambda1(ub, i2, new setSpeed.setUiOptions(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0));
                        it.remove();
                    } else {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [o.setValues] */
    /* JADX WARN: Type inference failed for: r4v5, types: [o.setValues] */
    /* JADX WARN: Type inference failed for: r4v6, types: [o.setValues] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17, types: [o.setValues] */
    /* JADX WARN: Type inference failed for: r6v23 */
    @Override // o.setValues
    public final boolean setIconTintList(T t) {
        int i;
        boolean z;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            if (i3 >= this.setIconTintList) {
                return !this.setLayoutAnimation || this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1(t).MenuHostHelper$$ExternalSyntheticLambda1();
            }
            int i5 = this.setUnboundedRipple[i3];
            int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            int i6 = iArr[i5];
            int i7 = iArr[i5 + 1];
            if (this.setMaxEms) {
                i = 0;
            } else {
                int i8 = iArr[i5 + 2];
                int i9 = i8 & 1048575;
                i = 1 << (i8 >>> 20);
                if (i9 != i2) {
                    i4 = setY.getInt(t, i9);
                    i2 = i9;
                }
            }
            if ((268435456 & i7) != 0) {
                if (this.setMaxEms) {
                    z = setX((setHasTransientState<T>) t, i5);
                } else {
                    z = (i4 & i) != 0;
                }
                if (!z) {
                    return false;
                }
            }
            int i10 = (267386880 & i7) >>> 20;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        if (setX((setHasTransientState<T>) t, i6, i5) && !MenuHostHelper$$ExternalSyntheticLambda0(i5).setIconTintList(WindowInsetsCompat$Impl20.setUnboundedRipple(t, i7 & 1048575))) {
                            return false;
                        }
                    } else if (i10 != 49) {
                        if (i10 == 50) {
                            Map<?, ?> MenuHostHelper$$ExternalSyntheticLambda0 = this.setIconSize.MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl20.setUnboundedRipple(t, i7 & 1048575));
                            if (!MenuHostHelper$$ExternalSyntheticLambda0.isEmpty()) {
                                if (this.setIconSize.setY(this.ViewPager$SavedState$1[(i5 / 3) << 1]).setX.setZ == setCloseIconVisible.setIconTintList.MESSAGE) {
                                    Iterator<?> it = MenuHostHelper$$ExternalSyntheticLambda0.values().iterator();
                                    setValues<T> setvalues = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (setvalues == null) {
                                            setvalues = writeReplace.setY().MenuHostHelper$$ExternalSyntheticLambda0(next.getClass());
                                        }
                                        boolean iconTintList = setvalues.setIconTintList(next);
                                        setvalues = setvalues;
                                        if (!iconTintList) {
                                            z2 = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z2) {
                                return false;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                List list = (List) WindowInsetsCompat$Impl20.setUnboundedRipple(t, i7 & 1048575);
                if (!list.isEmpty()) {
                    ?? MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0(i5);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= list.size()) {
                            break;
                        } else if (!MenuHostHelper$$ExternalSyntheticLambda02.setIconTintList(list.get(i11))) {
                            z2 = false;
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                if (!z2) {
                    return false;
                }
            } else {
                if (this.setMaxEms) {
                    z2 = setX((setHasTransientState<T>) t, i5);
                } else if ((i & i4) == 0) {
                    z2 = false;
                }
                if (z2 && !MenuHostHelper$$ExternalSyntheticLambda0(i5).setIconTintList(WindowInsetsCompat$Impl20.setUnboundedRipple(t, i7 & 1048575))) {
                    return false;
                }
            }
            i3++;
        }
    }

    private static void MenuHostHelper$$ExternalSyntheticLambda0(int i, Object obj, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29) {
        if (obj instanceof String) {
            windowInsetsCompat$Impl29.setIconTintList(i, (String) obj);
        } else {
            windowInsetsCompat$Impl29.setX(i, (setSpeed) obj);
        }
    }

    private void setX(Object obj, int i, setTranslateX settranslatex) {
        if (!((536870912 & i) != 0)) {
            if (this.setNavigationOnClickListener) {
                WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putObject(obj, i & 1048575, settranslatex.setMaxEms());
                return;
            } else {
                WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putObject(obj, i & 1048575, settranslatex.setY());
                return;
            }
        }
        WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putObject(obj, i & 1048575, settranslatex.setAnimationFromJson());
    }

    private int setX(int i) {
        return this.MenuHostHelper$$ExternalSyntheticLambda0[i];
    }

    private static <T> float setX(T t, long j) {
        return WindowInsetsCompat$Impl20.setUiOptions(t, j);
    }

    private static <T> int setIconTintList(T t, long j) {
        return WindowInsetsCompat$Impl20.setOnLongClickListener(t, j);
    }

    private boolean setX(T t, int i) {
        boolean equals;
        if (this.setMaxEms) {
            int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0[i + 1];
            long j = i2 & 1048575;
            switch ((i2 & 267386880) >>> 20) {
                case 0:
                    return WindowInsetsCompat$Impl20.setLayoutAnimation(t, j) != 0.0d;
                case 1:
                    return WindowInsetsCompat$Impl20.setUiOptions(t, j) != 0.0f;
                case 2:
                    return WindowInsetsCompat$Impl20.setNavigationOnClickListener(t, j) != 0;
                case 3:
                    return WindowInsetsCompat$Impl20.setNavigationOnClickListener(t, j) != 0;
                case 4:
                    return WindowInsetsCompat$Impl20.setOnLongClickListener(t, j) != 0;
                case 5:
                    return WindowInsetsCompat$Impl20.setNavigationOnClickListener(t, j) != 0;
                case 6:
                    return WindowInsetsCompat$Impl20.setOnLongClickListener(t, j) != 0;
                case 7:
                    return WindowInsetsCompat$Impl20.setIconTintList(t, j);
                case 8:
                    Object unboundedRipple = WindowInsetsCompat$Impl20.setUnboundedRipple(t, j);
                    if (unboundedRipple instanceof String) {
                        equals = ((String) unboundedRipple).isEmpty();
                        break;
                    } else if (unboundedRipple instanceof setSpeed) {
                        equals = setSpeed.setIconTintList.equals(unboundedRipple);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    return WindowInsetsCompat$Impl20.setUnboundedRipple(t, j) != null;
                case 10:
                    equals = setSpeed.setIconTintList.equals(WindowInsetsCompat$Impl20.setUnboundedRipple(t, j));
                    break;
                case 11:
                    return WindowInsetsCompat$Impl20.setOnLongClickListener(t, j) != 0;
                case 12:
                    return WindowInsetsCompat$Impl20.setOnLongClickListener(t, j) != 0;
                case 13:
                    return WindowInsetsCompat$Impl20.setOnLongClickListener(t, j) != 0;
                case 14:
                    return WindowInsetsCompat$Impl20.setNavigationOnClickListener(t, j) != 0;
                case 15:
                    return WindowInsetsCompat$Impl20.setOnLongClickListener(t, j) != 0;
                case 16:
                    return WindowInsetsCompat$Impl20.setNavigationOnClickListener(t, j) != 0;
                case 17:
                    return WindowInsetsCompat$Impl20.setUnboundedRipple(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
            return !equals;
        }
        int i3 = this.MenuHostHelper$$ExternalSyntheticLambda0[i + 2];
        return (WindowInsetsCompat$Impl20.setOnLongClickListener(t, (long) (i3 & 1048575)) & (1 << (i3 >>> 20))) != 0;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(T t, int i) {
        if (this.setMaxEms) {
            return;
        }
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0[i + 2];
        long j = 1048575 & i2;
        WindowInsetsCompat$Impl20.setIconTintList(t, j, (1 << (i2 >>> 20)) | WindowInsetsCompat$Impl20.setOnLongClickListener(t, j));
    }

    private final <UT, UB> UB setIconTintList(Object obj, int i, UB ub, LegacySavedStateHandleController$1<UT, UB> legacySavedStateHandleController$1) {
        setViewCacheExtension.setY sety;
        int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int i2 = iArr[i];
        Object unboundedRipple = WindowInsetsCompat$Impl20.setUnboundedRipple(obj, iArr[i + 1] & 1048575);
        return (unboundedRipple == null || (sety = (setViewCacheExtension.setY) this.ViewPager$SavedState$1[((i / 3) << 1) + 1]) == null) ? ub : (UB) setY(i, i2, this.setIconSize.setX(unboundedRipple), sety, ub, legacySavedStateHandleController$1);
    }

    private boolean setX(T t, int i, int i2) {
        return WindowInsetsCompat$Impl20.setOnLongClickListener(t, (long) (this.MenuHostHelper$$ExternalSyntheticLambda0[i2 + 2] & 1048575)) == i;
    }

    private void setX(T t, T t2, int i) {
        Object MenuHostHelper$$ExternalSyntheticLambda0;
        long j = this.MenuHostHelper$$ExternalSyntheticLambda0[i + 1] & 1048575;
        if (setX((setHasTransientState<T>) t2, i)) {
            Object unboundedRipple = WindowInsetsCompat$Impl20.setUnboundedRipple(t, j);
            Object unboundedRipple2 = WindowInsetsCompat$Impl20.setUnboundedRipple(t2, j);
            if (unboundedRipple != null && unboundedRipple2 != null) {
                MenuHostHelper$$ExternalSyntheticLambda0 = ((setDrawingCacheQuality) unboundedRipple).setTextScaleX().setY((setDrawingCacheQuality) unboundedRipple2).MenuHostHelper$$ExternalSyntheticLambda0();
                WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putObject(t, j, MenuHostHelper$$ExternalSyntheticLambda0);
                MenuHostHelper$$ExternalSyntheticLambda1((setHasTransientState<T>) t, i);
            } else if (unboundedRipple2 != null) {
                WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putObject(t, j, unboundedRipple2);
                MenuHostHelper$$ExternalSyntheticLambda1((setHasTransientState<T>) t, i);
            }
        }
    }

    private void setIconTintList(T t, T t2, int i) {
        Object MenuHostHelper$$ExternalSyntheticLambda0;
        int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int i2 = iArr[i + 1];
        int i3 = iArr[i];
        long j = i2 & 1048575;
        if (setX((setHasTransientState<T>) t2, i3, i)) {
            Object unboundedRipple = WindowInsetsCompat$Impl20.setUnboundedRipple(t, j);
            Object unboundedRipple2 = WindowInsetsCompat$Impl20.setUnboundedRipple(t2, j);
            if (unboundedRipple != null && unboundedRipple2 != null) {
                MenuHostHelper$$ExternalSyntheticLambda0 = ((setDrawingCacheQuality) unboundedRipple).setTextScaleX().setY((setDrawingCacheQuality) unboundedRipple2).MenuHostHelper$$ExternalSyntheticLambda0();
                WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putObject(t, j, MenuHostHelper$$ExternalSyntheticLambda0);
                WindowInsetsCompat$Impl20.setIconTintList(t, this.MenuHostHelper$$ExternalSyntheticLambda0[i + 2] & 1048575, i3);
            } else if (unboundedRipple2 != null) {
                WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putObject(t, j, unboundedRipple2);
                WindowInsetsCompat$Impl20.setIconTintList(t, this.MenuHostHelper$$ExternalSyntheticLambda0[i + 2] & 1048575, i3);
            }
        }
    }
}