package o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class qV extends qS {
    public static /* synthetic */ String setIconTintList(String str) {
        Appendable iconTintList;
        String str2;
        String x;
        pN.setY(str, "");
        pN.setY("|", "");
        pN.setY(str, "");
        pN.setY("", "");
        pN.setY("|", "");
        if (!(!qR.MenuHostHelper$$ExternalSyntheticLambda1((CharSequence) "|"))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        String str3 = str;
        pN.setY(str3, "");
        List iconTintList2 = qI.setIconTintList(qR.setIconTintList((CharSequence) str3));
        int length = str.length();
        int size = iconTintList2.size();
        InterfaceC0377pk<String, String> MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1("");
        pN.setY(iconTintList2, "");
        int size2 = iconTintList2.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : iconTintList2) {
            if (i >= 0) {
                String str4 = (String) obj;
                if ((i == 0 || i == size2) && qR.MenuHostHelper$$ExternalSyntheticLambda1((CharSequence) str4)) {
                    str4 = null;
                } else {
                    String str5 = str4;
                    int length2 = str5.length();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            i2 = -1;
                            break;
                        }
                        char charAt = str5.charAt(i2);
                        if (!(Character.isWhitespace(charAt) || Character.isSpaceChar(charAt))) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 == -1 || !qR.setX(str4, "|", i2, false)) {
                        str2 = null;
                    } else {
                        pN.setX((Object) str4);
                        str2 = str4.substring(i2 + 1);
                        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str2, "");
                    }
                    if (str2 != null && (x = MenuHostHelper$$ExternalSyntheticLambda1.setX(str2)) != null) {
                        str4 = x;
                    }
                }
                if (str4 != null) {
                    arrayList.add(str4);
                }
                i++;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        iconTintList = C0348oi.setIconTintList(arrayList, new StringBuilder(length + (0 * size)), "\n", "", "", -1, "...", null);
        String obj2 = ((StringBuilder) iconTintList).toString();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) obj2, "");
        return obj2;
    }

    public static final String MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        Appendable iconTintList;
        String x;
        pN.setY(str, "");
        pN.setY(str, "");
        pN.setY("", "");
        String str2 = str;
        pN.setY(str2, "");
        List iconTintList2 = qI.setIconTintList(qR.setIconTintList((CharSequence) str2));
        List list = iconTintList2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (true ^ qR.MenuHostHelper$$ExternalSyntheticLambda1((CharSequence) ((String) obj))) {
                arrayList.add(obj);
            }
        }
        ArrayList<String> arrayList2 = arrayList;
        pN.setY(arrayList2, "");
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        for (String str3 : arrayList2) {
            String str4 = str3;
            int length = str4.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                char charAt = str4.charAt(i);
                if (!(Character.isWhitespace(charAt) || Character.isSpaceChar(charAt))) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                i = str3.length();
            }
            arrayList3.add(Integer.valueOf(i));
        }
        Integer num = (Integer) C0348oi.setIconTintList((Iterable<? extends Comparable>) arrayList3);
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        int size = iconTintList2.size();
        InterfaceC0377pk<String, String> MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1("");
        pN.setY(iconTintList2, "");
        int size2 = iconTintList2.size() - 1;
        ArrayList arrayList4 = new ArrayList();
        int i2 = 0;
        for (Object obj2 : list) {
            if (i2 >= 0) {
                String str5 = (String) obj2;
                if ((i2 == 0 || i2 == size2) && qR.MenuHostHelper$$ExternalSyntheticLambda1((CharSequence) str5)) {
                    str5 = null;
                } else {
                    pN.setY(str5, "");
                    if (!(intValue >= 0)) {
                        StringBuilder sb = new StringBuilder("Requested character count ");
                        sb.append(intValue);
                        sb.append(" is less than zero.");
                        throw new IllegalArgumentException(sb.toString().toString());
                    }
                    int length3 = str5.length();
                    if (intValue <= length3) {
                        length3 = intValue;
                    }
                    String substring = str5.substring(length3);
                    pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
                    if (substring != null && (x = MenuHostHelper$$ExternalSyntheticLambda1.setX(substring)) != null) {
                        str5 = x;
                    }
                }
                if (str5 != null) {
                    arrayList4.add(str5);
                }
                i2++;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        iconTintList = C0348oi.setIconTintList(arrayList4, new StringBuilder(length2 + (0 * size)), "\n", "", "", -1, "...", null);
        String obj3 = ((StringBuilder) iconTintList).toString();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) obj3, "");
        return obj3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setY extends pO implements InterfaceC0377pk<String, String> {
        public static final setY MenuHostHelper$$ExternalSyntheticLambda0 = new setY();

        setY() {
            super(1);
        }

        @Override // o.InterfaceC0377pk
        public final /* synthetic */ String setX(String str) {
            String str2 = str;
            pN.setY(str2, "");
            return str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setIconTintList extends pO implements InterfaceC0377pk<String, String> {
        private /* synthetic */ String setY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setIconTintList(String str) {
            super(1);
            this.setY = str;
        }

        @Override // o.InterfaceC0377pk
        public final /* synthetic */ String setX(String str) {
            String str2 = str;
            pN.setY(str2, "");
            StringBuilder sb = new StringBuilder();
            sb.append(this.setY);
            sb.append(str2);
            return sb.toString();
        }
    }

    private static final InterfaceC0377pk<String, String> MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        return str.length() == 0 ? setY.MenuHostHelper$$ExternalSyntheticLambda0 : new setIconTintList(str);
    }
}