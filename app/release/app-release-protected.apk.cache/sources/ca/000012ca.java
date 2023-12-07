package o;

import java.net.ProtocolException;

/* renamed from: o.wq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0577wq {
    public static final setIconTintList setIconTintList = new setIconTintList((byte) 0);
    public final String MenuHostHelper$$ExternalSyntheticLambda0;
    public final int MenuHostHelper$$ExternalSyntheticLambda1;
    public final vB setX;

    public C0577wq(vB vBVar, int i, String str) {
        pN.setY(vBVar, "");
        pN.setY(str, "");
        this.setX = vBVar;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.setX == vB.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(' ');
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        String obj = sb.toString();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) obj, "");
        return obj;
    }

    /* renamed from: o.wq$setIconTintList */
    /* loaded from: classes.dex */
    public static final class setIconTintList {
        private setIconTintList() {
        }

        public /* synthetic */ setIconTintList(byte b) {
            this();
        }

        public static C0577wq setX(String str) {
            vB vBVar;
            String str2 = "";
            pN.setY(str, "");
            int i = 9;
            if (qR.setX(str, "HTTP/1.", false)) {
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    StringBuilder sb = new StringBuilder("Unexpected status line: ");
                    sb.append(str);
                    throw new ProtocolException(sb.toString());
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    vBVar = vB.HTTP_1_0;
                } else if (charAt == 1) {
                    vBVar = vB.HTTP_1_1;
                } else {
                    StringBuilder sb2 = new StringBuilder("Unexpected status line: ");
                    sb2.append(str);
                    throw new ProtocolException(sb2.toString());
                }
            } else if (qR.setX(str, "ICY ", false)) {
                vBVar = vB.HTTP_1_0;
                i = 4;
            } else {
                StringBuilder sb3 = new StringBuilder("Unexpected status line: ");
                sb3.append(str);
                throw new ProtocolException(sb3.toString());
            }
            int i2 = i + 3;
            if (str.length() < i2) {
                StringBuilder sb4 = new StringBuilder("Unexpected status line: ");
                sb4.append(str);
                throw new ProtocolException(sb4.toString());
            }
            try {
                String substring = str.substring(i, i2);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
                int parseInt = Integer.parseInt(substring);
                if (str.length() > i2) {
                    if (str.charAt(i2) != ' ') {
                        StringBuilder sb5 = new StringBuilder("Unexpected status line: ");
                        sb5.append(str);
                        throw new ProtocolException(sb5.toString());
                    }
                    String substring2 = str.substring(i + 4);
                    pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring2, "");
                    str2 = substring2;
                }
                return new C0577wq(vBVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                StringBuilder sb6 = new StringBuilder("Unexpected status line: ");
                sb6.append(str);
                throw new ProtocolException(sb6.toString());
            }
        }
    }
}