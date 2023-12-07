package o;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class bB implements InterfaceC0064by<bB> {
    private final Map<Class<?>, InterfaceC0057br<?>> setOnLongClickListener = new HashMap();
    private final Map<Class<?>, InterfaceC0063bx<?>> setUiOptions;
    private InterfaceC0057br<Object> setUnboundedRipple;
    public boolean setY;
    private static final InterfaceC0057br<Object> MenuHostHelper$$ExternalSyntheticLambda0 = new InterfaceC0057br() { // from class: o.bE
        @Override // o.InterfaceC0058bs
        public final void setY(Object obj, InterfaceC0065bz interfaceC0065bz) {
            bB.setX(obj);
        }
    };
    private static final InterfaceC0063bx<String> setIconTintList = new InterfaceC0063bx() { // from class: o.bD
        @Override // o.InterfaceC0058bs
        public final void setY(Object obj, InterfaceC0062bw interfaceC0062bw) {
            bB.MenuHostHelper$$ExternalSyntheticLambda0((String) obj, interfaceC0062bw);
        }
    };
    private static final InterfaceC0063bx<Boolean> setX = new InterfaceC0063bx() { // from class: o.bC
        @Override // o.InterfaceC0058bs
        public final void setY(Object obj, InterfaceC0062bw interfaceC0062bw) {
            bB.setX((Boolean) obj, interfaceC0062bw);
        }
    };
    private static final bB$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda1 = new bB$MenuHostHelper$$ExternalSyntheticLambda0((byte) 0);

    public static /* synthetic */ void setX(Object obj) {
        StringBuilder sb = new StringBuilder("Couldn't find encoder for type ");
        sb.append(obj.getClass().getCanonicalName());
        throw new C0060bu(sb.toString());
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(String str, InterfaceC0062bw interfaceC0062bw) {
        interfaceC0062bw.MenuHostHelper$$ExternalSyntheticLambda0(str);
    }

    public static /* synthetic */ void setX(Boolean bool, InterfaceC0062bw interfaceC0062bw) {
        interfaceC0062bw.setX(bool.booleanValue());
    }

    public bB() {
        HashMap hashMap = new HashMap();
        this.setUiOptions = hashMap;
        this.setUnboundedRipple = MenuHostHelper$$ExternalSyntheticLambda0;
        this.setY = false;
        hashMap.put(String.class, setIconTintList);
        this.setOnLongClickListener.remove(String.class);
        this.setUiOptions.put(Boolean.class, setX);
        this.setOnLongClickListener.remove(Boolean.class);
        this.setUiOptions.put(Date.class, MenuHostHelper$$ExternalSyntheticLambda1);
        this.setOnLongClickListener.remove(Date.class);
    }

    /* renamed from: o.bB$2 */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements InterfaceC0059bt {
        public AnonymousClass2() {
            bB.this = r1;
        }

        @Override // o.InterfaceC0059bt
        public final void setX(Object obj, Writer writer) {
            bA bAVar = new bA(writer, bB.this.setOnLongClickListener, bB.this.setUiOptions, bB.this.setUnboundedRipple, bB.this.setY);
            bAVar.MenuHostHelper$$ExternalSyntheticLambda0(obj);
            if (!bAVar.setY) {
                throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
            }
            bA bAVar2 = bAVar.setX;
            bAVar.MenuHostHelper$$ExternalSyntheticLambda1.flush();
        }

        @Override // o.InterfaceC0059bt
        public final String MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                setX(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    @Override // o.InterfaceC0064by
    public final /* synthetic */ bB MenuHostHelper$$ExternalSyntheticLambda1(Class cls, InterfaceC0057br interfaceC0057br) {
        this.setOnLongClickListener.put(cls, interfaceC0057br);
        this.setUiOptions.remove(cls);
        return this;
    }
}