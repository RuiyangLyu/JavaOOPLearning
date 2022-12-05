package test.task01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class collectionLearning {
   public static void main(String[] args) {
      List<Integer> seqList = new ArrayList<>();
      for (int i = 0; i < 10; i++) {
         seqList.add(10 * i);
      }
      System.out.println(seqList);

      Iterator it = seqList.iterator();
      while(it.hasNext()){
         Object obj = it.next();
         System.out.print(obj+" ");
      }

   }


}
