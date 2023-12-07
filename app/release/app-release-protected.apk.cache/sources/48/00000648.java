package o;

/* renamed from: o.jc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0257jc {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.jc$setX */
    /* loaded from: classes.dex */
    public interface setX {
        byte setX(int i);

        int setX();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String setIconTintList(setX setx) {
        StringBuilder sb = new StringBuilder(setx.setX());
        for (int i = 0; i < setx.setX(); i++) {
            byte x = setx.setX(i);
            if (x == 34) {
                sb.append("\\\"");
            } else if (x == 39) {
                sb.append("\\'");
            } else if (x != 92) {
                switch (x) {
                    case 7:
                        sb.append("\\a");
                        continue;
                    case 8:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case 11:
                        sb.append("\\v");
                        continue;
                    case 12:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (x >= 32 && x <= 126) {
                            sb.append((char) x);
                            continue;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((x >>> 6) & 3) + 48));
                            sb.append((char) (((x >>> 3) & 7) + 48));
                            sb.append((char) ((x & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* renamed from: o.jc$5  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass5 implements setX {
        private /* synthetic */ hY MenuHostHelper$$ExternalSyntheticLambda0;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AnonymousClass5(hY hYVar) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = hYVar;
        }

        @Override // o.C0257jc.setX
        public final int setX() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0.setX();
        }

        @Override // o.C0257jc.setX
        public final byte setX(int i) {
            return this.MenuHostHelper$$ExternalSyntheticLambda0.setX(i);
        }
    }
}