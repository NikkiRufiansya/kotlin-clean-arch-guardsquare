package o;

import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import o.C0116dx;

/* loaded from: classes.dex */
public final class cU extends ParcelImpl$MenuHostHelper$$ExternalSyntheticLambda0 {
    private static final C0106dm setY = C0106dm.setY();
    private final C0135ep MenuHostHelper$$ExternalSyntheticLambda0;
    private final WeakHashMap<setDropDownBackgroundResource, C0118dz> MenuHostHelper$$ExternalSyntheticLambda1 = new WeakHashMap<>();
    private final cS setIconTintList;
    private final C0126eg setUnboundedRipple;
    private final cT setX;

    public cU(C0135ep c0135ep, C0126eg c0126eg, cS cSVar, cT cTVar) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = c0135ep;
        this.setUnboundedRipple = c0126eg;
        this.setIconTintList = cSVar;
        this.setX = cTVar;
    }

    @Override // o.ParcelImpl$MenuHostHelper$$ExternalSyntheticLambda0
    public final void setIconTintList(ParcelImpl parcelImpl, setDropDownBackgroundResource setdropdownbackgroundresource) {
        super.setIconTintList(parcelImpl, setdropdownbackgroundresource);
        C0106dm c0106dm = setY;
        Object[] objArr = {setdropdownbackgroundresource.getClass().getSimpleName()};
        if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
            Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
            Cdo.setIconTintList(String.format(Locale.ENGLISH, "FragmentMonitor %s.onFragmentResumed", objArr));
        }
        StringBuilder sb = new StringBuilder("_st_");
        sb.append(setdropdownbackgroundresource.getClass().getSimpleName());
        C0118dz c0118dz = new C0118dz(sb.toString(), this.setUnboundedRipple, this.MenuHostHelper$$ExternalSyntheticLambda0, this.setIconTintList);
        c0118dz.setOnLongClickListener();
        c0118dz.MenuHostHelper$$ExternalSyntheticLambda1("Parent_fragment", setdropdownbackgroundresource.setContentScrimResource() == null ? "No parent" : setdropdownbackgroundresource.setContentScrimResource().getClass().getSimpleName());
        if (setdropdownbackgroundresource.setAnimationFromJson() != null) {
            c0118dz.MenuHostHelper$$ExternalSyntheticLambda1("Hosting_activity", setdropdownbackgroundresource.setAnimationFromJson().getClass().getSimpleName());
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.put(setdropdownbackgroundresource, c0118dz);
        cT cTVar = this.setX;
        if (!cTVar.MenuHostHelper$$ExternalSyntheticLambda0) {
            C0106dm c0106dm2 = cT.setY;
            if (c0106dm2.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo2 = c0106dm2.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            }
        } else if (cTVar.MenuHostHelper$$ExternalSyntheticLambda1.containsKey(setdropdownbackgroundresource)) {
            C0106dm c0106dm3 = cT.setY;
            Object[] objArr2 = {setdropdownbackgroundresource.getClass().getSimpleName()};
            if (c0106dm3.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo3 = c0106dm3.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList(String.format(Locale.ENGLISH, "Cannot start sub-recording because one is already ongoing with the key %s", objArr2));
            }
        } else {
            C0142ew<C0116dx.setIconTintList> x = cTVar.setX();
            if (!(x.MenuHostHelper$$ExternalSyntheticLambda0 != null)) {
                C0106dm c0106dm4 = cT.setY;
                Object[] objArr3 = {setdropdownbackgroundresource.getClass().getSimpleName()};
                if (c0106dm4.MenuHostHelper$$ExternalSyntheticLambda0) {
                    Cdo cdo4 = c0106dm4.MenuHostHelper$$ExternalSyntheticLambda1;
                    Cdo.setIconTintList(String.format(Locale.ENGLISH, "startFragment(%s): snapshot() failed", objArr3));
                    return;
                }
                return;
            }
            Map<setDropDownBackgroundResource, C0116dx.setIconTintList> map = cTVar.MenuHostHelper$$ExternalSyntheticLambda1;
            C0116dx.setIconTintList seticontintlist = x.MenuHostHelper$$ExternalSyntheticLambda0;
            if (seticontintlist != null) {
                map.put(setdropdownbackgroundresource, seticontintlist);
                return;
            }
            throw new NoSuchElementException("No value present");
        }
    }

    @Override // o.ParcelImpl$MenuHostHelper$$ExternalSyntheticLambda0
    public final void setX(ParcelImpl parcelImpl, setDropDownBackgroundResource setdropdownbackgroundresource) {
        C0142ew c0142ew;
        super.setX(parcelImpl, setdropdownbackgroundresource);
        C0106dm c0106dm = setY;
        Object[] objArr = {setdropdownbackgroundresource.getClass().getSimpleName()};
        if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
            Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
            Cdo.setIconTintList(String.format(Locale.ENGLISH, "FragmentMonitor %s.onFragmentPaused ", objArr));
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.containsKey(setdropdownbackgroundresource)) {
            C0118dz c0118dz = this.MenuHostHelper$$ExternalSyntheticLambda1.get(setdropdownbackgroundresource);
            this.MenuHostHelper$$ExternalSyntheticLambda1.remove(setdropdownbackgroundresource);
            cT cTVar = this.setX;
            if (!cTVar.MenuHostHelper$$ExternalSyntheticLambda0) {
                C0106dm c0106dm2 = cT.setY;
                if (c0106dm2.MenuHostHelper$$ExternalSyntheticLambda0) {
                    Cdo cdo2 = c0106dm2.MenuHostHelper$$ExternalSyntheticLambda1;
                    Cdo.setIconTintList("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
                }
                c0142ew = new C0142ew();
            } else if (!cTVar.MenuHostHelper$$ExternalSyntheticLambda1.containsKey(setdropdownbackgroundresource)) {
                C0106dm c0106dm3 = cT.setY;
                Object[] objArr2 = {setdropdownbackgroundresource.getClass().getSimpleName()};
                if (c0106dm3.MenuHostHelper$$ExternalSyntheticLambda0) {
                    Cdo cdo3 = c0106dm3.MenuHostHelper$$ExternalSyntheticLambda1;
                    Cdo.setIconTintList(String.format(Locale.ENGLISH, "Sub-recording associated with key %s was not started or does not exist", objArr2));
                }
                c0142ew = new C0142ew();
            } else {
                C0116dx.setIconTintList remove = cTVar.MenuHostHelper$$ExternalSyntheticLambda1.remove(setdropdownbackgroundresource);
                C0142ew<C0116dx.setIconTintList> x = cTVar.setX();
                if (!(x.MenuHostHelper$$ExternalSyntheticLambda0 != null)) {
                    C0106dm c0106dm4 = cT.setY;
                    Object[] objArr3 = {setdropdownbackgroundresource.getClass().getSimpleName()};
                    if (c0106dm4.MenuHostHelper$$ExternalSyntheticLambda0) {
                        Cdo cdo4 = c0106dm4.MenuHostHelper$$ExternalSyntheticLambda1;
                        Cdo.setIconTintList(String.format(Locale.ENGLISH, "stopFragment(%s): snapshot() failed", objArr3));
                    }
                    c0142ew = new C0142ew();
                } else {
                    C0116dx.setIconTintList seticontintlist = x.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (seticontintlist != null) {
                        C0116dx.setIconTintList seticontintlist2 = seticontintlist;
                        c0142ew = new C0142ew(new C0116dx.setIconTintList(seticontintlist2.setIconTintList - remove.setIconTintList, seticontintlist2.MenuHostHelper$$ExternalSyntheticLambda1 - remove.MenuHostHelper$$ExternalSyntheticLambda1, seticontintlist2.MenuHostHelper$$ExternalSyntheticLambda0 - remove.MenuHostHelper$$ExternalSyntheticLambda0));
                    } else {
                        throw new NoSuchElementException("No value present");
                    }
                }
            }
            if (!(c0142ew.MenuHostHelper$$ExternalSyntheticLambda0 != 0)) {
                Object[] objArr4 = {setdropdownbackgroundresource.getClass().getSimpleName()};
                if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                    Cdo cdo5 = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                    Cdo.setX(String.format(Locale.ENGLISH, "onFragmentPaused: recorder failed to trace %s", objArr4));
                    return;
                }
                return;
            }
            T t = c0142ew.MenuHostHelper$$ExternalSyntheticLambda0;
            if (t != 0) {
                C0140eu.setIconTintList(c0118dz, (C0116dx.setIconTintList) t);
                c0118dz.setUnboundedRipple();
                return;
            }
            throw new NoSuchElementException("No value present");
        }
        Object[] objArr5 = {setdropdownbackgroundresource.getClass().getSimpleName()};
        if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
            Cdo cdo6 = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
            Cdo.setX(String.format(Locale.ENGLISH, "FragmentMonitor: missed a fragment trace from %s", objArr5));
        }
    }
}