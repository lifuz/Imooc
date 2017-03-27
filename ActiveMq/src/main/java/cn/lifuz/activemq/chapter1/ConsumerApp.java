package cn.lifuz.activemq.chapter1;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jms.*;

/**
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2017/3/7 18:06
 */
public class ConsumerApp implements MessageListener {

    private static final String BROKER_URL = "tcp://121.41.64.237:61616";
    private static final String USER_NAME = "lifuz";
    private static final String PASSWORD = "Jick1201";
    private static final String SUBJECT = "test-activemq-queue";

    private static Logger logger = LoggerFactory.getLogger(ConsumerApp.class);

    public static void main(String[] args) throws JMSException {

        //初始化连接工厂
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(USER_NAME,PASSWORD,BROKER_URL);

        Connection conn = connectionFactory.createConnection();

        conn.start();

        Session session = conn.createSession(false,Session.CLIENT_ACKNOWLEDGE);
        Destination dest = session.createQueue(SUBJECT);

        //创建mq消息的消费者
        MessageConsumer consumer = session.createConsumer(dest);

        //初始化MessageListener
        ConsumerApp me = new ConsumerApp();

        //给消费者设定监听对象
        consumer.setMessageListener(me);
    }

    public void onMessage(Message message) {

        TextMessage txtMessage = (TextMessage)message;
        try {
            logger.info ("get message " + txtMessage.getText());
        } catch (JMSException e) {
            logger.error("error {}", e);
        }

    }
}
