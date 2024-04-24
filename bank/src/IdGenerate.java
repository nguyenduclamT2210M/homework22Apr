import java.util.concurrent.locks.ReentrantLock;

public class IdGenerate {
    private static long id = 0L;
    public static ReentrantLock lock = new ReentrantLock();
    public static Long getNewID(){
        Long result ;
        lock.lock();
        try{
            result = ++id;
        }finally {
            lock.unlock();
        }
        return result;
    }
    private IdGenerate(){}
}
