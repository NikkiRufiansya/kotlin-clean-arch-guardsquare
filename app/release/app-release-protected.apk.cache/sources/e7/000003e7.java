package o;

import o.AbstractC0239il;

/* loaded from: classes.dex */
public final class eH extends AbstractC0239il<eH, setIconTintList> implements eE {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final eH DEFAULT_INSTANCE;
    private static volatile iP<eH> PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    private eH() {
    }

    public static setIconTintList setX() {
        return DEFAULT_INSTANCE.setTextAlignment();
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList extends il$MenuHostHelper$$ExternalSyntheticLambda1<eH, setIconTintList> implements eE {
        /* synthetic */ setIconTintList(byte b) {
            this();
        }

        private setIconTintList() {
            super(eH.DEFAULT_INSTANCE);
        }

        public final setIconTintList MenuHostHelper$$ExternalSyntheticLambda0(long j) {
            setTextAlignment();
            eH.setX((eH) this.setIconTintList, j);
            return this;
        }

        public final setIconTintList setX(int i) {
            setTextAlignment();
            eH.MenuHostHelper$$ExternalSyntheticLambda1((eH) this.setIconTintList, i);
            return this;
        }
    }

    /* renamed from: o.eH$5  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] setIconTintList;

        static {
            int[] iArr = new int[AbstractC0239il.setIconTintList.values().length];
            setIconTintList = iArr;
            try {
                iArr[AbstractC0239il.setIconTintList.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                setIconTintList[AbstractC0239il.setIconTintList.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                setIconTintList[AbstractC0239il.setIconTintList.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                setIconTintList[AbstractC0239il.setIconTintList.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                setIconTintList[AbstractC0239il.setIconTintList.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                setIconTintList[AbstractC0239il.setIconTintList.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                setIconTintList[AbstractC0239il.setIconTintList.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // o.AbstractC0239il
    public final Object setX(AbstractC0239il.setIconTintList seticontintlist) {
        iP iPVar;
        switch (AnonymousClass5.setIconTintList[seticontintlist.ordinal()]) {
            case 1:
                return new eH();
            case 2:
                return new setIconTintList((byte) 0);
            case 3:
                return new iS(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                iP<eH> iPVar2 = PARSER;
                if (iPVar2 == null) {
                    synchronized (eH.class) {
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
        eH eHVar = new eH();
        DEFAULT_INSTANCE = eHVar;
        AbstractC0239il.setY(eH.class, eHVar);
    }

    static /* synthetic */ void setX(eH eHVar, long j) {
        eHVar.bitField0_ |= 1;
        eHVar.clientTimeUs_ = j;
    }

    static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(eH eHVar, int i) {
        eHVar.bitField0_ |= 2;
        eHVar.usedAppJavaHeapMemoryKb_ = i;
    }
}