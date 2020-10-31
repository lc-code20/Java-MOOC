
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class HashMap<K,V> {
    
    private List<List<Pair<K,V>>> values;
    //private ArrayList<ArrayList<Pair<K,V>>> outerList;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new ArrayList<>();
        this.firstFreeIndex = 0;
    }
    
    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.size());
        if (this.values.get(hashValue) == null) {
            return null;
        }

        //ArrayList<Pair<K, V>> valuesAtIndex = this.values.get(hashValue);
        
        List<Pair<K, V>> valuesAtIndex = (List<Pair<K, V>>) this.values.get(hashValue);

        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.get(i).getKey().equals(key)) {
                return valuesAtIndex.get(i).getValue();
            }
        }

        return null;
    }
    
    private List<Pair<K, V>> getListBasedOnKey(K key) {
        //System.out.println("values size = " + values.size());
        int hashValue = Math.abs(key.hashCode() % values.size());
        //System.out.println("values size = " + values.size());
        if (values.get(hashValue) == null) {
            List<Pair<K,V>> helper = new ArrayList<>();
            //helper.clear();
            //values.set(hashValue, new List<>());
            values.set(hashValue, helper);
            //values.set(hashValue, new ArrayList<>());
            
        }

        return (List<Pair<K, V>>) values.get(hashValue);
    }

    public int getIndexOfKey(List<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getKey().equals(key)) {
                return i;
            }
        }

        return -1;
    }
    
    public void add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }
    }
    
    
    public V remove(K key) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex.size() == 0) {
            return null;
        }

        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            return null;
        }

        Pair<K, V> pair = valuesAtIndex.get(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }
    
}
