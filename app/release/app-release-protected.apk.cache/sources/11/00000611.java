package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C0248iu;
import o.ij$MenuHostHelper$$ExternalSyntheticLambda0;
import o.jg;

/* renamed from: o.ij */
/* loaded from: classes.dex */
public final class C0237ij<T extends ij$MenuHostHelper$$ExternalSyntheticLambda0<T>> {
    private static final C0237ij setY = new C0237ij((byte) 0);
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    final iW<T, Object> MenuHostHelper$$ExternalSyntheticLambda1;
    boolean setX;

    private C0237ij() {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = (iW<T, Object>) new iW<FieldDescriptorType, Object>(16) { // from class: o.iW.5
            @Override // o.iW, java.util.AbstractMap, java.util.Map
            public final /* synthetic */ Object put(Object obj, Object obj2) {
                return super.put((Comparable) obj, obj2);
            }

            @Override // o.iW
            public final void MenuHostHelper$$ExternalSyntheticLambda0() {
                Iterable<Map.Entry> entrySet;
                if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
                    for (int i = 0; i < this.MenuHostHelper$$ExternalSyntheticLambda1.size(); i++) {
                        iW<K, V>.setX setx = this.MenuHostHelper$$ExternalSyntheticLambda1.get(i);
                        if (((ij$MenuHostHelper$$ExternalSyntheticLambda0) setx.getKey()).setIconTintList()) {
                            setx.setValue(Collections.unmodifiableList((List) setx.getValue()));
                        }
                    }
                    if (this.setIconTintList.isEmpty()) {
                        entrySet = iW$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0();
                    } else {
                        entrySet = this.setIconTintList.entrySet();
                    }
                    for (Map.Entry entry : entrySet) {
                        if (((ij$MenuHostHelper$$ExternalSyntheticLambda0) entry.getKey()).setIconTintList()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                super.MenuHostHelper$$ExternalSyntheticLambda0();
            }
        };
    }

    private C0237ij(iW<T, Object> iWVar) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = iWVar;
        MenuHostHelper$$ExternalSyntheticLambda1();
    }

    public static <T extends ij$MenuHostHelper$$ExternalSyntheticLambda0<T>> C0237ij<T> setX() {
        return setY;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.setX) {
            return;
        }
        for (int i = 0; i < this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1.size(); i++) {
            iW<K, Object>.setX setx = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1.get(i);
            if (setx.getValue() instanceof AbstractC0239il) {
                AbstractC0239il abstractC0239il = (AbstractC0239il) setx.getValue();
                iU.setX().setIconTintList(abstractC0239il.getClass()).MenuHostHelper$$ExternalSyntheticLambda1(abstractC0239il);
                abstractC0239il.memoizedSerializedSize &= Integer.MAX_VALUE;
            }
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0();
        this.setX = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0237ij) {
            return this.MenuHostHelper$$ExternalSyntheticLambda1.equals(((C0237ij) obj).MenuHostHelper$$ExternalSyntheticLambda1);
        }
        return false;
    }

