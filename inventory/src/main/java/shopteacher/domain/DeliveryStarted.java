package shopteacher.domain;

import java.util.*;
import lombok.*;
import shopteacher.domain.*;
import shopteacher.infra.AbstractEvent;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String customerId;
    private String productId;
    private Integer qty;
    private String address;
}
