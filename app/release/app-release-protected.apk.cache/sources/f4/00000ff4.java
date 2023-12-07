package o;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class setSubtitleTextAppearance<K, A> {
    protected setPrompt<A> setIconTintList;
    private final setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0<K> setUiOptions;
    public static final byte[] $$g = {33, -64, 37, -91};
    public static final int $$h = 191;
    public static final byte[] $$d = {112, 117, 112, -122, -65, 65, 1, -14, 15, -28, 24, 9, 7, -45, 39, 4, 1, -44, 29, 7, 4, -11, 13, -78, 0, 33, 51, -4, -15, 13, -4, -13, 11, -25, 38, -11, 6, -12, -3, 15, -11, -6, -23, 21, 12, -11, 2, -3, -49, -65, 72, -40, -42, 79, -14, 15, -27};
    public static final int $$e = 92;
    public static final byte[] $$a = {112, 31, -51, -82, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35};
    public static final int $$b = 215;
    private static byte[] setChipCornerRadius = {11, 29, 107, 8, 17, -6, 18, 1, -2, -1, -50, 57, 16, 3, 10, -11, 13, 10, -66, 25, 48, 3, 10, -11, 23, 0, -1, 5, 13, 10, -7, 15, 9, -45, 29, 22, -7, -33, 48, -7, 5, -5, 25, -17, -47, 66, -7, 17, -3, -53, 41, 42, -2, 5, -11, 12};
    public static final int setY = 31;
    private static int setUnboundedRipple = 851212277;
    public final List<setX> MenuHostHelper$$ExternalSyntheticLambda0 = new ArrayList(1);
    public boolean MenuHostHelper$$ExternalSyntheticLambda1 = false;
    protected float setX = 0.0f;
    private A setLayoutAnimation = null;
    private float setOnLongClickListener = -1.0f;
    private float setNavigationOnClickListener = -1.0f;

    /* loaded from: classes.dex */
    public interface setX {
        void setY();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x0038). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 25
            int r7 = r7 + 15
            byte[] r0 = o.setSubtitleTextAppearance.$$a
            int r6 = r6 * 38
            int r6 = 115 - r6
            int r8 = r8 * 14
            int r8 = 18 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L1a
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L38
        L1a:
            r3 = 0
        L1b:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L2d
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2d:
            r4 = r0[r8]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L38:
            int r9 = r9 + 1
            int r8 = r8 + r6
            int r6 = r8 + (-13)
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSubtitleTextAppearance.a(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r7 = 106 - r7
            int r8 = r8 * 7
            int r8 = r8 + 16
            byte[] r0 = o.setSubtitleTextAppearance.setChipCornerRadius
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L32
        L17:
            r3 = 0
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r6]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L32:
            int r8 = r8 + r7
            int r7 = r8 + (-4)
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSubtitleTextAppearance.c(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = r8 * 2
            int r8 = 115 - r8
            int r7 = r7 + 4
            byte[] r0 = o.setSubtitleTextAppearance.$$d
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r8
            r3 = 0
            r8 = r7
            r7 = r6
            goto L2e
        L16:
            r3 = 0
        L17:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L2e:
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSubtitleTextAppearance.d(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            int r9 = r9 * 2
            int r9 = r9 + 102
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r0 = o.setSubtitleTextAppearance.$$g
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L18
            r9 = r7
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r8
            goto L37
        L18:
            r3 = 0
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L1d:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L2e
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2e:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L37:
            int r7 = r7 + r8
            r8 = r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSubtitleTextAppearance.e(int, short, int, java.lang.Object[]):void");
    }

    abstract A MenuHostHelper$$ExternalSyntheticLambda1(setChildIndicatorBoundsRelative<K> setchildindicatorboundsrelative, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public setSubtitleTextAppearance(List<? extends setChildIndicatorBoundsRelative<K>> list) {
        setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0 seticontintlist;
        setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0 setsubtitletextappearance_menuhosthelper__externalsyntheticlambda0;
        if (list.isEmpty()) {
            setsubtitletextappearance_menuhosthelper__externalsyntheticlambda0 = new setY((byte) 0);
        } else {
            if (list.size() == 1) {
                seticontintlist = new setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0<T>(list) { // from class: o.setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda1
                    private final setChildIndicatorBoundsRelative<T> MenuHostHelper$$ExternalSyntheticLambda0;
                    private float setX = -1.0f;

                    @Override // o.setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0
                    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
                        return false;
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.MenuHostHelper$$ExternalSyntheticLambda0 = list.get(0);
                    }

                    @Override // o.setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0
                    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(float f) {
                        return !(this.MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple == null);
                    }

                    @Override // o.setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0
                    public final setChildIndicatorBoundsRelative<T> MenuHostHelper$$ExternalSyntheticLambda0() {
                        return this.MenuHostHelper$$ExternalSyntheticLambda0;
                    }

                    @Override // o.setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0
                    public final float setX() {
                        return this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList();
                    }

                    @Override // o.setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0
                    public final float setY() {
                        return this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0();
                    }

                    @Override // o.setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0
                    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(float f) {
                        if (this.setX == f) {
                            return true;
                        }
                        this.setX = f;
                        return false;
                    }
                };
            } else {
                seticontintlist = new setIconTintList(list);
            }
            setsubtitletextappearance_menuhosthelper__externalsyntheticlambda0 = seticontintlist;
        }
        this.setUiOptions = setsubtitletextappearance_menuhosthelper__externalsyntheticlambda0;
    }

    public void setY(float f) {
        if (this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1()) {
            return;
        }
        if (this.setOnLongClickListener == -1.0f) {
            this.setOnLongClickListener = this.setUiOptions.setX();
        }
        float f2 = this.setOnLongClickListener;
        if (f >= f2) {
            if (f > MenuHostHelper$$ExternalSyntheticLambda0()) {
                f = MenuHostHelper$$ExternalSyntheticLambda0();
            }
        } else {
            if (f2 == -1.0f) {
                this.setOnLongClickListener = this.setUiOptions.setX();
            }
            f = this.setOnLongClickListener;
        }
        if (f == this.setX) {
            return;
        }
        this.setX = f;
        if (this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(f)) {
            setLayoutAnimation();
        }
    }

    public void setLayoutAnimation() {
        for (int i = 0; i < this.MenuHostHelper$$ExternalSyntheticLambda0.size(); i++) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.get(i).setY();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final setChildIndicatorBoundsRelative<K> setIconTintList() {
        setChildIndicatorBoundsRelative<K> MenuHostHelper$$ExternalSyntheticLambda0 = this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0();
        int i = setIntValues.setX;
        if (i > 0) {
            setIntValues.setX = i - 1;
        }
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            return 0.0f;
        }
        setChildIndicatorBoundsRelative<K> MenuHostHelper$$ExternalSyntheticLambda0 = this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0();
        int i = setIntValues.setX;
        if (i > 0) {
            setIntValues.setX = i - 1;
        }
        if (MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple == null) {
            return 0.0f;
        }
        return (this.setX - MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList()) / (MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0() - MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0574  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    float MenuHostHelper$$ExternalSyntheticLambda0() {
        /*
            Method dump skipped, instructions count: 1466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSubtitleTextAppearance.MenuHostHelper$$ExternalSyntheticLambda0():float");
    }

    public A setOnLongClickListener() {
        float y = setY();
        if (this.setIconTintList == null && this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0(y)) {
            return this.setLayoutAnimation;
        }
        setChildIndicatorBoundsRelative<K> MenuHostHelper$$ExternalSyntheticLambda0 = this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0();
        int i = setIntValues.setX;
        if (i > 0) {
            setIntValues.setX = i - 1;
        }
        A MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0, y);
        this.setLayoutAnimation = MenuHostHelper$$ExternalSyntheticLambda1;
        return MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public final float setX() {
        return this.setX;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(setPrompt<A> setprompt) {
        this.setIconTintList = setprompt;
    }

    /* loaded from: classes.dex */
    static final class setY<T> implements setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0<T> {
        @Override // o.setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0
        public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
            return true;
        }

        @Override // o.setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0
        public final boolean MenuHostHelper$$ExternalSyntheticLambda1(float f) {
            return false;
        }

        @Override // o.setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0
        public final float setX() {
            return 0.0f;
        }

        @Override // o.setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0
        public final float setY() {
            return 1.0f;
        }

        private setY() {
        }

        /* synthetic */ setY(byte b) {
            this();
        }

        @Override // o.setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0
        public final setChildIndicatorBoundsRelative<T> MenuHostHelper$$ExternalSyntheticLambda0() {
            throw new IllegalStateException("not implemented");
        }

        @Override // o.setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0
        public final boolean MenuHostHelper$$ExternalSyntheticLambda0(float f) {
            throw new IllegalStateException("not implemented");
        }
    }

    /* loaded from: classes.dex */
    static final class setIconTintList<T> implements setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0<T> {
        private final List<? extends setChildIndicatorBoundsRelative<T>> setIconTintList;
        private setChildIndicatorBoundsRelative<T> setX = null;
        private float MenuHostHelper$$ExternalSyntheticLambda0 = -1.0f;
        private setChildIndicatorBoundsRelative<T> setY = setX(0.0f);

        @Override // o.setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0
        public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
            return false;
        }

        setIconTintList(List<? extends setChildIndicatorBoundsRelative<T>> list) {
            this.setIconTintList = list;
        }

        @Override // o.setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0
        public final boolean MenuHostHelper$$ExternalSyntheticLambda1(float f) {
            setChildIndicatorBoundsRelative<T> setchildindicatorboundsrelative = this.setY;
            if (f >= setchildindicatorboundsrelative.setIconTintList() && f < setchildindicatorboundsrelative.MenuHostHelper$$ExternalSyntheticLambda0()) {
                return !(this.setY.setUnboundedRipple == null);
            }
            this.setY = setX(f);
            return true;
        }

        private setChildIndicatorBoundsRelative<T> setX(float f) {
            List<? extends setChildIndicatorBoundsRelative<T>> list = this.setIconTintList;
            setChildIndicatorBoundsRelative<T> setchildindicatorboundsrelative = list.get(list.size() - 1);
            if (f >= setchildindicatorboundsrelative.setIconTintList()) {
                return setchildindicatorboundsrelative;
            }
            int size = this.setIconTintList.size() - 2;
            while (true) {
                boolean z = false;
                if (size > 0) {
                    setChildIndicatorBoundsRelative<T> setchildindicatorboundsrelative2 = this.setIconTintList.get(size);
                    if (this.setY != setchildindicatorboundsrelative2) {
                        if (f >= setchildindicatorboundsrelative2.setIconTintList() && f < setchildindicatorboundsrelative2.MenuHostHelper$$ExternalSyntheticLambda0()) {
                            z = true;
                        }
                        if (z) {
                            return setchildindicatorboundsrelative2;
                        }
                    }
                    size--;
                } else {
                    return this.setIconTintList.get(0);
                }
            }
        }

        @Override // o.setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0
        public final setChildIndicatorBoundsRelative<T> MenuHostHelper$$ExternalSyntheticLambda0() {
            return this.setY;
        }

        @Override // o.setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0
        public final float setX() {
            return this.setIconTintList.get(0).setIconTintList();
        }

        @Override // o.setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0
        public final float setY() {
            List<? extends setChildIndicatorBoundsRelative<T>> list = this.setIconTintList;
            return list.get(list.size() - 1).MenuHostHelper$$ExternalSyntheticLambda0();
        }

        @Override // o.setSubtitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0
        public final boolean MenuHostHelper$$ExternalSyntheticLambda0(float f) {
            setChildIndicatorBoundsRelative<T> setchildindicatorboundsrelative = this.setX;
            setChildIndicatorBoundsRelative<T> setchildindicatorboundsrelative2 = this.setY;
            if (setchildindicatorboundsrelative == setchildindicatorboundsrelative2 && this.MenuHostHelper$$ExternalSyntheticLambda0 == f) {
                return true;
            }
            this.setX = setchildindicatorboundsrelative2;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = f;
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float setY() {
        setChildIndicatorBoundsRelative<K> MenuHostHelper$$ExternalSyntheticLambda0 = this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0();
        int i = setIntValues.setX;
        if (i > 0) {
            setIntValues.setX = i - 1;
        }
        if (MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple == null) {
            return 0.0f;
        }
        return MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple.getInterpolation(MenuHostHelper$$ExternalSyntheticLambda1());
    }

    private static void b(int i, char[] cArr, int i2, boolean z, int i3, Object[] objArr) {
        ju juVar = new ju();
        char[] cArr2 = new char[i];
        juVar.setX = 0;
        while (juVar.setX < i) {
            juVar.MenuHostHelper$$ExternalSyntheticLambda0 = cArr[juVar.setX];
            cArr2[juVar.setX] = (char) (i2 + juVar.MenuHostHelper$$ExternalSyntheticLambda0);
            int i4 = juVar.setX;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i4]), Integer.valueOf(setUnboundedRipple)};
                Object obj = jC.setTextScaleX.get(-1875803360);
                if (obj == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    Object[] objArr3 = new Object[1];
                    e(b, b2, (byte) (b2 + 1), objArr3);
                    obj = ((Class) jC.setY((KeyEvent.getMaxKeyCode() >> 16) + 341, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 4 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod((String) objArr3[0], Integer.TYPE, Integer.TYPE);
                    jC.setTextScaleX.put(-1875803360, obj);
                }
                cArr2[i4] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr4 = {juVar, juVar};
                    Object obj2 = jC.setTextScaleX.get(-257319855);
                    if (obj2 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        Object[] objArr5 = new Object[1];
                        e(b3, b4, b4, objArr5);
                        obj2 = ((Class) jC.setY(206 - (Process.myTid() >> 22), (char) (TextUtils.getOffsetBefore("", 0) + 65233), View.MeasureSpec.getSize(0) + 4)).getMethod((String) objArr5[0], Object.class, Object.class);
                        jC.setTextScaleX.put(-257319855, obj2);
                    }
                    ((Method) obj2).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (i3 > 0) {
            juVar.setIconTintList = i3;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - juVar.setIconTintList, juVar.setIconTintList);
            System.arraycopy(cArr3, juVar.setIconTintList, cArr2, 0, i - juVar.setIconTintList);
        }
        if (z) {
            char[] cArr4 = new char[i];
            juVar.setX = 0;
            while (juVar.setX < i) {
                cArr4[juVar.setX] = cArr2[(i - juVar.setX) - 1];
                try {
                    Object[] objArr6 = {juVar, juVar};
                    Object obj3 = jC.setTextScaleX.get(-257319855);
                    if (obj3 == null) {
                        byte b5 = (byte) (-1);
                        byte b6 = (byte) (b5 + 1);
                        Object[] objArr7 = new Object[1];
                        e(b5, b6, b6, objArr7);
                        obj3 = ((Class) jC.setY(206 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (ExpandableListView.getPackedPositionGroup(0L) + 65233), 4 - (ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod((String) objArr7[0], Object.class, Object.class);
                        jC.setTextScaleX.put(-257319855, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr6);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}