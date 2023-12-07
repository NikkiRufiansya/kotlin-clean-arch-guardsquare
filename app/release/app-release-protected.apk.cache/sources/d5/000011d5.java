package o;

import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.lC;

/* loaded from: classes.dex */
public final class vA {
    private final String MenuHostHelper$$ExternalSyntheticLambda1;
    private final String[] setLayoutAnimation;
    private final String setNavigationOnClickListener;
    public final String setX;
    public static final setIconTintList setY = new setIconTintList((byte) 0);
    private static final Pattern MenuHostHelper$$ExternalSyntheticLambda0 = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern setIconTintList = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    private vA(String str, String str2, String str3, String[] strArr) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
        this.setX = str2;
        this.setNavigationOnClickListener = str3;
        this.setLayoutAnimation = strArr;
    }

    public /* synthetic */ vA(String str, String str2, String str3, String[] strArr, byte b) {
        this(str, str2, str3, strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.nio.charset.Charset setX(java.nio.charset.Charset r7) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "charset"
            o.pN.setY(r1, r0)
            java.lang.String[] r2 = r6.setLayoutAnimation
            o.pN.setY(r2, r0)
            o.ql r3 = new o.ql
            o.pN.setY(r2, r0)
            int r0 = r2.length
            int r0 = r0 + (-1)
            r2 = 0
            r3.<init>(r2, r0)
            o.qi r3 = (o.C0402qi) r3
            r0 = 2
            o.qi r0 = o.C0412qs.setIconTintList(r3, r0)
            int r3 = r0.setIconTintList()
            int r4 = r0.setIconTintList
            int r0 = r0.setX
            if (r0 < 0) goto L2c
            if (r3 > r4) goto L47
            goto L2e
        L2c:
            if (r3 < r4) goto L47
        L2e:
            java.lang.String[] r5 = r6.setLayoutAnimation
            r5 = r5[r3]
            if (r5 != 0) goto L36
            r5 = 0
            goto L3a
        L36:
            boolean r5 = r5.equalsIgnoreCase(r1)
        L3a:
            if (r5 == 0) goto L43
            java.lang.String[] r0 = r6.setLayoutAnimation
            int r3 = r3 + 1
            r0 = r0[r3]
            goto L48
        L43:
            if (r3 == r4) goto L47
            int r3 = r3 + r0
            goto L2e
        L47:
            r0 = 0
        L48:
            if (r0 == 0) goto L4e
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.IllegalArgumentException -> L4e
        L4e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.vA.setX(java.nio.charset.Charset):java.nio.charset.Charset");
    }

    public final String toString() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vA) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) ((vA) obj).MenuHostHelper$$ExternalSyntheticLambda1, (Object) this.MenuHostHelper$$ExternalSyntheticLambda1);
    }

    public final int hashCode() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.hashCode();
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList {
        private setIconTintList() {
        }

        public /* synthetic */ setIconTintList(byte b) {
            this();
        }

        public static vA setY(String str) {
            pN.setY(str, "");
            String str2 = str;
            Matcher matcher = vA.MenuHostHelper$$ExternalSyntheticLambda0.matcher(str2);
            if (!matcher.lookingAt()) {
                StringBuilder sb = new StringBuilder("No subtype found for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            String group = matcher.group(1);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) group, "");
            Locale locale = Locale.US;
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) locale, "");
            if (group == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = group.toLowerCase(locale);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) lowerCase, "");
            String group2 = matcher.group(2);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) group2, "");
            Locale locale2 = Locale.US;
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) locale2, "");
            if (group2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase2 = group2.toLowerCase(locale2);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) lowerCase2, "");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = vA.setIconTintList.matcher(str2);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                    String substring = str.substring(end);
                    pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
                    sb2.append(substring);
                    sb2.append("\" for: \"");
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                String group3 = matcher2.group(1);
                if (group3 == null) {
                    end = matcher2.end();
                } else {
                    String group4 = matcher2.group(2);
                    if (group4 == null) {
                        group4 = matcher2.group(3);
                    } else if (qR.setX(group4, "'", false)) {
                        pN.setY(group4, "");
                        pN.setY("'", "");
                        if (group4.endsWith("'") && group4.length() > 2) {
                            group4 = group4.substring(1, group4.length() - 1);
                            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) group4, "");
                        }
                    }
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(group3);
                    arrayList2.add(group4);
                    end = matcher2.end();
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new vA(str, lowerCase, lowerCase2, (String[]) array, (byte) 0);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public final vA MenuHostHelper$$ExternalSyntheticLambda0(String str) {
            pN.setY(str, "");
            try {
                setIconTintList seticontintlist = this;
                return setY(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public static void setX(long j, long j2) {
            String str;
            String str2;
            lC.setY sety = lC.MenuHostHelper$$ExternalSyntheticLambda0;
            lC.MenuHostHelper$$ExternalSyntheticLambda1 = true;
            pN.setY("hook Detected", "");
            lC.setY = "hook Detected";
            str = lC.setIconTintList;
            str2 = lC.setY;
            Log.d(str, str2);
        }
    }
}