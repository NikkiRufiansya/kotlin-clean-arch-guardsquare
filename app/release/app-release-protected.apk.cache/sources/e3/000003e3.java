package o;

import java.util.Map;
import o.AbstractC0239il;
import o.eF;
import o.eJ;

/* loaded from: classes.dex */
public final class eG extends AbstractC0239il<eG, setIconTintList> implements eL {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final eG DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile iP<eG> PARSER;
    public eF androidAppInfo_;
    private int applicationProcessState_;
    public int bitField0_;
    private iA<String, String> customAttributes_ = iA.setX();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    private eG() {
    }

    public static setIconTintList setY() {
        return DEFAULT_INSTANCE.setTextAlignment();
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList extends il$MenuHostHelper$$ExternalSyntheticLambda1<eG, setIconTintList> implements eL {
        /* synthetic */ setIconTintList(byte b) {
            this();
        }

        private setIconTintList() {
            super(eG.DEFAULT_INSTANCE);
        }

        public final setIconTintList setX(String str) {
            setTextAlignment();
            eG.setIconTintList((eG) this.setIconTintList, str);
            return this;
        }

        public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
            return (((eG) this.setIconTintList).bitField0_ & 2) != 0;
        }

        public final setIconTintList MenuHostHelper$$ExternalSyntheticLambda0(String str) {
            setTextAlignment();
            eG.MenuHostHelper$$ExternalSyntheticLambda0((eG) this.setIconTintList, str);
            return this;
        }

        public final setIconTintList setX(eF.setX setx) {
            setTextAlignment();
            eG.setX((eG) this.setIconTintList, setx.ViewPager$SavedState$1());
            return this;
        }

        public final setIconTintList setIconTintList(eJ eJVar) {
            setTextAlignment();
            eG.setIconTintList((eG) this.setIconTintList, eJVar);
            return this;
        }

        public final setIconTintList MenuHostHelper$$ExternalSyntheticLambda0(Map<String, String> map) {
            setTextAlignment();
            eG.MenuHostHelper$$ExternalSyntheticLambda1((eG) this.setIconTintList).putAll(map);
            return this;
        }
    }

    /* renamed from: o.eG$2 */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass2 {
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
        ip$MenuHostHelper$$ExternalSyntheticLambda1 ip_menuhosthelper__externalsyntheticlambda1;
        iP iPVar;
        switch (AnonymousClass2.setIconTintList[seticontintlist.ordinal()]) {
            case 1:
                return new eG();
            case 2:
                return new setIconTintList((byte) 0);
            case 3:
                ip_menuhosthelper__externalsyntheticlambda1 = eJ.setX.setX;
                return new iS(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", ip_menuhosthelper__externalsyntheticlambda1, "customAttributes_", eG$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                iP<eG> iPVar2 = PARSER;
                if (iPVar2 == null) {
                    synchronized (eG.class) {
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
        eG eGVar = new eG();
        DEFAULT_INSTANCE = eGVar;
        AbstractC0239il.setY(eG.class, eGVar);
    }

    public static eG MenuHostHelper$$ExternalSyntheticLambda1() {
        return DEFAULT_INSTANCE;
    }

    static /* synthetic */ void setIconTintList(eG eGVar, String str) {
        eGVar.bitField0_ |= 1;
        eGVar.googleAppId_ = str;
    }

    static /* synthetic */ void setIconTintList(eG eGVar, eJ eJVar) {
        eGVar.applicationProcessState_ = eJVar.MenuHostHelper$$ExternalSyntheticLambda0;
        eGVar.bitField0_ |= 8;
    }

    static /* synthetic */ Map MenuHostHelper$$ExternalSyntheticLambda1(eG eGVar) {
        if (!eGVar.customAttributes_.MenuHostHelper$$ExternalSyntheticLambda0) {
            iA<String, String> iAVar = eGVar.customAttributes_;
            eGVar.customAttributes_ = iAVar.isEmpty() ? new iA<>() : new iA<>(iAVar);
        }
        return eGVar.customAttributes_;
    }

    static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(eG eGVar, String str) {
        eGVar.bitField0_ |= 2;
        eGVar.appInstanceId_ = str;
    }

    static /* synthetic */ void setX(eG eGVar, eF eFVar) {
        eGVar.androidAppInfo_ = eFVar;
        eGVar.bitField0_ |= 4;
    }
}