package o;

import java.util.Locale;
import java.util.NoSuchElementException;
import o.cZ;

/* loaded from: classes.dex */
public class cW {
    private static volatile cW setIconTintList;
    public static final C0106dm setY = C0106dm.setY();
    private final cY MenuHostHelper$$ExternalSyntheticLambda1 = cY.MenuHostHelper$$ExternalSyntheticLambda0();
    public C0143ex MenuHostHelper$$ExternalSyntheticLambda0 = new C0143ex();
    public C0094da setX = C0094da.MenuHostHelper$$ExternalSyntheticLambda0();

    private cW() {
    }

    public static cW setY() {
        cW cWVar;
        synchronized (cW.class) {
            if (setIconTintList == null) {
                setIconTintList = new cW();
            }
            cWVar = setIconTintList;
        }
        return cWVar;
    }

    public final boolean setOnNavigationItemSelectedListener() {
        Boolean x = setX();
        return (x == null || x.booleanValue()) && setGuidelinePercent();
    }

    public final boolean setAnimationFromJson() {
        C0142ew<Boolean> MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(cZ.setCenterIfNoTextEnabled.setX().m_());
        if (this.setX.MenuHostHelper$$ExternalSyntheticLambda1(cZ.setY.MenuHostHelper$$ExternalSyntheticLambda0().l_()).MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            return true;
        }
        return MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 != null;
    }

