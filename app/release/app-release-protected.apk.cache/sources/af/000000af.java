package com.google.android.material.behavior;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Method;
import o.jC;
import o.jp;
import o.setBaselineAlignBottom;
import o.setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1;
import o.setDecorPadding;
import o.setRowCount;
import o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0;
import o.setShowDividers;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.setIconTintList<V> {
    public SwipeDismissBehavior$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean setLayoutAnimation;
    private boolean setUiOptions;
    setRowCount setUnboundedRipple;
    private float setNavigationOnClickListener = 0.0f;
    public int setY = 2;
    float setIconTintList = 0.5f;
    public float setX = 0.0f;
    public float MenuHostHelper$$ExternalSyntheticLambda0 = 0.5f;
    private final setRowCount$MenuHostHelper$$ExternalSyntheticLambda0 setOnLongClickListener = new setRowCount$MenuHostHelper$$ExternalSyntheticLambda0() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.5
        private int MenuHostHelper$$ExternalSyntheticLambda1;
        private int setY = -1;
        public static final byte[] $$g = {11, 29, 107, 8};
        public static final int $$h = 132;
        public static final byte[] $$d = {56, 110, 47, 101, -14, 15, -43, 26, 12, -1, -26, 21, 5, 6, -40, 29, 10, 1, -65, 63, 1, 24, 9, 7, -45, 39, 4, 1, -44, 29, 7, 4, -11, 13, -78, 0, 33, 51, -4, -15, 13, -4, -13, 11, -25, 38, -11, 6, -12, -3, 15, -11, -6, -23, 21, 12, -11, 2, -3, -48, 24, 9, 7, -45, 39, 4, 1, -44, 29, 7, 4, -11, 13, -78, 0, 33, 51, -4, -15, 13, -4, -13, 11, -25, 38, -11, 6, -12, -3, 15, -11, -6, -23, 21, 12, -11, 2, -3, -49, -65, 72, -40, -42, 79, -14, 15, -27, -65, 51, -32, -29, 41, 24, 9, 7, -45, 39, 4, 1, -44, 29, 7, 4, -11, 13, -78, 0, 33, 51, -4, -15, 13, -4, -13, 11, -25, 38, -11, 6, -12, -3, 15, -11, -6, -23, 21, 12, -11, 2, -3, -49};
        public static final int $$e = 72;
        public static final byte[] $$a = {123, 85, -72, 69, -1, 28, -14, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35};
        public static final int $$b = 187;
        private static byte[] setUiOptions = {104, -34, -42, -1, 17, -6, 18, 1, -2, -1, -50, 57, 16, 3, 10, -11, 13, 10, -66, 25, 48, 3, 10, -11, 23, 0, -1, 5, 13, 10, -7, 15, 9, -45, 29, 22, -7, -33, 48, -7, 5, -5, 25, -17, -47, 66, -7, 17, -3, -53, 41, 42, -2, 5, -11, 12};
        public static final int MenuHostHelper$$ExternalSyntheticLambda0 = 100;
        private static char[] setX = {49005, 15650, 48104, 14782, 46691, 13349, 45800, 12514, 44387, 11071, 43426, 10143, 42101, 8767, 41208, 7849, 39777, 6415, 38880, 5539, 37487, 4135, 21641, 54976, 20493, 53852, 23967, 57289, 22792, 56190, 18057, 49357, 16896, 52312, 20357, 51649, 19209, 998, 33193, 1891, 34101, 2792, 34990, 3683, 35945, 4582, 38839, 5495, 39785, 6342, 40612, 7283, 41518, 10225, 42414, 11123, 43326, 11987, 44207, 12917, 45090, 13798, 48035, 21647, 55001, 20510, 53854, 23945, 57282, 22808, 56173, 18076, 49372, 16896, 52293, 20367, 51661, 19224, 62789, 28803, 62146};
        private static long setLayoutAnimation = 8363321617576613548L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(short r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 + 4
                byte[] r0 = com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass5.$$a
                int r6 = 40 - r6
                int r8 = r8 * 38
                int r8 = 115 - r8
                byte[] r1 = new byte[r6]
                int r6 = r6 + (-1)
                r2 = 0
                if (r0 != 0) goto L16
                r4 = r8
                r3 = 0
                r8 = r7
                r7 = r6
                goto L2c
            L16:
                r3 = 0
            L17:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r6) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L24:
                r4 = r0[r7]
                int r3 = r3 + 1
                r5 = r7
                r7 = r6
                r6 = r8
                r8 = r5
            L2c:
                int r8 = r8 + 1
                int r6 = r6 + r4
                int r6 = r6 + (-13)
                r5 = r8
                r8 = r6
                r6 = r7
                r7 = r5
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass5.a(short, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0031). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void c(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 2
                int r7 = r7 + 77
                int r6 = r6 + 4
                int r8 = r8 + 4
                byte[] r0 = com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass5.$$d
                byte[] r1 = new byte[r6]
                int r6 = r6 + (-1)
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r9
                r9 = r8
                goto L31
            L17:
                r3 = 0
            L18:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L25:
                int r3 = r3 + 1
                r4 = r0[r8]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                r9 = r5
            L31:
                int r7 = r7 + r8
                int r8 = r9 + 1
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass5.c(byte, byte, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0035). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void d(short r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                int r8 = 40 - r8
                int r6 = 106 - r6
                int r7 = r7 * 7
                int r7 = 23 - r7
                byte[] r0 = com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass5.setUiOptions
                byte[] r1 = new byte[r7]
                int r7 = r7 + (-1)
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r9
                r9 = r8
                goto L35
            L17:
                r3 = 0
            L18:
                r5 = r8
                r8 = r6
                r6 = r5
                byte r4 = (byte) r8
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L2a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2a:
                int r6 = r6 + 1
                r3 = r0[r6]
                r5 = r8
                r8 = r6
                r6 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                r9 = r5
            L35:
                int r9 = r9 + r6
                int r6 = r9 + (-4)
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass5.d(short, byte, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0035). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void e(byte r7, int r8, short r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 + 118
                byte[] r0 = com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass5.$$g
                int r9 = r9 * 4
                int r9 = 1 - r9
                int r8 = r8 * 3
                int r8 = 4 - r8
                byte[] r1 = new byte[r9]
                int r9 = r9 + (-1)
                r2 = 0
                if (r0 != 0) goto L1a
                r7 = r8
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r10
                r10 = r9
                goto L35
            L1a:
                r3 = 0
            L1b:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r9) goto L2a
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2a:
                r3 = r0[r8]
                r5 = r8
                r8 = r7
                r7 = r5
                r6 = r10
                r10 = r9
                r9 = r3
                r3 = r1
                r1 = r0
                r0 = r6
            L35:
                int r9 = -r9
                int r8 = r8 + r9
                int r7 = r7 + 1
                r9 = r10
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass5.e(byte, int, short, java.lang.Object[]):void");
        }

        @Override // o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0
        public final boolean MenuHostHelper$$ExternalSyntheticLambda1(View view, int i) {
            int i2 = this.setY;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.MenuHostHelper$$ExternalSyntheticLambda0(view);
        }

        @Override // o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0
        public final void setX(View view, int i) {
            this.setY = i;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0
        public final void setY(int i) {
            SwipeDismissBehavior$MenuHostHelper$$ExternalSyntheticLambda1 swipeDismissBehavior$MenuHostHelper$$ExternalSyntheticLambda1 = SwipeDismissBehavior.this.MenuHostHelper$$ExternalSyntheticLambda1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
            if (java.lang.Math.abs(r8.getLeft() - r7.MenuHostHelper$$ExternalSyntheticLambda1) >= java.lang.Math.round(r8.getWidth() * r7.setIconTintList.setIconTintList)) goto L8;
         */
        @Override // o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void setX(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.setY = r10
                int r10 = r8.getWidth()
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r3 == 0) goto L42
                int r4 = o.setBaselineAlignBottom.ViewPager$SavedState$1(r8)
                if (r4 != r2) goto L16
                r4 = 1
                goto L17
            L16:
                r4 = 0
            L17:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.setY
                r6 = 2
                if (r5 != r6) goto L20
            L1e:
                r3 = 1
                goto L5f
            L20:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.setY
                if (r5 != 0) goto L32
                if (r4 == 0) goto L2d
                int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r3 >= 0) goto L30
                goto L2f
            L2d:
                if (r3 <= 0) goto L30
            L2f:
                goto L1e
            L30:
                r3 = 0
                goto L5f
            L32:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.setY
                if (r5 != r2) goto L30
                if (r4 == 0) goto L3d
                if (r3 <= 0) goto L30
                goto L41
            L3d:
                int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r3 >= 0) goto L30
            L41:
                goto L1e
            L42:
                int r3 = r8.getLeft()
                int r4 = r7.MenuHostHelper$$ExternalSyntheticLambda1
                int r5 = r8.getWidth()
                float r5 = (float) r5
                com.google.android.material.behavior.SwipeDismissBehavior r6 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r6 = r6.setIconTintList
                float r5 = r5 * r6
                int r5 = java.lang.Math.round(r5)
                int r3 = r3 - r4
                int r3 = java.lang.Math.abs(r3)
                if (r3 < r5) goto L30
                goto L1e
            L5f:
                if (r3 == 0) goto L75
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 < 0) goto L6f
                int r9 = r8.getLeft()
                int r0 = r7.MenuHostHelper$$ExternalSyntheticLambda1
                if (r9 < r0) goto L6f
                int r0 = r0 + r10
                goto L73
            L6f:
                int r9 = r7.MenuHostHelper$$ExternalSyntheticLambda1
                int r0 = r9 - r10
            L73:
                r1 = 1
                goto L77
            L75:
                int r0 = r7.MenuHostHelper$$ExternalSyntheticLambda1
            L77:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                o.setRowCount r9 = r9.setUnboundedRipple
                int r10 = r8.getTop()
                boolean r9 = r9.setX(r0, r10)
                if (r9 == 0) goto L90
                com.google.android.material.behavior.SwipeDismissBehavior$setIconTintList r9 = new com.google.android.material.behavior.SwipeDismissBehavior$setIconTintList
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r8, r1)
                o.setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda1(r8, r9)
                return
            L90:
                if (r1 == 0) goto L96
                com.google.android.material.behavior.SwipeDismissBehavior r8 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$MenuHostHelper$$ExternalSyntheticLambda1 r8 = r8.MenuHostHelper$$ExternalSyntheticLambda1
            L96:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass5.setX(android.view.View, float, float):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x02db  */
        @Override // o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int setY(android.view.View r21) {
            /*
                Method dump skipped, instructions count: 1055
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass5.setY(android.view.View):int");
        }

        @Override // o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0
        public final int setIconTintList(View view, int i) {
            int x;
            int width;
            int width2;
            x = setBaselineAlignBottom.setX.setX(view);
            boolean z = x == 1;
            if (SwipeDismissBehavior.this.setY == 0) {
                if (z) {
                    width = this.MenuHostHelper$$ExternalSyntheticLambda1 - view.getWidth();
                    width2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                }
                width = this.MenuHostHelper$$ExternalSyntheticLambda1;
                width2 = view.getWidth() + width;
            } else if (SwipeDismissBehavior.this.setY == 1) {
                if (!z) {
                    width = this.MenuHostHelper$$ExternalSyntheticLambda1 - view.getWidth();
                    width2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                }
                width = this.MenuHostHelper$$ExternalSyntheticLambda1;
                width2 = view.getWidth() + width;
            } else {
                width = this.MenuHostHelper$$ExternalSyntheticLambda1 - view.getWidth();
                width2 = view.getWidth() + this.MenuHostHelper$$ExternalSyntheticLambda1;
            }
            return Math.min(Math.max(width, i), width2);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x02f7  */
        @Override // o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int MenuHostHelper$$ExternalSyntheticLambda0(android.view.View r21, int r22) {
            /*
                Method dump skipped, instructions count: 900
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass5.MenuHostHelper$$ExternalSyntheticLambda0(android.view.View, int):int");
        }

        @Override // o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0
        public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, int i, int i2) {
            float width = this.MenuHostHelper$$ExternalSyntheticLambda1 + (view.getWidth() * SwipeDismissBehavior.this.setX);
            float width2 = this.MenuHostHelper$$ExternalSyntheticLambda1 + (view.getWidth() * SwipeDismissBehavior.this.MenuHostHelper$$ExternalSyntheticLambda0);
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f - width) / (width2 - width))), 1.0f));
            }
        }

        private static void b(int i, char c, int i2, Object[] objArr) {
            jp jpVar = new jp();
            long[] jArr = new long[i2];
            jpVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
            while (jpVar.MenuHostHelper$$ExternalSyntheticLambda1 < i2) {
                int i3 = jpVar.MenuHostHelper$$ExternalSyntheticLambda1;
                try {
                    Object[] objArr2 = {Integer.valueOf(setX[i + jpVar.MenuHostHelper$$ExternalSyntheticLambda1])};
                    Object obj = jC.setTextScaleX.get(-534561078);
                    if (obj == null) {
                        byte b = (byte) 1;
                        byte b2 = (byte) (b - 1);
                        Object[] objArr3 = new Object[1];
                        e(b, b2, b2, objArr3);
                        obj = ((Class) jC.setY(313 - Color.red(0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4)).getMethod((String) objArr3[0], Integer.TYPE);
                        jC.setTextScaleX.put(-534561078, obj);
                    }
                    try {
                        Object[] objArr4 = {Long.valueOf(((Long) ((Method) obj).invoke(null, objArr2)).longValue()), Long.valueOf(jpVar.MenuHostHelper$$ExternalSyntheticLambda1), Long.valueOf(setLayoutAnimation), Integer.valueOf(c)};
                        Object obj2 = jC.setTextScaleX.get(-1233430495);
                        if (obj2 == null) {
                            byte b3 = (byte) 2;
                            byte b4 = (byte) (b3 - 2);
                            Object[] objArr5 = new Object[1];
                            e(b3, b4, b4, objArr5);
                            obj2 = ((Class) jC.setY(Color.argb(0, 0, 0, 0) + 186, (char) KeyEvent.normalizeMetaState(0), 4 - View.MeasureSpec.getSize(0))).getMethod((String) objArr5[0], Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE);
                            jC.setTextScaleX.put(-1233430495, obj2);
                        }
                        jArr[i3] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                        try {
                            Object[] objArr6 = {jpVar, jpVar};
                            Object obj3 = jC.setTextScaleX.get(-2123108845);
                            if (obj3 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                Object[] objArr7 = new Object[1];
                                e(b5, b6, b6, objArr7);
                                obj3 = ((Class) jC.setY(269 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (Color.rgb(0, 0, 0) + 16777216), 4 - View.combineMeasuredStates(0, 0))).getMethod((String) objArr7[0], Object.class, Object.class);
                                jC.setTextScaleX.put(-2123108845, obj3);
                            }
                            ((Method) obj3).invoke(null, objArr6);
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            char[] cArr = new char[i2];
            jpVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
            while (jpVar.MenuHostHelper$$ExternalSyntheticLambda1 < i2) {
                cArr[jpVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) jArr[jpVar.MenuHostHelper$$ExternalSyntheticLambda1];
                try {
                    Object[] objArr8 = {jpVar, jpVar};
                    Object obj4 = jC.setTextScaleX.get(-2123108845);
                    if (obj4 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        Object[] objArr9 = new Object[1];
                        e(b7, b8, b8, objArr9);
                        obj4 = ((Class) jC.setY(270 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3)).getMethod((String) objArr9[0], Object.class, Object.class);
                        jC.setTextScaleX.put(-2123108845, obj4);
                    }
                    ((Method) obj4).invoke(null, objArr8);
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            objArr[0] = new String(cArr);
        }
    };

    public boolean MenuHostHelper$$ExternalSyntheticLambda0(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean MenuHostHelper$$ExternalSyntheticLambda1 = super.MenuHostHelper$$ExternalSyntheticLambda1(coordinatorLayout, (CoordinatorLayout) v, i);
        if (setBaselineAlignBottom.setCenterIfNoTextEnabled(v) == 0) {
            setBaselineAlignBottom.setUnboundedRipple(v, 1);
            setBaselineAlignBottom.setIconTintList(v, 1048576);
            if (MenuHostHelper$$ExternalSyntheticLambda0(v)) {
                setBaselineAlignBottom.setX(v, setDecorPadding.setIconTintList.setUiOptions, null, new setShowDividers() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.2
                    @Override // o.setShowDividers
                    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(View view) {
                        int x;
                        boolean z = false;
                        if (SwipeDismissBehavior.this.MenuHostHelper$$ExternalSyntheticLambda0(view)) {
                            x = setBaselineAlignBottom.setX.setX(view);
                            boolean z2 = x == 1;
                            if ((SwipeDismissBehavior.this.setY == 0 && z2) || (SwipeDismissBehavior.this.setY == 1 && !z2)) {
                                z = true;
                            }
                            int width = view.getWidth();
                            if (z) {
                                width = -width;
                            }
                            setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda1(view, width);
                            view.setAlpha(0.0f);
                            SwipeDismissBehavior$MenuHostHelper$$ExternalSyntheticLambda1 swipeDismissBehavior$MenuHostHelper$$ExternalSyntheticLambda1 = SwipeDismissBehavior.this.MenuHostHelper$$ExternalSyntheticLambda1;
                            return true;
                        }
                        return false;
                    }
                });
            }
        }
        return MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public boolean setY(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.setLayoutAnimation;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.setIconTintList(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.setLayoutAnimation = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.setLayoutAnimation = false;
        }
        if (z) {
            if (this.setUnboundedRipple == null) {
                this.setUnboundedRipple = setRowCount.MenuHostHelper$$ExternalSyntheticLambda0(coordinatorLayout, this.setOnLongClickListener);
            }
            return this.setUnboundedRipple.setIconTintList(motionEvent);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        setRowCount setrowcount = this.setUnboundedRipple;
        if (setrowcount != null) {
            setrowcount.MenuHostHelper$$ExternalSyntheticLambda1(motionEvent);
            return true;
        }
        return false;
    }

    /* loaded from: classes.dex */
    class setIconTintList implements Runnable {
        private final boolean setIconTintList;
        private final View setY;

        setIconTintList(View view, boolean z) {
            this.setY = view;
            this.setIconTintList = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (SwipeDismissBehavior.this.setUnboundedRipple == null || !SwipeDismissBehavior.this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0()) {
                if (this.setIconTintList) {
                    SwipeDismissBehavior$MenuHostHelper$$ExternalSyntheticLambda1 swipeDismissBehavior$MenuHostHelper$$ExternalSyntheticLambda1 = SwipeDismissBehavior.this.MenuHostHelper$$ExternalSyntheticLambda1;
                    return;
                }
                return;
            }
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(this.setY, this);
        }
    }
}