package o;

/* loaded from: classes.dex */
public final /* synthetic */ class setPlaceholderText implements setIndeterminateDrawableTiled {
    public final /* synthetic */ setIndeterminateDrawableTiled setIconTintList;
    public final /* synthetic */ setTransitioning$MenuHostHelper$$ExternalSyntheticLambda0 setX;

    public /* synthetic */ setPlaceholderText(setTransitioning$MenuHostHelper$$ExternalSyntheticLambda0 settransitioning_menuhosthelper__externalsyntheticlambda0, setIndeterminateDrawableTiled setindeterminatedrawabletiled) {
        this.setX = settransitioning_menuhosthelper__externalsyntheticlambda0;
        this.setIconTintList = setindeterminatedrawabletiled;
    }

    @Override // o.setIndeterminateDrawableTiled
    public final Object MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        setTransitioning$MenuHostHelper$$ExternalSyntheticLambda0 settransitioning_menuhosthelper__externalsyntheticlambda0 = this.setX;
        setIndeterminateDrawableTiled setindeterminatedrawabletiled = this.setIconTintList;
        setTextSelectHandleRight iconTintList = ((setWindowCallback) obj).setIconTintList(settransitioning_menuhosthelper__externalsyntheticlambda0.setX);
        int i = 0;
        while (i < settransitioning_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1.size()) {
            int i2 = i + 1;
            Object obj2 = settransitioning_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1.get(i);
            if (obj2 == null) {
                iconTintList.setIconTintList(i2);
            } else if (obj2 instanceof Long) {
                iconTintList.setY(i2, ((Long) obj2).longValue());
            } else if (obj2 instanceof Double) {
                iconTintList.setX(i2, ((Double) obj2).doubleValue());
            } else if (obj2 instanceof String) {
                iconTintList.setY(i2, (String) obj2);
            } else if (obj2 instanceof byte[]) {
                iconTintList.setY(i2, (byte[]) obj2);
            }
            i = i2;
        }
        return setindeterminatedrawabletiled.MenuHostHelper$$ExternalSyntheticLambda1(iconTintList);
    }
}