package o;

/* loaded from: classes.dex */
public enum vI {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    public static final setY setY = new setY((byte) 0);
    final String setUnboundedRipple;

    vI(String str) {
        this.setUnboundedRipple = str;
    }

    /* loaded from: classes.dex */
    public static final class setY {
        private setY() {
        }

        public /* synthetic */ setY(byte b) {
            this();
        }

        public static vI MenuHostHelper$$ExternalSyntheticLambda1(String str) {
            pN.setY(str, "");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return vI.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return vI.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return vI.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return vI.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return vI.SSL_3_0;
            }
            StringBuilder sb = new StringBuilder("Unexpected TLS version: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}