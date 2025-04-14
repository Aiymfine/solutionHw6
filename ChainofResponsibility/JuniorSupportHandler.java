class JuniorSupportHandler extends SupportHandler{
    public JuniorSupportHandler(){
        this.level=SupportHandler.MEDIUM;
    }
    protected void process(String issue) {
        System.out.println("[JuniorSupport] Handled: "+ issue);
    }
}
