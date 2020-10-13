
package mall.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

//@FeignClient(name="delivery", url="http://localhost:8082")
@FeignClient(name="delivery", url="${api.delivery.url}")
public interface CancellationService {

    @RequestMapping(method= RequestMethod.POST, path="/cancellations")
    public void cancel(@RequestBody Cancellation cancellation);
//동기호출이 반드시 필요한경우 여기에 코딩..
//    @RequestMapping(method= RequestMethod.POST, path="/cancellations")
  //  public void cancel2(@RequestBody Cancellation cancellation);

}