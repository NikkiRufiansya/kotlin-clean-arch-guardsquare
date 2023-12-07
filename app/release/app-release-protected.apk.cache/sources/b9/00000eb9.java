package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import o.bB;
import o.getScaleX;
import o.getSystemWindowInsets;
import o.setHorizontalFadingEdgeEnabled;
import o.setHourClickDelegate;
import o.setIcon;
import o.setImeOptions;
import o.setOnItemReselectedListener;
import o.setPaddingRelative;
import o.setPrefixTextColor;
import o.setPreserveFocusAfterLayout;
import o.setStableInsets;

/* loaded from: classes.dex */
public final class setPreserveFocusAfterLayout implements setCheckMarkTintMode {
    private final int MenuHostHelper$$ExternalSyntheticLambda0;
    private URL MenuHostHelper$$ExternalSyntheticLambda1;
    private final InterfaceC0059bt setIconTintList;
    private final setSearchableInfo setOnLongClickListener;
    private final setSearchableInfo setUiOptions;
    private final Context setX;
    private final ConnectivityManager setY;

    private static URL setY(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            StringBuilder sb = new StringBuilder("Invalid url: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    private setPreserveFocusAfterLayout(Context context, setSearchableInfo setsearchableinfo, setSearchableInfo setsearchableinfo2, byte b) {
        bB bBVar = new bB();
        setColumnOrderPreserved.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(bBVar);
        bBVar.setY = true;
        this.setIconTintList = new bB.AnonymousClass2();
        this.setX = context;
        this.setY = (ConnectivityManager) context.getSystemService("connectivity");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setY(setSmoothScrollingEnabled.setX);
        this.setOnLongClickListener = setsearchableinfo2;
        this.setUiOptions = setsearchableinfo;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = 130000;
    }

    public setPreserveFocusAfterLayout(Context context, setSearchableInfo setsearchableinfo, setSearchableInfo setsearchableinfo2) {
        this(context, setsearchableinfo, setsearchableinfo2, (byte) 0);
    }

    private static int setIconTintList(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            String x = setTitleCollapseMode.setX("CctTransportBackend");
            if (Log.isLoggable(x, 6)) {
                Log.e(x, "Unable to find version code for package", e);
                return -1;
            }
            return -1;
        }
    }

