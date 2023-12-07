package o;

/* loaded from: classes.dex */
public final class sJ extends C0515ul implements InterfaceC0470sw {
    @Override // o.InterfaceC0470sw
    public final sJ p_() {
        return this;
    }

    @Override // o.InterfaceC0470sw
    public final boolean setX() {
        return true;
    }

    public final String setX(String str) {
        Object obj;
        Object obj2;
        StringBuilder sb = new StringBuilder("List{");
        sb.append(str);
        sb.append("}[");
        sJ sJVar = this;
        while (true) {
            obj = sJVar._next;
            if (!(obj instanceof AbstractC0524uu)) {
                break;
            }
            ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(sJVar);
        }
        C0518uo c0518uo = (C0518uo) obj;
        boolean z = true;
        while (!pN.MenuHostHelper$$ExternalSyntheticLambda0(c0518uo, sJVar)) {
            if (c0518uo instanceof sC) {
                sC sCVar = (sC) c0518uo;
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(sCVar);
            }
            while (true) {
                obj2 = c0518uo._next;
                if (!(obj2 instanceof AbstractC0524uu)) {
                    break;
                }
                ((AbstractC0524uu) obj2).MenuHostHelper$$ExternalSyntheticLambda1(c0518uo);
            }
            c0518uo = C0516um.setIconTintList(obj2);
        }
        sb.append("]");
        String obj3 = sb.toString();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) obj3, "");
        return obj3;
    }

    @Override // o.C0518uo
    public final String toString() {
        return rX.setX() ? setX("Active") : super.toString();
    }
}