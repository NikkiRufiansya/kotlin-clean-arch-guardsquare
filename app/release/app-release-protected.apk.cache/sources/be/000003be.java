package o;

import android.util.Log;
import o.lC;

/* renamed from: o.dc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0096dc {
    private final InterfaceC0083cq MenuHostHelper$$ExternalSyntheticLambda0;
    private final InterfaceC0073cg<setIconPadding> MenuHostHelper$$ExternalSyntheticLambda1;
    private final com.google.firebase.FirebaseApp setIconTintList;
    private final InterfaceC0073cg<C0172fz> setX;

    public C0096dc(com.google.firebase.FirebaseApp firebaseApp, InterfaceC0083cq interfaceC0083cq, InterfaceC0073cg<C0172fz> interfaceC0073cg, InterfaceC0073cg<setIconPadding> interfaceC0073cg2) {
        this.setIconTintList = firebaseApp;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = interfaceC0083cq;
        this.setX = interfaceC0073cg;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = interfaceC0073cg2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.firebase.FirebaseApp setIconTintList() {
        return this.setIconTintList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterfaceC0083cq setX() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterfaceC0073cg<C0172fz> MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterfaceC0073cg<setIconPadding> setLayoutAnimation() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public cY MenuHostHelper$$ExternalSyntheticLambda1() {
        cY cYVar;
        cYVar = cY.setIconTintList;
        return cYVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public cW setY() {
        return cW.setY();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public dQ setUiOptions() {
        return dQ.setIconTintList();
    }

    private static void setNavigationOnClickListener() {
        String str;
        String str2;
        lC.setY sety = lC.MenuHostHelper$$ExternalSyntheticLambda0;
        lC.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        pN.setY("App Tamper Detection", "");
        lC.setY = "App Tamper Detection";
        str = lC.setIconTintList;
        str2 = lC.setY;
        Log.d(str, str2);
    }
}