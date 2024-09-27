import java.util.*;

class PhanSo {
    private long TuSo, MauSo;

    public PhanSo(long TuSo, long MauSo) {
        this.TuSo = TuSo;
        this.MauSo = MauSo;
    }

    public long getTuSo() {
        return TuSo;
    }

    public void setTuSo(long TuSo) {
        this.TuSo = TuSo;
    }

    public long getMauSo() {
        return MauSo;
    }

    public void setMauSo(long MauSo) {
        this.MauSo = MauSo;
    }

    public long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public void rutGonPhanSo() {
        long GCD = gcd(this.TuSo, this.MauSo);
        this.TuSo /= GCD;
        this.MauSo /= GCD;
    }

    public void add(PhanSo A) {
        long LCM = this.MauSo * A.MauSo / gcd(this.MauSo, A.MauSo);
        this.TuSo *= LCM / this.MauSo;
        A.TuSo *= LCM / A.MauSo;
        this.MauSo = LCM;
        this.TuSo += A.TuSo;
        this.rutGonPhanSo();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        
        PhanSo A = new PhanSo(a, b);
        a = scanner.nextLong();
        b = scanner.nextLong();
        
        PhanSo B = new PhanSo(a, b);
        A.add(B);
        
        System.out.print(A.getTuSo() + "/" +A.getMauSo());
        
        scanner.close();
    }
}
