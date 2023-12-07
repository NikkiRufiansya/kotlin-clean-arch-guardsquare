package o;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
final class bA implements InterfaceC0065bz, InterfaceC0062bw {
    private final boolean MenuHostHelper$$ExternalSyntheticLambda0;
    final JsonWriter MenuHostHelper$$ExternalSyntheticLambda1;
    private final InterfaceC0057br<Object> setIconTintList;
    private final Map<Class<?>, InterfaceC0063bx<?>> setLayoutAnimation;
    private final Map<Class<?>, InterfaceC0057br<?>> setNavigationOnClickListener;
    bA setX = null;
    boolean setY = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bA(Writer writer, Map<Class<?>, InterfaceC0057br<?>> map, Map<Class<?>, InterfaceC0063bx<?>> map2, InterfaceC0057br<Object> interfaceC0057br, boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new JsonWriter(writer);
        this.setNavigationOnClickListener = map;
        this.setLayoutAnimation = map2;
        this.setIconTintList = interfaceC0057br;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bA MenuHostHelper$$ExternalSyntheticLambda0(Object obj) {
        if (obj == null) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.value((Number) obj);
            return this;
        } else {
            int i = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    if (this.setY) {
                        if (bArr == null) {
                            this.MenuHostHelper$$ExternalSyntheticLambda1.nullValue();
                        } else {
                            this.MenuHostHelper$$ExternalSyntheticLambda1.value(Base64.encodeToString(bArr, 2));
                        }
                        return this;
                    }
                    throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
                }
                this.MenuHostHelper$$ExternalSyntheticLambda1.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i < length) {
                        this.MenuHostHelper$$ExternalSyntheticLambda1.value(iArr[i]);
                        i++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i < length2) {
                        long j = jArr[i];
                        if (this.setY) {
                            this.MenuHostHelper$$ExternalSyntheticLambda1.value(j);
                            i++;
                        } else {
                            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
                        }
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i < length3) {
                        this.MenuHostHelper$$ExternalSyntheticLambda1.value(dArr[i]);
                        i++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i < length4) {
                        this.MenuHostHelper$$ExternalSyntheticLambda1.value(zArr[i]);
                        i++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i < length5) {
                        MenuHostHelper$$ExternalSyntheticLambda0(numberArr[i]);
                        i++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i < length6) {
                        MenuHostHelper$$ExternalSyntheticLambda0(objArr[i]);
                        i++;
                    }
                }
                this.MenuHostHelper$$ExternalSyntheticLambda1.endArray();
                return this;
            } else if (obj instanceof Collection) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.beginArray();
                for (Object obj2 : (Collection) obj) {
                    MenuHostHelper$$ExternalSyntheticLambda0(obj2);
                }
                this.MenuHostHelper$$ExternalSyntheticLambda1.endArray();
                return this;
            } else if (obj instanceof Map) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        String str = (String) key;
                        Object value = entry.getValue();
                        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                            setY(str, value);
                        } else {
                            MenuHostHelper$$ExternalSyntheticLambda0(str, value);
                        }
                    } catch (ClassCastException e) {
                        throw new C0060bu(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                this.MenuHostHelper$$ExternalSyntheticLambda1.endObject();
                return this;
            } else {
                InterfaceC0057br<?> interfaceC0057br = this.setNavigationOnClickListener.get(obj.getClass());
                if (interfaceC0057br == null) {
                    InterfaceC0063bx<?> interfaceC0063bx = this.setLayoutAnimation.get(obj.getClass());
                    if (interfaceC0063bx != null) {
                        interfaceC0063bx.setY(obj, this);
                        return this;
                    } else if (obj instanceof Enum) {
                        if (obj instanceof bJ) {
                            int MenuHostHelper$$ExternalSyntheticLambda1 = ((bJ) obj).MenuHostHelper$$ExternalSyntheticLambda1();
                            if (this.setY) {
                                this.MenuHostHelper$$ExternalSyntheticLambda1.value(MenuHostHelper$$ExternalSyntheticLambda1);
                            } else {
                                throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
                            }
                        } else {
                            String name = ((Enum) obj).name();
                            if (this.setY) {
                                this.MenuHostHelper$$ExternalSyntheticLambda1.value(name);
                            } else {
                                throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
                            }
                        }
                        return this;
                    } else {
                        InterfaceC0057br<Object> interfaceC0057br2 = this.setIconTintList;
                        this.MenuHostHelper$$ExternalSyntheticLambda1.beginObject();
                        interfaceC0057br2.setY(obj, this);
                        this.MenuHostHelper$$ExternalSyntheticLambda1.endObject();
                        return this;
                    }
                }
                this.MenuHostHelper$$ExternalSyntheticLambda1.beginObject();
                interfaceC0057br.setY(obj, this);
                this.MenuHostHelper$$ExternalSyntheticLambda1.endObject();
                return this;
            }
        }
    }

    private bA MenuHostHelper$$ExternalSyntheticLambda0(String str, Object obj) {
        if (this.setY) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.name(str);
            if (obj == null) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.nullValue();
                return this;
            }
            return MenuHostHelper$$ExternalSyntheticLambda0(obj);
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    private bA setY(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        if (this.setY) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.name(str);
            return MenuHostHelper$$ExternalSyntheticLambda0(obj);
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // o.InterfaceC0065bz
    public final InterfaceC0065bz MenuHostHelper$$ExternalSyntheticLambda1(C0056bq c0056bq, double d) {
        String str = c0056bq.MenuHostHelper$$ExternalSyntheticLambda1;
        if (this.setY) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.name(str);
            if (this.setY) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.value(d);
                return this;
            }
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // o.InterfaceC0065bz
    public final InterfaceC0065bz setY(C0056bq c0056bq, int i) {
        String str = c0056bq.MenuHostHelper$$ExternalSyntheticLambda1;
        if (this.setY) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.name(str);
            if (this.setY) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.value(i);
                return this;
            }
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // o.InterfaceC0065bz
    public final InterfaceC0065bz MenuHostHelper$$ExternalSyntheticLambda1(C0056bq c0056bq, long j) {
        String str = c0056bq.MenuHostHelper$$ExternalSyntheticLambda1;
        if (this.setY) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.name(str);
            if (this.setY) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.value(j);
                return this;
            }
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // o.InterfaceC0065bz
    public final InterfaceC0065bz setIconTintList(C0056bq c0056bq, Object obj) {
        String str = c0056bq.MenuHostHelper$$ExternalSyntheticLambda1;
        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            return setY(str, obj);
        }
        return MenuHostHelper$$ExternalSyntheticLambda0(str, obj);
    }

    @Override // o.InterfaceC0062bw
    public final /* synthetic */ InterfaceC0062bw MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        if (this.setY) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.value(str);
            return this;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // o.InterfaceC0062bw
    public final /* synthetic */ InterfaceC0062bw setX(boolean z) {
        if (this.setY) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.value(z);
            return this;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}