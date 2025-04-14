class SeniorSupportHandler extends SupportHandler{
    public SeniorSupportHandler(){
        this.level=SupportHandler.HIGH;
    }
    protected void process(String issue){
        if(issue.equals("unknown_bug")){
            System.out.println("[SeniorSupport] Cannot handle: "+ issue+ " — escalate manually");
        } else{
            System.out.println("[SeniorSupport] Handled: "+ issue);
        }
    }
}