    @Override // o.setCheckMarkTintMode
    public final setPaddingRelative MenuHostHelper$$ExternalSyntheticLambda1(setPaddingRelative setpaddingrelative) {
        int type;
        int subtype;
        NetworkInfo activeNetworkInfo = this.setY.getActiveNetworkInfo();
        setPaddingRelative.setIconTintList iconTintList = setpaddingrelative.setLayoutAnimation().setX("sdk-version", Build.VERSION.SDK_INT).setIconTintList("model", Build.MODEL).setIconTintList("hardware", Build.HARDWARE).setIconTintList("device", Build.DEVICE).setIconTintList("product", Build.PRODUCT).setIconTintList("os-uild", Build.ID).setIconTintList("manufacturer", Build.MANUFACTURER).setIconTintList("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        setPaddingRelative.setIconTintList MenuHostHelper$$ExternalSyntheticLambda0 = iconTintList.MenuHostHelper$$ExternalSyntheticLambda0("tz-offset", TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
        if (activeNetworkInfo != null) {
            type = activeNetworkInfo.getType();
        } else {
            type = setPrefixTextColor.setX.NONE.setY;
        }
        setPaddingRelative.setIconTintList x = MenuHostHelper$$ExternalSyntheticLambda0.setX("net-type", type);
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = setPrefixTextColor.setIconTintList.COMBINED.setIconTintList;
            } else if (setPrefixTextColor.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.get(subtype) == null) {
                subtype = 0;
            }
        } else {
            subtype = setPrefixTextColor.setIconTintList.UNKNOWN_MOBILE_SUBTYPE.setIconTintList;
        }
        return x.setX("mobile-subtype", subtype).setIconTintList("country", Locale.getDefault().getCountry()).setIconTintList("locale", Locale.getDefault().getLanguage()).setIconTintList("mcc_mnc", ((TelephonyManager) this.setX.getSystemService("phone")).getSimOperator()).setIconTintList("application_build", Integer.toString(setIconTintList(this.setX))).MenuHostHelper$$ExternalSyntheticLambda1();
    }

    private getScaleY setX(LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver) {
        setHourClickDelegate.setY MenuHostHelper$$ExternalSyntheticLambda0;
        HashMap hashMap = new HashMap();
        for (setPaddingRelative setpaddingrelative : liveData$LifecycleBoundObserver.setIconTintList()) {
            String y = setpaddingrelative.setY();
            if (!hashMap.containsKey(y)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(setpaddingrelative);
                hashMap.put(y, arrayList);
            } else {
                ((List) hashMap.get(y)).add(setpaddingrelative);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            setPaddingRelative setpaddingrelative2 = (setPaddingRelative) ((List) entry.getValue()).get(0);
            setOnItemReselectedListener.setY MenuHostHelper$$ExternalSyntheticLambda1 = new setIcon.setX().setX(setThumbTintMode.DEFAULT).setIconTintList(this.setUiOptions.setY()).MenuHostHelper$$ExternalSyntheticLambda1(this.setOnLongClickListener.setY()).MenuHostHelper$$ExternalSyntheticLambda1(new getScaleX.setX() { // from class: o.plus$MenuHostHelper$$ExternalSyntheticLambda0
                private setCollapseIcon setIconTintList;
                private getScaleX$MenuHostHelper$$ExternalSyntheticLambda0 setX;

                @Override // o.getScaleX.setX
                public final getScaleX.setX MenuHostHelper$$ExternalSyntheticLambda0(getScaleX$MenuHostHelper$$ExternalSyntheticLambda0 getscalex_menuhosthelper__externalsyntheticlambda0) {
                    this.setX = getscalex_menuhosthelper__externalsyntheticlambda0;
                    return this;
                }

                @Override // o.getScaleX.setX
                public final getScaleX.setX setY(setCollapseIcon setcollapseicon) {
                    this.setIconTintList = setcollapseicon;
                    return this;
                }

                @Override // o.getScaleX.setX
                public final getScaleX setIconTintList() {
                    return new plus(this.setX, this.setIconTintList, (byte) 0);
                }
            }.MenuHostHelper$$ExternalSyntheticLambda0(getScaleX$MenuHostHelper$$ExternalSyntheticLambda0.ANDROID_FIREBASE).setY(new setImeOptions.setY().setY(Integer.valueOf(setpaddingrelative2.setX("sdk-version"))).setUnboundedRipple(setpaddingrelative2.setY("model")).setY(setpaddingrelative2.setY("hardware")).setX(setpaddingrelative2.setY("device")).setTextAlignment(setpaddingrelative2.setY("product")).setOnLongClickListener(setpaddingrelative2.setY("os-uild")).setLayoutAnimation(setpaddingrelative2.setY("manufacturer")).MenuHostHelper$$ExternalSyntheticLambda1(setpaddingrelative2.setY("fingerprint")).setIconTintList(setpaddingrelative2.setY("country")).setNavigationOnClickListener(setpaddingrelative2.setY("locale")).setUiOptions(setpaddingrelative2.setY("mcc_mnc")).MenuHostHelper$$ExternalSyntheticLambda0(setpaddingrelative2.setY("application_build")).setY()).setIconTintList());
            try {
                MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(Integer.valueOf(Integer.parseInt((String) entry.getKey())));
            } catch (NumberFormatException unused) {
                MenuHostHelper$$ExternalSyntheticLambda1.setY((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (setPaddingRelative setpaddingrelative3 : (List) entry.getValue()) {
                setOnChildClickListener MenuHostHelper$$ExternalSyntheticLambda12 = setpaddingrelative3.MenuHostHelper$$ExternalSyntheticLambda1();
                attachInterface attachinterface = MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda0;
                if (!attachinterface.equals(new attachInterface("proto"))) {
                    if (attachinterface.equals(new attachInterface("json"))) {
                        MenuHostHelper$$ExternalSyntheticLambda0 = new setHorizontalFadingEdgeEnabled.setY().MenuHostHelper$$ExternalSyntheticLambda1(new String(MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda1, Charset.forName("UTF-8")));
                    } else {
                        String x = setTitleCollapseMode.setX("CctTransportBackend");
                        if (Log.isLoggable(x, 5)) {
                            Log.w(x, String.format("Received event of unsupported encoding %s. Skipping...", attachinterface));
                        }
                    }
                } else {
                    MenuHostHelper$$ExternalSyntheticLambda0 = new setHorizontalFadingEdgeEnabled.setY().MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda1);
                }
                MenuHostHelper$$ExternalSyntheticLambda0.setX(setpaddingrelative3.MenuHostHelper$$ExternalSyntheticLambda0()).setY(setpaddingrelative3.setUiOptions()).MenuHostHelper$$ExternalSyntheticLambda0(setpaddingrelative3.MenuHostHelper$$ExternalSyntheticLambda0("tz-offset")).setX(new getSystemWindowInsets.setIconTintList().MenuHostHelper$$ExternalSyntheticLambda0(setPrefixTextColor.setX.setIconTintList.get(setpaddingrelative3.setX("net-type"))).MenuHostHelper$$ExternalSyntheticLambda0(setPrefixTextColor.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.get(setpaddingrelative3.setX("mobile-subtype"))).setY());
                if (setpaddingrelative3.setIconTintList() != null) {
                    MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(setpaddingrelative3.setIconTintList());
                }
                arrayList3.add(MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList());
            }
            MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(arrayList3);
            arrayList2.add(MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList());
        }
        return new getFillAlpha(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.setPreserveFocusAfterLayout$MenuHostHelper$$ExternalSyntheticLambda0 setX(o.setPreserveFocusAfterLayout.setIconTintList r15) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPreserveFocusAfterLayout.setX(o.setPreserveFocusAfterLayout$setIconTintList):o.setPreserveFocusAfterLayout$MenuHostHelper$$ExternalSyntheticLambda0");
    }

    @Override // o.setCheckMarkTintMode
    public final setStableInsets setY(LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver) {
        Object MenuHostHelper$$ExternalSyntheticLambda0;
        getScaleY x = setX(liveData$LifecycleBoundObserver);
        URL url = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (liveData$LifecycleBoundObserver.MenuHostHelper$$ExternalSyntheticLambda0() != null) {
            try {
                String str = new String(liveData$LifecycleBoundObserver.MenuHostHelper$$ExternalSyntheticLambda0(), Charset.forName("UTF-8"));
                if (!str.startsWith("1$")) {
                    throw new IllegalArgumentException("Version marker missing from extras");
                }
                String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
                if (split.length != 2) {
                    throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
                }
                String str2 = split[0];
                if (str2.isEmpty()) {
                    throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
                }
                String str3 = split[1];
                if (str3.isEmpty()) {
                    str3 = null;
                }
                setSmoothScrollingEnabled setsmoothscrollingenabled = new setSmoothScrollingEnabled(str2, str3);
                r4 = setsmoothscrollingenabled.MenuHostHelper$$ExternalSyntheticLambda1 != null ? setsmoothscrollingenabled.MenuHostHelper$$ExternalSyntheticLambda1 : null;
                if (setsmoothscrollingenabled.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                    url = setY(setsmoothscrollingenabled.MenuHostHelper$$ExternalSyntheticLambda0);
                }
            } catch (IllegalArgumentException unused) {
                return new setChipStartPaddingResource(setStableInsets.setY.FATAL_ERROR, -1L);
            }
        }
        try {
            Object seticontintlist = new setIconTintList(url, x, r4);
            setBackgroundColor setbackgroundcolor = new setBackgroundColor() { // from class: o.setItemIconSizeRes
                @Override // o.setBackgroundColor
                public final Object MenuHostHelper$$ExternalSyntheticLambda0(Object obj) {
                    return setPreserveFocusAfterLayout.this.setX((setPreserveFocusAfterLayout.setIconTintList) obj);
                }
            };
            setTickMarkTintBlendMode settickmarktintblendmode = new setTickMarkTintBlendMode() { // from class: o.setBoxStrokeWidthFocusedResource
                @Override // o.setTickMarkTintBlendMode
                public final Object setX(Object obj, Object obj2) {
                    setPreserveFocusAfterLayout.setIconTintList seticontintlist2 = (setPreserveFocusAfterLayout.setIconTintList) obj;
                    setPreserveFocusAfterLayout$MenuHostHelper$$ExternalSyntheticLambda0 setpreservefocusafterlayout_menuhosthelper__externalsyntheticlambda0 = (setPreserveFocusAfterLayout$MenuHostHelper$$ExternalSyntheticLambda0) obj2;
                    if (setpreservefocusafterlayout_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                        setTitleCollapseMode.setX("CctTransportBackend", "Following redirect to: %s", setpreservefocusafterlayout_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0);
                        return new setPreserveFocusAfterLayout.setIconTintList(setpreservefocusafterlayout_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0, seticontintlist2.MenuHostHelper$$ExternalSyntheticLambda1, seticontintlist2.setY);
                    }
                    return null;
                }
            };
            int i = 5;
            do {
                MenuHostHelper$$ExternalSyntheticLambda0 = setbackgroundcolor.MenuHostHelper$$ExternalSyntheticLambda0(seticontintlist);
                seticontintlist = settickmarktintblendmode.setX(seticontintlist, MenuHostHelper$$ExternalSyntheticLambda0);
                if (seticontintlist == null) {
                    break;
                }
                i--;
            } while (i > 0);
            setPreserveFocusAfterLayout$MenuHostHelper$$ExternalSyntheticLambda0 setpreservefocusafterlayout_menuhosthelper__externalsyntheticlambda0 = (setPreserveFocusAfterLayout$MenuHostHelper$$ExternalSyntheticLambda0) MenuHostHelper$$ExternalSyntheticLambda0;
            if (setpreservefocusafterlayout_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 != 200) {
                if (setpreservefocusafterlayout_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 < 500 && setpreservefocusafterlayout_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 != 404) {
                    if (setpreservefocusafterlayout_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 == 400) {
                        return new setChipStartPaddingResource(setStableInsets.setY.INVALID_PAYLOAD, -1L);
                    }
                    return new setChipStartPaddingResource(setStableInsets.setY.FATAL_ERROR, -1L);
                }
                return new setChipStartPaddingResource(setStableInsets.setY.TRANSIENT_ERROR, -1L);
            }
            return new setChipStartPaddingResource(setStableInsets.setY.OK, setpreservefocusafterlayout_menuhosthelper__externalsyntheticlambda0.setY);
        } catch (IOException e) {
            String x2 = setTitleCollapseMode.setX("CctTransportBackend");
            if (Log.isLoggable(x2, 6)) {
                Log.e(x2, "Could not make request to the backend", e);
            }
            return new setChipStartPaddingResource(setStableInsets.setY.TRANSIENT_ERROR, -1L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setIconTintList {
        final URL MenuHostHelper$$ExternalSyntheticLambda0;
        final getScaleY MenuHostHelper$$ExternalSyntheticLambda1;
        final String setY;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setIconTintList(URL url, getScaleY getscaley, String str) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = url;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = getscaley;
            this.setY = str;
        }
    }
}