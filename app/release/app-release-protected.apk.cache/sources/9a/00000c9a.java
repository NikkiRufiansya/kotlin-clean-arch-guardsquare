package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import o.setAnimationFromJson;

/* loaded from: classes.dex */
public final class setImageTintMode {
    public Context setY;
    private static byte[] setIconTintList = {0, Byte.MIN_VALUE, -111, -10, 6, 21, -2, 22, 5, 2, 3, -46, 61, 20, 7, 14, -7, 17, 14, -62, 29, 52, 7, 14, -7, 27, 4, 6, 23, -43, 55, 8, 4, 5, 2, 6, 27, -3, 14, 7, -29, 45, 0, 17};
    public static final int MenuHostHelper$$ExternalSyntheticLambda0 = 61;

    private static void a(int i, short s, short s2, Object[] objArr) {
        byte[] bArr = setIconTintList;
        int i2 = (s2 * 22) + 5;
        int i3 = (i * 6) + 97;
        int i4 = (s * 5) + 18;
        byte[] bArr2 = new byte[i4];
        int i5 = -1;
        int i6 = i4 - 1;
        if (bArr == null) {
            i3 = (i6 + i3) - 8;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i5 = -1;
            i2++;
            i6 = i6;
        }
        while (true) {
            int i7 = i5 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i6;
            i3 = (i3 + bArr[i2]) - 8;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i5 = i7;
            i2++;
            i6 = i8;
        }
    }

    public static boolean setLayoutAnimation() {
        return true;
    }

    public static setImageTintMode MenuHostHelper$$ExternalSyntheticLambda0(Context context) {
        return new setImageTintMode(context);
    }

    private setImageTintMode(Context context) {
        this.setY = context;
    }

    public final int setY() {
        Configuration configuration = this.setY.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i <= 960 || i2 <= 720) {
            if (i <= 720 || i2 <= 960) {
                if (i < 500) {
                    if (i <= 640 || i2 <= 480) {
                        if (i <= 480 || i2 <= 640) {
                            return i >= 360 ? 3 : 2;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 4;
            }
            return 5;
        }
        return 5;
    }

    public final int setX() {
        return this.setY.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setY.getResources().getBoolean(R.bool.res_0x7f050000);
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda0() {
        TypedArray obtainStyledAttributes = this.setY.obtainStyledAttributes(null, setAnimationFromJson.setY.setIconTintList, R.attr.res_0x7f040007, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(setAnimationFromJson.setY.ViewPager$SavedState$1, 0);
        Resources resources = this.setY.getResources();
        if (!MenuHostHelper$$ExternalSyntheticLambda1()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.res_0x7f070009));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public final boolean setIconTintList() {
        Context context = this.setY;
        try {
            byte b = setIconTintList[0];
            Object[] objArr = new Object[1];
            a(b, (byte) (b + 1), setIconTintList[0], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = setIconTintList[0];
            Object[] objArr2 = new Object[1];
            a((byte) (MenuHostHelper$$ExternalSyntheticLambda0 & 3), b2, (byte) (b2 + 1), objArr2);
            return ((ApplicationInfo) cls.getMethod((String) objArr2[0], null).invoke(context, null)).targetSdkVersion < 14;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}