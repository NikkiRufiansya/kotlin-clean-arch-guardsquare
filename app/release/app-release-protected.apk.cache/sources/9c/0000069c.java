package o;

import java.util.ArrayList;
import java.util.Locale;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;

/* loaded from: classes.dex */
public final class lI$MenuHostHelper$$ExternalSyntheticLambda0 extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled {
    final /* synthetic */ lI setAnimationFromJson;
    final C0274ln setMaxEms;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lI$MenuHostHelper$$ExternalSyntheticLambda0(lI lIVar, C0274ln c0274ln) {
        super(c0274ln.MenuHostHelper$$ExternalSyntheticLambda1);
        pN.setY(c0274ln, "");
        this.setAnimationFromJson = lIVar;
        this.setMaxEms = c0274ln;
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(lI lIVar, int i, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        pN.setY(lIVar, "");
        if (z) {
            arrayList3 = lIVar.MenuHostHelper$$ExternalSyntheticLambda1;
            arrayList4 = lIVar.setUiOptions;
            Object obj = arrayList4.get(i);
            pN.MenuHostHelper$$ExternalSyntheticLambda0(obj, "");
            String lowerCase = ((String) obj).toLowerCase(Locale.ROOT);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) lowerCase, "");
            arrayList3.add(lowerCase);
            return;
        }
        arrayList = lIVar.MenuHostHelper$$ExternalSyntheticLambda1;
        arrayList2 = lIVar.setUiOptions;
        Object obj2 = arrayList2.get(i);
        pN.MenuHostHelper$$ExternalSyntheticLambda0(obj2, "");
        String lowerCase2 = ((String) obj2).toLowerCase(Locale.ROOT);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) lowerCase2, "");
        arrayList.remove(lowerCase2);
    }
}