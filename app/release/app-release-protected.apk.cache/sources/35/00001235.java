package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import o.C0544vn;
import o.vI;

/* renamed from: o.vm  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0543vm {
    public static final C0543vm setX;
    public static final C0543vm setY;
    public final String[] MenuHostHelper$$ExternalSyntheticLambda0;
    final boolean MenuHostHelper$$ExternalSyntheticLambda1;
    public final boolean setIconTintList;
    public final String[] setLayoutAnimation;

    public C0543vm(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = z;
        this.setIconTintList = z2;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = strArr;
        this.setLayoutAnimation = strArr2;
    }

    public final List<C0544vn> MenuHostHelper$$ExternalSyntheticLambda1() {
        String[] strArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(C0544vn.setY.setIconTintList(str));
            }
            return C0348oi.setX((Iterable) arrayList);
        }
        return null;
    }

    public final List<vI> MenuHostHelper$$ExternalSyntheticLambda0() {
        String[] strArr = this.setLayoutAnimation;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                vI.setY sety = vI.setY;
                arrayList.add(vI.setY.MenuHostHelper$$ExternalSyntheticLambda1(str));
            }
            return C0348oi.setX((Iterable) arrayList);
        }
        return null;
    }

    public final boolean setX(SSLSocket sSLSocket) {
        Comparator comparator;
        pN.setY(sSLSocket, "");
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            String[] strArr = this.setLayoutAnimation;
            if (strArr != null) {
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                oG oGVar = oG.MenuHostHelper$$ExternalSyntheticLambda1;
                pN.setX(oGVar);
                if (!vL.MenuHostHelper$$ExternalSyntheticLambda1(strArr, enabledProtocols, oGVar)) {
                    return false;
                }
            }
            String[] strArr2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (strArr2 != null) {
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                C0544vn.setIconTintList seticontintlist = C0544vn.setY;
                comparator = C0544vn.setZ;
                return vL.MenuHostHelper$$ExternalSyntheticLambda1(strArr2, enabledCipherSuites, comparator);
            }
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0543vm) {
            if (obj == this) {
                return true;
            }
            boolean z = this.MenuHostHelper$$ExternalSyntheticLambda1;
            C0543vm c0543vm = (C0543vm) obj;
            if (z != c0543vm.MenuHostHelper$$ExternalSyntheticLambda1) {
                return false;
            }
            return !z || (Arrays.equals(this.MenuHostHelper$$ExternalSyntheticLambda0, c0543vm.MenuHostHelper$$ExternalSyntheticLambda0) && Arrays.equals(this.setLayoutAnimation, c0543vm.setLayoutAnimation) && this.setIconTintList == c0543vm.setIconTintList);
        }
        return false;
    }

    public final int hashCode() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            String[] strArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            int hashCode = strArr != null ? Arrays.hashCode(strArr) : 0;
            String[] strArr2 = this.setLayoutAnimation;
            return ((((hashCode + 527) * 31) + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.setIconTintList ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
            sb.append(Objects.toString(MenuHostHelper$$ExternalSyntheticLambda1(), "[all enabled]"));
            sb.append(", tlsVersions=");
            sb.append(Objects.toString(MenuHostHelper$$ExternalSyntheticLambda0(), "[all enabled]"));
            sb.append(", supportsTlsExtensions=");
            sb.append(this.setIconTintList);
            sb.append(')');
            return sb.toString();
        }
        return "ConnectionSpec()";
    }

    /* renamed from: o.vm$setX */
    /* loaded from: classes.dex */
    public static final class setX {
        private boolean MenuHostHelper$$ExternalSyntheticLambda0;
        private String[] MenuHostHelper$$ExternalSyntheticLambda1;
        private String[] setIconTintList;
        private boolean setX;

        public setX(boolean z) {
            this.setX = z;
        }

        public setX(C0543vm c0543vm) {
            pN.setY(c0543vm, "");
            this.setX = c0543vm.MenuHostHelper$$ExternalSyntheticLambda1;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = c0543vm.MenuHostHelper$$ExternalSyntheticLambda0;
            this.setIconTintList = c0543vm.setLayoutAnimation;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = c0543vm.setIconTintList;
        }

        public final setX setY(C0544vn... c0544vnArr) {
            pN.setY(c0544vnArr, "");
            if (!this.setX) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(c0544vnArr.length);
            for (C0544vn c0544vn : c0544vnArr) {
                arrayList.add(c0544vn.setAnimationFromJson);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                return setX((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public final setX setX(String... strArr) {
            pN.setY(strArr, "");
            if (this.setX) {
                if (!(!(strArr.length == 0))) {
                    throw new IllegalArgumentException("At least one cipher suite is required".toString());
                }
                Object clone = strArr.clone();
                if (clone != null) {
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = (String[]) clone;
                    return this;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final setX setY(vI... vIVarArr) {
            pN.setY(vIVarArr, "");
            if (!this.setX) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(vIVarArr.length);
            for (vI vIVar : vIVarArr) {
                arrayList.add(vIVar.setUnboundedRipple);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                return setIconTintList((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        public final setX setIconTintList(String... strArr) {
            pN.setY(strArr, "");
            if (this.setX) {
                if (!(!(strArr.length == 0))) {
                    throw new IllegalArgumentException("At least one TLS version is required".toString());
                }
                Object clone = strArr.clone();
                if (clone != null) {
                    this.setIconTintList = (String[]) clone;
                    return this;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final setX MenuHostHelper$$ExternalSyntheticLambda0() {
            if (!this.setX) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
            return this;
        }

        public final C0543vm MenuHostHelper$$ExternalSyntheticLambda1() {
            return new C0543vm(this.setX, this.MenuHostHelper$$ExternalSyntheticLambda0, this.MenuHostHelper$$ExternalSyntheticLambda1, this.setIconTintList);
        }
    }

    static {
        new vm$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);
        C0544vn[] c0544vnArr = {C0544vn.setX, C0544vn.MenuHostHelper$$ExternalSyntheticLambda1, C0544vn.setIconTintList, C0544vn.MenuHostHelper$$ExternalSyntheticLambda0, C0544vn.setLayoutAnimation, C0544vn.setOnLongClickListener, C0544vn.setTextAlignment, C0544vn.setUnboundedRipple, C0544vn.setCenterIfNoTextEnabled};
        C0544vn[] c0544vnArr2 = {C0544vn.setX, C0544vn.MenuHostHelper$$ExternalSyntheticLambda1, C0544vn.setIconTintList, C0544vn.MenuHostHelper$$ExternalSyntheticLambda0, C0544vn.setLayoutAnimation, C0544vn.setOnLongClickListener, C0544vn.setTextAlignment, C0544vn.setUnboundedRipple, C0544vn.setCenterIfNoTextEnabled, C0544vn.setUiOptions, C0544vn.setNavigationOnClickListener, C0544vn.setChipCornerRadius, C0544vn.setTextScaleX, C0544vn.setIconSize, C0544vn.setMaxEms, C0544vn.ViewPager$SavedState$1};
        new setX(true).setY((C0544vn[]) Arrays.copyOf(c0544vnArr, 9)).setY(vI.TLS_1_3, vI.TLS_1_2).MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda1();
        setY = new setX(true).setY((C0544vn[]) Arrays.copyOf(c0544vnArr2, 16)).setY(vI.TLS_1_3, vI.TLS_1_2).MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda1();
        new setX(true).setY((C0544vn[]) Arrays.copyOf(c0544vnArr2, 16)).setY(vI.TLS_1_3, vI.TLS_1_2, vI.TLS_1_1, vI.TLS_1_0).MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda1();
        setX = new setX(false).MenuHostHelper$$ExternalSyntheticLambda1();
    }
}