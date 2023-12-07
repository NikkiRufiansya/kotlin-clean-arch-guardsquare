package o;

/* loaded from: classes.dex */
protected final class cZ$ViewPager$SavedState$1 extends AbstractC0095db<Long> {
    private static cZ$ViewPager$SavedState$1 setIconTintList;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC0095db
    public final String MenuHostHelper$$ExternalSyntheticLambda1() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC0095db
    public final String l_() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC0095db
    public final String m_() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }

    private cZ$ViewPager$SavedState$1() {
    }

    public static cZ$ViewPager$SavedState$1 setX() {
        cZ$ViewPager$SavedState$1 cz_viewpager_savedstate_1;
        synchronized (cZ$ViewPager$SavedState$1.class) {
            if (setIconTintList == null) {
                setIconTintList = new cZ$ViewPager$SavedState$1();
            }
            cz_viewpager_savedstate_1 = setIconTintList;
        }
        return cz_viewpager_savedstate_1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Long setIconTintList() {
        return 100L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Long setOnLongClickListener() {
        return 300L;
    }
}