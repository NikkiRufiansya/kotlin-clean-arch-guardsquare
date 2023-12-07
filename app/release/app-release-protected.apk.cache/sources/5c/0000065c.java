package o;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class ji {
    private static final boolean MenuHostHelper$$ExternalSyntheticLambda0;
    private static final boolean MenuHostHelper$$ExternalSyntheticLambda1;
    static final long setIconTintList;
    private static final Class<?> setLayoutAnimation;
    private static final setY setNavigationOnClickListener;
    private static final Unsafe setUiOptions = setY();
    private static final boolean setUnboundedRipple;
    private static final boolean setX;
    static final boolean setY;

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j, byte b) {
        setIconTintList(obj, j, b);
    }

    static /* synthetic */ Field MenuHostHelper$$ExternalSyntheticLambda1() {
        return setX();
    }

    public static /* synthetic */ void setY(Object obj, long j, byte b) {
        MenuHostHelper$$ExternalSyntheticLambda1(obj, j, b);
    }

    static {
        Class<?> cls;
        setY sety;
        cls = hV.setX;
        setLayoutAnimation = cls;
        setUnboundedRipple = setIconTintList(Long.TYPE);
        MenuHostHelper$$ExternalSyntheticLambda0 = setIconTintList(Integer.TYPE);
        Unsafe unsafe = setUiOptions;
        setY sety2 = null;
        if (unsafe != null) {
            if (hV.setX()) {
                if (setUnboundedRipple) {
                    sety2 = new setY(unsafe) { // from class: o.ji$MenuHostHelper$$ExternalSyntheticLambda0
                        @Override // o.ji.setY
                        public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
                            return false;
                        }

                        @Override // o.ji.setY
                        public final byte setX(Object obj, long j) {
                            if (ji.setY) {
                                return ji.MenuHostHelper$$ExternalSyntheticLambda0(obj, j);
                            }
                            return ji.setX(obj, j);
                        }

                        @Override // o.ji.setY
                        public final void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, byte b) {
                            if (ji.setY) {
                                ji.setY(obj, j, b);
                            } else {
                                ji.MenuHostHelper$$ExternalSyntheticLambda0(obj, j, b);
                            }
                        }

                        @Override // o.ji.setY
                        public final boolean setIconTintList(Object obj, long j) {
                            if (ji.setY) {
                                return ji.setY(obj, j);
                            }
                            return ji.setIconTintList(obj, j);
                        }

                        @Override // o.ji.setY
                        public final void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, boolean z) {
                            if (ji.setY) {
                                ji.MenuHostHelper$$ExternalSyntheticLambda0(obj, j, z);
                            } else {
                                ji.MenuHostHelper$$ExternalSyntheticLambda1(obj, j, z);
                            }
                        }

                        @Override // o.ji.setY
                        public final void MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j, float f) {
                            this.setIconTintList.putInt(obj, j, Float.floatToIntBits(f));
                        }

                        @Override // o.ji.setY
                        public final void MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j, double d) {
                            this.setIconTintList.putLong(obj, j, Double.doubleToLongBits(d));
                        }

                        @Override // o.ji.setY
                        public final double MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j) {
                            return Double.longBitsToDouble(this.setIconTintList.getLong(obj, j));
                        }

                        @Override // o.ji.setY
                        public final float setY(Object obj, long j) {
                            return Float.intBitsToFloat(this.setIconTintList.getInt(obj, j));
                        }
                    };
                } else if (MenuHostHelper$$ExternalSyntheticLambda0) {
                    sety2 = new setIconTintList(unsafe);
                }
            } else {
                sety2 = new setX(unsafe);
            }
        }
        setNavigationOnClickListener = sety2;
        MenuHostHelper$$ExternalSyntheticLambda1 = sety2 == null ? false : sety2.MenuHostHelper$$ExternalSyntheticLambda0();
        setY sety3 = setNavigationOnClickListener;
        boolean MenuHostHelper$$ExternalSyntheticLambda12 = sety3 == null ? false : sety3.MenuHostHelper$$ExternalSyntheticLambda1();
        setX = MenuHostHelper$$ExternalSyntheticLambda12;
        setIconTintList = MenuHostHelper$$ExternalSyntheticLambda12 ? setNavigationOnClickListener.setIconTintList.arrayBaseOffset(byte[].class) : -1;
        if (setX) {
            setNavigationOnClickListener.setIconTintList.arrayBaseOffset(boolean[].class);
        }
        if (setX) {
            setNavigationOnClickListener.setIconTintList.arrayIndexScale(boolean[].class);
        }
        if (setX) {
            setNavigationOnClickListener.setIconTintList.arrayBaseOffset(int[].class);
        }
        if (setX) {
            setNavigationOnClickListener.setIconTintList.arrayIndexScale(int[].class);
        }
        if (setX) {
            setNavigationOnClickListener.setIconTintList.arrayBaseOffset(long[].class);
        }
        if (setX) {
            setNavigationOnClickListener.setIconTintList.arrayIndexScale(long[].class);
        }
        if (setX) {
            setNavigationOnClickListener.setIconTintList.arrayBaseOffset(float[].class);
        }
        if (setX) {
            setNavigationOnClickListener.setIconTintList.arrayIndexScale(float[].class);
        }
        if (setX) {
            setNavigationOnClickListener.setIconTintList.arrayBaseOffset(double[].class);
        }
        if (setX) {
            setNavigationOnClickListener.setIconTintList.arrayIndexScale(double[].class);
        }
        if (setX) {
            setNavigationOnClickListener.setIconTintList.arrayBaseOffset(Object[].class);
        }
        if (setX) {
            setNavigationOnClickListener.setIconTintList.arrayIndexScale(Object[].class);
        }
        Field x = setX();
        if (x != null && (sety = setNavigationOnClickListener) != null) {
            sety.setIconTintList.objectFieldOffset(x);
        }
        setY = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private ji() {
    }

    public static boolean setIconTintList() {
        return setX;
    }

    public static <T> T MenuHostHelper$$ExternalSyntheticLambda1(Class<T> cls) {
        try {
            return (T) setUiOptions.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static int setOnLongClickListener(Object obj, long j) {
        return setNavigationOnClickListener.setIconTintList.getInt(obj, j);
    }

    public static long setLayoutAnimation(Object obj, long j) {
        return setNavigationOnClickListener.setIconTintList.getLong(obj, j);
    }

    public static void setIconTintList(Object obj, long j, boolean z) {
        setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(obj, j, z);
    }

    public static float setUnboundedRipple(Object obj, long j) {
        return setNavigationOnClickListener.setY(obj, j);
    }

    public static double setUiOptions(Object obj, long j) {
        return setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0(obj, j);
    }

    public static void setY(Object obj, long j, double d) {
        setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0(obj, j, d);
    }

    public static Object setNavigationOnClickListener(Object obj, long j) {
        return setNavigationOnClickListener.setIconTintList.getObject(obj, j);
    }

    public static void setX(Object obj, long j, Object obj2) {
        setNavigationOnClickListener.setIconTintList.putObject(obj, j, obj2);
    }

    public static Unsafe setY() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: o.ji.3
                @Override // java.security.PrivilegedExceptionAction
                public final /* synthetic */ Unsafe run() {
                    Field[] declaredFields;
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean setIconTintList(Class<?> cls) {
        if (hV.setX()) {
            try {
                Class<?> cls2 = setLayoutAnimation;
                cls2.getMethod("peekLong", cls, Boolean.TYPE);
                cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
                cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
                cls2.getMethod("peekInt", cls, Boolean.TYPE);
                cls2.getMethod("pokeByte", cls, Byte.TYPE);
                cls2.getMethod("peekByte", cls);
                cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
                cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    private static Field setX() {
        Field iconTintList;
        if (!hV.setX() || (iconTintList = setIconTintList(Buffer.class, "effectiveDirectAddress")) == null) {
            Field iconTintList2 = setIconTintList(Buffer.class, "address");
            if (iconTintList2 == null || iconTintList2.getType() != Long.TYPE) {
                return null;
            }
            return iconTintList2;
        }
        return iconTintList;
    }

    private static Field setIconTintList(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class setY {
        Unsafe setIconTintList;

        public abstract double MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j);

        public abstract void MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j, double d);

        public abstract void MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j, float f);

        public abstract void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, byte b);

        public abstract void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, boolean z);

        public abstract boolean setIconTintList(Object obj, long j);

        public abstract byte setX(Object obj, long j);

        public abstract float setY(Object obj, long j);

        public setY(Unsafe unsafe) {
            this.setIconTintList = unsafe;
        }

        public boolean MenuHostHelper$$ExternalSyntheticLambda1() {
            Unsafe unsafe = this.setIconTintList;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                cls.getMethod("getInt", Object.class, Long.TYPE);
                cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
                cls.getMethod("getObject", Object.class, Long.TYPE);
                cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
                return true;
            } catch (Throwable th) {
                ji.MenuHostHelper$$ExternalSyntheticLambda0(th);
                return false;
            }
        }

        public boolean MenuHostHelper$$ExternalSyntheticLambda0() {
            Unsafe unsafe = this.setIconTintList;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return ji.MenuHostHelper$$ExternalSyntheticLambda1() != null;
            } catch (Throwable th) {
                ji.MenuHostHelper$$ExternalSyntheticLambda0(th);
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    static final class setX extends setY {
        setX(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // o.ji.setY
        public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
            if (super.MenuHostHelper$$ExternalSyntheticLambda1()) {
                try {
                    Class<?> cls = this.setIconTintList.getClass();
                    cls.getMethod("getByte", Object.class, Long.TYPE);
                    cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
                    cls.getMethod("getBoolean", Object.class, Long.TYPE);
                    cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
                    cls.getMethod("getFloat", Object.class, Long.TYPE);
                    cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
                    cls.getMethod("getDouble", Object.class, Long.TYPE);
                    cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
                    return true;
                } catch (Throwable th) {
                    ji.MenuHostHelper$$ExternalSyntheticLambda0(th);
                    return false;
                }
            }
            return false;
        }

        @Override // o.ji.setY
        public final byte setX(Object obj, long j) {
            return this.setIconTintList.getByte(obj, j);
        }

        @Override // o.ji.setY
        public final void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, byte b) {
            this.setIconTintList.putByte(obj, j, b);
        }

        @Override // o.ji.setY
        public final boolean setIconTintList(Object obj, long j) {
            return this.setIconTintList.getBoolean(obj, j);
        }

        @Override // o.ji.setY
        public final void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, boolean z) {
            this.setIconTintList.putBoolean(obj, j, z);
        }

        @Override // o.ji.setY
        public final float setY(Object obj, long j) {
            return this.setIconTintList.getFloat(obj, j);
        }

        @Override // o.ji.setY
        public final void MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j, float f) {
            this.setIconTintList.putFloat(obj, j, f);
        }

        @Override // o.ji.setY
        public final double MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j) {
            return this.setIconTintList.getDouble(obj, j);
        }

        @Override // o.ji.setY
        public final void MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j, double d) {
            this.setIconTintList.putDouble(obj, j, d);
        }

        @Override // o.ji.setY
        public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
            if (super.MenuHostHelper$$ExternalSyntheticLambda0()) {
                try {
                    Class<?> cls = this.setIconTintList.getClass();
                    cls.getMethod("getByte", Long.TYPE);
                    cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
                    cls.getMethod("getInt", Long.TYPE);
                    cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
                    cls.getMethod("getLong", Long.TYPE);
                    cls.getMethod("putLong", Long.TYPE, Long.TYPE);
                    cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
                    cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
                    return true;
                } catch (Throwable th) {
                    ji.MenuHostHelper$$ExternalSyntheticLambda0(th);
                    return false;
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    static final class setIconTintList extends setY {
        @Override // o.ji.setY
        public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
            return false;
        }

        setIconTintList(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // o.ji.setY
        public final byte setX(Object obj, long j) {
            if (ji.setY) {
                return ji.MenuHostHelper$$ExternalSyntheticLambda0(obj, j);
            }
            return ji.setX(obj, j);
        }

        @Override // o.ji.setY
        public final void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, byte b) {
            if (ji.setY) {
                ji.MenuHostHelper$$ExternalSyntheticLambda1(obj, j, b);
            } else {
                ji.setIconTintList(obj, j, b);
            }
        }

        @Override // o.ji.setY
        public final boolean setIconTintList(Object obj, long j) {
            if (ji.setY) {
                return ji.setY(obj, j);
            }
            return ji.setIconTintList(obj, j);
        }

        @Override // o.ji.setY
        public final void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, boolean z) {
            if (ji.setY) {
                ji.MenuHostHelper$$ExternalSyntheticLambda0(obj, j, z);
            } else {
                ji.MenuHostHelper$$ExternalSyntheticLambda1(obj, j, z);
            }
        }

        @Override // o.ji.setY
        public final void MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j, float f) {
            this.setIconTintList.putInt(obj, j, Float.floatToIntBits(f));
        }

        @Override // o.ji.setY
        public final void MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j, double d) {
            this.setIconTintList.putLong(obj, j, Double.doubleToLongBits(d));
        }

        @Override // o.ji.setY
        public final double MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j) {
            return Double.longBitsToDouble(this.setIconTintList.getLong(obj, j));
        }

        @Override // o.ji.setY
        public final float setY(Object obj, long j) {
            return Float.intBitsToFloat(this.setIconTintList.getInt(obj, j));
        }
    }

    static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(Throwable th) {
        Logger logger = Logger.getLogger(ji.class.getName());
        Level level = Level.WARNING;
        StringBuilder sb = new StringBuilder("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(th);
        logger.log(level, sb.toString());
    }

    public static /* synthetic */ byte MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j) {
        return (byte) (setNavigationOnClickListener.setIconTintList.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    public static /* synthetic */ byte setX(Object obj, long j) {
        return (byte) (setNavigationOnClickListener.setIconTintList.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    public static /* synthetic */ boolean setY(Object obj, long j) {
        return ((byte) (setNavigationOnClickListener.setIconTintList.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)))) != 0;
    }

    public static /* synthetic */ boolean setIconTintList(Object obj, long j) {
        return ((byte) (setNavigationOnClickListener.setIconTintList.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3)))) != 0;
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j, boolean z) {
        MenuHostHelper$$ExternalSyntheticLambda1(obj, j, z ? (byte) 1 : (byte) 0);
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, boolean z) {
        setIconTintList(obj, j, z ? (byte) 1 : (byte) 0);
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = setNavigationOnClickListener.setIconTintList.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        Unsafe unsafe = setNavigationOnClickListener.setIconTintList;
        unsafe.putInt(obj, j2, ((~(255 << i2)) & i) | ((b & 255) << i2));
    }

    public static void setIconTintList(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = setNavigationOnClickListener.setIconTintList.getInt(obj, j2);
        int i2 = (((int) j) & 3) << 3;
        Unsafe unsafe = setNavigationOnClickListener.setIconTintList;
        unsafe.putInt(obj, j2, ((~(255 << i2)) & i) | ((b & 255) << i2));
    }
}