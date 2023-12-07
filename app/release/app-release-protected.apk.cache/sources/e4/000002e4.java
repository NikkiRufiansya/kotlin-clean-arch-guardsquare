package o;

/* loaded from: classes.dex */
public final class attachInterface {
    public final String setIconTintList;

    public attachInterface(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.setIconTintList = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof attachInterface) {
            return this.setIconTintList.equals(((attachInterface) obj).setIconTintList);
        }
        return false;
    }

    public final int hashCode() {
        return this.setIconTintList.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Encoding{name=\"");
        sb.append(this.setIconTintList);
        sb.append("\"}");
        return sb.toString();
    }
}