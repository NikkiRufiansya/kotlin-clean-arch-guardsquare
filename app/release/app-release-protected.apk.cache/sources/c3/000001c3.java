package o;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class FragmentManager$6 {
    public TimeInterpolator MenuHostHelper$$ExternalSyntheticLambda0;
    int MenuHostHelper$$ExternalSyntheticLambda1;
    int setIconTintList;
    public long setX;
    public long setY;
    private static byte[] setUnboundedRipple = {75, 108, -123, 87, 7, 1, -7, -4, 13, -9, -3, 51, -23, -16, 13, 39, -42, 13, 1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -36, 8, 1, 17, -6};
    public static final int setLayoutAnimation = 113;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = 16 - r8
            int r7 = r7 * 15
            int r7 = r7 + 4
            byte[] r0 = o.FragmentManager$6.setUnboundedRipple
            int r6 = 106 - r6
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L1a
            r6 = r7
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L36
        L1a:
            r3 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L1e:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L36:
            int r7 = r7 - r8
            int r7 = r7 + 2
            int r6 = r6 + 1
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: o.FragmentManager$6.a(int, byte, byte, java.lang.Object[]):void");
    }

    public FragmentManager$6(long j) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
        this.setIconTintList = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 1;
        this.setY = j;
        this.setX = 150L;
    }

    public FragmentManager$6(long j, long j2, TimeInterpolator timeInterpolator) {
        this.setIconTintList = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 1;
        this.setY = j;
        this.setX = j2;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = timeInterpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FragmentManager$6) {
            FragmentManager$6 fragmentManager$6 = (FragmentManager$6) obj;
            if (this.setY == fragmentManager$6.setY && this.setX == fragmentManager$6.setX && this.setIconTintList == fragmentManager$6.setIconTintList && this.MenuHostHelper$$ExternalSyntheticLambda1 == fragmentManager$6.MenuHostHelper$$ExternalSyntheticLambda1) {
                TimeInterpolator timeInterpolator = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (timeInterpolator == null) {
                    timeInterpolator = setCardElevation.MenuHostHelper$$ExternalSyntheticLambda0;
                }
                Class<?> cls = timeInterpolator.getClass();
                TimeInterpolator timeInterpolator2 = fragmentManager$6.MenuHostHelper$$ExternalSyntheticLambda0;
                if (timeInterpolator2 == null) {
                    timeInterpolator2 = setCardElevation.MenuHostHelper$$ExternalSyntheticLambda0;
                }
                return cls.equals(timeInterpolator2.getClass());
            }
            return false;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(getClass().getName());
        sb.append('{');
        try {
            Object[] objArr = {this};
            byte b = setUnboundedRipple[5];
            Object[] objArr2 = new Object[1];
            a((byte) (setUnboundedRipple[5] - 1), b, (byte) (b - 1), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b2 = setUnboundedRipple[5];
            byte b3 = (byte) (b2 - 1);
            Object[] objArr3 = new Object[1];
            a(b2, b3, b3, objArr3);
            sb.append(Integer.toHexString(((Integer) cls.getMethod((String) objArr3[0], Object.class).invoke(null, objArr)).intValue()));
            sb.append(" delay: ");
            sb.append(this.setY);
            sb.append(" duration: ");
            sb.append(this.setX);
            sb.append(" interpolator: ");
            TimeInterpolator timeInterpolator = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (timeInterpolator == null) {
                timeInterpolator = setCardElevation.MenuHostHelper$$ExternalSyntheticLambda0;
            }
            sb.append(timeInterpolator.getClass());
            sb.append(" repeatCount: ");
            sb.append(this.setIconTintList);
            sb.append(" repeatMode: ");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
            sb.append("}\n");
            return sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(Animator animator) {
        animator.setStartDelay(this.setY);
        animator.setDuration(this.setX);
        TimeInterpolator timeInterpolator = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (timeInterpolator == null) {
            timeInterpolator = setCardElevation.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        animator.setInterpolator(timeInterpolator);
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.setIconTintList);
            valueAnimator.setRepeatMode(this.MenuHostHelper$$ExternalSyntheticLambda1);
        }
    }

    public final int hashCode() {
        long j = this.setY;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.setX;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        TimeInterpolator timeInterpolator = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (timeInterpolator == null) {
            timeInterpolator = setCardElevation.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        return (((((((i * 31) + i2) * 31) + timeInterpolator.getClass().hashCode()) * 31) + this.setIconTintList) * 31) + this.MenuHostHelper$$ExternalSyntheticLambda1;
    }
}