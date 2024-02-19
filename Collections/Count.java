package LLD1.Collections;

import java.util.Objects;

public class Count {
    public int val;

    public Count(int val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Count)) return false;
        Count count = (Count) o;
        return val == count.val;
    }

}
