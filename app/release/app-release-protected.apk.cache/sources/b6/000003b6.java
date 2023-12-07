package o;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.eN;
import o.eO;

/* loaded from: classes.dex */
public class dV {
    public final aF<dT> MenuHostHelper$$ExternalSyntheticLambda0;
    private final C0126eg setCenterIfNoTextEnabled;
    public C0121eb setIconTintList;
    private final cW setLayoutAnimation;
    private eJ setNavigationOnClickListener;
    private String setOnLongClickListener;
    private final aF<ScheduledExecutorService> setUiOptions;
    private ScheduledFuture setUnboundedRipple;
    public final aF<C0124ee> setX;
    private static final C0106dm setY = C0106dm.setY();
    private static final dV MenuHostHelper$$ExternalSyntheticLambda1 = new dV();

    private dV() {
        this(new aF(new InterfaceC0073cg() { // from class: o.dY
            @Override // o.InterfaceC0073cg
            public final Object MenuHostHelper$$ExternalSyntheticLambda0() {
                return Executors.newSingleThreadScheduledExecutor();
            }
        }), C0126eg.setIconTintList(), cW.setY(), new aF(new InterfaceC0073cg() { // from class: o.dX
            @Override // o.InterfaceC0073cg
            public final Object MenuHostHelper$$ExternalSyntheticLambda0() {
                return dV.MenuHostHelper$$ExternalSyntheticLambda0();
            }
        }), new aF(new InterfaceC0073cg() { // from class: o.ea
            @Override // o.InterfaceC0073cg
            public final Object MenuHostHelper$$ExternalSyntheticLambda0() {
                return dV.setX();
            }
        }));
    }

    public static /* synthetic */ dT MenuHostHelper$$ExternalSyntheticLambda0() {
        return new dT();
    }

    public static /* synthetic */ C0124ee setX() {
        return new C0124ee();
    }

    private dV(aF<ScheduledExecutorService> aFVar, C0126eg c0126eg, cW cWVar, aF<dT> aFVar2, aF<C0124ee> aFVar3) {
        this.setUnboundedRipple = null;
        this.setOnLongClickListener = null;
        this.setNavigationOnClickListener = eJ.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.setUiOptions = aFVar;
        this.setCenterIfNoTextEnabled = c0126eg;
        this.setLayoutAnimation = cWVar;
        this.setIconTintList = null;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = aFVar2;
        this.setX = aFVar3;
    }

    public static dV setIconTintList() {
        dV dVVar;
        synchronized (dV.class) {
            dVVar = MenuHostHelper$$ExternalSyntheticLambda1;
        }
        return dVVar;
    }

    public final void setIconTintList(dO dOVar, final eJ eJVar) {
        if (this.setOnLongClickListener != null) {
            setY();
        }
        long iconTintList = setIconTintList(eJVar, dOVar.MenuHostHelper$$ExternalSyntheticLambda1);
        if (iconTintList == -1) {
            C0106dm c0106dm = setY;
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setX("Invalid gauge collection frequency. Unable to start collecting Gauges.");
                return;
            }
            return;
        }
        final String str = dOVar.setY;
        this.setOnLongClickListener = str;
        this.setNavigationOnClickListener = eJVar;
        try {
            long j = iconTintList * 20;
            this.setUnboundedRipple = this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0().scheduleAtFixedRate(new Runnable() { // from class: o.dW
                @Override // java.lang.Runnable
                public final void run() {
                    dV.this.setY(str, eJVar);
                }
            }, j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C0106dm c0106dm2 = setY;
            StringBuilder sb = new StringBuilder("Unable to start collecting Gauges: ");
            sb.append(e.getMessage());
            String obj = sb.toString();
            if (c0106dm2.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo2 = c0106dm2.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setX(obj);
            }
        }
    }

