package shopteacher.domain;

import java.util.*;
import lombok.*;
import shopteacher.domain.*;
import shopteacher.infra.AbstractEvent;

@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String customerId;
    private String productId;
    private Integer qty;
    private String address;
}
