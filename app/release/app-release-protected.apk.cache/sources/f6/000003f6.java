package o;

import o.AbstractC0239il;
import o.C0243ip;

/* loaded from: classes.dex */
public final class eO extends AbstractC0239il<eO, setY> implements eS {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final eO DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile iP<eO> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public int bitField0_;
    public eN gaugeMetadata_;
    private String sessionId_ = "";
    public C0243ip.setY<eK> cpuMetricReadings_ = iR.setIconTintList();
    public C0243ip.setY<eH> androidMemoryReadings_ = iR.setIconTintList();

    private eO() {
    }

    public static setY setX() {
        return DEFAULT_INSTANCE.setTextAlignment();
    }

    /* loaded from: classes.dex */
    public static final class setY extends il$MenuHostHelper$$ExternalSyntheticLambda1<eO, setY> implements eS {
        /* synthetic */ setY(byte b) {
            this();
        }

        private setY() {
            super(eO.DEFAULT_INSTANCE);
        }

        public final setY MenuHostHelper$$ExternalSyntheticLambda1(String str) {
            setTextAlignment();
            eO.MenuHostHelper$$ExternalSyntheticLambda0((eO) this.setIconTintList, str);
            return this;
        }

        public final setY setIconTintList(eN eNVar) {
            setTextAlignment();
            eO.setY((eO) this.setIconTintList, eNVar);
            return this;
        }

        public final setY MenuHostHelper$$ExternalSyntheticLambda0(eK eKVar) {
            setTextAlignment();
            eO.setY((eO) this.setIconTintList, eKVar);
            return this;
        }

        public final setY setIconTintList(eH eHVar) {
            setTextAlignment();
            eO.MenuHostHelper$$ExternalSyntheticLambda0((eO) this.setIconTintList, eHVar);
            return this;
        }
    }

    /* renamed from: o.eO$5  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[AbstractC0239il.setIconTintList.values().length];
            setX = iArr;
            try {
                iArr[AbstractC0239il.setIconTintList.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                setX[AbstractC0239il.setIconTintList.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                setX[AbstractC0239il.setIconTintList.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                setX[AbstractC0239il.setIconTintList.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                setX[AbstractC0239il.setIconTintList.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                setX[AbstractC0239il.setIconTintList.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                setX[AbstractC0239il.setIconTintList.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // o.AbstractC0239il
    public final Object setX(AbstractC0239il.setIconTintList seticontintlist) {
        iP iPVar;
        switch (AnonymousClass5.setX[seticontintlist.ordinal()]) {
            case 1:
                return new eO();
            case 2:
                return new setY((byte) 0);
            case 3:
                return new iS(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", eK.class, "gaugeMetadata_", "androidMemoryReadings_", eH.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                iP<eO> iPVar2 = PARSER;
                if (iPVar2 == null) {
                    synchronized (eO.class) {
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
        eO eOVar = new eO();
        DEFAULT_INSTANCE = eOVar;
        AbstractC0239il.setY(eO.class, eOVar);
    }

    static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(eO eOVar, String str) {
        eOVar.bitField0_ |= 1;
        eOVar.sessionId_ = str;
    }

    static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(eO eOVar, eH eHVar) {
        C0243ip.setY<eH> sety = eOVar.androidMemoryReadings_;
        if (!sety.setY()) {
            int size = sety.size();
            eOVar.androidMemoryReadings_ = sety.setX(size == 0 ? 10 : size << 1);
        }
        eOVar.androidMemoryReadings_.add(eHVar);
    }

    static /* synthetic */ void setY(eO eOVar, eN eNVar) {
        eOVar.gaugeMetadata_ = eNVar;
        eOVar.bitField0_ |= 2;
    }

    static /* synthetic */ void setY(eO eOVar, eK eKVar) {
        C0243ip.setY<eK> sety = eOVar.cpuMetricReadings_;
        if (!sety.setY()) {
            int size = sety.size();
            eOVar.cpuMetricReadings_ = sety.setX(size == 0 ? 10 : size << 1);
        }
        eOVar.cpuMetricReadings_.add(eKVar);
    }
}