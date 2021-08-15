package models;

import java.io.Serializable;

/**
 * @author Rentaian
 */
public class Order implements Serializable {

    private String id;
    private int pid;
    private int userid;

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", pid=" + pid +
                ", userid=" + userid +
                '}';
    }

    public Order(String id, int pid, int userid) {
        this.id = id;
        this.pid = pid;
        this.userid = userid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
