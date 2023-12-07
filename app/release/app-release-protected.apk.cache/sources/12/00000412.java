package o;

import o.AbstractC0239il;

/* loaded from: classes.dex */
public final class eY extends AbstractC0239il<eY, setX> implements InterfaceC0148fb {
    private static final eY DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile iP<eY> PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    private eY() {
    }

    /* loaded from: classes.dex */
    public static final class setX extends il$MenuHostHelper$$ExternalSyntheticLambda1<eY, setX> implements InterfaceC0148fb {
        /* synthetic */ setX(byte b) {
            this();
        }

        private setX() {
            super(eY.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: o.eY$5  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] MenuHostHelper$$ExternalSyntheticLambda0;

        static {
            int[] iArr = new int[AbstractC0239il.setIconTintList.values().length];
            MenuHostHelper$$ExternalSyntheticLambda0 = iArr;
            try {
                iArr[AbstractC0239il.setIconTintList.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[AbstractC0239il.setIconTintList.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[AbstractC0239il.setIconTintList.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[AbstractC0239il.setIconTintList.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[AbstractC0239il.setIconTintList.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[AbstractC0239il.setIconTintList.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[AbstractC0239il.setIconTintList.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // o.AbstractC0239il
    public final Object setX(AbstractC0239il.setIconTintList seticontintlist) {
        iP iPVar;
        switch (AnonymousClass5.MenuHostHelper$$ExternalSyntheticLambda0[seticontintlist.ordinal()]) {
            case 1:
                return new eY();
            case 2:
                return new setX((byte) 0);
            case 3:
                return new iS(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "dispatchDestination_", eY$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                iP<eY> iPVar2 = PARSER;
                if (iPVar2 == null) {
                    synchronized (eY.class) {
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
        eY eYVar = new eY();
        DEFAULT_INSTANCE = eYVar;
        AbstractC0239il.setY(eY.class, eYVar);
    }
}