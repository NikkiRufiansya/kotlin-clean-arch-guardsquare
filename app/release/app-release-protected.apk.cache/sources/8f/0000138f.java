package o;

import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import o.C0602xo;
import o.vA;

/* loaded from: classes.dex */
final class yt<T> implements xU<T, vF> {
    private static final vA setIconTintList;
    private static final Charset setY;
    private final AbstractC0210hi<T> MenuHostHelper$$ExternalSyntheticLambda1;
    private final gS setX;

    static {
        vA y;
        y = vA.setIconTintList.setY("application/json; charset=UTF-8");
        setIconTintList = y;
        setY = Charset.forName("UTF-8");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public yt(gS gSVar, AbstractC0210hi<T> abstractC0210hi) {
        this.setX = gSVar;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = abstractC0210hi;
    }

    @Override // o.xU
    public final /* synthetic */ vF setY(Object obj) {
        C0602xo c0602xo = new C0602xo();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new C0602xo.setX(), setY);
        gS gSVar = this.setX;
        boolean z = gSVar.setX;
        hR hRVar = new hR(outputStreamWriter);
        boolean z2 = gSVar.MenuHostHelper$$ExternalSyntheticLambda1;
        boolean z3 = gSVar.setIconTintList;
        hRVar.setLayoutAnimation = false;
        this.MenuHostHelper$$ExternalSyntheticLambda1.setY(hRVar, obj);
        hRVar.close();
        return vF.setY(setIconTintList, c0602xo.MenuHostHelper$$ExternalSyntheticLambda0(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0));
    }
}