package Review05_Threads;

public abstract class Printer extends Thread{

    private final Integer waitInMilisec;


    public Printer(Integer waitInMilisec) {
        this.waitInMilisec = waitInMilisec;
    }

    public abstract boolean isValidInputToRun(int number);

    @Override
    public void run(){
        int counter = 0;
        while(true){
            if(isValidInputToRun(counter)){
                System.out.println(currentThread().getId()+" "+currentThread().getPriority()+" "+ currentThread().getName()+" "+counter);
            }
            try {
                Thread.sleep(waitInMilisec);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter++;
        }

    }

}
