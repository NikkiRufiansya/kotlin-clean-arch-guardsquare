package o;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import o.AbstractC0315nc;
import o.mU;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class mE implements Runnable {
    List<mH> MenuHostHelper$$ExternalSyntheticLambda0;
    final mY MenuHostHelper$$ExternalSyntheticLambda1;
    int ViewPager$SavedState$1;
    final int setCenterIfNoTextEnabled = setTextScaleX.incrementAndGet();
    private mI setCheckedIconEnabled;
    mU.setY setChipCornerRadius;
    private C0318nf setGuidelinePercent;
    final AbstractC0315nc setIconSize;
    mH setIconTintList;
    final String setLayoutAnimation;
    private int setMinAndMaxProgress;
    mU$MenuHostHelper$$ExternalSyntheticLambda1 setNavigationOnClickListener;
    final int setOnLongClickListener;
    Bitmap setTextAlignment;
    private mD setTextAppearanceResource;
    final mU setUiOptions;
    int setUnboundedRipple;
    Future<?> setX;
    Exception setY;
    public static final byte[] $$d = {61, 16, -46, 32, -14, 15, -43, 26, 12, -1, -26, 21, 5, 6, -40, 29, 10, 1, 24, 9, 7, -45, 39, 4, 1, -44, 29, 7, 4, -11, 13, -78, 0, 33, 51, -4, -15, 13, -4, -13, 11, -25, 38, -11, 6, -12, -3, 15, -11, -6, -23, 21, 12, -11, 2, -3, -49, -65, 64, 12, -65, 72, -40, -42, 79, -14, 15, -27};
    public static final int $$e = 114;
    public static final byte[] $$a = {122, 55, -29, -99, 1, -28, 30, -39, -25, -12, 13, -34, -18, -19, 27, -42, -23, -14, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 35};
    public static final int $$b = 79;
    private static byte[] setLayoutDirection = {71, 31, 113, 39, 16, -5, -2, -15, 7, 4, -34, 18, 8, -15, -6, 1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1};
    public static final int setAnimationFromJson = 5;
    private static final Object setMaxEms = new Object();
    private static final ThreadLocal<StringBuilder> setOnNavigationItemSelectedListener = new ThreadLocal<StringBuilder>() { // from class: o.mE.3
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    };
    private static final AtomicInteger setTextScaleX = new AtomicInteger();
    private static final AbstractC0315nc setZ = new AbstractC0315nc() { // from class: o.mE.4
        @Override // o.AbstractC0315nc
        public final boolean setY(mY mYVar) {
            return true;
        }

        @Override // o.AbstractC0315nc
        public final AbstractC0315nc.setX MenuHostHelper$$ExternalSyntheticLambda0(mY mYVar, int i) {
            StringBuilder sb = new StringBuilder("Unrecognized type of request: ");
            sb.append(mYVar);
            throw new IllegalStateException(sb.toString());
        }
    };

    private static boolean MenuHostHelper$$ExternalSyntheticLambda1(boolean z, int i, int i2, int i3, int i4) {
        return !z || (i3 != 0 && i > i3) || (i4 != 0 && i2 > i4);
    }

    private static void a(short s, int i, short s2, Object[] objArr) {
        int i2 = (s2 * 3) + 13;
        byte[] bArr = setLayoutDirection;
        int i3 = 106 - (s * 7);
        int i4 = (i * 12) + 4;
        byte[] bArr2 = new byte[i2];
        int i5 = -1;
        int i6 = i2 - 1;
        if (bArr == null) {
            i4++;
            i3 = i3 + i6 + 2;
            i6 = i6;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i5 = -1;
        }
        while (true) {
            int i7 = i5 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b = bArr[i4];
            i4++;
            i3 = i3 + b + 2;
            i6 = i6;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i5 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 14
            int r6 = 18 - r6
            int r8 = r8 * 38
            int r8 = r8 + 77
            int r7 = r7 * 25
            int r7 = r7 + 15
            byte[] r0 = o.mE.$$a
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L1d
            r8 = r7
            r3 = r1
            r4 = 0
            r7 = r6
            r1 = r0
            r0 = r9
            r9 = r8
            goto L37
        L1d:
            r3 = 0
        L1e:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L37:
            int r6 = -r6
            int r8 = r8 + r6
            int r8 = r8 + (-13)
            int r6 = r7 + 1
            r7 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: o.mE.b(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0031). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r7 = 115 - r7
            byte[] r0 = o.mE.$$d
            int r8 = r8 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L31
        L15:
            r3 = 0
        L16:
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r6]
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
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.mE.c(int, byte, int, java.lang.Object[]):void");
    }

    private mE(mU mUVar, mI mIVar, mD mDVar, C0318nf c0318nf, mH mHVar, AbstractC0315nc abstractC0315nc) {
        this.setUiOptions = mUVar;
        this.setCheckedIconEnabled = mIVar;
        this.setTextAppearanceResource = mDVar;
        this.setGuidelinePercent = c0318nf;
        this.setIconTintList = mHVar;
        this.setLayoutAnimation = mHVar.setY;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = mHVar.setOnLongClickListener;
        this.setChipCornerRadius = mHVar.setOnLongClickListener.setOnLongClickListener;
        this.setOnLongClickListener = mHVar.MenuHostHelper$$ExternalSyntheticLambda1;
        this.setUnboundedRipple = mHVar.setUiOptions;
        this.setIconSize = abstractC0315nc;
        this.ViewPager$SavedState$1 = abstractC0315nc.setIconTintList();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0737 A[Catch: all -> 0x0901, TRY_LEAVE, TryCatch #16 {all -> 0x0901, blocks: (B:33:0x01e1, B:37:0x01f7, B:38:0x01fd, B:42:0x0261, B:45:0x035c, B:58:0x0728, B:60:0x0737, B:67:0x078a, B:74:0x07e1, B:106:0x0882, B:47:0x03a2, B:49:0x04bf, B:55:0x05a9, B:56:0x05e8, B:57:0x06e5, B:94:0x0868, B:95:0x086d, B:107:0x088f, B:108:0x0894, B:110:0x0896, B:112:0x08a0, B:115:0x08a8, B:114:0x08a6, B:76:0x07f0, B:53:0x051a, B:3:0x000c, B:5:0x0012, B:7:0x0021, B:9:0x006b, B:11:0x0078, B:12:0x0083, B:14:0x008b, B:15:0x0097, B:17:0x00a4, B:19:0x00ab, B:20:0x00ac, B:6:0x001b, B:69:0x078e, B:73:0x07da, B:72:0x07a3, B:52:0x04c6, B:62:0x073d, B:66:0x0783, B:65:0x0751), top: B:141:0x000c }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 2385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.mE.run():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:73|74|(1:240)(1:78)|(1:239)(1:82)|(10:(6:87|88|(1:90)(1:104)|(2:92|(1:94))|99|(2:101|102)(1:103))|(7:129|130|(4:132|133|134|(3:136|137|138)(1:230))(1:234)|139|(7:141|142|144|(1:224)(1:151)|(2:153|(2:222|(1:158)))(1:223)|156|(0))(1:228)|159|(18:(1:162)(1:191)|(1:164)(1:190)|165|(3:167|(1:169)(2:175|(1:177)(1:178))|170)(2:179|(3:181|(1:183)(2:185|(1:187)(1:188))|184)(1:189))|171|(1:173)|174|119|(1:121)(1:128)|122|123|124|(1:126)|88|(0)(0)|(0)|99|(0)(0))(2:192|(7:(1:195)(1:207)|196|(1:198)(1:206)|199|(1:201)(1:205)|202|(1:204))(1:(5:(1:213)(1:221)|214|(1:216)(1:220)|217|(1:219)))))(1:117)|123|124|(0)|88|(0)(0)|(0)|99|(0)(0))|105|(1:238)(1:109)|(1:237)(1:113)|114|118|119|(0)(0)|122) */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x047f, code lost:
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0336 A[Catch: all -> 0x047f, TryCatch #6 {all -> 0x047f, blocks: (B:208:0x041b, B:210:0x0426, B:112:0x01d3, B:120:0x02fb, B:135:0x0320, B:142:0x0336, B:144:0x0340, B:147:0x0346, B:150:0x0357, B:152:0x035c, B:154:0x0361, B:161:0x0382, B:173:0x03be, B:175:0x03c4, B:157:0x0374, B:159:0x037b, B:160:0x037e, B:164:0x038f, B:171:0x03ad, B:167:0x03a1, B:169:0x03a6, B:170:0x03a9, B:151:0x035a, B:148:0x034e, B:177:0x03cc, B:180:0x03d8, B:182:0x03dd, B:184:0x03e0, B:186:0x03e5, B:190:0x03ec, B:192:0x03f2, B:185:0x03e3, B:181:0x03db, B:198:0x0400, B:200:0x0405, B:202:0x0408, B:204:0x040d, B:206:0x0414, B:203:0x040b, B:199:0x0403, B:113:0x025a), top: B:250:0x0181 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0426 A[Catch: all -> 0x047f, TRY_LEAVE, TryCatch #6 {all -> 0x047f, blocks: (B:208:0x041b, B:210:0x0426, B:112:0x01d3, B:120:0x02fb, B:135:0x0320, B:142:0x0336, B:144:0x0340, B:147:0x0346, B:150:0x0357, B:152:0x035c, B:154:0x0361, B:161:0x0382, B:173:0x03be, B:175:0x03c4, B:157:0x0374, B:159:0x037b, B:160:0x037e, B:164:0x038f, B:171:0x03ad, B:167:0x03a1, B:169:0x03a6, B:170:0x03a9, B:151:0x035a, B:148:0x034e, B:177:0x03cc, B:180:0x03d8, B:182:0x03dd, B:184:0x03e0, B:186:0x03e5, B:190:0x03ec, B:192:0x03f2, B:185:0x03e3, B:181:0x03db, B:198:0x0400, B:200:0x0405, B:202:0x0408, B:204:0x040d, B:206:0x0414, B:203:0x040b, B:199:0x0403, B:113:0x025a), top: B:250:0x0181 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0433 A[Catch: all -> 0x047d, TryCatch #5 {all -> 0x047d, blocks: (B:217:0x0440, B:222:0x044b, B:224:0x0459, B:214:0x042d, B:216:0x0433), top: B:248:0x042d }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x044b A[Catch: all -> 0x047d, TryCatch #5 {all -> 0x047d, blocks: (B:217:0x0440, B:222:0x044b, B:224:0x0459, B:214:0x042d, B:216:0x0433), top: B:248:0x042d }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.Bitmap MenuHostHelper$$ExternalSyntheticLambda1() {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.mE.MenuHostHelper$$ExternalSyntheticLambda1():android.graphics.Bitmap");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(mH mHVar) {
        boolean z = this.setUiOptions.setOnLongClickListener;
        mY mYVar = mHVar.setOnLongClickListener;
        if (this.setIconTintList == null) {
            this.setIconTintList = mHVar;
            if (z) {
                List<mH> list = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (list == null || list.isEmpty()) {
                    C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Hunter", "joined", mYVar.setIconTintList(), "to empty hunter");
                    return;
                } else {
                    C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Hunter", "joined", mYVar.setIconTintList(), C0321ni.setX(this, "to "));
                    return;
                }
            }
            return;
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new ArrayList(3);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0.add(mHVar);
        if (z) {
            C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Hunter", "joined", mYVar.setIconTintList(), C0321ni.setX(this, "to "));
        }
        mU.setY sety = mHVar.setOnLongClickListener.setOnLongClickListener;
        if (sety.ordinal() > this.setChipCornerRadius.ordinal()) {
            this.setChipCornerRadius = sety;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(mH mHVar) {
        boolean remove;
        boolean z = true;
        if (this.setIconTintList == mHVar) {
            this.setIconTintList = null;
            remove = true;
        } else {
            List<mH> list = this.MenuHostHelper$$ExternalSyntheticLambda0;
            remove = list != null ? list.remove(mHVar) : false;
        }
        if (remove && mHVar.setOnLongClickListener.setOnLongClickListener == this.setChipCornerRadius) {
            mU.setY sety = mU.setY.LOW;
            List<mH> list2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            boolean z2 = (list2 == null || list2.isEmpty()) ? false : true;
            mH mHVar2 = this.setIconTintList;
            if (mHVar2 == null && !z2) {
                z = false;
            }
            if (z) {
                if (mHVar2 != null) {
                    sety = mHVar2.setOnLongClickListener.setOnLongClickListener;
                }
                if (z2) {
                    int size = this.MenuHostHelper$$ExternalSyntheticLambda0.size();
                    for (int i = 0; i < size; i++) {
                        mU.setY sety2 = this.MenuHostHelper$$ExternalSyntheticLambda0.get(i).setOnLongClickListener.setOnLongClickListener;
                        if (sety2.ordinal() > sety.ordinal()) {
                            sety = sety2;
                        }
                    }
                }
            }
            this.setChipCornerRadius = sety;
        }
        if (this.setUiOptions.setOnLongClickListener) {
            C0321ni.MenuHostHelper$$ExternalSyntheticLambda0("Hunter", "removed", mHVar.setOnLongClickListener.setIconTintList(), C0321ni.setX(this, "from "));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        Future<?> future;
        if (this.setIconTintList == null) {
            List<mH> list = this.MenuHostHelper$$ExternalSyntheticLambda0;
            return (list == null || list.isEmpty()) && (future = this.setX) != null && future.cancel(false);
        }
        return false;
    }

    private static Bitmap MenuHostHelper$$ExternalSyntheticLambda0(List<InterfaceC0319ng> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            final InterfaceC0319ng interfaceC0319ng = list.get(i);
            try {
                Bitmap iconTintList = interfaceC0319ng.setIconTintList();
                if (iconTintList == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(interfaceC0319ng.setX());
                    sb.append(" returned null after ");
                    sb.append(i);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (InterfaceC0319ng interfaceC0319ng2 : list) {
                        sb.append(interfaceC0319ng2.setX());
                        sb.append('\n');
                    }
                    mU.setY.post(new Runnable() { // from class: o.mE.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            throw new NullPointerException(sb.toString());
                        }
                    });
                    return null;
                } else if (iconTintList == bitmap && bitmap.isRecycled()) {
                    mU.setY.post(new Runnable() { // from class: o.mE.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb2 = new StringBuilder("Transformation ");
                            sb2.append(InterfaceC0319ng.this.setX());
                            sb2.append(" returned input Bitmap but recycled it.");
                            throw new IllegalStateException(sb2.toString());
                        }
                    });
                    return null;
                } else if (iconTintList != bitmap && !bitmap.isRecycled()) {
                    mU.setY.post(new Runnable() { // from class: o.mE.6
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb2 = new StringBuilder("Transformation ");
                            sb2.append(InterfaceC0319ng.this.setX());
                            sb2.append(" mutated input Bitmap but failed to recycle the original.");
                            throw new IllegalStateException(sb2.toString());
                        }
                    });
                    return null;
                } else {
                    i++;
                    bitmap = iconTintList;
                }
            } catch (RuntimeException e) {
                mU.setY.post(new Runnable() { // from class: o.mE.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        StringBuilder sb2 = new StringBuilder("Transformation ");
                        sb2.append(InterfaceC0319ng.this.setX());
                        sb2.append(" crashed with exception.");
                        throw new RuntimeException(sb2.toString(), e);
                    }
                });
                return null;
            }
        }
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static mE MenuHostHelper$$ExternalSyntheticLambda1(mU mUVar, mI mIVar, mD mDVar, C0318nf c0318nf, mH mHVar) {
        mY mYVar = mHVar.setOnLongClickListener;
        List<AbstractC0315nc> list = mUVar.setUnboundedRipple;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC0315nc abstractC0315nc = list.get(i);
            if (abstractC0315nc.setY(mYVar)) {
                return new mE(mUVar, mIVar, mDVar, c0318nf, mHVar, abstractC0315nc);
            }
        }
        return new mE(mUVar, mIVar, mDVar, c0318nf, mHVar, setZ);
    }
}