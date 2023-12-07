package o;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.C0286m;

/* loaded from: classes.dex */
public final class setSmoothScrollingEnabled implements C0286m.AnonymousClass2 {
    private static final Set<attachInterface> setIconTintList;
    static final String setX;
    public static final setSmoothScrollingEnabled setY;
    final String MenuHostHelper$$ExternalSyntheticLambda0;
    final String MenuHostHelper$$ExternalSyntheticLambda1;

    @Override // o.setMinimumWidth
    public final String setY() {
        return "cct";
    }

    static {
        String MenuHostHelper$$ExternalSyntheticLambda1 = setFadingEdgeLength.MenuHostHelper$$ExternalSyntheticLambda1("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        setX = MenuHostHelper$$ExternalSyntheticLambda1;
        String MenuHostHelper$$ExternalSyntheticLambda12 = setFadingEdgeLength.MenuHostHelper$$ExternalSyntheticLambda1("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String MenuHostHelper$$ExternalSyntheticLambda13 = setFadingEdgeLength.MenuHostHelper$$ExternalSyntheticLambda1("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        setIconTintList = Collections.unmodifiableSet(new HashSet(Arrays.asList(new attachInterface("proto"), new attachInterface("json"))));
        new setSmoothScrollingEnabled(MenuHostHelper$$ExternalSyntheticLambda1, null);
        setY = new setSmoothScrollingEnabled(MenuHostHelper$$ExternalSyntheticLambda12, MenuHostHelper$$ExternalSyntheticLambda13);
    }

    public setSmoothScrollingEnabled(String str, String str2) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = str;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str2;
    }

    @Override // o.C0286m.AnonymousClass2
    public final Set<attachInterface> MenuHostHelper$$ExternalSyntheticLambda0() {
        return setIconTintList;
    }

    @Override // o.setMinimumWidth
    public final byte[] setIconTintList() {
        String str = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (str == null && this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.MenuHostHelper$$ExternalSyntheticLambda0;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}