package com.codecool.tinkertailor;

import java.util.ArrayList;
import java.util.List;

class TinkerTailor {

    int n, k;

    public TinkerTailor(int n, int k) {
        this.n = n;
        this.k = k;
    }

    public List execute() {
        List<Integer> results = new ArrayList<>();
        List<Integer> initialList = new ArrayList<>();


        for(int i=0; i<n; i++) {
            initialList.add(i+1);
        }
        int steps = initialList.size() -1;

        int indexStartNext = 0;



        // Works for n = 5 and k = 3
        // Well, you should come up with a more general algorithm :)
        while ( steps > 0) {
            if(initialList.size() == 2) {
                if(k % 2 == 0) {
                    if(indexStartNext == 0) {
                        results.add(initialList.get(1));
                        initialList.remove(1);
                    } else {
                        results.add(initialList.get(0));
                        initialList.remove(0);
                    }
                } else {
                    if( indexStartNext == 0 ){
                        results.add(initialList.get(0));
                        initialList.remove(0);
                    } else {
                        results.add(initialList.get(1));
                        initialList.remove(1);
                    }
                }
            } else {
                if(indexStartNext + (k-1) < initialList.size()){
                    results.add(initialList.get(indexStartNext + (k-1)));
                    initialList.remove(indexStartNext + (k-1));
                    indexStartNext = indexStartNext + (k-1);
                    if(indexStartNext >= initialList.size()) {
                        indexStartNext = 0;
                    }
                } else {
                    results.add(initialList.get((indexStartNext + (k-1)) - initialList.size()));
                    initialList.remove(indexStartNext + (k-1) - initialList.size());
                    indexStartNext = (indexStartNext + (k-1)) - (initialList.size()+1);
                    if(indexStartNext >= initialList.size()) {
                        indexStartNext = 0;
                    }
                }
            }
            steps-=1;
        }
        results.add(initialList.get(0));
        return results;
    }
}
