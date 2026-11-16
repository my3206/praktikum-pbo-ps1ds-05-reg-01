package com.fembi.unguided;

import java.util.Comparator;

public class WaktuComparator implements Comparator<HasilEksperimen> {

    @Override
    public int compare(HasilEksperimen e1, HasilEksperimen e2) {
        return Integer.compare(e1.getWaktu(), e2.getWaktu());
    }
}