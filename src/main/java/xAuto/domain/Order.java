package xAuto.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ORDERS")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderId;

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    private List<Adressess> orderAddresses;

    private long orderTimeStart;
    private long orderTimeOver;

    private boolean orderIsOpen;

    @ManyToOne
    private Car orderCar;

    @ManyToOne
    private Client orderClient;

    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<Adressess> getOrderAddresses() {
        return orderAddresses;
    }

    public void setOrderAddresses(List<Adressess> orderAddresses) {
        this.orderAddresses = orderAddresses;
    }

    public long getOrderTimeStart() {
        return orderTimeStart;
    }

    public void setOrderTimeStart(long orderTimeStart) {
        this.orderTimeStart = orderTimeStart;
    }

    public long getOrderTimeOver() {
        return orderTimeOver;
    }

    public void setOrderTimeOver(long orderTimeOver) {
        this.orderTimeOver = orderTimeOver;
    }

    public boolean isOrderIsOpen() {
        return orderIsOpen;
    }

    public void setOrderIsOpen(boolean orderIsOpen) {
        this.orderIsOpen = orderIsOpen;
    }

    public Car getOrderCar() {
        return orderCar;
    }

    public void setOrderCar(Car orderCar) {
        this.orderCar = orderCar;
    }

    public Client getOrderClient() {
        return orderClient;
    }

    public void setOrderClient(Client orderClient) {
        this.orderClient = orderClient;
    }
}
