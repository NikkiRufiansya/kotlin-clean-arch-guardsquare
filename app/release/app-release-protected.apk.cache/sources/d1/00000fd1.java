package o;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class setStatusBarScrim {
    private static final setStatusBarScrim setIconTintList = new setStatusBarScrim$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);
    private static final setStatusBarScrim MenuHostHelper$$ExternalSyntheticLambda0 = new setIconTintList((byte) 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void MenuHostHelper$$ExternalSyntheticLambda0(Object obj, Object obj2, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void setIconTintList(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ setStatusBarScrim(byte b) {
        this();
    }

    private setStatusBarScrim() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setStatusBarScrim setIconTintList() {
        return setIconTintList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setStatusBarScrim setY() {
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    /* loaded from: classes.dex */
    static final class setIconTintList extends setStatusBarScrim {
        private setIconTintList() {
            super((byte) 0);
        }

        /* synthetic */ setIconTintList(byte b) {
            this();
        }

        @Override // o.setStatusBarScrim
        final void setIconTintList(Object obj, long j) {
            ((setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1) WindowInsetsCompat$Impl20.setUnboundedRipple(obj, j)).setX();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [o.setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1] */
        @Override // o.setStatusBarScrim
        final <E> void MenuHostHelper$$ExternalSyntheticLambda0(Object obj, Object obj2, long j) {
            setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1<E> setviewcacheextension_menuhosthelper__externalsyntheticlambda1 = (setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1) WindowInsetsCompat$Impl20.setUnboundedRipple(obj, j);
            setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1<E> setviewcacheextension_menuhosthelper__externalsyntheticlambda12 = (setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1) WindowInsetsCompat$Impl20.setUnboundedRipple(obj2, j);
            int size = setviewcacheextension_menuhosthelper__externalsyntheticlambda1.size();
            int size2 = setviewcacheextension_menuhosthelper__externalsyntheticlambda12.size();
            setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1<E> setviewcacheextension_menuhosthelper__externalsyntheticlambda13 = setviewcacheextension_menuhosthelper__externalsyntheticlambda1;
            setviewcacheextension_menuhosthelper__externalsyntheticlambda13 = setviewcacheextension_menuhosthelper__externalsyntheticlambda1;
            if (size > 0 && size2 > 0) {
                boolean y = setviewcacheextension_menuhosthelper__externalsyntheticlambda1.setY();
                setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1<E> setviewcacheextension_menuhosthelper__externalsyntheticlambda14 = setviewcacheextension_menuhosthelper__externalsyntheticlambda1;
                if (!y) {
                    setviewcacheextension_menuhosthelper__externalsyntheticlambda14 = setviewcacheextension_menuhosthelper__externalsyntheticlambda1.setX(size2 + size);
                }
                setviewcacheextension_menuhosthelper__externalsyntheticlambda14.addAll(setviewcacheextension_menuhosthelper__externalsyntheticlambda12);
                setviewcacheextension_menuhosthelper__externalsyntheticlambda13 = setviewcacheextension_menuhosthelper__externalsyntheticlambda14;
            }
            if (size > 0) {
                setviewcacheextension_menuhosthelper__externalsyntheticlambda12 = setviewcacheextension_menuhosthelper__externalsyntheticlambda13;
            }
            WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putObject(obj, j, setviewcacheextension_menuhosthelper__externalsyntheticlambda12);
        }

        @Override // o.setStatusBarScrim
        final <L> List<L> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j) {
            setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1 setviewcacheextension_menuhosthelper__externalsyntheticlambda1 = (setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1) WindowInsetsCompat$Impl20.setUnboundedRipple(obj, j);
            if (setviewcacheextension_menuhosthelper__externalsyntheticlambda1.setY()) {
                return setviewcacheextension_menuhosthelper__externalsyntheticlambda1;
            }
            int size = setviewcacheextension_menuhosthelper__externalsyntheticlambda1.size();
            setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1 x = setviewcacheextension_menuhosthelper__externalsyntheticlambda1.setX(size == 0 ? 10 : size << 1);
            WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putObject(obj, j, x);
            return x;
        }
    }
}