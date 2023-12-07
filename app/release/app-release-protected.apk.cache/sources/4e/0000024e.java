package o;

import android.util.Base64;
import o.C0286m;

/* loaded from: classes.dex */
public abstract class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 {
    public abstract isBinderAlive MenuHostHelper$$ExternalSyntheticLambda0();

    public abstract String setX();

    public abstract byte[] setY();

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = setX();
        objArr[1] = MenuHostHelper$$ExternalSyntheticLambda0();
        objArr[2] = setY() == null ? "" : Base64.encodeToString(setY(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }

    public static StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList() {
        C0286m.AnonymousClass4.setX setx = new C0286m.AnonymousClass4.setX();
        isBinderAlive isbinderalive = isBinderAlive.DEFAULT;
        if (isbinderalive == null) {
            throw new NullPointerException("Null priority");
        }
        setx.MenuHostHelper$$ExternalSyntheticLambda1 = isbinderalive;
        return setx;
    }
}