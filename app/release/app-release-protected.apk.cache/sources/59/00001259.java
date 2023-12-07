package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.C0402qi;

/* renamed from: o.vz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0557vz implements Iterable<nT<? extends String, ? extends String>>, InterfaceC0395qb {
    public static final setX setX = new setX((byte) 0);
    public final String[] setIconTintList;

    public static final C0557vz setIconTintList(String... strArr) {
        return setX.MenuHostHelper$$ExternalSyntheticLambda1(strArr);
    }

    private C0557vz(String[] strArr) {
        this.setIconTintList = strArr;
    }

    public /* synthetic */ C0557vz(String[] strArr, byte b) {
        this(strArr);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0557vz) && Arrays.equals(this.setIconTintList, ((C0557vz) obj).setIconTintList);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.setIconTintList);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.setIconTintList.length / 2;
        for (int i = 0; i < length; i++) {
            String[] strArr = this.setIconTintList;
            int i2 = i << 1;
            String str = strArr[i2];
            String str2 = strArr[i2 + 1];
            sb.append(str);
            sb.append(": ");
            if (vL.setX(str)) {
                str2 = "██";
            }
            sb.append(str2);
            sb.append("\n");
        }
        String obj = sb.toString();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) obj, "");
        return obj;
    }

    /* renamed from: o.vz$setX */
    /* loaded from: classes.dex */
    public static final class setX {
        private setX() {
        }

        public /* synthetic */ setX(byte b) {
            this();
        }

        public static String setY(String[] strArr, String str) {
            boolean equalsIgnoreCase;
            C0402qi.setX setx = C0402qi.setY;
            C0402qi iconTintList = C0412qs.setIconTintList(new C0402qi(strArr.length - 2, 0, -1), 2);
            int iconTintList2 = iconTintList.setIconTintList();
            int i = iconTintList.setIconTintList;
            int i2 = iconTintList.setX;
            if (i2 >= 0) {
                if (iconTintList2 > i) {
                    return null;
                }
            } else if (iconTintList2 < i) {
                return null;
            }
            while (true) {
                String str2 = strArr[iconTintList2];
                if (str == null) {
                    equalsIgnoreCase = str2 == null;
                } else {
                    equalsIgnoreCase = str.equalsIgnoreCase(str2);
                }
                if (equalsIgnoreCase) {
                    return strArr[iconTintList2 + 1];
                }
                if (iconTintList2 == i) {
                    return null;
                }
                iconTintList2 += i2;
            }
        }

        public final C0557vz MenuHostHelper$$ExternalSyntheticLambda1(String... strArr) {
            pN.setY(strArr, "");
            if (!(strArr.length % 2 == 0)) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            Object clone = strArr.clone();
            if (clone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            String[] strArr2 = (String[]) clone;
            int length = strArr2.length;
            for (int i = 0; i < length; i++) {
                String str = strArr2[i];
                if (!(str != null)) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                strArr2[i] = qR.MenuHostHelper$$ExternalSyntheticLambda0((CharSequence) str).toString();
            }
            pN.setY(strArr2, "");
            pN.setY(strArr2, "");
            C0402qi iconTintList = C0412qs.setIconTintList(new C0405ql(0, strArr2.length - 1), 2);
            int iconTintList2 = iconTintList.setIconTintList();
            int i2 = iconTintList.setIconTintList;
            int i3 = iconTintList.setX;
            if (i3 < 0 ? iconTintList2 >= i2 : iconTintList2 <= i2) {
                while (true) {
                    String str2 = strArr2[iconTintList2];
                    String str3 = strArr2[iconTintList2 + 1];
                    MenuHostHelper$$ExternalSyntheticLambda1(str2);
                    setIconTintList(str3, str2);
                    if (iconTintList2 == i2) {
                        break;
                    }
                    iconTintList2 += i3;
                }
            }
            return new C0557vz(strArr2, (byte) 0);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void MenuHostHelper$$ExternalSyntheticLambda1(String str) {
            String str2 = str;
            if (!(str2.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str2.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (!('!' <= charAt && '~' >= charAt)) {
                    throw new IllegalArgumentException(vL.MenuHostHelper$$ExternalSyntheticLambda1("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void setIconTintList(String str, String str2) {
            String obj;
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (!(charAt == '\t' || (' ' <= charAt && '~' >= charAt))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(vL.MenuHostHelper$$ExternalSyntheticLambda1("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                    if (vL.setX(str2)) {
                        obj = "";
                    } else {
                        StringBuilder sb2 = new StringBuilder(": ");
                        sb2.append(str);
                        obj = sb2.toString();
                    }
                    sb.append(obj);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<nT<? extends String, ? extends String>> iterator() {
        int length = this.setIconTintList.length / 2;
        nT[] nTVarArr = new nT[length];
        for (int i = 0; i < length; i++) {
            String[] strArr = this.setIconTintList;
            int i2 = i << 1;
            nTVarArr[i] = new nT(strArr[i2], strArr[i2 + 1]);
        }
        pN.setY(nTVarArr, "");
        return new pG(nTVarArr);
    }

    public final List<String> MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        boolean equalsIgnoreCase;
        pN.setY(str, "");
        int length = this.setIconTintList.length / 2;
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            String str2 = this.setIconTintList[i2];
            if (str == null) {
                equalsIgnoreCase = str2 == null;
            } else {
                equalsIgnoreCase = str.equalsIgnoreCase(str2);
            }
            if (equalsIgnoreCase) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(this.setIconTintList[i2 + 1]);
            }
        }
        if (arrayList != null) {
            List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) unmodifiableList, "");
            return unmodifiableList;
        }
        return C0358os.setIconTintList;
    }
}