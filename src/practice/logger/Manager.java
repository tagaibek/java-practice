package practice.logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Manager
{
    private static final Logger logger = LoggerFactory.getLogger(Manager.class);

    public static void main(String[] args) throws InterruptedException {
        Manager manager = new Manager();
        Task task = new Task(1234);

        logger.info("Starting a new thread.");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.processTask(task);
            }
        },
        "adyl-1");


        t1.start();

        Thread.sleep(1000);
        logger.warn("adyl-1 is sleeping");

        t1.join();
    }
    public boolean processTask(Task task)
    {
        logger.debug("processTask id="+task.getId());
        try
        {
            task.start();
            task.progress();
            task.complete();
            return true;
        }
        catch(Exception e)
        {
            logger.error("Unknown error", e);
            return false;
        }
    }

    private static class Task{
        private int id;

        public Task(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void start(){
            logger.info("starting");
        }

        private void progress() throws InterruptedException {
            logger.info("in progress");
            Thread.sleep(2000);

            for (int i = 0; i<100;i++){
                logger.info("in progress!"+i);
            }

            Object obj = null;
            obj.toString();
        }

        private void complete(){
            logger.info("completed");
        }
    }
}
