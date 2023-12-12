public class Accepter implements Runnable
{
    private int c = 0;
    private Entry<String,String> entry;
    public Accepter(Entry<String,String> e) {
        entry = e;
    }
    public void run()
    {
        try {
            while(true)
            {
                String request = entry.accept();
                System.out.println("Accepter request"+": "+request);
                String result = request+(++c);
                System.out.println("Accepter result"+": "+result);
                entry.reply(result);
            }
        } catch (InterruptedException e){}
    }
}
