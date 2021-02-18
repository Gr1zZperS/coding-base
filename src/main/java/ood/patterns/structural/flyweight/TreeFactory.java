package ood.patterns.structural.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    static Map<String, TreeType> treesTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = treesTypes.get(name);
        if(result == null) {
            result = new TreeType(name, color, otherTreeData);
            treesTypes.put(name, result);
        }
        return result;
    }

}
