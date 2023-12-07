package o;

import java.util.ArrayList;
import java.util.List;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
import o.setAnimateShowBeforeLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setProgressTintMode implements setHorizontalGravity$MenuHostHelper$$ExternalSyntheticLambda1 {
    final setIconTintList MenuHostHelper$$ExternalSyntheticLambda0;
    Runnable MenuHostHelper$$ExternalSyntheticLambda1;
    final boolean setIconTintList;
    final ArrayList<setX> setLayoutAnimation;
    final ArrayList<setX> setOnLongClickListener;
    setAnimateShowBeforeLayout.setY<setX> setUnboundedRipple;
    final setHorizontalGravity setX;
    int setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface setIconTintList {
        void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2, Object obj);

        void MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2);

        void MenuHostHelper$$ExternalSyntheticLambda1(setX setx);

        void setIconTintList(int i, int i2);

        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setX(int i);

        void setX(int i, int i2);

        void setX(setX setx);

        void setY(int i, int i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setProgressTintMode(setIconTintList seticontintlist) {
        this(seticontintlist, (byte) 0);
    }

    private setProgressTintMode(setIconTintList seticontintlist, byte b) {
        this.setUnboundedRipple = new setAnimateShowBeforeLayout.setIconTintList(30);
        this.setOnLongClickListener = new ArrayList<>();
        this.setLayoutAnimation = new ArrayList<>();
        this.setY = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = seticontintlist;
        this.setIconTintList = false;
        this.setX = new setHorizontalGravity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setX(setX setx) {
        int i;
        if (setx.setY == 1 || setx.setY == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(setx.MenuHostHelper$$ExternalSyntheticLambda1, setx.setY);
        int i2 = setx.MenuHostHelper$$ExternalSyntheticLambda1;
        int i3 = setx.setY;
        if (i3 == 2) {
            i = 0;
        } else if (i3 != 4) {
            StringBuilder sb = new StringBuilder("op should be remove or update.");
            sb.append(setx);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i = 1;
        }
        int i4 = 1;
        for (int i5 = 1; i5 < setx.setIconTintList; i5++) {
            int MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(setx.MenuHostHelper$$ExternalSyntheticLambda1 + (i * i5), setx.setY);
            int i6 = setx.setY;
            if (i6 == 2 ? MenuHostHelper$$ExternalSyntheticLambda12 == MenuHostHelper$$ExternalSyntheticLambda1 : i6 == 4 && MenuHostHelper$$ExternalSyntheticLambda12 == MenuHostHelper$$ExternalSyntheticLambda1 + 1) {
                i4++;
            } else {
                setX MenuHostHelper$$ExternalSyntheticLambda13 = MenuHostHelper$$ExternalSyntheticLambda1(setx.setY, MenuHostHelper$$ExternalSyntheticLambda1, i4, setx.setX);
                setX(MenuHostHelper$$ExternalSyntheticLambda13, i2);
                if (!this.setIconTintList) {
                    MenuHostHelper$$ExternalSyntheticLambda13.setX = null;
                    this.setUnboundedRipple.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda13);
                }
                if (setx.setY == 4) {
                    i2 += i4;
                }
                MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda12;
                i4 = 1;
            }
        }
        Object obj = setx.setX;
        if (!this.setIconTintList) {
            setx.setX = null;
            this.setUnboundedRipple.setIconTintList(setx);
        }
        if (i4 > 0) {
            setX MenuHostHelper$$ExternalSyntheticLambda14 = MenuHostHelper$$ExternalSyntheticLambda1(setx.setY, MenuHostHelper$$ExternalSyntheticLambda1, i4, obj);
            setX(MenuHostHelper$$ExternalSyntheticLambda14, i2);
            if (this.setIconTintList) {
                return;
            }
            MenuHostHelper$$ExternalSyntheticLambda14.setX = null;
            this.setUnboundedRipple.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda14);
        }
    }

    private void setX(setX setx, int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setX(setx);
        int i2 = setx.setY;
        if (i2 == 2) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setX(i, setx.setIconTintList);
        } else if (i2 == 4) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(i, setx.setIconTintList, setx.setX);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    private int MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.setLayoutAnimation.size() - 1; size >= 0; size--) {
            setX setx = this.setLayoutAnimation.get(size);
            if (setx.setY == 8) {
                if (setx.MenuHostHelper$$ExternalSyntheticLambda1 < setx.setIconTintList) {
                    i3 = setx.MenuHostHelper$$ExternalSyntheticLambda1;
                    i4 = setx.setIconTintList;
                } else {
                    i3 = setx.setIconTintList;
                    i4 = setx.MenuHostHelper$$ExternalSyntheticLambda1;
                }
                if (i >= i3 && i <= i4) {
                    if (i3 == setx.MenuHostHelper$$ExternalSyntheticLambda1) {
                        if (i2 == 1) {
                            setx.setIconTintList++;
                        } else if (i2 == 2) {
                            setx.setIconTintList--;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            setx.MenuHostHelper$$ExternalSyntheticLambda1++;
                        } else if (i2 == 2) {
                            setx.MenuHostHelper$$ExternalSyntheticLambda1--;
                        }
                        i--;
                    }
                } else if (i < setx.MenuHostHelper$$ExternalSyntheticLambda1) {
                    if (i2 == 1) {
                        setx.MenuHostHelper$$ExternalSyntheticLambda1++;
                        setx.setIconTintList++;
                    } else if (i2 == 2) {
                        setx.MenuHostHelper$$ExternalSyntheticLambda1--;
                        setx.setIconTintList--;
                    }
                }
            } else if (setx.MenuHostHelper$$ExternalSyntheticLambda1 <= i) {
                if (setx.setY == 1) {
                    i -= setx.setIconTintList;
                } else if (setx.setY == 2) {
                    i += setx.setIconTintList;
                }
            } else if (i2 == 1) {
                setx.MenuHostHelper$$ExternalSyntheticLambda1++;
            } else if (i2 == 2) {
                setx.MenuHostHelper$$ExternalSyntheticLambda1--;
            }
        }
        for (int size2 = this.setLayoutAnimation.size() - 1; size2 >= 0; size2--) {
            setX setx2 = this.setLayoutAnimation.get(size2);
            if (setx2.setY == 8) {
                if (setx2.setIconTintList == setx2.MenuHostHelper$$ExternalSyntheticLambda1 || setx2.setIconTintList < 0) {
                    this.setLayoutAnimation.remove(size2);
                    if (!this.setIconTintList) {
                        setx2.setX = null;
                        this.setUnboundedRipple.setIconTintList(setx2);
                    }
                }
            } else if (setx2.setIconTintList <= 0) {
                this.setLayoutAnimation.remove(size2);
                if (!this.setIconTintList) {
                    setx2.setX = null;
                    this.setUnboundedRipple.setIconTintList(setx2);
                }
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        int size = this.setLayoutAnimation.size();
        for (int i2 = 0; i2 < size; i2++) {
            setX setx = this.setLayoutAnimation.get(i2);
            if (setx.setY == 8) {
                if (setY(setx.setIconTintList, i2 + 1) == i) {
                    return true;
                }
            } else if (setx.setY == 1) {
                int i3 = setx.MenuHostHelper$$ExternalSyntheticLambda1;
                int i4 = setx.setIconTintList;
                for (int i5 = setx.MenuHostHelper$$ExternalSyntheticLambda1; i5 < i3 + i4; i5++) {
                    if (setY(i5, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda0(setX setx) {
        this.setLayoutAnimation.add(setx);
        int i = setx.setY;
        if (i == 1) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setY(setx.MenuHostHelper$$ExternalSyntheticLambda1, setx.setIconTintList);
        } else if (i == 2) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(setx.MenuHostHelper$$ExternalSyntheticLambda1, setx.setIconTintList);
        } else if (i == 4) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(setx.MenuHostHelper$$ExternalSyntheticLambda1, setx.setIconTintList, setx.setX);
        } else if (i == 8) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setx.MenuHostHelper$$ExternalSyntheticLambda1, setx.setIconTintList);
        } else {
            StringBuilder sb = new StringBuilder("Unknown update op type for ");
            sb.append(setx);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int setY(int i, int i2) {
        int size = this.setLayoutAnimation.size();
        while (i2 < size) {
            setX setx = this.setLayoutAnimation.get(i2);
            if (setx.setY == 8) {
                if (setx.MenuHostHelper$$ExternalSyntheticLambda1 == i) {
                    i = setx.setIconTintList;
                } else {
                    if (setx.MenuHostHelper$$ExternalSyntheticLambda1 < i) {
                        i--;
                    }
                    if (setx.setIconTintList <= i) {
                        i++;
                    }
                }
            } else if (setx.MenuHostHelper$$ExternalSyntheticLambda1 > i) {
                continue;
            } else if (setx.setY == 2) {
                if (i < setx.MenuHostHelper$$ExternalSyntheticLambda1 + setx.setIconTintList) {
                    return -1;
                }
                i -= setx.setIconTintList;
            } else if (setx.setY == 1) {
                i += setx.setIconTintList;
            }
            i2++;
        }
        return i;
    }

    public final int setY(int i) {
        int size = this.setOnLongClickListener.size();
        for (int i2 = 0; i2 < size; i2++) {
            setX setx = this.setOnLongClickListener.get(i2);
            int i3 = setx.setY;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        if (setx.MenuHostHelper$$ExternalSyntheticLambda1 == i) {
                            i = setx.setIconTintList;
                        } else {
                            if (setx.MenuHostHelper$$ExternalSyntheticLambda1 < i) {
                                i--;
                            }
                            if (setx.setIconTintList <= i) {
                                i++;
                            }
                        }
                    }
                } else if (setx.MenuHostHelper$$ExternalSyntheticLambda1 > i) {
                    continue;
                } else if (setx.MenuHostHelper$$ExternalSyntheticLambda1 + setx.setIconTintList > i) {
                    return -1;
                } else {
                    i -= setx.setIconTintList;
                }
            } else if (setx.MenuHostHelper$$ExternalSyntheticLambda1 <= i) {
                i += setx.setIconTintList;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX {
        int MenuHostHelper$$ExternalSyntheticLambda1;
        int setIconTintList;
        Object setX;
        int setY;
        private static byte[] setLayoutAnimation = {114, -124, 55, 72, 7, 1, -7, -4, 13, -9, -3, 51, -23, -16, 13, 39, -42, 13, 1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -36, 8, 1, 17, -6};
        public static final int MenuHostHelper$$ExternalSyntheticLambda0 = 22;

        private static void a(int i, int i2, byte b, Object[] objArr) {
            int i3 = (i2 * 3) + 16;
            byte[] bArr = setLayoutAnimation;
            int i4 = i + 105;
            int i5 = (b * 15) + 4;
            byte[] bArr2 = new byte[i3];
            int i6 = -1;
            int i7 = i3 - 1;
            if (bArr == null) {
                int i8 = i5 - i4;
                int i9 = i5 + 1;
                int i10 = i8 + 2;
                objArr = objArr;
                bArr = bArr;
                bArr2 = bArr2;
                i6 = -1;
                i5 = i9;
                i4 = i10;
            }
            while (true) {
                int i11 = i6 + 1;
                bArr2[i11] = (byte) i4;
                if (i11 == i7) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                objArr = objArr;
                bArr = bArr;
                bArr2 = bArr2;
                i6 = i11;
                i5++;
                i4 = (i4 - bArr[i5]) + 2;
            }
        }

        setX(int i, int i2, int i3, Object obj) {
            this.setY = i;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i2;
            this.setIconTintList = i3;
            this.setX = obj;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr = {this};
                byte b = setLayoutAnimation[5];
                Object[] objArr2 = new Object[1];
                a(b, (byte) (b - 1), setLayoutAnimation[5], objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b2 = (byte) (setLayoutAnimation[5] - 1);
                byte b3 = b2;
                Object[] objArr3 = new Object[1];
                a(b2, b3, b3, objArr3);
                sb.append(Integer.toHexString(((Integer) cls.getMethod((String) objArr3[0], Object.class).invoke(null, objArr)).intValue()));
                sb.append("[");
                int i = this.setY;
                sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
                sb.append(",s:");
                sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
                sb.append("c:");
                sb.append(this.setIconTintList);
                sb.append(",p:");
                sb.append(this.setX);
                sb.append("]");
                return sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            setX setx = (setX) obj;
            int i = this.setY;
            if (i != setx.setY) {
                return false;
            }
            if (i == 8 && Math.abs(this.setIconTintList - this.MenuHostHelper$$ExternalSyntheticLambda1) == 1 && this.setIconTintList == setx.MenuHostHelper$$ExternalSyntheticLambda1 && this.MenuHostHelper$$ExternalSyntheticLambda1 == setx.setIconTintList) {
                return true;
            }
            if (this.setIconTintList == setx.setIconTintList && this.MenuHostHelper$$ExternalSyntheticLambda1 == setx.MenuHostHelper$$ExternalSyntheticLambda1) {
                Object obj2 = this.setX;
                if (obj2 != null) {
                    if (!obj2.equals(setx.setX)) {
                        return false;
                    }
                } else if (setx.setX != null) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((this.setY * 31) + this.MenuHostHelper$$ExternalSyntheticLambda1) * 31) + this.setIconTintList;
        }
    }

    @Override // o.setHorizontalGravity$MenuHostHelper$$ExternalSyntheticLambda1
    public final setX MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2, int i3, Object obj) {
        setX MenuHostHelper$$ExternalSyntheticLambda0 = this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            return new setX(i, i2, i3, obj);
        }
        MenuHostHelper$$ExternalSyntheticLambda0.setY = i;
        MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 = i2;
        MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList = i3;
        MenuHostHelper$$ExternalSyntheticLambda0.setX = obj;
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.setHorizontalGravity$MenuHostHelper$$ExternalSyntheticLambda1
    public final void setY(setX setx) {
        if (this.setIconTintList) {
            return;
        }
        setx.setX = null;
        this.setUnboundedRipple.setIconTintList(setx);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(List<setX> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            setX setx = list.get(i);
            if (!this.setIconTintList) {
                setx.setX = null;
                this.setUnboundedRipple.setIconTintList(setx);
            }
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        int size = this.setLayoutAnimation.size();
        for (int i = 0; i < size; i++) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(this.setLayoutAnimation.get(i));
        }
        setY(this.setLayoutAnimation);
        this.setY = 0;
        int size2 = this.setOnLongClickListener.size();
        for (int i2 = 0; i2 < size2; i2++) {
            setX setx = this.setOnLongClickListener.get(i2);
            int i3 = setx.setY;
            if (i3 == 1) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setx);
                this.MenuHostHelper$$ExternalSyntheticLambda0.setY(setx.MenuHostHelper$$ExternalSyntheticLambda1, setx.setIconTintList);
            } else if (i3 == 2) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setx);
                this.MenuHostHelper$$ExternalSyntheticLambda0.setX(setx.MenuHostHelper$$ExternalSyntheticLambda1, setx.setIconTintList);
            } else if (i3 == 4) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setx);
                this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(setx.MenuHostHelper$$ExternalSyntheticLambda1, setx.setIconTintList, setx.setX);
            } else if (i3 == 8) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setx);
                this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setx.MenuHostHelper$$ExternalSyntheticLambda1, setx.setIconTintList);
            }
        }
        setY(this.setOnLongClickListener);
        this.setY = 0;
    }
}