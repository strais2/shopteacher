package shopteacher.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shopteacher.domain.*;
import shopteacher.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String customerId;
    private String productId;
    private Integer qty;
    private String address;

    public OrderCancelled(Order aggregate) {
        super(aggregate);
    }

    public OrderCancelled() {
        super();
    }
}
//>>> DDD / Domain Event
