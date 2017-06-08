/**
 * Created by doctorq on 2017/6/8.
 */
public class SyncMethod {
    public int i;

    public void syncTask(){
        //同步代码库
        synchronized (this){
            i++;
        }
    }
}
