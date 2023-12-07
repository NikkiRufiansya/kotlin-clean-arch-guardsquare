package o;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.setExpandedTitleMargin;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class iH<T> implements iY<T> {
    private static final int[] MenuHostHelper$$ExternalSyntheticLambda0 = new int[0];
    private static final Unsafe setX = ji.setY();
    private final int[] MenuHostHelper$$ExternalSyntheticLambda1;
    private final int ViewPager$SavedState$1;
    private final Object[] setCenterIfNoTextEnabled;
    private final int setChipCornerRadius;
    private final iN setIconSize;
    private final iJ setIconTintList;
    private final boolean setLayoutAnimation;
    private final boolean setMaxEms;
    private final AbstractC0231ic<?> setNavigationOnClickListener;
    private final int[] setOnLongClickListener;
    private final boolean setOnNavigationItemSelectedListener;
    private final iE setTextAlignment;
    private final je<?, ?> setTextScaleX;
    private final AbstractC0252ix setUiOptions;
    private final boolean setUnboundedRipple;
    private final int setY;
    private final int setZ;

    private static long MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        return i & 1048575;
    }

    private iH(int[] iArr, Object[] objArr, int i, int i2, iJ iJVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, iN iNVar, AbstractC0252ix abstractC0252ix, je<?, ?> jeVar, AbstractC0231ic<?> abstractC0231ic, iE iEVar) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = iArr;
        this.setCenterIfNoTextEnabled = objArr;
        this.setChipCornerRadius = i;
        this.ViewPager$SavedState$1 = i2;
        this.setLayoutAnimation = iJVar instanceof AbstractC0239il;
        this.setMaxEms = z;
        this.setUnboundedRipple = abstractC0231ic != null && abstractC0231ic.MenuHostHelper$$ExternalSyntheticLambda1(iJVar);
        this.setOnNavigationItemSelectedListener = z2;
        this.setOnLongClickListener = iArr2;
        this.setY = i3;
        this.setZ = i4;
        this.setIconSize = iNVar;
        this.setUiOptions = abstractC0252ix;
        this.setTextScaleX = jeVar;
        this.setNavigationOnClickListener = abstractC0231ic;
        this.setIconTintList = iJVar;
        this.setTextAlignment = iEVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02f6, code lost:
        if (r11 == false) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0324  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> o.iH<T> MenuHostHelper$$ExternalSyntheticLambda1(o.iF r33, o.iN r34, o.AbstractC0252ix r35, o.je<?, ?> r36, o.AbstractC0231ic<?> r37, o.iE r38) {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.iH.MenuHostHelper$$ExternalSyntheticLambda1(o.iF, o.iN, o.ix, o.je, o.ic, o.iE):o.iH");
    }

    private static Field setY(Class<?> cls, String str) {
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

    @Override // o.iY
    public final T setY() {
        return (T) this.setIconSize.MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x019b, code lost:
        if (r4 == r5) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b6, code lost:
        if (o.ji.setOnLongClickListener(r11, r7) == o.ji.setOnLongClickListener(r12, r7)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01d3, code lost:
        if (o.ji.setLayoutAnimation(r11, r7) == o.ji.setLayoutAnimation(r12, r7)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01ee, code lost:
        if (o.ji.setOnLongClickListener(r11, r7) == o.ji.setOnLongClickListener(r12, r7)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x020b, code lost:
        if (o.ji.setLayoutAnimation(r11, r7) == o.ji.setLayoutAnimation(r12, r7)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0227, code lost:
        if (o.ji.setLayoutAnimation(r11, r7) == o.ji.setLayoutAnimation(r12, r7)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (o.iZ.setIconTintList(o.ji.setNavigationOnClickListener(r11, r7), o.ji.setNavigationOnClickListener(r12, r7)) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0249, code lost:
        if (java.lang.Float.floatToIntBits(o.ji.setUnboundedRipple(r11, r7)) == java.lang.Float.floatToIntBits(o.ji.setUnboundedRipple(r12, r7))) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x026d, code lost:
        if (java.lang.Double.doubleToLongBits(o.ji.setUiOptions(r11, r7)) == java.lang.Double.doubleToLongBits(o.ji.setUiOptions(r12, r7))) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
        if (o.iZ.setIconTintList(o.ji.setNavigationOnClickListener(r11, r7), o.ji.setNavigationOnClickListener(r12, r7)) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
        if (o.ji.setLayoutAnimation(r11, r7) == o.ji.setLayoutAnimation(r12, r7)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
        if (o.ji.setOnLongClickListener(r11, r7) == o.ji.setOnLongClickListener(r12, r7)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d2, code lost:
        if (o.ji.setLayoutAnimation(r11, r7) == o.ji.setLayoutAnimation(r12, r7)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ed, code lost:
        if (o.ji.setOnLongClickListener(r11, r7) == o.ji.setOnLongClickListener(r12, r7)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0108, code lost:
        if (o.ji.setOnLongClickListener(r11, r7) == o.ji.setOnLongClickListener(r12, r7)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0123, code lost:
        if (o.ji.setOnLongClickListener(r11, r7) == o.ji.setOnLongClickListener(r12, r7)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0142, code lost:
        if (o.iZ.setIconTintList(o.ji.setNavigationOnClickListener(r11, r7), o.ji.setNavigationOnClickListener(r12, r7)) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0161, code lost:
        if (o.iZ.setIconTintList(o.ji.setNavigationOnClickListener(r11, r7), o.ji.setNavigationOnClickListener(r12, r7)) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0180, code lost:
        if (o.iZ.setIconTintList(o.ji.setNavigationOnClickListener(r11, r7), o.ji.setNavigationOnClickListener(r12, r7)) != false) goto L142;
     */
    @Override // o.iY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean setY(T r11, T r12) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.iH.setY(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // o.iY
    public final int setY(T t) {
        int i;
        int iconTintList;
        boolean iconTintList2;
        int length = this.MenuHostHelper$$ExternalSyntheticLambda1.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
            int i4 = iArr[i3 + 1];
            int i5 = iArr[i3];
            long j = 1048575 & i4;
            int i6 = 37;
            switch ((i4 & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    iconTintList = C0243ip.setIconTintList(Double.doubleToLongBits(ji.setUiOptions(t, j)));
                    i2 = i + iconTintList;
                    break;
                case 1:
                    i = i2 * 53;
                    iconTintList = Float.floatToIntBits(ji.setUnboundedRipple(t, j));
                    i2 = i + iconTintList;
                    break;
                case 2:
                    i = i2 * 53;
                    iconTintList = C0243ip.setIconTintList(ji.setLayoutAnimation(t, j));
                    i2 = i + iconTintList;
                    break;
                case 3:
                    i = i2 * 53;
                    iconTintList = C0243ip.setIconTintList(ji.setLayoutAnimation(t, j));
                    i2 = i + iconTintList;
                    break;
                case 4:
                    i = i2 * 53;
                    iconTintList = ji.setOnLongClickListener(t, j);
                    i2 = i + iconTintList;
                    break;
                case 5:
                    i = i2 * 53;
                    iconTintList = C0243ip.setIconTintList(ji.setLayoutAnimation(t, j));
                    i2 = i + iconTintList;
                    break;
                case 6:
                    i = i2 * 53;
                    iconTintList = ji.setOnLongClickListener(t, j);
                    i2 = i + iconTintList;
                    break;
                case 7:
                    i = i2 * 53;
                    iconTintList2 = ji.setNavigationOnClickListener.setIconTintList(t, j);
                    iconTintList = C0243ip.setIconTintList(iconTintList2);
                    i2 = i + iconTintList;
                    break;
                case 8:
                    i = i2 * 53;
                    iconTintList = ((String) ji.setNavigationOnClickListener(t, j)).hashCode();
                    i2 = i + iconTintList;
                    break;
                case 9:
                    Object navigationOnClickListener = ji.setNavigationOnClickListener(t, j);
                    if (navigationOnClickListener != null) {
                        i6 = navigationOnClickListener.hashCode();
                    }
                    i2 = (i2 * 53) + i6;
                    break;
                case 10:
                    i = i2 * 53;
                    iconTintList = ji.setNavigationOnClickListener(t, j).hashCode();
                    i2 = i + iconTintList;
                    break;
                case 11:
                    i = i2 * 53;
                    iconTintList = ji.setOnLongClickListener(t, j);
                    i2 = i + iconTintList;
                    break;
                case 12:
                    i = i2 * 53;
                    iconTintList = ji.setOnLongClickListener(t, j);
                    i2 = i + iconTintList;
                    break;
                case 13:
                    i = i2 * 53;
                    iconTintList = ji.setOnLongClickListener(t, j);
                    i2 = i + iconTintList;
                    break;
                case 14:
                    i = i2 * 53;
                    iconTintList = C0243ip.setIconTintList(ji.setLayoutAnimation(t, j));
                    i2 = i + iconTintList;
                    break;
                case 15:
                    i = i2 * 53;
                    iconTintList = ji.setOnLongClickListener(t, j);
                    i2 = i + iconTintList;
                    break;
                case 16:
                    i = i2 * 53;
                    iconTintList = C0243ip.setIconTintList(ji.setLayoutAnimation(t, j));
                    i2 = i + iconTintList;
                    break;
                case 17:
                    Object navigationOnClickListener2 = ji.setNavigationOnClickListener(t, j);
                    if (navigationOnClickListener2 != null) {
                        i6 = navigationOnClickListener2.hashCode();
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
                    iconTintList = ji.setNavigationOnClickListener(t, j).hashCode();
                    i2 = i + iconTintList;
                    break;
                case setExpandedTitleMargin.setY.setOrientation /* 50 */:
                    i = i2 * 53;
                    iconTintList = ji.setNavigationOnClickListener(t, j).hashCode();
                    i2 = i + iconTintList;
                    break;
                case 51:
                    if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i5, i3)) {
                        i = i2 * 53;
                        iconTintList = C0243ip.setIconTintList(Double.doubleToLongBits(((Double) ji.setNavigationOnClickListener(t, j)).doubleValue()));
                        i2 = i + iconTintList;
                        break;
                    } else {
                        break;
                    }
                case setExpandedTitleMargin.setY.setSupportCompoundDrawablesTintList /* 52 */:
                    if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i5, i3)) {
                        i = i2 * 53;
                        iconTintList = Float.floatToIntBits(((Float) ji.setNavigationOnClickListener(t, j)).floatValue());
                        i2 = i + iconTintList;
                        break;
                    } else {
                        break;
                    }
                case setExpandedTitleMargin.setY.setScrollingCacheEnabled /* 53 */:
                    if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i5, i3)) {
                        i = i2 * 53;
                        iconTintList = C0243ip.setIconTintList(((Long) ji.setNavigationOnClickListener(t, j)).longValue());
                        i2 = i + iconTintList;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i5, i3)) {
                        i = i2 * 53;
                        iconTintList = C0243ip.setIconTintList(((Long) ji.setNavigationOnClickListener(t, j)).longValue());
                        i2 = i + iconTintList;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i5, i3)) {
                        i = i2 * 53;
                        iconTintList = ((Integer) ji.setNavigationOnClickListener(t, j)).intValue();
                        i2 = i + iconTintList;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i5, i3)) {
                        i = i2 * 53;
                        iconTintList = C0243ip.setIconTintList(((Long) ji.setNavigationOnClickListener(t, j)).longValue());
                        i2 = i + iconTintList;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i5, i3)) {
                        i = i2 * 53;
                        iconTintList = ((Integer) ji.setNavigationOnClickListener(t, j)).intValue();
                        i2 = i + iconTintList;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i5, i3)) {
                        i = i2 * 53;
                        iconTintList = C0243ip.setIconTintList(((Boolean) ji.setNavigationOnClickListener(t, j)).booleanValue());
                        i2 = i + iconTintList;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i5, i3)) {
                        i = i2 * 53;
                        iconTintList = ((String) ji.setNavigationOnClickListener(t, j)).hashCode();
                        i2 = i + iconTintList;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i5, i3)) {
                        i = i2 * 53;
                        iconTintList = ji.setNavigationOnClickListener(t, j).hashCode();
                        i2 = i + iconTintList;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i5, i3)) {
                        i = i2 * 53;
                        iconTintList = ji.setNavigationOnClickListener(t, j).hashCode();
                        i2 = i + iconTintList;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i5, i3)) {
                        i = i2 * 53;
                        iconTintList = ((Integer) ji.setNavigationOnClickListener(t, j)).intValue();
                        i2 = i + iconTintList;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i5, i3)) {
                        i = i2 * 53;
                        iconTintList = ((Integer) ji.setNavigationOnClickListener(t, j)).intValue();
                        i2 = i + iconTintList;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i5, i3)) {
                        i = i2 * 53;
                        iconTintList = ((Integer) ji.setNavigationOnClickListener(t, j)).intValue();
                        i2 = i + iconTintList;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i5, i3)) {
                        i = i2 * 53;
                        iconTintList = C0243ip.setIconTintList(((Long) ji.setNavigationOnClickListener(t, j)).longValue());
                        i2 = i + iconTintList;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i5, i3)) {
                        i = i2 * 53;
                        iconTintList = ((Integer) ji.setNavigationOnClickListener(t, j)).intValue();
                        i2 = i + iconTintList;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i5, i3)) {
                        i = i2 * 53;
                        iconTintList = C0243ip.setIconTintList(((Long) ji.setNavigationOnClickListener(t, j)).longValue());
                        i2 = i + iconTintList;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i5, i3)) {
                        i = i2 * 53;
                        iconTintList = ji.setNavigationOnClickListener(t, j).hashCode();
                        i2 = i + iconTintList;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.setTextScaleX.setX(t).hashCode();
        return this.setUnboundedRipple ? (hashCode * 53) + this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(t).hashCode() : hashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setIconTintList(T t, T t2, int i) {
        if (setIconTintList((iH<T>) t2, i)) {
            long j = this.MenuHostHelper$$ExternalSyntheticLambda1[i + 1] & 1048575;
            Unsafe unsafe = setX;
            Object object = unsafe.getObject(t2, j);
            if (object == null) {
                StringBuilder sb = new StringBuilder("Source subfield ");
                sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1[i]);
                sb.append(" is present but null: ");
                sb.append(t2);
                throw new IllegalStateException(sb.toString());
            }
            iY iconTintList = setIconTintList(i);
            if (!setIconTintList((iH<T>) t, i)) {
                if (!setIconTintList(object)) {
                    unsafe.putObject(t, j, object);
                } else {
                    Object y = iconTintList.setY();
                    iconTintList.setIconTintList(y, object);
                    unsafe.putObject(t, j, y);
                }
                MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, j);
            if (!setIconTintList(object2)) {
                Object y2 = iconTintList.setY();
                iconTintList.setIconTintList(y2, object2);
                unsafe.putObject(t, j, y2);
                object2 = y2;
            }
            iconTintList.setIconTintList(object2, object);
        }
    }

    @Override // o.iY
    public final int setX(T t) {
        Iterable<Map.Entry> entrySet;
        int i;
        int i2;
        int x;
        int MenuHostHelper$$ExternalSyntheticLambda02;
        int centerIfNoTextEnabled;
        int chipCornerRadius;
        int x2;
        int MenuHostHelper$$ExternalSyntheticLambda03;
        int centerIfNoTextEnabled2;
        int chipCornerRadius2;
        int i3 = 1048575;
        if (this.setMaxEms) {
            Unsafe unsafe = setX;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
                if (i4 >= iArr.length) {
                    je<?, ?> jeVar = this.setTextScaleX;
                    return i5 + jeVar.setY(jeVar.setX(t));
                }
                int i6 = iArr[i4 + 1];
                int i7 = (i6 & 267386880) >>> 20;
                int i8 = iArr[i4];
                long j = i6 & 1048575;
                int i9 = (i7 < EnumC0236ii.DOUBLE_LIST_PACKED.setOnLongClickListener || i7 > EnumC0236ii.SINT64_LIST_PACKED.setOnLongClickListener) ? 0 : this.MenuHostHelper$$ExternalSyntheticLambda1[i4 + 2] & 1048575;
                switch (i7) {
                    case 0:
                        if (setIconTintList((iH<T>) t, i4)) {
                            x2 = hX.setX(i8);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 1:
                        if (setIconTintList((iH<T>) t, i4)) {
                            x2 = hX.setNavigationOnClickListener(i8);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 2:
                        if (setIconTintList((iH<T>) t, i4)) {
                            x2 = hX.setX(i8, ji.setLayoutAnimation(t, j));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 3:
                        if (setIconTintList((iH<T>) t, i4)) {
                            x2 = hX.setY(i8, ji.setLayoutAnimation(t, j));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 4:
                        if (setIconTintList((iH<T>) t, i4)) {
                            x2 = hX.setX(i8, ji.setOnLongClickListener(t, j));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 5:
                        if (setIconTintList((iH<T>) t, i4)) {
                            x2 = hX.setY(i8);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 6:
                        if (setIconTintList((iH<T>) t, i4)) {
                            x2 = hX.setIconTintList(i8);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 7:
                        if (setIconTintList((iH<T>) t, i4)) {
                            x2 = hX.MenuHostHelper$$ExternalSyntheticLambda0(i8);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 8:
                        if (setIconTintList((iH<T>) t, i4)) {
                            Object navigationOnClickListener = ji.setNavigationOnClickListener(t, j);
                            if (navigationOnClickListener instanceof hY) {
                                x2 = hX.setIconTintList(i8, (hY) navigationOnClickListener);
                                break;
                            } else {
                                x2 = hX.MenuHostHelper$$ExternalSyntheticLambda1(i8, (String) navigationOnClickListener);
                                break;
                            }
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 9:
                        if (setIconTintList((iH<T>) t, i4)) {
                            x2 = iZ.setX(i8, ji.setNavigationOnClickListener(t, j), setIconTintList(i4));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 10:
                        if (setIconTintList((iH<T>) t, i4)) {
                            x2 = hX.setIconTintList(i8, (hY) ji.setNavigationOnClickListener(t, j));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 11:
                        if (setIconTintList((iH<T>) t, i4)) {
                            x2 = hX.MenuHostHelper$$ExternalSyntheticLambda1(i8, ji.setOnLongClickListener(t, j));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 12:
                        if (setIconTintList((iH<T>) t, i4)) {
                            x2 = hX.setY(i8, ji.setOnLongClickListener(t, j));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 13:
                        if (setIconTintList((iH<T>) t, i4)) {
                            x2 = hX.setUnboundedRipple(i8);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 14:
                        if (setIconTintList((iH<T>) t, i4)) {
                            x2 = hX.setOnLongClickListener(i8);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 15:
                        if (setIconTintList((iH<T>) t, i4)) {
                            x2 = hX.setIconTintList(i8, ji.setOnLongClickListener(t, j));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 16:
                        if (setIconTintList((iH<T>) t, i4)) {
                            x2 = hX.setIconTintList(i8, ji.setLayoutAnimation(t, j));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 17:
                        if (setIconTintList((iH<T>) t, i4)) {
                            x2 = hX.setX(i8, (iJ) ji.setNavigationOnClickListener(t, j), setIconTintList(i4));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 18:
                        x2 = iZ.setIconTintList(i8, (List) ji.setNavigationOnClickListener(t, j));
                        break;
                    case 19:
                        x2 = iZ.setX(i8, (List) ji.setNavigationOnClickListener(t, j));
                        break;
                    case 20:
                        x2 = iZ.setOnLongClickListener(i8, (List) ji.setNavigationOnClickListener(t, j));
                        break;
                    case 21:
                        x2 = iZ.ViewPager$SavedState$1(i8, (List) ji.setNavigationOnClickListener(t, j));
                        break;
                    case 22:
                        x2 = iZ.setUiOptions(i8, (List) ji.setNavigationOnClickListener(t, j));
                        break;
                    case 23:
                        x2 = iZ.setIconTintList(i8, (List) ji.setNavigationOnClickListener(t, j));
                        break;
                    case 24:
                        x2 = iZ.setX(i8, (List) ji.setNavigationOnClickListener(t, j));
                        break;
                    case 25:
                        x2 = iZ.MenuHostHelper$$ExternalSyntheticLambda1(i8, (List) ji.setNavigationOnClickListener(t, j));
                        break;
                    case 26:
                        x2 = iZ.setLayoutAnimation(i8, (List) ji.setNavigationOnClickListener(t, j));
                        break;
                    case 27:
                        x2 = iZ.setIconTintList(i8, (List) ji.setNavigationOnClickListener(t, j), setIconTintList(i4));
                        break;
                    case 28:
                        x2 = iZ.setY(i8, (List) ji.setNavigationOnClickListener(t, j));
                        break;
                    case 29:
                        x2 = iZ.setCenterIfNoTextEnabled(i8, (List) ji.setNavigationOnClickListener(t, j));
                        break;
                    case 30:
                        x2 = iZ.MenuHostHelper$$ExternalSyntheticLambda0(i8, (List) ji.setNavigationOnClickListener(t, j));
                        break;
                    case 31:
                        x2 = iZ.setX(i8, (List) ji.setNavigationOnClickListener(t, j));
                        break;
                    case 32:
                        x2 = iZ.setIconTintList(i8, (List) ji.setNavigationOnClickListener(t, j));
                        break;
                    case 33:
                        x2 = iZ.setUnboundedRipple(i8, (List) ji.setNavigationOnClickListener(t, j));
                        break;
                    case 34:
                        x2 = iZ.setNavigationOnClickListener(i8, (List) ji.setNavigationOnClickListener(t, j));
                        break;
                    case 35:
                        MenuHostHelper$$ExternalSyntheticLambda03 = iZ.MenuHostHelper$$ExternalSyntheticLambda0((List) unsafe.getObject(t, j));
                        if (MenuHostHelper$$ExternalSyntheticLambda03 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe.putInt(t, i9, MenuHostHelper$$ExternalSyntheticLambda03);
                            }
                            centerIfNoTextEnabled2 = hX.setCenterIfNoTextEnabled(i8);
                            chipCornerRadius2 = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda03);
                            x2 = centerIfNoTextEnabled2 + chipCornerRadius2 + MenuHostHelper$$ExternalSyntheticLambda03;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case setExpandedTitleMargin.setY.setChipCornerRadius /* 36 */:
                        MenuHostHelper$$ExternalSyntheticLambda03 = iZ.setIconTintList((List) unsafe.getObject(t, j));
                        if (MenuHostHelper$$ExternalSyntheticLambda03 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe.putInt(t, i9, MenuHostHelper$$ExternalSyntheticLambda03);
                            }
                            centerIfNoTextEnabled2 = hX.setCenterIfNoTextEnabled(i8);
                            chipCornerRadius2 = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda03);
                            x2 = centerIfNoTextEnabled2 + chipCornerRadius2 + MenuHostHelper$$ExternalSyntheticLambda03;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 37:
                        MenuHostHelper$$ExternalSyntheticLambda03 = iZ.setLayoutAnimation((List) unsafe.getObject(t, j));
                        if (MenuHostHelper$$ExternalSyntheticLambda03 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe.putInt(t, i9, MenuHostHelper$$ExternalSyntheticLambda03);
                            }
                            centerIfNoTextEnabled2 = hX.setCenterIfNoTextEnabled(i8);
                            chipCornerRadius2 = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda03);
                            x2 = centerIfNoTextEnabled2 + chipCornerRadius2 + MenuHostHelper$$ExternalSyntheticLambda03;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case setExpandedTitleMargin.setY.setSupportCheckMarkTintList /* 38 */:
                        MenuHostHelper$$ExternalSyntheticLambda03 = iZ.setUiOptions((List) unsafe.getObject(t, j));
                        if (MenuHostHelper$$ExternalSyntheticLambda03 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe.putInt(t, i9, MenuHostHelper$$ExternalSyntheticLambda03);
                            }
                            centerIfNoTextEnabled2 = hX.setCenterIfNoTextEnabled(i8);
                            chipCornerRadius2 = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda03);
                            x2 = centerIfNoTextEnabled2 + chipCornerRadius2 + MenuHostHelper$$ExternalSyntheticLambda03;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case setExpandedTitleMargin.setY.setVelocityScale /* 39 */:
                        MenuHostHelper$$ExternalSyntheticLambda03 = iZ.MenuHostHelper$$ExternalSyntheticLambda1((List) unsafe.getObject(t, j));
                        if (MenuHostHelper$$ExternalSyntheticLambda03 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe.putInt(t, i9, MenuHostHelper$$ExternalSyntheticLambda03);
                            }
                            centerIfNoTextEnabled2 = hX.setCenterIfNoTextEnabled(i8);
                            chipCornerRadius2 = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda03);
                            x2 = centerIfNoTextEnabled2 + chipCornerRadius2 + MenuHostHelper$$ExternalSyntheticLambda03;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case setExpandedTitleMargin.setY.setRightEdgeEffectColor /* 40 */:
                        MenuHostHelper$$ExternalSyntheticLambda03 = iZ.MenuHostHelper$$ExternalSyntheticLambda0((List) unsafe.getObject(t, j));
                        if (MenuHostHelper$$ExternalSyntheticLambda03 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe.putInt(t, i9, MenuHostHelper$$ExternalSyntheticLambda03);
                            }
                            centerIfNoTextEnabled2 = hX.setCenterIfNoTextEnabled(i8);
                            chipCornerRadius2 = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda03);
                            x2 = centerIfNoTextEnabled2 + chipCornerRadius2 + MenuHostHelper$$ExternalSyntheticLambda03;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case setExpandedTitleMargin.setY.setHorizontalScrollbarTrackDrawable /* 41 */:
                        MenuHostHelper$$ExternalSyntheticLambda03 = iZ.setIconTintList((List) unsafe.getObject(t, j));
                        if (MenuHostHelper$$ExternalSyntheticLambda03 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe.putInt(t, i9, MenuHostHelper$$ExternalSyntheticLambda03);
                            }
                            centerIfNoTextEnabled2 = hX.setCenterIfNoTextEnabled(i8);
                            chipCornerRadius2 = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda03);
                            x2 = centerIfNoTextEnabled2 + chipCornerRadius2 + MenuHostHelper$$ExternalSyntheticLambda03;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case setExpandedTitleMargin.setY.setOnKeyListener /* 42 */:
                        MenuHostHelper$$ExternalSyntheticLambda03 = iZ.setX((List) unsafe.getObject(t, j));
                        if (MenuHostHelper$$ExternalSyntheticLambda03 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe.putInt(t, i9, MenuHostHelper$$ExternalSyntheticLambda03);
                            }
                            centerIfNoTextEnabled2 = hX.setCenterIfNoTextEnabled(i8);
                            chipCornerRadius2 = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda03);
                            x2 = centerIfNoTextEnabled2 + chipCornerRadius2 + MenuHostHelper$$ExternalSyntheticLambda03;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case setExpandedTitleMargin.setY.setForegroundTintList /* 43 */:
                        MenuHostHelper$$ExternalSyntheticLambda03 = iZ.setOnLongClickListener((List) unsafe.getObject(t, j));
                        if (MenuHostHelper$$ExternalSyntheticLambda03 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe.putInt(t, i9, MenuHostHelper$$ExternalSyntheticLambda03);
                            }
                            centerIfNoTextEnabled2 = hX.setCenterIfNoTextEnabled(i8);
                            chipCornerRadius2 = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda03);
                            x2 = centerIfNoTextEnabled2 + chipCornerRadius2 + MenuHostHelper$$ExternalSyntheticLambda03;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case setExpandedTitleMargin.setY.setRecyclerListener /* 44 */:
                        MenuHostHelper$$ExternalSyntheticLambda03 = iZ.setY((List) unsafe.getObject(t, j));
                        if (MenuHostHelper$$ExternalSyntheticLambda03 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe.putInt(t, i9, MenuHostHelper$$ExternalSyntheticLambda03);
                            }
                            centerIfNoTextEnabled2 = hX.setCenterIfNoTextEnabled(i8);
                            chipCornerRadius2 = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda03);
                            x2 = centerIfNoTextEnabled2 + chipCornerRadius2 + MenuHostHelper$$ExternalSyntheticLambda03;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case setExpandedTitleMargin.setY.setPreferKeepClearRects /* 45 */:
                        MenuHostHelper$$ExternalSyntheticLambda03 = iZ.setIconTintList((List) unsafe.getObject(t, j));
                        if (MenuHostHelper$$ExternalSyntheticLambda03 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe.putInt(t, i9, MenuHostHelper$$ExternalSyntheticLambda03);
                            }
                            centerIfNoTextEnabled2 = hX.setCenterIfNoTextEnabled(i8);
                            chipCornerRadius2 = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda03);
                            x2 = centerIfNoTextEnabled2 + chipCornerRadius2 + MenuHostHelper$$ExternalSyntheticLambda03;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case setExpandedTitleMargin.setY.setInterpolator /* 46 */:
                        MenuHostHelper$$ExternalSyntheticLambda03 = iZ.MenuHostHelper$$ExternalSyntheticLambda0((List) unsafe.getObject(t, j));
                        if (MenuHostHelper$$ExternalSyntheticLambda03 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe.putInt(t, i9, MenuHostHelper$$ExternalSyntheticLambda03);
                            }
                            centerIfNoTextEnabled2 = hX.setCenterIfNoTextEnabled(i8);
                            chipCornerRadius2 = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda03);
                            x2 = centerIfNoTextEnabled2 + chipCornerRadius2 + MenuHostHelper$$ExternalSyntheticLambda03;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case setExpandedTitleMargin.setY.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 /* 47 */:
                        MenuHostHelper$$ExternalSyntheticLambda03 = iZ.setUnboundedRipple((List) unsafe.getObject(t, j));
                        if (MenuHostHelper$$ExternalSyntheticLambda03 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe.putInt(t, i9, MenuHostHelper$$ExternalSyntheticLambda03);
                            }
                            centerIfNoTextEnabled2 = hX.setCenterIfNoTextEnabled(i8);
                            chipCornerRadius2 = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda03);
                            x2 = centerIfNoTextEnabled2 + chipCornerRadius2 + MenuHostHelper$$ExternalSyntheticLambda03;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case setExpandedTitleMargin.setY.ParcelableSparseArray$1 /* 48 */:
                        MenuHostHelper$$ExternalSyntheticLambda03 = iZ.setNavigationOnClickListener((List) unsafe.getObject(t, j));
                        if (MenuHostHelper$$ExternalSyntheticLambda03 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe.putInt(t, i9, MenuHostHelper$$ExternalSyntheticLambda03);
                            }
                            centerIfNoTextEnabled2 = hX.setCenterIfNoTextEnabled(i8);
                            chipCornerRadius2 = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda03);
                            x2 = centerIfNoTextEnabled2 + chipCornerRadius2 + MenuHostHelper$$ExternalSyntheticLambda03;
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case setExpandedTitleMargin.setY.setAutoLinkMask /* 49 */:
                        x2 = iZ.setY(i8, (List) ji.setNavigationOnClickListener(t, j), setIconTintList(i4));
                        break;
                    case setExpandedTitleMargin.setY.setOrientation /* 50 */:
                        x2 = this.setTextAlignment.MenuHostHelper$$ExternalSyntheticLambda0(i8, ji.setNavigationOnClickListener(t, j), this.setCenterIfNoTextEnabled[(i4 / 3) << 1]);
                        break;
                    case 51:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i8, i4)) {
                            x2 = hX.setX(i8);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case setExpandedTitleMargin.setY.setSupportCompoundDrawablesTintList /* 52 */:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i8, i4)) {
                            x2 = hX.setNavigationOnClickListener(i8);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case setExpandedTitleMargin.setY.setScrollingCacheEnabled /* 53 */:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i8, i4)) {
                            x2 = hX.setX(i8, ((Long) ji.setNavigationOnClickListener(t, j)).longValue());
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 54:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i8, i4)) {
                            x2 = hX.setY(i8, ((Long) ji.setNavigationOnClickListener(t, j)).longValue());
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 55:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i8, i4)) {
                            x2 = hX.setX(i8, ((Integer) ji.setNavigationOnClickListener(t, j)).intValue());
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 56:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i8, i4)) {
                            x2 = hX.setY(i8);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 57:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i8, i4)) {
                            x2 = hX.setIconTintList(i8);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 58:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i8, i4)) {
                            x2 = hX.MenuHostHelper$$ExternalSyntheticLambda0(i8);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 59:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i8, i4)) {
                            Object navigationOnClickListener2 = ji.setNavigationOnClickListener(t, j);
                            if (navigationOnClickListener2 instanceof hY) {
                                x2 = hX.setIconTintList(i8, (hY) navigationOnClickListener2);
                                break;
                            } else {
                                x2 = hX.MenuHostHelper$$ExternalSyntheticLambda1(i8, (String) navigationOnClickListener2);
                                break;
                            }
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 60:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i8, i4)) {
                            x2 = iZ.setX(i8, ji.setNavigationOnClickListener(t, j), setIconTintList(i4));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 61:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i8, i4)) {
                            x2 = hX.setIconTintList(i8, (hY) ji.setNavigationOnClickListener(t, j));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 62:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i8, i4)) {
                            x2 = hX.MenuHostHelper$$ExternalSyntheticLambda1(i8, ((Integer) ji.setNavigationOnClickListener(t, j)).intValue());
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 63:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i8, i4)) {
                            x2 = hX.setY(i8, ((Integer) ji.setNavigationOnClickListener(t, j)).intValue());
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 64:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i8, i4)) {
                            x2 = hX.setUnboundedRipple(i8);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 65:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i8, i4)) {
                            x2 = hX.setOnLongClickListener(i8);
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 66:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i8, i4)) {
                            x2 = hX.setIconTintList(i8, ((Integer) ji.setNavigationOnClickListener(t, j)).intValue());
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 67:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i8, i4)) {
                            x2 = hX.setIconTintList(i8, ((Long) ji.setNavigationOnClickListener(t, j)).longValue());
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    case 68:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i8, i4)) {
                            x2 = hX.setX(i8, (iJ) ji.setNavigationOnClickListener(t, j), setIconTintList(i4));
                            break;
                        } else {
                            continue;
                            i4 += 3;
                        }
                    default:
                        i4 += 3;
                }
                i5 += x2;
                i4 += 3;
            }
        } else {
            Unsafe unsafe2 = setX;
            int i10 = 0;
            int i11 = 0;
            int i12 = 1048575;
            int i13 = 0;
            while (true) {
                int[] iArr2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                if (i10 >= iArr2.length) {
                    je<?, ?> jeVar2 = this.setTextScaleX;
                    int y = i11 + jeVar2.setY(jeVar2.setX(t));
                    if (this.setUnboundedRipple) {
                        C0237ij<?> MenuHostHelper$$ExternalSyntheticLambda1 = this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(t);
                        int i14 = 0;
                        for (int i15 = 0; i15 < MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1.size(); i15++) {
                            iW<K, Object>.setX setx = MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1.get(i15);
                            i14 += C0237ij.setX((ij$MenuHostHelper$$ExternalSyntheticLambda0) setx.getKey(), setx.getValue());
                        }
                        iW<?, Object> iWVar = MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1;
                        if (iWVar.setIconTintList.isEmpty()) {
                            entrySet = iW$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0();
                        } else {
                            entrySet = iWVar.setIconTintList.entrySet();
                        }
                        for (Map.Entry entry : entrySet) {
                            i14 += C0237ij.setX((ij$MenuHostHelper$$ExternalSyntheticLambda0) entry.getKey(), entry.getValue());
                        }
                        return y + i14;
                    }
                    return y;
                }
                int i16 = iArr2[i10 + 1];
                int i17 = iArr2[i10];
                int i18 = (i16 & 267386880) >>> 20;
                if (i18 <= 17) {
                    i = iArr2[i10 + 2];
                    int i19 = i & i3;
                    i2 = 1 << (i >>> 20);
                    if (i19 != i12) {
                        i13 = unsafe2.getInt(t, i19);
                        i12 = i19;
                    }
                } else {
                    i = (!this.setOnNavigationItemSelectedListener || i18 < EnumC0236ii.DOUBLE_LIST_PACKED.setOnLongClickListener || i18 > EnumC0236ii.SINT64_LIST_PACKED.setOnLongClickListener) ? 0 : this.MenuHostHelper$$ExternalSyntheticLambda1[i10 + 2] & i3;
                    i2 = 0;
                }
                long j2 = i16 & i3;
                switch (i18) {
                    case 0:
                        if ((i13 & i2) != 0) {
                            x = hX.setX(i17);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 1:
                        if ((i13 & i2) != 0) {
                            x = hX.setNavigationOnClickListener(i17);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 2:
                        if ((i13 & i2) != 0) {
                            x = hX.setX(i17, unsafe2.getLong(t, j2));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 3:
                        if ((i13 & i2) != 0) {
                            x = hX.setY(i17, unsafe2.getLong(t, j2));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 4:
                        if ((i13 & i2) != 0) {
                            x = hX.setX(i17, unsafe2.getInt(t, j2));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 5:
                        if ((i13 & i2) != 0) {
                            x = hX.setY(i17);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 6:
                        if ((i13 & i2) != 0) {
                            x = hX.setIconTintList(i17);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 7:
                        if ((i13 & i2) != 0) {
                            x = hX.MenuHostHelper$$ExternalSyntheticLambda0(i17);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 8:
                        if ((i13 & i2) != 0) {
                            Object object = unsafe2.getObject(t, j2);
                            if (object instanceof hY) {
                                x = hX.setIconTintList(i17, (hY) object);
                                break;
                            } else {
                                x = hX.MenuHostHelper$$ExternalSyntheticLambda1(i17, (String) object);
                                break;
                            }
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 9:
                        if ((i13 & i2) != 0) {
                            x = iZ.setX(i17, unsafe2.getObject(t, j2), setIconTintList(i10));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 10:
                        if ((i13 & i2) != 0) {
                            x = hX.setIconTintList(i17, (hY) unsafe2.getObject(t, j2));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 11:
                        if ((i13 & i2) != 0) {
                            x = hX.MenuHostHelper$$ExternalSyntheticLambda1(i17, unsafe2.getInt(t, j2));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 12:
                        if ((i13 & i2) != 0) {
                            x = hX.setY(i17, unsafe2.getInt(t, j2));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 13:
                        if ((i13 & i2) != 0) {
                            x = hX.setUnboundedRipple(i17);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 14:
                        if ((i13 & i2) != 0) {
                            x = hX.setOnLongClickListener(i17);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 15:
                        if ((i13 & i2) != 0) {
                            x = hX.setIconTintList(i17, unsafe2.getInt(t, j2));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 16:
                        if ((i13 & i2) != 0) {
                            x = hX.setIconTintList(i17, unsafe2.getLong(t, j2));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 17:
                        if ((i13 & i2) != 0) {
                            x = hX.setX(i17, (iJ) unsafe2.getObject(t, j2), setIconTintList(i10));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 18:
                        x = iZ.setIconTintList(i17, (List) unsafe2.getObject(t, j2));
                        break;
                    case 19:
                        x = iZ.setX(i17, (List) unsafe2.getObject(t, j2));
                        break;
                    case 20:
                        x = iZ.setOnLongClickListener(i17, (List) unsafe2.getObject(t, j2));
                        break;
                    case 21:
                        x = iZ.ViewPager$SavedState$1(i17, (List) unsafe2.getObject(t, j2));
                        break;
                    case 22:
                        x = iZ.setUiOptions(i17, (List) unsafe2.getObject(t, j2));
                        break;
                    case 23:
                        x = iZ.setIconTintList(i17, (List) unsafe2.getObject(t, j2));
                        break;
                    case 24:
                        x = iZ.setX(i17, (List) unsafe2.getObject(t, j2));
                        break;
                    case 25:
                        x = iZ.MenuHostHelper$$ExternalSyntheticLambda1(i17, (List) unsafe2.getObject(t, j2));
                        break;
                    case 26:
                        x = iZ.setLayoutAnimation(i17, (List) unsafe2.getObject(t, j2));
                        break;
                    case 27:
                        x = iZ.setIconTintList(i17, (List) unsafe2.getObject(t, j2), setIconTintList(i10));
                        break;
                    case 28:
                        x = iZ.setY(i17, (List) unsafe2.getObject(t, j2));
                        break;
                    case 29:
                        x = iZ.setCenterIfNoTextEnabled(i17, (List) unsafe2.getObject(t, j2));
                        break;
                    case 30:
                        x = iZ.MenuHostHelper$$ExternalSyntheticLambda0(i17, (List) unsafe2.getObject(t, j2));
                        break;
                    case 31:
                        x = iZ.setX(i17, (List) unsafe2.getObject(t, j2));
                        break;
                    case 32:
                        x = iZ.setIconTintList(i17, (List) unsafe2.getObject(t, j2));
                        break;
                    case 33:
                        x = iZ.setUnboundedRipple(i17, (List) unsafe2.getObject(t, j2));
                        break;
                    case 34:
                        x = iZ.setNavigationOnClickListener(i17, (List) unsafe2.getObject(t, j2));
                        break;
                    case 35:
                        MenuHostHelper$$ExternalSyntheticLambda02 = iZ.MenuHostHelper$$ExternalSyntheticLambda0((List) unsafe2.getObject(t, j2));
                        if (MenuHostHelper$$ExternalSyntheticLambda02 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe2.putInt(t, i, MenuHostHelper$$ExternalSyntheticLambda02);
                            }
                            centerIfNoTextEnabled = hX.setCenterIfNoTextEnabled(i17);
                            chipCornerRadius = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda02);
                            x = MenuHostHelper$$ExternalSyntheticLambda02 + centerIfNoTextEnabled + chipCornerRadius;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setChipCornerRadius /* 36 */:
                        MenuHostHelper$$ExternalSyntheticLambda02 = iZ.setIconTintList((List) unsafe2.getObject(t, j2));
                        if (MenuHostHelper$$ExternalSyntheticLambda02 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe2.putInt(t, i, MenuHostHelper$$ExternalSyntheticLambda02);
                            }
                            centerIfNoTextEnabled = hX.setCenterIfNoTextEnabled(i17);
                            chipCornerRadius = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda02);
                            x = MenuHostHelper$$ExternalSyntheticLambda02 + centerIfNoTextEnabled + chipCornerRadius;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 37:
                        MenuHostHelper$$ExternalSyntheticLambda02 = iZ.setLayoutAnimation((List) unsafe2.getObject(t, j2));
                        if (MenuHostHelper$$ExternalSyntheticLambda02 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe2.putInt(t, i, MenuHostHelper$$ExternalSyntheticLambda02);
                            }
                            centerIfNoTextEnabled = hX.setCenterIfNoTextEnabled(i17);
                            chipCornerRadius = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda02);
                            x = MenuHostHelper$$ExternalSyntheticLambda02 + centerIfNoTextEnabled + chipCornerRadius;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setSupportCheckMarkTintList /* 38 */:
                        MenuHostHelper$$ExternalSyntheticLambda02 = iZ.setUiOptions((List) unsafe2.getObject(t, j2));
                        if (MenuHostHelper$$ExternalSyntheticLambda02 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe2.putInt(t, i, MenuHostHelper$$ExternalSyntheticLambda02);
                            }
                            centerIfNoTextEnabled = hX.setCenterIfNoTextEnabled(i17);
                            chipCornerRadius = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda02);
                            x = MenuHostHelper$$ExternalSyntheticLambda02 + centerIfNoTextEnabled + chipCornerRadius;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setVelocityScale /* 39 */:
                        MenuHostHelper$$ExternalSyntheticLambda02 = iZ.MenuHostHelper$$ExternalSyntheticLambda1((List) unsafe2.getObject(t, j2));
                        if (MenuHostHelper$$ExternalSyntheticLambda02 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe2.putInt(t, i, MenuHostHelper$$ExternalSyntheticLambda02);
                            }
                            centerIfNoTextEnabled = hX.setCenterIfNoTextEnabled(i17);
                            chipCornerRadius = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda02);
                            x = MenuHostHelper$$ExternalSyntheticLambda02 + centerIfNoTextEnabled + chipCornerRadius;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setRightEdgeEffectColor /* 40 */:
                        MenuHostHelper$$ExternalSyntheticLambda02 = iZ.MenuHostHelper$$ExternalSyntheticLambda0((List) unsafe2.getObject(t, j2));
                        if (MenuHostHelper$$ExternalSyntheticLambda02 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe2.putInt(t, i, MenuHostHelper$$ExternalSyntheticLambda02);
                            }
                            centerIfNoTextEnabled = hX.setCenterIfNoTextEnabled(i17);
                            chipCornerRadius = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda02);
                            x = MenuHostHelper$$ExternalSyntheticLambda02 + centerIfNoTextEnabled + chipCornerRadius;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setHorizontalScrollbarTrackDrawable /* 41 */:
                        MenuHostHelper$$ExternalSyntheticLambda02 = iZ.setIconTintList((List) unsafe2.getObject(t, j2));
                        if (MenuHostHelper$$ExternalSyntheticLambda02 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe2.putInt(t, i, MenuHostHelper$$ExternalSyntheticLambda02);
                            }
                            centerIfNoTextEnabled = hX.setCenterIfNoTextEnabled(i17);
                            chipCornerRadius = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda02);
                            x = MenuHostHelper$$ExternalSyntheticLambda02 + centerIfNoTextEnabled + chipCornerRadius;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setOnKeyListener /* 42 */:
                        MenuHostHelper$$ExternalSyntheticLambda02 = iZ.setX((List) unsafe2.getObject(t, j2));
                        if (MenuHostHelper$$ExternalSyntheticLambda02 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe2.putInt(t, i, MenuHostHelper$$ExternalSyntheticLambda02);
                            }
                            centerIfNoTextEnabled = hX.setCenterIfNoTextEnabled(i17);
                            chipCornerRadius = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda02);
                            x = MenuHostHelper$$ExternalSyntheticLambda02 + centerIfNoTextEnabled + chipCornerRadius;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setForegroundTintList /* 43 */:
                        MenuHostHelper$$ExternalSyntheticLambda02 = iZ.setOnLongClickListener((List) unsafe2.getObject(t, j2));
                        if (MenuHostHelper$$ExternalSyntheticLambda02 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe2.putInt(t, i, MenuHostHelper$$ExternalSyntheticLambda02);
                            }
                            centerIfNoTextEnabled = hX.setCenterIfNoTextEnabled(i17);
                            chipCornerRadius = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda02);
                            x = MenuHostHelper$$ExternalSyntheticLambda02 + centerIfNoTextEnabled + chipCornerRadius;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setRecyclerListener /* 44 */:
                        MenuHostHelper$$ExternalSyntheticLambda02 = iZ.setY((List) unsafe2.getObject(t, j2));
                        if (MenuHostHelper$$ExternalSyntheticLambda02 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe2.putInt(t, i, MenuHostHelper$$ExternalSyntheticLambda02);
                            }
                            centerIfNoTextEnabled = hX.setCenterIfNoTextEnabled(i17);
                            chipCornerRadius = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda02);
                            x = MenuHostHelper$$ExternalSyntheticLambda02 + centerIfNoTextEnabled + chipCornerRadius;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setPreferKeepClearRects /* 45 */:
                        MenuHostHelper$$ExternalSyntheticLambda02 = iZ.setIconTintList((List) unsafe2.getObject(t, j2));
                        if (MenuHostHelper$$ExternalSyntheticLambda02 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe2.putInt(t, i, MenuHostHelper$$ExternalSyntheticLambda02);
                            }
                            centerIfNoTextEnabled = hX.setCenterIfNoTextEnabled(i17);
                            chipCornerRadius = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda02);
                            x = MenuHostHelper$$ExternalSyntheticLambda02 + centerIfNoTextEnabled + chipCornerRadius;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setInterpolator /* 46 */:
                        MenuHostHelper$$ExternalSyntheticLambda02 = iZ.MenuHostHelper$$ExternalSyntheticLambda0((List) unsafe2.getObject(t, j2));
                        if (MenuHostHelper$$ExternalSyntheticLambda02 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe2.putInt(t, i, MenuHostHelper$$ExternalSyntheticLambda02);
                            }
                            centerIfNoTextEnabled = hX.setCenterIfNoTextEnabled(i17);
                            chipCornerRadius = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda02);
                            x = MenuHostHelper$$ExternalSyntheticLambda02 + centerIfNoTextEnabled + chipCornerRadius;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 /* 47 */:
                        MenuHostHelper$$ExternalSyntheticLambda02 = iZ.setUnboundedRipple((List) unsafe2.getObject(t, j2));
                        if (MenuHostHelper$$ExternalSyntheticLambda02 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe2.putInt(t, i, MenuHostHelper$$ExternalSyntheticLambda02);
                            }
                            centerIfNoTextEnabled = hX.setCenterIfNoTextEnabled(i17);
                            chipCornerRadius = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda02);
                            x = MenuHostHelper$$ExternalSyntheticLambda02 + centerIfNoTextEnabled + chipCornerRadius;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.ParcelableSparseArray$1 /* 48 */:
                        MenuHostHelper$$ExternalSyntheticLambda02 = iZ.setNavigationOnClickListener((List) unsafe2.getObject(t, j2));
                        if (MenuHostHelper$$ExternalSyntheticLambda02 > 0) {
                            if (this.setOnNavigationItemSelectedListener) {
                                unsafe2.putInt(t, i, MenuHostHelper$$ExternalSyntheticLambda02);
                            }
                            centerIfNoTextEnabled = hX.setCenterIfNoTextEnabled(i17);
                            chipCornerRadius = hX.setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda02);
                            x = MenuHostHelper$$ExternalSyntheticLambda02 + centerIfNoTextEnabled + chipCornerRadius;
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setAutoLinkMask /* 49 */:
                        x = iZ.setY(i17, (List) unsafe2.getObject(t, j2), setIconTintList(i10));
                        break;
                    case setExpandedTitleMargin.setY.setOrientation /* 50 */:
                        x = this.setTextAlignment.MenuHostHelper$$ExternalSyntheticLambda0(i17, unsafe2.getObject(t, j2), this.setCenterIfNoTextEnabled[(i10 / 3) << 1]);
                        break;
                    case 51:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i17, i10)) {
                            x = hX.setX(i17);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setSupportCompoundDrawablesTintList /* 52 */:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i17, i10)) {
                            x = hX.setNavigationOnClickListener(i17);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case setExpandedTitleMargin.setY.setScrollingCacheEnabled /* 53 */:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i17, i10)) {
                            x = hX.setX(i17, ((Long) ji.setNavigationOnClickListener(t, j2)).longValue());
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 54:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i17, i10)) {
                            x = hX.setY(i17, ((Long) ji.setNavigationOnClickListener(t, j2)).longValue());
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 55:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i17, i10)) {
                            x = hX.setX(i17, ((Integer) ji.setNavigationOnClickListener(t, j2)).intValue());
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 56:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i17, i10)) {
                            x = hX.setY(i17);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 57:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i17, i10)) {
                            x = hX.setIconTintList(i17);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 58:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i17, i10)) {
                            x = hX.MenuHostHelper$$ExternalSyntheticLambda0(i17);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 59:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i17, i10)) {
                            Object object2 = unsafe2.getObject(t, j2);
                            if (object2 instanceof hY) {
                                x = hX.setIconTintList(i17, (hY) object2);
                                break;
                            } else {
                                x = hX.MenuHostHelper$$ExternalSyntheticLambda1(i17, (String) object2);
                                break;
                            }
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 60:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i17, i10)) {
                            x = iZ.setX(i17, unsafe2.getObject(t, j2), setIconTintList(i10));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 61:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i17, i10)) {
                            x = hX.setIconTintList(i17, (hY) unsafe2.getObject(t, j2));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 62:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i17, i10)) {
                            x = hX.MenuHostHelper$$ExternalSyntheticLambda1(i17, ((Integer) ji.setNavigationOnClickListener(t, j2)).intValue());
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 63:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i17, i10)) {
                            x = hX.setY(i17, ((Integer) ji.setNavigationOnClickListener(t, j2)).intValue());
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 64:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i17, i10)) {
                            x = hX.setUnboundedRipple(i17);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 65:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i17, i10)) {
                            x = hX.setOnLongClickListener(i17);
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 66:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i17, i10)) {
                            x = hX.setIconTintList(i17, ((Integer) ji.setNavigationOnClickListener(t, j2)).intValue());
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 67:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i17, i10)) {
                            x = hX.setIconTintList(i17, ((Long) ji.setNavigationOnClickListener(t, j2)).longValue());
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    case 68:
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i17, i10)) {
                            x = hX.setX(i17, (iJ) unsafe2.getObject(t, j2), setIconTintList(i10));
                            break;
                        } else {
                            continue;
                            i10 += 3;
                            i3 = 1048575;
                        }
                    default:
                        i10 += 3;
                        i3 = 1048575;
                }
                i11 += x;
                i10 += 3;
                i3 = 1048575;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0b5d  */
    @Override // o.iY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(T r13, o.jj r14) {
        /*
            Method dump skipped, instructions count: 3228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.iH.MenuHostHelper$$ExternalSyntheticLambda1(java.lang.Object, o.jj):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0501  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setY(T r18, o.jj r19) {
        /*
            Method dump skipped, instructions count: 1454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.iH.setY(java.lang.Object, o.jj):void");
    }

    private <K, V> void setIconTintList(jj jjVar, int i, Object obj, int i2) {
        if (obj != null) {
            jjVar.setY(i, this.setTextAlignment.setY(this.setCenterIfNoTextEnabled[(i2 / 3) << 1]), this.setTextAlignment.setX(obj));
        }
    }

    private iY setIconTintList(int i) {
        int i2 = (i / 3) << 1;
        iY iYVar = (iY) this.setCenterIfNoTextEnabled[i2];
        if (iYVar != null) {
            return iYVar;
        }
        iY<T> iconTintList = iU.setX().setIconTintList((Class) this.setCenterIfNoTextEnabled[i2 + 1]);
        this.setCenterIfNoTextEnabled[i2] = iconTintList;
        return iconTintList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.iY
    public final void MenuHostHelper$$ExternalSyntheticLambda1(T t) {
        if (setIconTintList(t)) {
            if (t instanceof AbstractC0239il) {
                AbstractC0239il abstractC0239il = (AbstractC0239il) t;
                abstractC0239il.setIconTintList(Integer.MAX_VALUE);
                abstractC0239il.setCenterIfNoTextEnabled();
                abstractC0239il.memoizedSerializedSize = Integer.MAX_VALUE & abstractC0239il.memoizedSerializedSize;
            }
            int length = this.MenuHostHelper$$ExternalSyntheticLambda1.length;
            for (int i = 0; i < length; i += 3) {
                int i2 = this.MenuHostHelper$$ExternalSyntheticLambda1[i + 1];
                long j = 1048575 & i2;
                int i3 = (i2 & 267386880) >>> 20;
                if (i3 != 9) {
                    switch (i3) {
                        case 17:
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
                            this.setUiOptions.setIconTintList(t, j);
                            continue;
                        case setExpandedTitleMargin.setY.setOrientation /* 50 */:
                            Unsafe unsafe = setX;
                            Object object = unsafe.getObject(t, j);
                            if (object != null) {
                                unsafe.putObject(t, j, this.setTextAlignment.MenuHostHelper$$ExternalSyntheticLambda0(object));
                            } else {
                                continue;
                            }
                        default:
                    }
                }
                if (setIconTintList((iH<T>) t, i)) {
                    setIconTintList(i).MenuHostHelper$$ExternalSyntheticLambda1(setX.getObject(t, j));
                }
            }
            this.setTextScaleX.MenuHostHelper$$ExternalSyntheticLambda1(t);
            if (this.setUnboundedRipple) {
                this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0(t);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [o.iY] */
    /* JADX WARN: Type inference failed for: r5v5, types: [o.iY] */
    /* JADX WARN: Type inference failed for: r5v6, types: [o.iY] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18, types: [o.iY] */
    /* JADX WARN: Type inference failed for: r7v21 */
    @Override // o.iY
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(T t) {
        boolean z;
        int i = 0;
        int i2 = 1048575;
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (i >= this.setY) {
                return !this.setUnboundedRipple || this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(t).MenuHostHelper$$ExternalSyntheticLambda0();
            }
            int i4 = this.setOnLongClickListener[i];
            int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            int i7 = iArr[i4 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i2) {
                if (i8 != 1048575) {
                    i3 = setX.getInt(t, i8);
                }
                i2 = i8;
            }
            if ((268435456 & i6) != 0) {
                if (i2 == 1048575) {
                    z = setIconTintList((iH<T>) t, i4);
                } else {
                    z = (i3 & i9) != 0;
                }
                if (!z) {
                    return false;
                }
            }
            int i10 = (267386880 & i6) >>> 20;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i5, i4) && !setIconTintList(i4).MenuHostHelper$$ExternalSyntheticLambda0(ji.setNavigationOnClickListener(t, i6 & 1048575))) {
                            return false;
                        }
                    } else if (i10 != 49) {
                        if (i10 == 50) {
                            Map<?, ?> x = this.setTextAlignment.setX(ji.setNavigationOnClickListener(t, i6 & 1048575));
                            if (!x.isEmpty()) {
                                if (this.setTextAlignment.setY(this.setCenterIfNoTextEnabled[(i4 / 3) << 1]).setX.setZ == jg$MenuHostHelper$$ExternalSyntheticLambda1.MESSAGE) {
                                    Iterator<?> it = x.values().iterator();
                                    iY<T> iYVar = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (iYVar == null) {
                                            iYVar = iU.setX().setIconTintList(next.getClass());
                                        }
                                        boolean MenuHostHelper$$ExternalSyntheticLambda02 = iYVar.MenuHostHelper$$ExternalSyntheticLambda0(next);
                                        iYVar = iYVar;
                                        if (!MenuHostHelper$$ExternalSyntheticLambda02) {
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
                List list = (List) ji.setNavigationOnClickListener(t, i6 & 1048575);
                if (!list.isEmpty()) {
                    ?? iconTintList = setIconTintList(i4);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= list.size()) {
                            break;
                        } else if (!iconTintList.MenuHostHelper$$ExternalSyntheticLambda0(list.get(i11))) {
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
                if (i2 == 1048575) {
                    z2 = setIconTintList((iH<T>) t, i4);
                } else if ((i9 & i3) == 0) {
                    z2 = false;
                }
                if (z2 && !setIconTintList(i4).MenuHostHelper$$ExternalSyntheticLambda0(ji.setNavigationOnClickListener(t, i6 & 1048575))) {
                    return false;
                }
            }
            i++;
        }
    }

    private static void MenuHostHelper$$ExternalSyntheticLambda1(int i, Object obj, jj jjVar) {
        if (obj instanceof String) {
            jjVar.setIconTintList(i, (String) obj);
        } else {
            jjVar.MenuHostHelper$$ExternalSyntheticLambda1(i, (hY) obj);
        }
    }

    private int setY(int i) {
        return this.MenuHostHelper$$ExternalSyntheticLambda1[i];
    }

    private static boolean setIconTintList(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((obj instanceof AbstractC0239il) && (((AbstractC0239il) obj).memoizedSerializedSize & Integer.MIN_VALUE) == 0) ? false : true;
    }

    private static <T> double setX(T t, long j) {
        return ji.setUiOptions(t, j);
    }

    private static <T> int setY(T t, long j) {
        return ji.setOnLongClickListener(t, j);
    }

    private boolean setIconTintList(T t, int i) {
        boolean iconTintList;
        boolean equals;
        int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int i2 = iArr[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return (ji.setOnLongClickListener(t, j) & (1 << (i2 >>> 20))) != 0;
        }
        int i3 = iArr[i + 1];
        long j2 = i3 & 1048575;
        switch ((i3 & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(ji.setUiOptions(t, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(ji.setUnboundedRipple(t, j2)) != 0;
            case 2:
                return ji.setLayoutAnimation(t, j2) != 0;
            case 3:
                return ji.setLayoutAnimation(t, j2) != 0;
            case 4:
                return ji.setOnLongClickListener(t, j2) != 0;
            case 5:
                return ji.setLayoutAnimation(t, j2) != 0;
            case 6:
                return ji.setOnLongClickListener(t, j2) != 0;
            case 7:
                iconTintList = ji.setNavigationOnClickListener.setIconTintList(t, j2);
                return iconTintList;
            case 8:
                Object navigationOnClickListener = ji.setNavigationOnClickListener(t, j2);
                if (navigationOnClickListener instanceof String) {
                    equals = ((String) navigationOnClickListener).isEmpty();
                    break;
                } else if (navigationOnClickListener instanceof hY) {
                    equals = hY.setY.equals(navigationOnClickListener);
                    break;
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return ji.setNavigationOnClickListener(t, j2) != null;
            case 10:
                equals = hY.setY.equals(ji.setNavigationOnClickListener(t, j2));
                break;
            case 11:
                return ji.setOnLongClickListener(t, j2) != 0;
            case 12:
                return ji.setOnLongClickListener(t, j2) != 0;
            case 13:
                return ji.setOnLongClickListener(t, j2) != 0;
            case 14:
                return ji.setLayoutAnimation(t, j2) != 0;
            case 15:
                return ji.setOnLongClickListener(t, j2) != 0;
            case 16:
                return ji.setLayoutAnimation(t, j2) != 0;
            case 17:
                return ji.setNavigationOnClickListener(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !equals;
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda1(T t, int i, int i2) {
        return ji.setOnLongClickListener(t, (long) (this.MenuHostHelper$$ExternalSyntheticLambda1[i2 + 2] & 1048575)) == i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void MenuHostHelper$$ExternalSyntheticLambda1(T t, T t2, int i) {
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda1[i];
        if (MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t2, i2, i)) {
            long j = this.MenuHostHelper$$ExternalSyntheticLambda1[i + 1] & 1048575;
            Unsafe unsafe = setX;
            Object object = unsafe.getObject(t2, j);
            if (object == null) {
                StringBuilder sb = new StringBuilder("Source subfield ");
                sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1[i]);
                sb.append(" is present but null: ");
                sb.append(t2);
                throw new IllegalStateException(sb.toString());
            }
            iY iconTintList = setIconTintList(i);
            if (!MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i2, i)) {
                if (!setIconTintList(object)) {
                    unsafe.putObject(t, j, object);
                } else {
                    Object y = iconTintList.setY();
                    iconTintList.setIconTintList(y, object);
                    unsafe.putObject(t, j, y);
                }
                ji.setNavigationOnClickListener.setIconTintList.putInt(t, this.MenuHostHelper$$ExternalSyntheticLambda1[i + 2] & 1048575, i2);
                return;
            }
            Object object2 = unsafe.getObject(t, j);
            if (!setIconTintList(object2)) {
                Object y2 = iconTintList.setY();
                iconTintList.setIconTintList(y2, object2);
                unsafe.putObject(t, j, y2);
                object2 = y2;
            }
            iconTintList.setIconTintList(object2, object);
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(T t, int i) {
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda1[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        ji.setNavigationOnClickListener.setIconTintList.putInt(t, j, (1 << (i2 >>> 20)) | ji.setOnLongClickListener(t, j));
    }

    @Override // o.iY
    public final void setIconTintList(T t, T t2) {
        boolean iconTintList;
        boolean z = true;
        int i = 0;
        if (t == null || ((t instanceof AbstractC0239il) && (((AbstractC0239il) t).memoizedSerializedSize & Integer.MIN_VALUE) == 0)) {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder("Mutating immutable message: ");
            sb.append(t);
            throw new IllegalArgumentException(sb.toString());
        }
        while (true) {
            int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (i >= iArr.length) {
                iZ.setY(this.setTextScaleX, t, t2);
                if (this.setUnboundedRipple) {
                    iZ.setY(this.setNavigationOnClickListener, t, t2);
                    return;
                }
                return;
            }
            int i2 = iArr[i + 1];
            long j = i2 & 1048575;
            int i3 = iArr[i];
            switch ((i2 & 267386880) >>> 20) {
                case 0:
                    if (!setIconTintList((iH<T>) t2, i)) {
                        break;
                    } else {
                        ji.setY(t, j, ji.setUiOptions(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i);
                        break;
                    }
                case 1:
                    if (!setIconTintList((iH<T>) t2, i)) {
                        break;
                    } else {
                        ji.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0((Object) t, j, ji.setUnboundedRipple(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i);
                        break;
                    }
                case 2:
                    if (!setIconTintList((iH<T>) t2, i)) {
                        break;
                    } else {
                        ji.setNavigationOnClickListener.setIconTintList.putLong(t, j, ji.setLayoutAnimation(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i);
                        break;
                    }
                case 3:
                    if (!setIconTintList((iH<T>) t2, i)) {
                        break;
                    } else {
                        ji.setNavigationOnClickListener.setIconTintList.putLong(t, j, ji.setLayoutAnimation(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i);
                        break;
                    }
                case 4:
                    if (!setIconTintList((iH<T>) t2, i)) {
                        break;
                    } else {
                        ji.setNavigationOnClickListener.setIconTintList.putInt(t, j, ji.setOnLongClickListener(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i);
                        break;
                    }
                case 5:
                    if (!setIconTintList((iH<T>) t2, i)) {
                        break;
                    } else {
                        ji.setNavigationOnClickListener.setIconTintList.putLong(t, j, ji.setLayoutAnimation(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i);
                        break;
                    }
                case 6:
                    if (!setIconTintList((iH<T>) t2, i)) {
                        break;
                    } else {
                        ji.setNavigationOnClickListener.setIconTintList.putInt(t, j, ji.setOnLongClickListener(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i);
                        break;
                    }
                case 7:
                    if (!setIconTintList((iH<T>) t2, i)) {
                        break;
                    } else {
                        iconTintList = ji.setNavigationOnClickListener.setIconTintList(t2, j);
                        ji.setIconTintList(t, j, iconTintList);
                        MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i);
                        break;
                    }
                case 8:
                    if (!setIconTintList((iH<T>) t2, i)) {
                        break;
                    } else {
                        ji.setX(t, j, ji.setNavigationOnClickListener(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i);
                        break;
                    }
                case 9:
                    setIconTintList(t, t2, i);
                    break;
                case 10:
                    if (!setIconTintList((iH<T>) t2, i)) {
                        break;
                    } else {
                        ji.setX(t, j, ji.setNavigationOnClickListener(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i);
                        break;
                    }
                case 11:
                    if (!setIconTintList((iH<T>) t2, i)) {
                        break;
                    } else {
                        ji.setNavigationOnClickListener.setIconTintList.putInt(t, j, ji.setOnLongClickListener(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i);
                        break;
                    }
                case 12:
                    if (!setIconTintList((iH<T>) t2, i)) {
                        break;
                    } else {
                        ji.setNavigationOnClickListener.setIconTintList.putInt(t, j, ji.setOnLongClickListener(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i);
                        break;
                    }
                case 13:
                    if (!setIconTintList((iH<T>) t2, i)) {
                        break;
                    } else {
                        ji.setNavigationOnClickListener.setIconTintList.putInt(t, j, ji.setOnLongClickListener(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i);
                        break;
                    }
                case 14:
                    if (!setIconTintList((iH<T>) t2, i)) {
                        break;
                    } else {
                        ji.setNavigationOnClickListener.setIconTintList.putLong(t, j, ji.setLayoutAnimation(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i);
                        break;
                    }
                case 15:
                    if (!setIconTintList((iH<T>) t2, i)) {
                        break;
                    } else {
                        ji.setNavigationOnClickListener.setIconTintList.putInt(t, j, ji.setOnLongClickListener(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i);
                        break;
                    }
                case 16:
                    if (!setIconTintList((iH<T>) t2, i)) {
                        break;
                    } else {
                        ji.setNavigationOnClickListener.setIconTintList.putLong(t, j, ji.setLayoutAnimation(t2, j));
                        MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t, i);
                        break;
                    }
                case 17:
                    setIconTintList(t, t2, i);
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
                    this.setUiOptions.setY(t, t2, j);
                    break;
                case setExpandedTitleMargin.setY.setOrientation /* 50 */:
                    iZ.setX(this.setTextAlignment, t, t2, j);
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
                    if (!MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t2, i3, i)) {
                        break;
                    } else {
                        ji.setX(t, j, ji.setNavigationOnClickListener(t2, j));
                        ji.setNavigationOnClickListener.setIconTintList.putInt(t, this.MenuHostHelper$$ExternalSyntheticLambda1[i + 2] & 1048575, i3);
                        break;
                    }
                case 60:
                    MenuHostHelper$$ExternalSyntheticLambda1(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!MenuHostHelper$$ExternalSyntheticLambda1((iH<T>) t2, i3, i)) {
                        break;
                    } else {
                        ji.setX(t, j, ji.setNavigationOnClickListener(t2, j));
                        ji.setNavigationOnClickListener.setIconTintList.putInt(t, this.MenuHostHelper$$ExternalSyntheticLambda1[i + 2] & 1048575, i3);
                        break;
                    }
                case 68:
                    MenuHostHelper$$ExternalSyntheticLambda1(t, t2, i);
                    break;
            }
            i += 3;
        }
    }
}