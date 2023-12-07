package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.RemoteConfigRegistrar;
import o.RemoteConfigRegistrar.setY;
import o.setCloseIconVisible;
import o.setPromptId;
import o.setViewCacheExtension;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class RemoteConfigRegistrar<T extends setY<T>> {
    private static final RemoteConfigRegistrar MenuHostHelper$$ExternalSyntheticLambda1 = new RemoteConfigRegistrar((byte) 0);
    boolean setIconTintList;
    final setPromptId<T, Object> setX;
    boolean setY;

    /* loaded from: classes.dex */
    public interface setY<T extends setY<T>> extends Comparable<T> {
        setCloseIconVisible.setIconTintList MenuHostHelper$$ExternalSyntheticLambda0();

        int MenuHostHelper$$ExternalSyntheticLambda1();

        boolean setIconTintList();

        setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1 setX();

        setDrawingCacheQuality$MenuHostHelper$$ExternalSyntheticLambda0 setY(setDrawingCacheQuality$MenuHostHelper$$ExternalSyntheticLambda0 setdrawingcachequality_menuhosthelper__externalsyntheticlambda0, setDrawingCacheQuality setdrawingcachequality);

        boolean setY();
    }

    private RemoteConfigRegistrar() {
        this.setX = (setPromptId<T, Object>) new setPromptId<FieldDescriptorType, Object>(16) { // from class: o.setPromptId.3
            @Override // o.setPromptId, java.util.AbstractMap, java.util.Map
            public final /* synthetic */ Object put(Object obj, Object obj2) {
                return super.put((RemoteConfigRegistrar.setY) obj, obj2);
            }

            @Override // o.setPromptId
            public final void setIconTintList() {
                Iterable<Map.Entry> entrySet;
                if (!this.setY) {
                    for (int i = 0; i < this.setIconTintList.size(); i++) {
                        setPromptId<K, V>.setY sety = this.setIconTintList.get(i);
                        if (((RemoteConfigRegistrar.setY) sety.getKey()).setY()) {
                            sety.setValue(Collections.unmodifiableList((List) sety.getValue()));
                        }
                    }
                    if (this.MenuHostHelper$$ExternalSyntheticLambda0.isEmpty()) {
                        entrySet = setX.setY();
                    } else {
                        entrySet = this.MenuHostHelper$$ExternalSyntheticLambda0.entrySet();
                    }
                    for (Map.Entry entry : entrySet) {
                        if (((RemoteConfigRegistrar.setY) entry.getKey()).setY()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                super.setIconTintList();
            }
        };
    }

    private RemoteConfigRegistrar(setPromptId<T, Object> setpromptid) {
        this.setX = setpromptid;
        if (this.setIconTintList) {
            return;
        }
        setpromptid.setIconTintList();
        this.setIconTintList = true;
    }

    public static <T extends setY<T>> RemoteConfigRegistrar<T> setIconTintList() {
        return MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RemoteConfigRegistrar) {
            return this.setX.equals(((RemoteConfigRegistrar) obj).setX);
        }
        return false;
    }

    public final int hashCode() {
        return this.setX.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> setY() {
        if (this.setY) {
            return new setIconEndPadding$MenuHostHelper$$ExternalSyntheticLambda1(this.setX.entrySet().iterator());
        }
        return this.setX.entrySet().iterator();
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(T t, Object obj) {
        if (t.setY()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList<Object> arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            for (Object obj2 : arrayList) {
                setX(t.setX(), obj2);
            }
            obj = arrayList;
        } else {
            setX(t.setX(), obj);
        }
        if (obj instanceof setIconEndPadding) {
            this.setY = true;
        }
        this.setX.put(t, obj);
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        Iterable<Map.Entry> entrySet;
        for (int i = 0; i < this.setX.setIconTintList.size(); i++) {
            if (!setIconTintList(this.setX.setIconTintList.get(i))) {
                return false;
            }
        }
        setPromptId<T, Object> setpromptid = this.setX;
        if (setpromptid.MenuHostHelper$$ExternalSyntheticLambda0.isEmpty()) {
            entrySet = setPromptId.setX.setY();
        } else {
            entrySet = setpromptid.MenuHostHelper$$ExternalSyntheticLambda0.entrySet();
        }
        for (Map.Entry entry : entrySet) {
            if (!setIconTintList(entry)) {
                return false;
            }
        }
        return true;
    }

    private static <T extends setY<T>> boolean setIconTintList(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.MenuHostHelper$$ExternalSyntheticLambda0() == setCloseIconVisible.setIconTintList.MESSAGE) {
            if (key.setY()) {
                for (setDrawingCacheQuality setdrawingcachequality : (List) entry.getValue()) {
                    if (!setdrawingcachequality.ViewPager$SavedState$1()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof setDrawingCacheQuality) {
                    if (!((setDrawingCacheQuality) value).ViewPager$SavedState$1()) {
                        return false;
                    }
                } else if (value instanceof setIconEndPadding) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        byte[] value = entry.getValue();
        if (value instanceof setIconEndPadding) {
            setIconEndPadding seticonendpadding = (setIconEndPadding) value;
            value = seticonendpadding.MenuHostHelper$$ExternalSyntheticLambda0(seticonendpadding.setIconTintList);
        }
        if (!key.setY()) {
            if (key.MenuHostHelper$$ExternalSyntheticLambda0() != setCloseIconVisible.setIconTintList.MESSAGE) {
                setPromptId<T, Object> setpromptid = this.setX;
                if (value instanceof byte[]) {
                    byte[] bArr = (byte[]) value;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    value = bArr2;
                }
                setpromptid.put(key, value);
                return;
            }
            Object obj = this.setX.get(key);
            if (obj instanceof setIconEndPadding) {
                setIconEndPadding seticonendpadding2 = (setIconEndPadding) obj;
                obj = seticonendpadding2.MenuHostHelper$$ExternalSyntheticLambda0(seticonendpadding2.setIconTintList);
            }
            if (obj == null) {
                setPromptId<T, Object> setpromptid2 = this.setX;
                if (value instanceof byte[]) {
                    byte[] bArr3 = (byte[]) value;
                    byte[] bArr4 = new byte[bArr3.length];
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    value = bArr4;
                }
                setpromptid2.put(key, value);
                return;
            }
            this.setX.put(key, key.setY(((setDrawingCacheQuality) obj).setTextScaleX(), (setDrawingCacheQuality) value).setIconTintList());
            return;
        }
        Object obj2 = this.setX.get(key);
        if (obj2 instanceof setIconEndPadding) {
            setIconEndPadding seticonendpadding3 = (setIconEndPadding) obj2;
            obj2 = seticonendpadding3.MenuHostHelper$$ExternalSyntheticLambda0(seticonendpadding3.setIconTintList);
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
        this.setX.put(key, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setIconTintList(setMenuPrepared setmenuprepared, setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1 setcloseiconvisible_menuhosthelper__externalsyntheticlambda1, int i, Object obj) {
        if (setcloseiconvisible_menuhosthelper__externalsyntheticlambda1 != setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.GROUP) {
            setmenuprepared.setOnLongClickListener(i, setcloseiconvisible_menuhosthelper__externalsyntheticlambda1.setAnimationFromJson);
            switch (AnonymousClass3.MenuHostHelper$$ExternalSyntheticLambda0[setcloseiconvisible_menuhosthelper__externalsyntheticlambda1.ordinal()]) {
                case 1:
                    setmenuprepared.setIconTintList(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                    return;
                case 2:
                    setmenuprepared.setTextScaleX(Float.floatToRawIntBits(((Float) obj).floatValue()));
                    return;
                case 3:
                    setmenuprepared.setY(((Long) obj).longValue());
                    return;
                case 4:
                    setmenuprepared.setY(((Long) obj).longValue());
                    return;
                case 5:
                    setmenuprepared.setZ(((Integer) obj).intValue());
                    return;
                case 6:
                    setmenuprepared.setIconTintList(((Long) obj).longValue());
                    return;
                case 7:
                    setmenuprepared.setTextScaleX(((Integer) obj).intValue());
                    return;
                case 8:
                    setmenuprepared.MenuHostHelper$$ExternalSyntheticLambda0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                    return;
                case 9:
                    ((setDrawingCacheQuality) obj).setIconTintList(setmenuprepared);
                    return;
                case 10:
                    setmenuprepared.MenuHostHelper$$ExternalSyntheticLambda1((setDrawingCacheQuality) obj);
                    return;
                case 11:
                    if (obj instanceof setSpeed) {
                        setmenuprepared.MenuHostHelper$$ExternalSyntheticLambda0((setSpeed) obj);
                        return;
                    } else {
                        setmenuprepared.setY((String) obj);
                        return;
                    }
                case 12:
                    if (obj instanceof setSpeed) {
                        setmenuprepared.MenuHostHelper$$ExternalSyntheticLambda0((setSpeed) obj);
                        return;
                    }
                    byte[] bArr = (byte[]) obj;
                    setmenuprepared.setIconTintList(bArr, bArr.length);
                    return;
                case 13:
                    setmenuprepared.setAnimationFromJson(((Integer) obj).intValue());
                    return;
                case 14:
                    setmenuprepared.setTextScaleX(((Integer) obj).intValue());
                    return;
                case 15:
                    setmenuprepared.setIconTintList(((Long) obj).longValue());
                    return;
                case 16:
                    int intValue = ((Integer) obj).intValue();
                    setmenuprepared.setAnimationFromJson((intValue << 1) ^ (intValue >> 31));
                    return;
                case 17:
                    long longValue = ((Long) obj).longValue();
                    setmenuprepared.setY((longValue << 1) ^ (longValue >> 63));
                    return;
                case 18:
                    if (obj instanceof setViewCacheExtension.setX) {
                        setmenuprepared.setZ(((setViewCacheExtension.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0());
                        return;
                    } else {
                        setmenuprepared.setZ(((Integer) obj).intValue());
                        return;
                    }
                default:
                    return;
            }
        }
        setmenuprepared.setOnLongClickListener(i, 3);
        ((setDrawingCacheQuality) obj).setIconTintList(setmenuprepared);
        setmenuprepared.setOnLongClickListener(i, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.RemoteConfigRegistrar$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] MenuHostHelper$$ExternalSyntheticLambda0;
        static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.values().length];
            MenuHostHelper$$ExternalSyntheticLambda0 = iArr;
            try {
                iArr[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[setCloseIconVisible.setIconTintList.values().length];
            setY = iArr2;
            try {
                iArr2[setCloseIconVisible.setIconTintList.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                setY[setCloseIconVisible.setIconTintList.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                setY[setCloseIconVisible.setIconTintList.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                setY[setCloseIconVisible.setIconTintList.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                setY[setCloseIconVisible.setIconTintList.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                setY[setCloseIconVisible.setIconTintList.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                setY[setCloseIconVisible.setIconTintList.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                setY[setCloseIconVisible.setIconTintList.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                setY[setCloseIconVisible.setIconTintList.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int MenuHostHelper$$ExternalSyntheticLambda0(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.MenuHostHelper$$ExternalSyntheticLambda0() == setCloseIconVisible.setIconTintList.MESSAGE && !key.setY() && !key.setIconTintList()) {
            if (value instanceof setIconEndPadding) {
                return setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(entry.getKey().MenuHostHelper$$ExternalSyntheticLambda1(), (setIconEndPadding) value);
            }
            return setMenuPrepared.setIconTintList(entry.getKey().MenuHostHelper$$ExternalSyntheticLambda1(), (setDrawingCacheQuality) value);
        }
        return setY(key, value);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setY(setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1 setcloseiconvisible_menuhosthelper__externalsyntheticlambda1, int i, Object obj) {
        int centerIfNoTextEnabled;
        centerIfNoTextEnabled = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i, 0));
        if (setcloseiconvisible_menuhosthelper__externalsyntheticlambda1 == setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.GROUP) {
            centerIfNoTextEnabled <<= 1;
        }
        return centerIfNoTextEnabled + MenuHostHelper$$ExternalSyntheticLambda1(setcloseiconvisible_menuhosthelper__externalsyntheticlambda1, obj);
    }

    private static int MenuHostHelper$$ExternalSyntheticLambda1(setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1 setcloseiconvisible_menuhosthelper__externalsyntheticlambda1, Object obj) {
        int x;
        int x2;
        switch (AnonymousClass3.MenuHostHelper$$ExternalSyntheticLambda0[setcloseiconvisible_menuhosthelper__externalsyntheticlambda1.ordinal()]) {
            case 1:
                Double d = (Double) obj;
                return setMenuPrepared.setIconTintList();
            case 2:
                Float f = (Float) obj;
                return setMenuPrepared.setUnboundedRipple();
            case 3:
                x = setMenuPrepared.setX(((Long) obj).longValue());
                return x;
            case 4:
                return setMenuPrepared.setX(((Long) obj).longValue());
            case 5:
                return setMenuPrepared.setUnboundedRipple(((Integer) obj).intValue());
            case 6:
                Long l = (Long) obj;
                return setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0();
            case 7:
                Integer num = (Integer) obj;
                return setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda1();
            case 8:
                Boolean bool = (Boolean) obj;
                return setMenuPrepared.setX();
            case 9:
                return setMenuPrepared.setIconTintList((setDrawingCacheQuality) obj);
            case 10:
                if (obj instanceof setIconEndPadding) {
                    return setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0((setIconEndPadding) obj);
                }
                return setMenuPrepared.setX((setDrawingCacheQuality) obj);
            case 11:
                if (obj instanceof setSpeed) {
                    return setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda1((setSpeed) obj);
                }
                return setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0((String) obj);
            case 12:
                if (obj instanceof setSpeed) {
                    return setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda1((setSpeed) obj);
                }
                return setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda1((byte[]) obj);
            case 13:
                return setMenuPrepared.setCenterIfNoTextEnabled(((Integer) obj).intValue());
            case 14:
                Integer num2 = (Integer) obj;
                return setMenuPrepared.setLayoutAnimation();
            case 15:
                Long l2 = (Long) obj;
                return setMenuPrepared.setOnLongClickListener();
            case 16:
                return setMenuPrepared.setChipCornerRadius(((Integer) obj).intValue());
            case 17:
                x2 = setMenuPrepared.setX((r1 << 1) ^ (((Long) obj).longValue() >> 63));
                return x2;
            case 18:
                if (obj instanceof setViewCacheExtension.setX) {
                    return setMenuPrepared.setX(((setViewCacheExtension.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0());
                }
                return setMenuPrepared.setX(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int setY(setY<?> sety, Object obj) {
        int centerIfNoTextEnabled;
        int MenuHostHelper$$ExternalSyntheticLambda12;
        int centerIfNoTextEnabled2;
        int centerIfNoTextEnabled3;
        setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1 x = sety.setX();
        int MenuHostHelper$$ExternalSyntheticLambda13 = sety.MenuHostHelper$$ExternalSyntheticLambda1();
        if (!sety.setY()) {
            centerIfNoTextEnabled = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(MenuHostHelper$$ExternalSyntheticLambda13, 0));
            if (x == setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.GROUP) {
                centerIfNoTextEnabled <<= 1;
            }
            MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(x, obj);
        } else {
            int i = 0;
            if (sety.setIconTintList()) {
                for (Object obj2 : (List) obj) {
                    i += MenuHostHelper$$ExternalSyntheticLambda1(x, obj2);
                }
                centerIfNoTextEnabled3 = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(MenuHostHelper$$ExternalSyntheticLambda13, 0));
                centerIfNoTextEnabled = centerIfNoTextEnabled3 + i;
                MenuHostHelper$$ExternalSyntheticLambda12 = setMenuPrepared.setNavigationOnClickListener(i);
            } else {
                for (Object obj3 : (List) obj) {
                    centerIfNoTextEnabled2 = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(MenuHostHelper$$ExternalSyntheticLambda13, 0));
                    if (x == setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1.GROUP) {
                        centerIfNoTextEnabled2 <<= 1;
                    }
                    i += centerIfNoTextEnabled2 + MenuHostHelper$$ExternalSyntheticLambda1(x, obj3);
                }
                return i;
            }
        }
        return centerIfNoTextEnabled + MenuHostHelper$$ExternalSyntheticLambda12;
    }

    private RemoteConfigRegistrar(byte b) {
        this(new setPromptId<FieldDescriptorType, Object>(0) { // from class: o.setPromptId.3
            @Override // o.setPromptId, java.util.AbstractMap, java.util.Map
            public final /* synthetic */ Object put(Object obj, Object obj2) {
                return super.put((RemoteConfigRegistrar.setY) obj, obj2);
            }

            @Override // o.setPromptId
            public final void setIconTintList() {
                Iterable<Map.Entry> entrySet;
                if (!this.setY) {
                    for (int i = 0; i < this.setIconTintList.size(); i++) {
                        setPromptId<K, V>.setY sety = this.setIconTintList.get(i);
                        if (((RemoteConfigRegistrar.setY) sety.getKey()).setY()) {
                            sety.setValue(Collections.unmodifiableList((List) sety.getValue()));
                        }
                    }
                    if (this.MenuHostHelper$$ExternalSyntheticLambda0.isEmpty()) {
                        entrySet = setX.setY();
                    } else {
                        entrySet = this.MenuHostHelper$$ExternalSyntheticLambda0.entrySet();
                    }
                    for (Map.Entry entry : entrySet) {
                        if (((RemoteConfigRegistrar.setY) entry.getKey()).setY()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                super.setIconTintList();
            }
        });
        if (this.setIconTintList) {
            return;
        }
        this.setX.setIconTintList();
        this.setIconTintList = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        if ((r3 instanceof o.setViewCacheExtension.setX) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
        if ((r3 instanceof byte[]) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        if ((r3 instanceof o.setIconEndPadding) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void setX(o.setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1 r2, java.lang.Object r3) {
        /*
            o.setViewCacheExtension.setIconTintList(r3)
            int[] r0 = o.RemoteConfigRegistrar.AnonymousClass3.setY
            o.setCloseIconVisible$setIconTintList r2 = r2.setZ
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 0
            r1 = 1
            switch(r2) {
                case 1: goto L3e;
                case 2: goto L3b;
                case 3: goto L38;
                case 4: goto L35;
                case 5: goto L32;
                case 6: goto L2f;
                case 7: goto L26;
                case 8: goto L1d;
                case 9: goto L13;
                default: goto L12;
            }
        L12:
            goto L40
        L13:
            boolean r2 = r3 instanceof o.setDrawingCacheQuality
            if (r2 != 0) goto L1b
            boolean r2 = r3 instanceof o.setIconEndPadding
            if (r2 == 0) goto L40
        L1b:
            r0 = 1
            goto L40
        L1d:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L1b
            boolean r2 = r3 instanceof o.setViewCacheExtension.setX
            if (r2 == 0) goto L40
            goto L1b
        L26:
            boolean r2 = r3 instanceof o.setSpeed
            if (r2 != 0) goto L1b
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L40
            goto L1b
        L2f:
            boolean r0 = r3 instanceof java.lang.String
            goto L40
        L32:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L40
        L35:
            boolean r0 = r3 instanceof java.lang.Double
            goto L40
        L38:
            boolean r0 = r3 instanceof java.lang.Float
            goto L40
        L3b:
            boolean r0 = r3 instanceof java.lang.Long
            goto L40
        L3e:
            boolean r0 = r3 instanceof java.lang.Integer
        L40:
            if (r0 == 0) goto L43
            return
        L43:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RemoteConfigRegistrar.setX(o.setCloseIconVisible$MenuHostHelper$$ExternalSyntheticLambda1, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setX */
    public final RemoteConfigRegistrar<T> clone() {
        Iterable<Map.Entry> entrySet;
        RemoteConfigRegistrar<T> remoteConfigRegistrar = (RemoteConfigRegistrar<T>) new RemoteConfigRegistrar();
        for (int i = 0; i < this.setX.setIconTintList.size(); i++) {
            setPromptId<K, Object>.setY sety = this.setX.setIconTintList.get(i);
            remoteConfigRegistrar.MenuHostHelper$$ExternalSyntheticLambda0((setY) sety.getKey(), sety.getValue());
        }
        setPromptId<T, Object> setpromptid = this.setX;
        if (setpromptid.MenuHostHelper$$ExternalSyntheticLambda0.isEmpty()) {
            entrySet = setPromptId.setX.setY();
        } else {
            entrySet = setpromptid.MenuHostHelper$$ExternalSyntheticLambda0.entrySet();
        }
        for (Map.Entry entry : entrySet) {
            remoteConfigRegistrar.MenuHostHelper$$ExternalSyntheticLambda0((setY) entry.getKey(), entry.getValue());
        }
        remoteConfigRegistrar.setY = this.setY;
        return remoteConfigRegistrar;
    }
}