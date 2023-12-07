package o;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class oV {
    static setIconTintList setIconTintList;
    public static final oV MenuHostHelper$$ExternalSyntheticLambda0 = new oV();
    static final setIconTintList setY = new setIconTintList(null, null, null);

    /* loaded from: classes.dex */
    static final class setIconTintList {
        public final Method MenuHostHelper$$ExternalSyntheticLambda0;
        public final Method MenuHostHelper$$ExternalSyntheticLambda1;
        public final Method setIconTintList;

        public setIconTintList(Method method, Method method2, Method method3) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = method;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = method2;
            this.setIconTintList = method3;
        }
    }

    private oV() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setIconTintList setIconTintList(oR oRVar) {
        try {
            setIconTintList seticontintlist = new setIconTintList(Class.class.getDeclaredMethod("getModule", new Class[0]), oRVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), oRVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            setIconTintList = seticontintlist;
            return seticontintlist;
        } catch (Exception unused) {
            setIconTintList seticontintlist2 = setY;
            setIconTintList = seticontintlist2;
            return seticontintlist2;
        }
    }
}