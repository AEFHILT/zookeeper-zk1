package service;

/**
 * @author Rentaian
 */
public interface OrderService {

    void reduceStock(int id) throws InterruptedException;
}
