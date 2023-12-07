package o;

import android.text.format.DateUtils;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o.fN;

/* loaded from: classes.dex */
public final class fN {
    public final Map<String, String> MenuHostHelper$$ExternalSyntheticLambda0;
    public final fK MenuHostHelper$$ExternalSyntheticLambda1;
    private final Random ViewPager$SavedState$1;
    public final Executor setIconTintList;
    private final setSpinnersShown setNavigationOnClickListener;
    private final fS setOnLongClickListener;
    private final InterfaceC0083cq setUiOptions;
    private final InterfaceC0073cg<InterfaceC0020ah> setUnboundedRipple;
    public final fZ setX;
    public static final long setY = TimeUnit.HOURS.toSeconds(12);
    private static int[] setLayoutAnimation = {2, 4, 8, 16, 32, 64, 128, 256};

    public fN(InterfaceC0083cq interfaceC0083cq, InterfaceC0073cg<InterfaceC0020ah> interfaceC0073cg, Executor executor, setSpinnersShown setspinnersshown, Random random, fK fKVar, fS fSVar, fZ fZVar, Map<String, String> map) {
        this.setUiOptions = interfaceC0083cq;
        this.setUnboundedRipple = interfaceC0073cg;
        this.setIconTintList = executor;
        this.setNavigationOnClickListener = setspinnersshown;
        this.ViewPager$SavedState$1 = random;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = fKVar;
        this.setOnLongClickListener = fSVar;
        this.setX = fZVar;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = map;
    }

