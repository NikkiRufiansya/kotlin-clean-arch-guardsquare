package o;

/* renamed from: o.rf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0426rf {
    public static final long setX(int i, EnumC0425re enumC0425re) {
        pN.setY(enumC0425re, "");
        if (enumC0425re.compareTo(EnumC0425re.SECONDS) <= 0) {
            long j = i;
            EnumC0425re enumC0425re2 = EnumC0425re.NANOSECONDS;
            pN.setY(enumC0425re, "");
            pN.setY(enumC0425re2, "");
            return C0429ri.MenuHostHelper$$ExternalSyntheticLambda0(enumC0425re2.setUiOptions.convert(j, enumC0425re.setUiOptions) << 1);
        }
        return MenuHostHelper$$ExternalSyntheticLambda1(i, enumC0425re);
    }

    public static final long MenuHostHelper$$ExternalSyntheticLambda1(long j, EnumC0425re enumC0425re) {
        pN.setY(enumC0425re, "");
        EnumC0425re enumC0425re2 = EnumC0425re.NANOSECONDS;
        pN.setY(enumC0425re2, "");
        pN.setY(enumC0425re, "");
        long convert = enumC0425re.setUiOptions.convert(4611686018426999999L, enumC0425re2.setUiOptions);
        C0407qn c0407qn = new C0407qn(-convert, convert);
        if (c0407qn.MenuHostHelper$$ExternalSyntheticLambda1 <= j && j <= c0407qn.setIconTintList) {
            EnumC0425re enumC0425re3 = EnumC0425re.NANOSECONDS;
            pN.setY(enumC0425re, "");
            pN.setY(enumC0425re3, "");
            return C0429ri.MenuHostHelper$$ExternalSyntheticLambda0(enumC0425re3.setUiOptions.convert(j, enumC0425re.setUiOptions) << 1);
        }
        EnumC0425re enumC0425re4 = EnumC0425re.MILLISECONDS;
        pN.setY(enumC0425re, "");
        pN.setY(enumC0425re4, "");
        return C0429ri.MenuHostHelper$$ExternalSyntheticLambda0((C0412qs.MenuHostHelper$$ExternalSyntheticLambda1(enumC0425re4.setUiOptions.convert(j, enumC0425re.setUiOptions)) << 1) + 1);
    }
}