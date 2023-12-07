package o;

import o.AbstractC0239il;
import o.C0243ip;
import o.jg;

/* loaded from: classes.dex */
public final class eP extends AbstractC0239il<eP, eP$MenuHostHelper$$ExternalSyntheticLambda0> implements eR {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final eP DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile iP<eP> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    public int bitField0_;
    public long clientStartTimeUs_;
    public int httpMethod_;
    public int httpResponseCode_;
    private int networkClientErrorReason_;
    public long requestPayloadBytes_;
    public long responsePayloadBytes_;
    public long timeToRequestCompletedUs_;
    public long timeToResponseCompletedUs_;
    public long timeToResponseInitiatedUs_;
    private iA<String, String> customAttributes_ = iA.setX();
    public String url_ = "";
    private String responseContentType_ = "";
    public C0243ip.setY<eX> perfSessions_ = iR.setIconTintList();

    /* loaded from: classes.dex */
    static final class setY {
        static final C0250iw<String, String> MenuHostHelper$$ExternalSyntheticLambda0 = new C0250iw<>(jg.setIconTintList.STRING, "", jg.setIconTintList.STRING, "");
    }

    private eP() {
    }

    /* loaded from: classes.dex */
    public enum setX implements ip$MenuHostHelper$$ExternalSyntheticLambda0 {
        /* JADX INFO: Fake field, exist only in values array */
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);
        
        final int setY;

        static {
            new Object() { // from class: o.eP.setX.4
            };
        }

        @Override // o.ip$MenuHostHelper$$ExternalSyntheticLambda0
        public final int MenuHostHelper$$ExternalSyntheticLambda1() {
            return this.setY;
        }

        public static ip$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList() {
            return setIconTintList.setX;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class setIconTintList implements ip$MenuHostHelper$$ExternalSyntheticLambda1 {
            static final ip$MenuHostHelper$$ExternalSyntheticLambda1 setX = new setIconTintList();

            private setIconTintList() {
            }
        }

        setX(int i) {
            this.setY = i;
        }
    }

    public static eP$MenuHostHelper$$ExternalSyntheticLambda0 setY() {
        return DEFAULT_INSTANCE.setTextAlignment();
    }

    /* renamed from: o.eP$4  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[AbstractC0239il.setIconTintList.values().length];
            setY = iArr;
            try {
                iArr[AbstractC0239il.setIconTintList.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                setY[AbstractC0239il.setIconTintList.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                setY[AbstractC0239il.setIconTintList.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                setY[AbstractC0239il.setIconTintList.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                setY[AbstractC0239il.setIconTintList.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                setY[AbstractC0239il.setIconTintList.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                setY[AbstractC0239il.setIconTintList.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // o.AbstractC0239il
    public final Object setX(AbstractC0239il.setIconTintList seticontintlist) {
        iP iPVar;
        switch (AnonymousClass4.setY[seticontintlist.ordinal()]) {
            case 1:
                return new eP();
            case 2:
                return new eP$MenuHostHelper$$ExternalSyntheticLambda0((byte) 0);
            case 3:
                return new iS(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", eP$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", setX.setIconTintList(), "customAttributes_", setY.MenuHostHelper$$ExternalSyntheticLambda0, "perfSessions_", eX.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                iP<eP> iPVar2 = PARSER;
                if (iPVar2 == null) {
                    synchronized (eP.class) {
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
        eP ePVar = new eP();
        DEFAULT_INSTANCE = ePVar;
        AbstractC0239il.setY(eP.class, ePVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void setY(eP ePVar, String str) {
        ePVar.bitField0_ |= 1;
        ePVar.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(eP ePVar, setX setx) {
        ePVar.networkClientErrorReason_ = setx.setY;
        ePVar.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(eP ePVar, int i) {
        ePVar.bitField0_ |= 32;
        ePVar.httpResponseCode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void setX(eP ePVar, String str) {
        ePVar.bitField0_ |= 64;
        ePVar.responseContentType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void setY(eP ePVar) {
        ePVar.bitField0_ &= -65;
        ePVar.responseContentType_ = DEFAULT_INSTANCE.responseContentType_;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void setY(eP ePVar, long j) {
        ePVar.bitField0_ |= 128;
        ePVar.clientStartTimeUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(eP ePVar, long j) {
        ePVar.bitField0_ |= 256;
        ePVar.timeToRequestCompletedUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(eP ePVar, long j) {
        ePVar.bitField0_ |= 512;
        ePVar.timeToResponseInitiatedUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void setIconTintList(eP ePVar, long j) {
        ePVar.bitField0_ |= 1024;
        ePVar.timeToResponseCompletedUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(eP ePVar, Iterable iterable) {
        C0243ip.setY<eX> sety = ePVar.perfSessions_;
        if (!sety.setY()) {
            int size = sety.size();
            ePVar.perfSessions_ = sety.setX(size == 0 ? 10 : size << 1);
        }
        hU.MenuHostHelper$$ExternalSyntheticLambda1(iterable, ePVar.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void setX(eP ePVar, eP$MenuHostHelper$$ExternalSyntheticLambda1 ep_menuhosthelper__externalsyntheticlambda1) {
        ePVar.httpMethod_ = ep_menuhosthelper__externalsyntheticlambda1.setIconSize;
        ePVar.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void setX(eP ePVar, long j) {
        ePVar.bitField0_ |= 4;
        ePVar.requestPayloadBytes_ = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void setLayoutAnimation(eP ePVar, long j) {
        ePVar.bitField0_ |= 8;
        ePVar.responsePayloadBytes_ = j;
    }
}