    public final int hashCode() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> setY() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            return new C0248iu.setX(this.MenuHostHelper$$ExternalSyntheticLambda1.entrySet().iterator());
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda1.entrySet().iterator();
    }

    private void setY(T t, Object obj) {
        if (t.setIconTintList()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList<Object> arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            for (Object obj2 : arrayList) {
                MenuHostHelper$$ExternalSyntheticLambda1(t, obj2);
            }
            obj = arrayList;
        } else {
            MenuHostHelper$$ExternalSyntheticLambda1(t, obj);
        }
        if (obj instanceof C0248iu) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.put(t, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x001e, code lost:
        if ((r5 instanceof o.C0248iu) == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0028, code lost:
        if ((r5 instanceof o.ip$MenuHostHelper$$ExternalSyntheticLambda0) == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0031, code lost:
        if ((r5 instanceof byte[]) == false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void MenuHostHelper$$ExternalSyntheticLambda1(T r4, java.lang.Object r5) {
        /*
            o.jg$setIconTintList r0 = r4.MenuHostHelper$$ExternalSyntheticLambda0()
            o.C0243ip.setIconTintList(r5)
            int[] r1 = o.C0237ij.AnonymousClass2.setY
            o.jg$MenuHostHelper$$ExternalSyntheticLambda1 r0 = r0.setZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            r2 = 1
            switch(r0) {
                case 1: goto L43;
                case 2: goto L40;
                case 3: goto L3d;
                case 4: goto L3a;
                case 5: goto L37;
                case 6: goto L34;
                case 7: goto L2b;
                case 8: goto L22;
                case 9: goto L18;
                default: goto L16;
            }
        L16:
            r0 = 0
            goto L45
        L18:
            boolean r0 = r5 instanceof o.iJ
            if (r0 != 0) goto L20
            boolean r0 = r5 instanceof o.C0248iu
            if (r0 == 0) goto L16
        L20:
            r0 = 1
            goto L45
        L22:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L20
            boolean r0 = r5 instanceof o.ip$MenuHostHelper$$ExternalSyntheticLambda0
            if (r0 == 0) goto L16
            goto L20
        L2b:
            boolean r0 = r5 instanceof o.hY
            if (r0 != 0) goto L20
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L16
            goto L20
        L34:
            boolean r0 = r5 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r5 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r5 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r5 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r5 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
            return
        L48:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r3 = r4.setX()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r1] = r3
            o.jg$setIconTintList r4 = r4.MenuHostHelper$$ExternalSyntheticLambda0()
            o.jg$MenuHostHelper$$ExternalSyntheticLambda1 r4 = r4.setZ
            r0[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r0[r4] = r5
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0237ij.MenuHostHelper$$ExternalSyntheticLambda1(o.ij$MenuHostHelper$$ExternalSyntheticLambda0, java.lang.Object):void");
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        Iterable<Map.Entry> entrySet;
        for (int i = 0; i < this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1.size(); i++) {
            if (!setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1.get(i))) {
                return false;
            }
        }
        iW<T, Object> iWVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (iWVar.setIconTintList.isEmpty()) {
            entrySet = iW$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0();
        } else {
            entrySet = iWVar.setIconTintList.entrySet();
        }
        for (Map.Entry entry : entrySet) {
            if (!setIconTintList(entry)) {
                return false;
            }
        }
        return true;
    }

    private static <T extends ij$MenuHostHelper$$ExternalSyntheticLambda0<T>> boolean setIconTintList(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.setY() == jg$MenuHostHelper$$ExternalSyntheticLambda1.MESSAGE) {
            if (key.setIconTintList()) {
                for (Object obj : (List) entry.getValue()) {
                    if (!setY(obj)) {
                        return false;
                    }
                }
                return true;
            }
            return setY(entry.getValue());
        }
        return true;
    }

    private static boolean setY(Object obj) {
        if (obj instanceof iK) {
            return ((iK) obj).setTextScaleX();
        }
        if (obj instanceof C0248iu) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        byte[] value = entry.getValue();
        if (value instanceof C0248iu) {
            C0248iu c0248iu = (C0248iu) value;
            value = c0248iu.setX(c0248iu.setY);
        }
        if (!key.setIconTintList()) {
            if (key.setY() != jg$MenuHostHelper$$ExternalSyntheticLambda1.MESSAGE) {
                iW<T, Object> iWVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
                if (value instanceof byte[]) {
                    byte[] bArr = (byte[]) value;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    value = bArr2;
                }
                iWVar.put(key, value);
                return;
            }
            Object obj = this.MenuHostHelper$$ExternalSyntheticLambda1.get(key);
            if (obj instanceof C0248iu) {
                C0248iu c0248iu2 = (C0248iu) obj;
                obj = c0248iu2.setX(c0248iu2.setY);
            }
            if (obj == null) {
                iW<T, Object> iWVar2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                if (value instanceof byte[]) {
                    byte[] bArr3 = (byte[]) value;
                    byte[] bArr4 = new byte[bArr3.length];
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    value = bArr4;
                }
                iWVar2.put(key, value);
                return;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1.put(key, key.MenuHostHelper$$ExternalSyntheticLambda0(((iJ) obj).setLayoutDirection(), (iJ) value).ViewPager$SavedState$1());
            return;
        }
        Object obj2 = this.MenuHostHelper$$ExternalSyntheticLambda1.get(key);
        if (obj2 instanceof C0248iu) {
            C0248iu c0248iu3 = (C0248iu) obj2;
            obj2 = c0248iu3.setX(c0248iu3.setY);
        }
        if (obj2 == null) {
            obj2 = new ArrayList();
        }
        for (Object obj3 : (List) value) {
            List list = (List) obj2;
            if (obj3 instanceof byte[]) {
                byte[] bArr5 = (byte[]) obj3;
                byte[] bArr6 = new byte[bArr5.length];
                System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                obj3 = bArr6;
            }
            list.add(obj3);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.put(key, obj2);
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(hX hXVar, jg.setIconTintList seticontintlist, int i, Object obj) {
        if (seticontintlist != jg.setIconTintList.GROUP) {
            hXVar.setUiOptions(i, seticontintlist.setTextScaleX);
            switch (AnonymousClass2.setX[seticontintlist.ordinal()]) {
                case 1:
                    hXVar.MenuHostHelper$$ExternalSyntheticLambda1(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                    return;
                case 2:
                    hXVar.ViewPager$SavedState$1(Float.floatToRawIntBits(((Float) obj).floatValue()));
                    return;
                case 3:
                    hXVar.setIconTintList(((Long) obj).longValue());
                    return;
                case 4:
                    hXVar.setIconTintList(((Long) obj).longValue());
                    return;
                case 5:
                    hXVar.setTextAlignment(((Integer) obj).intValue());
                    return;
                case 6:
                    hXVar.MenuHostHelper$$ExternalSyntheticLambda1(((Long) obj).longValue());
                    return;
                case 7:
                    hXVar.ViewPager$SavedState$1(((Integer) obj).intValue());
                    return;
                case 8:
                    hXVar.setIconTintList(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                    return;
                case 9:
                    ((iJ) obj).setX(hXVar);
                    return;
                case 10:
                    hXVar.MenuHostHelper$$ExternalSyntheticLambda1((iJ) obj);
                    return;
                case 11:
                    if (obj instanceof hY) {
                        hXVar.MenuHostHelper$$ExternalSyntheticLambda0((hY) obj);
                        return;
                    } else {
                        hXVar.MenuHostHelper$$ExternalSyntheticLambda1((String) obj);
                        return;
                    }
                case 12:
                    if (obj instanceof hY) {
                        hXVar.MenuHostHelper$$ExternalSyntheticLambda0((hY) obj);
                        return;
                    }
                    byte[] bArr = (byte[]) obj;
                    hXVar.setIconTintList(bArr, bArr.length);
                    return;
                case 13:
                    hXVar.setMaxEms(((Integer) obj).intValue());
                    return;
                case 14:
                    hXVar.ViewPager$SavedState$1(((Integer) obj).intValue());
                    return;
                case 15:
                    hXVar.MenuHostHelper$$ExternalSyntheticLambda1(((Long) obj).longValue());
                    return;
                case 16:
                    int intValue = ((Integer) obj).intValue();
                    hXVar.setMaxEms((intValue << 1) ^ (intValue >> 31));
                    return;
                case 17:
                    long longValue = ((Long) obj).longValue();
                    hXVar.setIconTintList((longValue << 1) ^ (longValue >> 63));
                    return;
                case 18:
                    if (obj instanceof ip$MenuHostHelper$$ExternalSyntheticLambda0) {
                        hXVar.setTextAlignment(((ip$MenuHostHelper$$ExternalSyntheticLambda0) obj).MenuHostHelper$$ExternalSyntheticLambda1());
                        return;
                    } else {
                        hXVar.setTextAlignment(((Integer) obj).intValue());
                        return;
                    }
                default:
                    return;
            }
        }
        hXVar.setUiOptions(i, 3);
        ((iJ) obj).setX(hXVar);
        hXVar.setUiOptions(i, 4);
    }

    /* renamed from: o.ij$2 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] setX;
        static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[jg.setIconTintList.values().length];
            setX = iArr;
            try {
                iArr[jg.setIconTintList.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                setX[jg.setIconTintList.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                setX[jg.setIconTintList.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                setX[jg.setIconTintList.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                setX[jg.setIconTintList.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                setX[jg.setIconTintList.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                setX[jg.setIconTintList.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                setX[jg.setIconTintList.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                setX[jg.setIconTintList.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                setX[jg.setIconTintList.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                setX[jg.setIconTintList.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                setX[jg.setIconTintList.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                setX[jg.setIconTintList.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                setX[jg.setIconTintList.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                setX[jg.setIconTintList.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                setX[jg.setIconTintList.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                setX[jg.setIconTintList.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                setX[jg.setIconTintList.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[jg$MenuHostHelper$$ExternalSyntheticLambda1.values().length];
            setY = iArr2;
            try {
                iArr2[jg$MenuHostHelper$$ExternalSyntheticLambda1.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                setY[jg$MenuHostHelper$$ExternalSyntheticLambda1.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                setY[jg$MenuHostHelper$$ExternalSyntheticLambda1.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                setY[jg$MenuHostHelper$$ExternalSyntheticLambda1.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                setY[jg$MenuHostHelper$$ExternalSyntheticLambda1.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                setY[jg$MenuHostHelper$$ExternalSyntheticLambda1.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                setY[jg$MenuHostHelper$$ExternalSyntheticLambda1.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                setY[jg$MenuHostHelper$$ExternalSyntheticLambda1.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                setY[jg$MenuHostHelper$$ExternalSyntheticLambda1.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public static int setX(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.setY() == jg$MenuHostHelper$$ExternalSyntheticLambda1.MESSAGE && !key.setIconTintList() && !key.MenuHostHelper$$ExternalSyntheticLambda1()) {
            if (value instanceof C0248iu) {
                return hX.MenuHostHelper$$ExternalSyntheticLambda1(entry.getKey().setX(), (C0248iu) value);
            }
            return hX.setIconTintList(entry.getKey().setX(), (iJ) value);
        }
        return setX(key, value);
    }

    public static int setX(jg.setIconTintList seticontintlist, int i, Object obj) {
        int centerIfNoTextEnabled = hX.setCenterIfNoTextEnabled(i);
        if (seticontintlist == jg.setIconTintList.GROUP) {
            centerIfNoTextEnabled <<= 1;
        }
        return centerIfNoTextEnabled + setY(seticontintlist, obj);
    }

    private static int setY(jg.setIconTintList seticontintlist, Object obj) {
        int x;
        switch (AnonymousClass2.setX[seticontintlist.ordinal()]) {
            case 1:
                Double d = (Double) obj;
                return hX.setX();
            case 2:
                Float f = (Float) obj;
                return hX.setUnboundedRipple();
            case 3:
                x = hX.setX(((Long) obj).longValue());
                return x;
            case 4:
                return hX.setX(((Long) obj).longValue());
            case 5:
                return hX.setLayoutAnimation(((Integer) obj).intValue());
            case 6:
                Long l = (Long) obj;
                return hX.MenuHostHelper$$ExternalSyntheticLambda0();
            case 7:
                Integer num = (Integer) obj;
                return hX.MenuHostHelper$$ExternalSyntheticLambda1();
            case 8:
                Boolean bool = (Boolean) obj;
                return hX.setY();
            case 9:
                return hX.setY((iJ) obj);
            case 10:
                if (obj instanceof C0248iu) {
                    return hX.setY((C0248iu) obj);
                }
                return hX.setIconTintList((iJ) obj);
            case 11:
                if (obj instanceof hY) {
                    return hX.setIconTintList((hY) obj);
                }
                return hX.MenuHostHelper$$ExternalSyntheticLambda0((String) obj);
            case 12:
                if (obj instanceof hY) {
                    return hX.setIconTintList((hY) obj);
                }
                return hX.MenuHostHelper$$ExternalSyntheticLambda1((byte[]) obj);
            case 13:
                return hX.setChipCornerRadius(((Integer) obj).intValue());
            case 14:
                Integer num2 = (Integer) obj;
                return hX.setLayoutAnimation();
            case 15:
                Long l2 = (Long) obj;
                return hX.setOnLongClickListener();
            case 16:
                return hX.setIconSize(((Integer) obj).intValue());
            case 17:
                return hX.setY(((Long) obj).longValue());
            case 18:
                if (obj instanceof ip$MenuHostHelper$$ExternalSyntheticLambda0) {
                    return hX.MenuHostHelper$$ExternalSyntheticLambda1(((ip$MenuHostHelper$$ExternalSyntheticLambda0) obj).MenuHostHelper$$ExternalSyntheticLambda1());
                }
                return hX.MenuHostHelper$$ExternalSyntheticLambda1(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int setX(ij$MenuHostHelper$$ExternalSyntheticLambda0<?> ij_menuhosthelper__externalsyntheticlambda0, Object obj) {
        int centerIfNoTextEnabled;
        int y;
        jg.setIconTintList MenuHostHelper$$ExternalSyntheticLambda0 = ij_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0();
        int x = ij_menuhosthelper__externalsyntheticlambda0.setX();
        if (ij_menuhosthelper__externalsyntheticlambda0.setIconTintList()) {
            int i = 0;
            if (ij_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1()) {
                for (Object obj2 : (List) obj) {
                    i += setY(MenuHostHelper$$ExternalSyntheticLambda0, obj2);
                }
                centerIfNoTextEnabled = hX.setCenterIfNoTextEnabled(x) + i;
                y = hX.setChipCornerRadius(i);
            } else {
                for (Object obj3 : (List) obj) {
                    int centerIfNoTextEnabled2 = hX.setCenterIfNoTextEnabled(x);
                    if (MenuHostHelper$$ExternalSyntheticLambda0 == jg.setIconTintList.GROUP) {
                        centerIfNoTextEnabled2 <<= 1;
                    }
                    i += centerIfNoTextEnabled2 + setY(MenuHostHelper$$ExternalSyntheticLambda0, obj3);
                }
                return i;
            }
        } else {
            centerIfNoTextEnabled = hX.setCenterIfNoTextEnabled(x);
            if (MenuHostHelper$$ExternalSyntheticLambda0 == jg.setIconTintList.GROUP) {
                centerIfNoTextEnabled <<= 1;
            }
            y = setY(MenuHostHelper$$ExternalSyntheticLambda0, obj);
        }
        return centerIfNoTextEnabled + y;
    }

    private C0237ij(byte b) {
        this(new iW<FieldDescriptorType, Object>(0) { // from class: o.iW.5
            @Override // o.iW, java.util.AbstractMap, java.util.Map
            public final /* synthetic */ Object put(Object obj, Object obj2) {
                return super.put((Comparable) obj, obj2);
            }

            @Override // o.iW
            public final void MenuHostHelper$$ExternalSyntheticLambda0() {
                Iterable<Map.Entry> entrySet;
                if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
                    for (int i = 0; i < this.MenuHostHelper$$ExternalSyntheticLambda1.size(); i++) {
                        iW<K, V>.setX setx = this.MenuHostHelper$$ExternalSyntheticLambda1.get(i);
                        if (((ij$MenuHostHelper$$ExternalSyntheticLambda0) setx.getKey()).setIconTintList()) {
                            setx.setValue(Collections.unmodifiableList((List) setx.getValue()));
                        }
                    }
                    if (this.setIconTintList.isEmpty()) {
                        entrySet = iW$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0();
                    } else {
                        entrySet = this.setIconTintList.entrySet();
                    }
                    for (Map.Entry entry : entrySet) {
                        if (((ij$MenuHostHelper$$ExternalSyntheticLambda0) entry.getKey()).setIconTintList()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                super.MenuHostHelper$$ExternalSyntheticLambda0();
            }
        });
        MenuHostHelper$$ExternalSyntheticLambda1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setIconTintList */
    public final C0237ij<T> clone() {
        Iterable<Map.Entry> entrySet;
        C0237ij<T> c0237ij = (C0237ij<T>) new C0237ij();
        for (int i = 0; i < this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1.size(); i++) {
            iW<K, Object>.setX setx = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1.get(i);
            c0237ij.setY((C0237ij<T>) ((ij$MenuHostHelper$$ExternalSyntheticLambda0) setx.getKey()), setx.getValue());
        }
        iW<T, Object> iWVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (iWVar.setIconTintList.isEmpty()) {
            entrySet = iW$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0();
        } else {
            entrySet = iWVar.setIconTintList.entrySet();
        }
        for (Map.Entry entry : entrySet) {
            c0237ij.setY((C0237ij<T>) ((ij$MenuHostHelper$$ExternalSyntheticLambda0) entry.getKey()), entry.getValue());
        }
        c0237ij.MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        return c0237ij;
    }
}