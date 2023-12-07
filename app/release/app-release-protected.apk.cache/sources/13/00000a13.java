package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o.setCompatPressedTranslationZResource;

/* loaded from: classes.dex */
public final class setChipDelegate implements setTag<setCompatPressedTranslationZResource> {
    private final nF<setSearchableInfo> setX;

    public setChipDelegate(nF<setSearchableInfo> nFVar) {
        this.setX = nFVar;
    }

    @Override // o.nF
    public final /* synthetic */ Object setIconTintList() {
        setSearchableInfo iconTintList = this.setX.setIconTintList();
        setCompatPressedTranslationZResource.setX setx = new setCompatPressedTranslationZResource.setX();
        isBinderAlive isbinderalive = isBinderAlive.DEFAULT;
        setIconTintResource$MenuHostHelper$$ExternalSyntheticLambda1 seticontintresource_menuhosthelper__externalsyntheticlambda1 = new setIconTintResource$MenuHostHelper$$ExternalSyntheticLambda1();
        Set<setCompatPressedTranslationZResource.setIconTintList> emptySet = Collections.emptySet();
        if (emptySet == null) {
            throw new NullPointerException("Null flags");
        }
        seticontintresource_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1 = emptySet;
        setx.setY.put(isbinderalive, seticontintresource_menuhosthelper__externalsyntheticlambda1.setY(30000L).setIconTintList().setY());
        isBinderAlive isbinderalive2 = isBinderAlive.HIGHEST;
        setIconTintResource$MenuHostHelper$$ExternalSyntheticLambda1 seticontintresource_menuhosthelper__externalsyntheticlambda12 = new setIconTintResource$MenuHostHelper$$ExternalSyntheticLambda1();
        Set<setCompatPressedTranslationZResource.setIconTintList> emptySet2 = Collections.emptySet();
        if (emptySet2 == null) {
            throw new NullPointerException("Null flags");
        }
        seticontintresource_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda1 = emptySet2;
        setx.setY.put(isbinderalive2, seticontintresource_menuhosthelper__externalsyntheticlambda12.setY(1000L).setIconTintList().setY());
        isBinderAlive isbinderalive3 = isBinderAlive.VERY_LOW;
        setIconTintResource$MenuHostHelper$$ExternalSyntheticLambda1 seticontintresource_menuhosthelper__externalsyntheticlambda13 = new setIconTintResource$MenuHostHelper$$ExternalSyntheticLambda1();
        Set<setCompatPressedTranslationZResource.setIconTintList> emptySet3 = Collections.emptySet();
        if (emptySet3 == null) {
            throw new NullPointerException("Null flags");
        }
        seticontintresource_menuhosthelper__externalsyntheticlambda13.MenuHostHelper$$ExternalSyntheticLambda1 = emptySet3;
        setx.setY.put(isbinderalive3, seticontintresource_menuhosthelper__externalsyntheticlambda13.setY(86400000L).setIconTintList().setY(Collections.unmodifiableSet(new HashSet(Arrays.asList(setCompatPressedTranslationZResource.setIconTintList.DEVICE_IDLE)))).setY());
        setx.MenuHostHelper$$ExternalSyntheticLambda1 = iconTintList;
        if (setx.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            throw new NullPointerException("missing required property: clock");
        }
        if (setx.setY.keySet().size() < isBinderAlive.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        Map<isBinderAlive, setCompatPressedTranslationZResource$MenuHostHelper$$ExternalSyntheticLambda1> map = setx.setY;
        setx.setY = new HashMap();
        return new setDragged(setx.MenuHostHelper$$ExternalSyntheticLambda1, map);
    }
}