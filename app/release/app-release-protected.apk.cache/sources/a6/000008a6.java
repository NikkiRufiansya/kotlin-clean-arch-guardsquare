package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.C0402qi;

/* renamed from: o.ra */
/* loaded from: classes.dex */
public class C0421ra extends C0424rd {
    public static /* synthetic */ String MenuHostHelper$$ExternalSyntheticLambda1(String str, String str2) {
        pN.setY(str, "");
        pN.setY(str2, "");
        pN.setY(str, "");
        int x = qR.setX((CharSequence) str, str2, 0, false);
        if (x != -1) {
            String substring = str.substring(0, x);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
            return substring;
        }
        return str;
    }

    public static /* synthetic */ String setIconTintList(String str, String str2) {
        pN.setY(str, "");
        pN.setY(str2, "");
        pN.setY(str, "");
        int x = qR.setX((CharSequence) str, str2, 0, false);
        if (x != -1) {
            String substring = str.substring(x + str2.length(), str.length());
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
            return substring;
        }
        return str;
    }

    public static final String setIconTintList(String str, char c, String str2) {
        pN.setY(str, "");
        pN.setY(str2, "");
        int MenuHostHelper$$ExternalSyntheticLambda0 = qR.MenuHostHelper$$ExternalSyntheticLambda0((CharSequence) str, '.', 0, 6);
        if (MenuHostHelper$$ExternalSyntheticLambda0 != -1) {
            String substring = str.substring(MenuHostHelper$$ExternalSyntheticLambda0 + 1, str.length());
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
            return substring;
        }
        return str2;
    }

    public static final String setX(String str, CharSequence charSequence) {
        boolean x;
        pN.setY(str, "");
        pN.setY(charSequence, "");
        String str2 = str;
        pN.setY(str2, "");
        pN.setY(charSequence, "");
        if (!(str2 instanceof String) || !(charSequence instanceof String)) {
            x = qR.setX(str2, 0, charSequence, 0, charSequence.length(), false);
        } else {
            x = qR.setX(str2, (String) charSequence, false);
        }
        if (x) {
            String substring = str.substring(charSequence.length());
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
            return substring;
        }
        return str;
    }

