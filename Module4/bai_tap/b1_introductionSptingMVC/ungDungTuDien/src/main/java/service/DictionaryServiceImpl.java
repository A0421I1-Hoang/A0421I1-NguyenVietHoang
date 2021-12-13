
package service;

import models.Dictionary;

import java.util.*;

public class DictionaryServiceImpl {
    private static Map<Integer, Dictionary> dictionaries = new HashMap<>();

    static {
        dictionaries.put(1, new Dictionary("hello", "xin chao"));
        dictionaries.put(2, new Dictionary("dog", "con cho"));
        dictionaries.put(3, new Dictionary("cat", "con meo"));
        dictionaries.put(4, new Dictionary("money", "tien"));
        dictionaries.put(5, new Dictionary("goodbye", "tam biet"));
        dictionaries.put(6, new Dictionary("rat", "con chuot"));
    }

    public List<Dictionary> findAll() {
        return new ArrayList<>(dictionaries.values());
    }
}