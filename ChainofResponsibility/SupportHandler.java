abstract class SupportHandler{
    public static int LOW=1;
    public static int MEDIUM=2;
    public static int HIGH=3;

    protected int level;
    protected SupportHandler nextHandler;
    public SupportHandler setNextHandler(SupportHandler nextHandler){
        this.nextHandler= nextHandler;
        return nextHandler;
    }
    public void handleRequest(int level, String issue){
        if(this.level== level){
            process(issue);
        }
        if(nextHandler !=null){
            nextHandler.handleRequest(level, issue);
        }
    }   protected abstract void process(String issue);
}
