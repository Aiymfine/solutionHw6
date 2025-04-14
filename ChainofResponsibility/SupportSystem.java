import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SupportSystem{
    public static void main(String[] args){
        SupportHandler faq=new FAQBotHandler();
        SupportHandler junior=new JuniorSupportHandler();
        SupportHandler senior=new SeniorSupportHandler();
        faq.setNextHandler(junior).setNextHandler(senior);

       List<String> issues= new ArrayList<>();
        issues.add("password_reset");
        issues.add("refund_request");
        issues.add("account_ban");
        issues.add("unknown_bug");

        for(String issue :issues) {
            handleIssue(faq, issue);
        }}
        private static void handleIssue(SupportHandler handler, String issue){
        if(issue.equals("password_reset")){
            handler.handleRequest(SupportHandler.LOW, issue);
        } else if (issue.equals("refund_request") || issue.equals("billing_issue")){
            handler.handleRequest(SupportHandler.MEDIUM, issue);
        } else if(issue.equals("account_ban") || issue.equals("data_loss") || issue.equals("unknown_bug")){
            handler.handleRequest(SupportHandler.HIGH, issue);
        } else{
            System.out.println("[System] Unknown issue: " + issue);
        }
    }
}
