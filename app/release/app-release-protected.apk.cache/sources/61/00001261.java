package o;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.vW;

/* loaded from: classes.dex */
public final class wB implements Closeable {
    private static final wH setOnNavigationItemSelectedListener;
    private final vW ExtendableSavedState$1;
    private long FragmentStateAdapter$2;
    final Set<Integer> MenuHostHelper$$ExternalSyntheticLambda1;
    private long SearchView$SavedState$1;
    wH ViewPager$SavedState$1;
    final vW setAnimationFromJson;
    long setCenterIfNoTextEnabled;
    private long setCheckedIconEnabled;
    final wH setChipCornerRadius;
    private final vV setChipIconTintResource;
    private long setGuidelinePercent;
    private final Socket setHasDecor;
    final vW setIconSize;
    final boolean setIconTintList;
    private final wB$MenuHostHelper$$ExternalSyntheticLambda1 setIconified;
    long setLayoutAnimation;
    private final wE setLayoutDirection;
    private long setMaxEms;
    private boolean setMinAndMaxProgress;
    int setNavigationOnClickListener;
    long setOnLongClickListener;
    final Map<Integer, wF> setTextAlignment;
    private long setTextAppearanceResource;
    public final wG setTextScaleX;
    final setY setUiOptions;
    int setUnboundedRipple;
    long setX;
    final String setY;
    private static byte[] setContentScrimResource = {3, -83, -69, 19, -16, 5, 2, 15, -7, -4, 34, -18, -8, 15, 6, -1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -36, -18, -8, 15, 6, -1};
    public static final int setZ = 8;
    public static final setIconTintList MenuHostHelper$$ExternalSyntheticLambda0 = new setIconTintList((byte) 0);

