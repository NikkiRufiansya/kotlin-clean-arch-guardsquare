package o;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.vn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0544vn {
    public static final C0544vn MenuHostHelper$$ExternalSyntheticLambda0;
    public static final C0544vn MenuHostHelper$$ExternalSyntheticLambda1;
    public static final C0544vn ViewPager$SavedState$1;
    public static final C0544vn setCenterIfNoTextEnabled;
    public static final C0544vn setChipCornerRadius;
    public static final C0544vn setIconSize;
    public static final C0544vn setIconTintList;
    public static final C0544vn setLayoutAnimation;
    public static final C0544vn setMaxEms;
    public static final C0544vn setNavigationOnClickListener;
    public static final C0544vn setOnLongClickListener;
    public static final C0544vn setTextAlignment;
    public static final C0544vn setTextScaleX;
    public static final C0544vn setUiOptions;
    public static final C0544vn setUnboundedRipple;
    public static final C0544vn setX;
    final String setAnimationFromJson;
    public static final setIconTintList setY = new setIconTintList((byte) 0);
    private static final Comparator<String> setZ = new Comparator<String>() { // from class: o.vn$MenuHostHelper$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            pN.setY(str3, "");
            pN.setY(str4, "");
            int min = Math.min(str3.length(), str4.length());
            for (int i = 4; i < min; i++) {
                char charAt = str3.charAt(i);
                char charAt2 = str4.charAt(i);
                if (charAt != charAt2) {
                    return pN.MenuHostHelper$$ExternalSyntheticLambda0((int) charAt, (int) charAt2) >= 0 ? 1 : -1;
                }
            }
            int length = str3.length();
            int length2 = str4.length();
            if (length != length2) {
                return length >= length2 ? 1 : -1;
            }
            return 0;
        }
    };
    private static final Map<String, C0544vn> setOnNavigationItemSelectedListener = new LinkedHashMap();

    private C0544vn(String str) {
        this.setAnimationFromJson = str;
    }

    public /* synthetic */ C0544vn(String str, byte b) {
        this(str);
    }

    public final String toString() {
        return this.setAnimationFromJson;
    }

    /* renamed from: o.vn$setIconTintList */
    /* loaded from: classes.dex */
    public static final class setIconTintList {
        private setIconTintList() {
        }

        public /* synthetic */ setIconTintList(byte b) {
            this();
        }

        public final C0544vn setIconTintList(String str) {
            C0544vn c0544vn;
            String str2;
            synchronized (this) {
                pN.setY(str, "");
                c0544vn = (C0544vn) C0544vn.setOnNavigationItemSelectedListener.get(str);
                if (c0544vn == null) {
                    Map map = C0544vn.setOnNavigationItemSelectedListener;
                    setIconTintList seticontintlist = this;
                    if (qR.setX(str, "TLS_", false)) {
                        StringBuilder sb = new StringBuilder("SSL_");
                        if (str == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        String substring = str.substring(4);
                        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
                        sb.append(substring);
                        str2 = sb.toString();
                    } else if (qR.setX(str, "SSL_", false)) {
                        StringBuilder sb2 = new StringBuilder("TLS_");
                        if (str == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        String substring2 = str.substring(4);
                        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring2, "");
                        sb2.append(substring2);
                        str2 = sb2.toString();
                    } else {
                        str2 = str;
                    }
                    c0544vn = (C0544vn) map.get(str2);
                    if (c0544vn == null) {
                        c0544vn = new C0544vn(str, (byte) 0);
                    }
                    C0544vn.setOnNavigationItemSelectedListener.put(str, c0544vn);
                }
            }
            return c0544vn;
        }
    }

    static {
        setOnNavigationItemSelectedListener.put("SSL_RSA_WITH_NULL_MD5", new C0544vn("SSL_RSA_WITH_NULL_MD5", (byte) 0));
        setOnNavigationItemSelectedListener.put("SSL_RSA_WITH_NULL_SHA", new C0544vn("SSL_RSA_WITH_NULL_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("SSL_RSA_EXPORT_WITH_RC4_40_MD5", new C0544vn("SSL_RSA_EXPORT_WITH_RC4_40_MD5", (byte) 0));
        setOnNavigationItemSelectedListener.put("SSL_RSA_WITH_RC4_128_MD5", new C0544vn("SSL_RSA_WITH_RC4_128_MD5", (byte) 0));
        setOnNavigationItemSelectedListener.put("SSL_RSA_WITH_RC4_128_SHA", new C0544vn("SSL_RSA_WITH_RC4_128_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", new C0544vn("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("SSL_RSA_WITH_DES_CBC_SHA", new C0544vn("SSL_RSA_WITH_DES_CBC_SHA", (byte) 0));
        C0544vn c0544vn = new C0544vn("SSL_RSA_WITH_3DES_EDE_CBC_SHA", (byte) 0);
        setOnNavigationItemSelectedListener.put("SSL_RSA_WITH_3DES_EDE_CBC_SHA", c0544vn);
        ViewPager$SavedState$1 = c0544vn;
        setOnNavigationItemSelectedListener.put("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", new C0544vn("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("SSL_DHE_DSS_WITH_DES_CBC_SHA", new C0544vn("SSL_DHE_DSS_WITH_DES_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", new C0544vn("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", new C0544vn("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("SSL_DHE_RSA_WITH_DES_CBC_SHA", new C0544vn("SSL_DHE_RSA_WITH_DES_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", new C0544vn("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", new C0544vn("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", (byte) 0));
        setOnNavigationItemSelectedListener.put("SSL_DH_anon_WITH_RC4_128_MD5", new C0544vn("SSL_DH_anon_WITH_RC4_128_MD5", (byte) 0));
        setOnNavigationItemSelectedListener.put("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", new C0544vn("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("SSL_DH_anon_WITH_DES_CBC_SHA", new C0544vn("SSL_DH_anon_WITH_DES_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", new C0544vn("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_KRB5_WITH_DES_CBC_SHA", new C0544vn("TLS_KRB5_WITH_DES_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", new C0544vn("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_KRB5_WITH_RC4_128_SHA", new C0544vn("TLS_KRB5_WITH_RC4_128_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_KRB5_WITH_DES_CBC_MD5", new C0544vn("TLS_KRB5_WITH_DES_CBC_MD5", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", new C0544vn("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_KRB5_WITH_RC4_128_MD5", new C0544vn("TLS_KRB5_WITH_RC4_128_MD5", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", new C0544vn("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", new C0544vn("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", new C0544vn("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", new C0544vn("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", (byte) 0));
        C0544vn c0544vn2 = new C0544vn("TLS_RSA_WITH_AES_128_CBC_SHA", (byte) 0);
        setOnNavigationItemSelectedListener.put("TLS_RSA_WITH_AES_128_CBC_SHA", c0544vn2);
        setIconSize = c0544vn2;
        setOnNavigationItemSelectedListener.put("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", new C0544vn("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", new C0544vn("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_DH_anon_WITH_AES_128_CBC_SHA", new C0544vn("TLS_DH_anon_WITH_AES_128_CBC_SHA", (byte) 0));
        C0544vn c0544vn3 = new C0544vn("TLS_RSA_WITH_AES_256_CBC_SHA", (byte) 0);
        setOnNavigationItemSelectedListener.put("TLS_RSA_WITH_AES_256_CBC_SHA", c0544vn3);
        setMaxEms = c0544vn3;
        setOnNavigationItemSelectedListener.put("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", new C0544vn("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", new C0544vn("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_DH_anon_WITH_AES_256_CBC_SHA", new C0544vn("TLS_DH_anon_WITH_AES_256_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_RSA_WITH_NULL_SHA256", new C0544vn("TLS_RSA_WITH_NULL_SHA256", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_RSA_WITH_AES_128_CBC_SHA256", new C0544vn("TLS_RSA_WITH_AES_128_CBC_SHA256", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_RSA_WITH_AES_256_CBC_SHA256", new C0544vn("TLS_RSA_WITH_AES_256_CBC_SHA256", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", new C0544vn("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", new C0544vn("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", new C0544vn("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", new C0544vn("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", new C0544vn("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", new C0544vn("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", new C0544vn("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_DH_anon_WITH_AES_128_CBC_SHA256", new C0544vn("TLS_DH_anon_WITH_AES_128_CBC_SHA256", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_DH_anon_WITH_AES_256_CBC_SHA256", new C0544vn("TLS_DH_anon_WITH_AES_256_CBC_SHA256", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", new C0544vn("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", new C0544vn("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", new C0544vn("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_PSK_WITH_RC4_128_SHA", new C0544vn("TLS_PSK_WITH_RC4_128_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_PSK_WITH_3DES_EDE_CBC_SHA", new C0544vn("TLS_PSK_WITH_3DES_EDE_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_PSK_WITH_AES_128_CBC_SHA", new C0544vn("TLS_PSK_WITH_AES_128_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_PSK_WITH_AES_256_CBC_SHA", new C0544vn("TLS_PSK_WITH_AES_256_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_RSA_WITH_SEED_CBC_SHA", new C0544vn("TLS_RSA_WITH_SEED_CBC_SHA", (byte) 0));
        C0544vn c0544vn4 = new C0544vn("TLS_RSA_WITH_AES_128_GCM_SHA256", (byte) 0);
        setOnNavigationItemSelectedListener.put("TLS_RSA_WITH_AES_128_GCM_SHA256", c0544vn4);
        setChipCornerRadius = c0544vn4;
        C0544vn c0544vn5 = new C0544vn("TLS_RSA_WITH_AES_256_GCM_SHA384", (byte) 0);
        setOnNavigationItemSelectedListener.put("TLS_RSA_WITH_AES_256_GCM_SHA384", c0544vn5);
        setTextScaleX = c0544vn5;
        setOnNavigationItemSelectedListener.put("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", new C0544vn("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", new C0544vn("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", new C0544vn("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", new C0544vn("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_DH_anon_WITH_AES_128_GCM_SHA256", new C0544vn("TLS_DH_anon_WITH_AES_128_GCM_SHA256", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_DH_anon_WITH_AES_256_GCM_SHA384", new C0544vn("TLS_DH_anon_WITH_AES_256_GCM_SHA384", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", new C0544vn("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_FALLBACK_SCSV", new C0544vn("TLS_FALLBACK_SCSV", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDH_ECDSA_WITH_NULL_SHA", new C0544vn("TLS_ECDH_ECDSA_WITH_NULL_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", new C0544vn("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", new C0544vn("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", new C0544vn("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", new C0544vn("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDHE_ECDSA_WITH_NULL_SHA", new C0544vn("TLS_ECDHE_ECDSA_WITH_NULL_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", new C0544vn("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", new C0544vn("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", new C0544vn("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", new C0544vn("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDH_RSA_WITH_NULL_SHA", new C0544vn("TLS_ECDH_RSA_WITH_NULL_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDH_RSA_WITH_RC4_128_SHA", new C0544vn("TLS_ECDH_RSA_WITH_RC4_128_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", new C0544vn("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", new C0544vn("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", new C0544vn("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDHE_RSA_WITH_NULL_SHA", new C0544vn("TLS_ECDHE_RSA_WITH_NULL_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDHE_RSA_WITH_RC4_128_SHA", new C0544vn("TLS_ECDHE_RSA_WITH_RC4_128_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", new C0544vn("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", (byte) 0));
        C0544vn c0544vn6 = new C0544vn("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", (byte) 0);
        setOnNavigationItemSelectedListener.put("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", c0544vn6);
        setUiOptions = c0544vn6;
        C0544vn c0544vn7 = new C0544vn("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", (byte) 0);
        setOnNavigationItemSelectedListener.put("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", c0544vn7);
        setNavigationOnClickListener = c0544vn7;
        setOnNavigationItemSelectedListener.put("TLS_ECDH_anon_WITH_NULL_SHA", new C0544vn("TLS_ECDH_anon_WITH_NULL_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDH_anon_WITH_RC4_128_SHA", new C0544vn("TLS_ECDH_anon_WITH_RC4_128_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", new C0544vn("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", new C0544vn("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", new C0544vn("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", new C0544vn("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", new C0544vn("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", new C0544vn("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", new C0544vn("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", new C0544vn("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", new C0544vn("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", new C0544vn("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", new C0544vn("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", (byte) 0));
        C0544vn c0544vn8 = new C0544vn("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", (byte) 0);
        setOnNavigationItemSelectedListener.put("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", c0544vn8);
        MenuHostHelper$$ExternalSyntheticLambda0 = c0544vn8;
        C0544vn c0544vn9 = new C0544vn("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", (byte) 0);
        setOnNavigationItemSelectedListener.put("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", c0544vn9);
        setOnLongClickListener = c0544vn9;
        setOnNavigationItemSelectedListener.put("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", new C0544vn("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", new C0544vn("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", (byte) 0));
        C0544vn c0544vn10 = new C0544vn("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", (byte) 0);
        setOnNavigationItemSelectedListener.put("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", c0544vn10);
        setLayoutAnimation = c0544vn10;
        C0544vn c0544vn11 = new C0544vn("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", (byte) 0);
        setOnNavigationItemSelectedListener.put("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", c0544vn11);
        setTextAlignment = c0544vn11;
        setOnNavigationItemSelectedListener.put("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", new C0544vn("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", new C0544vn("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", new C0544vn("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", new C0544vn("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", (byte) 0));
        C0544vn c0544vn12 = new C0544vn("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", (byte) 0);
        setOnNavigationItemSelectedListener.put("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", c0544vn12);
        setCenterIfNoTextEnabled = c0544vn12;
        C0544vn c0544vn13 = new C0544vn("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", (byte) 0);
        setOnNavigationItemSelectedListener.put("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", c0544vn13);
        setUnboundedRipple = c0544vn13;
        setOnNavigationItemSelectedListener.put("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", new C0544vn("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", new C0544vn("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", (byte) 0));
        C0544vn c0544vn14 = new C0544vn("TLS_AES_128_GCM_SHA256", (byte) 0);
        setOnNavigationItemSelectedListener.put("TLS_AES_128_GCM_SHA256", c0544vn14);
        setX = c0544vn14;
        C0544vn c0544vn15 = new C0544vn("TLS_AES_256_GCM_SHA384", (byte) 0);
        setOnNavigationItemSelectedListener.put("TLS_AES_256_GCM_SHA384", c0544vn15);
        MenuHostHelper$$ExternalSyntheticLambda1 = c0544vn15;
        C0544vn c0544vn16 = new C0544vn("TLS_CHACHA20_POLY1305_SHA256", (byte) 0);
        setOnNavigationItemSelectedListener.put("TLS_CHACHA20_POLY1305_SHA256", c0544vn16);
        setIconTintList = c0544vn16;
        setOnNavigationItemSelectedListener.put("TLS_AES_128_CCM_SHA256", new C0544vn("TLS_AES_128_CCM_SHA256", (byte) 0));
        setOnNavigationItemSelectedListener.put("TLS_AES_128_CCM_8_SHA256", new C0544vn("TLS_AES_128_CCM_8_SHA256", (byte) 0));
    }
}