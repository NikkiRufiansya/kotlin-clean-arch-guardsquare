package o;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.C0555vx;

/* loaded from: classes.dex */
public final class dA extends cV implements dM {
    private static final C0106dm setX = C0106dm.setY();
    private final dV MenuHostHelper$$ExternalSyntheticLambda0;
    public String MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean setIconTintList;
    private final C0126eg setLayoutAnimation;
    private final List<dO> setNavigationOnClickListener;
    private final WeakReference<dM> setUiOptions;
    private boolean setUnboundedRipple;
    public final eP$MenuHostHelper$$ExternalSyntheticLambda0 setY;

    @Override // o.dM
    public final void setIconTintList(dO dOVar) {
        if (dOVar == null) {
            C0106dm c0106dm = setX;
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setX("Unable to add new SessionId to the Network Trace. Continuing without it.");
            }
        } else if (!this.setY.setIconTintList() || this.setY.setX()) {
        } else {
            this.setNavigationOnClickListener.add(dOVar);
        }
    }

    public static dA setX(C0126eg c0126eg) {
        return new dA(c0126eg);
    }

    private dA(C0126eg c0126eg) {
        this(c0126eg, cS.MenuHostHelper$$ExternalSyntheticLambda1(), dV.setIconTintList());
    }

    private dA(C0126eg c0126eg, cS cSVar, dV dVVar) {
        super(cSVar);
        this.setY = eP.setY();
        this.setUiOptions = new WeakReference<>(this);
        this.setLayoutAnimation = c0126eg;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = dVVar;
        this.setNavigationOnClickListener = Collections.synchronizedList(new ArrayList());
        setIconTintList();
    }

    public final dA MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        eP$MenuHostHelper$$ExternalSyntheticLambda1 ep_menuhosthelper__externalsyntheticlambda1;
        if (str != null) {
            eP$MenuHostHelper$$ExternalSyntheticLambda1 ep_menuhosthelper__externalsyntheticlambda12 = eP$MenuHostHelper$$ExternalSyntheticLambda1.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            char c = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    ep_menuhosthelper__externalsyntheticlambda1 = eP$MenuHostHelper$$ExternalSyntheticLambda1.OPTIONS;
                    break;
                case 1:
                    ep_menuhosthelper__externalsyntheticlambda1 = eP$MenuHostHelper$$ExternalSyntheticLambda1.GET;
                    break;
                case 2:
                    ep_menuhosthelper__externalsyntheticlambda1 = eP$MenuHostHelper$$ExternalSyntheticLambda1.PUT;
                    break;
                case 3:
                    ep_menuhosthelper__externalsyntheticlambda1 = eP$MenuHostHelper$$ExternalSyntheticLambda1.HEAD;
                    break;
                case 4:
                    ep_menuhosthelper__externalsyntheticlambda1 = eP$MenuHostHelper$$ExternalSyntheticLambda1.POST;
                    break;
                case 5:
                    ep_menuhosthelper__externalsyntheticlambda1 = eP$MenuHostHelper$$ExternalSyntheticLambda1.PATCH;
                    break;
                case 6:
                    ep_menuhosthelper__externalsyntheticlambda1 = eP$MenuHostHelper$$ExternalSyntheticLambda1.TRACE;
                    break;
                case 7:
                    ep_menuhosthelper__externalsyntheticlambda1 = eP$MenuHostHelper$$ExternalSyntheticLambda1.CONNECT;
                    break;
                case '\b':
                    ep_menuhosthelper__externalsyntheticlambda1 = eP$MenuHostHelper$$ExternalSyntheticLambda1.DELETE;
                    break;
                default:
                    ep_menuhosthelper__externalsyntheticlambda1 = eP$MenuHostHelper$$ExternalSyntheticLambda1.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.setY.setY(ep_menuhosthelper__externalsyntheticlambda1);
        }
        return this;
    }

    public final dA setIconTintList(long j) {
        dO dOVar = dQ.setIconTintList().setIconTintList;
        dQ iconTintList = dQ.setIconTintList();
        WeakReference<dM> weakReference = this.setUiOptions;
        synchronized (iconTintList.MenuHostHelper$$ExternalSyntheticLambda0) {
            iconTintList.MenuHostHelper$$ExternalSyntheticLambda0.add(weakReference);
        }
        this.setY.setIconTintList(j);
        setIconTintList(dOVar);
        if (dOVar.setIconTintList) {
            dV dVVar = this.MenuHostHelper$$ExternalSyntheticLambda0;
            dV.setY(dVVar.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(), dVVar.setX.MenuHostHelper$$ExternalSyntheticLambda0(), dOVar.MenuHostHelper$$ExternalSyntheticLambda1);
        }
        return this;
    }

    public final dA setY(long j) {
        this.setY.setY(j);
        if (dQ.setIconTintList().setIconTintList.setIconTintList) {
            dV dVVar = this.MenuHostHelper$$ExternalSyntheticLambda0;
            dV.setY(dVVar.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(), dVVar.setX.MenuHostHelper$$ExternalSyntheticLambda0(), dQ.setIconTintList().setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1);
        }
        return this;
    }

    public final dA setX(String str) {
        if (str == null) {
            this.setY.setY();
            return this;
        }
        boolean z = false;
        if (str.length() <= 128) {
            int i = 0;
            while (true) {
                if (i >= str.length()) {
                    z = true;
                    break;
                }
                char charAt = str.charAt(i);
                if (charAt <= 31 || charAt > 127) {
                    break;
                }
                i++;
            }
        }
        if (z) {
            this.setY.setY(str);
        } else {
            C0106dm c0106dm = setX;
            StringBuilder sb = new StringBuilder("The content type of the response is not a valid content-type:");
            sb.append(str);
            String obj = sb.toString();
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setX(obj);
            }
        }
        return this;
    }

    public final eP MenuHostHelper$$ExternalSyntheticLambda1() {
        dQ iconTintList = dQ.setIconTintList();
        WeakReference<dM> weakReference = this.setUiOptions;
        synchronized (iconTintList.MenuHostHelper$$ExternalSyntheticLambda0) {
            iconTintList.MenuHostHelper$$ExternalSyntheticLambda0.remove(weakReference);
        }
        setY();
        eX[] MenuHostHelper$$ExternalSyntheticLambda1 = dO.MenuHostHelper$$ExternalSyntheticLambda1(setUiOptions());
        if (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            this.setY.setY(Arrays.asList(MenuHostHelper$$ExternalSyntheticLambda1));
        }
        final eP ViewPager$SavedState$1 = this.setY.ViewPager$SavedState$1();
        if (!dN.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1)) {
            C0106dm c0106dm = setX;
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList("Dropping network request from a 'User-Agent' that is not allowed");
            }
            return ViewPager$SavedState$1;
        }
        if (!this.setUnboundedRipple) {
            final C0126eg c0126eg = this.setLayoutAnimation;
            final eJ x = setX();
            c0126eg.MenuHostHelper$$ExternalSyntheticLambda0.execute(new Runnable() { // from class: o.el
                @Override // java.lang.Runnable
                public final void run() {
                    C0126eg c0126eg2 = C0126eg.this;
                    eP ePVar = ViewPager$SavedState$1;
                    c0126eg2.setY(eV.setY().MenuHostHelper$$ExternalSyntheticLambda0(ePVar), x);
                }
            });
            this.setUnboundedRipple = true;
        }
        return ViewPager$SavedState$1;
    }

    private List<dO> setUiOptions() {
        List<dO> unmodifiableList;
        synchronized (this.setNavigationOnClickListener) {
            ArrayList arrayList = new ArrayList();
            for (dO dOVar : this.setNavigationOnClickListener) {
                if (dOVar != null) {
                    arrayList.add(dOVar);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    public final dA setY(String str) {
        C0555vx iconTintList;
        int lastIndexOf;
        if (str != null) {
            C0555vx iconTintList2 = C0555vx.setIconTintList(str);
            if (iconTintList2 != null) {
                C0555vx.setIconTintList MenuHostHelper$$ExternalSyntheticLambda1 = iconTintList2.setUnboundedRipple().MenuHostHelper$$ExternalSyntheticLambda0("").MenuHostHelper$$ExternalSyntheticLambda1("");
                MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList = null;
                MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 = null;
                str = MenuHostHelper$$ExternalSyntheticLambda1.toString();
            }
            eP$MenuHostHelper$$ExternalSyntheticLambda0 ep_menuhosthelper__externalsyntheticlambda0 = this.setY;
            if (str.length() > 2000) {
                if (str.charAt(2000) != '/' && (iconTintList = C0555vx.setIconTintList(str)) != null && iconTintList.MenuHostHelper$$ExternalSyntheticLambda0().lastIndexOf(47) >= 0 && (lastIndexOf = str.lastIndexOf(47, 1999)) >= 0) {
                    str = str.substring(0, lastIndexOf);
                } else {
                    str = str.substring(0, 2000);
                }
            }
            ep_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1(str);
        }
        return this;
    }
}