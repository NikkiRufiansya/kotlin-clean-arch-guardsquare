package o;

/* loaded from: classes.dex */
public final class setStatusBarForeground {
    private static final char[] MenuHostHelper$$ExternalSyntheticLambda1 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String MenuHostHelper$$ExternalSyntheticLambda0(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < length; i++) {
            char[] cArr = MenuHostHelper$$ExternalSyntheticLambda1;
            sb.append(cArr[(bArr[i] & 240) >>> 4]);
            sb.append(cArr[bArr[i] & 15]);
        }
        return sb.toString();
    }
}