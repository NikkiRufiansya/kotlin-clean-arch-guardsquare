package o;

import o.AbstractC0239il;

/* loaded from: classes.dex */
public final class eF extends AbstractC0239il<eF, setX> implements eI {
    private static final eF DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile iP<eF> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    public int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    private eF() {
    }

    public static setX setIconTintList() {
        return DEFAULT_INSTANCE.setTextAlignment();
    }

    /* loaded from: classes.dex */
    public static final class setX extends il$MenuHostHelper$$ExternalSyntheticLambda1<eF, setX> implements eI {
        /* synthetic */ setX(byte b) {
            this();
        }

        private setX() {
            super(eF.DEFAULT_INSTANCE);
        }

        public final setX setIconTintList(String str) {
            setTextAlignment();
            eF.MenuHostHelper$$ExternalSyntheticLambda0((eF) this.setIconTintList, str);
            return this;
        }

        public final setX MenuHostHelper$$ExternalSyntheticLambda1(String str) {
            setTextAlignment();
            eF.MenuHostHelper$$ExternalSyntheticLambda1((eF) this.setIconTintList, str);
            return this;
        }

        public final setX MenuHostHelper$$ExternalSyntheticLambda0(String str) {
            setTextAlignment();
            eF.setIconTintList((eF) this.setIconTintList, str);
            return this;
        }
    }

    /* renamed from: o.eF$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
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
        switch (AnonymousClass1.MenuHostHelper$$ExternalSyntheticLambda0[seticontintlist.ordinal()]) {
            case 1:
                return new eF();
            case 2:
                return new setX((byte) 0);
            case 3:
                return new iS(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                iP<eF> iPVar2 = PARSER;
                if (iPVar2 == null) {
                    synchronized (eF.class) {
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
        eF eFVar = new eF();
        DEFAULT_INSTANCE = eFVar;
        AbstractC0239il.setY(eF.class, eFVar);
    }

    static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(eF eFVar, String str) {
        eFVar.bitField0_ |= 1;
        eFVar.packageName_ = str;
    }

    static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(eF eFVar, String str) {
        eFVar.bitField0_ |= 2;
        eFVar.sdkVersion_ = str;
    }

    static /* synthetic */ void setIconTintList(eF eFVar, String str) {
        eFVar.bitField0_ |= 4;
        eFVar.versionName_ = str;
    }
}