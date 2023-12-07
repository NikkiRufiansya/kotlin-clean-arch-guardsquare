package o;

import o.AbstractC0239il;
import o.C0243ip;

/* loaded from: classes.dex */
public final class eX extends AbstractC0239il<eX, setX> implements eW {
    private static final eX DEFAULT_INSTANCE;
    private static volatile iP<eX> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final C0243ip.setIconTintList.setX<Integer, eU> sessionVerbosity_converter_ = new C0243ip.setIconTintList.setX<Integer, eU>() { // from class: o.eX.1
    };
    private int bitField0_;
    private String sessionId_ = "";
    public C0243ip.setX sessionVerbosity_ = C0244iq.MenuHostHelper$$ExternalSyntheticLambda1();

    private eX() {
    }

    static {
        eX eXVar = new eX();
        DEFAULT_INSTANCE = eXVar;
        AbstractC0239il.setY(eX.class, eXVar);
    }

    public static setX setIconTintList() {
        return DEFAULT_INSTANCE.setTextAlignment();
    }

    /* loaded from: classes.dex */
    public static final class setX extends il$MenuHostHelper$$ExternalSyntheticLambda1<eX, setX> implements eW {
        /* synthetic */ setX(byte b) {
            this();
        }

        private setX() {
            super(eX.DEFAULT_INSTANCE);
        }

        public final setX MenuHostHelper$$ExternalSyntheticLambda1(String str) {
            setTextAlignment();
            eX.setX((eX) this.setIconTintList, str);
            return this;
        }

        public final setX setX(eU eUVar) {
            setTextAlignment();
            eX.MenuHostHelper$$ExternalSyntheticLambda1((eX) this.setIconTintList, eUVar);
            return this;
        }
    }

    /* renamed from: o.eX$5  reason: invalid class name */
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
                return new eX();
            case 2:
                return new setX((byte) 0);
            case 3:
                return new iS(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", eU.setX()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                iP<eX> iPVar2 = PARSER;
                if (iPVar2 == null) {
                    synchronized (eX.class) {
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

    static /* synthetic */ void setX(eX eXVar, String str) {
        eXVar.bitField0_ |= 1;
        eXVar.sessionId_ = str;
    }

    static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(eX eXVar, eU eUVar) {
        C0243ip.setX setx = eXVar.sessionVerbosity_;
        if (!setx.setY()) {
            int size = setx.size();
            eXVar.sessionVerbosity_ = setx.MenuHostHelper$$ExternalSyntheticLambda1(size == 0 ? 10 : size << 1);
        }
        eXVar.sessionVerbosity_.setIconTintList(eUVar.setY);
    }
}