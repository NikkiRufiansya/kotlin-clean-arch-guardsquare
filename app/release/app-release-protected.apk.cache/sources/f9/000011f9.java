package o;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class vP implements Closeable, Flushable {
    private static String ViewPager$SavedState$1 = null;
    private static String setAnimationFromJson = null;
    private static qP setCenterIfNoTextEnabled = null;
    private static String setChipCornerRadius = null;
    private static String setIconSize = null;
    public static final int setLayoutAnimation = 136;
    private static String setNavigationOnClickListener;
    private static String setOnNavigationItemSelectedListener;
    private static String setTextAlignment;
    private static String setTextScaleX;
    private static long setUnboundedRipple;
    private static String setZ;
    private InterfaceC0606xq ExtendableSavedState$1;
    private int FloatingActionButton$BaseBehavior;
    private long FragmentStateAdapter$2;
    final File MenuHostHelper$$ExternalSyntheticLambda0;
    long MenuHostHelper$$ExternalSyntheticLambda1;
    private final File SearchView$SavedState$1;
    private final setX setCheckedIconEnabled;
    private final File setChipIconTintResource;
    private boolean setContentScrimResource;
    private boolean setGuidelinePercent;
    private final File setHasDecor;
    boolean setIconTintList;
    private final LinkedHashMap<String, vP$MenuHostHelper$$ExternalSyntheticLambda0> setIconified;
    private boolean setLayoutDirection;
    private final int setMaxEms;
    private final vW setMinAndMaxProgress;
    long setOnLongClickListener;
    private boolean setTextAppearanceResource;
    final int setUiOptions;
    final wM setX;
    boolean setY;

    /* loaded from: classes.dex */
    public static final class setNavigationOnClickListener extends pO implements InterfaceC0377pk<IOException, nX> {
        public static final int MenuHostHelper$$ExternalSyntheticLambda0 = 254;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setNavigationOnClickListener() {
            super(1);
            vP.this = r1;
        }

        @Override // o.InterfaceC0377pk
        public final /* synthetic */ nX setX(IOException iOException) {
            pN.setY((Object) iOException, "");
            boolean z = vL.MenuHostHelper$$ExternalSyntheticLambda0;
            vP.this.setGuidelinePercent = true;
            return nX.setX;
        }
    }

    public vP(wM wMVar, File file, long j, vV vVVar) {
        pN.setY(wMVar, "");
        pN.setY(file, "");
        pN.setY(vVVar, "");
        this.setX = wMVar;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = file;
        this.setMaxEms = 201105;
        this.setUiOptions = 2;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = j;
        this.setIconified = new LinkedHashMap<>(0, 0.75f, true);
        this.setMinAndMaxProgress = vVVar.MenuHostHelper$$ExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        sb.append(vL.setNavigationOnClickListener);
        sb.append(" Cache");
        this.setCheckedIconEnabled = new setX(sb.toString());
        if (!(j > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.SearchView$SavedState$1 = new File(file, setTextAlignment);
        this.setChipIconTintResource = new File(file, ViewPager$SavedState$1);
        this.setHasDecor = new File(file, setIconSize);
    }

    /* loaded from: classes.dex */
    public static final class setX extends vR {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setX(String str) {
            super(str);
            vP.this = r1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x0024, code lost:
            r1.setIconTintList = false;
         */
        @Override // o.vR
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long MenuHostHelper$$ExternalSyntheticLambda1() {
            /*
                r9 = this;
                o.vP r0 = o.vP.this
                monitor-enter(r0)
                o.vP r1 = o.vP.this     // Catch: java.lang.Throwable -> L61
                boolean r1 = o.vP.setIconTintList(r1)     // Catch: java.lang.Throwable -> L61
                r2 = -1
                if (r1 == 0) goto L5f
                o.vP r1 = o.vP.this     // Catch: java.lang.Throwable -> L61
                boolean r1 = r1.setY     // Catch: java.lang.Throwable -> L61
                if (r1 != 0) goto L5f
                o.vP r1 = o.vP.this     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L61
            L15:
                long r4 = r1.setOnLongClickListener     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L61
                long r6 = r1.MenuHostHelper$$ExternalSyntheticLambda1     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L61
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 <= 0) goto L24
                boolean r4 = r1.MenuHostHelper$$ExternalSyntheticLambda1()     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L61
                if (r4 != 0) goto L15
                goto L2d
            L24:
                r4 = 0
                r1.setIconTintList = r4     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L61
                goto L2d
            L28:
                o.vP r1 = o.vP.this     // Catch: java.lang.Throwable -> L61
                o.vP.setNavigationOnClickListener(r1)     // Catch: java.lang.Throwable -> L61
            L2d:
                o.vP r1 = o.vP.this     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L61
                boolean r1 = o.vP.setX(r1)     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L61
                if (r1 == 0) goto L5d
                o.vP r1 = o.vP.this     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L61
                r1.setIconTintList()     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L61
                o.vP r1 = o.vP.this     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L61
                o.vP.setOnLongClickListener(r1)     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L61
                goto L5d
            L40:
                o.vP r1 = o.vP.this     // Catch: java.lang.Throwable -> L61
                o.vP.setY(r1)     // Catch: java.lang.Throwable -> L61
                o.vP r1 = o.vP.this     // Catch: java.lang.Throwable -> L61
                o.xm r4 = new o.xm     // Catch: java.lang.Throwable -> L61
                r4.<init>()     // Catch: java.lang.Throwable -> L61
                o.xK r4 = (o.xK) r4     // Catch: java.lang.Throwable -> L61
                java.lang.String r5 = ""
                o.pN.setY(r4, r5)     // Catch: java.lang.Throwable -> L61
                o.xD r5 = new o.xD     // Catch: java.lang.Throwable -> L61
                r5.<init>(r4)     // Catch: java.lang.Throwable -> L61
                o.xq r5 = (o.InterfaceC0606xq) r5     // Catch: java.lang.Throwable -> L61
                o.vP.setY(r1, r5)     // Catch: java.lang.Throwable -> L61
            L5d:
                monitor-exit(r0)
                return r2
            L5f:
                monitor-exit(r0)
                return r2
            L61:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.vP.setX.MenuHostHelper$$ExternalSyntheticLambda1():long");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x017b, code lost:
        r3 = new java.lang.StringBuilder("unexpected journal line: ");
        r3.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x018e, code lost:
        throw new java.io.IOException(r3.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setUnboundedRipple() {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.vP.setUnboundedRipple():void");
    }

    private final InterfaceC0606xq MenuHostHelper$$ExternalSyntheticLambda0() {
        vT vTVar = new vT(this.setX.setIconTintList(this.SearchView$SavedState$1), new setNavigationOnClickListener());
        pN.setY(vTVar, "");
        return new xD(vTVar);
    }

    private final void setX() {
        this.setX.MenuHostHelper$$ExternalSyntheticLambda1(this.setChipIconTintResource);
        Iterator<vP$MenuHostHelper$$ExternalSyntheticLambda0> it = this.setIconified.values().iterator();
        while (it.hasNext()) {
            vP$MenuHostHelper$$ExternalSyntheticLambda0 next = it.next();
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) next, "");
            vP$MenuHostHelper$$ExternalSyntheticLambda0 vp_menuhosthelper__externalsyntheticlambda0 = next;
            int i = 0;
            if (vp_menuhosthelper__externalsyntheticlambda0.setX == null) {
                int i2 = this.setUiOptions;
                while (i < i2) {
                    this.setOnLongClickListener += vp_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0[i];
                    i++;
                }
            } else {
                vp_menuhosthelper__externalsyntheticlambda0.setX = null;
                int i3 = this.setUiOptions;
                while (i < i3) {
                    this.setX.MenuHostHelper$$ExternalSyntheticLambda1(vp_menuhosthelper__externalsyntheticlambda0.setIconTintList.get(i));
                    this.setX.MenuHostHelper$$ExternalSyntheticLambda1(vp_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void setIconTintList() {
        synchronized (this) {
            InterfaceC0606xq interfaceC0606xq = this.ExtendableSavedState$1;
            if (interfaceC0606xq != null) {
                interfaceC0606xq.close();
            }
            xK y = this.setX.setY(this.setChipIconTintResource);
            pN.setY(y, "");
            xD xDVar = new xD(y);
            xD xDVar2 = xDVar;
            xDVar2.setIconTintList(setTextScaleX).MenuHostHelper$$ExternalSyntheticLambda0(10);
            xDVar2.setIconTintList(setOnNavigationItemSelectedListener).MenuHostHelper$$ExternalSyntheticLambda0(10);
            xDVar2.setLayoutAnimation(this.setMaxEms).MenuHostHelper$$ExternalSyntheticLambda0(10);
            xDVar2.setLayoutAnimation(this.setUiOptions).MenuHostHelper$$ExternalSyntheticLambda0(10);
            xDVar2.MenuHostHelper$$ExternalSyntheticLambda0(10);
            for (vP$MenuHostHelper$$ExternalSyntheticLambda0 vp_menuhosthelper__externalsyntheticlambda0 : this.setIconified.values()) {
                if (vp_menuhosthelper__externalsyntheticlambda0.setX != null) {
                    xDVar2.setIconTintList(setChipCornerRadius).MenuHostHelper$$ExternalSyntheticLambda0(32);
                    xDVar2.setIconTintList(vp_menuhosthelper__externalsyntheticlambda0.setY);
                    xDVar2.MenuHostHelper$$ExternalSyntheticLambda0(10);
                } else {
                    xDVar2.setIconTintList(setNavigationOnClickListener).MenuHostHelper$$ExternalSyntheticLambda0(32);
                    xDVar2.setIconTintList(vp_menuhosthelper__externalsyntheticlambda0.setY);
                    vp_menuhosthelper__externalsyntheticlambda0.setY(xDVar2);
                    xDVar2.MenuHostHelper$$ExternalSyntheticLambda0(10);
                }
            }
            nX nXVar = nX.setX;
            C0371pe.setX(xDVar, null);
            if (this.setX.MenuHostHelper$$ExternalSyntheticLambda0(this.SearchView$SavedState$1)) {
                this.setX.setIconTintList(this.SearchView$SavedState$1, this.setHasDecor);
            }
            this.setX.setIconTintList(this.setChipIconTintResource, this.SearchView$SavedState$1);
            this.setX.MenuHostHelper$$ExternalSyntheticLambda1(this.setHasDecor);
            this.ExtendableSavedState$1 = MenuHostHelper$$ExternalSyntheticLambda0();
            this.setGuidelinePercent = false;
            this.setContentScrimResource = false;
        }
    }

    public final vP$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        synchronized (this) {
            pN.setY(str, "");
            setUiOptions();
            setY();
            setIconTintList(str);
            vP$MenuHostHelper$$ExternalSyntheticLambda0 vp_menuhosthelper__externalsyntheticlambda0 = this.setIconified.get(str);
            if (vp_menuhosthelper__externalsyntheticlambda0 != null) {
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) vp_menuhosthelper__externalsyntheticlambda0, "");
                vP$MenuHostHelper$$ExternalSyntheticLambda1 y = vp_menuhosthelper__externalsyntheticlambda0.setY();
                if (y != null) {
                    boolean z = true;
                    this.FloatingActionButton$BaseBehavior++;
                    InterfaceC0606xq interfaceC0606xq = this.ExtendableSavedState$1;
                    pN.setX(interfaceC0606xq);
                    interfaceC0606xq.setIconTintList(setAnimationFromJson).MenuHostHelper$$ExternalSyntheticLambda0(32).setIconTintList(str).MenuHostHelper$$ExternalSyntheticLambda0(10);
                    int i = this.FloatingActionButton$BaseBehavior;
                    if (i < 2000 || i < this.setIconified.size()) {
                        z = false;
                    }
                    if (z) {
                        this.setMinAndMaxProgress.setX(this.setCheckedIconEnabled, 0L);
                    }
                    return y;
                }
                return null;
            }
            return null;
        }
    }

    public static /* synthetic */ setY setIconTintList(vP vPVar, String str) {
        return vPVar.setX(str, setUnboundedRipple);
    }

    public final setY setX(String str, long j) {
        synchronized (this) {
            pN.setY(str, "");
            setUiOptions();
            setY();
            setIconTintList(str);
            vP$MenuHostHelper$$ExternalSyntheticLambda0 vp_menuhosthelper__externalsyntheticlambda0 = this.setIconified.get(str);
            if (j == setUnboundedRipple || (vp_menuhosthelper__externalsyntheticlambda0 != null && vp_menuhosthelper__externalsyntheticlambda0.setUnboundedRipple == j)) {
                if ((vp_menuhosthelper__externalsyntheticlambda0 != null ? vp_menuhosthelper__externalsyntheticlambda0.setX : null) != null) {
                    return null;
                }
                if (vp_menuhosthelper__externalsyntheticlambda0 == null || vp_menuhosthelper__externalsyntheticlambda0.setLayoutAnimation == 0) {
                    if (!this.setIconTintList && !this.setContentScrimResource) {
                        InterfaceC0606xq interfaceC0606xq = this.ExtendableSavedState$1;
                        pN.setX(interfaceC0606xq);
                        interfaceC0606xq.setIconTintList(setChipCornerRadius).MenuHostHelper$$ExternalSyntheticLambda0(32).setIconTintList(str).MenuHostHelper$$ExternalSyntheticLambda0(10);
                        interfaceC0606xq.flush();
                        if (this.setGuidelinePercent) {
                            return null;
                        }
                        if (vp_menuhosthelper__externalsyntheticlambda0 == null) {
                            vp_menuhosthelper__externalsyntheticlambda0 = new vP$MenuHostHelper$$ExternalSyntheticLambda0(this, str);
                            this.setIconified.put(str, vp_menuhosthelper__externalsyntheticlambda0);
                        }
                        setY sety = new setY(this, vp_menuhosthelper__externalsyntheticlambda0);
                        vp_menuhosthelper__externalsyntheticlambda0.setX = sety;
                        return sety;
                    }
                    this.setMinAndMaxProgress.setX(this.setCheckedIconEnabled, 0L);
                    return null;
                }
                return null;
            }
            return null;
        }
    }

    public final boolean setX(String str) {
        synchronized (this) {
            pN.setY(str, "");
            setUiOptions();
            setY();
            setIconTintList(str);
            vP$MenuHostHelper$$ExternalSyntheticLambda0 vp_menuhosthelper__externalsyntheticlambda0 = this.setIconified.get(str);
            if (vp_menuhosthelper__externalsyntheticlambda0 != null) {
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) vp_menuhosthelper__externalsyntheticlambda0, "");
                setX(vp_menuhosthelper__externalsyntheticlambda0);
                if (this.setOnLongClickListener <= this.MenuHostHelper$$ExternalSyntheticLambda1) {
                    this.setIconTintList = false;
                }
                return true;
            }
            return false;
        }
    }

    public final boolean setX(vP$MenuHostHelper$$ExternalSyntheticLambda0 vp_menuhosthelper__externalsyntheticlambda0) {
        InterfaceC0606xq interfaceC0606xq;
        pN.setY(vp_menuhosthelper__externalsyntheticlambda0, "");
        if (!this.setTextAppearanceResource) {
            if (vp_menuhosthelper__externalsyntheticlambda0.setLayoutAnimation > 0 && (interfaceC0606xq = this.ExtendableSavedState$1) != null) {
                interfaceC0606xq.setIconTintList(setChipCornerRadius);
                interfaceC0606xq.MenuHostHelper$$ExternalSyntheticLambda0(32);
                interfaceC0606xq.setIconTintList(vp_menuhosthelper__externalsyntheticlambda0.setY);
                interfaceC0606xq.MenuHostHelper$$ExternalSyntheticLambda0(10);
                interfaceC0606xq.flush();
            }
            if (vp_menuhosthelper__externalsyntheticlambda0.setLayoutAnimation > 0 || vp_menuhosthelper__externalsyntheticlambda0.setX != null) {
                vp_menuhosthelper__externalsyntheticlambda0.setOnLongClickListener = true;
                return true;
            }
        }
        setY sety = vp_menuhosthelper__externalsyntheticlambda0.setX;
        if (sety != null) {
            sety.MenuHostHelper$$ExternalSyntheticLambda1();
        }
        int i = this.setUiOptions;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            this.setX.MenuHostHelper$$ExternalSyntheticLambda1(vp_menuhosthelper__externalsyntheticlambda0.setIconTintList.get(i2));
            this.setOnLongClickListener -= vp_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0[i2];
            vp_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0[i2] = 0;
        }
        this.FloatingActionButton$BaseBehavior++;
        InterfaceC0606xq interfaceC0606xq2 = this.ExtendableSavedState$1;
        if (interfaceC0606xq2 != null) {
            interfaceC0606xq2.setIconTintList(setZ);
            interfaceC0606xq2.MenuHostHelper$$ExternalSyntheticLambda0(32);
            interfaceC0606xq2.setIconTintList(vp_menuhosthelper__externalsyntheticlambda0.setY);
            interfaceC0606xq2.MenuHostHelper$$ExternalSyntheticLambda0(10);
        }
        this.setIconified.remove(vp_menuhosthelper__externalsyntheticlambda0.setY);
        int i3 = this.FloatingActionButton$BaseBehavior;
        if (i3 >= 2000 && i3 >= this.setIconified.size()) {
            z = true;
        }
        if (z) {
            this.setMinAndMaxProgress.setX(this.setCheckedIconEnabled, 0L);
        }
        return true;
    }

    private final void setY() {
        synchronized (this) {
            if (!(!this.setY)) {
                throw new IllegalStateException("cache is closed".toString());
            }
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        synchronized (this) {
            if (this.setLayoutDirection) {
                setY();
                while (true) {
                    if (this.setOnLongClickListener > this.MenuHostHelper$$ExternalSyntheticLambda1) {
                        if (!MenuHostHelper$$ExternalSyntheticLambda1()) {
                            break;
                        }
                    } else {
                        this.setIconTintList = false;
                        break;
                    }
                }
                InterfaceC0606xq interfaceC0606xq = this.ExtendableSavedState$1;
                pN.setX(interfaceC0606xq);
                interfaceC0606xq.flush();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        vP$MenuHostHelper$$ExternalSyntheticLambda0[] vp_menuhosthelper__externalsyntheticlambda0Arr;
        setY sety;
        synchronized (this) {
            if (this.setLayoutDirection && !this.setY) {
                Collection<vP$MenuHostHelper$$ExternalSyntheticLambda0> values = this.setIconified.values();
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) values, "");
                Object[] array = values.toArray(new vP$MenuHostHelper$$ExternalSyntheticLambda0[0]);
                if (array != null) {
                    for (vP$MenuHostHelper$$ExternalSyntheticLambda0 vp_menuhosthelper__externalsyntheticlambda0 : (vP$MenuHostHelper$$ExternalSyntheticLambda0[]) array) {
                        if (vp_menuhosthelper__externalsyntheticlambda0.setX != null && (sety = vp_menuhosthelper__externalsyntheticlambda0.setX) != null) {
                            sety.MenuHostHelper$$ExternalSyntheticLambda1();
                        }
                    }
                    while (true) {
                        if (this.setOnLongClickListener > this.MenuHostHelper$$ExternalSyntheticLambda1) {
                            if (!MenuHostHelper$$ExternalSyntheticLambda1()) {
                                break;
                            }
                        } else {
                            this.setIconTintList = false;
                            break;
                        }
                    }
                    InterfaceC0606xq interfaceC0606xq = this.ExtendableSavedState$1;
                    pN.setX(interfaceC0606xq);
                    interfaceC0606xq.close();
                    this.ExtendableSavedState$1 = null;
                    this.setY = true;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            this.setY = true;
        }
    }

    final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        for (vP$MenuHostHelper$$ExternalSyntheticLambda0 vp_menuhosthelper__externalsyntheticlambda0 : this.setIconified.values()) {
            if (!vp_menuhosthelper__externalsyntheticlambda0.setOnLongClickListener) {
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) vp_menuhosthelper__externalsyntheticlambda0, "");
                setX(vp_menuhosthelper__externalsyntheticlambda0);
                return true;
            }
        }
        return false;
    }

    private static void setIconTintList(String str) {
        qP qPVar = setCenterIfNoTextEnabled;
        String str2 = str;
        pN.setY(str2, "");
        if (qPVar.setX.matcher(str2).matches()) {
            return;
        }
        StringBuilder sb = new StringBuilder("keys must match regex [a-z0-9_-]{1,120}: \"");
        sb.append(str);
        sb.append('\"');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* loaded from: classes.dex */
    public final class setY {
        final /* synthetic */ vP MenuHostHelper$$ExternalSyntheticLambda0;
        private boolean MenuHostHelper$$ExternalSyntheticLambda1;
        final boolean[] setX;
        final vP$MenuHostHelper$$ExternalSyntheticLambda0 setY;

        public setY(vP vPVar, vP$MenuHostHelper$$ExternalSyntheticLambda0 vp_menuhosthelper__externalsyntheticlambda0) {
            pN.setY(vp_menuhosthelper__externalsyntheticlambda0, "");
            this.MenuHostHelper$$ExternalSyntheticLambda0 = vPVar;
            this.setY = vp_menuhosthelper__externalsyntheticlambda0;
            this.setX = vp_menuhosthelper__externalsyntheticlambda0.setUiOptions ? null : new boolean[vPVar.setUiOptions];
        }

        public final void MenuHostHelper$$ExternalSyntheticLambda1() {
            if (pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setY.setX, this)) {
                if (this.MenuHostHelper$$ExternalSyntheticLambda0.setTextAppearanceResource) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(this, false);
                } else {
                    this.setY.setOnLongClickListener = true;
                }
            }
        }

        public final xK MenuHostHelper$$ExternalSyntheticLambda1(int i) {
            synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                if (!(!this.MenuHostHelper$$ExternalSyntheticLambda1)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                setY sety = this;
                if (!pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setY.setX, this)) {
                    return new C0600xm();
                }
                if (!this.setY.setUiOptions) {
                    boolean[] zArr = this.setX;
                    pN.setX(zArr);
                    zArr[i] = true;
                }
                try {
                    return new vT(this.MenuHostHelper$$ExternalSyntheticLambda0.setX.setY(this.setY.MenuHostHelper$$ExternalSyntheticLambda1.get(i)), new vP$setY$MenuHostHelper$$ExternalSyntheticLambda1(this, i));
                } catch (FileNotFoundException unused) {
                    return new C0600xm();
                }
            }
        }

        public final void MenuHostHelper$$ExternalSyntheticLambda0() {
            synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                if (!(!this.MenuHostHelper$$ExternalSyntheticLambda1)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                setY sety = this;
                if (pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setY.setX, this)) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(this, true);
                }
                this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                nX nXVar = nX.setX;
            }
        }

        public final void setIconTintList() {
            synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                if (!(!this.MenuHostHelper$$ExternalSyntheticLambda1)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                setY sety = this;
                if (pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setY.setX, this)) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(this, false);
                }
                this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                nX nXVar = nX.setX;
            }
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
        new setIconTintList((byte) 0);
        setTextAlignment = "journal";
        ViewPager$SavedState$1 = "journal.tmp";
        setIconSize = "journal.bkp";
        setTextScaleX = "libcore.io.DiskLruCache";
        setOnNavigationItemSelectedListener = "1";
        setUnboundedRipple = -1L;
        setCenterIfNoTextEnabled = new qP("[a-z0-9_-]{1,120}");
        setNavigationOnClickListener = "CLEAN";
        setChipCornerRadius = "DIRTY";
        setZ = "REMOVE";
        setAnimationFromJson = "READ";
    }

    private void setUiOptions() {
        wR unused;
        synchronized (this) {
            boolean z = vL.MenuHostHelper$$ExternalSyntheticLambda0;
            if (this.setLayoutDirection) {
                return;
            }
            if (this.setX.MenuHostHelper$$ExternalSyntheticLambda0(this.setHasDecor)) {
                if (this.setX.MenuHostHelper$$ExternalSyntheticLambda0(this.SearchView$SavedState$1)) {
                    this.setX.MenuHostHelper$$ExternalSyntheticLambda1(this.setHasDecor);
                } else {
                    this.setX.setIconTintList(this.setHasDecor, this.SearchView$SavedState$1);
                }
            }
            this.setTextAppearanceResource = vL.MenuHostHelper$$ExternalSyntheticLambda0(this.setX, this.setHasDecor);
            if (this.setX.MenuHostHelper$$ExternalSyntheticLambda0(this.SearchView$SavedState$1)) {
                try {
                    setUnboundedRipple();
                    setX();
                    this.setLayoutDirection = true;
                    return;
                } catch (IOException e) {
                    wR$MenuHostHelper$$ExternalSyntheticLambda1 wr_menuhosthelper__externalsyntheticlambda1 = wR.setX;
                    unused = wR.MenuHostHelper$$ExternalSyntheticLambda1;
                    StringBuilder sb = new StringBuilder("DiskLruCache ");
                    sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
                    sb.append(" is corrupt: ");
                    sb.append(e.getMessage());
                    sb.append(", removing");
                    wR.setX(sb.toString(), 5, e);
                    close();
                    this.setX.setX(this.MenuHostHelper$$ExternalSyntheticLambda0);
                    this.setY = false;
                }
            }
            setIconTintList();
            this.setLayoutDirection = true;
        }
    }

    public static final /* synthetic */ boolean setX(vP vPVar) {
        int i = vPVar.FloatingActionButton$BaseBehavior;
        return i >= 2000 && i >= vPVar.setIconified.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0113, code lost:
        if (r1 != false) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(o.vP.setY r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.vP.MenuHostHelper$$ExternalSyntheticLambda0(o.vP$setY, boolean):void");
    }
}