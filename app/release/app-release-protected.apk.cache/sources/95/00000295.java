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
public final class WindowInsetsCompat$Impl20 {
    static final boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private static long setIconTintList;
    private static final setIconTintList setUiOptions;
    private static final boolean setX;
    private static final boolean setY;
    private static final Logger setNavigationOnClickListener = Logger.getLogger(WindowInsetsCompat$Impl20.class.getName());
    private static final Unsafe setOnLongClickListener = MenuHostHelper$$ExternalSyntheticLambda0();
    private static final Class<?> setLayoutAnimation = setMenu.setY();
    private static final boolean setUnboundedRipple = setX(Long.TYPE);
    private static final boolean MenuHostHelper$$ExternalSyntheticLambda0 = setX(Integer.TYPE);

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, byte b) {
        setX(obj, j, b);
    }

    public static /* synthetic */ void setY(Object obj, long j, byte b) {
        setIconTintList(obj, j, b);
    }

    static {
        setIconTintList seticontintlist;
        Unsafe unsafe = setOnLongClickListener;
        setIconTintList seticontintlist2 = null;
        if (unsafe != null) {
            if (setMenu.MenuHostHelper$$ExternalSyntheticLambda1()) {
                if (setUnboundedRipple) {
                    seticontintlist2 = new setIconTintList(unsafe) { // from class: o.WindowInsetsCompat$Impl20$MenuHostHelper$$ExternalSyntheticLambda1
                        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
                        public final byte setX(Object obj, long j) {
                            if (WindowInsetsCompat$Impl20.MenuHostHelper$$ExternalSyntheticLambda1) {
                                return WindowInsetsCompat$Impl20.setX(obj, j);
                            }
                            return WindowInsetsCompat$Impl20.MenuHostHelper$$ExternalSyntheticLambda1(obj, j);
                        }

                        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
                        public final void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, byte b) {
                            if (WindowInsetsCompat$Impl20.MenuHostHelper$$ExternalSyntheticLambda1) {
                                WindowInsetsCompat$Impl20.setY(obj, j, b);
                            } else {
                                WindowInsetsCompat$Impl20.MenuHostHelper$$ExternalSyntheticLambda1(obj, j, b);
                            }
                        }

                        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
                        public final boolean setIconTintList(Object obj, long j) {
                            if (WindowInsetsCompat$Impl20.MenuHostHelper$$ExternalSyntheticLambda1) {
                                return WindowInsetsCompat$Impl20.MenuHostHelper$$ExternalSyntheticLambda0(obj, j);
                            }
                            return WindowInsetsCompat$Impl20.setY(obj, j);
                        }

                        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
                        public final void setY(Object obj, long j, boolean z) {
                            if (WindowInsetsCompat$Impl20.MenuHostHelper$$ExternalSyntheticLambda1) {
                                WindowInsetsCompat$Impl20.setIconTintList(obj, j, z);
                            } else {
                                WindowInsetsCompat$Impl20.MenuHostHelper$$ExternalSyntheticLambda1(obj, j, z);
                            }
                        }

                        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
                        public final void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, float f) {
                            this.setIconTintList.putInt(obj, j, Float.floatToIntBits(f));
                        }

                        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
                        public final void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, double d) {
                            this.setIconTintList.putLong(obj, j, Double.doubleToLongBits(d));
                        }

                        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
                        public final double setY(Object obj, long j) {
                            return Double.longBitsToDouble(this.setIconTintList.getLong(obj, j));
                        }

                        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
                        public final float MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j) {
                            return Float.intBitsToFloat(this.setIconTintList.getInt(obj, j));
                        }
                    };
                } else if (MenuHostHelper$$ExternalSyntheticLambda0) {
                    seticontintlist2 = new setY(unsafe);
                }
            } else {
                seticontintlist2 = new setX(unsafe);
            }
        }
        setUiOptions = seticontintlist2;
        setY = setUiOptions();
        boolean iconTintList = setIconTintList();
        setX = iconTintList;
        setIconTintList = iconTintList ? setUiOptions.setIconTintList.arrayBaseOffset(byte[].class) : -1;
        if (setX) {
            setUiOptions.setIconTintList.arrayBaseOffset(boolean[].class);
        }
        if (setX) {
            setUiOptions.setIconTintList.arrayIndexScale(boolean[].class);
        }
        if (setX) {
            setUiOptions.setIconTintList.arrayBaseOffset(int[].class);
        }
        if (setX) {
            setUiOptions.setIconTintList.arrayIndexScale(int[].class);
        }
        if (setX) {
            setUiOptions.setIconTintList.arrayBaseOffset(long[].class);
        }
        if (setX) {
            setUiOptions.setIconTintList.arrayIndexScale(long[].class);
        }
        if (setX) {
            setUiOptions.setIconTintList.arrayBaseOffset(float[].class);
        }
        if (setX) {
            setUiOptions.setIconTintList.arrayIndexScale(float[].class);
        }
        if (setX) {
            setUiOptions.setIconTintList.arrayBaseOffset(double[].class);
        }
        if (setX) {
            setUiOptions.setIconTintList.arrayIndexScale(double[].class);
        }
        if (setX) {
            setUiOptions.setIconTintList.arrayBaseOffset(Object[].class);
        }
        if (setX) {
            setUiOptions.setIconTintList.arrayIndexScale(Object[].class);
        }
        Field y = setY();
        if (y != null && (seticontintlist = setUiOptions) != null) {
            seticontintlist.setIconTintList.objectFieldOffset(y);
        }
        MenuHostHelper$$ExternalSyntheticLambda1 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private WindowInsetsCompat$Impl20() {
    }

    public static boolean setX() {
        return setY;
    }

    public static <T> T MenuHostHelper$$ExternalSyntheticLambda0(Class<T> cls) {
        try {
            return (T) setOnLongClickListener.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static long setX(Field field) {
        return setUiOptions.setIconTintList.objectFieldOffset(field);
    }

    public static int setOnLongClickListener(Object obj, long j) {
        return setUiOptions.setIconTintList.getInt(obj, j);
    }

    public static void setIconTintList(Object obj, long j, int i) {
        setUiOptions.setIconTintList.putInt(obj, j, i);
    }

    public static long setNavigationOnClickListener(Object obj, long j) {
        return setUiOptions.setIconTintList.getLong(obj, j);
    }

    public static boolean setIconTintList(Object obj, long j) {
        return setUiOptions.setIconTintList(obj, j);
    }

    public static void setY(Object obj, long j, boolean z) {
        setUiOptions.setY(obj, j, z);
    }

    public static float setUiOptions(Object obj, long j) {
        return setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0(obj, j);
    }

    public static void setY(Object obj, long j, float f) {
        setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(obj, j, f);
    }

    public static double setLayoutAnimation(Object obj, long j) {
        return setUiOptions.setY(obj, j);
    }

    public static Object setUnboundedRipple(Object obj, long j) {
        return setUiOptions.setIconTintList.getObject(obj, j);
    }

    public static void setY(byte[] bArr, long j, byte b) {
        setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1((Object) bArr, setIconTintList + j, b);
    }

    public static Unsafe MenuHostHelper$$ExternalSyntheticLambda0() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: o.WindowInsetsCompat$Impl20.5
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

    private static boolean setIconTintList() {
        Unsafe unsafe = setOnLongClickListener;
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
            if (setMenu.MenuHostHelper$$ExternalSyntheticLambda1()) {
                return true;
            }
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
            Logger logger = setNavigationOnClickListener;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(th);
            logger.log(level, sb.toString());
            return false;
        }
    }

    private static boolean setUiOptions() {
        Unsafe unsafe = setOnLongClickListener;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (setY() == null) {
                return false;
            }
            if (setMenu.MenuHostHelper$$ExternalSyntheticLambda1()) {
                return true;
            }
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
            Logger logger = setNavigationOnClickListener;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(th);
            logger.log(level, sb.toString());
            return false;
        }
    }

    private static boolean setX(Class<?> cls) {
        if (setMenu.MenuHostHelper$$ExternalSyntheticLambda1()) {
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

    private static Field setY() {
        Field MenuHostHelper$$ExternalSyntheticLambda12;
        if (!setMenu.MenuHostHelper$$ExternalSyntheticLambda1() || (MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(Buffer.class, "effectiveDirectAddress")) == null) {
            Field MenuHostHelper$$ExternalSyntheticLambda13 = MenuHostHelper$$ExternalSyntheticLambda1(Buffer.class, "address");
            if (MenuHostHelper$$ExternalSyntheticLambda13 == null || MenuHostHelper$$ExternalSyntheticLambda13.getType() != Long.TYPE) {
                return null;
            }
            return MenuHostHelper$$ExternalSyntheticLambda13;
        }
        return MenuHostHelper$$ExternalSyntheticLambda12;
    }

    private static Field MenuHostHelper$$ExternalSyntheticLambda1(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class setIconTintList {
        Unsafe setIconTintList;

        public abstract float MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j);

        public abstract void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, byte b);

        public abstract void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, double d);

        public abstract void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, float f);

        public abstract boolean setIconTintList(Object obj, long j);

        public abstract byte setX(Object obj, long j);

        public abstract double setY(Object obj, long j);

        public abstract void setY(Object obj, long j, boolean z);

        public setIconTintList(Unsafe unsafe) {
            this.setIconTintList = unsafe;
        }
    }

    /* loaded from: classes.dex */
    static final class setX extends setIconTintList {
        setX(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
        public final byte setX(Object obj, long j) {
            return this.setIconTintList.getByte(obj, j);
        }

        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
        public final void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, byte b) {
            this.setIconTintList.putByte(obj, j, b);
        }

        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
        public final boolean setIconTintList(Object obj, long j) {
            return this.setIconTintList.getBoolean(obj, j);
        }

        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
        public final void setY(Object obj, long j, boolean z) {
            this.setIconTintList.putBoolean(obj, j, z);
        }

        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
        public final float MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j) {
            return this.setIconTintList.getFloat(obj, j);
        }

        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
        public final void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, float f) {
            this.setIconTintList.putFloat(obj, j, f);
        }

        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
        public final double setY(Object obj, long j) {
            return this.setIconTintList.getDouble(obj, j);
        }

        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
        public final void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, double d) {
            this.setIconTintList.putDouble(obj, j, d);
        }
    }

    /* loaded from: classes.dex */
    static final class setY extends setIconTintList {
        setY(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
        public final byte setX(Object obj, long j) {
            if (WindowInsetsCompat$Impl20.MenuHostHelper$$ExternalSyntheticLambda1) {
                return WindowInsetsCompat$Impl20.setX(obj, j);
            }
            return WindowInsetsCompat$Impl20.MenuHostHelper$$ExternalSyntheticLambda1(obj, j);
        }

        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
        public final void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, byte b) {
            if (WindowInsetsCompat$Impl20.MenuHostHelper$$ExternalSyntheticLambda1) {
                WindowInsetsCompat$Impl20.setIconTintList(obj, j, b);
            } else {
                WindowInsetsCompat$Impl20.setX(obj, j, b);
            }
        }

        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
        public final boolean setIconTintList(Object obj, long j) {
            if (WindowInsetsCompat$Impl20.MenuHostHelper$$ExternalSyntheticLambda1) {
                return WindowInsetsCompat$Impl20.MenuHostHelper$$ExternalSyntheticLambda0(obj, j);
            }
            return WindowInsetsCompat$Impl20.setY(obj, j);
        }

        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
        public final void setY(Object obj, long j, boolean z) {
            if (WindowInsetsCompat$Impl20.MenuHostHelper$$ExternalSyntheticLambda1) {
                WindowInsetsCompat$Impl20.setIconTintList(obj, j, z);
            } else {
                WindowInsetsCompat$Impl20.MenuHostHelper$$ExternalSyntheticLambda1(obj, j, z);
            }
        }

        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
        public final void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, float f) {
            this.setIconTintList.putInt(obj, j, Float.floatToIntBits(f));
        }

        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
        public final void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, double d) {
            this.setIconTintList.putLong(obj, j, Double.doubleToLongBits(d));
        }

        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
        public final double setY(Object obj, long j) {
            return Double.longBitsToDouble(this.setIconTintList.getLong(obj, j));
        }

        @Override // o.WindowInsetsCompat$Impl20.setIconTintList
        public final float MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j) {
            return Float.intBitsToFloat(this.setIconTintList.getInt(obj, j));
        }
    }

    public static /* synthetic */ byte setX(Object obj, long j) {
        return (byte) (setUiOptions.setIconTintList.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
    }

    public static /* synthetic */ byte MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j) {
        return (byte) (setUiOptions.setIconTintList.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    public static /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j) {
        return ((byte) (setUiOptions.setIconTintList.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)))) != 0;
    }

    public static /* synthetic */ boolean setY(Object obj, long j) {
        return ((byte) (setUiOptions.setIconTintList.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3)))) != 0;
    }

    public static /* synthetic */ void setIconTintList(Object obj, long j, boolean z) {
        setIconTintList(obj, j, z ? (byte) 1 : (byte) 0);
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, long j, boolean z) {
        setX(obj, j, z ? (byte) 1 : (byte) 0);
    }

    public static void setIconTintList(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = setUiOptions.setIconTintList.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        Unsafe unsafe = setUiOptions.setIconTintList;
        unsafe.putInt(obj, j2, ((~(255 << i2)) & i) | ((b & 255) << i2));
    }

    public static void setX(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = setUiOptions.setIconTintList.getInt(obj, j2);
        int i2 = (((int) j) & 3) << 3;
        Unsafe unsafe = setUiOptions.setIconTintList;
        unsafe.putInt(obj, j2, ((~(255 << i2)) & i) | ((b & 255) << i2));
    }
}