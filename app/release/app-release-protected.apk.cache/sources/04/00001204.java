package o;

/* loaded from: classes.dex */
public final class vS {
    public static final setY setY = new setY((byte) 0);
    public final vJ setIconTintList;
    public final vE setX;

    public vS(vE vEVar, vJ vJVar) {
        this.setX = vEVar;
        this.setIconTintList = vJVar;
    }

    /* loaded from: classes.dex */
    public static final class setY {
        private setY() {
        }

        public /* synthetic */ setY(byte b) {
            this();
        }

        public static boolean setX(vJ vJVar, vE vEVar) {
            pN.setY(vJVar, "");
            pN.setY(vEVar, "");
            int i = vJVar.MenuHostHelper$$ExternalSyntheticLambda0;
            if (i != 200 && i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
                if (i != 307) {
                    if (i != 308 && i != 404 && i != 405) {
                        switch (i) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (vJ.setY(vJVar, "Expires") == null) {
                    C0540vj c0540vj = vJVar.setLayoutAnimation;
                    if (c0540vj == null) {
                        c0540vj = C0540vj.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(vJVar.setNavigationOnClickListener);
                        vJVar.setLayoutAnimation = c0540vj;
                    }
                    if (c0540vj.setY == -1) {
                        C0540vj c0540vj2 = vJVar.setLayoutAnimation;
                        if (c0540vj2 == null) {
                            c0540vj2 = C0540vj.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(vJVar.setNavigationOnClickListener);
                            vJVar.setLayoutAnimation = c0540vj2;
                        }
                        if (!c0540vj2.setX) {
                            C0540vj c0540vj3 = vJVar.setLayoutAnimation;
                            if (c0540vj3 == null) {
                                c0540vj3 = C0540vj.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(vJVar.setNavigationOnClickListener);
                                vJVar.setLayoutAnimation = c0540vj3;
                            }
                            if (!c0540vj3.MenuHostHelper$$ExternalSyntheticLambda0) {
                                return false;
                            }
                        }
                    }
                }
            }
            C0540vj c0540vj4 = vJVar.setLayoutAnimation;
            if (c0540vj4 == null) {
                c0540vj4 = C0540vj.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(vJVar.setNavigationOnClickListener);
                vJVar.setLayoutAnimation = c0540vj4;
            }
            if (c0540vj4.setOnLongClickListener) {
                return false;
            }
            C0540vj c0540vj5 = vEVar.setIconTintList;
            if (c0540vj5 == null) {
                c0540vj5 = C0540vj.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(vEVar.setY);
                vEVar.setIconTintList = c0540vj5;
            }
            return !c0540vj5.setOnLongClickListener;
        }
    }
}