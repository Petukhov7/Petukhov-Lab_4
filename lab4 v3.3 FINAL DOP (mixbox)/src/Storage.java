/**
 * Created by class on 08.09.2022.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Storage <T extends Fruit>{


    public List<T> getList() {
        return list;
    }

    public List<T> list;

//    public Storage obj){
//        list = Arrays.asList(obj);
//    }

    public Storage(){
        list = new ArrayList();
    }



    void add(T obj){
        list.add(obj);
    }

//    void moveAt(Box<T> box){
//        if (list.contains(1)) {
//            box.getList().addAll(list);
//            list.clear();
//        }
//        else {
//            System.out.println("Так пересыпать нельзя");
//        }
//    }

    void info(){
        if (list.isEmpty()){
            System.out.println("Коробка пустая");
        }
        else {
            System.out.println("В коробке находится " + list.toString() + " в количестве " + list.size());
        }
    }

    float getWeight(){
        if (list.isEmpty()){
            return 0;
        }
        else {
            return list.size() * list.get(0).getWeight();
        }
    }

    boolean compare(Storage<? extends Fruit> box){
        return Math.abs(this.getWeight() - box.getWeight()) < 0.001;
    }
}