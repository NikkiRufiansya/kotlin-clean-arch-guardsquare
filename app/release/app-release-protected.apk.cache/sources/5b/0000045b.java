package o;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class fW {
    public final fX MenuHostHelper$$ExternalSyntheticLambda0;
    private final fN MenuHostHelper$$ExternalSyntheticLambda1;
    private final Context setIconTintList;
    private final InterfaceC0083cq setLayoutAnimation;
    private final String setNavigationOnClickListener;
    private final com.google.firebase.FirebaseApp setOnLongClickListener;
    private final ScheduledExecutorService setUiOptions;
    private final fZ setUnboundedRipple;
    private final fK setX;
    public final Set<InterfaceC0160fn> setY;

    public fW(com.google.firebase.FirebaseApp firebaseApp, InterfaceC0083cq interfaceC0083cq, fN fNVar, fK fKVar, Context context, String str, fZ fZVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.setY = linkedHashSet;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new fX(firebaseApp, interfaceC0083cq, fNVar, fKVar, context, str, linkedHashSet, fZVar, scheduledExecutorService);
        this.setOnLongClickListener = firebaseApp;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = fNVar;
        this.setLayoutAnimation = interfaceC0083cq;
        this.setX = fKVar;
        this.setIconTintList = context;
        this.setNavigationOnClickListener = str;
        this.setUnboundedRipple = fZVar;
        this.setUiOptions = scheduledExecutorService;
    }
}