    private static boolean setY(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(cM.setX)) {
                return true;
            }
        }
        return false;
    }

    public final double setTextScaleX() {
        cZ.setAnimationFromJson x = cZ.setAnimationFromJson.setX();
        C0142ew<Double> iconTintList = this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(x.m_());
        boolean z = true;
        if (iconTintList.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Double d = iconTintList.MenuHostHelper$$ExternalSyntheticLambda0;
            if (d != null) {
                double doubleValue = d.doubleValue();
                if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                    C0094da c0094da = this.setX;
                    Double d2 = iconTintList.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (d2 != null) {
                        c0094da.setX("com.google.firebase.perf.TraceSamplingRate", d2.doubleValue());
                        Double d3 = iconTintList.MenuHostHelper$$ExternalSyntheticLambda0;
                        if (d3 != null) {
                            return d3.doubleValue();
                        }
                        throw new NoSuchElementException("No value present");
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        C0142ew<Double> iconTintList2 = this.setX.setIconTintList(x.l_());
        if (iconTintList2.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Double d4 = iconTintList2.MenuHostHelper$$ExternalSyntheticLambda0;
            if (d4 != null) {
                double doubleValue2 = d4.doubleValue();
                if ((0.0d > doubleValue2 || doubleValue2 > 1.0d) ? false : false) {
                    Double d5 = iconTintList2.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (d5 != null) {
                        return d5.doubleValue();
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList()) {
            return cZ.setAnimationFromJson.setUnboundedRipple().doubleValue();
        }
        return cZ.setAnimationFromJson.setIconTintList().doubleValue();
    }

    public final double setUnboundedRipple() {
        cZ.setOnLongClickListener x = cZ.setOnLongClickListener.setX();
        C0142ew<Double> iconTintList = this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(x.m_());
        boolean z = true;
        if (iconTintList.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Double d = iconTintList.MenuHostHelper$$ExternalSyntheticLambda0;
            if (d != null) {
                double doubleValue = d.doubleValue();
                if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                    C0094da c0094da = this.setX;
                    Double d2 = iconTintList.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (d2 != null) {
                        c0094da.setX("com.google.firebase.perf.NetworkRequestSamplingRate", d2.doubleValue());
                        Double d3 = iconTintList.MenuHostHelper$$ExternalSyntheticLambda0;
                        if (d3 != null) {
                            return d3.doubleValue();
                        }
                        throw new NoSuchElementException("No value present");
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        C0142ew<Double> iconTintList2 = this.setX.setIconTintList(x.l_());
        if (iconTintList2.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Double d4 = iconTintList2.MenuHostHelper$$ExternalSyntheticLambda0;
            if (d4 != null) {
                double doubleValue2 = d4.doubleValue();
                if ((0.0d > doubleValue2 || doubleValue2 > 1.0d) ? false : false) {
                    Double d5 = iconTintList2.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (d5 != null) {
                        return d5.doubleValue();
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList()) {
            return cZ.setOnLongClickListener.setNavigationOnClickListener().doubleValue();
        }
        return cZ.setOnLongClickListener.setIconTintList().doubleValue();
    }

    public final double ViewPager$SavedState$1() {
        cZ.setOnNavigationItemSelectedListener x = cZ.setOnNavigationItemSelectedListener.setX();
        C0142ew<Double> iconTintList = setIconTintList(x);
        boolean z = true;
        if (iconTintList.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Double d = iconTintList.MenuHostHelper$$ExternalSyntheticLambda0;
            if (d != null) {
                double doubleValue = d.doubleValue() / 100.0d;
                if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                    return doubleValue;
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        C0142ew<Double> iconTintList2 = this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(x.m_());
        if (iconTintList2.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Double d2 = iconTintList2.MenuHostHelper$$ExternalSyntheticLambda0;
            if (d2 != null) {
                double doubleValue2 = d2.doubleValue();
                if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                    C0094da c0094da = this.setX;
                    Double d3 = iconTintList2.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (d3 != null) {
                        c0094da.setX("com.google.firebase.perf.SessionSamplingRate", d3.doubleValue());
                        Double d4 = iconTintList2.MenuHostHelper$$ExternalSyntheticLambda0;
                        if (d4 != null) {
                            return d4.doubleValue();
                        }
                        throw new NoSuchElementException("No value present");
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        C0142ew<Double> iconTintList3 = this.setX.setIconTintList(x.l_());
        if (iconTintList3.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Double d5 = iconTintList3.MenuHostHelper$$ExternalSyntheticLambda0;
            if (d5 != null) {
                double doubleValue3 = d5.doubleValue();
                if ((0.0d > doubleValue3 || doubleValue3 > 1.0d) ? false : false) {
                    Double d6 = iconTintList3.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (d6 != null) {
                        return d6.doubleValue();
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList()) {
            return cZ.setOnNavigationItemSelectedListener.setUiOptions().doubleValue();
        }
        return cZ.setOnNavigationItemSelectedListener.setIconTintList().doubleValue();
    }

    public final long setChipCornerRadius() {
        cZ$ViewPager$SavedState$1 x = cZ$ViewPager$SavedState$1.setX();
        C0142ew<Long> MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(x);
        if (MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l != null) {
                if (l.longValue() >= 0) {
                    Long l2 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l2 != null) {
                        return l2.longValue();
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        C0142ew<Long> x2 = this.MenuHostHelper$$ExternalSyntheticLambda1.setX(x.m_());
        if (x2.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l3 = x2.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l3 != null) {
                if (l3.longValue() >= 0) {
                    C0094da c0094da = this.setX;
                    Long l4 = x2.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l4 != null) {
                        c0094da.setIconTintList("com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs", l4.longValue());
                        Long l5 = x2.MenuHostHelper$$ExternalSyntheticLambda0;
                        if (l5 != null) {
                            return l5.longValue();
                        }
                        throw new NoSuchElementException("No value present");
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        C0142ew<Long> x3 = this.setX.setX(x.l_());
        if (x3.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l6 = x3.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l6 != null) {
                if (l6.longValue() >= 0) {
                    Long l7 = x3.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l7 != null) {
                        return l7.longValue();
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList()) {
            return cZ$ViewPager$SavedState$1.setOnLongClickListener().longValue();
        }
        return cZ$ViewPager$SavedState$1.setIconTintList().longValue();
    }

    public final long setUiOptions() {
        cZ.setTextAlignment iconTintList = cZ.setTextAlignment.setIconTintList();
        C0142ew<Long> MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(iconTintList);
        if (MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l != null) {
                if (l.longValue() >= 0) {
                    Long l2 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l2 != null) {
                        return l2.longValue();
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        C0142ew<Long> x = this.MenuHostHelper$$ExternalSyntheticLambda1.setX(iconTintList.m_());
        if (x.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l3 = x.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l3 != null) {
                if (l3.longValue() >= 0) {
                    C0094da c0094da = this.setX;
                    Long l4 = x.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l4 != null) {
                        c0094da.setIconTintList("com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs", l4.longValue());
                        Long l5 = x.MenuHostHelper$$ExternalSyntheticLambda0;
                        if (l5 != null) {
                            return l5.longValue();
                        }
                        throw new NoSuchElementException("No value present");
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        C0142ew<Long> x2 = this.setX.setX(iconTintList.l_());
        if (x2.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l6 = x2.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l6 != null) {
                if (l6.longValue() >= 0) {
                    Long l7 = x2.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l7 != null) {
                        return l7.longValue();
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        return cZ.setTextAlignment.setX().longValue();
    }

    public final long setTextAlignment() {
        cZ.setMaxEms iconTintList = cZ.setMaxEms.setIconTintList();
        C0142ew<Long> MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(iconTintList);
        if (MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l != null) {
                if (l.longValue() >= 0) {
                    Long l2 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l2 != null) {
                        return l2.longValue();
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        C0142ew<Long> x = this.MenuHostHelper$$ExternalSyntheticLambda1.setX(iconTintList.m_());
        if (x.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l3 = x.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l3 != null) {
                if (l3.longValue() >= 0) {
                    C0094da c0094da = this.setX;
                    Long l4 = x.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l4 != null) {
                        c0094da.setIconTintList("com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs", l4.longValue());
                        Long l5 = x.MenuHostHelper$$ExternalSyntheticLambda0;
                        if (l5 != null) {
                            return l5.longValue();
                        }
                        throw new NoSuchElementException("No value present");
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        C0142ew<Long> x2 = this.setX.setX(iconTintList.l_());
        if (x2.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l6 = x2.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l6 != null) {
                if (l6.longValue() >= 0) {
                    Long l7 = x2.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l7 != null) {
                        return l7.longValue();
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList()) {
            return cZ.setMaxEms.setUiOptions().longValue();
        }
        return cZ.setMaxEms.setX().longValue();
    }

    public final long setIconSize() {
        cZ.setChipCornerRadius x = cZ.setChipCornerRadius.setX();
        C0142ew<Long> MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(x);
        if (MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l != null) {
                if (l.longValue() >= 0) {
                    Long l2 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l2 != null) {
                        return l2.longValue();
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        C0142ew<Long> x2 = this.MenuHostHelper$$ExternalSyntheticLambda1.setX(x.m_());
        if (x2.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l3 = x2.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l3 != null) {
                if (l3.longValue() >= 0) {
                    C0094da c0094da = this.setX;
                    Long l4 = x2.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l4 != null) {
                        c0094da.setIconTintList("com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs", l4.longValue());
                        Long l5 = x2.MenuHostHelper$$ExternalSyntheticLambda0;
                        if (l5 != null) {
                            return l5.longValue();
                        }
                        throw new NoSuchElementException("No value present");
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        C0142ew<Long> x3 = this.setX.setX(x.l_());
        if (x3.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l6 = x3.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l6 != null) {
                if (l6.longValue() >= 0) {
                    Long l7 = x3.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l7 != null) {
                        return l7.longValue();
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        return cZ.setChipCornerRadius.setIconTintList().longValue();
    }

    public final long setCenterIfNoTextEnabled() {
        cZ.setIconSize iconTintList = cZ.setIconSize.setIconTintList();
        C0142ew<Long> MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(iconTintList);
        if (MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l != null) {
                if (l.longValue() > 0) {
                    Long l2 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l2 != null) {
                        return l2.longValue();
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        C0142ew<Long> x = this.MenuHostHelper$$ExternalSyntheticLambda1.setX(iconTintList.m_());
        if (x.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l3 = x.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l3 != null) {
                if (l3.longValue() > 0) {
                    C0094da c0094da = this.setX;
                    Long l4 = x.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l4 != null) {
                        c0094da.setIconTintList("com.google.firebase.perf.SessionsMaxDurationMinutes", l4.longValue());
                        Long l5 = x.MenuHostHelper$$ExternalSyntheticLambda0;
                        if (l5 != null) {
                            return l5.longValue();
                        }
                        throw new NoSuchElementException("No value present");
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        C0142ew<Long> x2 = this.setX.setX(iconTintList.l_());
        if (x2.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l6 = x2.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l6 != null) {
                if (l6.longValue() > 0) {
                    Long l7 = x2.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l7 != null) {
                        return l7.longValue();
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        return cZ.setIconSize.setX().longValue();
    }

    public final long setZ() {
        cZ.setZ x = cZ.setZ.setX();
        C0142ew<Long> x2 = this.MenuHostHelper$$ExternalSyntheticLambda1.setX(x.m_());
        if (x2.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l = x2.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l != null) {
                if (l.longValue() >= 0) {
                    C0094da c0094da = this.setX;
                    Long l2 = x2.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l2 != null) {
                        c0094da.setIconTintList("com.google.firebase.perf.TraceEventCountForeground", l2.longValue());
                        Long l3 = x2.MenuHostHelper$$ExternalSyntheticLambda0;
                        if (l3 != null) {
                            return l3.longValue();
                        }
                        throw new NoSuchElementException("No value present");
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        C0142ew<Long> x3 = this.setX.setX(x.l_());
        if (x3.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l4 = x3.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l4 != null) {
                if (l4.longValue() >= 0) {
                    Long l5 = x3.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l5 != null) {
                        return l5.longValue();
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        return cZ.setZ.setIconTintList().longValue();
    }

    public final long setMaxEms() {
        cZ.setTextScaleX iconTintList = cZ.setTextScaleX.setIconTintList();
        C0142ew<Long> x = this.MenuHostHelper$$ExternalSyntheticLambda1.setX(iconTintList.m_());
        if (x.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l = x.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l != null) {
                if (l.longValue() >= 0) {
                    C0094da c0094da = this.setX;
                    Long l2 = x.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l2 != null) {
                        c0094da.setIconTintList("com.google.firebase.perf.TraceEventCountBackground", l2.longValue());
                        Long l3 = x.MenuHostHelper$$ExternalSyntheticLambda0;
                        if (l3 != null) {
                            return l3.longValue();
                        }
                        throw new NoSuchElementException("No value present");
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        C0142ew<Long> x2 = this.setX.setX(iconTintList.l_());
        if (x2.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l4 = x2.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l4 != null) {
                if (l4.longValue() >= 0) {
                    Long l5 = x2.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l5 != null) {
                        return l5.longValue();
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        return cZ.setTextScaleX.setX().longValue();
    }

    public final long setOnLongClickListener() {
        cZ.setNavigationOnClickListener iconTintList = cZ.setNavigationOnClickListener.setIconTintList();
        C0142ew<Long> x = this.MenuHostHelper$$ExternalSyntheticLambda1.setX(iconTintList.m_());
        if (x.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l = x.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l != null) {
                if (l.longValue() >= 0) {
                    C0094da c0094da = this.setX;
                    Long l2 = x.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l2 != null) {
                        c0094da.setIconTintList("com.google.firebase.perf.NetworkEventCountForeground", l2.longValue());
                        Long l3 = x.MenuHostHelper$$ExternalSyntheticLambda0;
                        if (l3 != null) {
                            return l3.longValue();
                        }
                        throw new NoSuchElementException("No value present");
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        C0142ew<Long> x2 = this.setX.setX(iconTintList.l_());
        if (x2.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l4 = x2.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l4 != null) {
                if (l4.longValue() >= 0) {
                    Long l5 = x2.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l5 != null) {
                        return l5.longValue();
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        return cZ.setNavigationOnClickListener.setX().longValue();
    }

    public final long setNavigationOnClickListener() {
        cZ.setLayoutAnimation iconTintList = cZ.setLayoutAnimation.setIconTintList();
        C0142ew<Long> x = this.MenuHostHelper$$ExternalSyntheticLambda1.setX(iconTintList.m_());
        if (x.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l = x.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l != null) {
                if (l.longValue() >= 0) {
                    C0094da c0094da = this.setX;
                    Long l2 = x.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l2 != null) {
                        c0094da.setIconTintList("com.google.firebase.perf.NetworkEventCountBackground", l2.longValue());
                        Long l3 = x.MenuHostHelper$$ExternalSyntheticLambda0;
                        if (l3 != null) {
                            return l3.longValue();
                        }
                        throw new NoSuchElementException("No value present");
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        C0142ew<Long> x2 = this.setX.setX(iconTintList.l_());
        if (x2.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l4 = x2.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l4 != null) {
                if (l4.longValue() >= 0) {
                    Long l5 = x2.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l5 != null) {
                        return l5.longValue();
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        return cZ.setLayoutAnimation.setX().longValue();
    }

    public final long setLayoutAnimation() {
        cZ.setUiOptions iconTintList = cZ.setUiOptions.setIconTintList();
        C0142ew<Long> x = this.MenuHostHelper$$ExternalSyntheticLambda1.setX(iconTintList.m_());
        if (x.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l = x.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l != null) {
                if (l.longValue() > 0) {
                    C0094da c0094da = this.setX;
                    Long l2 = x.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l2 != null) {
                        c0094da.setIconTintList("com.google.firebase.perf.TimeLimitSec", l2.longValue());
                        Long l3 = x.MenuHostHelper$$ExternalSyntheticLambda0;
                        if (l3 != null) {
                            return l3.longValue();
                        }
                        throw new NoSuchElementException("No value present");
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        C0142ew<Long> x2 = this.setX.setX(iconTintList.l_());
        if (x2.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Long l4 = x2.MenuHostHelper$$ExternalSyntheticLambda0;
            if (l4 != null) {
                if (l4.longValue() > 0) {
                    Long l5 = x2.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (l5 != null) {
                        return l5.longValue();
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        return cZ.setUiOptions.setX().longValue();
    }

    public final String MenuHostHelper$$ExternalSyntheticLambda1() {
        String MenuHostHelper$$ExternalSyntheticLambda1;
        cZ.setIconTintList x = cZ.setIconTintList.setX();
        if (cM.MenuHostHelper$$ExternalSyntheticLambda1.booleanValue()) {
            return cZ.setIconTintList.setIconTintList();
        }
        long longValue = ((Long) this.MenuHostHelper$$ExternalSyntheticLambda1.setY("fpr_log_source", -1L)).longValue();
        if (cZ.setIconTintList.setY(longValue) && (MenuHostHelper$$ExternalSyntheticLambda1 = cZ.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(longValue)) != null) {
            this.setX.MenuHostHelper$$ExternalSyntheticLambda0("com.google.firebase.perf.LogSourceName", MenuHostHelper$$ExternalSyntheticLambda1);
            return MenuHostHelper$$ExternalSyntheticLambda1;
        }
        C0142ew<String> y = this.setX.setY(x.l_());
        if (!(y.MenuHostHelper$$ExternalSyntheticLambda0 != null)) {
            return cZ.setIconTintList.setIconTintList();
        }
        String str = y.MenuHostHelper$$ExternalSyntheticLambda0;
        if (str != null) {
            return str;
        }
        throw new NoSuchElementException("No value present");
    }

    public final double MenuHostHelper$$ExternalSyntheticLambda0() {
        cZ.setX x = cZ.setX.setX();
        C0142ew<Double> iconTintList = setIconTintList(x);
        boolean z = true;
        if (iconTintList.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Double d = iconTintList.MenuHostHelper$$ExternalSyntheticLambda0;
            if (d != null) {
                double doubleValue = d.doubleValue() / 100.0d;
                if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                    return doubleValue;
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        C0142ew<Double> iconTintList2 = this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(x.m_());
        if (iconTintList2.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Double d2 = iconTintList2.MenuHostHelper$$ExternalSyntheticLambda0;
            if (d2 != null) {
                double doubleValue2 = d2.doubleValue();
                if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                    C0094da c0094da = this.setX;
                    Double d3 = iconTintList2.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (d3 != null) {
                        c0094da.setX("com.google.firebase.perf.FragmentSamplingRate", d3.doubleValue());
                        Double d4 = iconTintList2.MenuHostHelper$$ExternalSyntheticLambda0;
                        if (d4 != null) {
                            return d4.doubleValue();
                        }
                        throw new NoSuchElementException("No value present");
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        C0142ew<Double> iconTintList3 = this.setX.setIconTintList(x.l_());
        if (iconTintList3.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Double d5 = iconTintList3.MenuHostHelper$$ExternalSyntheticLambda0;
            if (d5 != null) {
                double doubleValue3 = d5.doubleValue();
                if ((0.0d > doubleValue3 || doubleValue3 > 1.0d) ? false : false) {
                    Double d6 = iconTintList3.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (d6 != null) {
                        return d6.doubleValue();
                    }
                    throw new NoSuchElementException("No value present");
                }
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        return cZ.setX.setIconTintList().doubleValue();
    }

    public final boolean setIconTintList() {
        cZ$MenuHostHelper$$ExternalSyntheticLambda0 iconTintList = cZ$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList();
        C0142ew<Boolean> MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(iconTintList.MenuHostHelper$$ExternalSyntheticLambda1());
        if (MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Boolean bool = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
            if (bool != null) {
                return bool.booleanValue();
            }
            throw new NoSuchElementException("No value present");
        }
        C0142ew<Boolean> MenuHostHelper$$ExternalSyntheticLambda02 = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(iconTintList.m_());
        if (MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            C0094da c0094da = this.setX;
            Boolean bool2 = MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda0;
            if (bool2 != null) {
                c0094da.setY("com.google.firebase.perf.ExperimentTTID", bool2.booleanValue());
                Boolean bool3 = MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda0;
                if (bool3 != null) {
                    return bool3.booleanValue();
                }
                throw new NoSuchElementException("No value present");
            }
            throw new NoSuchElementException("No value present");
        }
        C0142ew<Boolean> MenuHostHelper$$ExternalSyntheticLambda1 = this.setX.MenuHostHelper$$ExternalSyntheticLambda1(iconTintList.l_());
        if (!(MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 != null)) {
            return cZ$MenuHostHelper$$ExternalSyntheticLambda0.setX().booleanValue();
        }
        Boolean bool4 = MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
        if (bool4 != null) {
            return bool4.booleanValue();
        }
        throw new NoSuchElementException("No value present");
    }

    private C0142ew<Double> setIconTintList(AbstractC0095db<Double> abstractC0095db) {
        C0143ex c0143ex = this.MenuHostHelper$$ExternalSyntheticLambda0;
        String MenuHostHelper$$ExternalSyntheticLambda1 = abstractC0095db.MenuHostHelper$$ExternalSyntheticLambda1();
        if (MenuHostHelper$$ExternalSyntheticLambda1 != null && c0143ex.setY.containsKey(MenuHostHelper$$ExternalSyntheticLambda1)) {
            Object obj = c0143ex.setY.get(MenuHostHelper$$ExternalSyntheticLambda1);
            if (obj != null) {
                if (!(obj instanceof Float)) {
                    if (!(obj instanceof Double)) {
                        C0106dm c0106dm = C0143ex.MenuHostHelper$$ExternalSyntheticLambda1;
                        Object[] objArr = {MenuHostHelper$$ExternalSyntheticLambda1};
                        if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                            Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                            Cdo.setIconTintList(String.format(Locale.ENGLISH, "Metadata key %s contains type other than double: %s", objArr));
                        }
                        return new C0142ew<>();
                    }
                    return new C0142ew<>((Double) obj);
                }
                return new C0142ew<>(Double.valueOf(((Float) obj).doubleValue()));
            }
            return new C0142ew<>();
        }
        return new C0142ew<>();
    }

    private C0142ew<Long> MenuHostHelper$$ExternalSyntheticLambda0(AbstractC0095db<Long> abstractC0095db) {
        C0142ew<Integer> y = this.MenuHostHelper$$ExternalSyntheticLambda0.setY(abstractC0095db.MenuHostHelper$$ExternalSyntheticLambda1());
        if (y.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Integer num = y.MenuHostHelper$$ExternalSyntheticLambda0;
            if (num == null) {
                throw new NoSuchElementException("No value present");
            }
            return new C0142ew<>(Long.valueOf(num.intValue()));
        }
        return new C0142ew<>();
    }

    public final Boolean setX() {
        Boolean y;
        C0142ew<Boolean> MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(cZ$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList().MenuHostHelper$$ExternalSyntheticLambda1());
        if (!(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 != null)) {
            y = cZ$MenuHostHelper$$ExternalSyntheticLambda1.setY();
        } else {
            Boolean bool = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
            if (bool != null) {
                y = bool;
            } else {
                throw new NoSuchElementException("No value present");
            }
        }
        if (y.booleanValue()) {
            return Boolean.FALSE;
        }
        cZ.setY MenuHostHelper$$ExternalSyntheticLambda02 = cZ.setY.MenuHostHelper$$ExternalSyntheticLambda0();
        C0142ew<Boolean> MenuHostHelper$$ExternalSyntheticLambda1 = this.setX.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda02.l_());
        if (MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Boolean bool2 = MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
            if (bool2 != null) {
                return bool2;
            }
            throw new NoSuchElementException("No value present");
        }
        C0142ew<Boolean> MenuHostHelper$$ExternalSyntheticLambda03 = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda1());
        if (MenuHostHelper$$ExternalSyntheticLambda03.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Boolean bool3 = MenuHostHelper$$ExternalSyntheticLambda03.MenuHostHelper$$ExternalSyntheticLambda0;
            if (bool3 != null) {
                return bool3;
            }
            throw new NoSuchElementException("No value present");
        }
        return null;
    }

    private boolean setGuidelinePercent() {
        boolean booleanValue;
        C0142ew c0142ew;
        boolean y;
        cZ.setCenterIfNoTextEnabled x = cZ.setCenterIfNoTextEnabled.setX();
        C0142ew<Boolean> MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(x.m_());
        if (MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList()) {
                booleanValue = false;
            } else {
                C0094da c0094da = this.setX;
                Boolean bool = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
                if (bool != null) {
                    c0094da.setY("com.google.firebase.perf.SdkEnabled", bool.booleanValue());
                    Boolean bool2 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (bool2 != null) {
                        booleanValue = bool2.booleanValue();
                    } else {
                        throw new NoSuchElementException("No value present");
                    }
                } else {
                    throw new NoSuchElementException("No value present");
                }
            }
        } else {
            C0142ew<Boolean> MenuHostHelper$$ExternalSyntheticLambda1 = this.setX.MenuHostHelper$$ExternalSyntheticLambda1(x.l_());
            if (!(MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 != null)) {
                booleanValue = cZ.setCenterIfNoTextEnabled.setIconTintList().booleanValue();
            } else {
                Boolean bool3 = MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
                if (bool3 != null) {
                    booleanValue = bool3.booleanValue();
                } else {
                    throw new NoSuchElementException("No value present");
                }
            }
        }
        if (booleanValue) {
            cZ.setUnboundedRipple iconTintList = cZ.setUnboundedRipple.setIconTintList();
            cY cYVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
            String m_ = iconTintList.m_();
            if (m_ == null) {
                C0106dm c0106dm = cY.MenuHostHelper$$ExternalSyntheticLambda0;
                if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                    Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                    Cdo.setIconTintList("The key to get Remote Config String value is null.");
                }
                c0142ew = new C0142ew();
            } else {
                InterfaceC0171fy y2 = cYVar.setY(m_);
                if (y2 != null) {
                    c0142ew = new C0142ew(y2.setX());
                } else {
                    c0142ew = new C0142ew();
                }
            }
            if (c0142ew.MenuHostHelper$$ExternalSyntheticLambda0 != 0) {
                C0094da c0094da2 = this.setX;
                T t = c0142ew.MenuHostHelper$$ExternalSyntheticLambda0;
                if (t != 0) {
                    c0094da2.MenuHostHelper$$ExternalSyntheticLambda0("com.google.firebase.perf.SdkDisabledVersions", (String) t);
                    T t2 = c0142ew.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (t2 != 0) {
                        y = setY((String) t2);
                    } else {
                        throw new NoSuchElementException("No value present");
                    }
                } else {
                    throw new NoSuchElementException("No value present");
                }
            } else {
                C0142ew<String> y3 = this.setX.setY(iconTintList.l_());
                if (!(y3.MenuHostHelper$$ExternalSyntheticLambda0 != null)) {
                    y = setY(cZ.setUnboundedRipple.setX());
                } else {
                    String str = y3.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (str != null) {
                        y = setY(str);
                    } else {
                        throw new NoSuchElementException("No value present");
                    }
                }
            }
            if (!y) {
                return true;
            }
        }
        return false;
    }
}