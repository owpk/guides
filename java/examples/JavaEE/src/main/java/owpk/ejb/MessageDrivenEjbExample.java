package owpk.ejb;

import owpk.Global;

import javax.annotation.Resource;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(mappedName = "jms/demo_queue")
public class MessageDrivenEjbExample implements MessageListener {

    @Resource
    private MessageDrivenContext messageDrivenContext;

    public void onMessage(Message message) {
            if (message instanceof TextMessage) {
                TextMessage msg = (TextMessage) message;
                Global.printLog(messageDrivenContext.getEJBHome().toString());
                try {
                    msg.getText();
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
    }

}