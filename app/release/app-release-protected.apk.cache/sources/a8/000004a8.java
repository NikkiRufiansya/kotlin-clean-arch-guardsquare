package o;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class gK implements InterfaceC0029aq {
    @Override // o.InterfaceC0029aq
    public final List<C0024al<?>> setIconTintList(com.google.firebase.components.ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C0024al<?> c0024al : componentRegistrar.MenuHostHelper$$ExternalSyntheticLambda0()) {
            final String str = c0024al.setIconTintList;
            if (str != null) {
                c0024al = new C0024al<>(c0024al.setIconTintList, c0024al.MenuHostHelper$$ExternalSyntheticLambda1, c0024al.setX, c0024al.setY, c0024al.setOnLongClickListener, new InterfaceC0027ao() { // from class: o.gO
                    @Override // o.InterfaceC0027ao
                    public final Object setX(InterfaceC0025am interfaceC0025am) {
                        return gK.setY(str, c0024al, interfaceC0025am);
                    }
                }, c0024al.setNavigationOnClickListener);
            }
            arrayList.add(c0024al);
        }
        return arrayList;
    }

    public static /* synthetic */ Object setY(String str, C0024al c0024al, InterfaceC0025am interfaceC0025am) {
        try {
            Trace.beginSection(str);
            return c0024al.MenuHostHelper$$ExternalSyntheticLambda0.setX(interfaceC0025am);
        } finally {
            Trace.endSection();
        }
    }
}