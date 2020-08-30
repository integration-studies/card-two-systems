package tech.claudioed.domain.service;

import java.util.concurrent.atomic.AtomicLong;
import javax.enterprise.context.ApplicationScoped;
import tech.claudioed.domain.data.TransactionResult;

@ApplicationScoped
public class TransactionDecider {

  public TransactionResult decide(){
    if(Math.random() < 0.8){
      return new TransactionResult(true,false);
    }
    return new TransactionResult(false,false);
  }

}
