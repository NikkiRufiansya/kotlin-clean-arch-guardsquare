package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setSplitTrack implements Runnable {
    long MenuHostHelper$$ExternalSyntheticLambda0;
    ArrayList<WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0> setIconTintList = new ArrayList<>();
    private ArrayList<setSplitTrack$MenuHostHelper$$ExternalSyntheticLambda1> setLayoutAnimation = new ArrayList<>();
    private long setX;
    static final ThreadLocal<setSplitTrack> setY = new ThreadLocal<>();
    private static Comparator<setSplitTrack$MenuHostHelper$$ExternalSyntheticLambda1> MenuHostHelper$$ExternalSyntheticLambda1 = new Comparator<setSplitTrack$MenuHostHelper$$ExternalSyntheticLambda1>() { // from class: o.setSplitTrack.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(setSplitTrack$MenuHostHelper$$ExternalSyntheticLambda1 setsplittrack_menuhosthelper__externalsyntheticlambda1, setSplitTrack$MenuHostHelper$$ExternalSyntheticLambda1 setsplittrack_menuhosthelper__externalsyntheticlambda12) {
            setSplitTrack$MenuHostHelper$$ExternalSyntheticLambda1 setsplittrack_menuhosthelper__externalsyntheticlambda13 = setsplittrack_menuhosthelper__externalsyntheticlambda1;
            setSplitTrack$MenuHostHelper$$ExternalSyntheticLambda1 setsplittrack_menuhosthelper__externalsyntheticlambda14 = setsplittrack_menuhosthelper__externalsyntheticlambda12;
            if ((setsplittrack_menuhosthelper__externalsyntheticlambda13.setY == null) != (setsplittrack_menuhosthelper__externalsyntheticlambda14.setY == null)) {
                return setsplittrack_menuhosthelper__externalsyntheticlambda13.setY == null ? 1 : -1;
            } else if (setsplittrack_menuhosthelper__externalsyntheticlambda13.MenuHostHelper$$ExternalSyntheticLambda1 != setsplittrack_menuhosthelper__externalsyntheticlambda14.MenuHostHelper$$ExternalSyntheticLambda1) {
                return setsplittrack_menuhosthelper__externalsyntheticlambda13.MenuHostHelper$$ExternalSyntheticLambda1 ? -1 : 1;
            } else {
                int i = setsplittrack_menuhosthelper__externalsyntheticlambda14.setX - setsplittrack_menuhosthelper__externalsyntheticlambda13.setX;
                if (i != 0) {
                    return i;
                }
                int i2 = setsplittrack_menuhosthelper__externalsyntheticlambda13.setIconTintList - setsplittrack_menuhosthelper__externalsyntheticlambda14.setIconTintList;
                if (i2 != 0) {
                    return i2;
                }
                return 0;
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, int i, int i2) {
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.isAttachedToWindow() && this.setX == 0) {
            this.setX = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setY();
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.post(this);
        }
        setSplitTrack$MenuHostHelper$$ExternalSyntheticLambda0 setsplittrack_menuhosthelper__externalsyntheticlambda0 = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.FragmentStateAdapter$2;
        setsplittrack_menuhosthelper__externalsyntheticlambda0.setY = i;
        setsplittrack_menuhosthelper__externalsyntheticlambda0.setIconTintList = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
        setSplitTrack$MenuHostHelper$$ExternalSyntheticLambda1 setsplittrack_menuhosthelper__externalsyntheticlambda1;
        long j = 0;
        try {
            setItemAnimator$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1("RV Prefetch");
            if (!this.setIconTintList.isEmpty()) {
                int size = this.setIconTintList.size();
                long j2 = 0;
                for (int i = 0; i < size; i++) {
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 = this.setIconTintList.get(i);
                    if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.getWindowVisibility() == 0) {
                        j2 = Math.max(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.getDrawingTime(), j2);
                    }
                }
                if (j2 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j2) + this.MenuHostHelper$$ExternalSyntheticLambda0;
                    int size2 = this.setIconTintList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03 = this.setIconTintList.get(i3);
                        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03.getWindowVisibility() == 0) {
                            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03.FragmentStateAdapter$2.setIconTintList(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03, false);
                            i2 += windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03.FragmentStateAdapter$2.setX;
                        }
                    }
                    this.setLayoutAnimation.ensureCapacity(i2);
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < size2) {
                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04 = this.setIconTintList.get(i4);
                        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04.getWindowVisibility() == 0) {
                            setSplitTrack$MenuHostHelper$$ExternalSyntheticLambda0 setsplittrack_menuhosthelper__externalsyntheticlambda0 = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04.FragmentStateAdapter$2;
                            int abs = Math.abs(setsplittrack_menuhosthelper__externalsyntheticlambda0.setY) + Math.abs(setsplittrack_menuhosthelper__externalsyntheticlambda0.setIconTintList);
                            for (int i6 = 0; i6 < (setsplittrack_menuhosthelper__externalsyntheticlambda0.setX << 1); i6 += 2) {
                                if (i5 >= this.setLayoutAnimation.size()) {
                                    setsplittrack_menuhosthelper__externalsyntheticlambda1 = new setSplitTrack$MenuHostHelper$$ExternalSyntheticLambda1();
                                    this.setLayoutAnimation.add(setsplittrack_menuhosthelper__externalsyntheticlambda1);
                                } else {
                                    setsplittrack_menuhosthelper__externalsyntheticlambda1 = this.setLayoutAnimation.get(i5);
                                }
                                int i7 = setsplittrack_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1[i6 + 1];
                                setsplittrack_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1 = i7 <= abs;
                                setsplittrack_menuhosthelper__externalsyntheticlambda1.setX = abs;
                                setsplittrack_menuhosthelper__externalsyntheticlambda1.setIconTintList = i7;
                                setsplittrack_menuhosthelper__externalsyntheticlambda1.setY = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04;
                                setsplittrack_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0 = setsplittrack_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1[i6];
                                i5++;
                            }
                        }
                        try {
                            i4++;
                            j = 0;
                        } catch (Throwable th) {
                            th = th;
                            j = 0;
                            this.setX = j;
                            setItemAnimator$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList();
                            throw th;
                        }
                    }
                    Collections.sort(this.setLayoutAnimation, MenuHostHelper$$ExternalSyntheticLambda1);
                    for (int i8 = 0; i8 < this.setLayoutAnimation.size(); i8++) {
                        setSplitTrack$MenuHostHelper$$ExternalSyntheticLambda1 setsplittrack_menuhosthelper__externalsyntheticlambda12 = this.setLayoutAnimation.get(i8);
                        if (setsplittrack_menuhosthelper__externalsyntheticlambda12.setY == null) {
                            break;
                        }
                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(setsplittrack_menuhosthelper__externalsyntheticlambda12.setY, setsplittrack_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda0, setsplittrack_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda1 ? Long.MAX_VALUE : nanos);
                        if (MenuHostHelper$$ExternalSyntheticLambda12 != null && MenuHostHelper$$ExternalSyntheticLambda12.setUnboundedRipple != null) {
                            if ((MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda1 & 1) != 0) {
                                if (!((MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda1 & 4) != 0) && (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = MenuHostHelper$$ExternalSyntheticLambda12.setUnboundedRipple.get()) != null) {
                                    if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setIconSize && windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation.setY.MenuHostHelper$$ExternalSyntheticLambda0() != 0) {
                                        windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions();
                                    }
                                    setSplitTrack$MenuHostHelper$$ExternalSyntheticLambda0 setsplittrack_menuhosthelper__externalsyntheticlambda02 = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.FragmentStateAdapter$2;
                                    setsplittrack_menuhosthelper__externalsyntheticlambda02.setIconTintList(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, true);
                                    if (setsplittrack_menuhosthelper__externalsyntheticlambda02.setX != 0) {
                                        setItemAnimator$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1("RV Nested Prefetch");
                                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setViewTranslationCallback;
                                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener;
                                        setminandmaxprogress.setUiOptions = 1;
                                        setminandmaxprogress.setLayoutAnimation = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1.setY();
                                        setminandmaxprogress.setIconTintList = false;
                                        setminandmaxprogress.setTextScaleX = false;
                                        setminandmaxprogress.setUnboundedRipple = false;
                                        for (int i9 = 0; i9 < (setsplittrack_menuhosthelper__externalsyntheticlambda02.setX << 1); i9 += 2) {
                                            MenuHostHelper$$ExternalSyntheticLambda1(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, setsplittrack_menuhosthelper__externalsyntheticlambda02.MenuHostHelper$$ExternalSyntheticLambda1[i9], nanos);
                                        }
                                        setItemAnimator$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList();
                                    }
                                }
                            }
                        }
                        setsplittrack_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda1 = false;
                        setsplittrack_menuhosthelper__externalsyntheticlambda12.setX = 0;
                        setsplittrack_menuhosthelper__externalsyntheticlambda12.setIconTintList = 0;
                        setsplittrack_menuhosthelper__externalsyntheticlambda12.setY = null;
                        setsplittrack_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
                    }
                    j = 0;
                }
            }
            this.setX = j;
            setItemAnimator$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, int i, long j) {
        boolean z;
        boolean z2;
        int MenuHostHelper$$ExternalSyntheticLambda0 = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation.setY.MenuHostHelper$$ExternalSyntheticLambda0();
        int i2 = 0;
        while (true) {
            z = true;
            if (i2 >= MenuHostHelper$$ExternalSyntheticLambda0) {
                z2 = false;
                break;
            }
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled y = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setY(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation.setY.MenuHostHelper$$ExternalSyntheticLambda1(i2));
            if (y.setIconSize == i) {
                if (!((y.MenuHostHelper$$ExternalSyntheticLambda1 & 4) != 0)) {
                    z2 = true;
                    break;
                }
            }
            i2++;
        }
        if (z2) {
            return null;
        }
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setContentScrimResource;
        try {
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setTextAppearanceResource++;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled iconTintList = setmaxems.setIconTintList(i, false, j);
            if (iconTintList != null) {
                if ((iconTintList.MenuHostHelper$$ExternalSyntheticLambda1 & 1) != 0) {
                    if ((iconTintList.MenuHostHelper$$ExternalSyntheticLambda1 & 4) == 0) {
                        z = false;
                    }
                    if (!z) {
                        setmaxems.setY(iconTintList.setIconTintList);
                    }
                }
                setmaxems.MenuHostHelper$$ExternalSyntheticLambda0(iconTintList, false);
            }
            return iconTintList;
        } finally {
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.MenuHostHelper$$ExternalSyntheticLambda1(false);
        }
    }
}