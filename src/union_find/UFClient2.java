package union_find;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.UF;

public class UFClient2 {

    public static void main(String[] args) {
        int n = StdIn.readInt();
        int count = 0;

        UF uf = new UF(n);
        while (uf.count() != 1 && !StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            count++;
            if (uf.find(p) == uf.find(q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q); // comment out to match output requirement
        }

        if (uf.count() == 1) {
            StdOut.println(count);
        } else {
            StdOut.println("FAILED");
        }
    }
}