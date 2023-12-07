package o;

import java.util.Collection;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import o.C0555vx;
import o.vA;
import o.vE;

/* renamed from: o.yg  reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0623yg {
    @Nullable
    C0553vv$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1;
    @Nullable
    C0555vx.setIconTintList ViewPager$SavedState$1;
    final vE.setIconTintList setCenterIfNoTextEnabled = new vE.setIconTintList();
    @Nullable
    vA setIconTintList;
    final boolean setLayoutAnimation;
    @Nullable
    vC$MenuHostHelper$$ExternalSyntheticLambda1 setNavigationOnClickListener;
    final String setOnLongClickListener;
    final C0558vz$MenuHostHelper$$ExternalSyntheticLambda0 setUiOptions;
    @Nullable
    String setUnboundedRipple;
    final C0555vx setX;
    @Nullable
    vF setY;
    private static final char[] setChipCornerRadius = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    static final Pattern MenuHostHelper$$ExternalSyntheticLambda0 = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0623yg(String str, C0555vx c0555vx, @Nullable String str2, @Nullable C0557vz c0557vz, @Nullable vA vAVar, boolean z, boolean z2, boolean z3) {
        this.setOnLongClickListener = str;
        this.setX = c0555vx;
        this.setUnboundedRipple = str2;
        this.setIconTintList = vAVar;
        this.setLayoutAnimation = z;
        if (c0557vz == null) {
            this.setUiOptions = new C0558vz$MenuHostHelper$$ExternalSyntheticLambda0();
        } else {
            C0558vz$MenuHostHelper$$ExternalSyntheticLambda0 c0558vz$MenuHostHelper$$ExternalSyntheticLambda0 = new C0558vz$MenuHostHelper$$ExternalSyntheticLambda0();
            C0348oi.setIconTintList((Collection) c0558vz$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1, (Object[]) c0557vz.setIconTintList);
            this.setUiOptions = c0558vz$MenuHostHelper$$ExternalSyntheticLambda0;
        }
        if (z2) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new C0553vv$MenuHostHelper$$ExternalSyntheticLambda1();
        } else if (z3) {
            vC$MenuHostHelper$$ExternalSyntheticLambda1 vc_menuhosthelper__externalsyntheticlambda1 = new vC$MenuHostHelper$$ExternalSyntheticLambda1();
            this.setNavigationOnClickListener = vc_menuhosthelper__externalsyntheticlambda1;
            vA vAVar2 = vC.MenuHostHelper$$ExternalSyntheticLambda0;
            pN.setY(vAVar2, "");
            if (!pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) vAVar2.setX, (Object) "multipart")) {
                StringBuilder sb = new StringBuilder("multipart != ");
                sb.append(vAVar2);
                throw new IllegalArgumentException(sb.toString().toString());
            }
            vc_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1 = vAVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(String str, String str2) {
        vA y;
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                y = vA.setIconTintList.setY(str2);
                this.setIconTintList = y;
                return;
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder("Malformed content type: ");
                sb.append(str2);
                throw new IllegalArgumentException(sb.toString(), e);
            }
        }
        this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String setX(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1 && (z || (codePointAt != 47 && codePointAt != 37))) {
                i += Character.charCount(codePointAt);
            } else {
                C0602xo c0602xo = new C0602xo();
                c0602xo.MenuHostHelper$$ExternalSyntheticLambda0(str, 0, i);
                C0602xo c0602xo2 = null;
                while (i < length) {
                    int codePointAt2 = str.codePointAt(i);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 < 32 || codePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != -1 || (!z && (codePointAt2 == 47 || codePointAt2 == 37))) {
                            if (c0602xo2 == null) {
                                c0602xo2 = new C0602xo();
                            }
                            c0602xo2.setNavigationOnClickListener(codePointAt2);
                            while (true) {
                                if (!(c0602xo2.MenuHostHelper$$ExternalSyntheticLambda0 == 0)) {
                                    int unboundedRipple = c0602xo2.setUnboundedRipple() & 255;
                                    c0602xo.MenuHostHelper$$ExternalSyntheticLambda0(37);
                                    char[] cArr = setChipCornerRadius;
                                    c0602xo.MenuHostHelper$$ExternalSyntheticLambda0((int) cArr[(unboundedRipple >> 4) & 15]);
                                    c0602xo.MenuHostHelper$$ExternalSyntheticLambda0((int) cArr[unboundedRipple & 15]);
                                }
                            }
                        } else {
                            c0602xo.setNavigationOnClickListener(codePointAt2);
                        }
                    }
                    i += Character.charCount(codePointAt2);
                }
                return c0602xo.setY(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0, qQ.setIconTintList);
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(String str, @Nullable String str2, boolean z) {
        String str3 = this.setUnboundedRipple;
        if (str3 != null) {
            C0555vx.setIconTintList y = this.setX.setY(str3);
            this.ViewPager$SavedState$1 = y;
            if (y == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(this.setX);
                sb.append(", Relative: ");
                sb.append(this.setUnboundedRipple);
                throw new IllegalArgumentException(sb.toString());
            }
            this.setUnboundedRipple = null;
        }
        if (z) {
            this.ViewPager$SavedState$1.setX(str, str2);
        } else {
            this.ViewPager$SavedState$1.setIconTintList(str, str2);
        }
    }

    /* renamed from: o.yg$setIconTintList */
    /* loaded from: classes.dex */
    static class setIconTintList extends vF {
        private final vF MenuHostHelper$$ExternalSyntheticLambda0;
        private final vA setY;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setIconTintList(vF vFVar, vA vAVar) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = vFVar;
            this.setY = vAVar;
        }

        @Override // o.vF
        public final vA MenuHostHelper$$ExternalSyntheticLambda1() {
            return this.setY;
        }

        @Override // o.vF
        public final long MenuHostHelper$$ExternalSyntheticLambda0() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0();
        }

        @Override // o.vF
        public final void setX(InterfaceC0606xq interfaceC0606xq) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setX(interfaceC0606xq);
        }
    }
}