package o;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import o.C0405ql;
import o.C0555vx;

/* loaded from: classes.dex */
public final class vx$MenuHostHelper$$ExternalSyntheticLambda1 {
    private vx$MenuHostHelper$$ExternalSyntheticLambda1() {
    }

    public /* synthetic */ vx$MenuHostHelper$$ExternalSyntheticLambda1(byte b) {
        this();
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        pN.setY(str, "");
        int hashCode = str.hashCode();
        if (hashCode == 3213448) {
            if (str.equals("http")) {
                return 80;
            }
        } else if (hashCode == 99617003 && str.equals("https")) {
            return 443;
        }
        return -1;
    }

    public static void setIconTintList(List<String> list, StringBuilder sb) {
        C0405ql c0405ql;
        pN.setY(list, "");
        pN.setY(sb, "");
        int size = list.size();
        if (size <= Integer.MIN_VALUE) {
            C0405ql.setY sety = C0405ql.setLayoutAnimation;
            c0405ql = C0405ql.setNavigationOnClickListener;
        } else {
            c0405ql = new C0405ql(0, size - 1);
        }
        C0402qi iconTintList = C0412qs.setIconTintList(c0405ql, 2);
        int iconTintList2 = iconTintList.setIconTintList();
        int i = iconTintList.setIconTintList;
        int i2 = iconTintList.setX;
        if (i2 >= 0) {
            if (iconTintList2 > i) {
                return;
            }
        } else if (iconTintList2 < i) {
            return;
        }
        while (true) {
            String str = list.get(iconTintList2);
            String str2 = list.get(iconTintList2 + 1);
            if (iconTintList2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (iconTintList2 == i) {
                return;
            }
            iconTintList2 += i2;
        }
    }

    public static List<String> setIconTintList(String str) {
        pN.setY(str, "");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            String str2 = str;
            int x = qR.setX((CharSequence) str2, '&', i, false);
            if (x == -1) {
                x = str.length();
            }
            int x2 = qR.setX((CharSequence) str2, '=', i, false);
            if (x2 == -1 || x2 > x) {
                String substring = str.substring(i, x);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i, x2);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring2, "");
                arrayList.add(substring2);
                String substring3 = str.substring(x2 + 1, x);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring3, "");
                arrayList.add(substring3);
            }
            i = x + 1;
        }
        return arrayList;
    }

    public final C0555vx MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        pN.setY(str, "");
        try {
            vx$MenuHostHelper$$ExternalSyntheticLambda1 vx_menuhosthelper__externalsyntheticlambda1 = this;
            pN.setY(str, "");
            return new C0555vx.setIconTintList().setX((C0555vx) null, str).setY();
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static /* synthetic */ String MenuHostHelper$$ExternalSyntheticLambda1(vx$MenuHostHelper$$ExternalSyntheticLambda1 vx_menuhosthelper__externalsyntheticlambda1, String str, int i, int i2, boolean z, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return vx_menuhosthelper__externalsyntheticlambda1.setX(str, i, i2, z);
    }

    private String setX(String str, int i, int i2, boolean z) {
        pN.setY(str, "");
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C0602xo c0602xo = new C0602xo();
                c0602xo.MenuHostHelper$$ExternalSyntheticLambda0(str, i, i3);
                MenuHostHelper$$ExternalSyntheticLambda1(c0602xo, str, i3, i2, z);
                return c0602xo.setY(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0, qQ.setIconTintList);
            }
        }
        String substring = str.substring(i, i2);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
        return substring;
    }

    private static void MenuHostHelper$$ExternalSyntheticLambda1(C0602xo c0602xo, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            if (str != null) {
                int codePointAt = str.codePointAt(i);
                if (codePointAt == 37 && (i3 = i + 2) < i2) {
                    int MenuHostHelper$$ExternalSyntheticLambda0 = vL.MenuHostHelper$$ExternalSyntheticLambda0(str.charAt(i + 1));
                    int MenuHostHelper$$ExternalSyntheticLambda02 = vL.MenuHostHelper$$ExternalSyntheticLambda0(str.charAt(i3));
                    if (MenuHostHelper$$ExternalSyntheticLambda0 != -1 && MenuHostHelper$$ExternalSyntheticLambda02 != -1) {
                        c0602xo.MenuHostHelper$$ExternalSyntheticLambda0((MenuHostHelper$$ExternalSyntheticLambda0 << 4) + MenuHostHelper$$ExternalSyntheticLambda02);
                        i = Character.charCount(codePointAt) + i3;
                    }
                    c0602xo.setNavigationOnClickListener(codePointAt);
                    i += Character.charCount(codePointAt);
                } else {
                    if (codePointAt == 43 && z) {
                        c0602xo.MenuHostHelper$$ExternalSyntheticLambda0(32);
                        i++;
                    }
                    c0602xo.setNavigationOnClickListener(codePointAt);
                    i += Character.charCount(codePointAt);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
    }

    private static boolean setX(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && vL.MenuHostHelper$$ExternalSyntheticLambda0(str.charAt(i + 1)) != -1 && vL.MenuHostHelper$$ExternalSyntheticLambda0(str.charAt(i3)) != -1;
    }

    public static /* synthetic */ String setX(vx$MenuHostHelper$$ExternalSyntheticLambda1 vx_menuhosthelper__externalsyntheticlambda1, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3) {
        return vx_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0(str, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? str.length() : i2, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? false : z4, (i3 & 128) != 0 ? null : charset);
    }

    public String MenuHostHelper$$ExternalSyntheticLambda0(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        pN.setY(str, "");
        pN.setY(str2, "");
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z4) || qR.setX(str2, (char) codePointAt) || ((codePointAt == 37 && (!z || (z2 && !setX(str, i3, i2)))) || (codePointAt == 43 && z3)))) {
                C0602xo c0602xo = new C0602xo();
                c0602xo.MenuHostHelper$$ExternalSyntheticLambda0(str, i, i3);
                MenuHostHelper$$ExternalSyntheticLambda0(c0602xo, str, i3, i2, str2, z, z2, z3, z4, charset);
                return c0602xo.setY(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0, qQ.setIconTintList);
            }
            i3 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i, i2);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
        return substring;
    }

    private final void MenuHostHelper$$ExternalSyntheticLambda0(C0602xo c0602xo, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        char[] cArr;
        char[] cArr2;
        C0602xo c0602xo2 = null;
        int i3 = i;
        while (i3 < i2) {
            if (str != null) {
                int codePointAt = str.codePointAt(i3);
                if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                    if (codePointAt == 43 && z3) {
                        String str3 = z ? "+" : "%2B";
                        pN.setY(str3, "");
                        c0602xo.MenuHostHelper$$ExternalSyntheticLambda0(str3, 0, str3.length());
                    } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z4) || qR.setX(str2, (char) codePointAt) || (codePointAt == 37 && (!z || (z2 && !setX(str, i3, i2)))))) {
                        if (c0602xo2 == null) {
                            c0602xo2 = new C0602xo();
                        }
                        if (charset == null || pN.MenuHostHelper$$ExternalSyntheticLambda0(charset, StandardCharsets.UTF_8)) {
                            c0602xo2.setNavigationOnClickListener(codePointAt);
                        } else {
                            int charCount = Character.charCount(codePointAt) + i3;
                            pN.setY(str, "");
                            pN.setY(charset, "");
                            if (!(i3 >= 0)) {
                                StringBuilder sb = new StringBuilder("beginIndex < 0: ");
                                sb.append(i3);
                                throw new IllegalArgumentException(sb.toString().toString());
                            }
                            if (!(charCount >= i3)) {
                                StringBuilder sb2 = new StringBuilder("endIndex < beginIndex: ");
                                sb2.append(charCount);
                                sb2.append(" < ");
                                sb2.append(i3);
                                throw new IllegalArgumentException(sb2.toString().toString());
                            }
                            if (!(charCount <= str.length())) {
                                StringBuilder sb3 = new StringBuilder("endIndex > string.length: ");
                                sb3.append(charCount);
                                sb3.append(" > ");
                                sb3.append(str.length());
                                throw new IllegalArgumentException(sb3.toString().toString());
                            } else if (pN.MenuHostHelper$$ExternalSyntheticLambda0(charset, qQ.setIconTintList)) {
                                c0602xo2.MenuHostHelper$$ExternalSyntheticLambda0(str, i3, charCount);
                            } else {
                                String substring = str.substring(i3, charCount);
                                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
                                if (substring == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                }
                                byte[] bytes = substring.getBytes(charset);
                                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) bytes, "");
                                c0602xo2.setY(bytes, 0, bytes.length);
                            }
                        }
                        while (true) {
                            if (!(c0602xo2.MenuHostHelper$$ExternalSyntheticLambda0 == 0)) {
                                int unboundedRipple = c0602xo2.setUnboundedRipple() & 255;
                                c0602xo.MenuHostHelper$$ExternalSyntheticLambda0(37);
                                cArr = C0555vx.setUnboundedRipple;
                                c0602xo.MenuHostHelper$$ExternalSyntheticLambda0((int) cArr[(unboundedRipple >> 4) & 15]);
                                cArr2 = C0555vx.setUnboundedRipple;
                                c0602xo.MenuHostHelper$$ExternalSyntheticLambda0((int) cArr2[unboundedRipple & 15]);
                            }
                        }
                    } else {
                        c0602xo.setNavigationOnClickListener(codePointAt);
                    }
                }
                i3 += Character.charCount(codePointAt);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
    }
}