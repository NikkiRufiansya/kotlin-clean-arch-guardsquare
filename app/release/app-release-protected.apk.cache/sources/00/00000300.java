package o;

import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import o.bH;

/* loaded from: classes.dex */
public final class bO implements InterfaceC0065bz {
    private static final C0056bq MenuHostHelper$$ExternalSyntheticLambda0;
    private static final InterfaceC0057br<Map.Entry<Object, Object>> MenuHostHelper$$ExternalSyntheticLambda1;
    private static final C0056bq setIconTintList;
    private static final Charset setY = Charset.forName("UTF-8");
    private final bL setLayoutAnimation = new bL(this);
    private final Map<Class<?>, InterfaceC0063bx<?>> setNavigationOnClickListener;
    private OutputStream setOnLongClickListener;
    private final InterfaceC0057br<Object> setUiOptions;
    final Map<Class<?>, InterfaceC0057br<?>> setX;

    static {
        bq$MenuHostHelper$$ExternalSyntheticLambda1 bq_menuhosthelper__externalsyntheticlambda1 = new bq$MenuHostHelper$$ExternalSyntheticLambda1("key");
        bF MenuHostHelper$$ExternalSyntheticLambda12 = bF.MenuHostHelper$$ExternalSyntheticLambda1();
        MenuHostHelper$$ExternalSyntheticLambda12.setIconTintList = 1;
        MenuHostHelper$$ExternalSyntheticLambda0 = bq_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda12.setIconTintList()).setX();
        bq$MenuHostHelper$$ExternalSyntheticLambda1 bq_menuhosthelper__externalsyntheticlambda12 = new bq$MenuHostHelper$$ExternalSyntheticLambda1("value");
        bF MenuHostHelper$$ExternalSyntheticLambda13 = bF.MenuHostHelper$$ExternalSyntheticLambda1();
        MenuHostHelper$$ExternalSyntheticLambda13.setIconTintList = 2;
        setIconTintList = bq_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda13.setIconTintList()).setX();
        MenuHostHelper$$ExternalSyntheticLambda1 = new InterfaceC0057br() { // from class: o.bM
            @Override // o.InterfaceC0058bs
            public final void setY(Object obj, InterfaceC0065bz interfaceC0065bz) {
                bO.MenuHostHelper$$ExternalSyntheticLambda0((Map.Entry) obj, interfaceC0065bz);
            }
        };
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(Map.Entry entry, InterfaceC0065bz interfaceC0065bz) {
        interfaceC0065bz.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0, entry.getKey());
        interfaceC0065bz.setIconTintList(setIconTintList, entry.getValue());
    }

    public bO(OutputStream outputStream, Map<Class<?>, InterfaceC0057br<?>> map, Map<Class<?>, InterfaceC0063bx<?>> map2, InterfaceC0057br<Object> interfaceC0057br) {
        this.setOnLongClickListener = outputStream;
        this.setX = map;
        this.setNavigationOnClickListener = map2;
        this.setUiOptions = interfaceC0057br;
    }

    @Override // o.InterfaceC0065bz
    public final InterfaceC0065bz setIconTintList(C0056bq c0056bq, Object obj) {
        return setX(c0056bq, obj, true);
    }

    public final InterfaceC0065bz setX(C0056bq c0056bq, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            MenuHostHelper$$ExternalSyntheticLambda1((setX(c0056bq) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(setY);
            MenuHostHelper$$ExternalSyntheticLambda1(bytes.length);
            this.setOnLongClickListener.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                setX(c0056bq, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1, c0056bq, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return MenuHostHelper$$ExternalSyntheticLambda1(c0056bq, ((Double) obj).doubleValue(), z);
        } else {
            if (obj instanceof Float) {
                return MenuHostHelper$$ExternalSyntheticLambda1(c0056bq, ((Float) obj).floatValue(), z);
            }
            if (obj instanceof Number) {
                return MenuHostHelper$$ExternalSyntheticLambda0(c0056bq, ((Number) obj).longValue(), z);
            }
            if (!(obj instanceof Boolean)) {
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    if (z && bArr.length == 0) {
                        return this;
                    }
                    MenuHostHelper$$ExternalSyntheticLambda1((setX(c0056bq) << 3) | 2);
                    MenuHostHelper$$ExternalSyntheticLambda1(bArr.length);
                    this.setOnLongClickListener.write(bArr);
                    return this;
                }
                InterfaceC0057br<?> interfaceC0057br = this.setX.get(obj.getClass());
                if (interfaceC0057br != null) {
                    return MenuHostHelper$$ExternalSyntheticLambda0(interfaceC0057br, c0056bq, obj, z);
                }
                InterfaceC0063bx<?> interfaceC0063bx = this.setNavigationOnClickListener.get(obj.getClass());
                if (interfaceC0063bx != null) {
                    return MenuHostHelper$$ExternalSyntheticLambda1(interfaceC0063bx, c0056bq, obj, z);
                }
                if (!(obj instanceof bI)) {
                    if (!(obj instanceof Enum)) {
                        return MenuHostHelper$$ExternalSyntheticLambda0(this.setUiOptions, c0056bq, obj, z);
                    }
                    return setY(c0056bq, ((Enum) obj).ordinal(), true);
                }
                return setY(c0056bq, ((bI) obj).setX(), true);
            }
            return setY(c0056bq, ((Boolean) obj).booleanValue() ? 1 : 0, z);
        }
    }

    @Override // o.InterfaceC0065bz
    public final InterfaceC0065bz MenuHostHelper$$ExternalSyntheticLambda1(C0056bq c0056bq, double d) {
        return MenuHostHelper$$ExternalSyntheticLambda1(c0056bq, d, true);
    }

    private InterfaceC0065bz MenuHostHelper$$ExternalSyntheticLambda1(C0056bq c0056bq, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        MenuHostHelper$$ExternalSyntheticLambda1((setX(c0056bq) << 3) | 1);
        this.setOnLongClickListener.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
        return this;
    }

    private InterfaceC0065bz MenuHostHelper$$ExternalSyntheticLambda1(C0056bq c0056bq, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        MenuHostHelper$$ExternalSyntheticLambda1((setX(c0056bq) << 3) | 5);
        this.setOnLongClickListener.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(f).array());
        return this;
    }

    /* renamed from: o.bO$4 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[bH.setY.values().length];
            setX = iArr;
            try {
                iArr[bH.setY.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                setX[bH.setY.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                setX[bH.setY.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final bO setY(C0056bq c0056bq, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        bH MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0(c0056bq);
        int i2 = AnonymousClass4.setX[MenuHostHelper$$ExternalSyntheticLambda02.setX().ordinal()];
        if (i2 == 1) {
            MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda02.setY() << 3);
            MenuHostHelper$$ExternalSyntheticLambda1(i);
        } else if (i2 == 2) {
            MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda02.setY() << 3);
            MenuHostHelper$$ExternalSyntheticLambda1((i << 1) ^ (i >> 31));
        } else if (i2 == 3) {
            MenuHostHelper$$ExternalSyntheticLambda1((MenuHostHelper$$ExternalSyntheticLambda02.setY() << 3) | 5);
            this.setOnLongClickListener.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
        return this;
    }

    private bO MenuHostHelper$$ExternalSyntheticLambda0(C0056bq c0056bq, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        bH MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0(c0056bq);
        int i = AnonymousClass4.setX[MenuHostHelper$$ExternalSyntheticLambda02.setX().ordinal()];
        if (i == 1) {
            MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda02.setY() << 3);
            setX(j);
        } else if (i == 2) {
            MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda02.setY() << 3);
            setX((j << 1) ^ (j >> 63));
        } else if (i == 3) {
            MenuHostHelper$$ExternalSyntheticLambda1((MenuHostHelper$$ExternalSyntheticLambda02.setY() << 3) | 1);
            this.setOnLongClickListener.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
        return this;
    }

    private <T> bO MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0057br<T> interfaceC0057br, C0056bq c0056bq, T t, boolean z) {
        long iconTintList = setIconTintList((InterfaceC0057br<InterfaceC0057br<T>>) interfaceC0057br, (InterfaceC0057br<T>) t);
        if (z && iconTintList == 0) {
            return this;
        }
        bH bHVar = (bH) ((Annotation) c0056bq.setY.get(bH.class));
        if (bHVar != null) {
            MenuHostHelper$$ExternalSyntheticLambda1((bHVar.setY() << 3) | 2);
            setX(iconTintList);
            interfaceC0057br.setY(t, this);
            return this;
        }
        throw new C0060bu("Field has no @Protobuf config");
    }

    private <T> long setIconTintList(InterfaceC0057br<T> interfaceC0057br, T t) {
        bG bGVar = new bG();
        try {
            OutputStream outputStream = this.setOnLongClickListener;
            this.setOnLongClickListener = bGVar;
            interfaceC0057br.setY(t, this);
            this.setOnLongClickListener = outputStream;
            long j = bGVar.setIconTintList;
            bGVar.close();
            return j;
        } catch (Throwable th) {
            try {
                bGVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private <T> bO MenuHostHelper$$ExternalSyntheticLambda1(InterfaceC0063bx<T> interfaceC0063bx, C0056bq c0056bq, T t, boolean z) {
        bL bLVar = this.setLayoutAnimation;
        bLVar.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        bLVar.setIconTintList = c0056bq;
        bLVar.setX = z;
        interfaceC0063bx.setY(t, this.setLayoutAnimation);
        return this;
    }

    private static int setX(C0056bq c0056bq) {
        bH bHVar = (bH) ((Annotation) c0056bq.setY.get(bH.class));
        if (bHVar == null) {
            throw new C0060bu("Field has no @Protobuf config");
        }
        return bHVar.setY();
    }

    private static bH MenuHostHelper$$ExternalSyntheticLambda0(C0056bq c0056bq) {
        bH bHVar = (bH) ((Annotation) c0056bq.setY.get(bH.class));
        if (bHVar != null) {
            return bHVar;
        }
        throw new C0060bu("Field has no @Protobuf config");
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        while ((i & (-128)) != 0) {
            this.setOnLongClickListener.write((i & 127) | 128);
            i >>>= 7;
        }
        this.setOnLongClickListener.write(i & 127);
    }

    private void setX(long j) {
        while (((-128) & j) != 0) {
            this.setOnLongClickListener.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.setOnLongClickListener.write(((int) j) & 127);
    }

    @Override // o.InterfaceC0065bz
    public final /* bridge */ /* synthetic */ InterfaceC0065bz setY(C0056bq c0056bq, int i) {
        return setY(c0056bq, i, true);
    }

    @Override // o.InterfaceC0065bz
    public final /* synthetic */ InterfaceC0065bz MenuHostHelper$$ExternalSyntheticLambda1(C0056bq c0056bq, long j) {
        return MenuHostHelper$$ExternalSyntheticLambda0(c0056bq, j, true);
    }
}