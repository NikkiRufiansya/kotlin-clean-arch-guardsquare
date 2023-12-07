package o;

import android.util.Log;
import java.io.Serializable;
import o.lC;
import o.oM;
import o.pY;

/* loaded from: classes.dex */
public final class oE implements oM, Serializable {
    private final oM$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0;
    private final oM setX;

    public oE(oM oMVar, oM$MenuHostHelper$$ExternalSyntheticLambda1 om_menuhosthelper__externalsyntheticlambda1) {
        pN.setY(oMVar, "");
        pN.setY(om_menuhosthelper__externalsyntheticlambda1, "");
        this.setX = oMVar;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = om_menuhosthelper__externalsyntheticlambda1;
    }

    @Override // o.oM
    public final oM plus(oM oMVar) {
        pN.setY(oMVar, "");
        return oMVar != oL.setX ? (oM) oMVar.fold(this, oM.setX.setIconTintList.setX) : this;
    }

    @Override // o.oM
    public final <E extends oM$MenuHostHelper$$ExternalSyntheticLambda1> E get(oM$MenuHostHelper$$ExternalSyntheticLambda0<E> om_menuhosthelper__externalsyntheticlambda0) {
        pN.setY(om_menuhosthelper__externalsyntheticlambda0, "");
        oE oEVar = this;
        while (true) {
            E e = (E) oEVar.MenuHostHelper$$ExternalSyntheticLambda0.get(om_menuhosthelper__externalsyntheticlambda0);
            if (e != null) {
                return e;
            }
            oM oMVar = oEVar.setX;
            if (oMVar instanceof oE) {
                oEVar = (oE) oMVar;
            } else {
                return (E) oMVar.get(om_menuhosthelper__externalsyntheticlambda0);
            }
        }
    }

    @Override // o.oM
    public final <R> R fold(R r, InterfaceC0389pw<? super R, ? super oM$MenuHostHelper$$ExternalSyntheticLambda1, ? extends R> interfaceC0389pw) {
        pN.setY(interfaceC0389pw, "");
        return interfaceC0389pw.MenuHostHelper$$ExternalSyntheticLambda0((Object) this.setX.fold(r, interfaceC0389pw), this.MenuHostHelper$$ExternalSyntheticLambda0);
    }

    @Override // o.oM
    public final oM minusKey(oM$MenuHostHelper$$ExternalSyntheticLambda0<?> om_menuhosthelper__externalsyntheticlambda0) {
        pN.setY(om_menuhosthelper__externalsyntheticlambda0, "");
        if (this.MenuHostHelper$$ExternalSyntheticLambda0.get(om_menuhosthelper__externalsyntheticlambda0) != null) {
            return this.setX;
        }
        oM minusKey = this.setX.minusKey(om_menuhosthelper__externalsyntheticlambda0);
        return minusKey == this.setX ? this : minusKey == oL.setX ? this.MenuHostHelper$$ExternalSyntheticLambda0 : new oE(minusKey, this.MenuHostHelper$$ExternalSyntheticLambda0);
    }

    private final int MenuHostHelper$$ExternalSyntheticLambda0() {
        int i = 2;
        oE oEVar = this;
        while (true) {
            oM oMVar = oEVar.setX;
            oEVar = oMVar instanceof oE ? (oE) oMVar : null;
            if (oEVar == null) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof oE)) {
                return false;
            }
            oE oEVar = (oE) obj;
            if (oEVar.MenuHostHelper$$ExternalSyntheticLambda0() != MenuHostHelper$$ExternalSyntheticLambda0()) {
                return false;
            }
            oE oEVar2 = this;
            while (true) {
                oM$MenuHostHelper$$ExternalSyntheticLambda1 om_menuhosthelper__externalsyntheticlambda1 = oEVar2.MenuHostHelper$$ExternalSyntheticLambda0;
                if (!pN.MenuHostHelper$$ExternalSyntheticLambda0(oEVar.get(om_menuhosthelper__externalsyntheticlambda1.getKey()), om_menuhosthelper__externalsyntheticlambda1)) {
                    z = false;
                    break;
                }
                oM oMVar = oEVar2.setX;
                if (oMVar instanceof oE) {
                    oEVar2 = (oE) oMVar;
                } else {
                    pN.setX(oMVar);
                    oM$MenuHostHelper$$ExternalSyntheticLambda1 om_menuhosthelper__externalsyntheticlambda12 = (oM$MenuHostHelper$$ExternalSyntheticLambda1) oMVar;
                    z = pN.MenuHostHelper$$ExternalSyntheticLambda0(oEVar.get(om_menuhosthelper__externalsyntheticlambda12.getKey()), om_menuhosthelper__externalsyntheticlambda12);
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.setX.hashCode() + this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append((String) fold("", oE$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList));
        sb.append(']');
        return sb.toString();
    }

    private final Object writeReplace() {
        int MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
        oM[] oMVarArr = new oM[MenuHostHelper$$ExternalSyntheticLambda0];
        pY.setY sety = new pY.setY();
        fold(nX.setX, new setX(oMVarArr, sety));
        if (!(sety.MenuHostHelper$$ExternalSyntheticLambda1 == MenuHostHelper$$ExternalSyntheticLambda0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        return new Serializable(oMVarArr) { // from class: o.oE$MenuHostHelper$$ExternalSyntheticLambda1
            private final oM[] setX;

            static {
                new setIconTintList((byte) 0);
            }

            /* loaded from: classes.dex */
            public static final class setIconTintList {
                public /* synthetic */ setIconTintList(byte b) {
                    this();
                }

                private setIconTintList() {
                }
            }

            {
                pN.setY(oMVarArr, "");
                this.setX = oMVarArr;
            }

            private final Object readResolve() {
                oM[] oMVarArr2 = this.setX;
                oM oMVar = oL.setX;
                for (oM oMVar2 : oMVarArr2) {
                    oMVar = oMVar.plus(oMVar2);
                }
                return oMVar;
            }
        };
    }

    /* loaded from: classes.dex */
    static final class setX extends pO implements InterfaceC0389pw<nX, oM$MenuHostHelper$$ExternalSyntheticLambda1, nX> {
        private /* synthetic */ pY.setY MenuHostHelper$$ExternalSyntheticLambda1;
        private /* synthetic */ oM[] setX;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setX(oM[] oMVarArr, pY.setY sety) {
            super(2);
            this.setX = oMVarArr;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = sety;
        }

        @Override // o.InterfaceC0389pw
        public final /* synthetic */ nX MenuHostHelper$$ExternalSyntheticLambda0(nX nXVar, oM$MenuHostHelper$$ExternalSyntheticLambda1 om_menuhosthelper__externalsyntheticlambda1) {
            oM$MenuHostHelper$$ExternalSyntheticLambda1 om_menuhosthelper__externalsyntheticlambda12 = om_menuhosthelper__externalsyntheticlambda1;
            pN.setY(nXVar, "");
            pN.setY(om_menuhosthelper__externalsyntheticlambda12, "");
            oM[] oMVarArr = this.setX;
            int i = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1;
            this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1 = i + 1;
            oMVarArr[i] = om_menuhosthelper__externalsyntheticlambda12;
            return nX.setX;
        }
    }

    public static void setY(long j, long j2) {
        String str;
        String str2;
        lC.setY sety = lC.MenuHostHelper$$ExternalSyntheticLambda0;
        lC.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        pN.setY("root Detected", "");
        lC.setY = "root Detected";
        str = lC.setIconTintList;
        str2 = lC.setY;
        Log.d(str, str2);
    }
}