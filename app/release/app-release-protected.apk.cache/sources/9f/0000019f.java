package o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FirebaseCommonKtxRegistrar {
    private static byte[] setX = {107, 3, 14, 112, 7, 1, -7, -4, 13, -9, -3, 51, -23, -16, 13, 39, -42, 13, 1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -36, 8, 1, 17, -6};
    public static final int setIconTintList = 141;
    public final setDividerHeight<String, FragmentManager$6> setY = new setDividerHeight<>();
    public final setDividerHeight<String, PropertyValuesHolder[]> MenuHostHelper$$ExternalSyntheticLambda1 = new setDividerHeight<>();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0035). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = 106 - r7
            int r6 = r6 * 15
            int r6 = 18 - r6
            int r8 = r8 * 4
            int r8 = 16 - r8
            byte[] r0 = o.FirebaseCommonKtxRegistrar.setX
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L35
        L19:
            r3 = 0
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            int r6 = r6 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L35:
            int r8 = r8 - r7
            int r7 = r8 + 2
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.FirebaseCommonKtxRegistrar.a(int, short, short, java.lang.Object[]):void");
    }

    public static FirebaseCommonKtxRegistrar MenuHostHelper$$ExternalSyntheticLambda1(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return setX(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                return setX(arrayList);
            }
            return null;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i));
            Log.w("MotionSpec", sb.toString(), e);
            return null;
        }
    }

    private static FirebaseCommonKtxRegistrar setX(List<Animator> list) {
        FirebaseCommonKtxRegistrar firebaseCommonKtxRegistrar = new FirebaseCommonKtxRegistrar();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            setX(firebaseCommonKtxRegistrar, list.get(i));
        }
        return firebaseCommonKtxRegistrar;
    }

    private static void setX(FirebaseCommonKtxRegistrar firebaseCommonKtxRegistrar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            firebaseCommonKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = setCardElevation.MenuHostHelper$$ExternalSyntheticLambda0;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = setCardElevation.setX;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = setCardElevation.MenuHostHelper$$ExternalSyntheticLambda1;
            }
            FragmentManager$6 fragmentManager$6 = new FragmentManager$6(startDelay, duration, interpolator);
            fragmentManager$6.setIconTintList = objectAnimator.getRepeatCount();
            fragmentManager$6.MenuHostHelper$$ExternalSyntheticLambda1 = objectAnimator.getRepeatMode();
            firebaseCommonKtxRegistrar.setY.put(propertyName, fragmentManager$6);
            return;
        }
        StringBuilder sb = new StringBuilder("Animator must be an ObjectAnimator: ");
        sb.append(animator);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FirebaseCommonKtxRegistrar) {
            return this.setY.equals(((FirebaseCommonKtxRegistrar) obj).setY);
        }
        return false;
    }

    public int hashCode() {
        return this.setY.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(getClass().getName());
        sb.append('{');
        try {
            Object[] objArr = {this};
            byte b = (byte) (setX[5] - 1);
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            a(b, b2, b2, objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b3 = setX[5];
            byte b4 = b3;
            Object[] objArr3 = new Object[1];
            a(b3, b4, (byte) (b4 - 1), objArr3);
            sb.append(Integer.toHexString(((Integer) cls.getMethod((String) objArr3[0], Object.class).invoke(null, objArr)).intValue()));
            sb.append(" timings: ");
            sb.append(this.setY);
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

    public final <T> ObjectAnimator setX(String str, T t, Property<T, ?> property) {
        if (!(this.MenuHostHelper$$ExternalSyntheticLambda1.get(str) != null)) {
            throw new IllegalArgumentException();
        }
        PropertyValuesHolder[] propertyValuesHolderArr = this.MenuHostHelper$$ExternalSyntheticLambda1.get(str);
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, propertyValuesHolderArr2);
        ofPropertyValuesHolder.setProperty(property);
        if (this.setY.get(str) != null) {
            this.setY.get(str).MenuHostHelper$$ExternalSyntheticLambda1(ofPropertyValuesHolder);
            return ofPropertyValuesHolder;
        }
        throw new IllegalArgumentException();
    }

    public final PropertyValuesHolder[] MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        if (!(this.MenuHostHelper$$ExternalSyntheticLambda1.get(str) != null)) {
            throw new IllegalArgumentException();
        }
        PropertyValuesHolder[] propertyValuesHolderArr = this.MenuHostHelper$$ExternalSyntheticLambda1.get(str);
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    public final FragmentManager$6 setIconTintList(String str) {
        if (!(this.setY.get(str) != null)) {
            throw new IllegalArgumentException();
        }
        return this.setY.get(str);
    }
}