    public static final boolean setX(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        pN.setY(charSequence, "");
        pN.setY(charSequence2, "");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!qK.MenuHostHelper$$ExternalSyntheticLambda1(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final int setIconTintList(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        pN.setY(charSequence, "");
        pN.setY(cArr, "");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(C0342oc.MenuHostHelper$$ExternalSyntheticLambda1(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        pN.setY(charSequence, "");
        C0405ql c0405ql = new C0405ql(i, charSequence.length() - 1);
        C0408qo c0408qo = new C0408qo(c0405ql.MenuHostHelper$$ExternalSyntheticLambda1, c0405ql.setIconTintList, c0405ql.setX);
        while (c0408qo.hasNext()) {
            int y = c0408qo.setY();
            char charAt = charSequence.charAt(y);
            int length = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = false;
                    continue;
                    break;
                } else if (qK.MenuHostHelper$$ExternalSyntheticLambda1(cArr[i2], charAt, z)) {
                    z2 = true;
                    continue;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                return y;
            }
        }
        return -1;
    }

    public static final int MenuHostHelper$$ExternalSyntheticLambda0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C0405ql c0402qi;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            c0402qi = new C0405ql(i, i2);
        } else {
            pN.setY(charSequence, "");
            int length2 = charSequence.length() - 1;
            if (i > length2) {
                i = length2;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            C0402qi.setX setx = C0402qi.setY;
            c0402qi = new C0402qi(i, i2, -1);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iconTintList = c0402qi.setIconTintList();
            int i3 = c0402qi.setIconTintList;
            int i4 = c0402qi.setX;
            if ((i4 > 0 && iconTintList <= i3) || (i4 < 0 && i3 <= iconTintList)) {
                while (!qR.MenuHostHelper$$ExternalSyntheticLambda1((String) charSequence2, 0, (String) charSequence, iconTintList, charSequence2.length(), z)) {
                    if (iconTintList != i3) {
                        iconTintList += i4;
                    }
                }
                return iconTintList;
            }
        } else {
            int iconTintList2 = c0402qi.setIconTintList();
            int i5 = c0402qi.setIconTintList;
            int i6 = c0402qi.setX;
            if ((i6 > 0 && iconTintList2 <= i5) || (i6 < 0 && i5 <= iconTintList2)) {
                while (!qR.setX(charSequence2, 0, charSequence, iconTintList2, charSequence2.length(), z)) {
                    if (iconTintList2 != i5) {
                        iconTintList2 += i6;
                    }
                }
                return iconTintList2;
            }
        }
        return -1;
    }

    public static final int setX(CharSequence charSequence, char c, int i, boolean z) {
        pN.setY(charSequence, "");
        if (!(charSequence instanceof String)) {
            return qR.setIconTintList(charSequence, new char[]{c}, i, false);
        }
        return ((String) charSequence).indexOf(c, i);
    }

    public static final int setX(CharSequence charSequence, String str, int i, boolean z) {
        pN.setY(charSequence, "");
        pN.setY(str, "");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return MenuHostHelper$$ExternalSyntheticLambda0(charSequence, str, i, charSequence.length(), z, false);
    }

    public static /* synthetic */ int MenuHostHelper$$ExternalSyntheticLambda0(CharSequence charSequence, char c, int i, int i2) {
        boolean z;
        if ((i2 & 2) != 0) {
            pN.setY(charSequence, "");
            i = charSequence.length() - 1;
        }
        pN.setY(charSequence, "");
        boolean z2 = charSequence instanceof String;
        if (!z2) {
            char[] cArr = {c};
            pN.setY(charSequence, "");
            pN.setY(cArr, "");
            if (z2) {
                return ((String) charSequence).lastIndexOf(C0342oc.MenuHostHelper$$ExternalSyntheticLambda1(cArr), i);
            }
            pN.setY(charSequence, "");
            int length = charSequence.length() - 1;
            if (i > length) {
                i = length;
            }
            while (i >= 0) {
                char charAt = charSequence.charAt(i);
                int i3 = 0;
                while (true) {
                    if (i3 > 0) {
                        z = false;
                        break;
                    } else if (qK.MenuHostHelper$$ExternalSyntheticLambda1(cArr[i3], charAt, false)) {
                        z = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (z) {
                    return i;
                }
                i--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c, i);
    }

    public static final boolean setIconTintList(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        pN.setY(charSequence, "");
        pN.setY(charSequence2, "");
        if (charSequence2 instanceof String) {
            if (qR.setX(charSequence, (String) charSequence2, 0, false) >= 0) {
                return true;
            }
        } else if (MenuHostHelper$$ExternalSyntheticLambda0(charSequence, charSequence2, 0, charSequence.length(), false, false) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean setX(CharSequence charSequence, char c) {
        pN.setY(charSequence, "");
        return qR.setX(charSequence, c, 0, false) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.ra$setY */
    /* loaded from: classes.dex */
    public static final class setY extends pO implements InterfaceC0389pw<CharSequence, Integer, nT<? extends Integer, ? extends Integer>> {
        private /* synthetic */ List<String> MenuHostHelper$$ExternalSyntheticLambda0;
        private /* synthetic */ boolean setY = false;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setY(List<String> list, boolean z) {
            super(2);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = list;
        }

        @Override // o.InterfaceC0389pw
        public final /* synthetic */ nT<? extends Integer, ? extends Integer> MenuHostHelper$$ExternalSyntheticLambda0(CharSequence charSequence, Integer num) {
            Object obj;
            nT nTVar;
            Object obj2;
            CharSequence charSequence2 = charSequence;
            int intValue = num.intValue();
            pN.setY(charSequence2, "");
            List<String> list = this.MenuHostHelper$$ExternalSyntheticLambda0;
            boolean z = this.setY;
            if (!z && list.size() == 1) {
                String str = (String) C0348oi.MenuHostHelper$$ExternalSyntheticLambda1((Iterable<? extends Object>) list);
                int x = qR.setX(charSequence2, str, intValue, false);
                if (x >= 0) {
                    nTVar = new nT(Integer.valueOf(x), str);
                }
                nTVar = null;
            } else {
                if (intValue < 0) {
                    intValue = 0;
                }
                C0405ql c0405ql = new C0405ql(intValue, charSequence2.length());
                if (charSequence2 instanceof String) {
                    int iconTintList = c0405ql.setIconTintList();
                    int i = c0405ql.setIconTintList;
                    int i2 = c0405ql.setX;
                    if ((i2 > 0 && iconTintList <= i) || (i2 < 0 && i <= iconTintList)) {
                        while (true) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it.next();
                                String str2 = (String) obj2;
                                if (qR.MenuHostHelper$$ExternalSyntheticLambda1(str2, 0, (String) charSequence2, iconTintList, str2.length(), z)) {
                                    break;
                                }
                            }
                            String str3 = (String) obj2;
                            if (str3 == null) {
                                if (iconTintList == i) {
                                    break;
                                }
                                iconTintList += i2;
                            } else {
                                nTVar = new nT(Integer.valueOf(iconTintList), str3);
                                break;
                            }
                        }
                    }
                    nTVar = null;
                } else {
                    int iconTintList2 = c0405ql.setIconTintList();
                    int i3 = c0405ql.setIconTintList;
                    int i4 = c0405ql.setX;
                    if ((i4 > 0 && iconTintList2 <= i3) || (i4 < 0 && i3 <= iconTintList2)) {
                        while (true) {
                            Iterator<T> it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it2.next();
                                String str4 = (String) obj;
                                if (qR.setX(str4, 0, charSequence2, iconTintList2, str4.length(), z)) {
                                    break;
                                }
                            }
                            String str5 = (String) obj;
                            if (str5 == null) {
                                if (iconTintList2 == i3) {
                                    break;
                                }
                                iconTintList2 += i4;
                            } else {
                                nTVar = new nT(Integer.valueOf(iconTintList2), str5);
                                break;
                            }
                        }
                    }
                    nTVar = null;
                }
            }
            if (nTVar != null) {
                return new nT<>(nTVar.MenuHostHelper$$ExternalSyntheticLambda0, Integer.valueOf(((String) nTVar.setX).length()));
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.ra$setIconTintList */
    /* loaded from: classes.dex */
    public static final class setIconTintList extends pO implements InterfaceC0377pk<C0405ql, String> {
        private /* synthetic */ CharSequence MenuHostHelper$$ExternalSyntheticLambda0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setIconTintList(CharSequence charSequence) {
            super(1);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = charSequence;
        }

        @Override // o.InterfaceC0377pk
        public final /* synthetic */ String setX(C0405ql c0405ql) {
            C0405ql c0405ql2 = c0405ql;
            pN.setY(c0405ql2, "");
            CharSequence charSequence = this.MenuHostHelper$$ExternalSyntheticLambda0;
            pN.setY(charSequence, "");
            pN.setY(c0405ql2, "");
            return charSequence.subSequence(c0405ql2.setIconTintList(), c0405ql2.setIconTintList + 1).toString();
        }
    }

    public static /* synthetic */ List setX(CharSequence charSequence, char[] cArr) {
        pN.setY(charSequence, "");
        pN.setY(cArr, "");
        int length = cArr.length;
        String valueOf = String.valueOf(cArr[0]);
        int x = qR.setX(charSequence, valueOf, 0, false);
        if (x != -1) {
            ArrayList arrayList = new ArrayList(10);
            int i = 0;
            do {
                arrayList.add(charSequence.subSequence(i, x).toString());
                i = valueOf.length() + x;
                x = qR.setX(charSequence, valueOf, i, false);
            } while (x != -1);
            arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
            return arrayList;
        }
        List singletonList = Collections.singletonList(charSequence.toString());
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) singletonList, "");
        return singletonList;
    }

    public static final qC<String> setIconTintList(CharSequence charSequence) {
        pN.setY(charSequence, "");
        String[] strArr = {"\r\n", "\n", "\r"};
        pN.setY(charSequence, "");
        pN.setY(strArr, "");
        pN.setY(strArr, "");
        List asList = Arrays.asList(strArr);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) asList, "");
        qT qTVar = new qT(charSequence, 0, 0, new setY(asList, false));
        setIconTintList seticontintlist = new setIconTintList(charSequence);
        pN.setY(qTVar, "");
        pN.setY(seticontintlist, "");
        return new qO(qTVar, seticontintlist);
    }

    public static final CharSequence MenuHostHelper$$ExternalSyntheticLambda0(CharSequence charSequence) {
        pN.setY(charSequence, "");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char charAt = charSequence.charAt(!z ? i : length);
            boolean z2 = Character.isWhitespace(charAt) || Character.isSpaceChar(charAt);
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }
}