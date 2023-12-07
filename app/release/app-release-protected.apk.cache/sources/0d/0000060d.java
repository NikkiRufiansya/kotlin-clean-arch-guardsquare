package o;

/* renamed from: o.ih  reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0235ih implements iD {
    private static final C0235ih setY = new C0235ih();

    private C0235ih() {
    }

    @Override // o.iD
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(Class<?> cls) {
        return AbstractC0239il.class.isAssignableFrom(cls);
    }

    @Override // o.iD
    public final iF setIconTintList(Class<?> cls) {
        if (!AbstractC0239il.class.isAssignableFrom(cls)) {
            StringBuilder sb = new StringBuilder("Unsupported message type: ");
            sb.append(cls.getName());
            throw new IllegalArgumentException(sb.toString());
        }
        try {
            return (iF) AbstractC0239il.setIconTintList((Class<AbstractC0239il>) cls.asSubclass(AbstractC0239il.class)).ViewPager$SavedState$1();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("Unable to get message info for ");
            sb2.append(cls.getName());
            throw new RuntimeException(sb2.toString(), e);
        }
    }
}