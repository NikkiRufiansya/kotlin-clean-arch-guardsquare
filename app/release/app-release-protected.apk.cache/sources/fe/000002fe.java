package o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class bN {
    private final InterfaceC0057br<Object> setIconTintList;
    private final Map<Class<?>, InterfaceC0057br<?>> setX;
    private final Map<Class<?>, InterfaceC0063bx<?>> setY;

    public bN(Map<Class<?>, InterfaceC0057br<?>> map, Map<Class<?>, InterfaceC0063bx<?>> map2, InterfaceC0057br<Object> interfaceC0057br) {
        this.setX = map;
        this.setY = map2;
        this.setIconTintList = interfaceC0057br;
    }

    public final byte[] MenuHostHelper$$ExternalSyntheticLambda0(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bO bOVar = new bO(byteArrayOutputStream, this.setX, this.setY, this.setIconTintList);
            if (obj != null) {
                InterfaceC0057br<?> interfaceC0057br = bOVar.setX.get(obj.getClass());
                if (interfaceC0057br != null) {
                    interfaceC0057br.setY(obj, bOVar);
                } else {
                    StringBuilder sb = new StringBuilder("No encoder for ");
                    sb.append(obj.getClass());
                    throw new C0060bu(sb.toString());
                }
            }
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}