    public final setAutoSizeTextTypeUniformWithConfiguration<setX> setX(setAutoSizeTextTypeUniformWithConfiguration<fP> setautosizetexttypeuniformwithconfiguration, long j, final Map<String, String> map) {
        setTitleTextAppearance settitletextappearance;
        final Date date = new Date(this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0());
        if (setautosizetexttypeuniformwithconfiguration.MenuHostHelper$$ExternalSyntheticLambda0()) {
            Date date2 = new Date(this.setX.setX.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(fZ.MenuHostHelper$$ExternalSyntheticLambda1) ? false : date.before(new Date(date2.getTime() + TimeUnit.SECONDS.toMillis(j)))) {
                setX setx = new setX(date, 2, null, null);
                setTitleTextAppearance settitletextappearance2 = new setTitleTextAppearance();
                settitletextappearance2.setIconTintList(setx);
                return settitletextappearance2;
            }
        }
        Date date3 = this.setX.setIconTintList().setIconTintList;
        Date date4 = date.before(date3) ? date3 : null;
        if (date4 != null) {
            C0167fu c0167fu = new C0167fu(String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()))), date4.getTime());
            setTitleTextAppearance settitletextappearance3 = new setTitleTextAppearance();
            settitletextappearance3.setIconTintList((Exception) c0167fu);
            settitletextappearance = settitletextappearance3;
        } else {
            final setAutoSizeTextTypeUniformWithConfiguration<String> x = this.setUiOptions.setX();
            final setAutoSizeTextTypeUniformWithConfiguration<AbstractC0089cw> MenuHostHelper$$ExternalSyntheticLambda1 = this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1();
            settitletextappearance = AppBarLayout$BaseBehavior$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1(x, MenuHostHelper$$ExternalSyntheticLambda1).setY(this.setIconTintList, new setAllowedHandwritingDelegatePackage() { // from class: o.fQ
                @Override // o.setAllowedHandwritingDelegatePackage
                public final Object setX(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration2) {
                    fN fNVar = fN.this;
                    setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration3 = x;
                    setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration4 = MenuHostHelper$$ExternalSyntheticLambda1;
                    Date date5 = date;
                    Map<String, String> map2 = map;
                    if (!setautosizetexttypeuniformwithconfiguration3.MenuHostHelper$$ExternalSyntheticLambda0()) {
                        C0168fv c0168fv = new C0168fv("Firebase Installations failed to get installation ID for fetch.", setautosizetexttypeuniformwithconfiguration3.setY());
                        setTitleTextAppearance settitletextappearance4 = new setTitleTextAppearance();
                        settitletextappearance4.setIconTintList((Exception) c0168fv);
                        return settitletextappearance4;
                    } else if (!setautosizetexttypeuniformwithconfiguration4.MenuHostHelper$$ExternalSyntheticLambda0()) {
                        C0168fv c0168fv2 = new C0168fv("Firebase Installations failed to get installation auth token for fetch.", setautosizetexttypeuniformwithconfiguration4.setY());
                        setTitleTextAppearance settitletextappearance5 = new setTitleTextAppearance();
                        settitletextappearance5.setIconTintList((Exception) c0168fv2);
                        return settitletextappearance5;
                    } else {
                        return fNVar.MenuHostHelper$$ExternalSyntheticLambda1((String) setautosizetexttypeuniformwithconfiguration3.MenuHostHelper$$ExternalSyntheticLambda1(), ((AbstractC0089cw) setautosizetexttypeuniformwithconfiguration4.MenuHostHelper$$ExternalSyntheticLambda1()).MenuHostHelper$$ExternalSyntheticLambda0(), date5, map2);
                    }
                }
            });
        }
        return settitletextappearance.setY(this.setIconTintList, new setAllowedHandwritingDelegatePackage() { // from class: o.fU
            @Override // o.setAllowedHandwritingDelegatePackage
            public final Object setX(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration2) {
                return fN.this.setIconTintList(date, setautosizetexttypeuniformwithconfiguration2);
            }
        });
    }

    public final setAutoSizeTextTypeUniformWithConfiguration<setX> MenuHostHelper$$ExternalSyntheticLambda1(String str, String str2, Date date, Map<String, String> map) {
        try {
            final setX x = setX(str, str2, date, map);
            if (x.setX == 0) {
                return this.MenuHostHelper$$ExternalSyntheticLambda1.setX(x.MenuHostHelper$$ExternalSyntheticLambda1).MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, new getCallingUid() { // from class: o.fO
                    @Override // o.getCallingUid
                    public final setAutoSizeTextTypeUniformWithConfiguration setIconTintList(Object obj) {
                        fP fPVar = (fP) obj;
                        return fN.MenuHostHelper$$ExternalSyntheticLambda0(fN.setX.this);
                    }
                });
            }
            setTitleTextAppearance settitletextappearance = new setTitleTextAppearance();
            settitletextappearance.setIconTintList(x);
            return settitletextappearance;
        } catch (C0166ft e) {
            setTitleTextAppearance settitletextappearance2 = new setTitleTextAppearance();
            settitletextappearance2.setIconTintList((Exception) e);
            return settitletextappearance2;
        }
    }

    private setX setX(String str, String str2, Date date, Map<String, String> map) {
        String str3;
        boolean z = false;
        try {
            HttpURLConnection iconTintList = this.setOnLongClickListener.setIconTintList();
            fS fSVar = this.setOnLongClickListener;
            HashMap hashMap = new HashMap();
            InterfaceC0020ah MenuHostHelper$$ExternalSyntheticLambda0 = this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0();
            if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                for (Map.Entry<String, Object> entry : MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1().entrySet()) {
                    hashMap.put(entry.getKey(), entry.getValue().toString());
                }
            }
            String string = this.setX.setX.getString("last_fetch_etag", null);
            InterfaceC0020ah MenuHostHelper$$ExternalSyntheticLambda02 = this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0();
            setX y = fSVar.setY(iconTintList, str, str2, hashMap, string, map, MenuHostHelper$$ExternalSyntheticLambda02 == null ? null : (Long) MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda1().get("_fot"), date);
            if (y.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                this.setX.setY(y.MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation);
            }
            if (y.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                this.setX.MenuHostHelper$$ExternalSyntheticLambda0(y.MenuHostHelper$$ExternalSyntheticLambda0);
            }
            this.setX.MenuHostHelper$$ExternalSyntheticLambda0(0, fZ.MenuHostHelper$$ExternalSyntheticLambda0);
            return y;
        } catch (fB e) {
            int i = e.setIconTintList;
            if (i == 429 || i == 502 || i == 503 || i == 504) {
                int i2 = this.setX.setIconTintList().MenuHostHelper$$ExternalSyntheticLambda1 + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = setLayoutAnimation;
                long millis = timeUnit.toMillis(iArr[Math.min(i2, iArr.length) - 1]);
                this.setX.MenuHostHelper$$ExternalSyntheticLambda0(i2, new Date(date.getTime() + (millis / 2) + this.ViewPager$SavedState$1.nextInt((int) millis)));
            }
            fZ$MenuHostHelper$$ExternalSyntheticLambda0 iconTintList2 = this.setX.setIconTintList();
            if ((iconTintList2.MenuHostHelper$$ExternalSyntheticLambda1 > 1 || e.setIconTintList == 429) ? true : true) {
                throw new C0167fu(iconTintList2.setIconTintList.getTime());
            }
            int i3 = e.setIconTintList;
            if (i3 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i3 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else if (i3 == 429) {
                throw new C0168fv("The throttled response from the server was not handled correctly by the FRC SDK.");
            } else {
                if (i3 != 500) {
                    switch (i3) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new fB(e.setIconTintList, "Fetch failed: ".concat(str3), e);
        }
    }

    /* loaded from: classes.dex */
    public static class setX {
        final String MenuHostHelper$$ExternalSyntheticLambda0;
        final fP MenuHostHelper$$ExternalSyntheticLambda1;
        private final Date setIconTintList;
        final int setX;

        public setX(Date date, int i, fP fPVar, String str) {
            this.setIconTintList = date;
            this.setX = i;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = fPVar;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = str;
        }
    }

    public static /* synthetic */ setAutoSizeTextTypeUniformWithConfiguration MenuHostHelper$$ExternalSyntheticLambda0(setX setx) {
        setTitleTextAppearance settitletextappearance = new setTitleTextAppearance();
        settitletextappearance.setIconTintList(setx);
        return settitletextappearance;
    }

    public final /* synthetic */ setAutoSizeTextTypeUniformWithConfiguration setIconTintList(Date date, setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
        if (setautosizetexttypeuniformwithconfiguration.MenuHostHelper$$ExternalSyntheticLambda0()) {
            fZ fZVar = this.setX;
            synchronized (fZVar.setY) {
                fZVar.setX.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
        } else {
            Exception y = setautosizetexttypeuniformwithconfiguration.setY();
            if (y != null) {
                if (y instanceof C0167fu) {
                    fZ fZVar2 = this.setX;
                    synchronized (fZVar2.setY) {
                        fZVar2.setX.edit().putInt("last_fetch_status", 2).apply();
                    }
                } else {
                    fZ fZVar3 = this.setX;
                    synchronized (fZVar3.setY) {
                        fZVar3.setX.edit().putInt("last_fetch_status", 1).apply();
                    }
                }
            }
        }
        return setautosizetexttypeuniformwithconfiguration;
    }
}