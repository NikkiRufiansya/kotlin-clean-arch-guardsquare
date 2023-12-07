package o;

import android.util.Log;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class gA {
    public static final gA setIconTintList = new gA();
    private static final Map<gC$MenuHostHelper$$ExternalSyntheticLambda1, gA$MenuHostHelper$$ExternalSyntheticLambda0> setX = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setX extends oX {
        Object MenuHostHelper$$ExternalSyntheticLambda0;
        Object MenuHostHelper$$ExternalSyntheticLambda1;
        Object setIconTintList;
        int setLayoutAnimation;
        /* synthetic */ Object setNavigationOnClickListener;
        Object setOnLongClickListener;
        Object setX;
        Object setY;

        setX(oK<? super setX> oKVar) {
            super(oKVar);
        }

        @Override // o.oR
        public final Object setY(Object obj) {
            this.setNavigationOnClickListener = obj;
            this.setLayoutAnimation |= Integer.MIN_VALUE;
            return gA.this.MenuHostHelper$$ExternalSyntheticLambda1(this);
        }
    }

    private gA() {
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(gC$MenuHostHelper$$ExternalSyntheticLambda1 gc_menuhosthelper__externalsyntheticlambda1) {
        pN.setY(gc_menuhosthelper__externalsyntheticlambda1, "");
        Map<gC$MenuHostHelper$$ExternalSyntheticLambda1, gA$MenuHostHelper$$ExternalSyntheticLambda0> map = setX;
        if (map.containsKey(gc_menuhosthelper__externalsyntheticlambda1)) {
            StringBuilder sb = new StringBuilder("Dependency ");
            sb.append(gc_menuhosthelper__externalsyntheticlambda1);
            sb.append(" already added.");
            Log.d("SessionsDependencies", sb.toString());
            return;
        }
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) map, "");
        map.put(gc_menuhosthelper__externalsyntheticlambda1, new gA$MenuHostHelper$$ExternalSyntheticLambda0(C0534vd.MenuHostHelper$$ExternalSyntheticLambda1(true)));
    }

    public static gA$MenuHostHelper$$ExternalSyntheticLambda0 setIconTintList(gC$MenuHostHelper$$ExternalSyntheticLambda1 gc_menuhosthelper__externalsyntheticlambda1) {
        Map<gC$MenuHostHelper$$ExternalSyntheticLambda1, gA$MenuHostHelper$$ExternalSyntheticLambda0> map = setX;
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) map, "");
        gA$MenuHostHelper$$ExternalSyntheticLambda0 ga_menuhosthelper__externalsyntheticlambda0 = map.get(gc_menuhosthelper__externalsyntheticlambda1);
        if (ga_menuhosthelper__externalsyntheticlambda0 != null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) ga_menuhosthelper__externalsyntheticlambda0, "");
            return ga_menuhosthelper__externalsyntheticlambda0;
        }
        StringBuilder sb = new StringBuilder("Cannot get dependency ");
        sb.append(gc_menuhosthelper__externalsyntheticlambda1);
        sb.append(". Dependencies should be added at class load time.");
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb A[Catch: all -> 0x00d4, TRY_ENTER, TryCatch #0 {all -> 0x00d4, blocks: (B:28:0x00a8, B:31:0x00bb, B:32:0x00d3), top: B:39:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9 A[RETURN] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a6 -> B:27:0x00a7). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object MenuHostHelper$$ExternalSyntheticLambda1(o.oK<? super java.util.Map<o.gC$MenuHostHelper$$ExternalSyntheticLambda1, ? extends o.gC>> r12) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.gA.MenuHostHelper$$ExternalSyntheticLambda1(o.oK):java.lang.Object");
    }
}