    public static boolean MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002c -> B:23:0x0035). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 12
            int r6 = 16 - r6
            byte[] r0 = o.wB.setContentScrimResource
            int r8 = r8 * 7
            int r8 = r8 + 99
            int r7 = r7 * 3
            int r7 = r7 + 13
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L1c
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L35
        L1c:
            r3 = 0
        L1d:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2c:
            r3 = r0[r6]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L35:
            int r7 = -r7
            int r6 = r6 + 1
            int r9 = r9 + r7
            int r7 = r9 + 2
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.wB.a(short, byte, byte, java.lang.Object[]):void");
    }

    public wB(wB$MenuHostHelper$$ExternalSyntheticLambda0 wb_menuhosthelper__externalsyntheticlambda0) {
        pN.setY(wb_menuhosthelper__externalsyntheticlambda0, "");
        boolean z = wb_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0;
        this.setIconTintList = z;
        this.setUiOptions = wb_menuhosthelper__externalsyntheticlambda0.setIconTintList;
        this.setTextAlignment = new LinkedHashMap();
        String str = wb_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1;
        if (str == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        }
        this.setY = str;
        this.setNavigationOnClickListener = wb_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0 ? 3 : 2;
        vV vVVar = wb_menuhosthelper__externalsyntheticlambda0.setUnboundedRipple;
        this.setChipIconTintResource = vVVar;
        vW MenuHostHelper$$ExternalSyntheticLambda02 = vVVar.MenuHostHelper$$ExternalSyntheticLambda0();
        this.setAnimationFromJson = MenuHostHelper$$ExternalSyntheticLambda02;
        this.setIconSize = vVVar.MenuHostHelper$$ExternalSyntheticLambda0();
        this.ExtendableSavedState$1 = vVVar.MenuHostHelper$$ExternalSyntheticLambda0();
        this.setLayoutDirection = wb_menuhosthelper__externalsyntheticlambda0.setX;
        wH wHVar = new wH();
        if (wb_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0) {
            wHVar.setIconTintList(7, 16777216);
        }
        nX nXVar = nX.setX;
        this.setChipCornerRadius = wHVar;
        wH wHVar2 = setOnNavigationItemSelectedListener;
        this.ViewPager$SavedState$1 = wHVar2;
        this.setCenterIfNoTextEnabled = (wHVar2.MenuHostHelper$$ExternalSyntheticLambda0 & 128) != 0 ? wHVar2.setY[7] : 65535;
        Socket socket = wb_menuhosthelper__externalsyntheticlambda0.setNavigationOnClickListener;
        if (socket == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        }
        this.setHasDecor = socket;
        InterfaceC0606xq interfaceC0606xq = wb_menuhosthelper__externalsyntheticlambda0.setLayoutAnimation;
        if (interfaceC0606xq == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        }
        this.setTextScaleX = new wG(interfaceC0606xq, z);
        InterfaceC0607xr interfaceC0607xr = wb_menuhosthelper__externalsyntheticlambda0.setOnLongClickListener;
        if (interfaceC0607xr == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        }
        this.setIconified = new wB$MenuHostHelper$$ExternalSyntheticLambda1(this, new wC(interfaceC0607xr, z));
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new LinkedHashSet();
        if (wb_menuhosthelper__externalsyntheticlambda0.setY != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(wb_menuhosthelper__externalsyntheticlambda0.setY);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ping");
            String obj = sb.toString();
            MenuHostHelper$$ExternalSyntheticLambda02.setX(new setX(obj, obj, this, nanos), nanos);
        }
    }

    public static final /* synthetic */ wH MenuHostHelper$$ExternalSyntheticLambda1() {
        return setOnNavigationItemSelectedListener;
    }

    /* loaded from: classes.dex */
    public static final class setX extends vR {
        private /* synthetic */ String MenuHostHelper$$ExternalSyntheticLambda0;
        private /* synthetic */ wB setNavigationOnClickListener;
        private /* synthetic */ long setUnboundedRipple;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setX(String str, String str2, wB wBVar, long j) {
            super(str2);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = str;
            this.setNavigationOnClickListener = wBVar;
            this.setUnboundedRipple = j;
        }

        @Override // o.vR
        public final long MenuHostHelper$$ExternalSyntheticLambda1() {
            boolean z;
            synchronized (this.setNavigationOnClickListener) {
                if (this.setNavigationOnClickListener.setTextAppearanceResource < this.setNavigationOnClickListener.setGuidelinePercent) {
                    z = true;
                } else {
                    this.setNavigationOnClickListener.setGuidelinePercent++;
                    z = false;
                }
            }
            if (z) {
                wB.setIconTintList(this.setNavigationOnClickListener, (IOException) null);
                return -1L;
            }
            wB wBVar = this.setNavigationOnClickListener;
            try {
                wBVar.setTextScaleX.setY(false, 1, 0);
            } catch (IOException e) {
                EnumC0584wx enumC0584wx = EnumC0584wx.PROTOCOL_ERROR;
                wBVar.setIconTintList(enumC0584wx, enumC0584wx, e);
            }
            return this.setUnboundedRipple;
        }
    }

    /* loaded from: classes.dex */
    public static final class setCenterIfNoTextEnabled extends vR {
        private /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda0 = true;
        private /* synthetic */ wB setLayoutAnimation;
        private /* synthetic */ int setNavigationOnClickListener;
        private /* synthetic */ long setUiOptions;
        private /* synthetic */ String setUnboundedRipple;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setCenterIfNoTextEnabled(String str, String str2, wB wBVar, int i, long j) {
            super(str2, true);
            this.setUnboundedRipple = str;
            this.setLayoutAnimation = wBVar;
            this.setNavigationOnClickListener = i;
            this.setUiOptions = j;
        }

        @Override // o.vR
        public final long MenuHostHelper$$ExternalSyntheticLambda1() {
            try {
                this.setLayoutAnimation.setTextScaleX.setIconTintList(this.setNavigationOnClickListener, this.setUiOptions);
                return -1L;
            } catch (IOException e) {
                wB.setIconTintList(this.setLayoutAnimation, e);
                return -1L;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class setChipCornerRadius extends vR {
        private /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda0 = true;
        private /* synthetic */ String setNavigationOnClickListener;
        private /* synthetic */ int setOnLongClickListener;
        private /* synthetic */ wB setUiOptions;
        private /* synthetic */ EnumC0584wx setUnboundedRipple;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setChipCornerRadius(String str, String str2, wB wBVar, int i, EnumC0584wx enumC0584wx) {
            super(str2, true);
            this.setNavigationOnClickListener = str;
            this.setUiOptions = wBVar;
            this.setOnLongClickListener = i;
            this.setUnboundedRipple = enumC0584wx;
        }

        @Override // o.vR
        public final long MenuHostHelper$$ExternalSyntheticLambda1() {
            try {
                this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(this.setOnLongClickListener, this.setUnboundedRipple);
                return -1L;
            } catch (IOException e) {
                wB.setIconTintList(this.setUiOptions, e);
                return -1L;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class setLayoutAnimation extends vR {
        private /* synthetic */ C0602xo MenuHostHelper$$ExternalSyntheticLambda0;
        private /* synthetic */ wB setChipCornerRadius;
        private /* synthetic */ String setLayoutAnimation;
        private /* synthetic */ boolean setNavigationOnClickListener;
        private /* synthetic */ int setOnLongClickListener;
        private /* synthetic */ boolean setUiOptions = true;
        private /* synthetic */ int setUnboundedRipple;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setLayoutAnimation(String str, String str2, wB wBVar, int i, C0602xo c0602xo, int i2, boolean z) {
            super(str2, true);
            this.setLayoutAnimation = str;
            this.setChipCornerRadius = wBVar;
            this.setUnboundedRipple = i;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = c0602xo;
            this.setOnLongClickListener = i2;
            this.setNavigationOnClickListener = z;
        }

        @Override // o.vR
        public final long MenuHostHelper$$ExternalSyntheticLambda1() {
            try {
                this.setChipCornerRadius.setLayoutDirection.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0, this.setOnLongClickListener);
                this.setChipCornerRadius.setTextScaleX.MenuHostHelper$$ExternalSyntheticLambda0(this.setUnboundedRipple, EnumC0584wx.CANCEL);
                synchronized (this.setChipCornerRadius) {
                    this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1.remove(Integer.valueOf(this.setUnboundedRipple));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class setNavigationOnClickListener extends vR {
        private /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda0 = true;
        private /* synthetic */ List setLayoutAnimation;
        private /* synthetic */ String setNavigationOnClickListener;
        private /* synthetic */ int setOnLongClickListener;
        private /* synthetic */ wB setUiOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setNavigationOnClickListener(String str, String str2, wB wBVar, int i, List list) {
            super(str2, true);
            this.setNavigationOnClickListener = str;
            this.setUiOptions = wBVar;
            this.setOnLongClickListener = i;
            this.setLayoutAnimation = list;
        }

        @Override // o.vR
        public final long MenuHostHelper$$ExternalSyntheticLambda1() {
            this.setUiOptions.setLayoutDirection.setIconTintList(this.setLayoutAnimation);
            try {
                this.setUiOptions.setTextScaleX.MenuHostHelper$$ExternalSyntheticLambda0(this.setOnLongClickListener, EnumC0584wx.CANCEL);
                synchronized (this.setUiOptions) {
                    this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1.remove(Integer.valueOf(this.setOnLongClickListener));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class setOnLongClickListener extends vR {
        private /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda0 = true;
        private /* synthetic */ List setLayoutAnimation;
        private /* synthetic */ boolean setNavigationOnClickListener;
        private /* synthetic */ String setOnLongClickListener;
        private /* synthetic */ int setUiOptions;
        private /* synthetic */ wB setUnboundedRipple;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setOnLongClickListener(String str, String str2, wB wBVar, int i, List list, boolean z) {
            super(str2, true);
            this.setOnLongClickListener = str;
            this.setUnboundedRipple = wBVar;
            this.setUiOptions = i;
            this.setLayoutAnimation = list;
            this.setNavigationOnClickListener = z;
        }

        @Override // o.vR
        public final long MenuHostHelper$$ExternalSyntheticLambda1() {
            this.setUnboundedRipple.setLayoutDirection.MenuHostHelper$$ExternalSyntheticLambda0(this.setLayoutAnimation);
            try {
                this.setUnboundedRipple.setTextScaleX.MenuHostHelper$$ExternalSyntheticLambda0(this.setUiOptions, EnumC0584wx.CANCEL);
                synchronized (this.setUnboundedRipple) {
                    this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1.remove(Integer.valueOf(this.setUiOptions));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class setUiOptions extends vR {
        private /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda0 = true;
        private /* synthetic */ String setLayoutAnimation;
        private /* synthetic */ EnumC0584wx setOnLongClickListener;
        private /* synthetic */ int setUiOptions;
        private /* synthetic */ wB setUnboundedRipple;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setUiOptions(String str, String str2, wB wBVar, int i, EnumC0584wx enumC0584wx) {
            super(str2, true);
            this.setLayoutAnimation = str;
            this.setUnboundedRipple = wBVar;
            this.setUiOptions = i;
            this.setOnLongClickListener = enumC0584wx;
        }

        @Override // o.vR
        public final long MenuHostHelper$$ExternalSyntheticLambda1() {
            this.setUnboundedRipple.setLayoutDirection.MenuHostHelper$$ExternalSyntheticLambda0(this.setOnLongClickListener);
            synchronized (this.setUnboundedRipple) {
                this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1.remove(Integer.valueOf(this.setUiOptions));
                nX nXVar = nX.setX;
            }
            return -1L;
        }
    }

    /* loaded from: classes.dex */
    public static final class setUnboundedRipple extends vR {
        private /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda0 = true;
        private /* synthetic */ wB setNavigationOnClickListener;
        private /* synthetic */ String setUnboundedRipple;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setUnboundedRipple(String str, String str2, wB wBVar) {
            super(str2, true);
            this.setUnboundedRipple = str;
            this.setNavigationOnClickListener = wBVar;
        }

        @Override // o.vR
        public final long MenuHostHelper$$ExternalSyntheticLambda1() {
            wB wBVar = this.setNavigationOnClickListener;
            try {
                wBVar.setTextScaleX.setY(false, 2, 0);
                return -1L;
            } catch (IOException e) {
                EnumC0584wx enumC0584wx = EnumC0584wx.PROTOCOL_ERROR;
                wBVar.setIconTintList(enumC0584wx, enumC0584wx, e);
                return -1L;
            }
        }
    }

    public final wF MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        wF wFVar;
        synchronized (this) {
            wFVar = this.setTextAlignment.get(Integer.valueOf(i));
        }
        return wFVar;
    }

    public final wF setY(int i) {
        wF remove;
        synchronized (this) {
            remove = this.setTextAlignment.remove(Integer.valueOf(i));
            notifyAll();
        }
        return remove;
    }

    public final void setIconTintList(long j) {
        wH wHVar;
        synchronized (this) {
            long j2 = this.SearchView$SavedState$1 + j;
            this.SearchView$SavedState$1 = j2;
            long j3 = j2 - this.setCheckedIconEnabled;
            if (j3 >= ((this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda0 & 128) != 0 ? wHVar.setY[7] : 65535) / 2) {
                setIconTintList(0, j3);
                this.setCheckedIconEnabled += j3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0049 A[Catch: all -> 0x0213, TryCatch #2 {, blocks: (B:132:0x0009, B:152:0x0055, B:153:0x0057, B:224:0x01f2, B:225:0x01f3, B:133:0x000a, B:135:0x0011, B:136:0x0016, B:138:0x001a, B:140:0x002f, B:142:0x0037, B:147:0x0043, B:149:0x0049, B:150:0x0052, B:235:0x020b, B:236:0x0212, B:154:0x0058, B:156:0x0061, B:158:0x006c, B:160:0x0076, B:161:0x0079, B:162:0x0085, B:164:0x008c, B:166:0x00a8, B:170:0x00b6, B:179:0x00ed, B:181:0x0101, B:183:0x0112, B:185:0x0121, B:195:0x015b, B:206:0x019f, B:199:0x0168, B:200:0x0177, B:202:0x017f, B:204:0x0189, B:205:0x0193, B:188:0x0137, B:190:0x0147, B:173:0x00cb, B:175:0x00db, B:207:0x01a8, B:212:0x01be, B:213:0x01c0, B:215:0x01ce, B:218:0x01d5, B:222:0x01e5, B:230:0x01fe, B:231:0x0207), top: B:243:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.wF setIconTintList(java.util.List<o.C0581wu> r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.wB.setIconTintList(java.util.List, boolean):o.wF");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0037, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0039, code lost:
        r4 = java.lang.Math.min((int) java.lang.Math.min(r13, r6 - r4), r9.setTextScaleX.setUiOptions);
        r7 = r4;
        r9.FragmentStateAdapter$2 += r7;
        r5 = o.nX.setX;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int r10, boolean r11, o.C0602xo r12, long r13) {
        /*
            r9 = this;
            r0 = 0
            r2 = 0
            int r3 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r3 != 0) goto Ld
            o.wG r13 = r9.setTextScaleX
            r13.setY(r11, r10, r12, r2)
            return
        Ld:
            int r3 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r3 <= 0) goto Lb0
            monitor-enter(r9)
        L12:
            r3 = 1
            long r4 = r9.FragmentStateAdapter$2     // Catch: java.lang.Throwable -> L5e java.lang.InterruptedException -> L60
            long r6 = r9.setCenterIfNoTextEnabled     // Catch: java.lang.Throwable -> L5e java.lang.InterruptedException -> L60
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L38
            java.util.Map<java.lang.Integer, o.wF> r4 = r9.setTextAlignment     // Catch: java.lang.Throwable -> L5e java.lang.InterruptedException -> L60
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L5e java.lang.InterruptedException -> L60
            boolean r4 = r4.containsKey(r5)     // Catch: java.lang.Throwable -> L5e java.lang.InterruptedException -> L60
            if (r4 == 0) goto L2e
            r4 = r9
            java.lang.Object r4 = (java.lang.Object) r4     // Catch: java.lang.Throwable -> L5e java.lang.InterruptedException -> L60
            r4.wait()     // Catch: java.lang.Throwable -> L5e java.lang.InterruptedException -> L60
            goto L12
        L2e:
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Throwable -> L5e java.lang.InterruptedException -> L60
            java.lang.String r11 = "stream closed"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L5e java.lang.InterruptedException -> L60
            java.lang.Throwable r10 = (java.lang.Throwable) r10     // Catch: java.lang.Throwable -> L5e java.lang.InterruptedException -> L60
            throw r10     // Catch: java.lang.Throwable -> L5e java.lang.InterruptedException -> L60
        L38:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r13, r6)     // Catch: java.lang.Throwable -> L5e
            int r5 = (int) r4     // Catch: java.lang.Throwable -> L5e
            o.wG r4 = r9.setTextScaleX     // Catch: java.lang.Throwable -> L5e
            int r4 = r4.setUiOptions     // Catch: java.lang.Throwable -> L5e
            int r4 = java.lang.Math.min(r5, r4)     // Catch: java.lang.Throwable -> L5e
            long r5 = r9.FragmentStateAdapter$2     // Catch: java.lang.Throwable -> L5e
            long r7 = (long) r4     // Catch: java.lang.Throwable -> L5e
            long r5 = r5 + r7
            r9.FragmentStateAdapter$2 = r5     // Catch: java.lang.Throwable -> L5e
            o.nX r5 = o.nX.setX     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r9)
            long r13 = r13 - r7
            o.wG r5 = r9.setTextScaleX
            if (r11 == 0) goto L59
            int r6 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r6 != 0) goto L59
            goto L5a
        L59:
            r3 = 0
        L5a:
            r5.setY(r3, r10, r12, r4)
            goto Ld
        L5e:
            r10 = move-exception
            goto Lae
        L60:
            byte[] r10 = o.wB.setContentScrimResource     // Catch: java.lang.Throwable -> La5
            r11 = 15
            r10 = r10[r11]     // Catch: java.lang.Throwable -> La5
            int r10 = r10 + r3
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> La5
            byte[] r12 = o.wB.setContentScrimResource     // Catch: java.lang.Throwable -> La5
            r12 = r12[r11]     // Catch: java.lang.Throwable -> La5
            int r12 = -r12
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> La5
            byte r13 = (byte) r12     // Catch: java.lang.Throwable -> La5
            java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> La5
            a(r10, r12, r13, r14)     // Catch: java.lang.Throwable -> La5
            r10 = r14[r2]     // Catch: java.lang.Throwable -> La5
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> La5
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> La5
            byte[] r12 = o.wB.setContentScrimResource     // Catch: java.lang.Throwable -> La5
            r11 = r12[r11]     // Catch: java.lang.Throwable -> La5
            int r11 = -r11
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> La5
            int r12 = r11 + (-1)
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> La5
            byte r13 = (byte) r12     // Catch: java.lang.Throwable -> La5
            java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> La5
            a(r11, r12, r13, r14)     // Catch: java.lang.Throwable -> La5
            r11 = r14[r2]     // Catch: java.lang.Throwable -> La5
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> La5
            r12 = 0
            java.lang.reflect.Method r10 = r10.getMethod(r11, r12)     // Catch: java.lang.Throwable -> La5
            java.lang.Object r10 = r10.invoke(r12, r12)     // Catch: java.lang.Throwable -> La5
            java.lang.Thread r10 = (java.lang.Thread) r10     // Catch: java.lang.Throwable -> La5
            r10.interrupt()     // Catch: java.lang.Throwable -> L5e
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L5e
            r10.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.Throwable r10 = (java.lang.Throwable) r10     // Catch: java.lang.Throwable -> L5e
            throw r10     // Catch: java.lang.Throwable -> L5e
        La5:
            r10 = move-exception
            java.lang.Throwable r11 = r10.getCause()     // Catch: java.lang.Throwable -> L5e
            if (r11 == 0) goto Lad
            throw r11     // Catch: java.lang.Throwable -> L5e
        Lad:
            throw r10     // Catch: java.lang.Throwable -> L5e
        Lae:
            monitor-exit(r9)
            throw r10
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.wB.MenuHostHelper$$ExternalSyntheticLambda0(int, boolean, o.xo, long):void");
    }

    public final void setX(int i, EnumC0584wx enumC0584wx) {
        pN.setY(enumC0584wx, "");
        vW vWVar = this.setAnimationFromJson;
        StringBuilder sb = new StringBuilder();
        sb.append(this.setY);
        sb.append('[');
        sb.append(i);
        sb.append("] writeSynReset");
        String obj = sb.toString();
        vWVar.setX(new setChipCornerRadius(obj, obj, this, i, enumC0584wx), 0L);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, EnumC0584wx enumC0584wx) {
        pN.setY(enumC0584wx, "");
        this.setTextScaleX.MenuHostHelper$$ExternalSyntheticLambda0(i, enumC0584wx);
    }

    public final void setIconTintList(int i, long j) {
        vW vWVar = this.setAnimationFromJson;
        StringBuilder sb = new StringBuilder();
        sb.append(this.setY);
        sb.append('[');
        sb.append(i);
        sb.append("] windowUpdate");
        String obj = sb.toString();
        vWVar.setX(new setCenterIfNoTextEnabled(obj, obj, this, i, j), 0L);
    }

    private void setX(EnumC0584wx enumC0584wx) {
        pN.setY(enumC0584wx, "");
        synchronized (this.setTextScaleX) {
            synchronized (this) {
                if (this.setMinAndMaxProgress) {
                    return;
                }
                this.setMinAndMaxProgress = true;
                int i = this.setUnboundedRipple;
                nX nXVar = nX.setX;
                this.setTextScaleX.setY(i, enumC0584wx, vL.MenuHostHelper$$ExternalSyntheticLambda1);
                nX nXVar2 = nX.setX;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        setIconTintList(EnumC0584wx.NO_ERROR, EnumC0584wx.CANCEL, null);
    }

    public static /* synthetic */ void setCenterIfNoTextEnabled(wB wBVar) {
        vV vVVar = vV.MenuHostHelper$$ExternalSyntheticLambda1;
        pN.setY(vVVar, "");
        wG wGVar = wBVar.setTextScaleX;
        synchronized (wGVar) {
            if (wGVar.setX) {
                throw new IOException("closed");
            }
            if (wGVar.MenuHostHelper$$ExternalSyntheticLambda0) {
                Logger logger = wG.setIconTintList;
                if (logger.isLoggable(Level.FINE)) {
                    StringBuilder sb = new StringBuilder(">> CONNECTION ");
                    sb.append(C0586wz.setY.setIconTintList());
                    logger.fine(vL.MenuHostHelper$$ExternalSyntheticLambda1(sb.toString(), new Object[0]));
                }
                wGVar.setUnboundedRipple.setY(C0586wz.setY);
                wGVar.setUnboundedRipple.flush();
            }
        }
        wG wGVar2 = wBVar.setTextScaleX;
        wH wHVar = wBVar.setChipCornerRadius;
        synchronized (wGVar2) {
            pN.setY(wHVar, "");
            if (wGVar2.setX) {
                throw new IOException("closed");
            }
            wGVar2.MenuHostHelper$$ExternalSyntheticLambda1(0, Integer.bitCount(wHVar.MenuHostHelper$$ExternalSyntheticLambda0) * 6, 4, 0);
            int i = 0;
            while (i < 10) {
                if (((1 << i) & wHVar.MenuHostHelper$$ExternalSyntheticLambda0) != 0) {
                    wGVar2.setUnboundedRipple.setLayoutAnimation(i != 4 ? i != 7 ? i : 4 : 3);
                    wGVar2.setUnboundedRipple.setIconTintList(wHVar.setY[i]);
                }
                i++;
            }
            wGVar2.setUnboundedRipple.flush();
        }
        wH wHVar2 = wBVar.setChipCornerRadius;
        int i2 = (wHVar2.MenuHostHelper$$ExternalSyntheticLambda0 & 128) != 0 ? wHVar2.setY[7] : 65535;
        if (i2 != 65535) {
            wBVar.setTextScaleX.setIconTintList(0, i2 - 65535);
        }
        vW MenuHostHelper$$ExternalSyntheticLambda02 = vVVar.MenuHostHelper$$ExternalSyntheticLambda0();
        String str = wBVar.setY;
        MenuHostHelper$$ExternalSyntheticLambda02.setX(new vW.setY(wBVar.setIconified, str, str), 0L);
    }

    public final boolean setY(long j) {
        synchronized (this) {
            if (this.setMinAndMaxProgress) {
                return false;
            }
            if (this.setLayoutAnimation < this.setX) {
                if (j >= this.setOnLongClickListener) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class setY {
        public static final setY setAnimationFromJson;

        public void setY(wB wBVar, wH wHVar) {
            pN.setY(wBVar, "");
            pN.setY(wHVar, "");
        }

        public abstract void setY(wF wFVar);

        /* loaded from: classes.dex */
        public static final class setX extends setY {
            setX() {
            }

            @Override // o.wB.setY
            public final void setY(wF wFVar) {
                pN.setY(wFVar, "");
                EnumC0584wx enumC0584wx = EnumC0584wx.REFUSED_STREAM;
                pN.setY(enumC0584wx, "");
                if (wFVar.MenuHostHelper$$ExternalSyntheticLambda1(enumC0584wx, (IOException) null)) {
                    wB wBVar = wFVar.setX;
                    int i = wFVar.MenuHostHelper$$ExternalSyntheticLambda1;
                    pN.setY(enumC0584wx, "");
                    wBVar.setTextScaleX.MenuHostHelper$$ExternalSyntheticLambda0(i, enumC0584wx);
                }
            }
        }

        static {
            new wB$setY$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);
            setAnimationFromJson = new setX();
        }
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList {
        private setIconTintList() {
        }

        public /* synthetic */ setIconTintList(byte b) {
            this();
        }
    }

    static {
        wH wHVar = new wH();
        wHVar.setIconTintList(7, 65535);
        wHVar.setIconTintList(5, 16384);
        setOnNavigationItemSelectedListener = wHVar;
    }

    public final void setIconTintList(EnumC0584wx enumC0584wx, EnumC0584wx enumC0584wx2, IOException iOException) {
        int i;
        pN.setY(enumC0584wx, "");
        pN.setY(enumC0584wx2, "");
        boolean z = vL.MenuHostHelper$$ExternalSyntheticLambda0;
        try {
            setX(enumC0584wx);
        } catch (IOException unused) {
        }
        wF[] wFVarArr = null;
        synchronized (this) {
            if (!this.setTextAlignment.isEmpty()) {
                Object[] array = this.setTextAlignment.values().toArray(new wF[0]);
                if (array != null) {
                    wFVarArr = (wF[]) array;
                    this.setTextAlignment.clear();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            nX nXVar = nX.setX;
        }
        if (wFVarArr != null) {
            for (wF wFVar : wFVarArr) {
                try {
                    wFVar.setX(enumC0584wx2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.setTextScaleX.close();
        } catch (IOException unused3) {
        }
        try {
            this.setHasDecor.close();
        } catch (IOException unused4) {
        }
        this.setAnimationFromJson.MenuHostHelper$$ExternalSyntheticLambda1();
        this.setIconSize.MenuHostHelper$$ExternalSyntheticLambda1();
        this.ExtendableSavedState$1.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    public static final /* synthetic */ void setIconTintList(wB wBVar, IOException iOException) {
        EnumC0584wx enumC0584wx = EnumC0584wx.PROTOCOL_ERROR;
        wBVar.setIconTintList(enumC0584wx, enumC0584wx, iOException);
    }
}