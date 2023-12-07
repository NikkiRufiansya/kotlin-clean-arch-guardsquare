package o;

/* loaded from: classes.dex */
public class qM {
    public static final int MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        C0405ql c0405ql = new C0405ql(2, 36);
        if (c0405ql.setIconTintList() <= i && i <= c0405ql.setIconTintList) {
            return i;
        }
        StringBuilder sb = new StringBuilder("radix ");
        sb.append(i);
        sb.append(" was not in valid range ");
        sb.append(new C0405ql(2, 36));
        throw new IllegalArgumentException(sb.toString());
    }
}