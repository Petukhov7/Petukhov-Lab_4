import java.util.List;

public class MixBox<T extends Fruit> extends Box<T>{
    public MixBox() {
    }

    public MixBox(T... fruits) {
        super(fruits);
    }

    public MixBox(List<T> list) {
        super(list);
    }

    void add(T fruit) {
        super.add(fruit);
    }


    public void MoveFrom(AppleBox box) {
        for(Object s : box.list)
        {
            this.list.add((T) s);
        }
        box.list.clear();
    }
}
