package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import o.vV;

/* loaded from: classes.dex */
public final class vW {
    public static final int setOnLongClickListener = 86;
    vR MenuHostHelper$$ExternalSyntheticLambda0;
    final List<vR> MenuHostHelper$$ExternalSyntheticLambda1;
    boolean setIconTintList;
    final vV setUiOptions;
    final String setX;
    boolean setY;

    public vW(vV vVVar, String str) {
        pN.setY(vVVar, "");
        pN.setY(str, "");
        this.setUiOptions = vVVar;
        this.setX = str;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new ArrayList();
    }

    public final void setX(vR vRVar, long j) {
        pN.setY(vRVar, "");
        synchronized (this.setUiOptions) {
            if (!this.setIconTintList) {
                if (setX(vRVar, j, false)) {
                    this.setUiOptions.setIconTintList(this);
                }
                nX nXVar = nX.setX;
            } else if (vRVar.setX) {
                vV.setIconTintList seticontintlist = vV.setX;
                if (vV.setIconTintList.isLoggable(Level.FINE)) {
                    vY.setIconTintList(vRVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                vV.setIconTintList seticontintlist2 = vV.setX;
                if (vV.setIconTintList.isLoggable(Level.FINE)) {
                    vY.setIconTintList(vRVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class setY extends vR {
        private /* synthetic */ InterfaceC0376pj MenuHostHelper$$ExternalSyntheticLambda0;
        private /* synthetic */ String setNavigationOnClickListener;
        private /* synthetic */ boolean setUiOptions = true;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setY(InterfaceC0376pj interfaceC0376pj, String str, String str2) {
            super(str2, true);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = interfaceC0376pj;
            this.setNavigationOnClickListener = str;
        }

        @Override // o.vR
        public final long MenuHostHelper$$ExternalSyntheticLambda1() {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList();
            return -1L;
        }
    }

    public final boolean setX(vR vRVar, long j, boolean z) {
        String obj;
        pN.setY(vRVar, "");
        vRVar.setIconTintList(this);
        long y = this.setUiOptions.setY.setY();
        long j2 = y + j;
        int indexOf = this.MenuHostHelper$$ExternalSyntheticLambda1.indexOf(vRVar);
        if (indexOf != -1) {
            if (vRVar.setY > j2) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.remove(indexOf);
            } else {
                vV.setIconTintList seticontintlist = vV.setX;
                if (vV.setIconTintList.isLoggable(Level.FINE)) {
                    vY.setIconTintList(vRVar, this, "already scheduled");
                }
                return false;
            }
        }
        vRVar.setY = j2;
        vV.setIconTintList seticontintlist2 = vV.setX;
        if (vV.setIconTintList.isLoggable(Level.FINE)) {
            if (z) {
                StringBuilder sb = new StringBuilder("run again after ");
                sb.append(vY.MenuHostHelper$$ExternalSyntheticLambda1(j2 - y));
                obj = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder("scheduled after ");
                sb2.append(vY.MenuHostHelper$$ExternalSyntheticLambda1(j2 - y));
                obj = sb2.toString();
            }
            vY.setIconTintList(vRVar, this, obj);
        }
        Iterator<vR> it = this.MenuHostHelper$$ExternalSyntheticLambda1.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().setY - y > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = this.MenuHostHelper$$ExternalSyntheticLambda1.size();
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.add(i, vRVar);
        return i == 0;
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        vR vRVar = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (vRVar != null) {
            pN.setX(vRVar);
            if (vRVar.setX) {
                this.setY = true;
            }
        }
        boolean z = false;
        for (int size = this.MenuHostHelper$$ExternalSyntheticLambda1.size() - 1; size >= 0; size--) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1.get(size).setX) {
                vR vRVar2 = this.MenuHostHelper$$ExternalSyntheticLambda1.get(size);
                vV.setIconTintList seticontintlist = vV.setX;
                if (vV.setIconTintList.isLoggable(Level.FINE)) {
                    vY.setIconTintList(vRVar2, this, "canceled");
                }
                this.MenuHostHelper$$ExternalSyntheticLambda1.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final String toString() {
        return this.setX;
    }

    public final void setY() {
        boolean z = vL.MenuHostHelper$$ExternalSyntheticLambda0;
        synchronized (this.setUiOptions) {
            if (MenuHostHelper$$ExternalSyntheticLambda0()) {
                this.setUiOptions.setIconTintList(this);
            }
            nX nXVar = nX.setX;
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        boolean z = vL.MenuHostHelper$$ExternalSyntheticLambda0;
        synchronized (this.setUiOptions) {
            this.setIconTintList = true;
            if (MenuHostHelper$$ExternalSyntheticLambda0()) {
                this.setUiOptions.setIconTintList(this);
            }
            nX nXVar = nX.setX;
        }
    }
}