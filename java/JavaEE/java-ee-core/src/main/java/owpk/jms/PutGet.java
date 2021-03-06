package owpk.jms;
import com.ibm.msg.client.jms.JmsConnectionFactory;
import com.ibm.msg.client.jms.JmsFactoryFactory;
import com.ibm.msg.client.wmq.WMQConstants;

import javax.enterprise.context.Dependent;
import javax.jms.*;

@Dependent
public class PutGet {
    private int status = 1;
    private static final String HOST = "localhost";
    private static final int PORT = 1414;
    private static final String CHANNEL = "OWPK";
    private static final String QMGR = "DEMO_MANAGER";
    private static final String APP_USER = "mq";
    private static final String APP_PASSWORD = "1422";
    private static final String QUEUE_NAME = "DEMO_QUEUE"; // Queue that the application uses to put and get messages to and from

    public void sendMsg() {
        JMSContext context;
        Destination destination;
        JMSProducer producer;
        try {
            JmsFactoryFactory ff = JmsFactoryFactory.getInstance(WMQConstants.WMQ_PROVIDER);
            JmsConnectionFactory cf = ff.createConnectionFactory();
            cf.setStringProperty(WMQConstants.WMQ_HOST_NAME, HOST);
            cf.setIntProperty(WMQConstants.WMQ_PORT, PORT);
            cf.setStringProperty(WMQConstants.WMQ_CHANNEL, CHANNEL);
            cf.setIntProperty(WMQConstants.WMQ_CONNECTION_MODE, WMQConstants.WMQ_CM_CLIENT);
            cf.setStringProperty(WMQConstants.WMQ_QUEUE_MANAGER, QMGR);
//            cf.setStringProperty(WMQConstants.WMQ_APPLICATIONNAME, "JmsPutGet (JMS)");
//            cf.setBooleanProperty(WMQConstants.USER_AUTHENTICATION_MQCSP, true);
            cf.setStringProperty(WMQConstants.USERID, APP_USER);
//            cf.setStringProperty(WMQConstants.PASSWORD, APP_PASSWORD);

            // Create JMS objects
            context = cf.createContext();
            destination = context.createQueue("queue:///" + QUEUE_NAME);

            long uniqueNumber = System.currentTimeMillis() % 1000;
            TextMessage message = context.createTextMessage("Your lucky number today is " + uniqueNumber);

            producer = context.createProducer();
            producer.send(destination, message);
            System.out.println("Sent message:\n" + message);

            context.close();

            recordSuccess();
        } catch (JMSException jmsex) {
            recordFailure(jmsex);
        }
        System.exit(status);


//        JmsFactoryFactory ff = JmsFactoryFactory.getInstance(WMQConstants.WMQ_PROVIDER);
//        JmsConnectionFactory cf = ff.createConnectionFactory();
//        cf.setStringProperty(WMQConstants.WMQ_HOST_NAME, "VDC01-DEKSDAP02.dc-develop.tn.corp");
//        cf.setIntProperty(WMQConstants.WMQ_PORT, 1414);
//        cf.setStringProperty(WMQConstants.WMQ_CHANNEL, "SAPPI.SVRCONN");
//        cf.setIntProperty(WMQConstants.WMQ_CONNECTION_MODE, WMQConstants.WMQ_CM_CLIENT);
//        cf.setStringProperty(WMQConstants.WMQ_QUEUE_MANAGER, "DE.AK.TNT");
//        cf.setStringProperty(WMQConstants.USERID, "jxdadm");
//
//        Connection connection = cf.createConnection();
//        connection.start();
//
//        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//        Queue queue = session.createQueue("queue:///TEST");
//
//        QueueBrowser browser = session.createBrowser(queue);
//        Enumeration enumeration = browser.getEnumeration();
//        int count = 0;
//        while (enumeration.hasMoreElements()) {
//            count++;
//            enumeration.nextElement();
//        }
//        System.out.println(count);

    }

    private void recordSuccess() {
        System.out.println("SUCCESS");
        status = 0;
    }

    private void recordFailure(Exception ex) {
        if (ex != null) {
            if (ex instanceof JMSException)
                processJMSException((JMSException) ex);
            else
                System.out.println(ex);
        }
        System.out.println("FAILURE");
        status = -1;
    }

    private void processJMSException(JMSException jmsEx) {
        System.out.println(jmsEx);
        Throwable innerException = jmsEx.getLinkedException();
        if (innerException != null)
            System.out.println("Inner exception(s):");
        while (innerException != null) {
            System.out.println(innerException);
            innerException = innerException.getCause();
        }
    }
}