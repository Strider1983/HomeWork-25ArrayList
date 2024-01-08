package service;

import Model.MyArrayList;

public interface StringList {
    MyArrayList add(String item);
    MyArrayList add(int index, String item);
    MyArrayList set(int index, String item);
    MyArrayList remove(String item);
    MyArrayList remove(int index);
    MyArrayList contains(String item);
    MyArrayList ndexOf(String item);
    MyArrayList lastIndexOf(String item);
    MyArrayList get(int index);
    MyArrayList equals(StringList otherList);
    MyArrayList size();
    MyArrayList isEmpty();
    MyArrayList clear();
    MyArrayList toArray();








}
