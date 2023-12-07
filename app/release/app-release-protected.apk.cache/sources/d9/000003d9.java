package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.C0118dz;
import o.C0138es;

/* renamed from: o.dz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0118dz extends cV implements Parcelable, dM {
    public static final Parcelable.Creator<C0118dz> CREATOR;
    private static final C0106dm setOnLongClickListener = C0106dm.setY();
    eA MenuHostHelper$$ExternalSyntheticLambda0;
    public final String MenuHostHelper$$ExternalSyntheticLambda1;
    private final WeakReference<dM> ViewPager$SavedState$1;
    private final List<dO> setChipCornerRadius;
    final Map<String, String> setIconTintList;
    private final C0118dz setLayoutAnimation;
    private final C0135ep setNavigationOnClickListener;
    private final C0126eg setTextAlignment;
    private final dV setUiOptions;
    final List<C0118dz> setUnboundedRipple;
    final Map<String, C0110dr> setX;
    eA setY;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public /* synthetic */ C0118dz(Parcel parcel, boolean z, byte b) {
        this(parcel, z);
    }

    static {
        new ConcurrentHashMap();
        CREATOR = new Parcelable.Creator<C0118dz>() { // from class: com.google.firebase.perf.metrics.Trace$1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ C0118dz createFromParcel(Parcel parcel) {
                return new C0118dz(parcel, false, (byte) 0);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ C0118dz[] newArray(int i) {
                return new C0118dz[i];
            }
        };
        new Parcelable.Creator<C0118dz>() { // from class: com.google.firebase.perf.metrics.Trace$2
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ C0118dz createFromParcel(Parcel parcel) {
                return new C0118dz(parcel, true, (byte) 0);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ C0118dz[] newArray(int i) {
                return new C0118dz[i];
            }
        };
    }

    @Override // o.dM
    public final void setIconTintList(dO dOVar) {
        if (dOVar == null) {
            C0106dm c0106dm = setOnLongClickListener;
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setX("Unable to add new SessionId to the Trace. Continuing without it.");
                return;
            }
            return;
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            if (this.setY != null) {
                return;
            }
            this.setChipCornerRadius.add(dOVar);
        }
    }

    public C0118dz(String str, C0126eg c0126eg, C0135ep c0135ep, cS cSVar) {
        this(str, c0126eg, c0135ep, cSVar, dV.setIconTintList());
    }

    private C0118dz(String str, C0126eg c0126eg, C0135ep c0135ep, cS cSVar, dV dVVar) {
        super(cSVar);
        this.ViewPager$SavedState$1 = new WeakReference<>(this);
        this.setLayoutAnimation = null;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str.trim();
        this.setUnboundedRipple = new ArrayList();
        this.setX = new ConcurrentHashMap();
        this.setIconTintList = new ConcurrentHashMap();
        this.setNavigationOnClickListener = c0135ep;
        this.setTextAlignment = c0126eg;
        this.setChipCornerRadius = Collections.synchronizedList(new ArrayList());
        this.setUiOptions = dVVar;
    }

    private C0118dz(Parcel parcel, boolean z) {
        super(z ? null : cS.MenuHostHelper$$ExternalSyntheticLambda1());
        this.ViewPager$SavedState$1 = new WeakReference<>(this);
        this.setLayoutAnimation = (C0118dz) parcel.readParcelable(C0118dz.class.getClassLoader());
        this.MenuHostHelper$$ExternalSyntheticLambda1 = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.setUnboundedRipple = arrayList;
        parcel.readList(arrayList, C0118dz.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.setX = concurrentHashMap;
        this.setIconTintList = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, C0110dr.class.getClassLoader());
        this.MenuHostHelper$$ExternalSyntheticLambda0 = (eA) parcel.readParcelable(eA.class.getClassLoader());
        this.setY = (eA) parcel.readParcelable(eA.class.getClassLoader());
        List<dO> synchronizedList = Collections.synchronizedList(new ArrayList());
        this.setChipCornerRadius = synchronizedList;
        parcel.readList(synchronizedList, dO.class.getClassLoader());
        if (z) {
            this.setTextAlignment = null;
            this.setNavigationOnClickListener = null;
            this.setUiOptions = null;
            return;
        }
        this.setTextAlignment = C0126eg.setIconTintList();
        this.setNavigationOnClickListener = new C0135ep();
        this.setUiOptions = dV.setIconTintList();
    }

    public final void setOnLongClickListener() {
        String str;
        if (!cW.setY().setOnNavigationItemSelectedListener()) {
            C0106dm c0106dm = setOnLongClickListener;
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList("Trace feature is disabled.");
                return;
            }
            return;
        }
        String str2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (str2 == null) {
            str = "Trace name must not be null";
        } else if (str2.length() > 100) {
            str = String.format(Locale.US, "Trace name must not exceed %d characters", 100);
        } else {
            if (str2.startsWith("_")) {
                C0138es.setX[] values = C0138es.setX.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (values[i].toString().equals(str2)) {
                            break;
                        }
                        i++;
                    } else if (!str2.startsWith("_st_")) {
                        str = "Trace name must not start with '_'";
                    }
                }
            }
            str = null;
        }
        if (str != null) {
            C0106dm c0106dm2 = setOnLongClickListener;
            Object[] objArr = {this.MenuHostHelper$$ExternalSyntheticLambda1, str};
            if (c0106dm2.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo2 = c0106dm2.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setY(String.format(Locale.ENGLISH, "Cannot start trace '%s'. Trace name is invalid.(%s)", objArr));
            }
        } else if (this.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            C0106dm c0106dm3 = setOnLongClickListener;
            Object[] objArr2 = {this.MenuHostHelper$$ExternalSyntheticLambda1};
            if (c0106dm3.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo3 = c0106dm3.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setY(String.format(Locale.ENGLISH, "Trace '%s' has already started, should not start again!", objArr2));
            }
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new eA();
            setIconTintList();
            dO dOVar = dQ.setIconTintList().setIconTintList;
            dQ iconTintList = dQ.setIconTintList();
            WeakReference<dM> weakReference = this.ViewPager$SavedState$1;
            synchronized (iconTintList.MenuHostHelper$$ExternalSyntheticLambda0) {
                iconTintList.MenuHostHelper$$ExternalSyntheticLambda0.add(weakReference);
            }
            setIconTintList(dOVar);
            if (dOVar.setIconTintList) {
                dV dVVar = this.setUiOptions;
                dV.setY(dVVar.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(), dVVar.setX.MenuHostHelper$$ExternalSyntheticLambda0(), dOVar.MenuHostHelper$$ExternalSyntheticLambda1);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.setLayoutAnimation, 0);
        parcel.writeString(this.MenuHostHelper$$ExternalSyntheticLambda1);
        parcel.writeList(this.setUnboundedRipple);
        parcel.writeMap(this.setX);
        parcel.writeParcelable(this.MenuHostHelper$$ExternalSyntheticLambda0, 0);
        parcel.writeParcelable(this.setY, 0);
        synchronized (this.setChipCornerRadius) {
            parcel.writeList(this.setChipCornerRadius);
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(String str, String str2) {
        boolean z = true;
        try {
            str = str.trim();
            str2 = str2.trim();
            setY(str, str2);
            C0106dm c0106dm = setOnLongClickListener;
            Object[] objArr = {str, str2, this.MenuHostHelper$$ExternalSyntheticLambda1};
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList(String.format(Locale.ENGLISH, "Setting attribute '%s' to '%s' on trace '%s'", objArr));
            }
        } catch (Exception e) {
            C0106dm c0106dm2 = setOnLongClickListener;
            Object[] objArr2 = {str, str2, e.getMessage()};
            if (c0106dm2.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo2 = c0106dm2.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setY(String.format(Locale.ENGLISH, "Can not set attribute '%s' with value '%s' (%s)", objArr2));
            }
            z = false;
        }
        if (z) {
            this.setIconTintList.put(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<dO> MenuHostHelper$$ExternalSyntheticLambda1() {
        List<dO> unmodifiableList;
        synchronized (this.setChipCornerRadius) {
            ArrayList arrayList = new ArrayList();
            for (dO dOVar : this.setChipCornerRadius) {
                if (dOVar != null) {
                    arrayList.add(dOVar);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    private void setY(String str, String str2) {
        if (this.setY != null) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.MenuHostHelper$$ExternalSyntheticLambda1));
        }
        if (!this.setIconTintList.containsKey(str) && this.setIconTintList.size() >= 5) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
        }
        dC.setX(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0019 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:2:0x0000, B:7:0x000b, B:15:0x0019, B:17:0x0027, B:18:0x0032), top: B:24:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void finalize() {
        /*
            r4 = this;
            o.eA r0 = r4.MenuHostHelper$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L39
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L16
            o.eA r0 = r4.setY     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 != 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L35
            o.dm r0 = o.C0118dz.setOnLongClickListener     // Catch: java.lang.Throwable -> L39
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = r4.MenuHostHelper$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L39
            r1[r2] = r3     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "Trace '%s' is started but not stopped when it is destructed!"
            boolean r3 = r0.MenuHostHelper$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L32
            o.do r0 = r0.MenuHostHelper$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L39
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)     // Catch: java.lang.Throwable -> L39
            o.Cdo.setX(r0)     // Catch: java.lang.Throwable -> L39
        L32:
            r4.MenuHostHelper$$ExternalSyntheticLambda0()     // Catch: java.lang.Throwable -> L39
        L35:
            super.finalize()
            return
        L39:
            r0 = move-exception
            super.finalize()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0118dz.finalize():void");
    }

    public final void setY(String str, long j) {
        String str2;
        if (str == null) {
            str2 = "Metric name must not be null";
        } else if (str.length() > 100) {
            str2 = String.format(Locale.US, "Metric name must not exceed %d characters", 100);
        } else {
            if (str.startsWith("_")) {
                for (es$MenuHostHelper$$ExternalSyntheticLambda1 es_menuhosthelper__externalsyntheticlambda1 : es$MenuHostHelper$$ExternalSyntheticLambda1.values()) {
                    if (!es_menuhosthelper__externalsyntheticlambda1.toString().equals(str)) {
                    }
                }
                str2 = "Metric name must not start with '_'";
            }
            str2 = null;
            break;
        }
        if (str2 != null) {
            C0106dm c0106dm = setOnLongClickListener;
            Object[] objArr = {str, str2};
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setY(String.format(Locale.ENGLISH, "Cannot set value for metric '%s'. Metric name is invalid.(%s)", objArr));
                return;
            }
            return;
        }
        if (!(this.MenuHostHelper$$ExternalSyntheticLambda0 != null)) {
            C0106dm c0106dm2 = setOnLongClickListener;
            Object[] objArr2 = {str, this.MenuHostHelper$$ExternalSyntheticLambda1};
            if (c0106dm2.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo2 = c0106dm2.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setX(String.format(Locale.ENGLISH, "Cannot set value for metric '%s' for trace '%s' because it's not started", objArr2));
                return;
            }
            return;
        }
        if (this.setY != null) {
            C0106dm c0106dm3 = setOnLongClickListener;
            Object[] objArr3 = {str, this.MenuHostHelper$$ExternalSyntheticLambda1};
            if (c0106dm3.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo3 = c0106dm3.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setX(String.format(Locale.ENGLISH, "Cannot set value for metric '%s' for trace '%s' because it's been stopped", objArr3));
                return;
            }
            return;
        }
        String trim = str.trim();
        C0110dr c0110dr = this.setX.get(trim);
        if (c0110dr == null) {
            c0110dr = new C0110dr(trim);
            this.setX.put(trim, c0110dr);
        }
        c0110dr.MenuHostHelper$$ExternalSyntheticLambda0.set(j);
        C0106dm c0106dm4 = setOnLongClickListener;
        Object[] objArr4 = {str, Long.valueOf(j), this.MenuHostHelper$$ExternalSyntheticLambda1};
        if (c0106dm4.MenuHostHelper$$ExternalSyntheticLambda0) {
            Cdo cdo4 = c0106dm4.MenuHostHelper$$ExternalSyntheticLambda1;
            Cdo.setIconTintList(String.format(Locale.ENGLISH, "Setting metric '%s' to '%s' on trace '%s'", objArr4));
        }
    }

    public final void setUnboundedRipple() {
        if (!(this.MenuHostHelper$$ExternalSyntheticLambda0 != null)) {
            C0106dm c0106dm = setOnLongClickListener;
            Object[] objArr = {this.MenuHostHelper$$ExternalSyntheticLambda1};
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setY(String.format(Locale.ENGLISH, "Trace '%s' has not been started so unable to stop!", objArr));
                return;
            }
            return;
        }
        if (this.setY != null) {
            C0106dm c0106dm2 = setOnLongClickListener;
            Object[] objArr2 = {this.MenuHostHelper$$ExternalSyntheticLambda1};
            if (c0106dm2.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo2 = c0106dm2.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setY(String.format(Locale.ENGLISH, "Trace '%s' has already stopped, should not stop again!", objArr2));
                return;
            }
            return;
        }
        dQ iconTintList = dQ.setIconTintList();
        WeakReference<dM> weakReference = this.ViewPager$SavedState$1;
        synchronized (iconTintList.MenuHostHelper$$ExternalSyntheticLambda0) {
            iconTintList.MenuHostHelper$$ExternalSyntheticLambda0.remove(weakReference);
        }
        setY();
        eA eAVar = new eA();
        this.setY = eAVar;
        if (this.setLayoutAnimation == null) {
            if (!this.setUnboundedRipple.isEmpty()) {
                C0118dz c0118dz = this.setUnboundedRipple.get(this.setUnboundedRipple.size() - 1);
                if (c0118dz.setY == null) {
                    c0118dz.setY = eAVar;
                }
            }
            if (!this.MenuHostHelper$$ExternalSyntheticLambda1.isEmpty()) {
                C0126eg c0126eg = this.setTextAlignment;
                c0126eg.MenuHostHelper$$ExternalSyntheticLambda0.execute(new RunnableC0130ek(c0126eg, new C0117dy(this).setY(), setX()));
                if (dQ.setIconTintList().setIconTintList.setIconTintList) {
                    dV dVVar = this.setUiOptions;
                    dV.setY(dVVar.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(), dVVar.setX.MenuHostHelper$$ExternalSyntheticLambda0(), dQ.setIconTintList().setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1);
                    return;
                }
                return;
            }
            C0106dm c0106dm3 = setOnLongClickListener;
            if (c0106dm3.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo3 = c0106dm3.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setY("Trace name is empty, no log is sent to server");
            }
        }
    }
}