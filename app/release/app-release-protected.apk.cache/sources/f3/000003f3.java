package o;

import o.AbstractC0239il;

/* loaded from: classes.dex */
public final class eN extends AbstractC0239il<eN, setY> implements eQ {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final eN DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile iP<eN> PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    public int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    private eN() {
    }

    public static setY MenuHostHelper$$ExternalSyntheticLambda1() {
        return DEFAULT_INSTANCE.setTextAlignment();
    }

    /* loaded from: classes.dex */
    public static final class setY extends il$MenuHostHelper$$ExternalSyntheticLambda1<eN, setY> implements eQ {
        /* synthetic */ setY(byte b) {
            this();
        }

        private setY() {
            super(eN.DEFAULT_INSTANCE);
        }

        public final setY setY(int i) {
            setTextAlignment();
            eN.MenuHostHelper$$ExternalSyntheticLambda0((eN) this.setIconTintList, i);
            return this;
        }

        public final setY MenuHostHelper$$ExternalSyntheticLambda1(int i) {
            setTextAlignment();
            eN.MenuHostHelper$$ExternalSyntheticLambda1((eN) this.setIconTintList, i);
            return this;
        }

        public final setY MenuHostHelper$$ExternalSyntheticLambda0(int i) {
            setTextAlignment();
            eN.setX((eN) this.setIconTintList, i);
            return this;
        }
    }

    /* renamed from: o.eN$5  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] MenuHostHelper$$ExternalSyntheticLambda1;

        static {
            int[] iArr = new int[AbstractC0239il.setIconTintList.values().length];
            MenuHostHelper$$ExternalSyntheticLambda1 = iArr;
            try {
                iArr[AbstractC0239il.setIconTintList.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[AbstractC0239il.setIconTintList.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[AbstractC0239il.setIconTintList.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[AbstractC0239il.setIconTintList.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[AbstractC0239il.setIconTintList.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[AbstractC0239il.setIconTintList.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[AbstractC0239il.setIconTintList.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // o.AbstractC0239il
    public final Object setX(AbstractC0239il.setIconTintList seticontintlist) {
        iP iPVar;
        switch (AnonymousClass5.MenuHostHelper$$ExternalSyntheticLambda1[seticontintlist.ordinal()]) {
            case 1:
                return new eN();
            case 2:
                return new setY((byte) 0);
            case 3:
                return new iS(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                iP<eN> iPVar2 = PARSER;
                if (iPVar2 == null) {
                    synchronized (eN.class) {
                        iPVar = PARSER;
                        if (iPVar == null) {
                            iPVar = new AbstractC0239il.setY(DEFAULT_INSTANCE);
                            PARSER = iPVar;
                        }
                    }
                    return iPVar;
                }
                return iPVar2;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        eN eNVar = new eN();
        DEFAULT_INSTANCE = eNVar;
        AbstractC0239il.setY(eN.class, eNVar);
    }

    public static eN setX() {
        return DEFAULT_INSTANCE;
    }

    static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(eN eNVar, int i) {
        eNVar.bitField0_ |= 16;
        eNVar.maxAppJavaHeapMemoryKb_ = i;
    }

    static /* synthetic */ void setX(eN eNVar, int i) {
        eNVar.bitField0_ |= 32;
        eNVar.maxEncouragedAppJavaHeapMemoryKb_ = i;
    }

    static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(eN eNVar, int i) {
        eNVar.bitField0_ |= 8;
        eNVar.deviceRamSizeKb_ = i;
    }
}