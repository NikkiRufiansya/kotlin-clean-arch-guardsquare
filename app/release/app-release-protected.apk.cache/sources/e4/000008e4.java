package o;

/* loaded from: classes.dex */
public abstract class sI extends rQ {
    public abstract sI MenuHostHelper$$ExternalSyntheticLambda0();

    @Override // o.rQ
    public String toString() {
        String simpleName;
        String y = setY();
        if (y == null) {
            StringBuilder sb = new StringBuilder();
            simpleName = getClass().getSimpleName();
            sb.append(simpleName);
            sb.append('@');
            sb.append(rZ.setY(this));
            return sb.toString();
        }
        return y;
    }

    @Override // o.rQ
    public rQ setIconTintList(int i) {
        C0512ui.setX(i);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String setY() {
        sI sIVar;
        sI iconTintList = C0457sj.setIconTintList();
        if (this == iconTintList) {
            return "Dispatchers.Main";
        }
        try {
            sIVar = iconTintList.MenuHostHelper$$ExternalSyntheticLambda0();
        } catch (UnsupportedOperationException unused) {
            sIVar = null;
        }
        if (this == sIVar) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}