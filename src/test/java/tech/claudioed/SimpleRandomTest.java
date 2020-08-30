package tech.claudioed;

import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Test;

/**
 * @author claudioed on 29/08/20.
 * Project card-two-systems
 */

public class SimpleRandomTest {

  @Test
  public void testRandom() {
    AtomicInteger atomicInteger = new AtomicInteger();
    for (int i=0;i < 1000;i++){
      if(Math.random() < 0.8){
        atomicInteger.addAndGet(1);
        System.out.println("you got lucky");
      }
    }
    System.out.println(atomicInteger.get());
  }

}
