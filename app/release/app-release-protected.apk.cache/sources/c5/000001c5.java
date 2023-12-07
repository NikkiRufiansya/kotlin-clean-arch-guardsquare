package o;

/* loaded from: classes.dex */
public final class FragmentManagerState$1 implements setRecycledViewPool {
    private final String setIconTintList;
    private final Object[] setX;

    private FragmentManagerState$1(String str, byte b) {
        this.setIconTintList = str;
        this.setX = null;
    }

    public FragmentManagerState$1(String str) {
        this(str, (byte) 0);
    }

    @Override // o.setRecycledViewPool
    public final String MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setIconTintList;
    }

    @Override // o.setRecycledViewPool
    public final void setX(setOnQueryTextFocusChangeListener setonquerytextfocuschangelistener) {
        Object[] objArr = this.setX;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    setonquerytextfocuschangelistener.setIconTintList(i);
                } else if (obj instanceof byte[]) {
                    setonquerytextfocuschangelistener.setY(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    setonquerytextfocuschangelistener.setX(i, ((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    setonquerytextfocuschangelistener.setX(i, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    setonquerytextfocuschangelistener.setY(i, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    setonquerytextfocuschangelistener.setY(i, ((Integer) obj).intValue());
                } else if (obj instanceof Short) {
                    setonquerytextfocuschangelistener.setY(i, ((Short) obj).shortValue());
                } else if (obj instanceof Byte) {
                    setonquerytextfocuschangelistener.setY(i, ((Byte) obj).byteValue());
                } else if (obj instanceof String) {
                    setonquerytextfocuschangelistener.setY(i, (String) obj);
                } else if (obj instanceof Boolean) {
                    setonquerytextfocuschangelistener.setY(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
                } else {
                    StringBuilder sb = new StringBuilder("Cannot bind ");
                    sb.append(obj);
                    sb.append(" at index ");
                    sb.append(i);
                    sb.append(" Supported types: null, byte[], float, double, long, int, short, byte, string");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
    }
}