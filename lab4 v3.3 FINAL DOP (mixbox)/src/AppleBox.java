
import java.util.List;

public class AppleBox<T extends Apple> extends Box<T>{

    public AppleBox() {
    }

    public AppleBox(T... fruits) {
        super(fruits);
    }

    public AppleBox(List<T> list) {
        super(list);
    }

    public void MoveFrom(AppleBox box) {
        for(Object s : box.list)
        {
            this.list.add((T) s);
        }
    }
}