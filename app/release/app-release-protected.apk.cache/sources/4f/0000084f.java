package o;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class qP implements Serializable {
    public final Pattern setX;

    static {
        new setIconTintList((byte) 0);
    }

    public qP(Pattern pattern) {
        pN.setY(pattern, "");
        this.setX = pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public qP(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = ""
            o.pN.setY(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.qP.<init>(java.lang.String):void");
    }

    public final String setY(CharSequence charSequence, String str) {
        pN.setY(charSequence, "");
        pN.setY(str, "");
        String replaceAll = this.setX.matcher(charSequence).replaceAll(str);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) replaceAll, "");
        return replaceAll;
    }

    public final String toString() {
        String obj = this.setX.toString();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) obj, "");
        return obj;
    }

    private final Object writeReplace() {
        String pattern = this.setX.pattern();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) pattern, "");
        return new setY(pattern, this.setX.flags());
    }

    /* loaded from: classes.dex */
    static final class setY implements Serializable {
        private final String setX;
        private final int setY;

        static {
            new qP$setY$MenuHostHelper$$ExternalSyntheticLambda0((byte) 0);
        }

        public setY(String str, int i) {
            pN.setY(str, "");
            this.setX = str;
            this.setY = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.setX, this.setY);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) compile, "");
            return new qP(compile);
        }
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList {
        public /* synthetic */ setIconTintList(byte b) {
            this();
        }

        private setIconTintList() {
        }
    }
}