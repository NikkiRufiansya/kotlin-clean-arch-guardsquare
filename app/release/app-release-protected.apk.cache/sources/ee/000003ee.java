package o;

import o.AbstractC0239il;

/* loaded from: classes.dex */
public final class eK extends AbstractC0239il<eK, setIconTintList> implements eM {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final eK DEFAULT_INSTANCE;
    private static volatile iP<eK> PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    private eK() {
    }

    public static setIconTintList setY() {
        return DEFAULT_INSTANCE.setTextAlignment();
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList extends il$MenuHostHelper$$ExternalSyntheticLambda1<eK, setIconTintList> implements eM {
        /* synthetic */ setIconTintList(byte b) {
            this();
        }

        private setIconTintList() {
            super(eK.DEFAULT_INSTANCE);
        }

        public final setIconTintList setX(long j) {
            setTextAlignment();
            eK.setY((eK) this.setIconTintList, j);
            return this;
        }

        public final setIconTintList MenuHostHelper$$ExternalSyntheticLambda1(long j) {
            setTextAlignment();
            eK.MenuHostHelper$$ExternalSyntheticLambda0((eK) this.setIconTintList, j);
            return this;
        }

        public final setIconTintList MenuHostHelper$$ExternalSyntheticLambda0(long j) {
            setTextAlignment();
            eK.MenuHostHelper$$ExternalSyntheticLambda1((eK) this.setIconTintList, j);
            return this;
        }
    }

    /* renamed from: o.eK$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
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
        switch (AnonymousClass1.setX[seticontintlist.ordinal()]) {
            case 1:
                return new eK();
            case 2:
                return new setIconTintList((byte) 0);
            case 3:
                return new iS(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                iP<eK> iPVar2 = PARSER;
                if (iPVar2 == null) {
                    synchronized (eK.class) {
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
        eK eKVar = new eK();
        DEFAULT_INSTANCE = eKVar;
        AbstractC0239il.setY(eK.class, eKVar);
    }

    static /* synthetic */ void setY(eK eKVar, long j) {
        eKVar.bitField0_ |= 1;
        eKVar.clientTimeUs_ = j;
    }

    static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(eK eKVar, long j) {
        eKVar.bitField0_ |= 2;
        eKVar.userTimeUs_ = j;
    }

    static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(eK eKVar, long j) {
        eKVar.bitField0_ |= 4;
        eKVar.systemTimeUs_ = j;
    }
}