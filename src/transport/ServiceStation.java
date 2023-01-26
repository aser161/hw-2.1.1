package transport;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class ServiceStation {
    private String stationName;
    private Queue <Transport> transportQueue;

    public ServiceStation(String stationName) {
        this.stationName = stationName;
        this.transportQueue = new LinkedList<>();
    }

    public void addAuto(Transport transport){
        if (transport.getClass()==Bus.class){
            System.out.println("Автобус не нуждается в ТО");
        }else {
            this.transportQueue.offer(transport);
            System.out.println("ТС "+ transport.getBrand() + " " + transport.getModel() + " стало в очередь на ТО");
        }
    }

    public void carryTO(){
        try {
            System.out.println("ТС "+ this.transportQueue.element().getBrand() + " " + this.transportQueue.element().getModel() + " прошло ТО");
            this.transportQueue.poll();
        }catch (NoSuchElementException e){
            System.out.println("Очередь пуста");
        }
    }
}
