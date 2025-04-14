class FAQBotHandler extends SupportHandler{
    public FAQBotHandler(){
        this.level=SupportHandler.LOW;
    }
    protected void process(String issue){
        System.out.println("[FAQBot] Handled: "+issue);
    }
}
