package Model;

import java.util.Objects;

public class MyArrayList {
    String item;
    int index;

    public MyArrayList(String item, int index) {
        this.item = item;
        this.index = index;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyArrayList that = (MyArrayList) o;
        return index == that.index && Objects.equals(item, that.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, index);
    }
}
