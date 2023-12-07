package o;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.vx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0555vx {
    public static final vx$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0 = new vx$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);
    private static final char[] setUnboundedRipple = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private final String setCenterIfNoTextEnabled;
    private final String setChipCornerRadius;
    public final int setIconTintList;
    public final String setLayoutAnimation;
    public final List<String> setNavigationOnClickListener;
    private final String setOnLongClickListener;
    private final String setUiOptions;
    public final List<String> setX;
    public final String setY;

    public static final C0555vx setIconTintList(String str) {
        return MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(str);
    }

    public C0555vx(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        pN.setY(str, "");
        pN.setY(str2, "");
        pN.setY(str3, "");
        pN.setY(str4, "");
        pN.setY(list, "");
        pN.setY(str6, "");
        this.setLayoutAnimation = str;
        this.setCenterIfNoTextEnabled = str2;
        this.setUiOptions = str3;
        this.setY = str4;
        this.setIconTintList = i;
        this.setX = list;
        this.setNavigationOnClickListener = list2;
        this.setOnLongClickListener = str5;
        this.setChipCornerRadius = str6;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str, (Object) "https");
    }

    public final URL setUiOptions() {
        try {
            return new URL(this.setChipCornerRadius);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final URI setLayoutAnimation() {
        setIconTintList unboundedRipple = setUnboundedRipple();
        String str = unboundedRipple.setUiOptions;
        unboundedRipple.setUiOptions = str != null ? new qP("[\"<>^`{|}]").setY(str, "") : null;
        int size = unboundedRipple.setX.size();
        for (int i = 0; i < size; i++) {
            unboundedRipple.setX.set(i, vx$MenuHostHelper$$ExternalSyntheticLambda1.setX(MenuHostHelper$$ExternalSyntheticLambda0, unboundedRipple.setX.get(i), 0, 0, "[]", true, true, false, false, null, 227));
        }
        List<String> list = unboundedRipple.setIconTintList;
        if (list != null) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = list.get(i2);
                list.set(i2, str2 != null ? vx$MenuHostHelper$$ExternalSyntheticLambda1.setX(MenuHostHelper$$ExternalSyntheticLambda0, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195) : null);
            }
        }
        String str3 = unboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0;
        unboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0 = str3 != null ? vx$MenuHostHelper$$ExternalSyntheticLambda1.setX(MenuHostHelper$$ExternalSyntheticLambda0, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163) : null;
        String obj = unboundedRipple.toString();
        try {
            return new URI(obj);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new qP("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").setY(obj, ""));
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) create, "");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String setOnLongClickListener() {
        if (this.setCenterIfNoTextEnabled.length() == 0) {
            return "";
        }
        int length = this.setLayoutAnimation.length() + 3;
        String str = this.setChipCornerRadius;
        int x = vL.setX(str, ":@", length, str.length());
        String str2 = this.setChipCornerRadius;
        if (str2 != null) {
            String substring = str2.substring(length, x);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final String setIconTintList() {
        if (this.setUiOptions.length() == 0) {
            return "";
        }
        int x = qR.setX((CharSequence) this.setChipCornerRadius, ':', this.setLayoutAnimation.length() + 3, false);
        int x2 = qR.setX((CharSequence) this.setChipCornerRadius, '@', 0, false);
        String str = this.setChipCornerRadius;
        if (str != null) {
            String substring = str.substring(x + 1, x2);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final String MenuHostHelper$$ExternalSyntheticLambda0() {
        int x = qR.setX((CharSequence) this.setChipCornerRadius, '/', this.setLayoutAnimation.length() + 3, false);
        String str = this.setChipCornerRadius;
        int x2 = vL.setX(str, "?#", x, str.length());
        String str2 = this.setChipCornerRadius;
        if (str2 != null) {
            String substring = str2.substring(x, x2);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final List<String> MenuHostHelper$$ExternalSyntheticLambda1() {
        int x = qR.setX((CharSequence) this.setChipCornerRadius, '/', this.setLayoutAnimation.length() + 3, false);
        String str = this.setChipCornerRadius;
        int x2 = vL.setX(str, "?#", x, str.length());
        ArrayList arrayList = new ArrayList();
        while (x < x2) {
            int i = x + 1;
            int MenuHostHelper$$ExternalSyntheticLambda1 = vL.MenuHostHelper$$ExternalSyntheticLambda1(this.setChipCornerRadius, '/', i, x2);
            String str2 = this.setChipCornerRadius;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String substring = str2.substring(i, MenuHostHelper$$ExternalSyntheticLambda1);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
            arrayList.add(substring);
            x = MenuHostHelper$$ExternalSyntheticLambda1;
        }
        return arrayList;
    }

    public final String setY() {
        if (this.setNavigationOnClickListener == null) {
            return null;
        }
        int x = qR.setX((CharSequence) this.setChipCornerRadius, '?', 0, false) + 1;
        String str = this.setChipCornerRadius;
        int MenuHostHelper$$ExternalSyntheticLambda1 = vL.MenuHostHelper$$ExternalSyntheticLambda1(str, '#', x, str.length());
        String str2 = this.setChipCornerRadius;
        if (str2 != null) {
            String substring = str2.substring(x, MenuHostHelper$$ExternalSyntheticLambda1);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private String setNavigationOnClickListener() {
        if (this.setOnLongClickListener == null) {
            return null;
        }
        int x = qR.setX((CharSequence) this.setChipCornerRadius, '#', 0, false);
        String str = this.setChipCornerRadius;
        if (str != null) {
            String substring = str.substring(x + 1);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final setIconTintList setUnboundedRipple() {
        setIconTintList seticontintlist = new setIconTintList();
        seticontintlist.setNavigationOnClickListener = this.setLayoutAnimation;
        String onLongClickListener = setOnLongClickListener();
        pN.setY(onLongClickListener, "");
        seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 = onLongClickListener;
        String iconTintList = setIconTintList();
        pN.setY(iconTintList, "");
        seticontintlist.setY = iconTintList;
        seticontintlist.setUiOptions = this.setY;
        seticontintlist.setUnboundedRipple = this.setIconTintList != vx$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(this.setLayoutAnimation) ? this.setIconTintList : -1;
        seticontintlist.setX.clear();
        seticontintlist.setX.addAll(MenuHostHelper$$ExternalSyntheticLambda1());
        seticontintlist.setIconTintList(setY());
        seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0 = setNavigationOnClickListener();
        return seticontintlist;
    }

    public final setIconTintList setY(String str) {
        pN.setY(str, "");
        try {
            return new setIconTintList().setX(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0555vx) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) ((C0555vx) obj).setChipCornerRadius, (Object) this.setChipCornerRadius);
    }

    public final int hashCode() {
        return this.setChipCornerRadius.hashCode();
    }

    public final String toString() {
        return this.setChipCornerRadius;
    }

    /* renamed from: o.vx$setIconTintList */
    /* loaded from: classes.dex */
    public static final class setIconTintList {
        private static vx$setIconTintList$MenuHostHelper$$ExternalSyntheticLambda1 setLayoutAnimation = new vx$setIconTintList$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);
        public String MenuHostHelper$$ExternalSyntheticLambda0;
        public List<String> setIconTintList;
        String setNavigationOnClickListener;
        String setUiOptions;
        final List<String> setX;
        String MenuHostHelper$$ExternalSyntheticLambda1 = "";
        String setY = "";
        int setUnboundedRipple = -1;

        public setIconTintList() {
            ArrayList arrayList = new ArrayList();
            this.setX = arrayList;
            arrayList.add("");
        }

        public final setIconTintList MenuHostHelper$$ExternalSyntheticLambda0(String str) {
            pN.setY(str, "");
            this.MenuHostHelper$$ExternalSyntheticLambda1 = vx$MenuHostHelper$$ExternalSyntheticLambda1.setX(C0555vx.MenuHostHelper$$ExternalSyntheticLambda0, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
            return this;
        }

        public final setIconTintList MenuHostHelper$$ExternalSyntheticLambda1(String str) {
            pN.setY(str, "");
            this.setY = vx$MenuHostHelper$$ExternalSyntheticLambda1.setX(C0555vx.MenuHostHelper$$ExternalSyntheticLambda0, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
            return this;
        }

        public final setIconTintList setIconTintList(String str) {
            List<String> list;
            String x;
            if (str == null || (x = vx$MenuHostHelper$$ExternalSyntheticLambda1.setX(C0555vx.MenuHostHelper$$ExternalSyntheticLambda0, str, 0, 0, " \"'<>#", true, false, true, false, null, 211)) == null) {
                list = null;
            } else {
                vx$MenuHostHelper$$ExternalSyntheticLambda1 vx_menuhosthelper__externalsyntheticlambda1 = C0555vx.MenuHostHelper$$ExternalSyntheticLambda0;
                list = vx$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(x);
            }
            this.setIconTintList = list;
            return this;
        }

        public final setIconTintList setIconTintList(String str, String str2) {
            pN.setY(str, "");
            if (this.setIconTintList == null) {
                this.setIconTintList = new ArrayList();
            }
            List<String> list = this.setIconTintList;
            pN.setX(list);
            list.add(vx$MenuHostHelper$$ExternalSyntheticLambda1.setX(C0555vx.MenuHostHelper$$ExternalSyntheticLambda0, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219));
            List<String> list2 = this.setIconTintList;
            pN.setX(list2);
            list2.add(str2 != null ? vx$MenuHostHelper$$ExternalSyntheticLambda1.setX(C0555vx.MenuHostHelper$$ExternalSyntheticLambda0, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219) : null);
            return this;
        }

        public final setIconTintList setX(String str, String str2) {
            pN.setY(str, "");
            if (this.setIconTintList == null) {
                this.setIconTintList = new ArrayList();
            }
            List<String> list = this.setIconTintList;
            pN.setX(list);
            list.add(vx$MenuHostHelper$$ExternalSyntheticLambda1.setX(C0555vx.MenuHostHelper$$ExternalSyntheticLambda0, str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211));
            List<String> list2 = this.setIconTintList;
            pN.setX(list2);
            list2.add(str2 != null ? vx$MenuHostHelper$$ExternalSyntheticLambda1.setX(C0555vx.MenuHostHelper$$ExternalSyntheticLambda0, str2, 0, 0, " \"'<>#&=", true, false, true, false, null, 211) : null);
            return this;
        }

        public final C0555vx setY() {
            ArrayList arrayList;
            String str = this.setNavigationOnClickListener;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String MenuHostHelper$$ExternalSyntheticLambda1 = vx$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(C0555vx.MenuHostHelper$$ExternalSyntheticLambda0, this.MenuHostHelper$$ExternalSyntheticLambda1, 0, 0, false, 7);
            String MenuHostHelper$$ExternalSyntheticLambda12 = vx$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(C0555vx.MenuHostHelper$$ExternalSyntheticLambda0, this.setY, 0, 0, false, 7);
            String str2 = this.setUiOptions;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int i = this.setUnboundedRipple;
            if (i == -1) {
                vx$MenuHostHelper$$ExternalSyntheticLambda1 vx_menuhosthelper__externalsyntheticlambda1 = C0555vx.MenuHostHelper$$ExternalSyntheticLambda0;
                String str3 = this.setNavigationOnClickListener;
                pN.setX((Object) str3);
                i = vx$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(str3);
            }
            int i2 = i;
            List<String> list = this.setX;
            pN.setY(list, "");
            ArrayList arrayList2 = new ArrayList(list instanceof Collection ? list.size() : 10);
            for (String str4 : list) {
                arrayList2.add(vx$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(C0555vx.MenuHostHelper$$ExternalSyntheticLambda0, str4, 0, 0, false, 7));
            }
            ArrayList arrayList3 = arrayList2;
            List<String> list2 = this.setIconTintList;
            if (list2 != null) {
                List<String> list3 = list2;
                pN.setY(list3, "");
                ArrayList arrayList4 = new ArrayList(list3 instanceof Collection ? list3.size() : 10);
                for (String str5 : list3) {
                    arrayList4.add(str5 != null ? vx$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(C0555vx.MenuHostHelper$$ExternalSyntheticLambda0, str5, 0, 0, true, 3) : null);
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            String str6 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            return new C0555vx(str, MenuHostHelper$$ExternalSyntheticLambda1, MenuHostHelper$$ExternalSyntheticLambda12, str2, i2, arrayList3, arrayList, str6 != null ? vx$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(C0555vx.MenuHostHelper$$ExternalSyntheticLambda0, str6, 0, 0, false, 7) : null, toString());
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
            if ((r6.setY.length() > 0) != false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
            if (r1 != o.vx$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(r2)) goto L43;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 248
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0555vx.setIconTintList.toString():java.lang.String");
        }

        public final setIconTintList setX(C0555vx c0555vx, String str) {
            int x;
            int i;
            boolean z;
            boolean z2;
            char c;
            pN.setY(str, "");
            int iconTintList = vL.setIconTintList(str);
            int y = vL.setY(str, iconTintList);
            int x2 = vx$setIconTintList$MenuHostHelper$$ExternalSyntheticLambda1.setX(str, iconTintList, y);
            char c2 = 65535;
            if (x2 != -1) {
                if (qR.setX(str, "https:", iconTintList, true)) {
                    this.setNavigationOnClickListener = "https";
                    iconTintList += 6;
                } else if (qR.setX(str, "http:", iconTintList, true)) {
                    this.setNavigationOnClickListener = "http";
                    iconTintList += 5;
                } else {
                    StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str.substring(0, x2);
                    pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
                    sb.append(substring);
                    sb.append("'");
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (c0555vx != null) {
                this.setNavigationOnClickListener = c0555vx.setLayoutAnimation;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int iconTintList2 = vx$setIconTintList$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(str, iconTintList, y);
            char c3 = '?';
            char c4 = '#';
            if (iconTintList2 < 2 && c0555vx != null && !(!pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) c0555vx.setLayoutAnimation, (Object) this.setNavigationOnClickListener))) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = c0555vx.setOnLongClickListener();
                this.setY = c0555vx.setIconTintList();
                this.setUiOptions = c0555vx.setY;
                this.setUnboundedRipple = c0555vx.setIconTintList;
                this.setX.clear();
                this.setX.addAll(c0555vx.MenuHostHelper$$ExternalSyntheticLambda1());
                if (iconTintList == y || str.charAt(iconTintList) == '#') {
                    setIconTintList(c0555vx.setY());
                }
            } else {
                int i2 = iconTintList + iconTintList2;
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    x = vL.setX(str, "@/\\?#", i2, y);
                    char charAt = x != y ? str.charAt(x) : (char) 65535;
                    if (charAt == c2 || charAt == c4 || charAt == '/' || charAt == '\\' || charAt == c3) {
                        break;
                    }
                    if (charAt == '@') {
                        if (!z3) {
                            int MenuHostHelper$$ExternalSyntheticLambda1 = vL.MenuHostHelper$$ExternalSyntheticLambda1(str, ':', i2, x);
                            String x3 = vx$MenuHostHelper$$ExternalSyntheticLambda1.setX(C0555vx.MenuHostHelper$$ExternalSyntheticLambda0, str, i2, MenuHostHelper$$ExternalSyntheticLambda1, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240);
                            if (z4) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
                                sb2.append("%40");
                                sb2.append(x3);
                                x3 = sb2.toString();
                            }
                            this.MenuHostHelper$$ExternalSyntheticLambda1 = x3;
                            if (MenuHostHelper$$ExternalSyntheticLambda1 != x) {
                                this.setY = vx$MenuHostHelper$$ExternalSyntheticLambda1.setX(C0555vx.MenuHostHelper$$ExternalSyntheticLambda0, str, MenuHostHelper$$ExternalSyntheticLambda1 + 1, x, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240);
                                z2 = true;
                            } else {
                                z2 = z3;
                            }
                            z3 = z2;
                            i = x;
                            z = true;
                        } else {
                            i = x;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.setY);
                            sb3.append("%40");
                            sb3.append(vx$MenuHostHelper$$ExternalSyntheticLambda1.setX(C0555vx.MenuHostHelper$$ExternalSyntheticLambda0, str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240));
                            this.setY = sb3.toString();
                            z = z4;
                        }
                        i2 = i + 1;
                        z4 = z;
                    }
                    c4 = '#';
                    c3 = '?';
                    c2 = 65535;
                }
                int MenuHostHelper$$ExternalSyntheticLambda12 = vx$setIconTintList$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(str, i2, x);
                int i3 = MenuHostHelper$$ExternalSyntheticLambda12 + 1;
                if (i3 < x) {
                    this.setUiOptions = vO.setIconTintList(vx$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(C0555vx.MenuHostHelper$$ExternalSyntheticLambda0, str, i2, MenuHostHelper$$ExternalSyntheticLambda12, false, 4));
                    int MenuHostHelper$$ExternalSyntheticLambda0 = vx$setIconTintList$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(str, i3, x);
                    this.setUnboundedRipple = MenuHostHelper$$ExternalSyntheticLambda0;
                    if (!(MenuHostHelper$$ExternalSyntheticLambda0 != -1)) {
                        StringBuilder sb4 = new StringBuilder("Invalid URL port: \"");
                        String substring2 = str.substring(i3, x);
                        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    this.setUiOptions = vO.setIconTintList(vx$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(C0555vx.MenuHostHelper$$ExternalSyntheticLambda0, str, i2, MenuHostHelper$$ExternalSyntheticLambda12, false, 4));
                    vx$MenuHostHelper$$ExternalSyntheticLambda1 vx_menuhosthelper__externalsyntheticlambda1 = C0555vx.MenuHostHelper$$ExternalSyntheticLambda0;
                    String str2 = this.setNavigationOnClickListener;
                    pN.setX((Object) str2);
                    this.setUnboundedRipple = vx$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(str2);
                }
                if (!(this.setUiOptions != null)) {
                    StringBuilder sb5 = new StringBuilder("Invalid URL host: \"");
                    String substring3 = str.substring(i2, MenuHostHelper$$ExternalSyntheticLambda12);
                    pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                iconTintList = x;
            }
            int x4 = vL.setX(str, "?#", iconTintList, y);
            MenuHostHelper$$ExternalSyntheticLambda1(str, iconTintList, x4);
            if (x4 >= y || str.charAt(x4) != '?') {
                c = '#';
            } else {
                c = '#';
                int MenuHostHelper$$ExternalSyntheticLambda13 = vL.MenuHostHelper$$ExternalSyntheticLambda1(str, '#', x4, y);
                vx$MenuHostHelper$$ExternalSyntheticLambda1 vx_menuhosthelper__externalsyntheticlambda12 = C0555vx.MenuHostHelper$$ExternalSyntheticLambda0;
                this.setIconTintList = vx$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(vx$MenuHostHelper$$ExternalSyntheticLambda1.setX(C0555vx.MenuHostHelper$$ExternalSyntheticLambda0, str, x4 + 1, MenuHostHelper$$ExternalSyntheticLambda13, " \"'<>#", true, false, true, false, null, 208));
                x4 = MenuHostHelper$$ExternalSyntheticLambda13;
            }
            if (x4 < y && str.charAt(x4) == c) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = vx$MenuHostHelper$$ExternalSyntheticLambda1.setX(C0555vx.MenuHostHelper$$ExternalSyntheticLambda0, str, x4 + 1, y, "", true, false, false, true, null, 176);
            }
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:62:0x010b, code lost:
            if (r19 == false) goto L55;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x010f A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0038 -> B:13:0x0039). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void MenuHostHelper$$ExternalSyntheticLambda1(java.lang.String r21, int r22, int r23) {
            /*
                Method dump skipped, instructions count: 272
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0555vx.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(java.lang.String, int, int):void");
        }
    }

    public static final C0555vx setX(String str) {
        pN.setY(str, "");
        return new setIconTintList().setX((C0555vx) null, str).setY();
    }
}