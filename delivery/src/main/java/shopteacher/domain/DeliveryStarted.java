package shopteacher.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shopteacher.domain.*;
import shopteacher.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String customerId;
    private String productId;
    private Integer qty;
    private String address;

    public DeliveryStarted(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryStarted() {
        super();
    }
}
//>>> DDD / Domain Event