    public final void setY() {
        final String str = this.setOnLongClickListener;
        if (str == null) {
            return;
        }
        final eJ eJVar = this.setNavigationOnClickListener;
        dT MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0();
        ScheduledFuture scheduledFuture = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 = null;
            MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 = -1L;
        }
        C0124ee MenuHostHelper$$ExternalSyntheticLambda02 = this.setX.MenuHostHelper$$ExternalSyntheticLambda0();
        ScheduledFuture scheduledFuture2 = MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda0;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda0 = null;
            MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda1 = -1L;
        }
        ScheduledFuture scheduledFuture3 = this.setUnboundedRipple;
        if (scheduledFuture3 != null) {
            scheduledFuture3.cancel(false);
        }
        this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0().schedule(new Runnable() { // from class: o.dZ
            @Override // java.lang.Runnable
            public final void run() {
                dV.this.setY(str, eJVar);
            }
        }, 20L, TimeUnit.MILLISECONDS);
        this.setOnLongClickListener = null;
        this.setNavigationOnClickListener = eJ.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    public final void setY(String str, eJ eJVar) {
        eO.setY x = eO.setX();
        while (!this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0().setUiOptions.isEmpty()) {
            x.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0().setUiOptions.poll());
        }
        while (!this.setX.MenuHostHelper$$ExternalSyntheticLambda0().setY.isEmpty()) {
            x.setIconTintList(this.setX.MenuHostHelper$$ExternalSyntheticLambda0().setY.poll());
        }
        x.MenuHostHelper$$ExternalSyntheticLambda1(str);
        C0126eg c0126eg = this.setCenterIfNoTextEnabled;
        c0126eg.MenuHostHelper$$ExternalSyntheticLambda0.execute(new RunnableC0136eq(c0126eg, x.ViewPager$SavedState$1(), eJVar));
    }

    public final boolean setX(String str, eJ eJVar) {
        if (this.setIconTintList != null) {
            C0126eg c0126eg = this.setCenterIfNoTextEnabled;
            c0126eg.MenuHostHelper$$ExternalSyntheticLambda0.execute(new RunnableC0136eq(c0126eg, eO.setX().MenuHostHelper$$ExternalSyntheticLambda1(str).setIconTintList(MenuHostHelper$$ExternalSyntheticLambda1()).ViewPager$SavedState$1(), eJVar));
            return true;
        }
        return false;
    }

    private eN MenuHostHelper$$ExternalSyntheticLambda1() {
        eN.setY textAlignment;
        textAlignment = eN.DEFAULT_INSTANCE.setTextAlignment();
        long j = (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0.totalMem * EnumC0145ez.BYTES.MenuHostHelper$$ExternalSyntheticLambda0) / EnumC0145ez.KILOBYTES.MenuHostHelper$$ExternalSyntheticLambda0;
        int i = Integer.MIN_VALUE;
        eN.setY y = textAlignment.setY(j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j);
        long maxMemory = (this.setIconTintList.setX.maxMemory() * EnumC0145ez.BYTES.MenuHostHelper$$ExternalSyntheticLambda0) / EnumC0145ez.KILOBYTES.MenuHostHelper$$ExternalSyntheticLambda0;
        eN.setY MenuHostHelper$$ExternalSyntheticLambda12 = y.MenuHostHelper$$ExternalSyntheticLambda1(maxMemory > 2147483647L ? Integer.MAX_VALUE : maxMemory < -2147483648L ? Integer.MIN_VALUE : (int) maxMemory);
        long memoryClass = (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.getMemoryClass() * EnumC0145ez.MEGABYTES.MenuHostHelper$$ExternalSyntheticLambda0) / EnumC0145ez.KILOBYTES.MenuHostHelper$$ExternalSyntheticLambda0;
        if (memoryClass > 2147483647L) {
            i = Integer.MAX_VALUE;
        } else if (memoryClass >= -2147483648L) {
            i = (int) memoryClass;
        }
        return MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda0(i).ViewPager$SavedState$1();
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda0(long j, eA eAVar) {
        if (j == -1) {
            C0106dm c0106dm = setY;
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            }
            return false;
        }
        dT MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0();
        long j2 = MenuHostHelper$$ExternalSyntheticLambda0.setX;
        if (j2 == -1 || j2 == 0 || dT.MenuHostHelper$$ExternalSyntheticLambda1(j)) {
            return true;
        }
        if (MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            if (MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 != j) {
                ScheduledFuture scheduledFuture = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 = null;
                    MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 = -1L;
                }
                MenuHostHelper$$ExternalSyntheticLambda0.setX(j, eAVar);
                return true;
            }
            return true;
        }
        MenuHostHelper$$ExternalSyntheticLambda0.setX(j, eAVar);
        return true;
    }

    /* renamed from: o.dV$2 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] MenuHostHelper$$ExternalSyntheticLambda1;

        static {
            int[] iArr = new int[eJ.values().length];
            MenuHostHelper$$ExternalSyntheticLambda1 = iArr;
            try {
                iArr[eJ.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[eJ.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static void setY(final dT dTVar, final C0124ee c0124ee, final eA eAVar) {
        synchronized (dTVar) {
            try {
                dTVar.setIconTintList.schedule(new Runnable() { // from class: o.dR
                    @Override // java.lang.Runnable
                    public final void run() {
                        dT dTVar2 = dT.this;
                        eK MenuHostHelper$$ExternalSyntheticLambda0 = dTVar2.MenuHostHelper$$ExternalSyntheticLambda0(eAVar);
                        if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                            dTVar2.setUiOptions.add(MenuHostHelper$$ExternalSyntheticLambda0);
                        }
                    }
                }, 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                C0106dm c0106dm = dT.setY;
                StringBuilder sb = new StringBuilder("Unable to collect Cpu Metric: ");
                sb.append(e.getMessage());
                String obj = sb.toString();
                if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                    Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                    Cdo.setX(obj);
                }
            }
        }
        synchronized (c0124ee) {
            try {
                c0124ee.setIconTintList.schedule(new Runnable() { // from class: o.ed
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0124ee c0124ee2 = C0124ee.this;
                        eH iconTintList = c0124ee2.setIconTintList(eAVar);
                        if (iconTintList != null) {
                            c0124ee2.setY.add(iconTintList);
                        }
                    }
                }, 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                C0106dm c0106dm2 = C0124ee.setX;
                StringBuilder sb2 = new StringBuilder("Unable to collect Memory Metric: ");
                sb2.append(e2.getMessage());
                String obj2 = sb2.toString();
                if (c0106dm2.MenuHostHelper$$ExternalSyntheticLambda0) {
                    Cdo cdo2 = c0106dm2.MenuHostHelper$$ExternalSyntheticLambda1;
                    Cdo.setX(obj2);
                }
            }
        }
    }

    private long setIconTintList(eJ eJVar, eA eAVar) {
        long uiOptions;
        long iconSize;
        int i = AnonymousClass2.MenuHostHelper$$ExternalSyntheticLambda1[eJVar.ordinal()];
        boolean z = true;
        if (i == 1) {
            uiOptions = this.setLayoutAnimation.setUiOptions();
        } else {
            uiOptions = i != 2 ? -1L : this.setLayoutAnimation.setChipCornerRadius();
        }
        if (dT.MenuHostHelper$$ExternalSyntheticLambda1(uiOptions)) {
            uiOptions = -1;
        }
        if (!MenuHostHelper$$ExternalSyntheticLambda0(uiOptions, eAVar)) {
            uiOptions = -1;
        }
        int i2 = AnonymousClass2.MenuHostHelper$$ExternalSyntheticLambda1[eJVar.ordinal()];
        if (i2 == 1) {
            iconSize = this.setLayoutAnimation.setIconSize();
        } else {
            iconSize = i2 != 2 ? -1L : this.setLayoutAnimation.setTextAlignment();
        }
        if (C0124ee.setIconTintList(iconSize)) {
            iconSize = -1;
        }
        if (iconSize == -1) {
            C0106dm c0106dm = setY;
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            }
            z = false;
        } else {
            C0124ee MenuHostHelper$$ExternalSyntheticLambda0 = this.setX.MenuHostHelper$$ExternalSyntheticLambda0();
            if (!C0124ee.setIconTintList(iconSize)) {
                if (MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                    if (MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 != iconSize) {
                        ScheduledFuture scheduledFuture = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                            MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 = null;
                            MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 = -1L;
                        }
                        MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(iconSize, eAVar);
                    }
                } else {
                    MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(iconSize, eAVar);
                }
            }
        }
        return z ? uiOptions == -1 ? iconSize : Math.min(uiOptions, iconSize) : uiOptions;
    }
}