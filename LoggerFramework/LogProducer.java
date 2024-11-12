package LoggerFramework;

import java.util.*;

public class LogProducer {
    private Map<Integer, List<LogObserver>> logObserverMap = new HashMap<>();

    public void addObserver(Integer level,LogObserver logObserver){
        List<LogObserver> logObserverList = logObserverMap.getOrDefault(level, new ArrayList<LogObserver>());
        logObserverList.add(logObserver);
        logObserverMap.put(level,logObserverList);
    }

    public void notifyAll(Integer level,String msg){
        for(Map.Entry<Integer,List<LogObserver>> logObserver: logObserverMap.entrySet()){
            if (Objects.equals(logObserver.getKey(), level)){
                logObserver.getValue().forEach(observer -> observer.log(msg));
            }
        }
    }
}
