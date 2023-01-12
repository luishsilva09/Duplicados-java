import java.util.List;
import java.util.Collection;
import java.util.ArrayList;

public class ArrayCreate {
    List<String> arr = new ArrayList<String>();
    List<String> result = new ArrayList<String>();

    public void addItem(String item){
        this.arr.add(item);
    }

    public List<String> getArr() {
        return arr;
    }

    public List hasDuplicate(List arr1){

        for(int i = 0; i < arr1.size(); i++){
           if( this.arr.contains(arr1.get(i))){
            result.add(arr1.get(i).toString());
           }
           
        }
        return result;

    }
}
