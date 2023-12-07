package o;

import java.net.Socket;
import o.wB;

/* loaded from: classes.dex */
public final class wB$MenuHostHelper$$ExternalSyntheticLambda0 {
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    public String MenuHostHelper$$ExternalSyntheticLambda1;
    public wB.setY setIconTintList;
    public InterfaceC0606xq setLayoutAnimation;
    public Socket setNavigationOnClickListener;
    public InterfaceC0607xr setOnLongClickListener;
    final vV setUnboundedRipple;
    wE setX;
    public int setY;

    public wB$MenuHostHelper$$ExternalSyntheticLambda0(vV vVVar) {
        pN.setY(vVVar, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        this.setUnboundedRipple = vVVar;
        this.setIconTintList = wB.setY.setAnimationFromJson;
        this.setX = wE.setY;
    }

    public final wB$MenuHostHelper$$ExternalSyntheticLambda0 setX(Socket socket, String str, InterfaceC0607xr interfaceC0607xr, InterfaceC0606xq interfaceC0606xq) {
        String obj;
        pN.setY(socket, "");
        pN.setY(str, "");
        pN.setY(interfaceC0607xr, "");
        pN.setY(interfaceC0606xq, "");
        this.setNavigationOnClickListener = socket;
        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            StringBuilder sb = new StringBuilder();
            sb.append(vL.setNavigationOnClickListener);
            sb.append(' ');
            sb.append(str);
            obj = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder("MockWebServer ");
            sb2.append(str);
            obj = sb2.toString();
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = obj;
        this.setOnLongClickListener = interfaceC0607xr;
        this.setLayoutAnimation = interfaceC0606xq;
        return this;
    }
}