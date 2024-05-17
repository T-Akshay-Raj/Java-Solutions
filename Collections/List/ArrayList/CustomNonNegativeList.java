package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
//Custom ArrayList to store only non-negative integers
public class CustomNonNegativeList extends ArrayList {
  public CustomNonNegativeList(Integer ... numbers) {
    super(Arrays.stream(numbers).filter(x->x>=0).collect(Collectors.toList()));
  }


  public boolean add(Integer i) {
    if(i>=0) return super.add(i);
    else return false;
  }

  public void add(Integer i, int index) {
    if(i>=0)  super.add(index,i);
  }

//  public boolean addAll(Collection<Integer> c){
//  return super.addAll(c.stream().filter(x->x>=0).collect(Collectors.toList()));
//  }
}
