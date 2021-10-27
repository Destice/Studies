package com.company1;

public class silnia {

    public int silnianko(int i) {
        if (i == 1)
            return 1;
        else
            return i * silnianko(i - 1);
    }
}
